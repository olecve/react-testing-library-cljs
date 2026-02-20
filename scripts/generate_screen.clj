#!/usr/bin/env bb

(require '[clojure.string :as str])

(def screen-source-file "../src/main/react_testing_library_cljs/screen.cljs")

(def begin-marker ";; Begin - Generated Code (Do not modify manually)\n")
(def end-marker ";; End - Generated Code (Do not modify manually)\n")

(def query-fn-template (slurp "query_fn.template.clj"))
(def query-all-fn-template (slurp "query_all_fn.template.clj"))

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

(let [query-types [{:type "getBy"
                    :docstring (str "0 Matches  - Throw error\n  "
                                    "1 Match    - Return element\n  "
                                    ">1 Matches - Throw error\n  "
                                    "Retry (Async/Await) - No")
                    :template query-fn-template}
                   {:type "queryBy"
                    :docstring (str "0 Matches  - Return null\n  "
                                    "1 Match    - Return element\n  "
                                    ">1 Matches - Throw error\n  "
                                    "Retry (Async/Await) - No")
                    :template query-fn-template}
                   {:type "findBy"
                    :docstring (str "0 Matches  - Throw error\n  "
                                    "1 Match    - Return element\n  "
                                    ">1 Matches - Throw error\n  "
                                    "Retry (Async/Await) - Yes")
                    :template query-fn-template}
                   {:type "getAllBy"
                    :docstring (str "0 Matches  - Throw error\n  "
                                    "1 Match    - Return vector\n  "
                                    ">1 Matches - Return vector\n  "
                                    "Retry (Async/Await) - No")
                    :template query-all-fn-template}
                   {:type "queryAllBy"
                    :docstring (str "0 Matches  - Return []\n  "
                                    "1 Match    - Return vector\n  "
                                    ">1 Matches - Return vector\n  "
                                    "Retry (Async/Await) - No")
                    :template query-all-fn-template}
                   {:type "findAllBy"
                    :docstring (str "0 Matches  - Throw error\n  "
                                    "1 Match    - Return vector\n  "
                                    ">1 Matches - Return vector\n  "
                                    "Retry (Async/Await) - Yes")
                    :template query-all-fn-template}]
      query-values [{:by "Role"
                     :url "https://testing-library.com/docs/queries/byrole"}
                    {:by "LabelText"
                     :url "https://testing-library.com/docs/queries/bylabeltext"}
                    {:by "PlaceholderText"
                     :url "https://testing-library.com/docs/queries/byplaceholdertext"}
                    {:by "Text"
                     :url "https://testing-library.com/docs/queries/bytext"}
                    {:by "DisplayValue"
                     :url "https://testing-library.com/docs/queries/bydisplayvalue"}
                    {:by "AltText"
                     :url "https://testing-library.com/docs/queries/byalttext"}
                    {:by "Title"
                     :url "https://testing-library.com/docs/queries/bytitle"}
                    {:by "TestId"
                     :url "https://testing-library.com/docs/queries/bytestid"}]
      queries (for [query-type query-types
                    query-value query-values]
                (let [js-fn-name (str (:type query-type) (:by query-value))
                      cljs-fn-name (camel-case->kebab-case js-fn-name)]
                  {:cljs-fn-name cljs-fn-name
                   :js-fn-name js-fn-name
                   :url (:url query-value)
                   :docstring (:docstring query-type)
                   :template (:template query-type)}))
      query-fns (->> queries
                     (map #(-> (:template %)
                               (str/replace "$cljs-fn-name" (:cljs-fn-name %))
                               (str/replace "$js-fn-name" (:js-fn-name %))
                               (str/replace "$docstring" (:docstring %))
                               (str/replace "$url" (:url %))))
                     (str/join "\n"))
      source-file (slurp screen-source-file)
      begin-position (+ (str/index-of source-file begin-marker) (count begin-marker))
      end-position (str/index-of source-file end-marker)
      source-file-updated (-> source-file
                              (remove-string-between begin-position end-position)
                              (insert-string query-fns begin-position))]
  (spit screen-source-file source-file-updated))
