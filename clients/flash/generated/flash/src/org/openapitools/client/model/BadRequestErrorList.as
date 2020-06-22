package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.InvalidParameter;
import org.openapitools.client.model.MissingParameter;

    public class BadRequestErrorList implements ListWrapper {
        // This declaration below of _BadRequestError_obj_class is to force flash compiler to include this class
        private var _badRequestError_obj_class: org.openapitools.client.model.BadRequestError = null;
        [XmlElements(name="badRequestError", type="org.openapitools.client.model.BadRequestError")]
        public var badRequestError: Array = new Array();

        public function getList(): Array{
            return badRequestError;
        }

}

}
