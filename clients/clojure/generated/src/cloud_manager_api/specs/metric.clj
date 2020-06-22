(ns cloud-manager-api.specs.metric
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def metric-data
  {
   (ds/opt :id) string?
   (ds/opt :severity) string?
   (ds/opt :passed) boolean?
   (ds/opt :override) boolean?
   (ds/opt :actualValue) string?
   (ds/opt :expectedValue) string?
   (ds/opt :comparator) string?
   (ds/opt :kpi) string?
   })

(def metric-spec
  (ds/spec
    {:name ::metric
     :spec metric-data}))
