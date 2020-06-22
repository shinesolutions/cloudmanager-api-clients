(ns cloud-manager-api.specs.missing-parameter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def missing-parameter-data
  {
   (ds/opt :name) string?
   (ds/opt :type) string?
   })

(def missing-parameter-spec
  (ds/spec
    {:name ::missing-parameter
     :spec missing-parameter-data}))
