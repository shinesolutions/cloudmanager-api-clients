(ns cloud-manager-api.specs.environment-log-links
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [cloud-manager-api.specs.hal-link :refer :all]
            [cloud-manager-api.specs.hal-link :refer :all]
            )
  (:import (java.io File)))


(def environment-log-links-data
  {
   (ds/opt :httpnsadobecomadobecloudrellogsdownload) hal-link-spec
   (ds/opt :httpnsadobecomadobecloudrellogstail) hal-link-spec
   })

(def environment-log-links-spec
  (ds/spec
    {:name ::environment-log-links
     :spec environment-log-links-data}))
