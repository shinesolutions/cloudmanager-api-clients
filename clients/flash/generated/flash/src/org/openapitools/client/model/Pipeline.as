package org.openapitools.client.model {

import org.openapitools.client.model.PipelineLinks;
import org.openapitools.client.model.PipelinePhase;

    [XmlRootNode(name="Pipeline")]
    public class Pipeline {
        /* Identifier of the pipeline. Unique within the program. */
        [XmlElement(name="id")]
        public var id: String = null;
        /* Identifier of the program. Unique within the space. */
        [XmlElement(name="programId")]
        public var programId: String = null;
        /* Name of the pipeline */
        [XmlElement(name="name")]
        public var name: String = null;
        /* How should the execution be triggered. ON_COMMIT: each time a PR is available and the Pipeline is idle then a execution is triggered. MANUAL: triggerd through UI or API. SCHEDULE: recurring schedule (not yet implemented} */
        [XmlElement(name="trigger")]
        public var trigger: String = null;
        /* Pipeline status */
        [XmlElement(name="status")]
        public var status: String = null;
        /* Create date */
        [XmlElement(name="createdAt")]
        public var createdAt: Date = null;
        /* Update date */
        [XmlElement(name="updatedAt")]
        public var updatedAt: Date = null;
        /* Last pipeline execution start */
        [XmlElement(name="lastStartedAt")]
        public var lastStartedAt: Date = null;
        /* Last pipeline execution end */
        [XmlElement(name="lastFinishedAt")]
        public var lastFinishedAt: Date = null;
        /* Pipeline phases in execution order */
        // This declaration below of _phases_obj_class is to force flash compiler to include this class
        private var _phases_obj_class: Array = null;
        [XmlElementWrapper(name="phases")]
        [XmlElements(name="phases", type="Array")]
                public var phases: Array = new Array();
                [XmlElement(name="_links")]
        public var links: PipelineLinks = NaN;

    public function toString(): String {
        var str: String = "Pipeline: ";
        str += " (id: " + id + ")";
        str += " (programId: " + programId + ")";
        str += " (name: " + name + ")";
        str += " (trigger: " + trigger + ")";
        str += " (status: " + status + ")";
        str += " (createdAt: " + createdAt + ")";
        str += " (updatedAt: " + updatedAt + ")";
        str += " (lastStartedAt: " + lastStartedAt + ")";
        str += " (lastFinishedAt: " + lastFinishedAt + ")";
        str += " (phases: " + phases + ")";
        str += " (links: " + links + ")";
        return str;
    }

}

}
