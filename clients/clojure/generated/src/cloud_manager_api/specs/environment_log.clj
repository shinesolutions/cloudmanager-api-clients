(ns cloud-manager-api.specs.environment-log
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [cloud-manager-api.specs.environment-log-links :refer :all]
            )
  (:import (java.io File)))


(def environment-log-data
  {
   (ds/opt :service) string?
   (ds/opt :name) string?
   (ds/opt :date) string?
   (ds/opt :programId) int?
   (ds/opt :environmentId) int?
   (ds/opt :_links) environment-log-links-spec
   })

(def environment-log-spec
  (ds/spec
    {:name ::environment-log
     :spec environment-log-data}))
