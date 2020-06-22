package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class RequestedPageDetailsList implements ListWrapper {
        // This declaration below of _RequestedPageDetails_obj_class is to force flash compiler to include this class
        private var _requestedPageDetails_obj_class: org.openapitools.client.model.RequestedPageDetails = null;
        [XmlElements(name="requestedPageDetails", type="org.openapitools.client.model.RequestedPageDetails")]
        public var requestedPageDetails: Array = new Array();

        public function getList(): Array{
            return requestedPageDetails;
        }

}

}
