(ns react-testing-library-cljs.reagent.render
  (:require
    ["@testing-library/react" :as testing-library]
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
  (let [render-result (testing-library/render (r/as-element hiccup)
                                              #js {:container (testing-container)})]
    (r/flush)
    render-result))

(defn act
  "This is a light wrapper around the `react-dom/test-utils` act function.

  To prepare a component for assertions, wrap the code rendering it and performing updates inside an act() call.
  This makes your test run closer to how React works in the browser."
  [callback]
  (testing-library/act (callback)))
