(ns react-testing-library-cljs.test-setup)

(js/require "global-jsdom/register")
(set! js/globalThis.IS_REACT_ACT_ENVIRONMENT true)
