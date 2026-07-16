(ns react-testing-library-cljs.user-event
  "ClojureScript wrapper for @testing-library/user-event.

  Simulates real user interactions by firing the full sequence of events
  (focus, keyboard, pointer, input, etc.) rather than a single synthetic event.

  Refer to https://testing-library.com/docs/user-event/intro for more details."
  (:refer-clojure :exclude [type])
  (:require
   ["@testing-library/user-event" :default userEvent]))

(defn setup
  "Creates a UserEvent instance for simulating user interactions.
  Should be called once per test. All interactions on the instance share
  browser state (clipboard, keyboard, pointer, etc.).

  All methods on the returned instance return a Promise.

  See [userEvent.setup](https://testing-library.com/docs/user-event/setup)."
  ([] (.setup userEvent))
  ([options] (.setup userEvent (clj->js options))))

(defn click
  "Clicks an element.

  See [click](https://testing-library.com/docs/user-event/convenience/#click)."
  ([^js user element] (.click user element))
  ([^js user element options] (.click user element (clj->js options))))
(defn dbl-click
  "Double-clicks an element.

  See [dblClick](https://testing-library.com/docs/user-event/convenience/#dblclick)."
  ([^js user element] (.dblClick user element))
  ([^js user element options] (.dblClick user element (clj->js options))))
(defn triple-click
  "Triple-clicks an element (selects all text in an input).

  See [tripleClick](https://testing-library.com/docs/user-event/convenience/#tripleclick)."
  ([^js user element] (.tripleClick user element))
  ([^js user element options] (.tripleClick user element (clj->js options))))
(defn hover
  "Moves the pointer to an element.

  See [hover](https://testing-library.com/docs/user-event/convenience/#hover)."
  ([^js user element] (.hover user element))
  ([^js user element options] (.hover user element (clj->js options))))
(defn unhover
  "Moves the pointer away from an element.

  See [unhover](https://testing-library.com/docs/user-event/convenience/#unhover)."
  ([^js user element] (.unhover user element))
  ([^js user element options] (.unhover user element (clj->js options))))
(defn type
  "Types text into an element one character at a time.
  Simulates the full keyboard event sequence for each character.

  See [type](https://testing-library.com/docs/user-event/utility/#type)."
  ([^js user element text] (.type user element text))
  ([^js user element text options] (.type user element text (clj->js options))))
(defn clear
  "Selects all text in an element and deletes it.

  See [clear](https://testing-library.com/docs/user-event/utility/#clear)."
  [^js user element] (.clear user element))
(defn select-options
  "Selects one or more options in a `<select>` element.
  `values` can be a single value or a vector of values (option text, value, or element).

  See [selectOptions](https://testing-library.com/docs/user-event/utility/#selectoptions)."
  ([^js user element values] (.selectOptions user element (clj->js values)))
  ([^js user element values options] (.selectOptions user element (clj->js values) (clj->js options))))
(defn deselect-options
  "Deselects one or more options in a `<select multiple>` element.
  `values` can be a single value or a vector of values (option text, value, or element).

  See [deselectOptions](https://testing-library.com/docs/user-event/utility/#deselectoptions)."
  ([^js user element values] (.deselectOptions user element (clj->js values)))
  ([^js user element values options] (.deselectOptions user element (clj->js values) (clj->js options))))
(defn upload
  "Simulates uploading a file via a file input.
  `files` can be a single File or a vector of Files.

  See [upload](https://testing-library.com/docs/user-event/utility/#upload)."
  ([^js user element files] (.upload user element files))
  ([^js user element files options] (.upload user element files (clj->js options))))
(defn tab
  "Presses the Tab key, moving focus to the next focusable element.

  See [tab](https://testing-library.com/docs/user-event/convenience/#tab)."
  ([^js user] (.tab user))
  ([^js user options] (.tab user (clj->js options))))
(defn keyboard
  "Simulates keyboard events for the given key descriptor string.
  For example `{Enter}`, `a`, or `{{a}}`.

  See [keyboard](https://testing-library.com/docs/user-event/keyboard)."
  ([^js user text] (.keyboard user text))
  ([^js user text options] (.keyboard user text (clj->js options))))
(defn pointer
  "Simulates pointer device interactions.

  See [pointer](https://testing-library.com/docs/user-event/pointer)."
  ([^js user input] (.pointer user (clj->js input)))
  ([^js user input options] (.pointer user (clj->js input) (clj->js options))))
(defn copy
  "Copies the current selection to the clipboard.

  See [copy](https://testing-library.com/docs/user-event/clipboard/#copy)."
  ([^js user] (.copy user))
  ([^js user options] (.copy user (clj->js options))))
(defn cut
  "Cuts the current selection to the clipboard.

  See [cut](https://testing-library.com/docs/user-event/clipboard/#cut)."
  ([^js user] (.cut user))
  ([^js user options] (.cut user (clj->js options))))
(defn paste
  "Pastes clipboard contents into the focused element.

  See [paste](https://testing-library.com/docs/user-event/clipboard/#paste)."
  ([^js user] (.paste user))
  ([^js user options] (.paste user (clj->js options))))
