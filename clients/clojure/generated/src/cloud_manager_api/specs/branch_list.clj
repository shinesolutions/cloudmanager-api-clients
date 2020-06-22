(ns cloud-manager-api.specs.branch-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [cloud-manager-api.specs.branch-list-embedded :refer :all]
            [cloud-manager-api.specs.program-list-links :refer :all]
            )
  (:import (java.io File)))


(def branch-list-data
  {
   (ds/opt :_totalNumberOfItems) int?
   (ds/opt :_embedded) branch-list-embedded-spec
   (ds/opt :_links) program-list-links-spec
   })

(def branch-list-spec
  (ds/spec
    {:name ::branch-list
     :spec branch-list-data}))
