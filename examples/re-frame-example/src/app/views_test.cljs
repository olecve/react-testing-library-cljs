(ns app.views-test
  "Testing a re-frame view with react-testing-library: rendering, reacting to
  state changes, and driving state through a user interaction."
  (:require
   [app.events :as events]
   [app.views :as views]
   [cljs.test :refer [deftest is testing]]
   [re-frame.core :as rf]
   [react-testing-library-cljs.reagent.fire-event :as fire-event]
   [react-testing-library-cljs.reagent.render :refer [act render!]]
   [react-testing-library-cljs.screen :as screen]))

(defn- count-text []
  (.-textContent (screen/get-by-test-id "count")))

(deftest view-reflects-state
  (testing "the view renders the current count and reacts to state changes"
    (rf/dispatch-sync [::events/initialize])
    (render! [views/counter])
    (is (= "0" (count-text)))
    ;; dispatch-sync updates the db synchronously; act flushes the re-render.
    (act #(rf/dispatch-sync [::events/increment]))
    (is (= "1" (count-text)))))

(deftest ^:async clicking-button-increments
  (testing "clicking the button dispatches an event and updates the view"
    (rf/dispatch-sync [::events/initialize])
    (render! [views/counter])
    (is (= "0" (count-text)))
    (fire-event/click (screen/get-by-role "button" {:name "Increment"}))
    ;; re-frame `dispatch` is asynchronous, so wait for the DOM to reflect the
    ;; new count rather than asserting immediately.
    (is (some? (await (screen/find-by-text "1"))))))
