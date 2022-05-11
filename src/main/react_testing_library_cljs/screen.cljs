(ns react-testing-library-cljs.screen
  (:require
    ["@testing-library/react" :refer [screen]]))

(defn debug
  ([] (.debug screen))
  ([elements] (.debug screen elements)))

;; Refer to https://testing-library.com/docs/queries/about/ for more details about queries
;; Begin - Generated Code (Do not modify manually)
(defn get-by-role
  ([query]
   (.getByRole screen query))
  ([query options]
   (.getByRole screen query (clj->js options))))

(defn get-by-label-text
  ([query]
   (.getByLabelText screen query))
  ([query options]
   (.getByLabelText screen query (clj->js options))))

(defn get-by-placeholder-text
  ([query]
   (.getByPlaceholderText screen query))
  ([query options]
   (.getByPlaceholderText screen query (clj->js options))))

(defn get-by-text
  ([query]
   (.getByText screen query))
  ([query options]
   (.getByText screen query (clj->js options))))

(defn get-by-display-value
  ([query]
   (.getByDisplayValue screen query))
  ([query options]
   (.getByDisplayValue screen query (clj->js options))))

(defn get-by-alt-text
  ([query]
   (.getByAltText screen query))
  ([query options]
   (.getByAltText screen query (clj->js options))))

(defn get-by-title
  ([query]
   (.getByTitle screen query))
  ([query options]
   (.getByTitle screen query (clj->js options))))

(defn get-by-test-id
  ([query]
   (.getByTestId screen query))
  ([query options]
   (.getByTestId screen query (clj->js options))))

(defn query-by-role
  ([query]
   (.queryByRole screen query))
  ([query options]
   (.queryByRole screen query (clj->js options))))

(defn query-by-label-text
  ([query]
   (.queryByLabelText screen query))
  ([query options]
   (.queryByLabelText screen query (clj->js options))))

(defn query-by-placeholder-text
  ([query]
   (.queryByPlaceholderText screen query))
  ([query options]
   (.queryByPlaceholderText screen query (clj->js options))))

(defn query-by-text
  ([query]
   (.queryByText screen query))
  ([query options]
   (.queryByText screen query (clj->js options))))

(defn query-by-display-value
  ([query]
   (.queryByDisplayValue screen query))
  ([query options]
   (.queryByDisplayValue screen query (clj->js options))))

(defn query-by-alt-text
  ([query]
   (.queryByAltText screen query))
  ([query options]
   (.queryByAltText screen query (clj->js options))))

(defn query-by-title
  ([query]
   (.queryByTitle screen query))
  ([query options]
   (.queryByTitle screen query (clj->js options))))

(defn query-by-test-id
  ([query]
   (.queryByTestId screen query))
  ([query options]
   (.queryByTestId screen query (clj->js options))))

(defn find-by-role
  ([query]
   (.findByRole screen query))
  ([query options]
   (.findByRole screen query (clj->js options))))

(defn find-by-label-text
  ([query]
   (.findByLabelText screen query))
  ([query options]
   (.findByLabelText screen query (clj->js options))))

(defn find-by-placeholder-text
  ([query]
   (.findByPlaceholderText screen query))
  ([query options]
   (.findByPlaceholderText screen query (clj->js options))))

(defn find-by-text
  ([query]
   (.findByText screen query))
  ([query options]
   (.findByText screen query (clj->js options))))

(defn find-by-display-value
  ([query]
   (.findByDisplayValue screen query))
  ([query options]
   (.findByDisplayValue screen query (clj->js options))))

(defn find-by-alt-text
  ([query]
   (.findByAltText screen query))
  ([query options]
   (.findByAltText screen query (clj->js options))))

(defn find-by-title
  ([query]
   (.findByTitle screen query))
  ([query options]
   (.findByTitle screen query (clj->js options))))

(defn find-by-test-id
  ([query]
   (.findByTestId screen query))
  ([query options]
   (.findByTestId screen query (clj->js options))))

