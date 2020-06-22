(ns cloud-manager-api.specs.embedded-program
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def embedded-program-data
  {
   (ds/opt :id) string?
   (ds/opt :name) string?
   (ds/opt :enabled) boolean?
   (ds/opt :tenantId) string?
   })

(def embedded-program-spec
  (ds/spec
    {:name ::embedded-program
     :spec embedded-program-data}))
