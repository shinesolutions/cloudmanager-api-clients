(ns cloud-manager-api.specs.program-list-embedded
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [cloud-manager-api.specs.embedded-program :refer :all]
            )
  (:import (java.io File)))


(def program-list-embedded-data
  {
   (ds/opt :programs) (s/coll-of embedded-program-spec)
   })

(def program-list-embedded-spec
  (ds/spec
    {:name ::program-list-embedded
     :spec program-list-embedded-data}))
