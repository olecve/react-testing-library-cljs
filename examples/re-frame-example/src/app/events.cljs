(ns app.events
  (:require
   [re-frame.core :as rf]))

;; Handlers are plain functions so they can be unit-tested directly.
(defn initialize [_ _]
  {:count 0})

(defn increment [db _]
  (update db :count inc))

(rf/reg-event-db ::initialize initialize)
(rf/reg-event-db ::increment increment)
