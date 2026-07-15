(ns react-testing-library-cljs.within
  (:require
   ["@testing-library/react" :refer [within]]))

;; Refer to https://testing-library.com/docs/queries/about/ for more details about queries
;; Begin - Generated Code (Do not modify manually)
(defn get-by-role
  "Returns the matching element scoped to `element` for a query.

  Throws a descriptive error if no elements match or if more than one match is found.
  Use `get-all-by` instead if more than one element is expected.

  - No match: Throws error
  - One match: Returns element
  - Multiple match: Throws error
  - Async: No

  See [getByRole](https://testing-library.com/docs/queries/byrole)."
  ([element matcher]
   (.getByRole (within element) matcher))
  ([element matcher options]
   (.getByRole (within element) matcher (clj->js options))))

(defn get-by-label-text
  "Returns the matching element scoped to `element` for a query.

  Throws a descriptive error if no elements match or if more than one match is found.
  Use `get-all-by` instead if more than one element is expected.

  - No match: Throws error
  - One match: Returns element
  - Multiple match: Throws error
  - Async: No

  See [getByLabelText](https://testing-library.com/docs/queries/bylabeltext)."
  ([element matcher]
   (.getByLabelText (within element) matcher))
  ([element matcher options]
   (.getByLabelText (within element) matcher (clj->js options))))

(defn get-by-placeholder-text
  "Returns the matching element scoped to `element` for a query.

  Throws a descriptive error if no elements match or if more than one match is found.
  Use `get-all-by` instead if more than one element is expected.

  - No match: Throws error
  - One match: Returns element
  - Multiple match: Throws error
  - Async: No

  See [getByPlaceholderText](https://testing-library.com/docs/queries/byplaceholdertext)."
  ([element matcher]
   (.getByPlaceholderText (within element) matcher))
  ([element matcher options]
   (.getByPlaceholderText (within element) matcher (clj->js options))))

(defn get-by-text
  "Returns the matching element scoped to `element` for a query.

  Throws a descriptive error if no elements match or if more than one match is found.
  Use `get-all-by` instead if more than one element is expected.

  - No match: Throws error
  - One match: Returns element
  - Multiple match: Throws error
  - Async: No

  See [getByText](https://testing-library.com/docs/queries/bytext)."
  ([element matcher]
   (.getByText (within element) matcher))
  ([element matcher options]
   (.getByText (within element) matcher (clj->js options))))

(defn get-by-display-value
  "Returns the matching element scoped to `element` for a query.

  Throws a descriptive error if no elements match or if more than one match is found.
  Use `get-all-by` instead if more than one element is expected.

  - No match: Throws error
  - One match: Returns element
  - Multiple match: Throws error
  - Async: No

  See [getByDisplayValue](https://testing-library.com/docs/queries/bydisplayvalue)."
  ([element matcher]
   (.getByDisplayValue (within element) matcher))
  ([element matcher options]
   (.getByDisplayValue (within element) matcher (clj->js options))))

(defn get-by-alt-text
  "Returns the matching element scoped to `element` for a query.

  Throws a descriptive error if no elements match or if more than one match is found.
  Use `get-all-by` instead if more than one element is expected.

  - No match: Throws error
  - One match: Returns element
  - Multiple match: Throws error
  - Async: No

  See [getByAltText](https://testing-library.com/docs/queries/byalttext)."
  ([element matcher]
   (.getByAltText (within element) matcher))
  ([element matcher options]
   (.getByAltText (within element) matcher (clj->js options))))

(defn get-by-title
  "Returns the matching element scoped to `element` for a query.

  Throws a descriptive error if no elements match or if more than one match is found.
  Use `get-all-by` instead if more than one element is expected.

  - No match: Throws error
  - One match: Returns element
  - Multiple match: Throws error
  - Async: No

  See [getByTitle](https://testing-library.com/docs/queries/bytitle)."
  ([element matcher]
   (.getByTitle (within element) matcher))
  ([element matcher options]
   (.getByTitle (within element) matcher (clj->js options))))

(defn get-by-test-id
  "Returns the matching element scoped to `element` for a query.

  Throws a descriptive error if no elements match or if more than one match is found.
  Use `get-all-by` instead if more than one element is expected.

  - No match: Throws error
  - One match: Returns element
  - Multiple match: Throws error
  - Async: No

  See [getByTestId](https://testing-library.com/docs/queries/bytestid)."
  ([element matcher]
   (.getByTestId (within element) matcher))
  ([element matcher options]
   (.getByTestId (within element) matcher (clj->js options))))

(defn query-by-role
  "Returns the matching element scoped to `element` for a query, or `nil` if no elements match.

  Useful for asserting an element that is not present. Throws an error if more than one
  match is found. Use `query-all-by` instead if this is OK.

  - No match: Returns nil
  - One match: Returns element
  - Multiple match: Throws error
  - Async: No

  See [queryByRole](https://testing-library.com/docs/queries/byrole)."
  ([element matcher]
   (.queryByRole (within element) matcher))
  ([element matcher options]
   (.queryByRole (within element) matcher (clj->js options))))

(defn query-by-label-text
  "Returns the matching element scoped to `element` for a query, or `nil` if no elements match.

  Useful for asserting an element that is not present. Throws an error if more than one
  match is found. Use `query-all-by` instead if this is OK.

  - No match: Returns nil
  - One match: Returns element
  - Multiple match: Throws error
  - Async: No

  See [queryByLabelText](https://testing-library.com/docs/queries/bylabeltext)."
  ([element matcher]
   (.queryByLabelText (within element) matcher))
  ([element matcher options]
   (.queryByLabelText (within element) matcher (clj->js options))))

(defn query-by-placeholder-text
  "Returns the matching element scoped to `element` for a query, or `nil` if no elements match.

  Useful for asserting an element that is not present. Throws an error if more than one
  match is found. Use `query-all-by` instead if this is OK.

  - No match: Returns nil
  - One match: Returns element
  - Multiple match: Throws error
  - Async: No

  See [queryByPlaceholderText](https://testing-library.com/docs/queries/byplaceholdertext)."
  ([element matcher]
   (.queryByPlaceholderText (within element) matcher))
  ([element matcher options]
   (.queryByPlaceholderText (within element) matcher (clj->js options))))

(defn query-by-text
  "Returns the matching element scoped to `element` for a query, or `nil` if no elements match.

  Useful for asserting an element that is not present. Throws an error if more than one
  match is found. Use `query-all-by` instead if this is OK.

  - No match: Returns nil
  - One match: Returns element
  - Multiple match: Throws error
  - Async: No

  See [queryByText](https://testing-library.com/docs/queries/bytext)."
  ([element matcher]
   (.queryByText (within element) matcher))
  ([element matcher options]
   (.queryByText (within element) matcher (clj->js options))))

(defn query-by-display-value
  "Returns the matching element scoped to `element` for a query, or `nil` if no elements match.

  Useful for asserting an element that is not present. Throws an error if more than one
  match is found. Use `query-all-by` instead if this is OK.

  - No match: Returns nil
  - One match: Returns element
  - Multiple match: Throws error
  - Async: No

  See [queryByDisplayValue](https://testing-library.com/docs/queries/bydisplayvalue)."
  ([element matcher]
   (.queryByDisplayValue (within element) matcher))
  ([element matcher options]
   (.queryByDisplayValue (within element) matcher (clj->js options))))

(defn query-by-alt-text
  "Returns the matching element scoped to `element` for a query, or `nil` if no elements match.

  Useful for asserting an element that is not present. Throws an error if more than one
  match is found. Use `query-all-by` instead if this is OK.

  - No match: Returns nil
  - One match: Returns element
  - Multiple match: Throws error
  - Async: No

  See [queryByAltText](https://testing-library.com/docs/queries/byalttext)."
  ([element matcher]
   (.queryByAltText (within element) matcher))
  ([element matcher options]
   (.queryByAltText (within element) matcher (clj->js options))))

(defn query-by-title
  "Returns the matching element scoped to `element` for a query, or `nil` if no elements match.

  Useful for asserting an element that is not present. Throws an error if more than one
  match is found. Use `query-all-by` instead if this is OK.

  - No match: Returns nil
  - One match: Returns element
  - Multiple match: Throws error
  - Async: No

  See [queryByTitle](https://testing-library.com/docs/queries/bytitle)."
  ([element matcher]
   (.queryByTitle (within element) matcher))
  ([element matcher options]
   (.queryByTitle (within element) matcher (clj->js options))))

(defn query-by-test-id
  "Returns the matching element scoped to `element` for a query, or `nil` if no elements match.

  Useful for asserting an element that is not present. Throws an error if more than one
  match is found. Use `query-all-by` instead if this is OK.

  - No match: Returns nil
  - One match: Returns element
  - Multiple match: Throws error
  - Async: No

  See [queryByTestId](https://testing-library.com/docs/queries/bytestid)."
  ([element matcher]
   (.queryByTestId (within element) matcher))
  ([element matcher options]
   (.queryByTestId (within element) matcher (clj->js options))))

(defn find-by-role
  "Returns a promise which resolves when a matching element is found within `element`.

  The promise is rejected if no element is found or if more than one element is found
  after a default timeout of 1000ms. If you need to find more than one element, use
  `find-all-by`. This is a combination of `get-by` queries and `waitFor`.

  - No match: Rejects
  - One match: Resolves with element
  - Multiple match: Rejects
  - Async: Yes

  See [findByRole](https://testing-library.com/docs/queries/byrole)."
  ([element matcher]
   (.findByRole (within element) matcher))
  ([element matcher options]
   (.findByRole (within element) matcher (clj->js options))))

(defn find-by-label-text
  "Returns a promise which resolves when a matching element is found within `element`.

  The promise is rejected if no element is found or if more than one element is found
  after a default timeout of 1000ms. If you need to find more than one element, use
  `find-all-by`. This is a combination of `get-by` queries and `waitFor`.

  - No match: Rejects
  - One match: Resolves with element
  - Multiple match: Rejects
  - Async: Yes

  See [findByLabelText](https://testing-library.com/docs/queries/bylabeltext)."
  ([element matcher]
   (.findByLabelText (within element) matcher))
  ([element matcher options]
   (.findByLabelText (within element) matcher (clj->js options))))

(defn find-by-placeholder-text
  "Returns a promise which resolves when a matching element is found within `element`.

  The promise is rejected if no element is found or if more than one element is found
  after a default timeout of 1000ms. If you need to find more than one element, use
  `find-all-by`. This is a combination of `get-by` queries and `waitFor`.

  - No match: Rejects
  - One match: Resolves with element
  - Multiple match: Rejects
  - Async: Yes

  See [findByPlaceholderText](https://testing-library.com/docs/queries/byplaceholdertext)."
  ([element matcher]
   (.findByPlaceholderText (within element) matcher))
  ([element matcher options]
   (.findByPlaceholderText (within element) matcher (clj->js options))))

(defn find-by-text
  "Returns a promise which resolves when a matching element is found within `element`.

  The promise is rejected if no element is found or if more than one element is found
  after a default timeout of 1000ms. If you need to find more than one element, use
  `find-all-by`. This is a combination of `get-by` queries and `waitFor`.

  - No match: Rejects
  - One match: Resolves with element
  - Multiple match: Rejects
  - Async: Yes

  See [findByText](https://testing-library.com/docs/queries/bytext)."
  ([element matcher]
   (.findByText (within element) matcher))
  ([element matcher options]
   (.findByText (within element) matcher (clj->js options))))

(defn find-by-display-value
  "Returns a promise which resolves when a matching element is found within `element`.

  The promise is rejected if no element is found or if more than one element is found
  after a default timeout of 1000ms. If you need to find more than one element, use
  `find-all-by`. This is a combination of `get-by` queries and `waitFor`.

  - No match: Rejects
  - One match: Resolves with element
  - Multiple match: Rejects
  - Async: Yes

  See [findByDisplayValue](https://testing-library.com/docs/queries/bydisplayvalue)."
  ([element matcher]
   (.findByDisplayValue (within element) matcher))
  ([element matcher options]
   (.findByDisplayValue (within element) matcher (clj->js options))))

(defn find-by-alt-text
  "Returns a promise which resolves when a matching element is found within `element`.

  The promise is rejected if no element is found or if more than one element is found
  after a default timeout of 1000ms. If you need to find more than one element, use
  `find-all-by`. This is a combination of `get-by` queries and `waitFor`.

  - No match: Rejects
  - One match: Resolves with element
  - Multiple match: Rejects
  - Async: Yes

  See [findByAltText](https://testing-library.com/docs/queries/byalttext)."
  ([element matcher]
   (.findByAltText (within element) matcher))
  ([element matcher options]
   (.findByAltText (within element) matcher (clj->js options))))

(defn find-by-title
  "Returns a promise which resolves when a matching element is found within `element`.

  The promise is rejected if no element is found or if more than one element is found
  after a default timeout of 1000ms. If you need to find more than one element, use
  `find-all-by`. This is a combination of `get-by` queries and `waitFor`.

  - No match: Rejects
  - One match: Resolves with element
  - Multiple match: Rejects
  - Async: Yes

  See [findByTitle](https://testing-library.com/docs/queries/bytitle)."
  ([element matcher]
   (.findByTitle (within element) matcher))
  ([element matcher options]
   (.findByTitle (within element) matcher (clj->js options))))

(defn find-by-test-id
  "Returns a promise which resolves when a matching element is found within `element`.

  The promise is rejected if no element is found or if more than one element is found
  after a default timeout of 1000ms. If you need to find more than one element, use
  `find-all-by`. This is a combination of `get-by` queries and `waitFor`.

  - No match: Rejects
  - One match: Resolves with element
  - Multiple match: Rejects
  - Async: Yes

  See [findByTestId](https://testing-library.com/docs/queries/bytestid)."
  ([element matcher]
   (.findByTestId (within element) matcher))
  ([element matcher options]
   (.findByTestId (within element) matcher (clj->js options))))

(defn get-all-by-role
  "Returns a vector of all matching elements scoped to `element` for a query.

  Throws an error if no elements match.

  - No match: Throws error
  - One match: Returns vector
  - Multiple match: Returns vector
  - Async: No

  See [getAllByRole](https://testing-library.com/docs/queries/byrole)."
  ([element matcher]
   (vec (.getAllByRole (within element) matcher)))
  ([element matcher options]
   (vec (.getAllByRole (within element) matcher (clj->js options)))))

(defn get-all-by-label-text
  "Returns a vector of all matching elements scoped to `element` for a query.

  Throws an error if no elements match.

  - No match: Throws error
  - One match: Returns vector
  - Multiple match: Returns vector
  - Async: No

  See [getAllByLabelText](https://testing-library.com/docs/queries/bylabeltext)."
  ([element matcher]
   (vec (.getAllByLabelText (within element) matcher)))
  ([element matcher options]
   (vec (.getAllByLabelText (within element) matcher (clj->js options)))))

(defn get-all-by-placeholder-text
  "Returns a vector of all matching elements scoped to `element` for a query.

  Throws an error if no elements match.

  - No match: Throws error
  - One match: Returns vector
  - Multiple match: Returns vector
  - Async: No

  See [getAllByPlaceholderText](https://testing-library.com/docs/queries/byplaceholdertext)."
  ([element matcher]
   (vec (.getAllByPlaceholderText (within element) matcher)))
  ([element matcher options]
   (vec (.getAllByPlaceholderText (within element) matcher (clj->js options)))))

(defn get-all-by-text
  "Returns a vector of all matching elements scoped to `element` for a query.

  Throws an error if no elements match.

  - No match: Throws error
  - One match: Returns vector
  - Multiple match: Returns vector
  - Async: No

  See [getAllByText](https://testing-library.com/docs/queries/bytext)."
  ([element matcher]
   (vec (.getAllByText (within element) matcher)))
  ([element matcher options]
   (vec (.getAllByText (within element) matcher (clj->js options)))))

(defn get-all-by-display-value
  "Returns a vector of all matching elements scoped to `element` for a query.

  Throws an error if no elements match.

  - No match: Throws error
  - One match: Returns vector
  - Multiple match: Returns vector
  - Async: No

  See [getAllByDisplayValue](https://testing-library.com/docs/queries/bydisplayvalue)."
  ([element matcher]
   (vec (.getAllByDisplayValue (within element) matcher)))
  ([element matcher options]
   (vec (.getAllByDisplayValue (within element) matcher (clj->js options)))))

(defn get-all-by-alt-text
  "Returns a vector of all matching elements scoped to `element` for a query.

  Throws an error if no elements match.

  - No match: Throws error
  - One match: Returns vector
  - Multiple match: Returns vector
  - Async: No

  See [getAllByAltText](https://testing-library.com/docs/queries/byalttext)."
  ([element matcher]
   (vec (.getAllByAltText (within element) matcher)))
  ([element matcher options]
   (vec (.getAllByAltText (within element) matcher (clj->js options)))))

(defn get-all-by-title
  "Returns a vector of all matching elements scoped to `element` for a query.

  Throws an error if no elements match.

  - No match: Throws error
  - One match: Returns vector
  - Multiple match: Returns vector
  - Async: No

  See [getAllByTitle](https://testing-library.com/docs/queries/bytitle)."
  ([element matcher]
   (vec (.getAllByTitle (within element) matcher)))
  ([element matcher options]
   (vec (.getAllByTitle (within element) matcher (clj->js options)))))

(defn get-all-by-test-id
  "Returns a vector of all matching elements scoped to `element` for a query.

  Throws an error if no elements match.

  - No match: Throws error
  - One match: Returns vector
  - Multiple match: Returns vector
  - Async: No

  See [getAllByTestId](https://testing-library.com/docs/queries/bytestid)."
  ([element matcher]
   (vec (.getAllByTestId (within element) matcher)))
  ([element matcher options]
   (vec (.getAllByTestId (within element) matcher (clj->js options)))))

(defn query-all-by-role
  "Returns a vector of all matching elements scoped to `element` for a query.

  Returns an empty vector if no elements match.

  - No match: Returns []
  - One match: Returns vector
  - Multiple match: Returns vector
  - Async: No

  See [queryAllByRole](https://testing-library.com/docs/queries/byrole)."
  ([element matcher]
   (vec (.queryAllByRole (within element) matcher)))
  ([element matcher options]
   (vec (.queryAllByRole (within element) matcher (clj->js options)))))

(defn query-all-by-label-text
  "Returns a vector of all matching elements scoped to `element` for a query.

  Returns an empty vector if no elements match.

  - No match: Returns []
  - One match: Returns vector
  - Multiple match: Returns vector
  - Async: No

  See [queryAllByLabelText](https://testing-library.com/docs/queries/bylabeltext)."
  ([element matcher]
   (vec (.queryAllByLabelText (within element) matcher)))
  ([element matcher options]
   (vec (.queryAllByLabelText (within element) matcher (clj->js options)))))

(defn query-all-by-placeholder-text
  "Returns a vector of all matching elements scoped to `element` for a query.

  Returns an empty vector if no elements match.

  - No match: Returns []
  - One match: Returns vector
  - Multiple match: Returns vector
  - Async: No

  See [queryAllByPlaceholderText](https://testing-library.com/docs/queries/byplaceholdertext)."
  ([element matcher]
   (vec (.queryAllByPlaceholderText (within element) matcher)))
  ([element matcher options]
   (vec (.queryAllByPlaceholderText (within element) matcher (clj->js options)))))

(defn query-all-by-text
  "Returns a vector of all matching elements scoped to `element` for a query.

  Returns an empty vector if no elements match.

  - No match: Returns []
  - One match: Returns vector
  - Multiple match: Returns vector
  - Async: No

  See [queryAllByText](https://testing-library.com/docs/queries/bytext)."
  ([element matcher]
   (vec (.queryAllByText (within element) matcher)))
  ([element matcher options]
   (vec (.queryAllByText (within element) matcher (clj->js options)))))

(defn query-all-by-display-value
  "Returns a vector of all matching elements scoped to `element` for a query.

  Returns an empty vector if no elements match.

  - No match: Returns []
  - One match: Returns vector
  - Multiple match: Returns vector
  - Async: No

  See [queryAllByDisplayValue](https://testing-library.com/docs/queries/bydisplayvalue)."
  ([element matcher]
   (vec (.queryAllByDisplayValue (within element) matcher)))
  ([element matcher options]
   (vec (.queryAllByDisplayValue (within element) matcher (clj->js options)))))

(defn query-all-by-alt-text
  "Returns a vector of all matching elements scoped to `element` for a query.

  Returns an empty vector if no elements match.

  - No match: Returns []
  - One match: Returns vector
  - Multiple match: Returns vector
  - Async: No

  See [queryAllByAltText](https://testing-library.com/docs/queries/byalttext)."
  ([element matcher]
   (vec (.queryAllByAltText (within element) matcher)))
  ([element matcher options]
   (vec (.queryAllByAltText (within element) matcher (clj->js options)))))

(defn query-all-by-title
  "Returns a vector of all matching elements scoped to `element` for a query.

  Returns an empty vector if no elements match.

  - No match: Returns []
  - One match: Returns vector
  - Multiple match: Returns vector
  - Async: No

  See [queryAllByTitle](https://testing-library.com/docs/queries/bytitle)."
  ([element matcher]
   (vec (.queryAllByTitle (within element) matcher)))
  ([element matcher options]
   (vec (.queryAllByTitle (within element) matcher (clj->js options)))))

(defn query-all-by-test-id
  "Returns a vector of all matching elements scoped to `element` for a query.

  Returns an empty vector if no elements match.

  - No match: Returns []
  - One match: Returns vector
  - Multiple match: Returns vector
  - Async: No

  See [queryAllByTestId](https://testing-library.com/docs/queries/bytestid)."
  ([element matcher]
   (vec (.queryAllByTestId (within element) matcher)))
  ([element matcher options]
   (vec (.queryAllByTestId (within element) matcher (clj->js options)))))

(defn find-all-by-role
  "Returns a promise which resolves to a vector of matching elements scoped to `element`.

  The promise is rejected if no elements are found after a default timeout of 1000ms.
  This is a combination of `get-all-by` queries and `waitFor`.

  - No match: Rejects
  - One match: Resolves with vector
  - Multiple match: Resolves with vector
  - Async: Yes

  See [findAllByRole](https://testing-library.com/docs/queries/byrole)."
  ([element matcher]
   (.then (.findAllByRole (within element) matcher) vec))
  ([element matcher options]
   (.then (.findAllByRole (within element) matcher (clj->js options)) vec)))

(defn find-all-by-label-text
  "Returns a promise which resolves to a vector of matching elements scoped to `element`.

  The promise is rejected if no elements are found after a default timeout of 1000ms.
  This is a combination of `get-all-by` queries and `waitFor`.

  - No match: Rejects
  - One match: Resolves with vector
  - Multiple match: Resolves with vector
  - Async: Yes

  See [findAllByLabelText](https://testing-library.com/docs/queries/bylabeltext)."
  ([element matcher]
   (.then (.findAllByLabelText (within element) matcher) vec))
  ([element matcher options]
   (.then (.findAllByLabelText (within element) matcher (clj->js options)) vec)))

(defn find-all-by-placeholder-text
  "Returns a promise which resolves to a vector of matching elements scoped to `element`.

  The promise is rejected if no elements are found after a default timeout of 1000ms.
  This is a combination of `get-all-by` queries and `waitFor`.

  - No match: Rejects
  - One match: Resolves with vector
  - Multiple match: Resolves with vector
  - Async: Yes

  See [findAllByPlaceholderText](https://testing-library.com/docs/queries/byplaceholdertext)."
  ([element matcher]
   (.then (.findAllByPlaceholderText (within element) matcher) vec))
  ([element matcher options]
   (.then (.findAllByPlaceholderText (within element) matcher (clj->js options)) vec)))

(defn find-all-by-text
  "Returns a promise which resolves to a vector of matching elements scoped to `element`.

  The promise is rejected if no elements are found after a default timeout of 1000ms.
  This is a combination of `get-all-by` queries and `waitFor`.

  - No match: Rejects
  - One match: Resolves with vector
  - Multiple match: Resolves with vector
  - Async: Yes

  See [findAllByText](https://testing-library.com/docs/queries/bytext)."
  ([element matcher]
   (.then (.findAllByText (within element) matcher) vec))
  ([element matcher options]
   (.then (.findAllByText (within element) matcher (clj->js options)) vec)))

(defn find-all-by-display-value
  "Returns a promise which resolves to a vector of matching elements scoped to `element`.

  The promise is rejected if no elements are found after a default timeout of 1000ms.
  This is a combination of `get-all-by` queries and `waitFor`.

  - No match: Rejects
  - One match: Resolves with vector
  - Multiple match: Resolves with vector
  - Async: Yes

  See [findAllByDisplayValue](https://testing-library.com/docs/queries/bydisplayvalue)."
  ([element matcher]
   (.then (.findAllByDisplayValue (within element) matcher) vec))
  ([element matcher options]
   (.then (.findAllByDisplayValue (within element) matcher (clj->js options)) vec)))

(defn find-all-by-alt-text
  "Returns a promise which resolves to a vector of matching elements scoped to `element`.

  The promise is rejected if no elements are found after a default timeout of 1000ms.
  This is a combination of `get-all-by` queries and `waitFor`.

  - No match: Rejects
  - One match: Resolves with vector
  - Multiple match: Resolves with vector
  - Async: Yes

  See [findAllByAltText](https://testing-library.com/docs/queries/byalttext)."
  ([element matcher]
   (.then (.findAllByAltText (within element) matcher) vec))
  ([element matcher options]
   (.then (.findAllByAltText (within element) matcher (clj->js options)) vec)))

(defn find-all-by-title
  "Returns a promise which resolves to a vector of matching elements scoped to `element`.

  The promise is rejected if no elements are found after a default timeout of 1000ms.
  This is a combination of `get-all-by` queries and `waitFor`.

  - No match: Rejects
  - One match: Resolves with vector
  - Multiple match: Resolves with vector
  - Async: Yes

  See [findAllByTitle](https://testing-library.com/docs/queries/bytitle)."
  ([element matcher]
   (.then (.findAllByTitle (within element) matcher) vec))
  ([element matcher options]
   (.then (.findAllByTitle (within element) matcher (clj->js options)) vec)))

(defn find-all-by-test-id
  "Returns a promise which resolves to a vector of matching elements scoped to `element`.

  The promise is rejected if no elements are found after a default timeout of 1000ms.
  This is a combination of `get-all-by` queries and `waitFor`.

  - No match: Rejects
  - One match: Resolves with vector
  - Multiple match: Resolves with vector
  - Async: Yes

  See [findAllByTestId](https://testing-library.com/docs/queries/bytestid)."
  ([element matcher]
   (.then (.findAllByTestId (within element) matcher) vec))
  ([element matcher options]
   (.then (.findAllByTestId (within element) matcher (clj->js options)) vec)))
;; End - Generated Code (Do not modify manually)
