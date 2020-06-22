package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class MissingParameterList implements ListWrapper {
        // This declaration below of _MissingParameter_obj_class is to force flash compiler to include this class
        private var _missingParameter_obj_class: org.openapitools.client.model.MissingParameter = null;
        [XmlElements(name="missingParameter", type="org.openapitools.client.model.MissingParameter")]
        public var missingParameter: Array = new Array();

        public function getList(): Array{
            return missingParameter;
        }

}

}
