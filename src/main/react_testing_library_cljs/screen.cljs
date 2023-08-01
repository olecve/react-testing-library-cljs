(ns react-testing-library-cljs.screen
  (:require
    ["@testing-library/react" :refer [screen]]))

(defn debug
  ([] (.debug screen))
  ([elements] (.debug screen elements)))

;; Refer to https://testing-library.com/docs/queries/about/ for more details about queries
;; Begin - Generated Code (Do not modify manually)
(defn get-by-role
  "0 Matches  - Throw error
  1 Match    - Return element
  >1 Matches - Throw error
  Retry (Async/Await) - No

  Original documentation:
   - https://testing-library.com/docs/queries/byrole"
  ([matcher]
   (.getByRole screen matcher))
  ([matcher options]
   (.getByRole screen matcher (clj->js options))))

(defn get-by-label-text
  "0 Matches  - Throw error
  1 Match    - Return element
  >1 Matches - Throw error
  Retry (Async/Await) - No

  Original documentation:
   - https://testing-library.com/docs/queries/bylabeltext"
  ([matcher]
   (.getByLabelText screen matcher))
  ([matcher options]
   (.getByLabelText screen matcher (clj->js options))))

(defn get-by-placeholder-text
  "0 Matches  - Throw error
  1 Match    - Return element
  >1 Matches - Throw error
  Retry (Async/Await) - No

  Original documentation:
   - https://testing-library.com/docs/queries/byplaceholdertext"
  ([matcher]
   (.getByPlaceholderText screen matcher))
  ([matcher options]
   (.getByPlaceholderText screen matcher (clj->js options))))

(defn get-by-text
  "0 Matches  - Throw error
  1 Match    - Return element
  >1 Matches - Throw error
  Retry (Async/Await) - No

  Original documentation:
   - https://testing-library.com/docs/queries/bytext"
  ([matcher]
   (.getByText screen matcher))
  ([matcher options]
   (.getByText screen matcher (clj->js options))))

(defn get-by-display-value
  "0 Matches  - Throw error
  1 Match    - Return element
  >1 Matches - Throw error
  Retry (Async/Await) - No

  Original documentation:
   - https://testing-library.com/docs/queries/bydisplayvalue"
  ([matcher]
   (.getByDisplayValue screen matcher))
  ([matcher options]
   (.getByDisplayValue screen matcher (clj->js options))))

(defn get-by-alt-text
  "0 Matches  - Throw error
  1 Match    - Return element
  >1 Matches - Throw error
  Retry (Async/Await) - No

  Original documentation:
   - https://testing-library.com/docs/queries/byalttext"
  ([matcher]
   (.getByAltText screen matcher))
  ([matcher options]
   (.getByAltText screen matcher (clj->js options))))

(defn get-by-title
  "0 Matches  - Throw error
  1 Match    - Return element
  >1 Matches - Throw error
  Retry (Async/Await) - No

  Original documentation:
   - https://testing-library.com/docs/queries/bytitle"
  ([matcher]
   (.getByTitle screen matcher))
  ([matcher options]
   (.getByTitle screen matcher (clj->js options))))

(defn get-by-test-id
  "0 Matches  - Throw error
  1 Match    - Return element
  >1 Matches - Throw error
  Retry (Async/Await) - No

  Original documentation:
   - https://testing-library.com/docs/queries/bytestid"
  ([matcher]
   (.getByTestId screen matcher))
  ([matcher options]
   (.getByTestId screen matcher (clj->js options))))

(defn query-by-role
  "0 Matches  - Return null
  1 Match    - Return element
  >1 Matches - Throw error
  Retry (Async/Await) - No

  Original documentation:
   - https://testing-library.com/docs/queries/byrole"
  ([matcher]
   (.queryByRole screen matcher))
  ([matcher options]
   (.queryByRole screen matcher (clj->js options))))

