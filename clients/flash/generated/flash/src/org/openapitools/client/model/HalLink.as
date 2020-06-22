package org.openapitools.client.model {


    [XmlRootNode(name="HalLink")]
    public class HalLink {
                [XmlElement(name="href")]
        public var href: String = null;
                [XmlElement(name="templated")]
        public var templated: Boolean = false;
                [XmlElement(name="type")]
        public var type: String = null;
                [XmlElement(name="deprecation")]
        public var deprecation: String = null;
                [XmlElement(name="profile")]
        public var profile: String = null;
                [XmlElement(name="title")]
        public var title: String = null;
                [XmlElement(name="hreflang")]
        public var hreflang: String = null;
                [XmlElement(name="name")]
        public var name: String = null;

    public function toString(): String {
        var str: String = "HalLink: ";
        str += " (href: " + href + ")";
        str += " (templated: " + templated + ")";
        str += " (type: " + type + ")";
        str += " (deprecation: " + deprecation + ")";
        str += " (profile: " + profile + ")";
        str += " (title: " + title + ")";
        str += " (hreflang: " + hreflang + ")";
        str += " (name: " + name + ")";
        return str;
    }

}

}
