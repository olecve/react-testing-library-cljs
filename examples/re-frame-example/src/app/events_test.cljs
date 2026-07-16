(ns app.events-test
  "Unit-testing re-frame event and subscription handlers as plain functions."
  (:require
   [app.events :as events]
   [app.subs :as subs]
   [cljs.test :refer [deftest is]]))

(deftest event-handlers
  (is (= {:count 0} (events/initialize nil nil))
      "initialize sets the starting count")
  (is (= {:count 1} (events/increment {:count 0} nil))
      "increment bumps the count"))

(deftest subscription-handlers
  (is (= 5 (subs/count-value {:count 5} nil))
      "count-value reads :count from the db"))
