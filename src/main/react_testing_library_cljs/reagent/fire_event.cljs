(ns react-testing-library-cljs.reagent.fire-event
  (:require
   ["@testing-library/react" :refer [fireEvent]]
   [reagent.core :as r]))

;; Refer to https://testing-library.com/docs/dom-testing-library/api-events/ for more details about events
;; Begin - Generated Code (Do not modify manually)
(defn copy
  ([element]
   (.-copy fireEvent element))
  ([element options]
   (.-copy fireEvent element options)
   (r/flush)))

(defn cut
  ([element]
   (.-cut fireEvent element))
  ([element options]
   (.-cut fireEvent element options)
   (r/flush)))

(defn paste
  ([element]
   (.-paste fireEvent element))
  ([element options]
   (.-paste fireEvent element options)
   (r/flush)))

(defn composition-end
  ([element]
   (.-compositionEnd fireEvent element))
  ([element options]
   (.-compositionEnd fireEvent element options)
   (r/flush)))

(defn composition-start
  ([element]
   (.-compositionStart fireEvent element))
  ([element options]
   (.-compositionStart fireEvent element options)
   (r/flush)))

(defn composition-update
  ([element]
   (.-compositionUpdate fireEvent element))
  ([element options]
   (.-compositionUpdate fireEvent element options)
   (r/flush)))

(defn key-down
  ([element]
   (.-keyDown fireEvent element))
  ([element options]
   (.-keyDown fireEvent element options)
   (r/flush)))

(defn key-press
  ([element]
   (.-keyPress fireEvent element))
  ([element options]
   (.-keyPress fireEvent element options)
   (r/flush)))

(defn key-up
  ([element]
   (.-keyUp fireEvent element))
  ([element options]
   (.-keyUp fireEvent element options)
   (r/flush)))

(defn focus
  ([element]
   (.-focus fireEvent element))
  ([element options]
   (.-focus fireEvent element options)
   (r/flush)))

(defn blur
  ([element]
   (.-blur fireEvent element))
  ([element options]
   (.-blur fireEvent element options)
   (r/flush)))

(defn focus-in
  ([element]
   (.-focusIn fireEvent element))
  ([element options]
   (.-focusIn fireEvent element options)
   (r/flush)))

(defn focus-out
  ([element]
   (.-focusOut fireEvent element))
  ([element options]
   (.-focusOut fireEvent element options)
   (r/flush)))

(defn change
  ([element]
   (.-change fireEvent element))
  ([element options]
   (.-change fireEvent element options)
   (r/flush)))

(defn input
  ([element]
   (.-input fireEvent element))
  ([element options]
   (.-input fireEvent element options)
   (r/flush)))

(defn invalid
  ([element]
   (.-invalid fireEvent element))
  ([element options]
   (.-invalid fireEvent element options)
   (r/flush)))

(defn submit
  ([element]
   (.-submit fireEvent element))
  ([element options]
   (.-submit fireEvent element options)
   (r/flush)))

(defn reset
  ([element]
   (.-reset fireEvent element))
  ([element options]
   (.-reset fireEvent element options)
   (r/flush)))

(defn click
  ([element]
   (.-click fireEvent element))
  ([element options]
   (.-click fireEvent element options)
   (r/flush)))

(defn context-menu
  ([element]
   (.-contextMenu fireEvent element))
  ([element options]
   (.-contextMenu fireEvent element options)
   (r/flush)))

(defn dbl-click
  ([element]
   (.-dblClick fireEvent element))
  ([element options]
   (.-dblClick fireEvent element options)
   (r/flush)))

(defn drag
  ([element]
   (.-drag fireEvent element))
  ([element options]
   (.-drag fireEvent element options)
   (r/flush)))

(defn drag-end
  ([element]
   (.-dragEnd fireEvent element))
  ([element options]
   (.-dragEnd fireEvent element options)
   (r/flush)))

(defn drag-enter
  ([element]
   (.-dragEnter fireEvent element))
  ([element options]
   (.-dragEnter fireEvent element options)
   (r/flush)))

(defn drag-exit
  ([element]
   (.-dragExit fireEvent element))
  ([element options]
   (.-dragExit fireEvent element options)
   (r/flush)))

(defn drag-leave
  ([element]
   (.-dragLeave fireEvent element))
  ([element options]
   (.-dragLeave fireEvent element options)
   (r/flush)))

(defn drag-over
  ([element]
   (.-dragOver fireEvent element))
  ([element options]
   (.-dragOver fireEvent element options)
   (r/flush)))

