(ns cloud-manager-api.specs.program
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [cloud-manager-api.specs.program-links :refer :all]
            )
  (:import (java.io File)))


(def program-data
  {
   (ds/opt :id) string?
   (ds/req :name) string?
   (ds/opt :enabled) boolean?
   (ds/opt :tenantId) string?
   (ds/opt :imsOrgId) string?
   (ds/opt :_links) program-links-spec
   })

(def program-spec
  (ds/spec
    {:name ::program
     :spec program-data}))
