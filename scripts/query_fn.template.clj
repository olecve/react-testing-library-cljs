(defn $cljs-fn-name
  "$docstring

  See [$js-fn-name]($url)."
  ([matcher]
   (.$js-fn-name screen matcher))
  ([matcher options]
   (.$js-fn-name screen matcher (clj->js options))))
