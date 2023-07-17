(ns react-testing-library-cljs.reagent.fire-event
  (:require
   ["@testing-library/react" :refer [fireEvent]]
   [reagent.core :as r]))

;; Refer to https://testing-library.com/docs/dom-testing-library/api-events/ for more details about events
;; Begin - Generated Code (Do not modify manually)
(defn copy
  ([element]
   (.copy fireEvent element)
   (r/flush))
  ([element options]
   (.copy fireEvent element (clj->js options))
   (r/flush)))

(defn cut
  ([element]
   (.cut fireEvent element)
   (r/flush))
  ([element options]
   (.cut fireEvent element (clj->js options))
   (r/flush)))

(defn paste
  ([element]
   (.paste fireEvent element)
   (r/flush))
  ([element options]
   (.paste fireEvent element (clj->js options))
   (r/flush)))

(defn composition-end
  ([element]
   (.compositionEnd fireEvent element)
   (r/flush))
  ([element options]
   (.compositionEnd fireEvent element (clj->js options))
   (r/flush)))

(defn composition-start
  ([element]
   (.compositionStart fireEvent element)
   (r/flush))
  ([element options]
   (.compositionStart fireEvent element (clj->js options))
   (r/flush)))

(defn composition-update
  ([element]
   (.compositionUpdate fireEvent element)
   (r/flush))
  ([element options]
   (.compositionUpdate fireEvent element (clj->js options))
   (r/flush)))

(defn key-down
  ([element]
   (.keyDown fireEvent element)
   (r/flush))
  ([element options]
   (.keyDown fireEvent element (clj->js options))
   (r/flush)))

(defn key-press
  ([element]
   (.keyPress fireEvent element)
   (r/flush))
  ([element options]
   (.keyPress fireEvent element (clj->js options))
   (r/flush)))

(defn key-up
  ([element]
   (.keyUp fireEvent element)
   (r/flush))
  ([element options]
   (.keyUp fireEvent element (clj->js options))
   (r/flush)))

(defn focus
  ([element]
   (.focus fireEvent element)
   (r/flush))
  ([element options]
   (.focus fireEvent element (clj->js options))
   (r/flush)))

(defn blur
  ([element]
   (.blur fireEvent element)
   (r/flush))
  ([element options]
   (.blur fireEvent element (clj->js options))
   (r/flush)))

(defn focus-in
  ([element]
   (.focusIn fireEvent element)
   (r/flush))
  ([element options]
   (.focusIn fireEvent element (clj->js options))
   (r/flush)))

(defn focus-out
  ([element]
   (.focusOut fireEvent element)
   (r/flush))
  ([element options]
   (.focusOut fireEvent element (clj->js options))
   (r/flush)))

(defn change
  ([element]
   (.change fireEvent element)
   (r/flush))
  ([element options]
   (.change fireEvent element (clj->js options))
   (r/flush)))

(defn input
  ([element]
   (.input fireEvent element)
   (r/flush))
  ([element options]
   (.input fireEvent element (clj->js options))
   (r/flush)))

(defn invalid
  ([element]
   (.invalid fireEvent element)
   (r/flush))
  ([element options]
   (.invalid fireEvent element (clj->js options))
   (r/flush)))

(defn submit
  ([element]
   (.submit fireEvent element)
   (r/flush))
  ([element options]
   (.submit fireEvent element (clj->js options))
   (r/flush)))

(defn reset
  ([element]
   (.reset fireEvent element)
   (r/flush))
  ([element options]
   (.reset fireEvent element (clj->js options))
   (r/flush)))

(defn click
  ([element]
   (.click fireEvent element)
   (r/flush))
  ([element options]
   (.click fireEvent element (clj->js options))
   (r/flush)))

(defn context-menu
  ([element]
   (.contextMenu fireEvent element)
   (r/flush))
  ([element options]
   (.contextMenu fireEvent element (clj->js options))
   (r/flush)))

