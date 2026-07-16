(ns app.reagent-test
  "Testing Reagent components: render!, fire-event, screen, within, and mocks."
  (:require
   [app.components :refer [counter]]
   [cljs.test :refer [deftest is testing]]
   [react-testing-library-cljs.mocks :as mocks]
   [react-testing-library-cljs.reagent.fire-event :as fire-event]
   [react-testing-library-cljs.reagent.render :refer [act render!]]
   [react-testing-library-cljs.screen :as screen]
   [react-testing-library-cljs.within :as within]))

(deftest counter-increments
  (testing "clicking the button updates the rendered state"
    (render! [counter])
    (is (= "0" (.-textContent (screen/get-by-test-id "count"))))
    ;; Wrap interactions that cause re-renders in `act` so React flushes them.
    (act #(fire-event/click (screen/get-by-role "button" {:name "Increment"})))
    (is (= "1" (.-textContent (screen/get-by-test-id "count"))))))

(deftest scoped-queries-with-within
  (testing "within scopes a query to a subtree"
    (render! [:div
              [:section {:aria-label "sidebar"}
               [:button "Save"]]
              [:button "Save"]])
    (let [sidebar (screen/get-by-role "region" {:name "sidebar"})]
      (is (some? (within/get-by-role sidebar "button" {:name "Save"})))
      ;; Two "Save" buttons exist overall; within disambiguates.
      (is (= 2 (count (screen/get-all-by-role "button" {:name "Save"})))))))

(deftest mock-handler-records-calls
  (testing "mocks/create returns [handler calls reset!]"
    (let [[on-click calls] (mocks/create)]
      (render! [:button {:on-click on-click} "Submit"])
      (act #(fire-event/click (screen/get-by-text "Submit")))
      (is (= 1 (count @calls))))))
