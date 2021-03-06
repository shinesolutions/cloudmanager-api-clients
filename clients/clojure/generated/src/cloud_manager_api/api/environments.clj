(ns cloud-manager-api.api.environments
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


(defn-spec delete-environment-with-http-info any?
  "DeleteEnvironment
  Delete environment"
  [programId string?, environmentId string?, x-gw-ims-org-id string?, Authorization string?, x-api-key string?]
  (check-required-params programId environmentId x-gw-ims-org-id Authorization x-api-key)
  (call-api "/api/program/{programId}/environment/{environmentId}" :delete
            {:path-params   {"programId" programId "environmentId" environmentId }
             :header-params {"x-gw-ims-org-id" x-gw-ims-org-id "Authorization" Authorization "x-api-key" x-api-key }
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec delete-environment environment-spec
  "DeleteEnvironment
  Delete environment"
  [programId string?, environmentId string?, x-gw-ims-org-id string?, Authorization string?, x-api-key string?]
  (let [res (:data (delete-environment-with-http-info programId environmentId x-gw-ims-org-id Authorization x-api-key))]
    (if (:decode-models *api-context*)
       (st/decode environment-spec res st/string-transformer)
       res)))


(defn-spec download-logs-with-http-info any?
  "Download Logs
  Download environment logs"
  ([programId string?, environmentId string?, service string?, name string?, date string?, x-gw-ims-org-id string?, Authorization string?, x-api-key string?, ] (download-logs-with-http-info programId environmentId service name date x-gw-ims-org-id Authorization x-api-key nil))
  ([programId string?, environmentId string?, service string?, name string?, date string?, x-gw-ims-org-id string?, Authorization string?, x-api-key string?, {:keys [Accept]} (s/map-of keyword? any?)]
   (check-required-params programId environmentId service name date x-gw-ims-org-id Authorization x-api-key)
   (call-api "/api/program/{programId}/environment/{environmentId}/logs/download" :get
             {:path-params   {"programId" programId "environmentId" environmentId }
              :header-params {"x-gw-ims-org-id" x-gw-ims-org-id "Authorization" Authorization "x-api-key" x-api-key "Accept" Accept }
              :query-params  {"service" service "name" name "date" date }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    []})))

(defn-spec download-logs any?
  "Download Logs
  Download environment logs"
  ([programId string?, environmentId string?, service string?, name string?, date string?, x-gw-ims-org-id string?, Authorization string?, x-api-key string?, ] (download-logs programId environmentId service name date x-gw-ims-org-id Authorization x-api-key nil))
  ([programId string?, environmentId string?, service string?, name string?, date string?, x-gw-ims-org-id string?, Authorization string?, x-api-key string?, optional-params any?]
   (let [res (:data (download-logs-with-http-info programId environmentId service name date x-gw-ims-org-id Authorization x-api-key optional-params))]
     (if (:decode-models *api-context*)
        (st/decode any? res st/string-transformer)
        res))))


(defn-spec get-environment-with-http-info any?
  "Get Environment
  Returns an environment by its id"
  [programId string?, environmentId string?, x-gw-ims-org-id string?, Authorization string?, x-api-key string?]
  (check-required-params programId environmentId x-gw-ims-org-id Authorization x-api-key)
  (call-api "/api/program/{programId}/environment/{environmentId}" :get
            {:path-params   {"programId" programId "environmentId" environmentId }
             :header-params {"x-gw-ims-org-id" x-gw-ims-org-id "Authorization" Authorization "x-api-key" x-api-key }
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-environment environment-spec
  "Get Environment
  Returns an environment by its id"
  [programId string?, environmentId string?, x-gw-ims-org-id string?, Authorization string?, x-api-key string?]
  (let [res (:data (get-environment-with-http-info programId environmentId x-gw-ims-org-id Authorization x-api-key))]
    (if (:decode-models *api-context*)
       (st/decode environment-spec res st/string-transformer)
       res)))


(defn-spec get-environment-logs-with-http-info any?
  "Get Environment Logs
  List all logs available in environment"
  ([programId string?, environmentId string?, days int?, x-gw-ims-org-id string?, Authorization string?, x-api-key string?, ] (get-environment-logs-with-http-info programId environmentId days x-gw-ims-org-id Authorization x-api-key nil))
  ([programId string?, environmentId string?, days int?, x-gw-ims-org-id string?, Authorization string?, x-api-key string?, {:keys [service name]} (s/map-of keyword? any?)]
   (check-required-params programId environmentId days x-gw-ims-org-id Authorization x-api-key)
   (call-api "/api/program/{programId}/environment/{environmentId}/logs" :get
             {:path-params   {"programId" programId "environmentId" environmentId }
              :header-params {"x-gw-ims-org-id" x-gw-ims-org-id "Authorization" Authorization "x-api-key" x-api-key }
              :query-params  {"service" (with-collection-format service :multi) "name" (with-collection-format name :multi) "days" days }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    []})))

(defn-spec get-environment-logs environment-logs-spec
  "Get Environment Logs
  List all logs available in environment"
  ([programId string?, environmentId string?, days int?, x-gw-ims-org-id string?, Authorization string?, x-api-key string?, ] (get-environment-logs programId environmentId days x-gw-ims-org-id Authorization x-api-key nil))
  ([programId string?, environmentId string?, days int?, x-gw-ims-org-id string?, Authorization string?, x-api-key string?, optional-params any?]
   (let [res (:data (get-environment-logs-with-http-info programId environmentId days x-gw-ims-org-id Authorization x-api-key optional-params))]
     (if (:decode-models *api-context*)
        (st/decode environment-logs-spec res st/string-transformer)
        res))))


(defn-spec get-environments-with-http-info any?
  "List Environments
  Lists all environments in an program"
  ([programId string?, x-gw-ims-org-id string?, Authorization string?, x-api-key string?, ] (get-environments-with-http-info programId x-gw-ims-org-id Authorization x-api-key nil))
  ([programId string?, x-gw-ims-org-id string?, Authorization string?, x-api-key string?, {:keys [type]} (s/map-of keyword? any?)]
   (check-required-params programId x-gw-ims-org-id Authorization x-api-key)
   (call-api "/api/program/{programId}/environments" :get
             {:path-params   {"programId" programId }
              :header-params {"x-gw-ims-org-id" x-gw-ims-org-id "Authorization" Authorization "x-api-key" x-api-key }
              :query-params  {"type" type }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    []})))

(defn-spec get-environments environment-list-spec
  "List Environments
  Lists all environments in an program"
  ([programId string?, x-gw-ims-org-id string?, Authorization string?, x-api-key string?, ] (get-environments programId x-gw-ims-org-id Authorization x-api-key nil))
  ([programId string?, x-gw-ims-org-id string?, Authorization string?, x-api-key string?, optional-params any?]
   (let [res (:data (get-environments-with-http-info programId x-gw-ims-org-id Authorization x-api-key optional-params))]
     (if (:decode-models *api-context*)
        (st/decode environment-list-spec res st/string-transformer)
        res))))


