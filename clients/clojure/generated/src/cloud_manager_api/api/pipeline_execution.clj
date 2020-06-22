(ns cloud-manager-api.api.pipeline-execution
  (:require [cloud-manager-api.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]
            [cloud-manager-api.specs.program-list-links :refer :all]
            [cloud-manager-api.specs.pipeline-execution-embedded :refer :all]
            [cloud-manager-api.specs.pipeline-links :refer :all]
            [cloud-manager-api.specs.repository-branch-links :refer :all]
            [cloud-manager-api.specs.repository-links :refer :all]
            [cloud-manager-api.specs.environment-links :refer :all]
            [cloud-manager-api.specs.pipeline-execution-list-representation :refer :all]
            [cloud-manager-api.specs.program :refer :all]
            [cloud-manager-api.specs.branch-list-embedded :refer :all]
            [cloud-manager-api.specs.environment-log-links :refer :all]
            [cloud-manager-api.specs.pipeline-list :refer :all]
            [cloud-manager-api.specs.pipeline-execution :refer :all]
            [cloud-manager-api.specs.repository :refer :all]
            [cloud-manager-api.specs.repository-list-embedded :refer :all]
            [cloud-manager-api.specs.environment-logs :refer :all]
            [cloud-manager-api.specs.environment-log :refer :all]
            [cloud-manager-api.specs.pipeline-phase :refer :all]
            [cloud-manager-api.specs.pipeline-execution-step-state :refer :all]
            [cloud-manager-api.specs.pipeline-list-embedded :refer :all]
            [cloud-manager-api.specs.pipeline-step-metrics :refer :all]
            [cloud-manager-api.specs.program-links :refer :all]
            [cloud-manager-api.specs.hal-link :refer :all]
            [cloud-manager-api.specs.missing-parameter :refer :all]
            [cloud-manager-api.specs.environment-logs-links :refer :all]
            [cloud-manager-api.specs.repository-branch :refer :all]
            [cloud-manager-api.specs.pipeline-execution-step-state-links :refer :all]
            [cloud-manager-api.specs.variable-list-links :refer :all]
            [cloud-manager-api.specs.embedded-program :refer :all]
            [cloud-manager-api.specs.program-list :refer :all]
            [cloud-manager-api.specs.pipeline-execution-list-representation-links :refer :all]
            [cloud-manager-api.specs.pipeline :refer :all]
            [cloud-manager-api.specs.pipeline-execution-list-representation-embedded :refer :all]
            [cloud-manager-api.specs.pipeline-execution-links :refer :all]
            [cloud-manager-api.specs.environment :refer :all]
            [cloud-manager-api.specs.environment-list-embedded :refer :all]
            [cloud-manager-api.specs.branch-list :refer :all]
            [cloud-manager-api.specs.metric :refer :all]
            [cloud-manager-api.specs.invalid-parameter :refer :all]
            [cloud-manager-api.specs.program-list-embedded :refer :all]
            [cloud-manager-api.specs.variable :refer :all]
            [cloud-manager-api.specs.environment-logs-embedded :refer :all]
            [cloud-manager-api.specs.bad-request-error :refer :all]
            [cloud-manager-api.specs.variable-list :refer :all]
            [cloud-manager-api.specs.repository-list :refer :all]
            [cloud-manager-api.specs.requested-page-details :refer :all]
            [cloud-manager-api.specs.environment-list :refer :all]
            [cloud-manager-api.specs.variable-list-embedded :refer :all]
            )
  (:import (java.io File)))


