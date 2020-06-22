(ns cloud-manager-api.specs.variable-list-links
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [cloud-manager-api.specs.hal-link :refer :all]
            [cloud-manager-api.specs.hal-link :refer :all]
            [cloud-manager-api.specs.hal-link :refer :all]
            )
  (:import (java.io File)))


(def variable-list-links-data
  {
   (ds/opt :httpnsadobecomadobecloudrelenvironment) hal-link-spec
   (ds/opt :httpnsadobecomadobecloudrelprogram) hal-link-spec
   (ds/opt :self) hal-link-spec
   })

(def variable-list-links-spec
  (ds/spec
    {:name ::variable-list-links
     :spec variable-list-links-data}))