(defn drag-start
  ([element]
   (.-dragStart fireEvent element))
  ([element options]
   (.-dragStart fireEvent element options)
   (r/flush)))

(defn drop
  ([element]
   (.-drop fireEvent element))
  ([element options]
   (.-drop fireEvent element options)
   (r/flush)))

(defn mouse-down
  ([element]
   (.-mouseDown fireEvent element))
  ([element options]
   (.-mouseDown fireEvent element options)
   (r/flush)))

(defn mouse-enter
  ([element]
   (.-mouseEnter fireEvent element))
  ([element options]
   (.-mouseEnter fireEvent element options)
   (r/flush)))

(defn mouse-leave
  ([element]
   (.-mouseLeave fireEvent element))
  ([element options]
   (.-mouseLeave fireEvent element options)
   (r/flush)))

(defn mouse-move
  ([element]
   (.-mouseMove fireEvent element))
  ([element options]
   (.-mouseMove fireEvent element options)
   (r/flush)))

(defn mouse-out
  ([element]
   (.-mouseOut fireEvent element))
  ([element options]
   (.-mouseOut fireEvent element options)
   (r/flush)))

(defn mouse-over
  ([element]
   (.-mouseOver fireEvent element))
  ([element options]
   (.-mouseOver fireEvent element options)
   (r/flush)))

(defn mouse-up
  ([element]
   (.-mouseUp fireEvent element))
  ([element options]
   (.-mouseUp fireEvent element options)
   (r/flush)))

(defn pop-state
  ([element]
   (.-popState fireEvent element))
  ([element options]
   (.-popState fireEvent element options)
   (r/flush)))

(defn select
  ([element]
   (.-select fireEvent element))
  ([element options]
   (.-select fireEvent element options)
   (r/flush)))

(defn touch-cancel
  ([element]
   (.-touchCancel fireEvent element))
  ([element options]
   (.-touchCancel fireEvent element options)
   (r/flush)))

(defn touch-end
  ([element]
   (.-touchEnd fireEvent element))
  ([element options]
   (.-touchEnd fireEvent element options)
   (r/flush)))

(defn touch-move
  ([element]
   (.-touchMove fireEvent element))
  ([element options]
   (.-touchMove fireEvent element options)
   (r/flush)))

(defn touch-start
  ([element]
   (.-touchStart fireEvent element))
  ([element options]
   (.-touchStart fireEvent element options)
   (r/flush)))

(defn scroll
  ([element]
   (.-scroll fireEvent element))
  ([element options]
   (.-scroll fireEvent element options)
   (r/flush)))

(defn wheel
  ([element]
   (.-wheel fireEvent element))
  ([element options]
   (.-wheel fireEvent element options)
   (r/flush)))

(defn abort
  ([element]
   (.-abort fireEvent element))
  ([element options]
   (.-abort fireEvent element options)
   (r/flush)))

(defn can-play
  ([element]
   (.-canPlay fireEvent element))
  ([element options]
   (.-canPlay fireEvent element options)
   (r/flush)))

(defn can-play-through
  ([element]
   (.-canPlayThrough fireEvent element))
  ([element options]
   (.-canPlayThrough fireEvent element options)
   (r/flush)))

(defn duration-change
  ([element]
   (.-durationChange fireEvent element))
  ([element options]
   (.-durationChange fireEvent element options)
   (r/flush)))

(defn emptied
  ([element]
   (.-emptied fireEvent element))
  ([element options]
   (.-emptied fireEvent element options)
   (r/flush)))

(defn encrypted
  ([element]
   (.-encrypted fireEvent element))
  ([element options]
   (.-encrypted fireEvent element options)
   (r/flush)))

(defn ended
  ([element]
   (.-ended fireEvent element))
  ([element options]
   (.-ended fireEvent element options)
   (r/flush)))

(defn loaded-data
  ([element]
   (.-loadedData fireEvent element))
  ([element options]
   (.-loadedData fireEvent element options)
   (r/flush)))

(defn loaded-metadata
  ([element]
   (.-loadedMetadata fireEvent element))
  ([element options]
   (.-loadedMetadata fireEvent element options)
   (r/flush)))

(defn load-start
  ([element]
   (.-loadStart fireEvent element))
  ([element options]
   (.-loadStart fireEvent element options)
   (r/flush)))

(defn pause
  ([element]
   (.-pause fireEvent element))
  ([element options]
   (.-pause fireEvent element options)
   (r/flush)))

