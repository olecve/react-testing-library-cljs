(ns react-testing-library-cljs.mocks-test
  (:require
   [cljs.test :refer [deftest is testing]]
   [react-testing-library-cljs.mocks :as mocks]))

(deftest create-test
  (testing "create returns a [calls handler reset!] triple"
    (let [[handler calls reset!] (mocks/create)]
      (is (= [] @calls))

      (handler "arg1")
      (is (= ["arg1"] @calls))

      (handler "arg2")
      (is (= ["arg1" "arg2"] @calls))

      (reset!)
      (is (= [] @calls)))))

(deftest multiple-mocks-are-independent
  (testing "separate mocks do not share state"
    (let [[handler-a calls-a _] (mocks/create)
          [handler-b calls-b _] (mocks/create)]
      (handler-a "a")
      (handler-b "b")
      (is (= ["a"] @calls-a))
      (is (= ["b"] @calls-b)))))
