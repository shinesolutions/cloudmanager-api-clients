(ns cloud-manager-api.specs.branch-list-embedded
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [cloud-manager-api.specs.repository-branch :refer :all]
            )
  (:import (java.io File)))


(def branch-list-embedded-data
  {
   (ds/opt :branches) (s/coll-of repository-branch-spec)
   })

(def branch-list-embedded-spec
  (ds/spec
    {:name ::branch-list-embedded
     :spec branch-list-embedded-data}))
