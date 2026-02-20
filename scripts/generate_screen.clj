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
                    :docstring (str "Returns the matching element for a query.\n\n  "
                                    "Throws a descriptive error if no elements match or if more than one match is found.\n  "
                                    "Use `get-all-by` instead if more than one element is expected.\n\n  "
                                    "- No match: Throws error\n  "
                                    "- One match: Returns element\n  "
                                    "- Multiple match: Throws error\n  "
                                    "- Async: No")
                    :template query-fn-template}
                   {:type "queryBy"
                    :docstring (str "Returns the matching element for a query, or `nil` if no elements match.\n\n  "
                                    "Useful for asserting an element that is not present. Throws an error if more than one\n  "
                                    "match is found. Use `query-all-by` instead if this is OK.\n\n  "
                                    "- No match: Returns nil\n  "
                                    "- One match: Returns element\n  "
                                    "- Multiple match: Throws error\n  "
                                    "- Async: No")
                    :template query-fn-template}
                   {:type "findBy"
                    :docstring (str "Returns a promise which resolves when a matching element is found.\n\n  "
                                    "The promise is rejected if no element is found or if more than one element is found\n  "
                                    "after a default timeout of 1000ms. If you need to find more than one element, use\n  "
                                    "`find-all-by`. This is a combination of `get-by` queries and `waitFor`.\n\n  "
                                    "- No match: Rejects\n  "
                                    "- One match: Resolves with element\n  "
                                    "- Multiple match: Rejects\n  "
                                    "- Async: Yes")
                    :template query-fn-template}
                   {:type "getAllBy"
                    :docstring (str "Returns a vector of all matching elements for a query.\n\n  "
                                    "Throws an error if no elements match.\n\n  "
                                    "- No match: Throws error\n  "
                                    "- One match: Returns vector\n  "
                                    "- Multiple match: Returns vector\n  "
                                    "- Async: No")
                    :template query-all-fn-template}
                   {:type "queryAllBy"
                    :docstring (str "Returns a vector of all matching elements for a query.\n\n  "
                                    "Returns an empty vector if no elements match.\n\n  "
                                    "- No match: Returns []\n  "
                                    "- One match: Returns vector\n  "
                                    "- Multiple match: Returns vector\n  "
                                    "- Async: No")
                    :template query-all-fn-template}
                   {:type "findAllBy"
                    :docstring (str "Returns a promise which resolves to a vector of matching elements.\n\n  "
                                    "The promise is rejected if no elements are found after a default timeout of 1000ms.\n  "
                                    "This is a combination of `get-all-by` queries and `waitFor`.\n\n  "
                                    "- No match: Rejects\n  "
                                    "- One match: Resolves with vector\n  "
                                    "- Multiple match: Resolves with vector\n  "
                                    "- Async: Yes")
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
