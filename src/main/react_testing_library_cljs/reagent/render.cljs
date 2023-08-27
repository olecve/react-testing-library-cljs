(ns react-testing-library-cljs.reagent.render
  (:require ["@testing-library/react" :as testing-library]
            [reagent.core :as r]))

(defn- valid-hiccup-component? [hiccup]
  (and (vector? hiccup)
       (seq hiccup)))

(def test-container-id "test-container")

(defn testing-container []
  (js/document.body.appendChild (doto (js/document.createElement "div")
                                  (.setAttribute "data-testid" test-container-id)
                                  (.setAttribute "id" test-container-id))))

(defn render! [hiccup]
  (when-not (valid-hiccup-component? hiccup)
    (js/console.warn (str "Invalid hiccup markup provided: " hiccup ".\n"
                          "Hiccup markup should not be empty and should be a vector.")))
  (testing-library/cleanup)
  (testing-library/render (r/as-element hiccup)
                          #js {:container (testing-container)})
  (r/flush))
