[![Clojars Project](https://img.shields.io/clojars/v/org.clojars.olecve/react-testing-library-cljs.svg)](https://clojars.org/org.clojars.olecve/react-testing-library-cljs)

# react-testing-library-cljs

The `react-testing-library-cljs` library provides a ClojureScript functions for the [react-testing-library](https://github.com/testing-library/react-testing-library) to simplify interop.

For more information about the principles and concepts behind the testing library, you can visit the [official react-testing-library website](https://testing-library.com/).

## Features

### Common

- The `react-testing-library-cljs.screen` namespace provides a wrapper around the `react-testing-library`'s `screen` object, making it easier to interact with rendered components.

- The `react-testing-library-cljs.fire-events` namespace simplifies firing events on rendered components, allowing you to simulate user interactions.

### Reagent

- The `react-testing-library-cljs.reagent.fire-event` similar to the `react-testing-library-cljs.fire-events`, but calling `reagent.core/flush` after every event to trigger re-render.

- The `react-testing-library-cljs.reagent.render` provides helper function to render reagent components.

## Installation

To get started with `react-testing-library-cljs`, you can refer to the example folder to see how to set it up.

This work is still in progress.

## LICENSE

[MIT](LICENSE)
