(ns cloud-manager-api.specs.pipeline-execution-step-state-links
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [cloud-manager-api.specs.hal-link :refer :all]
            [cloud-manager-api.specs.hal-link :refer :all]
            [cloud-manager-api.specs.hal-link :refer :all]
            [cloud-manager-api.specs.hal-link :refer :all]
            [cloud-manager-api.specs.hal-link :refer :all]
            [cloud-manager-api.specs.hal-link :refer :all]
            [cloud-manager-api.specs.hal-link :refer :all]
            [cloud-manager-api.specs.hal-link :refer :all]
            )
  (:import (java.io File)))


(def pipeline-execution-step-state-links-data
  {
   (ds/opt :httpnsadobecomadobecloudrelexecution) hal-link-spec
   (ds/opt :httpnsadobecomadobecloudrelpipeline) hal-link-spec
   (ds/opt :httpnsadobecomadobecloudrelpipelinelogs) hal-link-spec
   (ds/opt :httpnsadobecomadobecloudrelpipelinemetrics) hal-link-spec
   (ds/opt :httpnsadobecomadobecloudrelpipelineadvance) hal-link-spec
   (ds/opt :httpnsadobecomadobecloudrelpipelinecancel) hal-link-spec
   (ds/opt :httpnsadobecomadobecloudrelprogram) hal-link-spec
   (ds/opt :self) hal-link-spec
   })

(def pipeline-execution-step-state-links-spec
  (ds/spec
    {:name ::pipeline-execution-step-state-links
     :spec pipeline-execution-step-state-links-data}))
