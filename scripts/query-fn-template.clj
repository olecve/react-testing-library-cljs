(defn $cljs-fn-name
  ([matcher]
   (.$js-fn-name screen matcher))
  ([matcher options]
   (.$js-fn-name screen matcher (clj->js options))))
