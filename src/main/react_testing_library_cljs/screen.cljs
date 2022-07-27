(ns react-testing-library-cljs.screen
  (:require
    ["@testing-library/react" :refer [screen]]))

(defn debug
  ([] (.debug screen))
  ([elements] (.debug screen elements)))

;; Refer to https://testing-library.com/docs/queries/about/ for more details about queries
;; Begin - Generated Code (Do not modify manually)
(defn get-by-role
  "Original documentation:
   - https://testing-library.com/docs/queries/byrole"
  ([matcher]
   (.getByRole screen matcher))
  ([matcher options]
   (.getByRole screen matcher (clj->js options))))

(defn get-by-label-text
  "Original documentation:
   - https://testing-library.com/docs/queries/bylabeltext"
  ([matcher]
   (.getByLabelText screen matcher))
  ([matcher options]
   (.getByLabelText screen matcher (clj->js options))))

(defn get-by-placeholder-text
  "Original documentation:
   - https://testing-library.com/docs/queries/byplaceholdertext"
  ([matcher]
   (.getByPlaceholderText screen matcher))
  ([matcher options]
   (.getByPlaceholderText screen matcher (clj->js options))))

(defn get-by-text
  "Original documentation:
   - https://testing-library.com/docs/queries/bytext"
  ([matcher]
   (.getByText screen matcher))
  ([matcher options]
   (.getByText screen matcher (clj->js options))))

(defn get-by-display-value
  "Original documentation:
   - https://testing-library.com/docs/queries/bydisplayvalue"
  ([matcher]
   (.getByDisplayValue screen matcher))
  ([matcher options]
   (.getByDisplayValue screen matcher (clj->js options))))

(defn get-by-alt-text
  "Original documentation:
   - https://testing-library.com/docs/queries/byalttext"
  ([matcher]
   (.getByAltText screen matcher))
  ([matcher options]
   (.getByAltText screen matcher (clj->js options))))

(defn get-by-title
  "Original documentation:
   - https://testing-library.com/docs/queries/bytitle"
  ([matcher]
   (.getByTitle screen matcher))
  ([matcher options]
   (.getByTitle screen matcher (clj->js options))))

(defn get-by-test-id
  "Original documentation:
   - https://testing-library.com/docs/queries/bytestid"
  ([matcher]
   (.getByTestId screen matcher))
  ([matcher options]
   (.getByTestId screen matcher (clj->js options))))

(defn query-by-role
  "Original documentation:
   - https://testing-library.com/docs/queries/byrole"
  ([matcher]
   (.queryByRole screen matcher))
  ([matcher options]
   (.queryByRole screen matcher (clj->js options))))

(defn query-by-label-text
  "Original documentation:
   - https://testing-library.com/docs/queries/bylabeltext"
  ([matcher]
   (.queryByLabelText screen matcher))
  ([matcher options]
   (.queryByLabelText screen matcher (clj->js options))))

(defn query-by-placeholder-text
  "Original documentation:
   - https://testing-library.com/docs/queries/byplaceholdertext"
  ([matcher]
   (.queryByPlaceholderText screen matcher))
  ([matcher options]
   (.queryByPlaceholderText screen matcher (clj->js options))))

(defn query-by-text
  "Original documentation:
   - https://testing-library.com/docs/queries/bytext"
  ([matcher]
   (.queryByText screen matcher))
  ([matcher options]
   (.queryByText screen matcher (clj->js options))))

(defn query-by-display-value
  "Original documentation:
   - https://testing-library.com/docs/queries/bydisplayvalue"
  ([matcher]
   (.queryByDisplayValue screen matcher))
  ([matcher options]
   (.queryByDisplayValue screen matcher (clj->js options))))

(defn query-by-alt-text
  "Original documentation:
   - https://testing-library.com/docs/queries/byalttext"
  ([matcher]
   (.queryByAltText screen matcher))
  ([matcher options]
   (.queryByAltText screen matcher (clj->js options))))

(defn query-by-title
  "Original documentation:
   - https://testing-library.com/docs/queries/bytitle"
  ([matcher]
   (.queryByTitle screen matcher))
  ([matcher options]
   (.queryByTitle screen matcher (clj->js options))))

