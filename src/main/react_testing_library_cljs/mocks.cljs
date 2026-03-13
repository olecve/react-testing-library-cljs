(ns react-testing-library-cljs.mocks)

(defn create []
  (let [calls (atom [])
        on-event (fn [args] (swap! calls conj args))
        reset! (fn [] (reset! calls []))]
    [on-event calls reset!]))