(defn-spec advance-pipeline-execution-with-http-info any?
  "Advance
  Post to this url in order to advance the current pipeline execution, if paused and waiting for user interaction. Link is present in output only in that case. The input depends on the actual reason for which the pipeline execution stopped."
  [programId string?, pipelineId string?, executionId string?, phaseId string?, stepId string?, x-gw-ims-org-id string?, Authorization string?, x-api-key string?, Content-Type string?, body any?]
  (check-required-params programId pipelineId executionId phaseId stepId x-gw-ims-org-id Authorization x-api-key Content-Type body)
  (call-api "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/advance" :put
            {:path-params   {"programId" programId "pipelineId" pipelineId "executionId" executionId "phaseId" phaseId "stepId" stepId }
             :header-params {"x-gw-ims-org-id" x-gw-ims-org-id "Authorization" Authorization "x-api-key" x-api-key "Content-Type" Content-Type }
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json"]
             :accepts       []
             :auth-names    []}))

(defn-spec advance-pipeline-execution any?
  "Advance
  Post to this url in order to advance the current pipeline execution, if paused and waiting for user interaction. Link is present in output only in that case. The input depends on the actual reason for which the pipeline execution stopped."
  [programId string?, pipelineId string?, executionId string?, phaseId string?, stepId string?, x-gw-ims-org-id string?, Authorization string?, x-api-key string?, Content-Type string?, body any?]
  (let [res (:data (advance-pipeline-execution-with-http-info programId pipelineId executionId phaseId stepId x-gw-ims-org-id Authorization x-api-key Content-Type body))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


(defn-spec cancel-pipeline-execution-step-with-http-info any?
  "Cancel
  Post to this url in order to cancel the current pipeline execution. Link is present in output only in that case."
  [programId string?, pipelineId string?, executionId string?, phaseId string?, stepId string?, x-gw-ims-org-id string?, Authorization string?, x-api-key string?, Content-Type string?, body any?]
  (check-required-params programId pipelineId executionId phaseId stepId x-gw-ims-org-id Authorization x-api-key Content-Type body)
  (call-api "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/cancel" :put
            {:path-params   {"programId" programId "pipelineId" pipelineId "executionId" executionId "phaseId" phaseId "stepId" stepId }
             :header-params {"x-gw-ims-org-id" x-gw-ims-org-id "Authorization" Authorization "x-api-key" x-api-key "Content-Type" Content-Type }
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json"]
             :accepts       []
             :auth-names    []}))

(defn-spec cancel-pipeline-execution-step any?
  "Cancel
  Post to this url in order to cancel the current pipeline execution. Link is present in output only in that case."
  [programId string?, pipelineId string?, executionId string?, phaseId string?, stepId string?, x-gw-ims-org-id string?, Authorization string?, x-api-key string?, Content-Type string?, body any?]
  (let [res (:data (cancel-pipeline-execution-step-with-http-info programId pipelineId executionId phaseId stepId x-gw-ims-org-id Authorization x-api-key Content-Type body))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


(defn-spec get-current-execution-with-http-info any?
  "Get current pipeline execution
  Returns current pipeline execution if any."
  [programId string?, pipelineId string?, x-gw-ims-org-id string?, Authorization string?, x-api-key string?]
  (check-required-params programId pipelineId x-gw-ims-org-id Authorization x-api-key)
  (call-api "/api/program/{programId}/pipeline/{pipelineId}/execution" :get
            {:path-params   {"programId" programId "pipelineId" pipelineId }
             :header-params {"x-gw-ims-org-id" x-gw-ims-org-id "Authorization" Authorization "x-api-key" x-api-key }
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-current-execution pipeline-execution-spec
  "Get current pipeline execution
  Returns current pipeline execution if any."
  [programId string?, pipelineId string?, x-gw-ims-org-id string?, Authorization string?, x-api-key string?]
  (let [res (:data (get-current-execution-with-http-info programId pipelineId x-gw-ims-org-id Authorization x-api-key))]
    (if (:decode-models *api-context*)
       (st/decode pipeline-execution-spec res st/string-transformer)
       res)))


(defn-spec get-execution-with-http-info any?
  "Get pipeline execution
  Returns a pipeline execution by id"
  [programId string?, pipelineId string?, executionId string?, x-gw-ims-org-id string?, Authorization string?, x-api-key string?]
  (check-required-params programId pipelineId executionId x-gw-ims-org-id Authorization x-api-key)
  (call-api "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}" :get
            {:path-params   {"programId" programId "pipelineId" pipelineId "executionId" executionId }
             :header-params {"x-gw-ims-org-id" x-gw-ims-org-id "Authorization" Authorization "x-api-key" x-api-key }
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-execution pipeline-execution-spec
  "Get pipeline execution
  Returns a pipeline execution by id"
  [programId string?, pipelineId string?, executionId string?, x-gw-ims-org-id string?, Authorization string?, x-api-key string?]
  (let [res (:data (get-execution-with-http-info programId pipelineId executionId x-gw-ims-org-id Authorization x-api-key))]
    (if (:decode-models *api-context*)
       (st/decode pipeline-execution-spec res st/string-transformer)
       res)))


(defn-spec get-executions-with-http-info any?
  "List Executions
  Returns the history of pipeline executions in a newest to oldest order"
  ([programId string?, pipelineId string?, x-gw-ims-org-id string?, Authorization string?, x-api-key string?, ] (get-executions-with-http-info programId pipelineId x-gw-ims-org-id Authorization x-api-key nil))
  ([programId string?, pipelineId string?, x-gw-ims-org-id string?, Authorization string?, x-api-key string?, {:keys [start limit]} (s/map-of keyword? any?)]
   (check-required-params programId pipelineId x-gw-ims-org-id Authorization x-api-key)
   (call-api "/api/program/{programId}/pipeline/{pipelineId}/executions" :get
             {:path-params   {"programId" programId "pipelineId" pipelineId }
              :header-params {"x-gw-ims-org-id" x-gw-ims-org-id "Authorization" Authorization "x-api-key" x-api-key }
              :query-params  {"start" start "limit" limit }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    []})))

(defn-spec get-executions pipeline-execution-list-representation-spec
  "List Executions
  Returns the history of pipeline executions in a newest to oldest order"
  ([programId string?, pipelineId string?, x-gw-ims-org-id string?, Authorization string?, x-api-key string?, ] (get-executions programId pipelineId x-gw-ims-org-id Authorization x-api-key nil))
  ([programId string?, pipelineId string?, x-gw-ims-org-id string?, Authorization string?, x-api-key string?, optional-params any?]
   (let [res (:data (get-executions-with-http-info programId pipelineId x-gw-ims-org-id Authorization x-api-key optional-params))]
     (if (:decode-models *api-context*)
        (st/decode pipeline-execution-list-representation-spec res st/string-transformer)
        res))))


(defn-spec get-step-logs-with-http-info any?
  "Get logs
  Get the logs associated with a step."
  ([programId string?, pipelineId string?, executionId string?, phaseId string?, stepId string?, x-gw-ims-org-id string?, Authorization string?, x-api-key string?, ] (get-step-logs-with-http-info programId pipelineId executionId phaseId stepId x-gw-ims-org-id Authorization x-api-key nil))
  ([programId string?, pipelineId string?, executionId string?, phaseId string?, stepId string?, x-gw-ims-org-id string?, Authorization string?, x-api-key string?, {:keys [file Accept]} (s/map-of keyword? any?)]
   (check-required-params programId pipelineId executionId phaseId stepId x-gw-ims-org-id Authorization x-api-key)
   (call-api "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/logs" :get
             {:path-params   {"programId" programId "pipelineId" pipelineId "executionId" executionId "phaseId" phaseId "stepId" stepId }
              :header-params {"Accept" Accept "x-gw-ims-org-id" x-gw-ims-org-id "Authorization" Authorization "x-api-key" x-api-key }
              :query-params  {"file" file }
              :form-params   {}
              :content-types []
              :accepts       []
              :auth-names    []})))

(defn-spec get-step-logs any?
  "Get logs
  Get the logs associated with a step."
  ([programId string?, pipelineId string?, executionId string?, phaseId string?, stepId string?, x-gw-ims-org-id string?, Authorization string?, x-api-key string?, ] (get-step-logs programId pipelineId executionId phaseId stepId x-gw-ims-org-id Authorization x-api-key nil))
  ([programId string?, pipelineId string?, executionId string?, phaseId string?, stepId string?, x-gw-ims-org-id string?, Authorization string?, x-api-key string?, optional-params any?]
   (let [res (:data (get-step-logs-with-http-info programId pipelineId executionId phaseId stepId x-gw-ims-org-id Authorization x-api-key optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec start-pipeline-with-http-info any?
  "Start the pipeline
  Starts the Pipeline. This works only if the pipeline is not already started."
  [programId string?, pipelineId string?, x-gw-ims-org-id string?, Authorization string?, x-api-key string?, Content-Type string?]
  (check-required-params programId pipelineId x-gw-ims-org-id Authorization x-api-key Content-Type)
  (call-api "/api/program/{programId}/pipeline/{pipelineId}/execution" :put
            {:path-params   {"programId" programId "pipelineId" pipelineId }
             :header-params {"x-gw-ims-org-id" x-gw-ims-org-id "Authorization" Authorization "x-api-key" x-api-key "Content-Type" Content-Type }
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    []}))

(defn-spec start-pipeline any?
  "Start the pipeline
  Starts the Pipeline. This works only if the pipeline is not already started."
  [programId string?, pipelineId string?, x-gw-ims-org-id string?, Authorization string?, x-api-key string?, Content-Type string?]
  (let [res (:data (start-pipeline-with-http-info programId pipelineId x-gw-ims-org-id Authorization x-api-key Content-Type))]
    (if (:decode-models *api-context*)
       (st/decode any? res st/string-transformer)
       res)))


(defn-spec step-metric-with-http-info any?
  "Get step metrics"
  [programId string?, pipelineId string?, executionId string?, phaseId string?, stepId string?, x-gw-ims-org-id string?, Authorization string?, x-api-key string?]
  (check-required-params programId pipelineId executionId phaseId stepId x-gw-ims-org-id Authorization x-api-key)
  (call-api "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/metrics" :get
            {:path-params   {"programId" programId "pipelineId" pipelineId "executionId" executionId "phaseId" phaseId "stepId" stepId }
             :header-params {"x-gw-ims-org-id" x-gw-ims-org-id "Authorization" Authorization "x-api-key" x-api-key }
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec step-metric pipeline-step-metrics-spec
  "Get step metrics"
  [programId string?, pipelineId string?, executionId string?, phaseId string?, stepId string?, x-gw-ims-org-id string?, Authorization string?, x-api-key string?]
  (let [res (:data (step-metric-with-http-info programId pipelineId executionId phaseId stepId x-gw-ims-org-id Authorization x-api-key))]
    (if (:decode-models *api-context*)
       (st/decode pipeline-step-metrics-spec res st/string-transformer)
       res)))


(defn-spec step-state-with-http-info any?
  "Get step state"
  [programId string?, pipelineId string?, executionId string?, phaseId string?, stepId string?, x-gw-ims-org-id string?, Authorization string?, x-api-key string?]
  (check-required-params programId pipelineId executionId phaseId stepId x-gw-ims-org-id Authorization x-api-key)
  (call-api "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}" :get
            {:path-params   {"programId" programId "pipelineId" pipelineId "executionId" executionId "phaseId" phaseId "stepId" stepId }
             :header-params {"x-gw-ims-org-id" x-gw-ims-org-id "Authorization" Authorization "x-api-key" x-api-key }
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec step-state pipeline-execution-step-state-spec
  "Get step state"
  [programId string?, pipelineId string?, executionId string?, phaseId string?, stepId string?, x-gw-ims-org-id string?, Authorization string?, x-api-key string?]
  (let [res (:data (step-state-with-http-info programId pipelineId executionId phaseId stepId x-gw-ims-org-id Authorization x-api-key))]
    (if (:decode-models *api-context*)
       (st/decode pipeline-execution-step-state-spec res st/string-transformer)
       res)))


