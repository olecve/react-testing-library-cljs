(ns app.plain-react-test
  "Testing plain React (no Reagent): raw createElement with user-event and
  async queries. Uses native ClojureScript async (`^:async` / `await`)."
  (:require
   ["@testing-library/react" :as rtl]
   ["react" :as react]
   [cljs.test :refer [deftest is]]
   [react-testing-library-cljs.screen :as screen]
   [react-testing-library-cljs.user-event :as user-event]))

(defn- render-el [element]
  (rtl/render element))

(deftest ^:async user-event-types-into-input
  (rtl/cleanup)
  (render-el (react/createElement "input" #js {:placeholder "name"}))
  (let [user (user-event/setup)]
    (await (user-event/type user (screen/get-by-placeholder-text "name") "Ada"))
    (is (= "Ada" (.-value (screen/get-by-placeholder-text "name"))))))

(deftest ^:async find-by-resolves-when-element-appears
  (rtl/cleanup)
  (render-el (react/createElement "div" nil "Loaded!"))
  (let [element (await (screen/find-by-text "Loaded!"))]
    (is (some? element))))
