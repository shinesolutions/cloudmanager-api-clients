(ns cloud-manager-api.specs.pipeline-list-embedded
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [cloud-manager-api.specs.pipeline :refer :all]
            )
  (:import (java.io File)))


(def pipeline-list-embedded-data
  {
   (ds/opt :pipelines) (s/coll-of pipeline-spec)
   })

(def pipeline-list-embedded-spec
  (ds/spec
    {:name ::pipeline-list-embedded
     :spec pipeline-list-embedded-data}))
