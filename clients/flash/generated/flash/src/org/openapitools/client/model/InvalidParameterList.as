package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class InvalidParameterList implements ListWrapper {
        // This declaration below of _InvalidParameter_obj_class is to force flash compiler to include this class
        private var _invalidParameter_obj_class: org.openapitools.client.model.InvalidParameter = null;
        [XmlElements(name="invalidParameter", type="org.openapitools.client.model.InvalidParameter")]
        public var invalidParameter: Array = new Array();

        public function getList(): Array{
            return invalidParameter;
        }

}

}
