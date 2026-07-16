# react-testing-library-cljs

[![Clojars Project](https://img.shields.io/clojars/v/org.clojars.olecve/react-testing-library-cljs.svg)](https://clojars.org/org.clojars.olecve/react-testing-library-cljs)

The `react-testing-library-cljs` library provides a ClojureScript functions for the [react-testing-library](https://github.com/testing-library/react-testing-library) to simplify interop.

For more information about the principles and concepts behind the testing library, you can visit the [official react-testing-library website](https://testing-library.com/).

## Features

### Common

- The `react-testing-library-cljs.screen` namespace provides a wrapper around the `react-testing-library`'s `screen` object, making it easier to interact with rendered components.

- The `react-testing-library-cljs.fire-event` namespace simplifies firing events on rendered components, allowing you to simulate user interactions.

- The `react-testing-library-cljs.within` namespace scopes queries to a specific element, useful when multiple similar elements exist in the DOM.

- The `react-testing-library-cljs.user-event` namespace wraps [`@testing-library/user-event`](https://testing-library.com/docs/user-event/intro) to simulate realistic user interactions by firing the full sequence of events (focus, keyboard, pointer, input, etc.) rather than a single synthetic event. Requires the `@testing-library/user-event` npm package.

- The `react-testing-library-cljs.mocks` namespace provides a helper to create mock event handlers that record the arguments they are called with.

- The `react-testing-library-cljs.async` namespace provides the `deftest-async` macro for writing async tests on toolchains without native ClojureScript async (shadow-cljs before 3.4). Requires `promesa` on the classpath. On shadow-cljs 3.4+ prefer a native `^:async` deftest with `await`.

### Reagent

- The `react-testing-library-cljs.reagent.fire-event` similar to the `react-testing-library-cljs.fire-event`, but calling `reagent.core/flush` after every event to trigger re-render.

- The `react-testing-library-cljs.reagent.render` provides helper function to render reagent components.

## Installation

Add the library to your project, using the latest version shown in the Clojars badge above:

### deps.edn

```clojure
org.clojars.olecve/react-testing-library-cljs {:mvn/version "0.0.20"}
```

### Leiningen

```clojure
[org.clojars.olecve/react-testing-library-cljs "0.0.20"]
```

Install the npm dependency:

```bash
npm install --save-dev @testing-library/react
```

### shadow-cljs config

Add a `:node-test` build target:

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
  (is (some? (screen/get-by-text "Hello, world!"))))
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
  (let [[on-click calls] (mocks/create)]
    (render/render! [:button {:on-click on-click} "Submit"])
    (fire-event/click (screen/get-by-text "Submit"))
    (is (= 1 (count @calls)))))
```

### Scoped queries with `within`

Use `within` to scope queries to a subtree — useful when the same elements appear in multiple places.
In the example below, scoping to the dialog avoids ambiguity with other "Delete" buttons on the page:

```clojure
(ns my-app.within-test
  (:require [cljs.test :refer [deftest is]]
            [react-testing-library-cljs.reagent.render :as render]
            [react-testing-library-cljs.screen :as screen]
            [react-testing-library-cljs.within :as within]))

(defn page []
  [:div
   [:ul
    [:li "Report Q4" [:button "Delete"]]
    [:li "Report Q3" [:button "Delete"]]]
   [:div {:role "dialog" :aria-label "Confirm deletion"}
    [:p "Are you sure you want to delete this report?"]
    [:button "Delete"]
    [:button "Cancel"]]])

(deftest confirm-dialog-has-correct-actions
  (render/render! [page])
  (let [dialog (screen/get-by-role "dialog")]
    (is (some? (within/get-by-role dialog "button" {:name "Delete"})))
    (is (some? (within/get-by-role dialog "button" {:name "Cancel"})))))
```

### Async tests

`find-by-*` queries (and all `user-event` calls) return a Promise that resolves when the interaction settles, so tests that use them must await it. Pick the style that matches your toolchain.

**Native async** — recommended, requires shadow-cljs 3.4+ (ClojureScript 1.12.145+). Mark the test `^:async` and `await` the Promise directly:

```clojure
(ns my-app.async-test
  (:require [cljs.test :refer [deftest is]]
            [react-testing-library-cljs.reagent.render :as render]
            [react-testing-library-cljs.screen :as screen]))

(deftest ^:async finds-async-element
  (render/render! [my-async-component])
  (let [element (await (screen/find-by-text "Loaded!"))]
    (is (some? element))))
```

**`deftest-async` macro** — the compatibility path for older toolchains that lack native async. It awaits each top-level form and requires `promesa` on the classpath:

```clojure
(ns my-app.async-test
  (:require [cljs.test :refer [is]]
            [promesa.core :as p]
            [react-testing-library-cljs.async :refer-macros [deftest-async]]
            [react-testing-library-cljs.reagent.render :as render]
            [react-testing-library-cljs.screen :as screen]))

(deftest-async finds-async-element
  (render/render! [my-async-component])
  (p/let [element (screen/find-by-text "Loaded!")]
    (is (some? element))))
```

## Release

Prerequisites:

- GPG configured ([lein help gpg](https://github.com/technomancy/leiningen/blob/stable/doc/GPG.md))
- Clojars credentials in `~/.lein/profiles.clj`:

```clojure
{:auth {:repository-auth {#"clojars" {:username "USERNAME" :password "CLOJARS_TOKEN"}}}}
```

Run:

```bash
bb release
```

## LICENSE

[MIT](LICENSE)
