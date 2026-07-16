(ns react-testing-library-cljs.mocks-test
  (:require
   [cljs.test :refer [deftest is]]
   [react-testing-library-cljs.fire-event :as fire-event]
   [react-testing-library-cljs.mocks :as mocks]
   [react-testing-library-cljs.reagent.render :as render]
   [react-testing-library-cljs.screen :as screen]))

(deftest create-test
  (let [[handler calls reset!] (mocks/create)]
    (is (= [] @calls)
        "starts with no recorded calls")

    (handler "arg1")
    (is (= ["arg1"] @calls)
        "records the first call's args")

    (handler "arg2")
    (is (= ["arg1" "arg2"] @calls)
        "appends subsequent calls")

    (reset!)
    (is (= [] @calls)
        "reset! clears the recorded calls")))

(deftest multiple-mocks-are-independent
  (let [[handler-a calls-a _] (mocks/create)
        [handler-b calls-b _] (mocks/create)]
    (handler-a "a")
    (handler-b "b")
    (is (= ["a"] @calls-a)
        "separate mocks do not share state")
    (is (= ["b"] @calls-b)
        "separate mocks do not share state")))

(deftest tracks-button-click
  (let [[on-click calls] (mocks/create)]
    (render/render! [:button {:on-click on-click} "Submit"])
    (fire-event/click (screen/get-by-text "Submit"))
    (is (= 1 (count @calls))
        "a mock handler wired to a rendered button records clicks")))
