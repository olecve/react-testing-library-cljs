(defn $cljs-fn-name
  "$docstring

  Original documentation:
   - $url"
  ([matcher]
   (vec (.$js-fn-name screen matcher)))
  ([matcher options]
   (vec (.$js-fn-name screen matcher (clj->js options)))))
