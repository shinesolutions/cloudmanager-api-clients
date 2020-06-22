package org.openapitools.client.model {

import org.openapitools.client.model.PipelineExecutionListRepresentationEmbedded;
import org.openapitools.client.model.PipelineExecutionListRepresentationLinks;
import org.openapitools.client.model.RequestedPageDetails;

    [XmlRootNode(name="PipelineExecutionListRepresentation")]
    public class PipelineExecutionListRepresentation {
                [XmlElement(name="_totalNumberOfItems")]
        public var totalNumberOfItems: Number = 0;
                [XmlElement(name="_page")]
        public var page: RequestedPageDetails = NaN;
                [XmlElement(name="_embedded")]
        public var embedded: PipelineExecutionListRepresentationEmbedded = NaN;
                [XmlElement(name="_links")]
        public var links: PipelineExecutionListRepresentationLinks = NaN;

    public function toString(): String {
        var str: String = "PipelineExecutionListRepresentation: ";
        str += " (totalNumberOfItems: " + totalNumberOfItems + ")";
        str += " (page: " + page + ")";
        str += " (embedded: " + embedded + ")";
        str += " (links: " + links + ")";
        return str;
    }

}

}
