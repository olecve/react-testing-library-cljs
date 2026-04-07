# Changelog

## 0.0.19

- **Breaking:** Swap return order of `mocks/create` to `[handler calls reset!]`
- Register global jsdom from `test-setup` namespace
- Fix drop warning in `fire-event` namespace
- Provide type hint for `user-event` namespace

## 0.0.18

- Add `@testing-library/user-event` wrapper with all functions
- Add `deftest-async` macro for wrapping async tests with promesa
- Add tests for user-event wrapper namespace

## 0.0.17

- Add `within` namespace with generated query functions
- Add script to generate `within` namespace
- DRY shared functions into `common.clj`

## 0.0.16

- Add GitHub Actions workflow
- Add tests for existing functionality
- Migrate from yarn to npm
- Recreate `screen.cljs` with improved docstrings
- Fix CVE-2026-26996: bump minimatch to 3.1.3 in karma example
- Update dependencies

## 0.0.15

- Add `act` wrapper
- Add helper function to mock handlers
- Call `r/flush` after callback
- Pass callback function directly to the library without invoking

## 0.0.14

- Return render result from `render!` function

## 0.0.13

- Add simple hiccup validation
- Call `r/flush` after render

## 0.0.12

- Clean up DOM before rendering

## 0.0.11

- Handle hiccup functions that return other functions (stateful components)
- Set `innerHTML` of body to empty string before every test render
- Add karma test example

## 0.0.10

- Add `render` helper
- Migrate to babashka tasks
- Suppress warning about `drop` function

## 0.0.9

- Add `*-all-*` query functions that return vectors
- Add reagent example project

## 0.0.8

- Convert options from `clj->js` automatically

## 0.0.7

- Fix one-arity template for fire events
- Regenerate fire-events

## 0.0.6

- Add `fire-event` namespace with generated event functions
- Add `fire-event` for reagent
- Add script to generate fire-event namespace

## 0.0.5

- Generate better docstrings for query functions

## 0.0.4

- Add documentation link for every generated function
- Add `generate-screen` babashka script

## 0.0.3

- Regenerate query functions with updated template
- Remove nbb from dependencies

## 0.0.2

- Add `debug` wrapper
- Add link to original documentation about queries

## 0.0.1

- Initial release
- Generated source file with all screen query functions
