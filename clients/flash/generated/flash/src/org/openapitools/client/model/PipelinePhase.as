package org.openapitools.client.model {


    [XmlRootNode(name="PipelinePhase")]
    public class PipelinePhase {
        /* Name of the phase */
        [XmlElement(name="name")]
        public var name: String = null;
        /* Type of the phase */
        [XmlElement(name="type")]
        public var type: String = null;
        /* Identifier of the source repository. The code from this repository will be build at the start of this phase. Mandatory if type&#x3D;BUILD */
        [XmlElement(name="repositoryId")]
        public var repositoryId: String = null;
        /* Name of the tracked branch or a fully qualified git tag (e.g. refs/tags/v1).  Assumed to be &#x60;master&#x60; if missing. */
        [XmlElement(name="branch")]
        public var branch: String = null;
        /* Identifier of the target environment. Mandatory if type&#x3D;DEPLOY */
        [XmlElement(name="environmentId")]
        public var environmentId: String = null;

    public function toString(): String {
        var str: String = "PipelinePhase: ";
        str += " (name: " + name + ")";
        str += " (type: " + type + ")";
        str += " (repositoryId: " + repositoryId + ")";
        str += " (branch: " + branch + ")";
        str += " (environmentId: " + environmentId + ")";
        return str;
    }

}

}