(defn play
  ([element]
   (.-play fireEvent element))
  ([element options]
   (.-play fireEvent element options)
   (r/flush)))

(defn playing
  ([element]
   (.-playing fireEvent element))
  ([element options]
   (.-playing fireEvent element options)
   (r/flush)))

(defn progress
  ([element]
   (.-progress fireEvent element))
  ([element options]
   (.-progress fireEvent element options)
   (r/flush)))

(defn rate-change
  ([element]
   (.-rateChange fireEvent element))
  ([element options]
   (.-rateChange fireEvent element options)
   (r/flush)))

(defn seeked
  ([element]
   (.-seeked fireEvent element))
  ([element options]
   (.-seeked fireEvent element options)
   (r/flush)))

(defn seeking
  ([element]
   (.-seeking fireEvent element))
  ([element options]
   (.-seeking fireEvent element options)
   (r/flush)))

(defn stalled
  ([element]
   (.-stalled fireEvent element))
  ([element options]
   (.-stalled fireEvent element options)
   (r/flush)))

(defn suspend
  ([element]
   (.-suspend fireEvent element))
  ([element options]
   (.-suspend fireEvent element options)
   (r/flush)))

(defn time-update
  ([element]
   (.-timeUpdate fireEvent element))
  ([element options]
   (.-timeUpdate fireEvent element options)
   (r/flush)))

(defn volume-change
  ([element]
   (.-volumeChange fireEvent element))
  ([element options]
   (.-volumeChange fireEvent element options)
   (r/flush)))

(defn waiting
  ([element]
   (.-waiting fireEvent element))
  ([element options]
   (.-waiting fireEvent element options)
   (r/flush)))

(defn load
  ([element]
   (.-load fireEvent element))
  ([element options]
   (.-load fireEvent element options)
   (r/flush)))

(defn error
  ([element]
   (.-error fireEvent element))
  ([element options]
   (.-error fireEvent element options)
   (r/flush)))

(defn animation-start
  ([element]
   (.-animationStart fireEvent element))
  ([element options]
   (.-animationStart fireEvent element options)
   (r/flush)))

(defn animation-end
  ([element]
   (.-animationEnd fireEvent element))
  ([element options]
   (.-animationEnd fireEvent element options)
   (r/flush)))

(defn animation-iteration
  ([element]
   (.-animationIteration fireEvent element))
  ([element options]
   (.-animationIteration fireEvent element options)
   (r/flush)))

(defn transition-end
  ([element]
   (.-transitionEnd fireEvent element))
  ([element options]
   (.-transitionEnd fireEvent element options)
   (r/flush)))

(defn double-click
  ([element]
   (.-doubleClick fireEvent element))
  ([element options]
   (.-doubleClick fireEvent element options)
   (r/flush)))

(defn pointer-over
  ([element]
   (.-pointerOver fireEvent element))
  ([element options]
   (.-pointerOver fireEvent element options)
   (r/flush)))

(defn pointer-enter
  ([element]
   (.-pointerEnter fireEvent element))
  ([element options]
   (.-pointerEnter fireEvent element options)
   (r/flush)))

(defn pointer-down
  ([element]
   (.-pointerDown fireEvent element))
  ([element options]
   (.-pointerDown fireEvent element options)
   (r/flush)))

(defn pointer-move
  ([element]
   (.-pointerMove fireEvent element))
  ([element options]
   (.-pointerMove fireEvent element options)
   (r/flush)))

(defn pointer-up
  ([element]
   (.-pointerUp fireEvent element))
  ([element options]
   (.-pointerUp fireEvent element options)
   (r/flush)))

(defn pointer-cancel
  ([element]
   (.-pointerCancel fireEvent element))
  ([element options]
   (.-pointerCancel fireEvent element options)
   (r/flush)))

(defn pointer-out
  ([element]
   (.-pointerOut fireEvent element))
  ([element options]
   (.-pointerOut fireEvent element options)
   (r/flush)))

(defn pointer-leave
  ([element]
   (.-pointerLeave fireEvent element))
  ([element options]
   (.-pointerLeave fireEvent element options)
   (r/flush)))

(defn got-pointer-capture
  ([element]
   (.-gotPointerCapture fireEvent element))
  ([element options]
   (.-gotPointerCapture fireEvent element options)
   (r/flush)))

(defn lost-pointer-capture
  ([element]
   (.-lostPointerCapture fireEvent element))
  ([element options]
   (.-lostPointerCapture fireEvent element options)
   (r/flush)))
;; End - Generated Code (Do not modify manually)
