(require '[clojure.string :as str])

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
