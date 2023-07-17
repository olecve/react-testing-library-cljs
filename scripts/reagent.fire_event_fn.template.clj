(defn $cljs-fn-name
  ([element]
   (.$js-event-type fireEvent element)
   (r/flush))
  ([element options]
   (.$js-event-type fireEvent element (clj->js options))
   (r/flush)))
