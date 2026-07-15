(ns react-testing-library-cljs.reagent.fire-event-test
  (:require
   [cljs.test :refer [deftest is testing]]
   [react-testing-library-cljs.reagent.fire-event :as fire-event]
   [react-testing-library-cljs.reagent.render :refer [render! act]]
   [react-testing-library-cljs.screen :as screen]
   [reagent.core :as r]))

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

(deftest key-down-returns-default-prevented-boolean
  (testing "returns true when nothing calls preventDefault (single arity)"
    (let [component (fn [] [:input {:data-testid "plain"}])]
      (render! [component])
      (is (true? (fire-event/key-down (screen/get-by-test-id "plain"))))))

  (testing "returns true when nothing calls preventDefault (options arity)"
    (let [component (fn [] [:input {:data-testid "plain"}])]
      (render! [component])
      (is (true? (fire-event/key-down (screen/get-by-test-id "plain") {:key " "})))))

  (testing "returns false when a handler calls preventDefault (single arity)"
    (let [component (fn [] [:input {:data-testid "prevents"
                                    :on-key-down #(.preventDefault %)}])]
      (render! [component])
      (is (false? (fire-event/key-down (screen/get-by-test-id "prevents"))))))

  (testing "returns false when a handler calls preventDefault (options arity)"
    (let [component (fn [] [:input {:data-testid "prevents"
                                    :on-key-down #(.preventDefault %)}])]
      (render! [component])
      (is (false? (fire-event/key-down (screen/get-by-test-id "prevents") {:key " "}))))))
