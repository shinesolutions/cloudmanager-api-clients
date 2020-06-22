(ns cloud-manager-api.specs.variable
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def variable-data
  {
   (ds/opt :name) string?
   (ds/opt :value) string?
   (ds/opt :type) string?
   })

(def variable-spec
  (ds/spec
    {:name ::variable
     :spec variable-data}))
