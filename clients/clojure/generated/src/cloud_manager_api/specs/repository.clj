(ns cloud-manager-api.specs.repository
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [cloud-manager-api.specs.repository-links :refer :all]
            )
  (:import (java.io File)))


(def repository-data
  {
   (ds/opt :repo) string?
   (ds/opt :description) string?
   (ds/opt :_links) repository-links-spec
   })

(def repository-spec
  (ds/spec
    {:name ::repository
     :spec repository-data}))
