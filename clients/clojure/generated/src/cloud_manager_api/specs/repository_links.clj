(ns cloud-manager-api.specs.repository-links
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [cloud-manager-api.specs.hal-link :refer :all]
            [cloud-manager-api.specs.hal-link :refer :all]
            [cloud-manager-api.specs.hal-link :refer :all]
            )
  (:import (java.io File)))


(def repository-links-data
  {
   (ds/opt :httpnsadobecomadobecloudrelprogram) hal-link-spec
   (ds/opt :httpnsadobecomadobecloudrelbranches) hal-link-spec
   (ds/opt :self) hal-link-spec
   })

(def repository-links-spec
  (ds/spec
    {:name ::repository-links
     :spec repository-links-data}))
