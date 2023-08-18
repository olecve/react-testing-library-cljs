(ns app.hello-cards
  (:require [reagent.core :as r]
            [devcards.core :as dc :refer [defcard deftest]]
            [cljs.test :include-macros true :refer [is]]
            ["@testing-library/react" :refer [cleanup]]
            [react-testing-library-cljs.reagent.fire-event :as fire-event]
            [react-testing-library-cljs.reagent.render :refer [render!]]
            [react-testing-library-cljs.screen :as s]
            [app.hello :refer [click-counter hello]]))

(defcard
  "This is a live interactive development environment using [Devcards](https://github.com/bhauman/devcards).
   You can use it to design, test, and think about parts of your app in isolation.

   The two 'cards' below show the two components in this app.")

(defcard hello-card
  (dc/reagent hello))

(defcard click-counter-card
  (dc/reagent click-counter)
  (r/atom 0)
  {:inspect-data true
   :frame true
   :history true})

(defcard
  "You can also add tests here and see their results. 
   Below are some tests using [React Testing Library](https://testing-library.com/docs/react-testing-library/intro).

   Tests will be ran outside the browser when you run the test command.")

(deftest hello-tests-card
  (render! [hello])
  (is (s/query-by-text #"Hello")
      "Should say 'Hello'")
  (cleanup))

(deftest click-counter-tests-card
  (let [atom (r/atom 0)]
    (render! [click-counter atom])
    (is (s/query-by-text #"has value: 0")
        "shows the initial value as '0'")
    
    (fire-event/click (s/query-by-role "button" #"(?i)click me"))
    (is (s/query-by-text #"has value: 1")
        "shows the value as '1' after click")
    
    (fire-event/click (s/query-by-role "button" #"(?i)click me"))
    (is (s/query-by-text #"has value: 2")
        "shows the value as '2' after two clicks")
    (cleanup)))
