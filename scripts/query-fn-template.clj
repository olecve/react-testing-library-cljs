(defn $cljs-fn-name
  ([query]
   (.$js-fn-name screen query))
  ([query options]
   (.$js-fn-name screen query (clj->js options))))
