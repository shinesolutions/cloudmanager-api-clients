(ns cloud-manager-api.specs.variable-list
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [cloud-manager-api.specs.variable-list-embedded :refer :all]
            [cloud-manager-api.specs.variable-list-links :refer :all]
            )
  (:import (java.io File)))


(def variable-list-data
  {
   (ds/opt :_totalNumberOfItems) int?
   (ds/opt :_embedded) variable-list-embedded-spec
   (ds/opt :_links) variable-list-links-spec
   })

(def variable-list-spec
  (ds/spec
    {:name ::variable-list
     :spec variable-list-data}))