(defn dbl-click
  ([element]
   (.dblClick fireEvent element)
   (r/flush))
  ([element options]
   (.dblClick fireEvent element (clj->js options))
   (r/flush)))

(defn drag
  ([element]
   (.drag fireEvent element)
   (r/flush))
  ([element options]
   (.drag fireEvent element (clj->js options))
   (r/flush)))

(defn drag-end
  ([element]
   (.dragEnd fireEvent element)
   (r/flush))
  ([element options]
   (.dragEnd fireEvent element (clj->js options))
   (r/flush)))

(defn drag-enter
  ([element]
   (.dragEnter fireEvent element)
   (r/flush))
  ([element options]
   (.dragEnter fireEvent element (clj->js options))
   (r/flush)))

(defn drag-exit
  ([element]
   (.dragExit fireEvent element)
   (r/flush))
  ([element options]
   (.dragExit fireEvent element (clj->js options))
   (r/flush)))

(defn drag-leave
  ([element]
   (.dragLeave fireEvent element)
   (r/flush))
  ([element options]
   (.dragLeave fireEvent element (clj->js options))
   (r/flush)))

(defn drag-over
  ([element]
   (.dragOver fireEvent element)
   (r/flush))
  ([element options]
   (.dragOver fireEvent element (clj->js options))
   (r/flush)))

(defn drag-start
  ([element]
   (.dragStart fireEvent element)
   (r/flush))
  ([element options]
   (.dragStart fireEvent element (clj->js options))
   (r/flush)))

(defn drop
  ([element]
   (.drop fireEvent element)
   (r/flush))
  ([element options]
   (.drop fireEvent element (clj->js options))
   (r/flush)))

(defn mouse-down
  ([element]
   (.mouseDown fireEvent element)
   (r/flush))
  ([element options]
   (.mouseDown fireEvent element (clj->js options))
   (r/flush)))

(defn mouse-enter
  ([element]
   (.mouseEnter fireEvent element)
   (r/flush))
  ([element options]
   (.mouseEnter fireEvent element (clj->js options))
   (r/flush)))

(defn mouse-leave
  ([element]
   (.mouseLeave fireEvent element)
   (r/flush))
  ([element options]
   (.mouseLeave fireEvent element (clj->js options))
   (r/flush)))

(defn mouse-move
  ([element]
   (.mouseMove fireEvent element)
   (r/flush))
  ([element options]
   (.mouseMove fireEvent element (clj->js options))
   (r/flush)))

(defn mouse-out
  ([element]
   (.mouseOut fireEvent element)
   (r/flush))
  ([element options]
   (.mouseOut fireEvent element (clj->js options))
   (r/flush)))

(defn mouse-over
  ([element]
   (.mouseOver fireEvent element)
   (r/flush))
  ([element options]
   (.mouseOver fireEvent element (clj->js options))
   (r/flush)))

(defn mouse-up
  ([element]
   (.mouseUp fireEvent element)
   (r/flush))
  ([element options]
   (.mouseUp fireEvent element (clj->js options))
   (r/flush)))

(defn pop-state
  ([element]
   (.popState fireEvent element)
   (r/flush))
  ([element options]
   (.popState fireEvent element (clj->js options))
   (r/flush)))

(defn select
  ([element]
   (.select fireEvent element)
   (r/flush))
  ([element options]
   (.select fireEvent element (clj->js options))
   (r/flush)))

(defn touch-cancel
  ([element]
   (.touchCancel fireEvent element)
   (r/flush))
  ([element options]
   (.touchCancel fireEvent element (clj->js options))
   (r/flush)))

(defn touch-end
  ([element]
   (.touchEnd fireEvent element)
   (r/flush))
  ([element options]
   (.touchEnd fireEvent element (clj->js options))
   (r/flush)))

(defn touch-move
  ([element]
   (.touchMove fireEvent element)
   (r/flush))
  ([element options]
   (.touchMove fireEvent element (clj->js options))
   (r/flush)))

