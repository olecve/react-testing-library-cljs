(ns app.components
  (:require
   [reagent.core :as r]))

(defn counter
  "A minimal stateful Reagent component used by the tests."
  []
  (let [n (r/atom 0)]
    (fn []
      [:div
       [:span {:data-testid "count"} @n]
       [:button {:on-click #(swap! n inc)} "Increment"]])))
