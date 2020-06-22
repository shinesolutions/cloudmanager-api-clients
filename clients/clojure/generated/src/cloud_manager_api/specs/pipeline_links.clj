(ns cloud-manager-api.specs.pipeline-links
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [cloud-manager-api.specs.hal-link :refer :all]
            [cloud-manager-api.specs.hal-link :refer :all]
            [cloud-manager-api.specs.hal-link :refer :all]
            [cloud-manager-api.specs.hal-link :refer :all]
            [cloud-manager-api.specs.hal-link :refer :all]
            )
  (:import (java.io File)))


(def pipeline-links-data
  {
   (ds/opt :httpnsadobecomadobecloudrelprogram) hal-link-spec
   (ds/opt :httpnsadobecomadobecloudrelexecution) hal-link-spec
   (ds/opt :httpnsadobecomadobecloudrelexecutions) hal-link-spec
   (ds/opt :httpnsadobecomadobecloudrelrollbackLastSuccessfulExecution) hal-link-spec
   (ds/opt :self) hal-link-spec
   })

(def pipeline-links-spec
  (ds/spec
    {:name ::pipeline-links
     :spec pipeline-links-data}))
