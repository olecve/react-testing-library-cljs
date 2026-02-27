(ns react-testing-library-cljs.async)

(defmacro deftest-async
  "Like `cljs.test/deftest` but for async tests that return a Promise.
  Wraps the body in `cljs.test/async` and automatically calls `done`
  when the returned Promise resolves.

  Requires `promesa` on the classpath. Use `promesa.core/p/let` to
  sequence async operations without nesting `.then` calls:

    (deftest-async my-test
      (p/let [_ (user-event/type user input \"hello\")]
        (is (= \"hello\" (.-value input)))))"
  [name & body]
  `(cljs.test/deftest ~name
     (cljs.test/async done#
       (-> (promesa.core/do ~@body)
           (.then done#)
           (.catch (fn [err#]
                     (cljs.test/is (nil? err#) (.-message err#))
                     (done#)))))))
