(ns react-testing-library-cljs.fire-event
  (:require
   ["@testing-library/react" :refer [fireEvent]]))

;; Refer to https://testing-library.com/docs/dom-testing-library/api-events/ for more details about events
;; Begin - Generated Code (Do not modify manually)
(defn copy
  ([element]
   (.copy fireEvent element))
  ([element options]
   (.copy fireEvent element (clj->js options))))

(defn cut
  ([element]
   (.cut fireEvent element))
  ([element options]
   (.cut fireEvent element (clj->js options))))

(defn paste
  ([element]
   (.paste fireEvent element))
  ([element options]
   (.paste fireEvent element (clj->js options))))

(defn composition-end
  ([element]
   (.compositionEnd fireEvent element))
  ([element options]
   (.compositionEnd fireEvent element (clj->js options))))

(defn composition-start
  ([element]
   (.compositionStart fireEvent element))
  ([element options]
   (.compositionStart fireEvent element (clj->js options))))

(defn composition-update
  ([element]
   (.compositionUpdate fireEvent element))
  ([element options]
   (.compositionUpdate fireEvent element (clj->js options))))

(defn key-down
  ([element]
   (.keyDown fireEvent element))
  ([element options]
   (.keyDown fireEvent element (clj->js options))))

(defn key-press
  ([element]
   (.keyPress fireEvent element))
  ([element options]
   (.keyPress fireEvent element (clj->js options))))

(defn key-up
  ([element]
   (.keyUp fireEvent element))
  ([element options]
   (.keyUp fireEvent element (clj->js options))))

(defn focus
  ([element]
   (.focus fireEvent element))
  ([element options]
   (.focus fireEvent element (clj->js options))))

(defn blur
  ([element]
   (.blur fireEvent element))
  ([element options]
   (.blur fireEvent element (clj->js options))))

(defn focus-in
  ([element]
   (.focusIn fireEvent element))
  ([element options]
   (.focusIn fireEvent element (clj->js options))))

(defn focus-out
  ([element]
   (.focusOut fireEvent element))
  ([element options]
   (.focusOut fireEvent element (clj->js options))))

(defn change
  ([element]
   (.change fireEvent element))
  ([element options]
   (.change fireEvent element (clj->js options))))

(defn input
  ([element]
   (.input fireEvent element))
  ([element options]
   (.input fireEvent element (clj->js options))))

(defn invalid
  ([element]
   (.invalid fireEvent element))
  ([element options]
   (.invalid fireEvent element (clj->js options))))

(defn submit
  ([element]
   (.submit fireEvent element))
  ([element options]
   (.submit fireEvent element (clj->js options))))

(defn reset
  ([element]
   (.reset fireEvent element))
  ([element options]
   (.reset fireEvent element (clj->js options))))

(defn click
  ([element]
   (.click fireEvent element))
  ([element options]
   (.click fireEvent element (clj->js options))))

(defn context-menu
  ([element]
   (.contextMenu fireEvent element))
  ([element options]
   (.contextMenu fireEvent element (clj->js options))))

(defn dbl-click
  ([element]
   (.dblClick fireEvent element))
  ([element options]
   (.dblClick fireEvent element (clj->js options))))

(defn drag
  ([element]
   (.drag fireEvent element))
  ([element options]
   (.drag fireEvent element (clj->js options))))

(defn drag-end
  ([element]
   (.dragEnd fireEvent element))
  ([element options]
   (.dragEnd fireEvent element (clj->js options))))

(defn drag-enter
  ([element]
   (.dragEnter fireEvent element))
  ([element options]
   (.dragEnter fireEvent element (clj->js options))))

(defn drag-exit
  ([element]
   (.dragExit fireEvent element))
  ([element options]
   (.dragExit fireEvent element (clj->js options))))

(defn drag-leave
  ([element]
   (.dragLeave fireEvent element))
  ([element options]
   (.dragLeave fireEvent element (clj->js options))))

(defn drag-over
  ([element]
   (.dragOver fireEvent element))
  ([element options]
   (.dragOver fireEvent element (clj->js options))))

