(ns cloud-manager-api.specs.repository-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [cloud-manager-api.specs.repository-list-embedded :refer :all]
            [cloud-manager-api.specs.program-list-links :refer :all]
            )
  (:import (java.io File)))


(def repository-list-data
  {
   (ds/opt :_totalNumberOfItems) int?
   (ds/opt :_embedded) repository-list-embedded-spec
   (ds/opt :_links) program-list-links-spec
   })

(def repository-list-spec
  (ds/spec
    {:name ::repository-list
     :spec repository-list-data}))