(defn query-by-label-text
  "0 Matches  - Return null
  1 Match    - Return element
  >1 Matches - Throw error
  Retry (Async/Await) - No

  Original documentation:
   - https://testing-library.com/docs/queries/bylabeltext"
  ([matcher]
   (.queryByLabelText screen matcher))
  ([matcher options]
   (.queryByLabelText screen matcher (clj->js options))))

(defn query-by-placeholder-text
  "0 Matches  - Return null
  1 Match    - Return element
  >1 Matches - Throw error
  Retry (Async/Await) - No

  Original documentation:
   - https://testing-library.com/docs/queries/byplaceholdertext"
  ([matcher]
   (.queryByPlaceholderText screen matcher))
  ([matcher options]
   (.queryByPlaceholderText screen matcher (clj->js options))))

(defn query-by-text
  "0 Matches  - Return null
  1 Match    - Return element
  >1 Matches - Throw error
  Retry (Async/Await) - No

  Original documentation:
   - https://testing-library.com/docs/queries/bytext"
  ([matcher]
   (.queryByText screen matcher))
  ([matcher options]
   (.queryByText screen matcher (clj->js options))))

(defn query-by-display-value
  "0 Matches  - Return null
  1 Match    - Return element
  >1 Matches - Throw error
  Retry (Async/Await) - No

  Original documentation:
   - https://testing-library.com/docs/queries/bydisplayvalue"
  ([matcher]
   (.queryByDisplayValue screen matcher))
  ([matcher options]
   (.queryByDisplayValue screen matcher (clj->js options))))

(defn query-by-alt-text
  "0 Matches  - Return null
  1 Match    - Return element
  >1 Matches - Throw error
  Retry (Async/Await) - No

  Original documentation:
   - https://testing-library.com/docs/queries/byalttext"
  ([matcher]
   (.queryByAltText screen matcher))
  ([matcher options]
   (.queryByAltText screen matcher (clj->js options))))

(defn query-by-title
  "0 Matches  - Return null
  1 Match    - Return element
  >1 Matches - Throw error
  Retry (Async/Await) - No

  Original documentation:
   - https://testing-library.com/docs/queries/bytitle"
  ([matcher]
   (.queryByTitle screen matcher))
  ([matcher options]
   (.queryByTitle screen matcher (clj->js options))))

(defn query-by-test-id
  "0 Matches  - Return null
  1 Match    - Return element
  >1 Matches - Throw error
  Retry (Async/Await) - No

  Original documentation:
   - https://testing-library.com/docs/queries/bytestid"
  ([matcher]
   (.queryByTestId screen matcher))
  ([matcher options]
   (.queryByTestId screen matcher (clj->js options))))

(defn find-by-role
  "0 Matches  - Throw error
  1 Match    - Return element
  >1 Matches - Throw error
  Retry (Async/Await) - Yes

  Original documentation:
   - https://testing-library.com/docs/queries/byrole"
  ([matcher]
   (.findByRole screen matcher))
  ([matcher options]
   (.findByRole screen matcher (clj->js options))))

(defn find-by-label-text
  "0 Matches  - Throw error
  1 Match    - Return element
  >1 Matches - Throw error
  Retry (Async/Await) - Yes

  Original documentation:
   - https://testing-library.com/docs/queries/bylabeltext"
  ([matcher]
   (.findByLabelText screen matcher))
  ([matcher options]
   (.findByLabelText screen matcher (clj->js options))))

(defn find-by-placeholder-text
  "0 Matches  - Throw error
  1 Match    - Return element
  >1 Matches - Throw error
  Retry (Async/Await) - Yes

  Original documentation:
   - https://testing-library.com/docs/queries/byplaceholdertext"
  ([matcher]
   (.findByPlaceholderText screen matcher))
  ([matcher options]
   (.findByPlaceholderText screen matcher (clj->js options))))

