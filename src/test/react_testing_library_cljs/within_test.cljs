(ns react-testing-library-cljs.within-test
  (:require
   ["react" :as react]
   [cljs.test :refer [deftest is]]
   [react-testing-library-cljs.render :as rtl]
   [react-testing-library-cljs.screen :as screen]
   [react-testing-library-cljs.within :as within]))

(defn- render-el [element]
  (rtl/render element))

(deftest get-by-role-test
  (rtl/cleanup)
  (render-el (react/createElement "div" #js {:role "region"}
                                  (react/createElement "button" nil "Inside")))
  (let [region (screen/get-by-role "region")
        btn (within/get-by-role region "button")]
    (is (some? btn)
        "returns element within scope")
    (is (= "Inside" (.-textContent btn))
        "returns the scoped element's text"))

  (rtl/cleanup)
  (render-el (react/createElement "div" nil
                                  (react/createElement "div" #js {:role "region"}
                                                       (react/createElement "button" nil "Inside"))
                                  (react/createElement "button" nil "Outside")))
  (let [region (screen/get-by-role "region")]
    (is (thrown? js/Error (within/get-by-role region "button" {:name "Outside"}))
        "scopes query — does not find element outside"))

  (rtl/cleanup)
  (render-el (react/createElement "div" #js {:role "region"}
                                  (react/createElement "button" nil "Submit")))
  (let [region (screen/get-by-role "region")
        btn (within/get-by-role region "button" {:name "Submit"})]
    (is (some? btn)
        "supports an options map")))

(deftest query-by-role-test
  (rtl/cleanup)
  (render-el (react/createElement "div" nil
                                  (react/createElement "div" #js {:role "region"} "no button here")
                                  (react/createElement "button" nil "Outside")))
  (let [region (screen/get-by-role "region")]
    (is (nil? (within/query-by-role region "button"))
        "returns nil when element not found within scope")))

(deftest get-all-by-role-test
  (rtl/cleanup)
  (render-el (react/createElement "div" #js {:role "region"}
                                  (react/createElement "button" nil "One")
                                  (react/createElement "button" nil "Two")))
  (let [region (screen/get-by-role "region")
        btns (within/get-all-by-role region "button")]
    (is (vector? btns)
        "returns a vector of elements within scope")
    (is (= 2 (count btns))
        "returns all scoped elements"))

  (rtl/cleanup)
  (render-el (react/createElement "div" nil
                                  (react/createElement "div" #js {:role "region"}
                                                       (react/createElement "button" nil "One"))
                                  (react/createElement "button" nil "Outside")))
  (let [region (screen/get-by-role "region")
        btns (within/get-all-by-role region "button")]
    (is (= 1 (count btns))
        "does not include elements outside scope")))

(deftest query-all-by-role-test
  (rtl/cleanup)
  (render-el (react/createElement "div" #js {:role "region"} "no buttons"))
  (let [region (screen/get-by-role "region")]
    (is (= [] (within/query-all-by-role region "button"))
        "returns empty vector when no elements found within scope")))

(deftest get-by-text-test
  (rtl/cleanup)
  (render-el (react/createElement "div" #js {:role "region"}
                                  (react/createElement "span" nil "Hello")))
  (let [region (screen/get-by-role "region")
        el (within/get-by-text region "Hello")]
    (is (some? el)
        "returns element with matching text within scope")
    (is (= "Hello" (.-textContent el))
        "returns the scoped element's text"))

  (rtl/cleanup)
  (render-el (react/createElement "div" nil
                                  (react/createElement "div" #js {:role "region"}
                                                       (react/createElement "span" nil "Inside"))
                                  (react/createElement "span" nil "Outside")))
  (let [region (screen/get-by-role "region")]
    (is (nil? (within/query-by-text region "Outside"))
        "scopes query — does not find text outside")))

(deftest get-by-test-id-test
  (rtl/cleanup)
  (render-el (react/createElement "div" #js {:role "region"}
                                  (react/createElement "span" #js {:data-testid "my-id"} "content")))
  (let [region (screen/get-by-role "region")
        el (within/get-by-test-id region "my-id")]
    (is (some? el)
        "returns element by test id within scope")))

(deftest get-by-placeholder-text-test
  (rtl/cleanup)
  (render-el (react/createElement "form" #js {:aria-label "search form"}
                                  (react/createElement "input" #js {:placeholder "Enter name"})))
  (let [form (screen/get-by-role "form")
        el (within/get-by-placeholder-text form "Enter name")]
    (is (some? el)
        "returns input by placeholder within scope")))
