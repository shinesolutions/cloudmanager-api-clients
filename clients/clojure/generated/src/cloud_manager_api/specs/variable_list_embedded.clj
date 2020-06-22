(ns cloud-manager-api.specs.variable-list-embedded
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [cloud-manager-api.specs.variable :refer :all]
            )
  (:import (java.io File)))


(def variable-list-embedded-data
  {
   (ds/opt :variables) (s/coll-of variable-spec)
   })

(def variable-list-embedded-spec
  (ds/spec
    {:name ::variable-list-embedded
     :spec variable-list-embedded-data}))
