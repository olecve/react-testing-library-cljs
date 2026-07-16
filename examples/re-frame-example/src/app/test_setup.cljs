(ns app.test-setup)

;; Provide a DOM for the :node-test build. global-jsdom/register installs the
;; jsdom globals (document, window, ...) that @testing-library/react needs.
(js/require "global-jsdom/register")

;; Opt into React's testing act() environment so state updates flush reliably.
(set! js/IS_REACT_ACT_ENVIRONMENT true)