(defn touch-start
  ([element]
   (.touchStart fireEvent element)
   (r/flush))
  ([element options]
   (.touchStart fireEvent element (clj->js options))
   (r/flush)))

(defn scroll
  ([element]
   (.scroll fireEvent element)
   (r/flush))
  ([element options]
   (.scroll fireEvent element (clj->js options))
   (r/flush)))

(defn wheel
  ([element]
   (.wheel fireEvent element)
   (r/flush))
  ([element options]
   (.wheel fireEvent element (clj->js options))
   (r/flush)))

(defn abort
  ([element]
   (.abort fireEvent element)
   (r/flush))
  ([element options]
   (.abort fireEvent element (clj->js options))
   (r/flush)))

(defn can-play
  ([element]
   (.canPlay fireEvent element)
   (r/flush))
  ([element options]
   (.canPlay fireEvent element (clj->js options))
   (r/flush)))

(defn can-play-through
  ([element]
   (.canPlayThrough fireEvent element)
   (r/flush))
  ([element options]
   (.canPlayThrough fireEvent element (clj->js options))
   (r/flush)))

(defn duration-change
  ([element]
   (.durationChange fireEvent element)
   (r/flush))
  ([element options]
   (.durationChange fireEvent element (clj->js options))
   (r/flush)))

(defn emptied
  ([element]
   (.emptied fireEvent element)
   (r/flush))
  ([element options]
   (.emptied fireEvent element (clj->js options))
   (r/flush)))

(defn encrypted
  ([element]
   (.encrypted fireEvent element)
   (r/flush))
  ([element options]
   (.encrypted fireEvent element (clj->js options))
   (r/flush)))

(defn ended
  ([element]
   (.ended fireEvent element)
   (r/flush))
  ([element options]
   (.ended fireEvent element (clj->js options))
   (r/flush)))

(defn loaded-data
  ([element]
   (.loadedData fireEvent element)
   (r/flush))
  ([element options]
   (.loadedData fireEvent element (clj->js options))
   (r/flush)))

(defn loaded-metadata
  ([element]
   (.loadedMetadata fireEvent element)
   (r/flush))
  ([element options]
   (.loadedMetadata fireEvent element (clj->js options))
   (r/flush)))

(defn load-start
  ([element]
   (.loadStart fireEvent element)
   (r/flush))
  ([element options]
   (.loadStart fireEvent element (clj->js options))
   (r/flush)))

(defn pause
  ([element]
   (.pause fireEvent element)
   (r/flush))
  ([element options]
   (.pause fireEvent element (clj->js options))
   (r/flush)))

(defn play
  ([element]
   (.play fireEvent element)
   (r/flush))
  ([element options]
   (.play fireEvent element (clj->js options))
   (r/flush)))

(defn playing
  ([element]
   (.playing fireEvent element)
   (r/flush))
  ([element options]
   (.playing fireEvent element (clj->js options))
   (r/flush)))

(defn progress
  ([element]
   (.progress fireEvent element)
   (r/flush))
  ([element options]
   (.progress fireEvent element (clj->js options))
   (r/flush)))

(defn rate-change
  ([element]
   (.rateChange fireEvent element)
   (r/flush))
  ([element options]
   (.rateChange fireEvent element (clj->js options))
   (r/flush)))

(defn seeked
  ([element]
   (.seeked fireEvent element)
   (r/flush))
  ([element options]
   (.seeked fireEvent element (clj->js options))
   (r/flush)))

(defn seeking
  ([element]
   (.seeking fireEvent element)
   (r/flush))
  ([element options]
   (.seeking fireEvent element (clj->js options))
   (r/flush)))

(defn stalled
  ([element]
   (.stalled fireEvent element)
   (r/flush))
  ([element options]
   (.stalled fireEvent element (clj->js options))
   (r/flush)))

(defn suspend
  ([element]
   (.suspend fireEvent element)
   (r/flush))
  ([element options]
   (.suspend fireEvent element (clj->js options))
   (r/flush)))

