(ns cloud-manager-api.specs.repository-branch
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [cloud-manager-api.specs.repository-branch-links :refer :all]
            )
  (:import (java.io File)))


(def repository-branch-data
  {
   (ds/opt :programId) string?
   (ds/opt :repositoryId) int?
   (ds/opt :name) string?
   (ds/opt :_links) repository-branch-links-spec
   })

(def repository-branch-spec
  (ds/spec
    {:name ::repository-branch
     :spec repository-branch-data}))
