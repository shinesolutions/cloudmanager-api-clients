(ns cloud-manager-api.specs.environment-logs
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [cloud-manager-api.specs.environment-logs-links :refer :all]
            [cloud-manager-api.specs.environment-logs-embedded :refer :all]
            )
  (:import (java.io File)))


(def environment-logs-data
  {
   (ds/opt :service) (s/coll-of string?)
   (ds/opt :name) (s/coll-of string?)
   (ds/opt :days) int?
   (ds/opt :_links) environment-logs-links-spec
   (ds/opt :_embedded) environment-logs-embedded-spec
   })

(def environment-logs-spec
  (ds/spec
    {:name ::environment-logs
     :spec environment-logs-data}))
