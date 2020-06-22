(ns cloud-manager-api.specs.pipeline-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [cloud-manager-api.specs.pipeline-list-embedded :refer :all]
            [cloud-manager-api.specs.program-list-links :refer :all]
            )
  (:import (java.io File)))


(def pipeline-list-data
  {
   (ds/opt :_totalNumberOfItems) int?
   (ds/opt :_embedded) pipeline-list-embedded-spec
   (ds/opt :_links) program-list-links-spec
   })

(def pipeline-list-spec
  (ds/spec
    {:name ::pipeline-list
     :spec pipeline-list-data}))
