(ns cloud-manager-api.specs.invalid-parameter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def invalid-parameter-data
  {
   (ds/opt :name) string?
   (ds/opt :reason) string?
   })

(def invalid-parameter-spec
  (ds/spec
    {:name ::invalid-parameter
     :spec invalid-parameter-data}))
