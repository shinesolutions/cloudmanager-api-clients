(ns cloud-manager-api.specs.environment-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [cloud-manager-api.specs.environment-list-embedded :refer :all]
            [cloud-manager-api.specs.program-list-links :refer :all]
            )
  (:import (java.io File)))


(def environment-list-data
  {
   (ds/opt :_totalNumberOfItems) int?
   (ds/opt :_embedded) environment-list-embedded-spec
   (ds/opt :_links) program-list-links-spec
   })

(def environment-list-spec
  (ds/spec
    {:name ::environment-list
     :spec environment-list-data}))
