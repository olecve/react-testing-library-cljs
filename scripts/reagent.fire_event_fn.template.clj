(defn $cljs-fn-name
  ([element]
   (.$js-event-type fireEvent element)
   (r/flush))
  ([element options]
   (.$js-event-type fireEvent element options)
   (r/flush)))
