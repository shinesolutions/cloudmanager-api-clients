(ns cloud-manager-api.specs.pipeline-execution-embedded
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [cloud-manager-api.specs.pipeline-execution-step-state :refer :all]
            )
  (:import (java.io File)))


(def pipeline-execution-embedded-data
  {
   (ds/opt :stepStates) (s/coll-of pipeline-execution-step-state-spec)
   })

(def pipeline-execution-embedded-spec
  (ds/spec
    {:name ::pipeline-execution-embedded
     :spec pipeline-execution-embedded-data}))
