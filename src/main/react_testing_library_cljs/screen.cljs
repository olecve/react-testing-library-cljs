(ns react-testing-library-cljs.screen
  (:require
   ["@testing-library/react" :refer [screen]]))

(defn debug
  ([] (.debug screen))
  ([elements] (.debug screen elements)))

;; Refer to https://testing-library.com/docs/queries/about/ for more details about queries
;; Begin - Generated Code (Do not modify manually)
(defn get-by-role
  "Returns the matching element for a query.

  Throws a descriptive error if no elements match or if more than one match is found.
  Use `get-all-by` instead if more than one element is expected.

  - No match: Throws error
  - One match: Returns element
  - Multiple match: Throws error
  - Async: No

  See [getByRole](https://testing-library.com/docs/queries/byrole)."
  ([matcher]
   (.getByRole screen matcher))
  ([matcher options]
   (.getByRole screen matcher (clj->js options))))

(defn get-by-label-text
  "Returns the matching element for a query.

  Throws a descriptive error if no elements match or if more than one match is found.
  Use `get-all-by` instead if more than one element is expected.

  - No match: Throws error
  - One match: Returns element
  - Multiple match: Throws error
  - Async: No

  See [getByLabelText](https://testing-library.com/docs/queries/bylabeltext)."
  ([matcher]
   (.getByLabelText screen matcher))
  ([matcher options]
   (.getByLabelText screen matcher (clj->js options))))

(defn get-by-placeholder-text
  "Returns the matching element for a query.

  Throws a descriptive error if no elements match or if more than one match is found.
  Use `get-all-by` instead if more than one element is expected.

  - No match: Throws error
  - One match: Returns element
  - Multiple match: Throws error
  - Async: No

  See [getByPlaceholderText](https://testing-library.com/docs/queries/byplaceholdertext)."
  ([matcher]
   (.getByPlaceholderText screen matcher))
  ([matcher options]
   (.getByPlaceholderText screen matcher (clj->js options))))

(defn get-by-text
  "Returns the matching element for a query.

  Throws a descriptive error if no elements match or if more than one match is found.
  Use `get-all-by` instead if more than one element is expected.

  - No match: Throws error
  - One match: Returns element
  - Multiple match: Throws error
  - Async: No

  See [getByText](https://testing-library.com/docs/queries/bytext)."
  ([matcher]
   (.getByText screen matcher))
  ([matcher options]
   (.getByText screen matcher (clj->js options))))

(defn get-by-display-value
  "Returns the matching element for a query.

  Throws a descriptive error if no elements match or if more than one match is found.
  Use `get-all-by` instead if more than one element is expected.

  - No match: Throws error
  - One match: Returns element
  - Multiple match: Throws error
  - Async: No

  See [getByDisplayValue](https://testing-library.com/docs/queries/bydisplayvalue)."
  ([matcher]
   (.getByDisplayValue screen matcher))
  ([matcher options]
   (.getByDisplayValue screen matcher (clj->js options))))

(defn get-by-alt-text
  "Returns the matching element for a query.

  Throws a descriptive error if no elements match or if more than one match is found.
  Use `get-all-by` instead if more than one element is expected.

  - No match: Throws error
  - One match: Returns element
  - Multiple match: Throws error
  - Async: No

  See [getByAltText](https://testing-library.com/docs/queries/byalttext)."
  ([matcher]
   (.getByAltText screen matcher))
  ([matcher options]
   (.getByAltText screen matcher (clj->js options))))

(defn get-by-title
  "Returns the matching element for a query.

  Throws a descriptive error if no elements match or if more than one match is found.
  Use `get-all-by` instead if more than one element is expected.

  - No match: Throws error
  - One match: Returns element
  - Multiple match: Throws error
  - Async: No

  See [getByTitle](https://testing-library.com/docs/queries/bytitle)."
  ([matcher]
   (.getByTitle screen matcher))
  ([matcher options]
   (.getByTitle screen matcher (clj->js options))))

(defn get-by-test-id
  "Returns the matching element for a query.

  Throws a descriptive error if no elements match or if more than one match is found.
  Use `get-all-by` instead if more than one element is expected.

  - No match: Throws error
  - One match: Returns element
  - Multiple match: Throws error
  - Async: No

  See [getByTestId](https://testing-library.com/docs/queries/bytestid)."
  ([matcher]
   (.getByTestId screen matcher))
  ([matcher options]
   (.getByTestId screen matcher (clj->js options))))

(defn query-by-role
  "Returns the matching element for a query, or `nil` if no elements match.

  Useful for asserting an element that is not present. Throws an error if more than one
  match is found. Use `query-all-by` instead if this is OK.

  - No match: Returns nil
  - One match: Returns element
  - Multiple match: Throws error
  - Async: No

  See [queryByRole](https://testing-library.com/docs/queries/byrole)."
  ([matcher]
   (.queryByRole screen matcher))
  ([matcher options]
   (.queryByRole screen matcher (clj->js options))))

(defn query-by-label-text
  "Returns the matching element for a query, or `nil` if no elements match.

  Useful for asserting an element that is not present. Throws an error if more than one
  match is found. Use `query-all-by` instead if this is OK.

  - No match: Returns nil
  - One match: Returns element
  - Multiple match: Throws error
  - Async: No

  See [queryByLabelText](https://testing-library.com/docs/queries/bylabeltext)."
  ([matcher]
   (.queryByLabelText screen matcher))
  ([matcher options]
   (.queryByLabelText screen matcher (clj->js options))))

(defn query-by-placeholder-text
  "Returns the matching element for a query, or `nil` if no elements match.

  Useful for asserting an element that is not present. Throws an error if more than one
  match is found. Use `query-all-by` instead if this is OK.

  - No match: Returns nil
  - One match: Returns element
  - Multiple match: Throws error
  - Async: No

  See [queryByPlaceholderText](https://testing-library.com/docs/queries/byplaceholdertext)."
  ([matcher]
   (.queryByPlaceholderText screen matcher))
  ([matcher options]
   (.queryByPlaceholderText screen matcher (clj->js options))))

(defn query-by-text
  "Returns the matching element for a query, or `nil` if no elements match.

  Useful for asserting an element that is not present. Throws an error if more than one
  match is found. Use `query-all-by` instead if this is OK.

  - No match: Returns nil
  - One match: Returns element
  - Multiple match: Throws error
  - Async: No

  See [queryByText](https://testing-library.com/docs/queries/bytext)."
  ([matcher]
   (.queryByText screen matcher))
  ([matcher options]
   (.queryByText screen matcher (clj->js options))))

(defn query-by-display-value
  "Returns the matching element for a query, or `nil` if no elements match.

  Useful for asserting an element that is not present. Throws an error if more than one
  match is found. Use `query-all-by` instead if this is OK.

  - No match: Returns nil
  - One match: Returns element
  - Multiple match: Throws error
  - Async: No

  See [queryByDisplayValue](https://testing-library.com/docs/queries/bydisplayvalue)."
  ([matcher]
   (.queryByDisplayValue screen matcher))
  ([matcher options]
   (.queryByDisplayValue screen matcher (clj->js options))))

(defn query-by-alt-text
  "Returns the matching element for a query, or `nil` if no elements match.

  Useful for asserting an element that is not present. Throws an error if more than one
  match is found. Use `query-all-by` instead if this is OK.

  - No match: Returns nil
  - One match: Returns element
  - Multiple match: Throws error
  - Async: No

  See [queryByAltText](https://testing-library.com/docs/queries/byalttext)."
  ([matcher]
   (.queryByAltText screen matcher))
  ([matcher options]
   (.queryByAltText screen matcher (clj->js options))))

(defn query-by-title
  "Returns the matching element for a query, or `nil` if no elements match.

  Useful for asserting an element that is not present. Throws an error if more than one
  match is found. Use `query-all-by` instead if this is OK.

  - No match: Returns nil
  - One match: Returns element
  - Multiple match: Throws error
  - Async: No

  See [queryByTitle](https://testing-library.com/docs/queries/bytitle)."
  ([matcher]
   (.queryByTitle screen matcher))
  ([matcher options]
   (.queryByTitle screen matcher (clj->js options))))

(defn query-by-test-id
  "Returns the matching element for a query, or `nil` if no elements match.

  Useful for asserting an element that is not present. Throws an error if more than one
  match is found. Use `query-all-by` instead if this is OK.

  - No match: Returns nil
  - One match: Returns element
  - Multiple match: Throws error
  - Async: No

  See [queryByTestId](https://testing-library.com/docs/queries/bytestid)."
  ([matcher]
   (.queryByTestId screen matcher))
  ([matcher options]
   (.queryByTestId screen matcher (clj->js options))))

(defn find-by-role
  "Returns a promise which resolves when a matching element is found.

  The promise is rejected if no element is found or if more than one element is found
  after a default timeout of 1000ms. If you need to find more than one element, use
  `find-all-by`. This is a combination of `get-by` queries and `waitFor`.

  - No match: Rejects
  - One match: Resolves with element
  - Multiple match: Rejects
  - Async: Yes

  See [findByRole](https://testing-library.com/docs/queries/byrole)."
  ([matcher]
   (.findByRole screen matcher))
  ([matcher options]
   (.findByRole screen matcher (clj->js options))))

(defn find-by-label-text
  "Returns a promise which resolves when a matching element is found.

  The promise is rejected if no element is found or if more than one element is found
  after a default timeout of 1000ms. If you need to find more than one element, use
  `find-all-by`. This is a combination of `get-by` queries and `waitFor`.

  - No match: Rejects
  - One match: Resolves with element
  - Multiple match: Rejects
  - Async: Yes

  See [findByLabelText](https://testing-library.com/docs/queries/bylabeltext)."
  ([matcher]
   (.findByLabelText screen matcher))
  ([matcher options]
   (.findByLabelText screen matcher (clj->js options))))

(defn find-by-placeholder-text
  "Returns a promise which resolves when a matching element is found.

  The promise is rejected if no element is found or if more than one element is found
  after a default timeout of 1000ms. If you need to find more than one element, use
  `find-all-by`. This is a combination of `get-by` queries and `waitFor`.

  - No match: Rejects
  - One match: Resolves with element
  - Multiple match: Rejects
  - Async: Yes

  See [findByPlaceholderText](https://testing-library.com/docs/queries/byplaceholdertext)."
  ([matcher]
   (.findByPlaceholderText screen matcher))
  ([matcher options]
   (.findByPlaceholderText screen matcher (clj->js options))))

(defn find-by-text
  "Returns a promise which resolves when a matching element is found.

  The promise is rejected if no element is found or if more than one element is found
  after a default timeout of 1000ms. If you need to find more than one element, use
  `find-all-by`. This is a combination of `get-by` queries and `waitFor`.

  - No match: Rejects
  - One match: Resolves with element
  - Multiple match: Rejects
  - Async: Yes

  See [findByText](https://testing-library.com/docs/queries/bytext)."
  ([matcher]
   (.findByText screen matcher))
  ([matcher options]
   (.findByText screen matcher (clj->js options))))

(defn find-by-display-value
  "Returns a promise which resolves when a matching element is found.

  The promise is rejected if no element is found or if more than one element is found
  after a default timeout of 1000ms. If you need to find more than one element, use
  `find-all-by`. This is a combination of `get-by` queries and `waitFor`.

  - No match: Rejects
  - One match: Resolves with element
  - Multiple match: Rejects
  - Async: Yes

  See [findByDisplayValue](https://testing-library.com/docs/queries/bydisplayvalue)."
  ([matcher]
   (.findByDisplayValue screen matcher))
  ([matcher options]
   (.findByDisplayValue screen matcher (clj->js options))))

(defn find-by-alt-text
  "Returns a promise which resolves when a matching element is found.

  The promise is rejected if no element is found or if more than one element is found
  after a default timeout of 1000ms. If you need to find more than one element, use
  `find-all-by`. This is a combination of `get-by` queries and `waitFor`.

  - No match: Rejects
  - One match: Resolves with element
  - Multiple match: Rejects
  - Async: Yes

  See [findByAltText](https://testing-library.com/docs/queries/byalttext)."
  ([matcher]
   (.findByAltText screen matcher))
  ([matcher options]
   (.findByAltText screen matcher (clj->js options))))

(defn find-by-title
  "Returns a promise which resolves when a matching element is found.

  The promise is rejected if no element is found or if more than one element is found
  after a default timeout of 1000ms. If you need to find more than one element, use
  `find-all-by`. This is a combination of `get-by` queries and `waitFor`.

  - No match: Rejects
  - One match: Resolves with element
  - Multiple match: Rejects
  - Async: Yes

  See [findByTitle](https://testing-library.com/docs/queries/bytitle)."
  ([matcher]
   (.findByTitle screen matcher))
  ([matcher options]
   (.findByTitle screen matcher (clj->js options))))

(defn find-by-test-id
  "Returns a promise which resolves when a matching element is found.

  The promise is rejected if no element is found or if more than one element is found
  after a default timeout of 1000ms. If you need to find more than one element, use
  `find-all-by`. This is a combination of `get-by` queries and `waitFor`.

  - No match: Rejects
  - One match: Resolves with element
  - Multiple match: Rejects
  - Async: Yes

  See [findByTestId](https://testing-library.com/docs/queries/bytestid)."
  ([matcher]
   (.findByTestId screen matcher))
  ([matcher options]
   (.findByTestId screen matcher (clj->js options))))

(defn get-all-by-role
  "Returns a vector of all matching elements for a query.

  Throws an error if no elements match.

  - No match: Throws error
  - One match: Returns vector
  - Multiple match: Returns vector
  - Async: No

  See [getAllByRole](https://testing-library.com/docs/queries/byrole)."
  ([matcher]
   (vec (.getAllByRole screen matcher)))
  ([matcher options]
   (vec (.getAllByRole screen matcher (clj->js options)))))

(defn get-all-by-label-text
  "Returns a vector of all matching elements for a query.

  Throws an error if no elements match.

  - No match: Throws error
  - One match: Returns vector
  - Multiple match: Returns vector
  - Async: No

  See [getAllByLabelText](https://testing-library.com/docs/queries/bylabeltext)."
  ([matcher]
   (vec (.getAllByLabelText screen matcher)))
  ([matcher options]
   (vec (.getAllByLabelText screen matcher (clj->js options)))))

(defn get-all-by-placeholder-text
  "Returns a vector of all matching elements for a query.

  Throws an error if no elements match.

  - No match: Throws error
  - One match: Returns vector
  - Multiple match: Returns vector
  - Async: No

  See [getAllByPlaceholderText](https://testing-library.com/docs/queries/byplaceholdertext)."
  ([matcher]
   (vec (.getAllByPlaceholderText screen matcher)))
  ([matcher options]
   (vec (.getAllByPlaceholderText screen matcher (clj->js options)))))

(defn get-all-by-text
  "Returns a vector of all matching elements for a query.

  Throws an error if no elements match.

  - No match: Throws error
  - One match: Returns vector
  - Multiple match: Returns vector
  - Async: No

  See [getAllByText](https://testing-library.com/docs/queries/bytext)."
  ([matcher]
   (vec (.getAllByText screen matcher)))
  ([matcher options]
   (vec (.getAllByText screen matcher (clj->js options)))))

(defn get-all-by-display-value
  "Returns a vector of all matching elements for a query.

  Throws an error if no elements match.

  - No match: Throws error
  - One match: Returns vector
  - Multiple match: Returns vector
  - Async: No

  See [getAllByDisplayValue](https://testing-library.com/docs/queries/bydisplayvalue)."
  ([matcher]
   (vec (.getAllByDisplayValue screen matcher)))
  ([matcher options]
   (vec (.getAllByDisplayValue screen matcher (clj->js options)))))

(defn get-all-by-alt-text
  "Returns a vector of all matching elements for a query.

  Throws an error if no elements match.

  - No match: Throws error
  - One match: Returns vector
  - Multiple match: Returns vector
  - Async: No

  See [getAllByAltText](https://testing-library.com/docs/queries/byalttext)."
  ([matcher]
   (vec (.getAllByAltText screen matcher)))
  ([matcher options]
   (vec (.getAllByAltText screen matcher (clj->js options)))))

(defn get-all-by-title
  "Returns a vector of all matching elements for a query.

  Throws an error if no elements match.

  - No match: Throws error
  - One match: Returns vector
  - Multiple match: Returns vector
  - Async: No

  See [getAllByTitle](https://testing-library.com/docs/queries/bytitle)."
  ([matcher]
   (vec (.getAllByTitle screen matcher)))
  ([matcher options]
   (vec (.getAllByTitle screen matcher (clj->js options)))))

(defn get-all-by-test-id
  "Returns a vector of all matching elements for a query.

  Throws an error if no elements match.

  - No match: Throws error
  - One match: Returns vector
  - Multiple match: Returns vector
  - Async: No

  See [getAllByTestId](https://testing-library.com/docs/queries/bytestid)."
  ([matcher]
   (vec (.getAllByTestId screen matcher)))
  ([matcher options]
   (vec (.getAllByTestId screen matcher (clj->js options)))))

(defn query-all-by-role
  "Returns a vector of all matching elements for a query.

  Returns an empty vector if no elements match.

  - No match: Returns []
  - One match: Returns vector
  - Multiple match: Returns vector
  - Async: No

  See [queryAllByRole](https://testing-library.com/docs/queries/byrole)."
  ([matcher]
   (vec (.queryAllByRole screen matcher)))
  ([matcher options]
   (vec (.queryAllByRole screen matcher (clj->js options)))))

(defn query-all-by-label-text
  "Returns a vector of all matching elements for a query.

  Returns an empty vector if no elements match.

  - No match: Returns []
  - One match: Returns vector
  - Multiple match: Returns vector
  - Async: No

  See [queryAllByLabelText](https://testing-library.com/docs/queries/bylabeltext)."
  ([matcher]
   (vec (.queryAllByLabelText screen matcher)))
  ([matcher options]
   (vec (.queryAllByLabelText screen matcher (clj->js options)))))

(defn query-all-by-placeholder-text
  "Returns a vector of all matching elements for a query.

  Returns an empty vector if no elements match.

  - No match: Returns []
  - One match: Returns vector
  - Multiple match: Returns vector
  - Async: No

  See [queryAllByPlaceholderText](https://testing-library.com/docs/queries/byplaceholdertext)."
  ([matcher]
   (vec (.queryAllByPlaceholderText screen matcher)))
  ([matcher options]
   (vec (.queryAllByPlaceholderText screen matcher (clj->js options)))))

(defn query-all-by-text
  "Returns a vector of all matching elements for a query.

  Returns an empty vector if no elements match.

  - No match: Returns []
  - One match: Returns vector
  - Multiple match: Returns vector
  - Async: No

  See [queryAllByText](https://testing-library.com/docs/queries/bytext)."
  ([matcher]
   (vec (.queryAllByText screen matcher)))
  ([matcher options]
   (vec (.queryAllByText screen matcher (clj->js options)))))

(defn query-all-by-display-value
  "Returns a vector of all matching elements for a query.

  Returns an empty vector if no elements match.

  - No match: Returns []
  - One match: Returns vector
  - Multiple match: Returns vector
  - Async: No

  See [queryAllByDisplayValue](https://testing-library.com/docs/queries/bydisplayvalue)."
  ([matcher]
   (vec (.queryAllByDisplayValue screen matcher)))
  ([matcher options]
   (vec (.queryAllByDisplayValue screen matcher (clj->js options)))))

(defn query-all-by-alt-text
  "Returns a vector of all matching elements for a query.

  Returns an empty vector if no elements match.

  - No match: Returns []
  - One match: Returns vector
  - Multiple match: Returns vector
  - Async: No

  See [queryAllByAltText](https://testing-library.com/docs/queries/byalttext)."
  ([matcher]
   (vec (.queryAllByAltText screen matcher)))
  ([matcher options]
   (vec (.queryAllByAltText screen matcher (clj->js options)))))

(defn query-all-by-title
  "Returns a vector of all matching elements for a query.

  Returns an empty vector if no elements match.

  - No match: Returns []
  - One match: Returns vector
  - Multiple match: Returns vector
  - Async: No

  See [queryAllByTitle](https://testing-library.com/docs/queries/bytitle)."
  ([matcher]
   (vec (.queryAllByTitle screen matcher)))
  ([matcher options]
   (vec (.queryAllByTitle screen matcher (clj->js options)))))

(defn query-all-by-test-id
  "Returns a vector of all matching elements for a query.

  Returns an empty vector if no elements match.

  - No match: Returns []
  - One match: Returns vector
  - Multiple match: Returns vector
  - Async: No

  See [queryAllByTestId](https://testing-library.com/docs/queries/bytestid)."
  ([matcher]
   (vec (.queryAllByTestId screen matcher)))
  ([matcher options]
   (vec (.queryAllByTestId screen matcher (clj->js options)))))

(defn find-all-by-role
  "Returns a promise which resolves to a vector of matching elements.

  The promise is rejected if no elements are found after a default timeout of 1000ms.
  This is a combination of `get-all-by` queries and `waitFor`.

  - No match: Rejects
  - One match: Resolves with vector
  - Multiple match: Resolves with vector
  - Async: Yes

  See [findAllByRole](https://testing-library.com/docs/queries/byrole)."
  ([matcher]
   (vec (.findAllByRole screen matcher)))
  ([matcher options]
   (vec (.findAllByRole screen matcher (clj->js options)))))

(defn find-all-by-label-text
  "Returns a promise which resolves to a vector of matching elements.

  The promise is rejected if no elements are found after a default timeout of 1000ms.
  This is a combination of `get-all-by` queries and `waitFor`.

  - No match: Rejects
  - One match: Resolves with vector
  - Multiple match: Resolves with vector
  - Async: Yes

  See [findAllByLabelText](https://testing-library.com/docs/queries/bylabeltext)."
  ([matcher]
   (vec (.findAllByLabelText screen matcher)))
  ([matcher options]
   (vec (.findAllByLabelText screen matcher (clj->js options)))))

(defn find-all-by-placeholder-text
  "Returns a promise which resolves to a vector of matching elements.

  The promise is rejected if no elements are found after a default timeout of 1000ms.
  This is a combination of `get-all-by` queries and `waitFor`.

  - No match: Rejects
  - One match: Resolves with vector
  - Multiple match: Resolves with vector
  - Async: Yes

  See [findAllByPlaceholderText](https://testing-library.com/docs/queries/byplaceholdertext)."
  ([matcher]
   (vec (.findAllByPlaceholderText screen matcher)))
  ([matcher options]
   (vec (.findAllByPlaceholderText screen matcher (clj->js options)))))

(defn find-all-by-text
  "Returns a promise which resolves to a vector of matching elements.

  The promise is rejected if no elements are found after a default timeout of 1000ms.
  This is a combination of `get-all-by` queries and `waitFor`.

  - No match: Rejects
  - One match: Resolves with vector
  - Multiple match: Resolves with vector
  - Async: Yes

  See [findAllByText](https://testing-library.com/docs/queries/bytext)."
  ([matcher]
   (vec (.findAllByText screen matcher)))
  ([matcher options]
   (vec (.findAllByText screen matcher (clj->js options)))))

(defn find-all-by-display-value
  "Returns a promise which resolves to a vector of matching elements.

  The promise is rejected if no elements are found after a default timeout of 1000ms.
  This is a combination of `get-all-by` queries and `waitFor`.

  - No match: Rejects
  - One match: Resolves with vector
  - Multiple match: Resolves with vector
  - Async: Yes

  See [findAllByDisplayValue](https://testing-library.com/docs/queries/bydisplayvalue)."
  ([matcher]
   (vec (.findAllByDisplayValue screen matcher)))
  ([matcher options]
   (vec (.findAllByDisplayValue screen matcher (clj->js options)))))

(defn find-all-by-alt-text
  "Returns a promise which resolves to a vector of matching elements.

  The promise is rejected if no elements are found after a default timeout of 1000ms.
  This is a combination of `get-all-by` queries and `waitFor`.

  - No match: Rejects
  - One match: Resolves with vector
  - Multiple match: Resolves with vector
  - Async: Yes

  See [findAllByAltText](https://testing-library.com/docs/queries/byalttext)."
  ([matcher]
   (vec (.findAllByAltText screen matcher)))
  ([matcher options]
   (vec (.findAllByAltText screen matcher (clj->js options)))))

(defn find-all-by-title
  "Returns a promise which resolves to a vector of matching elements.

  The promise is rejected if no elements are found after a default timeout of 1000ms.
  This is a combination of `get-all-by` queries and `waitFor`.

  - No match: Rejects
  - One match: Resolves with vector
  - Multiple match: Resolves with vector
  - Async: Yes

  See [findAllByTitle](https://testing-library.com/docs/queries/bytitle)."
  ([matcher]
   (vec (.findAllByTitle screen matcher)))
  ([matcher options]
   (vec (.findAllByTitle screen matcher (clj->js options)))))

(defn find-all-by-test-id
  "Returns a promise which resolves to a vector of matching elements.

  The promise is rejected if no elements are found after a default timeout of 1000ms.
  This is a combination of `get-all-by` queries and `waitFor`.

  - No match: Rejects
  - One match: Resolves with vector
  - Multiple match: Resolves with vector
  - Async: Yes

  See [findAllByTestId](https://testing-library.com/docs/queries/bytestid)."
  ([matcher]
   (vec (.findAllByTestId screen matcher)))
  ([matcher options]
   (vec (.findAllByTestId screen matcher (clj->js options)))))

;; End - Generated Code (Do not modify manually)