(defn find-by-text
  "0 Matches  - Throw error
  1 Match    - Return element
  >1 Matches - Throw error
  Retry (Async/Await) - Yes

  Original documentation:
   - https://testing-library.com/docs/queries/bytext"
  ([matcher]
   (.findByText screen matcher))
  ([matcher options]
   (.findByText screen matcher (clj->js options))))

(defn find-by-display-value
  "0 Matches  - Throw error
  1 Match    - Return element
  >1 Matches - Throw error
  Retry (Async/Await) - Yes

  Original documentation:
   - https://testing-library.com/docs/queries/bydisplayvalue"
  ([matcher]
   (.findByDisplayValue screen matcher))
  ([matcher options]
   (.findByDisplayValue screen matcher (clj->js options))))

(defn find-by-alt-text
  "0 Matches  - Throw error
  1 Match    - Return element
  >1 Matches - Throw error
  Retry (Async/Await) - Yes

  Original documentation:
   - https://testing-library.com/docs/queries/byalttext"
  ([matcher]
   (.findByAltText screen matcher))
  ([matcher options]
   (.findByAltText screen matcher (clj->js options))))

(defn find-by-title
  "0 Matches  - Throw error
  1 Match    - Return element
  >1 Matches - Throw error
  Retry (Async/Await) - Yes

  Original documentation:
   - https://testing-library.com/docs/queries/bytitle"
  ([matcher]
   (.findByTitle screen matcher))
  ([matcher options]
   (.findByTitle screen matcher (clj->js options))))

(defn find-by-test-id
  "0 Matches  - Throw error
  1 Match    - Return element
  >1 Matches - Throw error
  Retry (Async/Await) - Yes

  Original documentation:
   - https://testing-library.com/docs/queries/bytestid"
  ([matcher]
   (.findByTestId screen matcher))
  ([matcher options]
   (.findByTestId screen matcher (clj->js options))))

(defn get-all-by-role
  "0 Matches  - Throw error
  1 Match    - Return array
  >1 Matches - Return array
  Retry (Async/Await) - No

  Original documentation:
   - https://testing-library.com/docs/queries/byrole"
  ([matcher]
   (vec (.getAllByRole screen matcher)))
  ([matcher options]
   (vec (.getAllByRole screen matcher (clj->js options)))))

(defn get-all-by-label-text
  "0 Matches  - Throw error
  1 Match    - Return array
  >1 Matches - Return array
  Retry (Async/Await) - No

  Original documentation:
   - https://testing-library.com/docs/queries/bylabeltext"
  ([matcher]
   (vec (.getAllByLabelText screen matcher)))
  ([matcher options]
   (vec (.getAllByLabelText screen matcher (clj->js options)))))

(defn get-all-by-placeholder-text
  "0 Matches  - Throw error
  1 Match    - Return array
  >1 Matches - Return array
  Retry (Async/Await) - No

  Original documentation:
   - https://testing-library.com/docs/queries/byplaceholdertext"
  ([matcher]
   (vec (.getAllByPlaceholderText screen matcher)))
  ([matcher options]
   (vec (.getAllByPlaceholderText screen matcher (clj->js options)))))

(defn get-all-by-text
  "0 Matches  - Throw error
  1 Match    - Return array
  >1 Matches - Return array
  Retry (Async/Await) - No

  Original documentation:
   - https://testing-library.com/docs/queries/bytext"
  ([matcher]
   (vec (.getAllByText screen matcher)))
  ([matcher options]
   (vec (.getAllByText screen matcher (clj->js options)))))

(defn get-all-by-display-value
  "0 Matches  - Throw error
  1 Match    - Return array
  >1 Matches - Return array
  Retry (Async/Await) - No

  Original documentation:
   - https://testing-library.com/docs/queries/bydisplayvalue"
  ([matcher]
   (vec (.getAllByDisplayValue screen matcher)))
  ([matcher options]
   (vec (.getAllByDisplayValue screen matcher (clj->js options)))))

