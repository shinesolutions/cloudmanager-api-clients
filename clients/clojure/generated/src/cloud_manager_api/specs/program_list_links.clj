(ns cloud-manager-api.specs.program-list-links
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [cloud-manager-api.specs.hal-link :refer :all]
            [cloud-manager-api.specs.hal-link :refer :all]
            [cloud-manager-api.specs.hal-link :refer :all]
            )
  (:import (java.io File)))


(def program-list-links-data
  {
   (ds/opt :next) hal-link-spec
   (ds/opt :prev) hal-link-spec
   (ds/opt :self) hal-link-spec
   })

(def program-list-links-spec
  (ds/spec
    {:name ::program-list-links
     :spec program-list-links-data}))
