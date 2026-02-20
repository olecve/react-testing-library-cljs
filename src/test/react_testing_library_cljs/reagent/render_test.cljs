(ns react-testing-library-cljs.reagent.render-test
  (:require
   [cljs.test :refer [deftest is testing]]
   [reagent.core :as r]
   [react-testing-library-cljs.screen :as screen]
   [react-testing-library-cljs.reagent.render :refer [render! act]]))

(deftest render!-test
  (testing "renders hiccup to the DOM"
    (render! [:div "Hello from Reagent"])
    (let [el (screen/get-by-text "Hello from Reagent")]
      (is (some? el))
      (is (= "Hello from Reagent" (.-textContent el))))))

(deftest act-test
  (testing "act flushes reagent state changes"
    (let [counter (r/atom 0)
          component (fn [] [:div
                            [:span {:data-testid "r-count"} (str @counter)]
                            [:button {:on-click #(swap! counter inc)} "Inc"]])]
      (render! [component])
      (is (= "0" (.-textContent (screen/get-by-test-id "r-count"))))
      (act #(swap! counter inc))
      (is (= "1" (.-textContent (screen/get-by-test-id "r-count")))))))
