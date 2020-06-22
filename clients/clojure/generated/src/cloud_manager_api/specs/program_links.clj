(ns cloud-manager-api.specs.program-links
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [cloud-manager-api.specs.hal-link :refer :all]
            [cloud-manager-api.specs.hal-link :refer :all]
            [cloud-manager-api.specs.hal-link :refer :all]
            [cloud-manager-api.specs.hal-link :refer :all]
            )
  (:import (java.io File)))


(def program-links-data
  {
   (ds/opt :httpnsadobecomadobecloudrelpipelines) hal-link-spec
   (ds/opt :httpnsadobecomadobecloudrelenvironments) hal-link-spec
   (ds/opt :httpnsadobecomadobecloudrelrepositories) hal-link-spec
   (ds/opt :self) hal-link-spec
   })

(def program-links-spec
  (ds/spec
    {:name ::program-links
     :spec program-links-data}))
