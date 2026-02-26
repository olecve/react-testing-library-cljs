(defn $cljs-fn-name
  "$docstring

  See [$js-fn-name]($url)."
  ([element matcher]
   (vec (.$js-fn-name (within element) matcher)))
  ([element matcher options]
   (vec (.$js-fn-name (within element) matcher (clj->js options)))))