(defn drag-start
  ([element]
   (.dragStart fireEvent element))
  ([element options]
   (.dragStart fireEvent element (clj->js options))))

(defn drop
  ([element]
   (.drop fireEvent element))
  ([element options]
   (.drop fireEvent element (clj->js options))))

(defn mouse-down
  ([element]
   (.mouseDown fireEvent element))
  ([element options]
   (.mouseDown fireEvent element (clj->js options))))

(defn mouse-enter
  ([element]
   (.mouseEnter fireEvent element))
  ([element options]
   (.mouseEnter fireEvent element (clj->js options))))

(defn mouse-leave
  ([element]
   (.mouseLeave fireEvent element))
  ([element options]
   (.mouseLeave fireEvent element (clj->js options))))

(defn mouse-move
  ([element]
   (.mouseMove fireEvent element))
  ([element options]
   (.mouseMove fireEvent element (clj->js options))))

(defn mouse-out
  ([element]
   (.mouseOut fireEvent element))
  ([element options]
   (.mouseOut fireEvent element (clj->js options))))

(defn mouse-over
  ([element]
   (.mouseOver fireEvent element))
  ([element options]
   (.mouseOver fireEvent element (clj->js options))))

(defn mouse-up
  ([element]
   (.mouseUp fireEvent element))
  ([element options]
   (.mouseUp fireEvent element (clj->js options))))

(defn pop-state
  ([element]
   (.popState fireEvent element))
  ([element options]
   (.popState fireEvent element (clj->js options))))

(defn select
  ([element]
   (.select fireEvent element))
  ([element options]
   (.select fireEvent element (clj->js options))))

(defn touch-cancel
  ([element]
   (.touchCancel fireEvent element))
  ([element options]
   (.touchCancel fireEvent element (clj->js options))))

(defn touch-end
  ([element]
   (.touchEnd fireEvent element))
  ([element options]
   (.touchEnd fireEvent element (clj->js options))))

(defn touch-move
  ([element]
   (.touchMove fireEvent element))
  ([element options]
   (.touchMove fireEvent element (clj->js options))))

(defn touch-start
  ([element]
   (.touchStart fireEvent element))
  ([element options]
   (.touchStart fireEvent element (clj->js options))))

(defn scroll
  ([element]
   (.scroll fireEvent element))
  ([element options]
   (.scroll fireEvent element (clj->js options))))

(defn wheel
  ([element]
   (.wheel fireEvent element))
  ([element options]
   (.wheel fireEvent element (clj->js options))))

(defn abort
  ([element]
   (.abort fireEvent element))
  ([element options]
   (.abort fireEvent element (clj->js options))))

(defn can-play
  ([element]
   (.canPlay fireEvent element))
  ([element options]
   (.canPlay fireEvent element (clj->js options))))

(defn can-play-through
  ([element]
   (.canPlayThrough fireEvent element))
  ([element options]
   (.canPlayThrough fireEvent element (clj->js options))))

(defn duration-change
  ([element]
   (.durationChange fireEvent element))
  ([element options]
   (.durationChange fireEvent element (clj->js options))))

(defn emptied
  ([element]
   (.emptied fireEvent element))
  ([element options]
   (.emptied fireEvent element (clj->js options))))

(defn encrypted
  ([element]
   (.encrypted fireEvent element))
  ([element options]
   (.encrypted fireEvent element (clj->js options))))

(defn ended
  ([element]
   (.ended fireEvent element))
  ([element options]
   (.ended fireEvent element (clj->js options))))

(defn loaded-data
  ([element]
   (.loadedData fireEvent element))
  ([element options]
   (.loadedData fireEvent element (clj->js options))))

(defn loaded-metadata
  ([element]
   (.loadedMetadata fireEvent element))
  ([element options]
   (.loadedMetadata fireEvent element (clj->js options))))

(defn load-start
  ([element]
   (.loadStart fireEvent element))
  ([element options]
   (.loadStart fireEvent element (clj->js options))))

(defn pause
  ([element]
   (.pause fireEvent element))
  ([element options]
   (.pause fireEvent element (clj->js options))))

(defn play
  ([element]
   (.play fireEvent element))
  ([element options]
   (.play fireEvent element (clj->js options))))

