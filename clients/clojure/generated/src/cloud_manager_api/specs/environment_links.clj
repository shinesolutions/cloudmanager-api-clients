(ns cloud-manager-api.specs.environment-links
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


(def environment-links-data
  {
   (ds/opt :httpnsadobecomadobecloudrelprogram) hal-link-spec
   (ds/opt :httpnsadobecomadobecloudrelpipeline) hal-link-spec
   (ds/opt :httpnsadobecomadobecloudrelauthor) hal-link-spec
   (ds/opt :httpnsadobecomadobecloudrelpublish) hal-link-spec
   (ds/opt :httpnsadobecomadobecloudreldeveloperConsole) hal-link-spec
   (ds/opt :httpnsadobecomadobecloudrellogs) hal-link-spec
   (ds/opt :httpnsadobecomadobecloudrelvariables) hal-link-spec
   (ds/opt :self) hal-link-spec
   })

(def environment-links-spec
  (ds/spec
    {:name ::environment-links
     :spec environment-links-data}))
