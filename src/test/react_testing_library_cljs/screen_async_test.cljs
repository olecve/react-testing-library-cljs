(ns react-testing-library-cljs.screen-async-test
  (:require
   ["@testing-library/react" :as rtl]
   ["react" :as react]
   [cljs.test :refer [is]]
   [promesa.core :as p]
   [react-testing-library-cljs.async :refer-macros [deftest-async]]
   [react-testing-library-cljs.screen :as screen]))

(defn- render-el [element]
  (rtl/render element))

(deftest-async find-by-text-test
  (rtl/cleanup)
  (render-el (react/createElement "div" nil "Async Hello"))
  (p/let [el (screen/find-by-text "Async Hello")]
    (is (some? el))
    (is (= "Async Hello" (.-textContent el)))))

(deftest-async find-all-by-text-test
  (rtl/cleanup)
  (render-el (react/createElement "div" nil
                                  (react/createElement "span" nil "Item")
                                  (react/createElement "span" nil "Item")))
  (p/let [els (screen/find-all-by-text "Item")]
    (is (vector? els))
    (is (= 2 (count els)))
    (is (= "Item" (.-textContent (first els))))))
