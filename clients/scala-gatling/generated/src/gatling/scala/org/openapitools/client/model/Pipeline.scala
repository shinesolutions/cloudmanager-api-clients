
package org.openapitools.client.model

import java.time.OffsetDateTime

case class Pipeline (
    /* Identifier of the pipeline. Unique within the program. */
    _id: Option[String],
    /* Identifier of the program. Unique within the space. */
    _programId: Option[String],
    /* Name of the pipeline */
    _name: String,
    /* How should the execution be triggered. ON_COMMIT: each time a PR is available and the Pipeline is idle then a execution is triggered. MANUAL: triggerd through UI or API. SCHEDULE: recurring schedule (not yet implemented} */
    _trigger: Option[String],
    /* Pipeline status */
    _status: Option[String],
    /* Create date */
    _createdAt: Option[OffsetDateTime],
    /* Update date */
    _updatedAt: Option[OffsetDateTime],
    /* Last pipeline execution start */
    _lastStartedAt: Option[OffsetDateTime],
    /* Last pipeline execution end */
    _lastFinishedAt: Option[OffsetDateTime],
    /* Pipeline phases in execution order */
    _phases: List[PipelinePhase],
    _links: Option[PipelineLinks]
)
object Pipeline {
    def toStringBody(var_id: Object, var_programId: Object, var_name: Object, var_trigger: Object, var_status: Object, var_createdAt: Object, var_updatedAt: Object, var_lastStartedAt: Object, var_lastFinishedAt: Object, var_phases: Object, var_links: Object) =
        s"""
        | {
        | "id":$var_id,"programId":$var_programId,"name":$var_name,"trigger":$var_trigger,"status":$var_status,"createdAt":$var_createdAt,"updatedAt":$var_updatedAt,"lastStartedAt":$var_lastStartedAt,"lastFinishedAt":$var_lastFinishedAt,"phases":$var_phases,"links":$var_links
        | }
        """.stripMargin
}
