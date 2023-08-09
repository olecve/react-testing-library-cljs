(ns react-testing-library-cljs.reagent.render
  (:require ["@testing-library/react" :as testing-library]
            [reagent.core :as r]))

(def test-container-id "testing-container")

(defn testing-container []
  (some-> (js/document.getElementById test-container-id) .remove)
  (js/document.body.appendChild (doto (js/document.createElement "div")
                                  (.setAttribute "data-testid" test-container-id)
                                  (.setAttribute "id" test-container-id))))

(defn render! [hiccup]
  (testing-library/render (r/as-element hiccup)
                          #js {:container (testing-container)}))
