(ns react-testing-library-cljs.screen-test
  (:require
   [cljs.test :refer [deftest is testing]]
   ["@testing-library/react" :as rtl]
   ["react" :as react]
   [react-testing-library-cljs.screen :as screen]))

(defn- render-el [element]
  (rtl/render element))

(deftest get-by-text-test
  (testing "returns the matching element"
    (render-el (react/createElement "div" nil "Hello World"))
    (let [el (screen/get-by-text "Hello World")]
      (is (some? el))
      (is (= "Hello World" (.-textContent el)))))

  (testing "throws when element is not found"
    (rtl/cleanup)
    (render-el (react/createElement "div" nil "Hello"))
    (is (thrown? js/Error (screen/get-by-text "Does not exist")))))

(deftest query-by-text-test
  (testing "returns the element when found"
    (rtl/cleanup)
    (render-el (react/createElement "div" nil "Query Target"))
    (let [el (screen/query-by-text "Query Target")]
      (is (some? el))
      (is (= "Query Target" (.-textContent el)))))

  (testing "returns nil when not found"
    (rtl/cleanup)
    (render-el (react/createElement "div" nil "Something"))
    (is (nil? (screen/query-by-text "Not Here")))))

(deftest get-all-by-text-test
  (testing "returns a vector of matching elements"
    (rtl/cleanup)
    (render-el (react/createElement "div" nil
                 (react/createElement "span" nil "Item")
                 (react/createElement "span" nil "Item")))
    (let [els (screen/get-all-by-text "Item")]
      (is (vector? els))
      (is (= 2 (count els))))))

(deftest get-by-role-test
  (testing "returns element by role"
    (rtl/cleanup)
    (render-el (react/createElement "button" nil "Click me"))
    (let [el (screen/get-by-role "button")]
      (is (some? el))
      (is (= "Click me" (.-textContent el))))))

(deftest query-by-role-test
  (testing "returns nil when role not found"
    (rtl/cleanup)
    (render-el (react/createElement "div" nil "No button"))
    (is (nil? (screen/query-by-role "button")))))

(deftest get-by-test-id-test
  (testing "returns element by data-testid"
    (rtl/cleanup)
    (render-el (react/createElement "div" #js {:data-testid "my-id"} "Test ID"))
    (let [el (screen/get-by-test-id "my-id")]
      (is (some? el))
      (is (= "Test ID" (.-textContent el))))))

(deftest get-by-placeholder-text-test
  (testing "returns input by placeholder"
    (rtl/cleanup)
    (render-el (react/createElement "input" #js {:placeholder "Enter name"}))
    (let [el (screen/get-by-placeholder-text "Enter name")]
      (is (some? el)))))
