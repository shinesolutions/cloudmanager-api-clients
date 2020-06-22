(ns cloud-manager-api.specs.environment-list-embedded
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [cloud-manager-api.specs.environment :refer :all]
            )
  (:import (java.io File)))


(def environment-list-embedded-data
  {
   (ds/opt :environments) (s/coll-of environment-spec)
   })

(def environment-list-embedded-spec
  (ds/spec
    {:name ::environment-list-embedded
     :spec environment-list-embedded-data}))
