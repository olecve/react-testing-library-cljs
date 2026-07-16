(ns react-testing-library-cljs.within-test
  (:require
   ["react" :as react]
   [cljs.test :refer [deftest is testing]]
   [react-testing-library-cljs.render :as rtl]
   [react-testing-library-cljs.screen :as screen]
   [react-testing-library-cljs.within :as within]))

(defn- render-el [element]
  (rtl/render element))

(deftest get-by-role-test
  (testing "returns element within scope"
    (rtl/cleanup)
    (render-el (react/createElement "div" #js {:role "region"}
                                    (react/createElement "button" nil "Inside")))
    (let [region (screen/get-by-role "region")
          btn (within/get-by-role region "button")]
      (is (some? btn))
      (is (= "Inside" (.-textContent btn)))))

  (testing "scopes query — does not find element outside"
    (rtl/cleanup)
    (render-el (react/createElement "div" nil
                                    (react/createElement "div" #js {:role "region"}
                                                         (react/createElement "button" nil "Inside"))
                                    (react/createElement "button" nil "Outside")))
    (let [region (screen/get-by-role "region")]
      (is (thrown? js/Error (within/get-by-role region "button" {:name "Outside"})))))

  (testing "supports options map"
    (rtl/cleanup)
    (render-el (react/createElement "div" #js {:role "region"}
                                    (react/createElement "button" nil "Submit")))
    (let [region (screen/get-by-role "region")
          btn (within/get-by-role region "button" {:name "Submit"})]
      (is (some? btn)))))

(deftest query-by-role-test
  (testing "returns nil when element not found within scope"
    (rtl/cleanup)
    (render-el (react/createElement "div" nil
                                    (react/createElement "div" #js {:role "region"} "no button here")
                                    (react/createElement "button" nil "Outside")))
    (let [region (screen/get-by-role "region")]
      (is (nil? (within/query-by-role region "button"))))))

(deftest get-all-by-role-test
  (testing "returns vector of elements within scope"
    (rtl/cleanup)
    (render-el (react/createElement "div" #js {:role "region"}
                                    (react/createElement "button" nil "One")
                                    (react/createElement "button" nil "Two")))
    (let [region (screen/get-by-role "region")
          btns (within/get-all-by-role region "button")]
      (is (vector? btns))
      (is (= 2 (count btns)))))

  (testing "does not include elements outside scope"
    (rtl/cleanup)
    (render-el (react/createElement "div" nil
                                    (react/createElement "div" #js {:role "region"}
                                                         (react/createElement "button" nil "One"))
                                    (react/createElement "button" nil "Outside")))
    (let [region (screen/get-by-role "region")
          btns (within/get-all-by-role region "button")]
      (is (= 1 (count btns))))))

(deftest query-all-by-role-test
  (testing "returns empty vector when no elements found within scope"
    (rtl/cleanup)
    (render-el (react/createElement "div" #js {:role "region"} "no buttons"))
    (let [region (screen/get-by-role "region")]
      (is (= [] (within/query-all-by-role region "button"))))))

(deftest get-by-text-test
  (testing "returns element with matching text within scope"
    (rtl/cleanup)
    (render-el (react/createElement "div" #js {:role "region"}
                                    (react/createElement "span" nil "Hello")))
    (let [region (screen/get-by-role "region")
          el (within/get-by-text region "Hello")]
      (is (some? el))
      (is (= "Hello" (.-textContent el)))))

  (testing "scopes query — does not find text outside"
    (rtl/cleanup)
    (render-el (react/createElement "div" nil
                                    (react/createElement "div" #js {:role "region"}
                                                         (react/createElement "span" nil "Inside"))
                                    (react/createElement "span" nil "Outside")))
    (let [region (screen/get-by-role "region")]
      (is (nil? (within/query-by-text region "Outside"))))))

(deftest get-by-test-id-test
  (testing "returns element by test id within scope"
    (rtl/cleanup)
    (render-el (react/createElement "div" #js {:role "region"}
                                    (react/createElement "span" #js {:data-testid "my-id"} "content")))
    (let [region (screen/get-by-role "region")
          el (within/get-by-test-id region "my-id")]
      (is (some? el)))))

(deftest get-by-placeholder-text-test
  (testing "returns input by placeholder within scope"
    (rtl/cleanup)
    (render-el (react/createElement "form" #js {:aria-label "search form"}
                                    (react/createElement "input" #js {:placeholder "Enter name"})))
    (let [form (screen/get-by-role "form")
          el (within/get-by-placeholder-text form "Enter name")]
      (is (some? el)))))
