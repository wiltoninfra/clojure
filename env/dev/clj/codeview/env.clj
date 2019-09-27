(ns codeview.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [codeview.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[codeview started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[codeview has shut down successfully]=-"))
   :middleware wrap-dev})
