(ns react-testing-library-cljs.async-macro-test
  "Smoke test guarding the `deftest-async` macro, the compatibility path for
  toolchains that cannot run native `^:async` tests (shadow-cljs < 3.4.x).
  Requires `promesa` on the classpath."
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
  (render-el (react/createElement "div" nil "Macro Hello"))
  (p/let [el (screen/find-by-text "Macro Hello")]
    (is (some? el))
    (is (= "Macro Hello" (.-textContent el)))))

(deftest-async find-all-by-text-test
  (rtl/cleanup)
  (render-el (react/createElement "div" nil
                                  (react/createElement "span" nil "Item")
                                  (react/createElement "span" nil "Item")))
  (p/let [els (screen/find-all-by-text "Item")]
    (is (vector? els))
    (is (= 2 (count els)))))
