(defn $cljs-fn-name
  "$docstring

  See [$js-fn-name]($url)."
  ([element matcher]
   (.$js-fn-name (within element) matcher))
  ([element matcher options]
   (.$js-fn-name (within element) matcher (clj->js options))))
