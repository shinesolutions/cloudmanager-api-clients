(ns cloud-manager-api.specs.pipeline-execution-list-representation
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [cloud-manager-api.specs.requested-page-details :refer :all]
            [cloud-manager-api.specs.pipeline-execution-list-representation-embedded :refer :all]
            [cloud-manager-api.specs.pipeline-execution-list-representation-links :refer :all]
            )
  (:import (java.io File)))


(def pipeline-execution-list-representation-data
  {
   (ds/opt :_totalNumberOfItems) int?
   (ds/opt :_page) requested-page-details-spec
   (ds/opt :_embedded) pipeline-execution-list-representation-embedded-spec
   (ds/opt :_links) pipeline-execution-list-representation-links-spec
   })

(def pipeline-execution-list-representation-spec
  (ds/spec
    {:name ::pipeline-execution-list-representation
     :spec pipeline-execution-list-representation-data}))
