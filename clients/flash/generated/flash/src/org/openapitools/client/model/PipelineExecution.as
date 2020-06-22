package org.openapitools.client.model {

import org.openapitools.client.model.PipelineExecutionEmbedded;
import org.openapitools.client.model.PipelineExecutionLinks;

    [XmlRootNode(name="PipelineExecution")]
    public class PipelineExecution {
        /* Pipeline execution identifier */
        [XmlElement(name="id")]
        public var id: String = null;
        /* Identifier of the program. Unique within the space. */
        [XmlElement(name="programId")]
        public var programId: String = null;
        /* Identifier of the pipeline. Unique within the space. */
        [XmlElement(name="pipelineId")]
        public var pipelineId: String = null;
        /* Version of the artifacts generated during this execution */
        [XmlElement(name="artifactsVersion")]
        public var artifactsVersion: String = null;
        /* AdobeID who started the pipeline. Empty for auto triggered builds */
        [XmlElement(name="user")]
        public var user: String = null;
        /* Status of the execution */
        [XmlElement(name="status")]
        public var status: String = null;
        /* How the execution was triggered. */
        [XmlElement(name="trigger")]
        public var trigger: String = null;
        /* Start time */
        [XmlElement(name="createdAt")]
        public var createdAt: Date = null;
        /* Date of last status change */
        [XmlElement(name="updatedAt")]
        public var updatedAt: Date = null;
        /* Date the execution reached a final state */
        [XmlElement(name="finishedAt")]
        public var finishedAt: Date = null;
                [XmlElement(name="_embedded")]
        public var embedded: PipelineExecutionEmbedded = NaN;
                [XmlElement(name="_links")]
        public var links: PipelineExecutionLinks = NaN;

    public function toString(): String {
        var str: String = "PipelineExecution: ";
        str += " (id: " + id + ")";
        str += " (programId: " + programId + ")";
        str += " (pipelineId: " + pipelineId + ")";
        str += " (artifactsVersion: " + artifactsVersion + ")";
        str += " (user: " + user + ")";
        str += " (status: " + status + ")";
        str += " (trigger: " + trigger + ")";
        str += " (createdAt: " + createdAt + ")";
        str += " (updatedAt: " + updatedAt + ")";
        str += " (finishedAt: " + finishedAt + ")";
        str += " (embedded: " + embedded + ")";
        str += " (links: " + links + ")";
        return str;
    }

}

}
