(ns react-testing-library-cljs.mocks)

(defn create []
  (let [calls (atom [])
        on-event (fn [args] (swap! calls conj args))
        reset! (fn [] (reset! calls []))]
    [calls on-event reset!]))
