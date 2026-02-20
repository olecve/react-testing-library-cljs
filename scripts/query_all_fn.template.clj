(defn $cljs-fn-name
  "$docstring

  See [$js-fn-name]($url)."
  ([matcher]
   (vec (.$js-fn-name screen matcher)))
  ([matcher options]
   (vec (.$js-fn-name screen matcher (clj->js options)))))