(defn get-all-by-alt-text
  "0 Matches  - Throw error
  1 Match    - Return array
  >1 Matches - Return array
  Retry (Async/Await) - No

  Original documentation:
   - https://testing-library.com/docs/queries/byalttext"
  ([matcher]
   (vec (.getAllByAltText screen matcher)))
  ([matcher options]
   (vec (.getAllByAltText screen matcher (clj->js options)))))

(defn get-all-by-title
  "0 Matches  - Throw error
  1 Match    - Return array
  >1 Matches - Return array
  Retry (Async/Await) - No

  Original documentation:
   - https://testing-library.com/docs/queries/bytitle"
  ([matcher]
   (vec (.getAllByTitle screen matcher)))
  ([matcher options]
   (vec (.getAllByTitle screen matcher (clj->js options)))))

(defn get-all-by-test-id
  "0 Matches  - Throw error
  1 Match    - Return array
  >1 Matches - Return array
  Retry (Async/Await) - No

  Original documentation:
   - https://testing-library.com/docs/queries/bytestid"
  ([matcher]
   (vec (.getAllByTestId screen matcher)))
  ([matcher options]
   (vec (.getAllByTestId screen matcher (clj->js options)))))

(defn query-all-by-role
  "0 Matches  - Return []
  1 Match    - Return array
  >1 Matches - Return array
  Retry (Async/Await) - No

  Original documentation:
   - https://testing-library.com/docs/queries/byrole"
  ([matcher]
   (vec (.queryAllByRole screen matcher)))
  ([matcher options]
   (vec (.queryAllByRole screen matcher (clj->js options)))))

(defn query-all-by-label-text
  "0 Matches  - Return []
  1 Match    - Return array
  >1 Matches - Return array
  Retry (Async/Await) - No

  Original documentation:
   - https://testing-library.com/docs/queries/bylabeltext"
  ([matcher]
   (vec (.queryAllByLabelText screen matcher)))
  ([matcher options]
   (vec (.queryAllByLabelText screen matcher (clj->js options)))))

(defn query-all-by-placeholder-text
  "0 Matches  - Return []
  1 Match    - Return array
  >1 Matches - Return array
  Retry (Async/Await) - No

  Original documentation:
   - https://testing-library.com/docs/queries/byplaceholdertext"
  ([matcher]
   (vec (.queryAllByPlaceholderText screen matcher)))
  ([matcher options]
   (vec (.queryAllByPlaceholderText screen matcher (clj->js options)))))

(defn query-all-by-text
  "0 Matches  - Return []
  1 Match    - Return array
  >1 Matches - Return array
  Retry (Async/Await) - No

  Original documentation:
   - https://testing-library.com/docs/queries/bytext"
  ([matcher]
   (vec (.queryAllByText screen matcher)))
  ([matcher options]
   (vec (.queryAllByText screen matcher (clj->js options)))))

(defn query-all-by-display-value
  "0 Matches  - Return []
  1 Match    - Return array
  >1 Matches - Return array
  Retry (Async/Await) - No

  Original documentation:
   - https://testing-library.com/docs/queries/bydisplayvalue"
  ([matcher]
   (vec (.queryAllByDisplayValue screen matcher)))
  ([matcher options]
   (vec (.queryAllByDisplayValue screen matcher (clj->js options)))))

(defn query-all-by-alt-text
  "0 Matches  - Return []
  1 Match    - Return array
  >1 Matches - Return array
  Retry (Async/Await) - No

  Original documentation:
   - https://testing-library.com/docs/queries/byalttext"
  ([matcher]
   (vec (.queryAllByAltText screen matcher)))
  ([matcher options]
   (vec (.queryAllByAltText screen matcher (clj->js options)))))

(defn query-all-by-title
  "0 Matches  - Return []
  1 Match    - Return array
  >1 Matches - Return array
  Retry (Async/Await) - No

  Original documentation:
   - https://testing-library.com/docs/queries/bytitle"
  ([matcher]
   (vec (.queryAllByTitle screen matcher)))
  ([matcher options]
   (vec (.queryAllByTitle screen matcher (clj->js options)))))

