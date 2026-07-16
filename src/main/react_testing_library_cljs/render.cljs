(ns react-testing-library-cljs.render
  "Wraps @testing-library/react's render, cleanup, and act for plain-React tests.
  Reagent users should use `react-testing-library-cljs.reagent.render` instead."
  (:require
   ["@testing-library/react" :as rtl]))

(defn render
  "Renders a React element and returns the @testing-library/react result.

  See [render](https://testing-library.com/docs/react-testing-library/api/#render)."
  ([element]
   (rtl/render element))
  ([element options]
   (rtl/render element (clj->js options))))

(defn cleanup
  "Unmounts anything rendered by `render`; call it between tests.

  See [cleanup](https://testing-library.com/docs/react-testing-library/api/#cleanup)."
  []
  (rtl/cleanup))

(defn act
  "Runs `callback` inside React's act() so updates and effects flush.

  See [act](https://testing-library.com/docs/react-testing-library/api/#act)."
  [callback]
  (rtl/act callback))
