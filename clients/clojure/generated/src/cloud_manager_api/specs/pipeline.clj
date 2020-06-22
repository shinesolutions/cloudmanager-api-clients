(ns cloud-manager-api.specs.pipeline
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [cloud-manager-api.specs.pipeline-phase :refer :all]
            [cloud-manager-api.specs.pipeline-links :refer :all]
            )
  (:import (java.io File)))


(def pipeline-data
  {
   (ds/opt :id) string?
   (ds/opt :programId) string?
   (ds/req :name) string?
   (ds/opt :trigger) string?
   (ds/opt :status) string?
   (ds/opt :createdAt) inst?
   (ds/opt :updatedAt) inst?
   (ds/opt :lastStartedAt) inst?
   (ds/opt :lastFinishedAt) inst?
   (ds/req :phases) (s/coll-of pipeline-phase-spec)
   (ds/opt :_links) pipeline-links-spec
   })

(def pipeline-spec
  (ds/spec
    {:name ::pipeline
     :spec pipeline-data}))
