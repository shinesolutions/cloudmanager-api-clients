package org.openapitools.client.model {

import org.openapitools.client.model.Object;
import org.openapitools.client.model.PipelineExecutionStepStateLinks;

    [XmlRootNode(name="PipelineExecutionStepState")]
    public class PipelineExecutionStepState {
                [XmlElement(name="id")]
        public var id: String = null;
                [XmlElement(name="stepId")]
        public var stepId: String = null;
                [XmlElement(name="phaseId")]
        public var phaseId: String = null;
        /* Name of the action */
        [XmlElement(name="action")]
        public var action: String = null;
        /* Target repository */
        [XmlElement(name="repository")]
        public var repository: String = null;
        /* Target branch */
        [XmlElement(name="branch")]
        public var branch: String = null;
        /* Target environment */
        [XmlElement(name="environment")]
        public var environment: String = null;
        /* Target environment type */
        [XmlElement(name="environmentType")]
        public var environmentType: String = null;
        /* Start time */
        [XmlElement(name="startedAt")]
        public var startedAt: Date = null;
        /* Date the execution reached a final state */
        [XmlElement(name="finishedAt")]
        public var finishedAt: Date = null;
        /* Information about step result */
        // This declaration below of _details_obj_class is to force flash compiler to include this class
        private var _details_obj_class: Dictionary = null;
        [XmlElementWrapper(name="details")]
        [XmlElements(name="details", type="Dictionary")]
                public var details: Dictionary = new Dictionary();
        /* Action status */
        [XmlElement(name="status")]
        public var status: String = null;
                [XmlElement(name="_links")]
        public var links: PipelineExecutionStepStateLinks = NaN;

    public function toString(): String {
        var str: String = "PipelineExecutionStepState: ";
        str += " (id: " + id + ")";
        str += " (stepId: " + stepId + ")";
        str += " (phaseId: " + phaseId + ")";
        str += " (action: " + action + ")";
        str += " (repository: " + repository + ")";
        str += " (branch: " + branch + ")";
        str += " (environment: " + environment + ")";
        str += " (environmentType: " + environmentType + ")";
        str += " (startedAt: " + startedAt + ")";
        str += " (finishedAt: " + finishedAt + ")";
        str += " (details: " + details + ")";
        str += " (status: " + status + ")";
        str += " (links: " + links + ")";
        return str;
    }

}

}
