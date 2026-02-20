(ns react-testing-library-cljs.mocks-test
  (:require
   [cljs.test :refer [deftest is testing]]
   [react-testing-library-cljs.mocks :as mocks]))

(deftest create-test
  (testing "create returns a [calls handler reset!] triple"
    (let [[calls handler reset!] (mocks/create)]
      (is (= [] @calls))

      (handler "arg1")
      (is (= ["arg1"] @calls))

      (handler "arg2")
      (is (= ["arg1" "arg2"] @calls))

      (reset!)
      (is (= [] @calls)))))

(deftest multiple-mocks-are-independent
  (testing "separate mocks do not share state"
    (let [[calls-a handler-a _] (mocks/create)
          [calls-b handler-b _] (mocks/create)]
      (handler-a "a")
      (handler-b "b")
      (is (= ["a"] @calls-a))
      (is (= ["b"] @calls-b)))))
