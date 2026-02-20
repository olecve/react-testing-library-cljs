[![Clojars Project](https://img.shields.io/clojars/v/org.clojars.olecve/react-testing-library-cljs.svg)](https://clojars.org/org.clojars.olecve/react-testing-library-cljs)

# react-testing-library-cljs

The `react-testing-library-cljs` library provides a ClojureScript functions for the [react-testing-library](https://github.com/testing-library/react-testing-library) to simplify interop.

For more information about the principles and concepts behind the testing library, you can visit the [official react-testing-library website](https://testing-library.com/).

## Features

### Common

- The `react-testing-library-cljs.screen` namespace provides a wrapper around the `react-testing-library`'s `screen` object, making it easier to interact with rendered components.

- The `react-testing-library-cljs.fire-event` namespace simplifies firing events on rendered components, allowing you to simulate user interactions.

### Reagent

- The `react-testing-library-cljs.reagent.fire-event` similar to the `react-testing-library-cljs.fire-event`, but calling `reagent.core/flush` after every event to trigger re-render.

- The `react-testing-library-cljs.reagent.render` provides helper function to render reagent components.

## Installation

Add the library to your project:

**deps.edn**

```clojure
org.clojars.olecve/react-testing-library-cljs {:mvn/version "0.0.15"}
```

**Leiningen**

```clojure
[org.clojars.olecve/react-testing-library-cljs "0.0.15"]
```

Install the npm dependency:

```bash
npm install --save-dev @testing-library/react
```

**shadow-cljs config** — add a `:node-test` build target:

```clojure
;; shadow-cljs.edn
{:builds
 {:test {:target :node-test
         :output-to "out/test.js"}}}
```

Run tests with:

```bash
npx shadow-cljs compile test && node --require global-jsdom/register out/test.js
```

## Usage

### Rendering & querying

```clojure
(ns my-app.core-test
  (:require [cljs.test :refer [deftest is]]
            [react-testing-library-cljs.reagent.render :as render]
            [react-testing-library-cljs.screen :as screen]))

(defn greeting []
  [:h1 "Hello, world!"])

(deftest renders-greeting
  (render/render! [greeting])
  (is (screen/get-by-text "Hello, world!")))
```

### Firing events

```clojure
(ns my-app.events-test
  (:require [cljs.test :refer [deftest is]]
            [react-testing-library-cljs.reagent.render :as render]
            [react-testing-library-cljs.reagent.fire-event :as fire-event]
            [react-testing-library-cljs.screen :as screen]
            [reagent.core :as r]))

(defn counter []
  (let [count (r/atom 0)]
    (fn []
      [:button {:on-click #(swap! count inc)}
       (str "Count: " @count)])))

(deftest click-increments-counter
  (render/render! [counter])
  (render/act #(fire-event/click (screen/get-by-text "Count: 0")))
  (is (screen/get-by-text "Count: 1")))
```

### Mocks

```clojure
(ns my-app.mocks-test
  (:require [cljs.test :refer [deftest is]]
            [react-testing-library-cljs.mocks :as mocks]
            [react-testing-library-cljs.reagent.render :as render]
            [react-testing-library-cljs.fire-event :as fire-event]
            [react-testing-library-cljs.screen :as screen]))

(deftest tracks-button-click
  (let [[calls on-click] (mocks/create)]
    (render/render! [:button {:on-click on-click} "Submit"])
    (fire-event/click (screen/get-by-text "Submit"))
    (is (= 1 (count @calls)))))
```

### Async queries

`find-by-*` queries return a promise that resolves when a matching element appears (useful for async updates):

```clojure
(ns my-app.async-test
  (:require [cljs.test :refer [deftest async is]]
            [react-testing-library-cljs.reagent.render :as render]
            [react-testing-library-cljs.screen :as screen]))

(deftest finds-async-element
  (async done
    (render/render! [my-async-component])
    (-> (screen/find-by-text "Loaded!")
        (.then (fn [element]
                 (is element)
                 (done))))))
```

## LICENSE

[MIT](LICENSE)
