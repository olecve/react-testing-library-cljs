(ns react-testing-library-cljs.screen-async-test
  "Exercises `screen`'s async queries with native async (`^:async` / `await`).
  Requires shadow-cljs 3.4+ (ClojureScript 1.12.145+)."
  (:require
   ["react" :as react]
   [cljs.test :refer [deftest is]]
   [react-testing-library-cljs.render :as rtl]
   [react-testing-library-cljs.screen :as screen]))

(defn- render-el [element]
  (rtl/render element))

(deftest ^:async find-by-text-test
  (rtl/cleanup)
  (render-el (react/createElement "div" nil "Async Hello"))
  (let [el (await (screen/find-by-text "Async Hello"))]
    (is (some? el))
    (is (= "Async Hello" (.-textContent el)))))

(deftest ^:async find-all-by-text-test
  (rtl/cleanup)
  (render-el (react/createElement "div" nil
                                  (react/createElement "span" nil "Item")
                                  (react/createElement "span" nil "Item")))
  (let [els (await (screen/find-all-by-text "Item"))]
    (is (vector? els))
    (is (= 2 (count els)))
    (is (= "Item" (.-textContent (first els))))))
