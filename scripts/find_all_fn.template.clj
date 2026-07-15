(defn $cljs-fn-name
  "$docstring

  See [$js-fn-name]($url)."
  ([matcher]
   (.then (.$js-fn-name screen matcher) vec))
  ([matcher options]
   (.then (.$js-fn-name screen matcher (clj->js options)) vec)))
