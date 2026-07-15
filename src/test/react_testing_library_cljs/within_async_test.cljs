(ns react-testing-library-cljs.within-async-test
  (:require
   ["@testing-library/react" :as rtl]
   ["react" :as react]
   [cljs.test :refer [is]]
   [promesa.core :as p]
   [react-testing-library-cljs.async :refer-macros [deftest-async]]
   [react-testing-library-cljs.screen :as screen]
   [react-testing-library-cljs.within :as within]))

(defn- render-el [element]
  (rtl/render element))

(deftest-async find-by-text-test
  (rtl/cleanup)
  (render-el (react/createElement "div" #js {:role "region"}
                                  (react/createElement "span" nil "Scoped Hello")))
  (let [region (screen/get-by-role "region")]
    (p/let [el (within/find-by-text region "Scoped Hello")]
      (is (some? el))
      (is (= "Scoped Hello" (.-textContent el))))))

(deftest-async find-all-by-text-test
  (rtl/cleanup)
  (render-el (react/createElement "div" nil
                                  (react/createElement "div" #js {:role "region"}
                                                       (react/createElement "span" nil "Item")
                                                       (react/createElement "span" nil "Item"))
                                  (react/createElement "span" nil "Item")))
  (let [region (screen/get-by-role "region")]
    (p/let [els (within/find-all-by-text region "Item")]
      (is (vector? els))
      (is (= 2 (count els)))
      (is (= "Item" (.-textContent (first els)))))))