(defn get-all-by-role
  ([query]
   (.getAllByRole screen query))
  ([query options]
   (.getAllByRole screen query (clj->js options))))

(defn get-all-by-label-text
  ([query]
   (.getAllByLabelText screen query))
  ([query options]
   (.getAllByLabelText screen query (clj->js options))))

(defn get-all-by-placeholder-text
  ([query]
   (.getAllByPlaceholderText screen query))
  ([query options]
   (.getAllByPlaceholderText screen query (clj->js options))))

(defn get-all-by-text
  ([query]
   (.getAllByText screen query))
  ([query options]
   (.getAllByText screen query (clj->js options))))

(defn get-all-by-display-value
  ([query]
   (.getAllByDisplayValue screen query))
  ([query options]
   (.getAllByDisplayValue screen query (clj->js options))))

(defn get-all-by-alt-text
  ([query]
   (.getAllByAltText screen query))
  ([query options]
   (.getAllByAltText screen query (clj->js options))))

(defn get-all-by-title
  ([query]
   (.getAllByTitle screen query))
  ([query options]
   (.getAllByTitle screen query (clj->js options))))

(defn get-all-by-test-id
  ([query]
   (.getAllByTestId screen query))
  ([query options]
   (.getAllByTestId screen query (clj->js options))))

(defn query-all-by-role
  ([query]
   (.queryAllByRole screen query))
  ([query options]
   (.queryAllByRole screen query (clj->js options))))

(defn query-all-by-label-text
  ([query]
   (.queryAllByLabelText screen query))
  ([query options]
   (.queryAllByLabelText screen query (clj->js options))))

(defn query-all-by-placeholder-text
  ([query]
   (.queryAllByPlaceholderText screen query))
  ([query options]
   (.queryAllByPlaceholderText screen query (clj->js options))))

(defn query-all-by-text
  ([query]
   (.queryAllByText screen query))
  ([query options]
   (.queryAllByText screen query (clj->js options))))

(defn query-all-by-display-value
  ([query]
   (.queryAllByDisplayValue screen query))
  ([query options]
   (.queryAllByDisplayValue screen query (clj->js options))))

(defn query-all-by-alt-text
  ([query]
   (.queryAllByAltText screen query))
  ([query options]
   (.queryAllByAltText screen query (clj->js options))))

(defn query-all-by-title
  ([query]
   (.queryAllByTitle screen query))
  ([query options]
   (.queryAllByTitle screen query (clj->js options))))

(defn query-all-by-test-id
  ([query]
   (.queryAllByTestId screen query))
  ([query options]
   (.queryAllByTestId screen query (clj->js options))))

(defn find-all-by-role
  ([query]
   (.findAllByRole screen query))
  ([query options]
   (.findAllByRole screen query (clj->js options))))

(defn find-all-by-label-text
  ([query]
   (.findAllByLabelText screen query))
  ([query options]
   (.findAllByLabelText screen query (clj->js options))))

(defn find-all-by-placeholder-text
  ([query]
   (.findAllByPlaceholderText screen query))
  ([query options]
   (.findAllByPlaceholderText screen query (clj->js options))))

(defn find-all-by-text
  ([query]
   (.findAllByText screen query))
  ([query options]
   (.findAllByText screen query (clj->js options))))

(defn find-all-by-display-value
  ([query]
   (.findAllByDisplayValue screen query))
  ([query options]
   (.findAllByDisplayValue screen query (clj->js options))))

(defn find-all-by-alt-text
  ([query]
   (.findAllByAltText screen query))
  ([query options]
   (.findAllByAltText screen query (clj->js options))))

(defn find-all-by-title
  ([query]
   (.findAllByTitle screen query))
  ([query options]
   (.findAllByTitle screen query (clj->js options))))

(defn find-all-by-test-id
  ([query]
   (.findAllByTestId screen query))
  ([query options]
   (.findAllByTestId screen query (clj->js options))))
;; End - Generated Code (Do not modify manually)
