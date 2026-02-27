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
    (p/do
      (user-event/click (user-event/setup) (screen/get-by-role "button"))
      (is (= 1 @clicks)))))

(deftest-async type-test
  (rtl/cleanup)
  (render-el (react/createElement "input"
               #js {:placeholder "type here"
                    :defaultValue ""}))
  (user-event/type (user-event/setup) (screen/get-by-placeholder-text "type here") "hello")
  (is (= "hello" (.-value (screen/get-by-placeholder-text "type here")))))

(deftest-async clear-test
  (rtl/cleanup)
  (render-el (react/createElement "input"
               #js {:placeholder "to clear"
                    :defaultValue "existing text"}))
  (user-event/clear (user-event/setup) (screen/get-by-placeholder-text "to clear"))
  (is (= "" (.-value (screen/get-by-placeholder-text "to clear")))))

(deftest-async tab-test
  (rtl/cleanup)
  (render-el (react/createElement "div" nil
               (react/createElement "input" #js {:placeholder "first"})
               (react/createElement "input" #js {:placeholder "second"})))
  (.focus (screen/get-by-placeholder-text "first"))
  (user-event/tab (user-event/setup))
  (is (= (screen/get-by-placeholder-text "second") (.-activeElement js/document))))

(deftest-async keyboard-test
  (rtl/cleanup)
  (let [submitted (atom false)]
    (render-el (react/createElement "form"
                 #js {:onSubmit (fn [e]
                                  (.preventDefault e)
                                  (reset! submitted true))}
                 (react/createElement "input" #js {:placeholder "press enter"})))
    (.focus (screen/get-by-placeholder-text "press enter"))
    (p/do
      (user-event/keyboard (user-event/setup) "{Enter}")
      (is (true? @submitted)))))

(deftest-async select-options-test
  (rtl/cleanup)
  (render-el (react/createElement "select"
               #js {:defaultValue ""}
               (react/createElement "option" #js {:value "a"} "Option A")
               (react/createElement "option" #js {:value "b"} "Option B")))
  (user-event/select-options (user-event/setup) (screen/get-by-role "combobox") "Option A")
  (is (= "a" (.-value (screen/get-by-role "combobox")))))
