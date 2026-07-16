# node-test-example

A minimal example of testing ClojureScript components with
[`react-testing-library-cljs`](https://github.com/olecve/react-testing-library-cljs)
using shadow-cljs's `:node-test` target and [jsdom](https://github.com/jsdom/jsdom) —
no browser required. This is the simplest setup and runs end to end in CI.

## What it demonstrates

- **`app.reagent-test`** — testing Reagent components: `render!`, `fire-event`
  (wrapped in `act`), `screen` queries, scoped queries with `within`, and mock
  handlers via `mocks/create`.
- **`app.plain-react-test`** — testing plain React (no Reagent) with raw
  `react/createElement`, `user-event`, and async `find-by-*` queries written as
  native `^:async` / `await` tests.

## Setup essentials

- `shadow-cljs.edn` declares `reagent` as a dependency and a `:node-test` build
  with an `app.test-setup` preload. It references the library's source in this
  repo via `:source-paths` (so the example always tracks HEAD); a standalone
  project would add the Clojars dependency instead — see the repository root
  README.
- `src/app/test_setup.cljs` registers jsdom (`global-jsdom/register`) and sets
  `IS_REACT_ACT_ENVIRONMENT`, giving the tests a DOM and reliable React updates.

## Running

```bash
npm install
npm test        # compile the :test build and run it on Node
npm run lint    # clj-kondo
npm run fmt     # prettier + cljfmt
```
