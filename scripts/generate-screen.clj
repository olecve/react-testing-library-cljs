#!/usr/bin/env bb

(require '[babashka.deps :as deps])
(require '[clojure.string :as str])

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
      (if (= (str char) (str/upper-case char))
        (str result "-" (str/lower-case char))
        (str result char)))
    ""
    string))

(let [query-types ["get" "query" "find" "getAll" "queryAll" "findAll"]
      query-values [{:by "ByRole"
                     :url "https://testing-library.com/docs/queries/byrole"}
                    {:by "ByLabelText"
                     :url "https://testing-library.com/docs/queries/bylabeltext"}
                    {:by "ByPlaceholderText"
                     :url "https://testing-library.com/docs/queries/byplaceholdertext"}
                    {:by "ByText"
                     :url "https://testing-library.com/docs/queries/bytext"}
                    {:by "ByDisplayValue"
                     :url "https://testing-library.com/docs/queries/bydisplayvalue"}
                    {:by "ByAltText"
                     :url "https://testing-library.com/docs/queries/byalttext"}
                    {:by "ByTitle"
                     :url "https://testing-library.com/docs/queries/bytitle"}
                    {:by "ByTestId"
                     :url "https://testing-library.com/docs/queries/bytestid"}]
      queries (for [query-type query-types
                    query-value query-values]
                (let [js-fn-name (str query-type (:by query-value))
                      cljs-fn-name (camel-case->kebab-case js-fn-name)]
                  {:cljs-fn-name cljs-fn-name
                   :js-fn-name js-fn-name
                   :url (:url query-value)}))
      query-fns (->> queries
                     (map #(-> query-fn-template
                               (str/replace "$cljs-fn-name" (:cljs-fn-name %))
                               (str/replace "$js-fn-name" (:js-fn-name %))
                               (str/replace "$url" (:url %))))
                     (str/join "\n"))
      source-file (slurp screen-source-file)
      begin-position (+ (str/index-of source-file begin-marker) (count begin-marker))
      end-position (str/index-of source-file end-marker)
      source-file-updated (-> source-file
                              (remove-string-between begin-position end-position)
                              (insert-string query-fns begin-position))]
  (spit screen-source-file source-file-updated))
