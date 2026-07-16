(ns react-testing-library-cljs.screen-test
  (:require
   ["react" :as react]
   [cljs.test :refer [deftest is]]
   [react-testing-library-cljs.render :as rtl]
   [react-testing-library-cljs.screen :as screen]))

(defn- render-el [element]
  (rtl/render element))

(deftest get-by-text-test
  (rtl/cleanup)
  (render-el (react/createElement "div" nil "Hello World"))
  (let [el (screen/get-by-text "Hello World")]
    (is (some? el)
        "returns the matching element")
    (is (= "Hello World" (.-textContent el))
        "returns the element with the expected text"))

  (rtl/cleanup)
  (render-el (react/createElement "div" nil "Hello"))
  (is (thrown? js/Error (screen/get-by-text "Does not exist"))
      "throws when element is not found"))

(deftest query-by-text-test
  (rtl/cleanup)
  (render-el (react/createElement "div" nil "Query Target"))
  (let [el (screen/query-by-text "Query Target")]
    (is (some? el)
        "returns the element when found")
    (is (= "Query Target" (.-textContent el))
        "returns the element with the expected text"))

  (rtl/cleanup)
  (render-el (react/createElement "div" nil "Something"))
  (is (nil? (screen/query-by-text "Not Here"))
      "returns nil when not found"))

(deftest get-all-by-text-test
  (rtl/cleanup)
  (render-el (react/createElement "div" nil
                                  (react/createElement "span" nil "Item")
                                  (react/createElement "span" nil "Item")))
  (let [els (screen/get-all-by-text "Item")]
    (is (vector? els)
        "returns a vector")
    (is (= 2 (count els))
        "returns all matching elements")))

(deftest get-by-role-test
  (rtl/cleanup)
  (render-el (react/createElement "button" nil "Click me"))
  (let [el (screen/get-by-role "button")]
    (is (some? el)
        "returns element by role")
    (is (= "Click me" (.-textContent el))
        "returns the element with the expected text")))

(deftest query-by-role-test
  (rtl/cleanup)
  (render-el (react/createElement "div" nil "No button"))
  (is (nil? (screen/query-by-role "button"))
      "returns nil when role not found"))

(deftest get-by-test-id-test
  (rtl/cleanup)
  (render-el (react/createElement "div" #js {:data-testid "my-id"} "Test ID"))
  (let [el (screen/get-by-test-id "my-id")]
    (is (some? el)
        "returns element by data-testid")
    (is (= "Test ID" (.-textContent el))
        "returns the element with the expected text")))

(deftest get-by-placeholder-text-test
  (rtl/cleanup)
  (render-el (react/createElement "input" #js {:placeholder "Enter name"}))
  (let [el (screen/get-by-placeholder-text "Enter name")]
    (is (some? el)
        "returns input by placeholder")))
