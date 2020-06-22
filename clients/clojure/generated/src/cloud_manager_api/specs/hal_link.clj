(ns cloud-manager-api.specs.hal-link
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def hal-link-data
  {
   (ds/opt :href) string?
   (ds/opt :templated) boolean?
   (ds/opt :type) string?
   (ds/opt :deprecation) string?
   (ds/opt :profile) string?
   (ds/opt :title) string?
   (ds/opt :hreflang) string?
   (ds/opt :name) string?
   })

(def hal-link-spec
  (ds/spec
    {:name ::hal-link
     :spec hal-link-data}))
