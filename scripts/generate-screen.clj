#!/usr/bin/env bb

(require '[babashka.deps :as deps])

(def fn-template
"(defn $cljs-fn-name [query]
  (.$js-fn-name screen query))
")

(defn camel-case->kebab-case [string]
  (reduce
    (fn [result char]
      (if (= (str char) (clojure.string/upper-case char))
        (str result "-" (clojure.string/lower-case char))
        (str result char)))
    ""
    string))

(let [query-types ["getBy" "queryBy" "findBy" "getAllBy" "queryAllBy" "findAllBy"]
      query-values ["Role" "LabelText" "PlaceholderText" "Text" "DisplayValue" "AltText" "Title" "TestId"]
      queries (for [query-type query-types
                    query-value query-values]
                (str query-type query-value))
      query-fns (->> queries
                     (map #(-> fn-template
                               (clojure.string/replace "$cljs-fn-name" (camel-case->kebab-case %))
                               (clojure.string/replace "$js-fn-name" %)))
                     (clojure.string/join "\n"))]
  (spit "../src/main/react_testing_library_cljs/screen.cljs" (str begin-template query-fns)))
