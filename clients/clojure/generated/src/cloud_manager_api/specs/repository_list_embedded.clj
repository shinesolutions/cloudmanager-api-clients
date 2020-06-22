(ns cloud-manager-api.specs.repository-list-embedded
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [cloud-manager-api.specs.repository :refer :all]
            )
  (:import (java.io File)))


(def repository-list-embedded-data
  {
   (ds/opt :repositories) (s/coll-of repository-spec)
   })

(def repository-list-embedded-spec
  (ds/spec
    {:name ::repository-list-embedded
     :spec repository-list-embedded-data}))
