(ns cloud-manager-api.specs.pipeline-execution-list-representation-links
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [cloud-manager-api.specs.hal-link :refer :all]
            [cloud-manager-api.specs.hal-link :refer :all]
            [cloud-manager-api.specs.hal-link :refer :all]
            [cloud-manager-api.specs.hal-link :refer :all]
            )
  (:import (java.io File)))


(def pipeline-execution-list-representation-links-data
  {
   (ds/opt :next) hal-link-spec
   (ds/opt :page) hal-link-spec
   (ds/opt :prev) hal-link-spec
   (ds/opt :self) hal-link-spec
   })

(def pipeline-execution-list-representation-links-spec
  (ds/spec
    {:name ::pipeline-execution-list-representation-links
     :spec pipeline-execution-list-representation-links-data}))
