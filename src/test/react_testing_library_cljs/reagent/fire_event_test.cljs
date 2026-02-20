(ns react-testing-library-cljs.reagent.fire-event-test
  (:require
   [cljs.test :refer [deftest is testing]]
   [reagent.core :as r]
   [react-testing-library-cljs.screen :as screen]
   [react-testing-library-cljs.reagent.render :refer [render! act]]
   [react-testing-library-cljs.reagent.fire-event :as fire-event]))

(deftest click-triggers-re-render
  (testing "clicking a button updates state visibly"
    (let [counter (r/atom 0)
          component (fn [] [:div
                            [:span {:data-testid "count"} (str @counter)]
                            [:button {:on-click #(swap! counter inc)} "Inc"]])]
      (render! [component])
      (is (= "0" (.-textContent (screen/get-by-test-id "count"))))
      (act #(fire-event/click (screen/get-by-text "Inc")))
      (is (= "1" (.-textContent (screen/get-by-test-id "count")))))))

(deftest change-triggers-re-render
  (testing "changing an input updates state visibly"
    (let [value (r/atom "")
          component (fn [] [:div
                            [:input {:data-testid "input"
                                     :value @value
                                     :on-change #(reset! value (.. % -target -value))}]
                            [:span {:data-testid "display"} @value]])]
      (render! [component])
      (is (= "" (.-textContent (screen/get-by-test-id "display"))))
      (act #(fire-event/change (screen/get-by-test-id "input") {:target {:value "hello"}}))
      (is (= "hello" (.-textContent (screen/get-by-test-id "display")))))))
