#!/usr/bin/env bb

(require '[babashka.deps :as deps])

(def screen-source-file "../src/main/react_testing_library_cljs/screen.cljs")

(def begin-marker ";; Begin - Generated Code (Do not modify manually)\n")
(def end-marker ";; End - Generated Code (Do not modify manually)\n")

(def query-fn-template (slurp "query-fn.template.clj"))

(defn insert-string [original string position]
  (str (subs original 0 position)
       string
       (subs original position)))

(defn remove-string-between [string begin end]
  (str (subs string 0 begin)
       (subs string end)))

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
                     (map #(-> query-fn-template
                               (clojure.string/replace "$cljs-fn-name" (camel-case->kebab-case %))
                               (clojure.string/replace "$js-fn-name" %)))
                     (clojure.string/join "\n"))
      source-file (slurp screen-source-file)
      begin-position (+ (clojure.string/index-of source-file begin-marker) (count begin-marker))
      end-position (clojure.string/index-of source-file end-marker)
      source-file-updated (-> source-file
                              (remove-string-between begin-position end-position)
                              (insert-string query-fns begin-position))]
  (spit screen-source-file source-file-updated))
