(ns react-testing-library-cljs.reagent.render
  (:require ["@testing-library/react" :as testing-library :refer [cleanup]]
            [reagent.core :as r]))

(def test-container-id "test-container")

(defn testing-container []
  (set! (.-innerHTML js/document.body) "")
  (js/document.body.appendChild (doto (js/document.createElement "div")
                                  (.setAttribute "data-testid" test-container-id)
                                  (.setAttribute "id" test-container-id))))

(defn render! [hiccup]
  (if (fn? hiccup)
    (render! (hiccup))
    (do (cleanup)
        (testing-library/render (r/as-element hiccup)
                                #js {:container (testing-container)}))))
