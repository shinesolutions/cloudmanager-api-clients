(ns cloud-manager-api.specs.environment-logs-links
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [cloud-manager-api.specs.hal-link :refer :all]
            [cloud-manager-api.specs.hal-link :refer :all]
            )
  (:import (java.io File)))


(def environment-logs-links-data
  {
   (ds/opt :httpnsadobecomadobecloudrelprogram) hal-link-spec
   (ds/opt :self) hal-link-spec
   })

(def environment-logs-links-spec
  (ds/spec
    {:name ::environment-logs-links
     :spec environment-logs-links-data}))
