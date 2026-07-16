(ns app.views
  (:require
   [app.events :as events]
   [app.subs :as subs]
   [re-frame.core :as rf]))

(defn counter
  "A minimal re-frame view: reads `::subs/count` and dispatches `::events/increment`."
  []
  [:div
   [:span {:data-testid "count"} @(rf/subscribe [::subs/count])]
   [:button {:on-click #(rf/dispatch [::events/increment])} "Increment"]])
