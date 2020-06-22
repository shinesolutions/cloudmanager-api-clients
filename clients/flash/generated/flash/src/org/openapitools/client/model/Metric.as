package org.openapitools.client.model {


    [XmlRootNode(name="Metric")]
    public class Metric {
        /* KPI result identifier */
        [XmlElement(name="id")]
        public var id: String = null;
        /* Severity of the metric */
        [XmlElement(name="severity")]
        public var severity: String = null;
        /* Whether metric is considered passed */
        [XmlElement(name="passed")]
        public var passed: Boolean = false;
        /* Whether user override the failed metric */
        [XmlElement(name="override")]
        public var override: Boolean = false;
        /* Expected value for the metric */
        [XmlElement(name="actualValue")]
        public var actualValue: String = null;
        /* Expected value for the metric */
        [XmlElement(name="expectedValue")]
        public var expectedValue: String = null;
        /* Comparator used for the metric */
        [XmlElement(name="comparator")]
        public var comparator: String = null;
        /* KPI identifier */
        [XmlElement(name="kpi")]
        public var kpi: String = null;

    public function toString(): String {
        var str: String = "Metric: ";
        str += " (id: " + id + ")";
        str += " (severity: " + severity + ")";
        str += " (passed: " + passed + ")";
        str += " (override: " + override + ")";
        str += " (actualValue: " + actualValue + ")";
        str += " (expectedValue: " + expectedValue + ")";
        str += " (comparator: " + comparator + ")";
        str += " (kpi: " + kpi + ")";
        return str;
    }

}

}
