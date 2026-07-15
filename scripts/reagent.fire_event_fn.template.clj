(defn $cljs-fn-name
  ([element]
   (let [result (.$js-event-type fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.$js-event-type fireEvent element (clj->js options))]
     (r/flush)
     result)))