(defn playing
  ([element]
   (.playing fireEvent element))
  ([element options]
   (.playing fireEvent element (clj->js options))))

(defn progress
  ([element]
   (.progress fireEvent element))
  ([element options]
   (.progress fireEvent element (clj->js options))))

(defn rate-change
  ([element]
   (.rateChange fireEvent element))
  ([element options]
   (.rateChange fireEvent element (clj->js options))))

(defn seeked
  ([element]
   (.seeked fireEvent element))
  ([element options]
   (.seeked fireEvent element (clj->js options))))

(defn seeking
  ([element]
   (.seeking fireEvent element))
  ([element options]
   (.seeking fireEvent element (clj->js options))))

(defn stalled
  ([element]
   (.stalled fireEvent element))
  ([element options]
   (.stalled fireEvent element (clj->js options))))

(defn suspend
  ([element]
   (.suspend fireEvent element))
  ([element options]
   (.suspend fireEvent element (clj->js options))))

(defn time-update
  ([element]
   (.timeUpdate fireEvent element))
  ([element options]
   (.timeUpdate fireEvent element (clj->js options))))

(defn volume-change
  ([element]
   (.volumeChange fireEvent element))
  ([element options]
   (.volumeChange fireEvent element (clj->js options))))

(defn waiting
  ([element]
   (.waiting fireEvent element))
  ([element options]
   (.waiting fireEvent element (clj->js options))))

(defn load
  ([element]
   (.load fireEvent element))
  ([element options]
   (.load fireEvent element (clj->js options))))

(defn error
  ([element]
   (.error fireEvent element))
  ([element options]
   (.error fireEvent element (clj->js options))))

(defn animation-start
  ([element]
   (.animationStart fireEvent element))
  ([element options]
   (.animationStart fireEvent element (clj->js options))))

(defn animation-end
  ([element]
   (.animationEnd fireEvent element))
  ([element options]
   (.animationEnd fireEvent element (clj->js options))))

(defn animation-iteration
  ([element]
   (.animationIteration fireEvent element))
  ([element options]
   (.animationIteration fireEvent element (clj->js options))))

(defn transition-end
  ([element]
   (.transitionEnd fireEvent element))
  ([element options]
   (.transitionEnd fireEvent element (clj->js options))))

(defn double-click
  ([element]
   (.doubleClick fireEvent element))
  ([element options]
   (.doubleClick fireEvent element (clj->js options))))

(defn pointer-over
  ([element]
   (.pointerOver fireEvent element))
  ([element options]
   (.pointerOver fireEvent element (clj->js options))))

(defn pointer-enter
  ([element]
   (.pointerEnter fireEvent element))
  ([element options]
   (.pointerEnter fireEvent element (clj->js options))))

(defn pointer-down
  ([element]
   (.pointerDown fireEvent element))
  ([element options]
   (.pointerDown fireEvent element (clj->js options))))

(defn pointer-move
  ([element]
   (.pointerMove fireEvent element))
  ([element options]
   (.pointerMove fireEvent element (clj->js options))))

(defn pointer-up
  ([element]
   (.pointerUp fireEvent element))
  ([element options]
   (.pointerUp fireEvent element (clj->js options))))

(defn pointer-cancel
  ([element]
   (.pointerCancel fireEvent element))
  ([element options]
   (.pointerCancel fireEvent element (clj->js options))))

(defn pointer-out
  ([element]
   (.pointerOut fireEvent element))
  ([element options]
   (.pointerOut fireEvent element (clj->js options))))

(defn pointer-leave
  ([element]
   (.pointerLeave fireEvent element))
  ([element options]
   (.pointerLeave fireEvent element (clj->js options))))

(defn got-pointer-capture
  ([element]
   (.gotPointerCapture fireEvent element))
  ([element options]
   (.gotPointerCapture fireEvent element (clj->js options))))

(defn lost-pointer-capture
  ([element]
   (.lostPointerCapture fireEvent element))
  ([element options]
   (.lostPointerCapture fireEvent element (clj->js options))))
;; End - Generated Code (Do not modify manually)
