(ns cloud-manager-api.specs.repository-branch-links
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [cloud-manager-api.specs.hal-link :refer :all]
            [cloud-manager-api.specs.hal-link :refer :all]
            )
  (:import (java.io File)))


(def repository-branch-links-data
  {
   (ds/opt :httpnsadobecomadobecloudrelprogram) hal-link-spec
   (ds/opt :httpnsadobecomadobecloudrelrepository) hal-link-spec
   })

(def repository-branch-links-spec
  (ds/spec
    {:name ::repository-branch-links
     :spec repository-branch-links-data}))
