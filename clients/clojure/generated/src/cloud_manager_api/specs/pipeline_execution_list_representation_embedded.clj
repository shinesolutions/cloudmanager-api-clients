(ns cloud-manager-api.specs.pipeline-execution-list-representation-embedded
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [cloud-manager-api.specs.pipeline-execution :refer :all]
            )
  (:import (java.io File)))


(def pipeline-execution-list-representation-embedded-data
  {
   (ds/opt :executions) (s/coll-of pipeline-execution-spec)
   })

(def pipeline-execution-list-representation-embedded-spec
  (ds/spec
    {:name ::pipeline-execution-list-representation-embedded
     :spec pipeline-execution-list-representation-embedded-data}))
