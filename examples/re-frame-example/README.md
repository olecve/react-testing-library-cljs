# re-frame-example

An example of testing a [re-frame](https://github.com/day8/re-frame) app with
[`react-testing-library-cljs`](https://github.com/olecve/react-testing-library-cljs),
using shadow-cljs's `:node-test` target and jsdom — no browser required.

## What it demonstrates

- **`app.events-test`** — unit-testing re-frame event and subscription handlers
  as plain functions (the recommended re-frame pattern), with no DOM.
- **`app.views-test`** — testing a re-frame view with the library:
  - rendering it and reading the DOM with `screen`,
  - reacting to a synchronous `dispatch-sync` (wrapped in `act`),
  - driving state through a real click and waiting for the async re-frame
    `dispatch` to reach the DOM via `find-by-text`.

## Setup essentials

- `shadow-cljs.edn` declares `reagent` and `re-frame` as dependencies and a
  `:node-test` build with an `app.test-setup` preload. It references the
  library's source in this repo via `:source-paths` (so the example always
  tracks HEAD); a standalone project would add the Clojars dependency instead —
  see the repository root README.
- `src/app/test_setup.cljs` registers jsdom and sets `IS_REACT_ACT_ENVIRONMENT`.

## Running

```bash
npm install
npm test        # compile the :test build and run it on Node
npm run lint    # clj-kondo
npm run fmt     # prettier + cljfmt
```
