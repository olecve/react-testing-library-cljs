(ns react-testing-library-cljs.async)

(defmacro deftest-async
  "Like `cljs.test/deftest` but for async tests that return a Promise.
  Wraps the body in `promesa.core/do`, so each top-level form is awaited
  before the next runs. Automatically calls `done` when the Promise resolves.

  Requires `promesa` on the classpath.

    (deftest-async my-test
      (render-el (react/createElement \"input\" #js {:placeholder \"type here\"}))
      (user-event/type (user-event/setup) (screen/get-by-placeholder-text \"type here\") \"hello\")
      (is (= \"hello\" (.-value (screen/get-by-placeholder-text \"type here\")))))

  Use `promesa.core/do` explicitly when async calls share a `let` binding:

    (deftest-async my-test
      (let [clicks (atom 0)]
        (render-el (react/createElement \"button\" #js {:onClick #(swap! clicks inc)} \"Click\"))
        (p/do
          (user-event/click (user-event/setup) (screen/get-by-role \"button\"))
          (is (= 1 @clicks)))))"
  [name & body]
  `(cljs.test/deftest ~name
     (cljs.test/async done#
       (-> (promesa.core/do ~@body)
           (.then done#)
           (.catch (fn [err#]
                     (cljs.test/is (nil? err#) (.-message err#))
                     (done#)))))))
