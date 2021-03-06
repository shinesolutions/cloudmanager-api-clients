(ns cloud-manager-api.api.branches
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


(defn-spec get-branches-with-http-info any?
  "List Branches
  Returns the list of branches from a repository"
  [programId string?, repositoryId string?, x-gw-ims-org-id string?, Authorization string?, x-api-key string?]
  (check-required-params programId repositoryId x-gw-ims-org-id Authorization x-api-key)
  (call-api "/api/program/{programId}/repository/{repositoryId}/branches" :get
            {:path-params   {"programId" programId "repositoryId" repositoryId }
             :header-params {"x-gw-ims-org-id" x-gw-ims-org-id "Authorization" Authorization "x-api-key" x-api-key }
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-branches branch-list-spec
  "List Branches
  Returns the list of branches from a repository"
  [programId string?, repositoryId string?, x-gw-ims-org-id string?, Authorization string?, x-api-key string?]
  (let [res (:data (get-branches-with-http-info programId repositoryId x-gw-ims-org-id Authorization x-api-key))]
    (if (:decode-models *api-context*)
       (st/decode branch-list-spec res st/string-transformer)
       res)))


