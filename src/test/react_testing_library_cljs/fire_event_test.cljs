(ns react-testing-library-cljs.fire-event-test
  (:require
   ["react" :as react]
   [cljs.test :refer [deftest is]]
   [react-testing-library-cljs.fire-event :as fire-event]
   [react-testing-library-cljs.render :as rtl]
   [react-testing-library-cljs.screen :as screen]))

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
  (rtl/cleanup)
  (rtl/render (react/createElement counter-component))
  (let [btn (screen/get-by-text "Increment")]
    (fire-event/click btn)
    (is (= "1" (.-textContent (screen/get-by-test-id "count")))
        "click fires and updates state")))

(deftest change-test
  (rtl/cleanup)
  (rtl/render (react/createElement "input" #js {:placeholder "type here"
                                                :defaultValue ""}))
  (let [input-el (screen/get-by-placeholder-text "type here")]
    (fire-event/change input-el {:target {:value "new value"}})
    (is (= "new value" (.-value input-el))
        "change updates input value")))

(deftest key-down-returns-default-prevented-boolean
  (rtl/cleanup)
  (rtl/render (react/createElement "input" #js {:placeholder "plain"}))
  (is (true? (fire-event/key-down (screen/get-by-placeholder-text "plain")))
      "returns true when nothing calls preventDefault (single arity)")

  (rtl/cleanup)
  (rtl/render (react/createElement "input" #js {:placeholder "plain"}))
  (is (true? (fire-event/key-down (screen/get-by-placeholder-text "plain") {:key " "}))
      "returns true when nothing calls preventDefault (options arity)")

  (rtl/cleanup)
  (rtl/render (react/createElement "input" #js {:placeholder "prevents"
                                                :onKeyDown (fn [e] (.preventDefault e))}))
  (is (false? (fire-event/key-down (screen/get-by-placeholder-text "prevents")))
      "returns false when a handler calls preventDefault (single arity)")

  (rtl/cleanup)
  (rtl/render (react/createElement "input" #js {:placeholder "prevents"
                                                :onKeyDown (fn [e] (.preventDefault e))}))
  (is (false? (fire-event/key-down (screen/get-by-placeholder-text "prevents") {:key " "}))
      "returns false when a handler calls preventDefault (options arity)"))
