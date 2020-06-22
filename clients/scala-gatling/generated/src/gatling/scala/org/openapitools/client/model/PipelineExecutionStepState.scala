
package org.openapitools.client.model

import java.time.OffsetDateTime

case class PipelineExecutionStepState (
    _id: Option[String],
    _stepId: Option[String],
    _phaseId: Option[String],
    /* Name of the action */
    _action: Option[String],
    /* Target repository */
    _repository: Option[String],
    /* Target branch */
    _branch: Option[String],
    /* Target environment */
    _environment: Option[String],
    /* Target environment type */
    _environmentType: Option[String],
    /* Start time */
    _startedAt: Option[OffsetDateTime],
    /* Date the execution reached a final state */
    _finishedAt: Option[OffsetDateTime],
    /* Information about step result */
    _details: Option[Map[String, Any]],
    /* Action status */
    _status: Option[String],
    _links: Option[PipelineExecutionStepStateLinks]
)
object PipelineExecutionStepState {
    def toStringBody(var_id: Object, var_stepId: Object, var_phaseId: Object, var_action: Object, var_repository: Object, var_branch: Object, var_environment: Object, var_environmentType: Object, var_startedAt: Object, var_finishedAt: Object, var_details: Object, var_status: Object, var_links: Object) =
        s"""
        | {
        | "id":$var_id,"stepId":$var_stepId,"phaseId":$var_phaseId,"action":$var_action,"repository":$var_repository,"branch":$var_branch,"environment":$var_environment,"environmentType":$var_environmentType,"startedAt":$var_startedAt,"finishedAt":$var_finishedAt,"details":$var_details,"status":$var_status,"links":$var_links
        | }
        """.stripMargin
}
