(ns react-testing-library-cljs.reagent.fire-event
  (:refer-clojure :exclude [drop])
  (:require
   ["@testing-library/react" :refer [fireEvent]]
   [reagent.core :as r]))

;; Refer to https://testing-library.com/docs/dom-testing-library/api-events/ for more details about events
;; Begin - Generated Code (Do not modify manually)
(defn copy
  ([element]
   (let [result (.copy fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.copy fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn cut
  ([element]
   (let [result (.cut fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.cut fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn paste
  ([element]
   (let [result (.paste fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.paste fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn composition-end
  ([element]
   (let [result (.compositionEnd fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.compositionEnd fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn composition-start
  ([element]
   (let [result (.compositionStart fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.compositionStart fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn composition-update
  ([element]
   (let [result (.compositionUpdate fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.compositionUpdate fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn key-down
  ([element]
   (let [result (.keyDown fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.keyDown fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn key-press
  ([element]
   (let [result (.keyPress fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.keyPress fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn key-up
  ([element]
   (let [result (.keyUp fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.keyUp fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn focus
  ([element]
   (let [result (.focus fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.focus fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn blur
  ([element]
   (let [result (.blur fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.blur fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn focus-in
  ([element]
   (let [result (.focusIn fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.focusIn fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn focus-out
  ([element]
   (let [result (.focusOut fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.focusOut fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn change
  ([element]
   (let [result (.change fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.change fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn input
  ([element]
   (let [result (.input fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.input fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn invalid
  ([element]
   (let [result (.invalid fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.invalid fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn submit
  ([element]
   (let [result (.submit fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.submit fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn reset
  ([element]
   (let [result (.reset fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.reset fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn click
  ([element]
   (let [result (.click fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.click fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn context-menu
  ([element]
   (let [result (.contextMenu fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.contextMenu fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn dbl-click
  ([element]
   (let [result (.dblClick fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.dblClick fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn drag
  ([element]
   (let [result (.drag fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.drag fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn drag-end
  ([element]
   (let [result (.dragEnd fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.dragEnd fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn drag-enter
  ([element]
   (let [result (.dragEnter fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.dragEnter fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn drag-exit
  ([element]
   (let [result (.dragExit fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.dragExit fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn drag-leave
  ([element]
   (let [result (.dragLeave fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.dragLeave fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn drag-over
  ([element]
   (let [result (.dragOver fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.dragOver fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn drag-start
  ([element]
   (let [result (.dragStart fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.dragStart fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn drop
  ([element]
   (let [result (.drop fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.drop fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn mouse-down
  ([element]
   (let [result (.mouseDown fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.mouseDown fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn mouse-enter
  ([element]
   (let [result (.mouseEnter fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.mouseEnter fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn mouse-leave
  ([element]
   (let [result (.mouseLeave fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.mouseLeave fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn mouse-move
  ([element]
   (let [result (.mouseMove fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.mouseMove fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn mouse-out
  ([element]
   (let [result (.mouseOut fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.mouseOut fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn mouse-over
  ([element]
   (let [result (.mouseOver fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.mouseOver fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn mouse-up
  ([element]
   (let [result (.mouseUp fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.mouseUp fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn pop-state
  ([element]
   (let [result (.popState fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.popState fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn select
  ([element]
   (let [result (.select fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.select fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn touch-cancel
  ([element]
   (let [result (.touchCancel fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.touchCancel fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn touch-end
  ([element]
   (let [result (.touchEnd fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.touchEnd fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn touch-move
  ([element]
   (let [result (.touchMove fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.touchMove fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn touch-start
  ([element]
   (let [result (.touchStart fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.touchStart fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn scroll
  ([element]
   (let [result (.scroll fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.scroll fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn wheel
  ([element]
   (let [result (.wheel fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.wheel fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn abort
  ([element]
   (let [result (.abort fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.abort fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn can-play
  ([element]
   (let [result (.canPlay fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.canPlay fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn can-play-through
  ([element]
   (let [result (.canPlayThrough fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.canPlayThrough fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn duration-change
  ([element]
   (let [result (.durationChange fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.durationChange fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn emptied
  ([element]
   (let [result (.emptied fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.emptied fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn encrypted
  ([element]
   (let [result (.encrypted fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.encrypted fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn ended
  ([element]
   (let [result (.ended fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.ended fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn loaded-data
  ([element]
   (let [result (.loadedData fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.loadedData fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn loaded-metadata
  ([element]
   (let [result (.loadedMetadata fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.loadedMetadata fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn load-start
  ([element]
   (let [result (.loadStart fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.loadStart fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn pause
  ([element]
   (let [result (.pause fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.pause fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn play
  ([element]
   (let [result (.play fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.play fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn playing
  ([element]
   (let [result (.playing fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.playing fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn progress
  ([element]
   (let [result (.progress fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.progress fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn rate-change
  ([element]
   (let [result (.rateChange fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.rateChange fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn seeked
  ([element]
   (let [result (.seeked fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.seeked fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn seeking
  ([element]
   (let [result (.seeking fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.seeking fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn stalled
  ([element]
   (let [result (.stalled fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.stalled fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn suspend
  ([element]
   (let [result (.suspend fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.suspend fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn time-update
  ([element]
   (let [result (.timeUpdate fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.timeUpdate fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn volume-change
  ([element]
   (let [result (.volumeChange fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.volumeChange fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn waiting
  ([element]
   (let [result (.waiting fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.waiting fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn load
  ([element]
   (let [result (.load fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.load fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn error
  ([element]
   (let [result (.error fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.error fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn animation-start
  ([element]
   (let [result (.animationStart fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.animationStart fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn animation-end
  ([element]
   (let [result (.animationEnd fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.animationEnd fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn animation-iteration
  ([element]
   (let [result (.animationIteration fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.animationIteration fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn transition-end
  ([element]
   (let [result (.transitionEnd fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.transitionEnd fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn double-click
  ([element]
   (let [result (.doubleClick fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.doubleClick fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn pointer-over
  ([element]
   (let [result (.pointerOver fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.pointerOver fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn pointer-enter
  ([element]
   (let [result (.pointerEnter fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.pointerEnter fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn pointer-down
  ([element]
   (let [result (.pointerDown fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.pointerDown fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn pointer-move
  ([element]
   (let [result (.pointerMove fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.pointerMove fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn pointer-up
  ([element]
   (let [result (.pointerUp fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.pointerUp fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn pointer-cancel
  ([element]
   (let [result (.pointerCancel fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.pointerCancel fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn pointer-out
  ([element]
   (let [result (.pointerOut fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.pointerOut fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn pointer-leave
  ([element]
   (let [result (.pointerLeave fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.pointerLeave fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn got-pointer-capture
  ([element]
   (let [result (.gotPointerCapture fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.gotPointerCapture fireEvent element (clj->js options))]
     (r/flush)
     result)))

(defn lost-pointer-capture
  ([element]
   (let [result (.lostPointerCapture fireEvent element)]
     (r/flush)
     result))
  ([element options]
   (let [result (.lostPointerCapture fireEvent element (clj->js options))]
     (r/flush)
     result)))
;; End - Generated Code (Do not modify manually)
