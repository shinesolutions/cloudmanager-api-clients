(ns cloud-manager-api.specs.requested-page-details
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def requested-page-details-data
  {
   (ds/opt :start) int?
   (ds/opt :limit) int?
   (ds/opt :orderBy) string?
   (ds/opt :property) (s/coll-of string?)
   (ds/opt :type) string?
   (ds/opt :next) int?
   (ds/opt :prev) int?
   })

(def requested-page-details-spec
  (ds/spec
    {:name ::requested-page-details
     :spec requested-page-details-data}))
