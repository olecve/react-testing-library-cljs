#!/usr/bin/env bb

(require '[clojure.string :as str])

(def event-types
  ["copy"
   "cut"
   "paste"
   "compositionEnd"
   "compositionStart"
   "compositionUpdate"
   "keyDown"
   "keyPress"
   "keyUp"
   "focus"
   "blur"
   "focusIn"
   "focusOut"
   "change"
   "input"
   "invalid"
   "submit"
   "reset"
   "click"
   "contextMenu"
   "dblClick"
   "drag"
   "dragEnd"
   "dragEnter"
   "dragExit"
   "dragLeave"
   "dragOver"
   "dragStart"
   "drop"
   "mouseDown"
   "mouseEnter"
   "mouseLeave"
   "mouseMove"
   "mouseOut"
   "mouseOver"
   "mouseUp"
   "popState"
   "select"
   "touchCancel"
   "touchEnd"
   "touchMove"
   "touchStart"
   "scroll"
   "wheel"
   "abort"
   "canPlay"
   "canPlayThrough"
   "durationChange"
   "emptied"
   "encrypted"
   "ended"
   "loadedData"
   "loadedMetadata"
   "loadStart"
   "pause"
   "play"
   "playing"
   "progress"
   "rateChange"
   "seeked"
   "seeking"
   "stalled"
   "suspend"
   "timeUpdate"
   "volumeChange"
   "waiting"
   "load"
   "error"
   "animationStart"
   "animationEnd"
   "animationIteration"
   "transitionEnd"
   "doubleClick"
   "pointerOver"
   "pointerEnter"
   "pointerDown"
   "pointerMove"
   "pointerUp"
   "pointerCancel"
   "pointerOut"
   "pointerLeave"
   "gotPointerCapture"
   "lostPointerCapture"])

(def screen-source-file "../src/main/react_testing_library_cljs/fire_event.cljs")

(def begin-marker ";; Begin - Generated Code (Do not modify manually)\n")
(def end-marker ";; End - Generated Code (Do not modify manually)\n")

(def fire-event-fn-template (slurp "fire_event_fn.template.clj"))

(defn insert-string [original string position]
  (str (subs original 0 position)
       string
       (subs original position)))

(defn remove-string-between [string begin end]
  (str (subs string 0 begin)
       (subs string end)))

(defn camel-case->kebab-case [string]
  (reduce
   (fn [result char]
     (if (= (str char) (str/upper-case char))
       (str result "-" (str/lower-case char))
       (str result char)))
   ""
   string))

(let [event-type-fns (->> event-types
                          (map #(-> fire-event-fn-template
                                    (str/replace "$cljs-fn-name" (camel-case->kebab-case %))
                                    (str/replace "$js-event-type" %)))
                          (str/join "\n"))
      source-file (slurp screen-source-file)
      begin-position (+ (str/index-of source-file begin-marker) (count begin-marker))
      end-position (str/index-of source-file end-marker)
      source-file-updated (-> source-file
                              (remove-string-between begin-position end-position)
                              (insert-string event-type-fns begin-position))]
  (spit screen-source-file source-file-updated))
