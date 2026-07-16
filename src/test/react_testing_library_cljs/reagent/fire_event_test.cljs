(ns react-testing-library-cljs.reagent.fire-event-test
  (:require
   [cljs.test :refer [deftest is]]
   [react-testing-library-cljs.reagent.fire-event :as fire-event]
   [react-testing-library-cljs.reagent.render :refer [render! act]]
   [react-testing-library-cljs.screen :as screen]
   [reagent.core :as r]))

(deftest click-triggers-re-render
  (let [counter (r/atom 0)
        component (fn [] [:div
                          [:span {:data-testid "count"} (str @counter)]
                          [:button {:on-click #(swap! counter inc)} "Inc"]])]
    (render! [component])
    (is (= "0" (.-textContent (screen/get-by-test-id "count")))
        "renders the initial count")
    (act #(fire-event/click (screen/get-by-text "Inc")))
    (is (= "1" (.-textContent (screen/get-by-test-id "count")))
        "clicking a button updates state visibly")))

(deftest change-triggers-re-render
  (let [value (r/atom "")
        component (fn [] [:div
                          [:input {:data-testid "input"
                                   :value @value
                                   :on-change #(reset! value (.. % -target -value))}]
                          [:span {:data-testid "display"} @value]])]
    (render! [component])
    (is (= "" (.-textContent (screen/get-by-test-id "display")))
        "renders the initial empty value")
    (act #(fire-event/change (screen/get-by-test-id "input") {:target {:value "hello"}}))
    (is (= "hello" (.-textContent (screen/get-by-test-id "display")))
        "changing an input updates state visibly")))

(deftest key-down-returns-default-prevented-boolean
  (let [component (fn [] [:input {:data-testid "plain"}])]
    (render! [component])
    (is (true? (fire-event/key-down (screen/get-by-test-id "plain")))
        "returns true when nothing calls preventDefault (single arity)"))

  (let [component (fn [] [:input {:data-testid "plain"}])]
    (render! [component])
    (is (true? (fire-event/key-down (screen/get-by-test-id "plain") {:key " "}))
        "returns true when nothing calls preventDefault (options arity)"))

  (let [component (fn [] [:input {:data-testid "prevents"
                                  :on-key-down #(.preventDefault %)}])]
    (render! [component])
    (is (false? (fire-event/key-down (screen/get-by-test-id "prevents")))
        "returns false when a handler calls preventDefault (single arity)"))

  (let [component (fn [] [:input {:data-testid "prevents"
                                  :on-key-down #(.preventDefault %)}])]
    (render! [component])
    (is (false? (fire-event/key-down (screen/get-by-test-id "prevents") {:key " "}))
        "returns false when a handler calls preventDefault (options arity)")))
