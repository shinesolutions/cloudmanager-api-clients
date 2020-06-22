package org.openapitools.client.model {


    [XmlRootNode(name="RequestedPageDetails")]
    public class RequestedPageDetails {
                [XmlElement(name="start")]
        public var start: Number = 0;
                [XmlElement(name="limit")]
        public var limit: Number = 0;
                [XmlElement(name="orderBy")]
        public var orderBy: String = null;
                // This declaration below of _property_obj_class is to force flash compiler to include this class
        private var _property_obj_class: Array = null;
        [XmlElementWrapper(name="property")]
        [XmlElements(name="property", type="Array")]
                public var property: Array = new Array();
                [XmlElement(name="type")]
        public var type: String = null;
                [XmlElement(name="next")]
        public var next: Number = 0;
                [XmlElement(name="prev")]
        public var prev: Number = 0;

    public function toString(): String {
        var str: String = "RequestedPageDetails: ";
        str += " (start: " + start + ")";
        str += " (limit: " + limit + ")";
        str += " (orderBy: " + orderBy + ")";
        str += " (property: " + property + ")";
        str += " (type: " + type + ")";
        str += " (next: " + next + ")";
        str += " (prev: " + prev + ")";
        return str;
    }

}

}
