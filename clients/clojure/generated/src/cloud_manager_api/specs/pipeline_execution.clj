(ns cloud-manager-api.specs.pipeline-execution
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [cloud-manager-api.specs.pipeline-execution-embedded :refer :all]
            [cloud-manager-api.specs.pipeline-execution-links :refer :all]
            )
  (:import (java.io File)))


(def pipeline-execution-data
  {
   (ds/opt :id) string?
   (ds/opt :programId) string?
   (ds/opt :pipelineId) string?
   (ds/opt :artifactsVersion) string?
   (ds/opt :user) string?
   (ds/opt :status) string?
   (ds/opt :trigger) string?
   (ds/opt :createdAt) inst?
   (ds/opt :updatedAt) inst?
   (ds/opt :finishedAt) inst?
   (ds/opt :_embedded) pipeline-execution-embedded-spec
   (ds/opt :_links) pipeline-execution-links-spec
   })

(def pipeline-execution-spec
  (ds/spec
    {:name ::pipeline-execution
     :spec pipeline-execution-data}))
