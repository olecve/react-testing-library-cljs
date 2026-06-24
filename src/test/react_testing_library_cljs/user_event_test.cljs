(ns react-testing-library-cljs.user-event-test
  (:require
   ["@testing-library/react" :as rtl]
   ["react" :as react]
   [cljs.test :refer [deftest is async]]
   [react-testing-library-cljs.screen :as screen]
   [react-testing-library-cljs.user-event :as user-event]))

(defn- render-el [element]
  (rtl/render element))

(deftest click-test
  (async done
    (rtl/cleanup)
    (let [clicks (atom 0)]
      (render-el (react/createElement "button"
                                      #js {:onClick #(swap! clicks inc)}
                                      "Click me"))
      (let [user (user-event/setup)]
        (-> (user-event/click user (screen/get-by-role "button"))
            (.then (fn []
                     (is (= 1 @clicks))
                     (done))))))))

(deftest type-test
  (async done
    (rtl/cleanup)
    (render-el (react/createElement "input"
                                    #js {:placeholder "type here"
                                         :defaultValue ""}))
    (let [user (user-event/setup)
          input (screen/get-by-placeholder-text "type here")]
      (-> (user-event/type user input "hello")
          (.then (fn []
                   (is (= "hello" (.-value input)))
                   (done)))))))

(deftest clear-test
  (async done
    (rtl/cleanup)
    (render-el (react/createElement "input"
                                    #js {:placeholder "to clear"
                                         :defaultValue "existing text"}))
    (let [user (user-event/setup)
          input (screen/get-by-placeholder-text "to clear")]
      (-> (user-event/clear user input)
          (.then (fn []
                   (is (= "" (.-value input)))
                   (done)))))))

(deftest tab-test
  (async done
    (rtl/cleanup)
    (render-el (react/createElement "div" nil
                                    (react/createElement "input" #js {:placeholder "first"})
                                    (react/createElement "input" #js {:placeholder "second"})))
    (let [user (user-event/setup)
          first-input (screen/get-by-placeholder-text "first")
          second-input (screen/get-by-placeholder-text "second")]
      (.focus first-input)
      (-> (user-event/tab user)
          (.then (fn []
                   (is (= second-input (.-activeElement js/document)))
                   (done)))))))

(deftest keyboard-test
  (async done
    (rtl/cleanup)
    (let [submitted (atom false)]
      (render-el (react/createElement "form"
                                      #js {:onSubmit (fn [e]
                                                       (.preventDefault e)
                                                       (reset! submitted true))}
                                      (react/createElement "input" #js {:placeholder "press enter"})))
      (let [user (user-event/setup)]
        (.focus (screen/get-by-placeholder-text "press enter"))
        (-> (user-event/keyboard user "{Enter}")
            (.then (fn []
                     (is (true? @submitted))
                     (done))))))))

(deftest select-options-test
  (async done
    (rtl/cleanup)
    (render-el (react/createElement "select"
                                    #js {:defaultValue ""}
                                    (react/createElement "option" #js {:value "a"} "Option A")
                                    (react/createElement "option" #js {:value "b"} "Option B")))
    (let [user (user-event/setup)
          select (screen/get-by-role "combobox")]
      (-> (user-event/select-options user select "Option A")
          (.then (fn []
                   (is (= "a" (.-value select)))
                   (done)))))))
