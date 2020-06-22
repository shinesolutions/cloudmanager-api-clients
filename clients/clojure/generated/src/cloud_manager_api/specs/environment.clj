(ns cloud-manager-api.specs.environment
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [cloud-manager-api.specs.environment-links :refer :all]
            )
  (:import (java.io File)))


(def environment-data
  {
   (ds/opt :id) string?
   (ds/opt :programId) string?
   (ds/opt :name) string?
   (ds/opt :description) string?
   (ds/opt :type) string?
   (ds/opt :_links) environment-links-spec
   })

(def environment-spec
  (ds/spec
    {:name ::environment
     :spec environment-data}))
