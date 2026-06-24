(ns app.core
  "This namespace contains your application and is the entrypoint for 'yarn start'."
  (:require
   [app.hello :refer [hello]]
   [reagent.core :as r]))

(defn ^:dev/after-load render
  "Render the toplevel component for this app."
  []
  (r/render [hello] (.getElementById js/document "app")))

(defn ^:export main
  "Run application startup logic."
  []
  (render))
