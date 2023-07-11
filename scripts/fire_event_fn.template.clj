(defn $cljs-fn-name
  ([element]
   (.-$js-event-type fireEvent element))
  ([element options]
   (.-$js-event-type fireEvent element options)))