(defn query-by-test-id
  "Original documentation:
   - https://testing-library.com/docs/queries/bytestid"
  ([matcher]
   (.queryByTestId screen matcher))
  ([matcher options]
   (.queryByTestId screen matcher (clj->js options))))

(defn find-by-role
  "Original documentation:
   - https://testing-library.com/docs/queries/byrole"
  ([matcher]
   (.findByRole screen matcher))
  ([matcher options]
   (.findByRole screen matcher (clj->js options))))

(defn find-by-label-text
  "Original documentation:
   - https://testing-library.com/docs/queries/bylabeltext"
  ([matcher]
   (.findByLabelText screen matcher))
  ([matcher options]
   (.findByLabelText screen matcher (clj->js options))))

(defn find-by-placeholder-text
  "Original documentation:
   - https://testing-library.com/docs/queries/byplaceholdertext"
  ([matcher]
   (.findByPlaceholderText screen matcher))
  ([matcher options]
   (.findByPlaceholderText screen matcher (clj->js options))))

(defn find-by-text
  "Original documentation:
   - https://testing-library.com/docs/queries/bytext"
  ([matcher]
   (.findByText screen matcher))
  ([matcher options]
   (.findByText screen matcher (clj->js options))))

(defn find-by-display-value
  "Original documentation:
   - https://testing-library.com/docs/queries/bydisplayvalue"
  ([matcher]
   (.findByDisplayValue screen matcher))
  ([matcher options]
   (.findByDisplayValue screen matcher (clj->js options))))

(defn find-by-alt-text
  "Original documentation:
   - https://testing-library.com/docs/queries/byalttext"
  ([matcher]
   (.findByAltText screen matcher))
  ([matcher options]
   (.findByAltText screen matcher (clj->js options))))

(defn find-by-title
  "Original documentation:
   - https://testing-library.com/docs/queries/bytitle"
  ([matcher]
   (.findByTitle screen matcher))
  ([matcher options]
   (.findByTitle screen matcher (clj->js options))))

(defn find-by-test-id
  "Original documentation:
   - https://testing-library.com/docs/queries/bytestid"
  ([matcher]
   (.findByTestId screen matcher))
  ([matcher options]
   (.findByTestId screen matcher (clj->js options))))

(defn get-all-by-role
  "Original documentation:
   - https://testing-library.com/docs/queries/byrole"
  ([matcher]
   (.getAllByRole screen matcher))
  ([matcher options]
   (.getAllByRole screen matcher (clj->js options))))

(defn get-all-by-label-text
  "Original documentation:
   - https://testing-library.com/docs/queries/bylabeltext"
  ([matcher]
   (.getAllByLabelText screen matcher))
  ([matcher options]
   (.getAllByLabelText screen matcher (clj->js options))))

(defn get-all-by-placeholder-text
  "Original documentation:
   - https://testing-library.com/docs/queries/byplaceholdertext"
  ([matcher]
   (.getAllByPlaceholderText screen matcher))
  ([matcher options]
   (.getAllByPlaceholderText screen matcher (clj->js options))))

(defn get-all-by-text
  "Original documentation:
   - https://testing-library.com/docs/queries/bytext"
  ([matcher]
   (.getAllByText screen matcher))
  ([matcher options]
   (.getAllByText screen matcher (clj->js options))))

(defn get-all-by-display-value
  "Original documentation:
   - https://testing-library.com/docs/queries/bydisplayvalue"
  ([matcher]
   (.getAllByDisplayValue screen matcher))
  ([matcher options]
   (.getAllByDisplayValue screen matcher (clj->js options))))

(defn get-all-by-alt-text
  "Original documentation:
   - https://testing-library.com/docs/queries/byalttext"
  ([matcher]
   (.getAllByAltText screen matcher))
  ([matcher options]
   (.getAllByAltText screen matcher (clj->js options))))

(defn get-all-by-title
  "Original documentation:
   - https://testing-library.com/docs/queries/bytitle"
  ([matcher]
   (.getAllByTitle screen matcher))
  ([matcher options]
   (.getAllByTitle screen matcher (clj->js options))))

(defn get-all-by-test-id
  "Original documentation:
   - https://testing-library.com/docs/queries/bytestid"
  ([matcher]
   (.getAllByTestId screen matcher))
  ([matcher options]
   (.getAllByTestId screen matcher (clj->js options))))

