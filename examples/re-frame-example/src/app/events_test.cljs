(ns app.events-test
  "Unit-testing re-frame event and subscription handlers as plain functions."
  (:require
   [app.events :as events]
   [app.subs :as subs]
   [cljs.test :refer [deftest is testing]]))

(deftest event-handlers
  (testing "initialize sets the starting count"
    (is (= {:count 0} (events/initialize nil nil))))
  (testing "increment bumps the count"
    (is (= {:count 1} (events/increment {:count 0} nil)))))

(deftest subscription-handlers
  (testing "count-value reads :count from the db"
    (is (= 5 (subs/count-value {:count 5} nil)))))
