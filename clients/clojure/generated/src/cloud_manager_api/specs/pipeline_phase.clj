(ns cloud-manager-api.specs.pipeline-phase
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pipeline-phase-data
  {
   (ds/opt :name) string?
   (ds/req :type) string?
   (ds/opt :repositoryId) string?
   (ds/opt :branch) string?
   (ds/opt :environmentId) string?
   })

(def pipeline-phase-spec
  (ds/spec
    {:name ::pipeline-phase
     :spec pipeline-phase-data}))
