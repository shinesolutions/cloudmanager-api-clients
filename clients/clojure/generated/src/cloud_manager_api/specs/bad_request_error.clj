(ns cloud-manager-api.specs.bad-request-error
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [cloud-manager-api.specs.missing-parameter :refer :all]
            [cloud-manager-api.specs.invalid-parameter :refer :all]
            )
  (:import (java.io File)))


(def bad-request-error-data
  {
   (ds/opt :status) int?
   (ds/opt :type) string?
   (ds/opt :title) string?
   (ds/opt :missingParams) (s/coll-of missing-parameter-spec)
   (ds/opt :invalidParams) (s/coll-of invalid-parameter-spec)
   })

(def bad-request-error-spec
  (ds/spec
    {:name ::bad-request-error
     :spec bad-request-error-data}))
