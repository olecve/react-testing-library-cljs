(ns react-testing-library-cljs.reagent.render-test
  (:require
   [cljs.test :refer [deftest is]]
   [react-testing-library-cljs.reagent.render :refer [render! act]]
   [react-testing-library-cljs.screen :as screen]
   [reagent.core :as r]))

(deftest render!-test
  (render! [:div "Hello from Reagent"])
  (let [el (screen/get-by-text "Hello from Reagent")]
    (is (some? el)
        "renders hiccup to the DOM")
    (is (= "Hello from Reagent" (.-textContent el))
        "renders the expected text content")))

(deftest act-test
  (let [counter (r/atom 0)
        component (fn [] [:div
                          [:span {:data-testid "r-count"} (str @counter)]
                          [:button {:on-click #(swap! counter inc)} "Inc"]])]
    (render! [component])
    (is (= "0" (.-textContent (screen/get-by-test-id "r-count")))
        "renders the initial state")
    (act #(swap! counter inc))
    (is (= "1" (.-textContent (screen/get-by-test-id "r-count")))
        "act flushes reagent state changes")))