(defn query-all-by-test-id
  "0 Matches  - Return []
  1 Match    - Return array
  >1 Matches - Return array
  Retry (Async/Await) - No

  Original documentation:
   - https://testing-library.com/docs/queries/bytestid"
  ([matcher]
   (vec (.queryAllByTestId screen matcher)))
  ([matcher options]
   (vec (.queryAllByTestId screen matcher (clj->js options)))))

(defn find-all-by-role
  "0 Matches  - Return []
  1 Match    - Throw error
  >1 Matches - Return array
  Retry (Async/Await) - Yes

  Original documentation:
   - https://testing-library.com/docs/queries/byrole"
  ([matcher]
   (vec (.findAllByRole screen matcher)))
  ([matcher options]
   (vec (.findAllByRole screen matcher (clj->js options)))))

(defn find-all-by-label-text
  "0 Matches  - Return []
  1 Match    - Throw error
  >1 Matches - Return array
  Retry (Async/Await) - Yes

  Original documentation:
   - https://testing-library.com/docs/queries/bylabeltext"
  ([matcher]
   (vec (.findAllByLabelText screen matcher)))
  ([matcher options]
   (vec (.findAllByLabelText screen matcher (clj->js options)))))

(defn find-all-by-placeholder-text
  "0 Matches  - Return []
  1 Match    - Throw error
  >1 Matches - Return array
  Retry (Async/Await) - Yes

  Original documentation:
   - https://testing-library.com/docs/queries/byplaceholdertext"
  ([matcher]
   (vec (.findAllByPlaceholderText screen matcher)))
  ([matcher options]
   (vec (.findAllByPlaceholderText screen matcher (clj->js options)))))

(defn find-all-by-text
  "0 Matches  - Return []
  1 Match    - Throw error
  >1 Matches - Return array
  Retry (Async/Await) - Yes

  Original documentation:
   - https://testing-library.com/docs/queries/bytext"
  ([matcher]
   (vec (.findAllByText screen matcher)))
  ([matcher options]
   (vec (.findAllByText screen matcher (clj->js options)))))

(defn find-all-by-display-value
  "0 Matches  - Return []
  1 Match    - Throw error
  >1 Matches - Return array
  Retry (Async/Await) - Yes

  Original documentation:
   - https://testing-library.com/docs/queries/bydisplayvalue"
  ([matcher]
   (vec (.findAllByDisplayValue screen matcher)))
  ([matcher options]
   (vec (.findAllByDisplayValue screen matcher (clj->js options)))))

(defn find-all-by-alt-text
  "0 Matches  - Return []
  1 Match    - Throw error
  >1 Matches - Return array
  Retry (Async/Await) - Yes

  Original documentation:
   - https://testing-library.com/docs/queries/byalttext"
  ([matcher]
   (vec (.findAllByAltText screen matcher)))
  ([matcher options]
   (vec (.findAllByAltText screen matcher (clj->js options)))))

(defn find-all-by-title
  "0 Matches  - Return []
  1 Match    - Throw error
  >1 Matches - Return array
  Retry (Async/Await) - Yes

  Original documentation:
   - https://testing-library.com/docs/queries/bytitle"
  ([matcher]
   (vec (.findAllByTitle screen matcher)))
  ([matcher options]
   (vec (.findAllByTitle screen matcher (clj->js options)))))

(defn find-all-by-test-id
  "0 Matches  - Return []
  1 Match    - Throw error
  >1 Matches - Return array
  Retry (Async/Await) - Yes

  Original documentation:
   - https://testing-library.com/docs/queries/bytestid"
  ([matcher]
   (vec (.findAllByTestId screen matcher)))
  ([matcher options]
   (vec (.findAllByTestId screen matcher (clj->js options)))))
;; End - Generated Code (Do not modify manually)