(defn query-all-by-role
  "Original documentation:
   - https://testing-library.com/docs/queries/byrole"
  ([matcher]
   (.queryAllByRole screen matcher))
  ([matcher options]
   (.queryAllByRole screen matcher (clj->js options))))

(defn query-all-by-label-text
  "Original documentation:
   - https://testing-library.com/docs/queries/bylabeltext"
  ([matcher]
   (.queryAllByLabelText screen matcher))
  ([matcher options]
   (.queryAllByLabelText screen matcher (clj->js options))))

(defn query-all-by-placeholder-text
  "Original documentation:
   - https://testing-library.com/docs/queries/byplaceholdertext"
  ([matcher]
   (.queryAllByPlaceholderText screen matcher))
  ([matcher options]
   (.queryAllByPlaceholderText screen matcher (clj->js options))))

(defn query-all-by-text
  "Original documentation:
   - https://testing-library.com/docs/queries/bytext"
  ([matcher]
   (.queryAllByText screen matcher))
  ([matcher options]
   (.queryAllByText screen matcher (clj->js options))))

(defn query-all-by-display-value
  "Original documentation:
   - https://testing-library.com/docs/queries/bydisplayvalue"
  ([matcher]
   (.queryAllByDisplayValue screen matcher))
  ([matcher options]
   (.queryAllByDisplayValue screen matcher (clj->js options))))

(defn query-all-by-alt-text
  "Original documentation:
   - https://testing-library.com/docs/queries/byalttext"
  ([matcher]
   (.queryAllByAltText screen matcher))
  ([matcher options]
   (.queryAllByAltText screen matcher (clj->js options))))

(defn query-all-by-title
  "Original documentation:
   - https://testing-library.com/docs/queries/bytitle"
  ([matcher]
   (.queryAllByTitle screen matcher))
  ([matcher options]
   (.queryAllByTitle screen matcher (clj->js options))))

(defn query-all-by-test-id
  "Original documentation:
   - https://testing-library.com/docs/queries/bytestid"
  ([matcher]
   (.queryAllByTestId screen matcher))
  ([matcher options]
   (.queryAllByTestId screen matcher (clj->js options))))

(defn find-all-by-role
  "Original documentation:
   - https://testing-library.com/docs/queries/byrole"
  ([matcher]
   (.findAllByRole screen matcher))
  ([matcher options]
   (.findAllByRole screen matcher (clj->js options))))

(defn find-all-by-label-text
  "Original documentation:
   - https://testing-library.com/docs/queries/bylabeltext"
  ([matcher]
   (.findAllByLabelText screen matcher))
  ([matcher options]
   (.findAllByLabelText screen matcher (clj->js options))))

(defn find-all-by-placeholder-text
  "Original documentation:
   - https://testing-library.com/docs/queries/byplaceholdertext"
  ([matcher]
   (.findAllByPlaceholderText screen matcher))
  ([matcher options]
   (.findAllByPlaceholderText screen matcher (clj->js options))))

(defn find-all-by-text
  "Original documentation:
   - https://testing-library.com/docs/queries/bytext"
  ([matcher]
   (.findAllByText screen matcher))
  ([matcher options]
   (.findAllByText screen matcher (clj->js options))))

(defn find-all-by-display-value
  "Original documentation:
   - https://testing-library.com/docs/queries/bydisplayvalue"
  ([matcher]
   (.findAllByDisplayValue screen matcher))
  ([matcher options]
   (.findAllByDisplayValue screen matcher (clj->js options))))

(defn find-all-by-alt-text
  "Original documentation:
   - https://testing-library.com/docs/queries/byalttext"
  ([matcher]
   (.findAllByAltText screen matcher))
  ([matcher options]
   (.findAllByAltText screen matcher (clj->js options))))

(defn find-all-by-title
  "Original documentation:
   - https://testing-library.com/docs/queries/bytitle"
  ([matcher]
   (.findAllByTitle screen matcher))
  ([matcher options]
   (.findAllByTitle screen matcher (clj->js options))))

(defn find-all-by-test-id
  "Original documentation:
   - https://testing-library.com/docs/queries/bytestid"
  ([matcher]
   (.findAllByTestId screen matcher))
  ([matcher options]
   (.findAllByTestId screen matcher (clj->js options))))
;; End - Generated Code (Do not modify manually)
