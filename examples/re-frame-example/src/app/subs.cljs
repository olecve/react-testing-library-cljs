(ns app.subs
  (:require
   [re-frame.core :as rf]))

;; Kept as a plain function so it can be unit-tested directly.
(defn count-value [db _]
  (:count db))

(rf/reg-sub ::count count-value)
