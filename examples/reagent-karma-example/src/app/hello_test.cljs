(ns app.hello-test
  (:require
   [app.hello :refer [click-counter click-counter-with-inner-state hello]]
   [cljs.test :refer-macros [deftest is]]
   [react-testing-library-cljs.reagent.fire-event :as fire-event]
   [react-testing-library-cljs.reagent.render :refer [act render!]]
   [react-testing-library-cljs.screen :as s]
   [reagent.core :as r]))

(deftest when-rendering-hello-component
  (render! [hello])
  (is (s/query-by-text #"Hello")
      "renders hello"))

(deftest when-clicking-counter
  (let [click-count (r/atom 0)]
    (render! [click-counter click-count])
    (is (s/query-by-text #"has value: 0")
        "shows the initial value as '0'")

    (act #(fire-event/click (s/query-by-role "button" {:name #"(?i)click me"})))
    (is (s/query-by-text #"has value: 1")
        "shows the value as '1' after click")

    (act #(fire-event/click (s/query-by-role "button" {:name #"(?i)click me"})))
    (is (s/query-by-text #"has value: 2")
        "shows the value as '2' after two clicks")))

(deftest click-counter-with-inner-state-test
  (render! [click-counter-with-inner-state])

  (is (s/query-by-text #"has value: 0")
      "shows the initial value as '0'")

  (act #(fire-event/click (s/query-by-role "button" {:name #"(?i)click me"})))
  (is (s/query-by-text #"has value: 1")
      "shows the value as '1' after click")

  (act #(fire-event/click (s/query-by-role "button" {:name #"(?i)click me"})))
  (is (s/query-by-text #"has value: 2")
      "shows the value as '2' after two clicks"))
