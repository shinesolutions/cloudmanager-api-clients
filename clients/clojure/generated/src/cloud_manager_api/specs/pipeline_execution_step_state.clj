(ns cloud-manager-api.specs.pipeline-execution-step-state
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [cloud-manager-api.specs.pipeline-execution-step-state-links :refer :all]
            )
  (:import (java.io File)))


(def pipeline-execution-step-state-data
  {
   (ds/opt :id) string?
   (ds/opt :stepId) string?
   (ds/opt :phaseId) string?
   (ds/opt :action) string?
   (ds/opt :repository) string?
   (ds/opt :branch) string?
   (ds/opt :environment) string?
   (ds/opt :environmentType) string?
   (ds/opt :startedAt) inst?
   (ds/opt :finishedAt) inst?
   (ds/opt :details) (s/map-of string? any?)
   (ds/opt :status) string?
   (ds/opt :_links) pipeline-execution-step-state-links-spec
   })

(def pipeline-execution-step-state-spec
  (ds/spec
    {:name ::pipeline-execution-step-state
     :spec pipeline-execution-step-state-data}))
