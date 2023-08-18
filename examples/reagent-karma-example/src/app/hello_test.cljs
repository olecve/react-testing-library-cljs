(ns app.hello-test
  (:require [reagent.core :as r]
            [cljs.test :refer-macros [deftest is]]
            [react-testing-library-cljs.reagent.fire-event :as fire-event]
            [react-testing-library-cljs.reagent.render :refer [render!]]
            [react-testing-library-cljs.screen :as s]
            [app.hello :refer [click-counter hello]]))

(deftest when-rednering-hello-component
  (render! [hello])
  (is (s/query-by-text #"Hello")
      "renders hello"))

(deftest when-clicking-counter
  (let [atom (r/atom 0)]
    (render! [click-counter atom])
    (is (s/query-by-text #"has value: 0")
        "shows the initial value as '0'")
    
    (fire-event/click (s/query-by-role "button" #"(?i)click me"))
    (is (s/query-by-text #"has value: 1")
        "shows the value as '1' after click")
    
    (fire-event/click (s/query-by-role "button" #"(?i)click me"))
    (is (s/query-by-text #"has value: 2")
        "shows the value as '2' after two clicks")))
