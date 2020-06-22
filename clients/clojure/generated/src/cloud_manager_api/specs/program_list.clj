(ns cloud-manager-api.specs.program-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [cloud-manager-api.specs.program-list-embedded :refer :all]
            [cloud-manager-api.specs.program-list-links :refer :all]
            )
  (:import (java.io File)))


(def program-list-data
  {
   (ds/opt :_totalNumberOfItems) int?
   (ds/opt :_embedded) program-list-embedded-spec
   (ds/opt :_links) program-list-links-spec
   })

(def program-list-spec
  (ds/spec
    {:name ::program-list
     :spec program-list-data}))
