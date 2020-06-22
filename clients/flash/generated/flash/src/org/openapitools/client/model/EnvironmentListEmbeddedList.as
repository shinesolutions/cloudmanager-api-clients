package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.Environment;

    public class EnvironmentListEmbeddedList implements ListWrapper {
        // This declaration below of _environmentList__embedded_obj_class is to force flash compiler to include this class
        private var _environmentListEmbedded_obj_class: org.openapitools.client.model.EnvironmentListEmbedded = null;
        [XmlElements(name="environmentListEmbedded", type="org.openapitools.client.model.EnvironmentListEmbedded")]
        public var environmentListEmbedded: Array = new Array();

        public function getList(): Array{
            return environmentListEmbedded;
        }

}

}
