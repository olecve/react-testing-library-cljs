(defn $cljs-fn-name
  "$docstring

  See [$js-fn-name]($url)."
  ([element matcher]
   (.then (.$js-fn-name (within element) matcher) vec))
  ([element matcher options]
   (.then (.$js-fn-name (within element) matcher (clj->js options)) vec)))
