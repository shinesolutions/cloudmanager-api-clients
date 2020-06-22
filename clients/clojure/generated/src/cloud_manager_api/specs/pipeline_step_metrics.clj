(ns cloud-manager-api.specs.pipeline-step-metrics
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [cloud-manager-api.specs.metric :refer :all]
            )
  (:import (java.io File)))


(def pipeline-step-metrics-data
  {
   (ds/opt :metrics) (s/coll-of metric-spec)
   })

(def pipeline-step-metrics-spec
  (ds/spec
    {:name ::pipeline-step-metrics
     :spec pipeline-step-metrics-data}))