(defn time-update
  ([element]
   (.timeUpdate fireEvent element)
   (r/flush))
  ([element options]
   (.timeUpdate fireEvent element (clj->js options))
   (r/flush)))

(defn volume-change
  ([element]
   (.volumeChange fireEvent element)
   (r/flush))
  ([element options]
   (.volumeChange fireEvent element (clj->js options))
   (r/flush)))

(defn waiting
  ([element]
   (.waiting fireEvent element)
   (r/flush))
  ([element options]
   (.waiting fireEvent element (clj->js options))
   (r/flush)))

(defn load
  ([element]
   (.load fireEvent element)
   (r/flush))
  ([element options]
   (.load fireEvent element (clj->js options))
   (r/flush)))

(defn error
  ([element]
   (.error fireEvent element)
   (r/flush))
  ([element options]
   (.error fireEvent element (clj->js options))
   (r/flush)))

(defn animation-start
  ([element]
   (.animationStart fireEvent element)
   (r/flush))
  ([element options]
   (.animationStart fireEvent element (clj->js options))
   (r/flush)))

(defn animation-end
  ([element]
   (.animationEnd fireEvent element)
   (r/flush))
  ([element options]
   (.animationEnd fireEvent element (clj->js options))
   (r/flush)))

(defn animation-iteration
  ([element]
   (.animationIteration fireEvent element)
   (r/flush))
  ([element options]
   (.animationIteration fireEvent element (clj->js options))
   (r/flush)))

(defn transition-end
  ([element]
   (.transitionEnd fireEvent element)
   (r/flush))
  ([element options]
   (.transitionEnd fireEvent element (clj->js options))
   (r/flush)))

(defn double-click
  ([element]
   (.doubleClick fireEvent element)
   (r/flush))
  ([element options]
   (.doubleClick fireEvent element (clj->js options))
   (r/flush)))

(defn pointer-over
  ([element]
   (.pointerOver fireEvent element)
   (r/flush))
  ([element options]
   (.pointerOver fireEvent element (clj->js options))
   (r/flush)))

(defn pointer-enter
  ([element]
   (.pointerEnter fireEvent element)
   (r/flush))
  ([element options]
   (.pointerEnter fireEvent element (clj->js options))
   (r/flush)))

(defn pointer-down
  ([element]
   (.pointerDown fireEvent element)
   (r/flush))
  ([element options]
   (.pointerDown fireEvent element (clj->js options))
   (r/flush)))

(defn pointer-move
  ([element]
   (.pointerMove fireEvent element)
   (r/flush))
  ([element options]
   (.pointerMove fireEvent element (clj->js options))
   (r/flush)))

(defn pointer-up
  ([element]
   (.pointerUp fireEvent element)
   (r/flush))
  ([element options]
   (.pointerUp fireEvent element (clj->js options))
   (r/flush)))

(defn pointer-cancel
  ([element]
   (.pointerCancel fireEvent element)
   (r/flush))
  ([element options]
   (.pointerCancel fireEvent element (clj->js options))
   (r/flush)))

(defn pointer-out
  ([element]
   (.pointerOut fireEvent element)
   (r/flush))
  ([element options]
   (.pointerOut fireEvent element (clj->js options))
   (r/flush)))

(defn pointer-leave
  ([element]
   (.pointerLeave fireEvent element)
   (r/flush))
  ([element options]
   (.pointerLeave fireEvent element (clj->js options))
   (r/flush)))

(defn got-pointer-capture
  ([element]
   (.gotPointerCapture fireEvent element)
   (r/flush))
  ([element options]
   (.gotPointerCapture fireEvent element (clj->js options))
   (r/flush)))

(defn lost-pointer-capture
  ([element]
   (.lostPointerCapture fireEvent element)
   (r/flush))
  ([element options]
   (.lostPointerCapture fireEvent element (clj->js options))
   (r/flush)))
;; End - Generated Code (Do not modify manually)
