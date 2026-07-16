(ns react-testing-library-cljs.within-async-test
  "Exercises `within`'s async queries with native async (`^:async` / `await`).
  Requires shadow-cljs 3.4+ (ClojureScript 1.12.145+)."
  (:require
   ["react" :as react]
   [cljs.test :refer [deftest is]]
   [react-testing-library-cljs.render :as rtl]
   [react-testing-library-cljs.screen :as screen]
   [react-testing-library-cljs.within :as within]))

(defn- render-el [element]
  (rtl/render element))

(deftest ^:async find-by-text-native-test
  (rtl/cleanup)
  (render-el (react/createElement "div" #js {:role "region"}
                                  (react/createElement "span" nil "Scoped Native")))
  (let [region (screen/get-by-role "region")
        el (await (within/find-by-text region "Scoped Native"))]
    (is (some? el))
    (is (= "Scoped Native" (.-textContent el)))))

(deftest ^:async find-all-by-text-native-test
  (rtl/cleanup)
  (render-el (react/createElement "div" nil
                                  (react/createElement "div" #js {:role "region"}
                                                       (react/createElement "span" nil "Row")
                                                       (react/createElement "span" nil "Row"))
                                  (react/createElement "span" nil "Row")))
  (let [region (screen/get-by-role "region")
        els (await (within/find-all-by-text region "Row"))]
    (is (vector? els))
    (is (= 2 (count els)))))
