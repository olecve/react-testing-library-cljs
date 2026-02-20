(ns react-testing-library-cljs.fire-event-test
  (:require
   [cljs.test :refer [deftest is testing]]
   ["@testing-library/react" :as rtl]
   ["react" :as react]
   [react-testing-library-cljs.screen :as screen]
   [react-testing-library-cljs.fire-event :as fire-event]))

(defn- counter-component []
  (let [state (react/useState 0)
        count (aget state 0)
        set-count (aget state 1)]
    (react/createElement "div" nil
      (react/createElement "span" #js {:data-testid "count"} (str count))
      (react/createElement "button"
        #js {:onClick (fn [] (set-count (inc count)))}
        "Increment"))))

(deftest click-test
  (testing "click fires and updates state"
    (rtl/cleanup)
    (rtl/render (react/createElement counter-component))
    (let [btn (screen/get-by-text "Increment")]
      (fire-event/click btn)
      (is (= "1" (.-textContent (screen/get-by-test-id "count")))))))

(deftest change-test
  (testing "change updates input value"
    (rtl/cleanup)
    (rtl/render (react/createElement "input" #js {:placeholder "type here"
                                                  :defaultValue ""}))
    (let [input-el (screen/get-by-placeholder-text "type here")]
      (fire-event/change input-el {:target {:value "new value"}})
      (is (= "new value" (.-value input-el))))))

(deftest key-down-test
  (testing "key-down fires without error"
    (rtl/cleanup)
    (rtl/render (react/createElement "input" #js {:placeholder "keys"}))
    (let [input-el (screen/get-by-placeholder-text "keys")]
      (is (true? (fire-event/key-down input-el {:key "Enter"}))))))
