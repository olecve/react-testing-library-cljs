(ns react-testing-library-cljs.user-event-promesa-test
  (:require
   [cljs.test :refer [is]]
   ["@testing-library/react" :as rtl]
   ["react" :as react]
   [promesa.core :as p]
   [react-testing-library-cljs.async :refer-macros [deftest-async]]
   [react-testing-library-cljs.screen :as screen]
   [react-testing-library-cljs.user-event :as user-event]))

(defn- render-el [element]
  (rtl/render element))

(deftest-async click-test
  (rtl/cleanup)
  (let [clicks (atom 0)]
    (render-el (react/createElement "button"
                 #js {:onClick #(swap! clicks inc)}
                 "Click me"))
    (let [user (user-event/setup)]
      (p/let [_ (user-event/click user (screen/get-by-role "button"))]
        (is (= 1 @clicks))))))

(deftest-async type-test
  (rtl/cleanup)
  (render-el (react/createElement "input"
               #js {:placeholder "type here"
                    :defaultValue ""}))
  (let [user (user-event/setup)
        input (screen/get-by-placeholder-text "type here")]
    (p/let [_ (user-event/type user input "hello")]
      (is (= "hello" (.-value input))))))

(deftest-async clear-test
  (rtl/cleanup)
  (render-el (react/createElement "input"
               #js {:placeholder "to clear"
                    :defaultValue "existing text"}))
  (let [user (user-event/setup)
        input (screen/get-by-placeholder-text "to clear")]
    (p/let [_ (user-event/clear user input)]
      (is (= "" (.-value input))))))

(deftest-async tab-test
  (rtl/cleanup)
  (render-el (react/createElement "div" nil
               (react/createElement "input" #js {:placeholder "first"})
               (react/createElement "input" #js {:placeholder "second"})))
  (let [user (user-event/setup)
        first-input (screen/get-by-placeholder-text "first")
        second-input (screen/get-by-placeholder-text "second")]
    (.focus first-input)
    (p/let [_ (user-event/tab user)]
      (is (= second-input (.-activeElement js/document))))))

(deftest-async keyboard-test
  (rtl/cleanup)
  (let [submitted (atom false)]
    (render-el (react/createElement "form"
                 #js {:onSubmit (fn [e]
                                  (.preventDefault e)
                                  (reset! submitted true))}
                 (react/createElement "input" #js {:placeholder "press enter"})))
    (let [user (user-event/setup)]
      (.focus (screen/get-by-placeholder-text "press enter"))
      (p/let [_ (user-event/keyboard user "{Enter}")]
        (is (true? @submitted))))))

(deftest-async select-options-test
  (rtl/cleanup)
  (render-el (react/createElement "select"
               #js {:defaultValue ""}
               (react/createElement "option" #js {:value "a"} "Option A")
               (react/createElement "option" #js {:value "b"} "Option B")))
  (let [user (user-event/setup)
        select (screen/get-by-role "combobox")]
    (p/let [_ (user-event/select-options user select "Option A")]
      (is (= "a" (.-value select))))))
