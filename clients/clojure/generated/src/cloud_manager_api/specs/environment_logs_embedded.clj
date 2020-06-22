(ns cloud-manager-api.specs.environment-logs-embedded
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [cloud-manager-api.specs.environment-log :refer :all]
            )
  (:import (java.io File)))


(def environment-logs-embedded-data
  {
   (ds/opt :downloads) (s/coll-of environment-log-spec)
   })

(def environment-logs-embedded-spec
  (ds/spec
    {:name ::environment-logs-embedded
     :spec environment-logs-embedded-data}))
