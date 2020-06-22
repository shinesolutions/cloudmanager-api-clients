package org.openapitools.client.model {

import org.openapitools.client.model.InvalidParameter;
import org.openapitools.client.model.MissingParameter;

    [XmlRootNode(name="BadRequestError")]
    public class BadRequestError {
        /* HTTP status code of the response. */
        [XmlElement(name="status")]
        public var status: Number = 0;
        /* Error type identifier. */
        [XmlElement(name="type")]
        public var type: String = null;
        /* A short summary of the error. */
        [XmlElement(name="title")]
        public var title: String = null;
        /* Request&#39;s missing parameters. */
        // This declaration below of _missingParams_obj_class is to force flash compiler to include this class
        private var _missingParams_obj_class: Array = null;
        [XmlElementWrapper(name="missingParams")]
        [XmlElements(name="missingParams", type="Array")]
                public var missingParams: Array = new Array();
        /* Request&#39;s invalid parameters. */
        // This declaration below of _invalidParams_obj_class is to force flash compiler to include this class
        private var _invalidParams_obj_class: Array = null;
        [XmlElementWrapper(name="invalidParams")]
        [XmlElements(name="invalidParams", type="Array")]
                public var invalidParams: Array = new Array();

    public function toString(): String {
        var str: String = "BadRequestError: ";
        str += " (status: " + status + ")";
        str += " (type: " + type + ")";
        str += " (title: " + title + ")";
        str += " (missingParams: " + missingParams + ")";
        str += " (invalidParams: " + invalidParams + ")";
        return str;
    }

}

}
