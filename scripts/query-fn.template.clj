(defn $cljs-fn-name
  "$docstring

  Original documentation:
   - $url"
  ([matcher]
   (.$js-fn-name screen matcher))
  ([matcher options]
   (.$js-fn-name screen matcher (clj->js options))))
