(ns app.core
  "This namespace contains your application and is the entrypoint for 'npm start'."
  (:require
   [app.hello :refer [hello]]
   [reagent.dom.client :as rdom-client]))

(defonce root
  (delay (rdom-client/create-root (.getElementById js/document "app"))))

(defn ^:dev/after-load render
  "Render the toplevel component for this app."
  []
  (rdom-client/render @root [hello]))

(defn ^:export main
  "Run application startup logic."
  []
  (render))
