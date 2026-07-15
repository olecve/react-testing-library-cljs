(ns react-testing-library-cljs.native-async-test
  "Proves the toolchain runs ClojureScript native async tests: `^:async`
  deftests whose body uses `await` to unwrap the library's Promise-returning
  queries. Requires shadow-cljs >= 3.4.x (ClojureScript >= 1.12.145)."
  (:require
   ["@testing-library/react" :as rtl]
   ["react" :as react]
   [cljs.test :refer [deftest is]]
   [react-testing-library-cljs.screen :as screen]))

(defn- render-el [element]
  (rtl/render element))

(deftest ^:async find-by-text-native-test
  (rtl/cleanup)
  (render-el (react/createElement "div" nil "Native Hello"))
  (let [el (await (screen/find-by-text "Native Hello"))]
    (is (some? el))
    (is (= "Native Hello" (.-textContent el)))))

(deftest ^:async find-all-by-text-native-test
  (rtl/cleanup)
  (render-el (react/createElement "div" nil
                                  (react/createElement "span" nil "Row")
                                  (react/createElement "span" nil "Row")))
  (let [els (await (screen/find-all-by-text "Row"))]
    (is (vector? els))
    (is (= 2 (count els)))))
