
package org.openapitools.client.model

import java.time.OffsetDateTime

case class PipelineExecution (
    /* Pipeline execution identifier */
    _id: Option[String],
    /* Identifier of the program. Unique within the space. */
    _programId: Option[String],
    /* Identifier of the pipeline. Unique within the space. */
    _pipelineId: Option[String],
    /* Version of the artifacts generated during this execution */
    _artifactsVersion: Option[String],
    /* AdobeID who started the pipeline. Empty for auto triggered builds */
    _user: Option[String],
    /* Status of the execution */
    _status: Option[String],
    /* How the execution was triggered. */
    _trigger: Option[String],
    /* Start time */
    _createdAt: Option[OffsetDateTime],
    /* Date of last status change */
    _updatedAt: Option[OffsetDateTime],
    /* Date the execution reached a final state */
    _finishedAt: Option[OffsetDateTime],
    _embedded: Option[PipelineExecutionEmbedded],
    _links: Option[PipelineExecutionLinks]
)
object PipelineExecution {
    def toStringBody(var_id: Object, var_programId: Object, var_pipelineId: Object, var_artifactsVersion: Object, var_user: Object, var_status: Object, var_trigger: Object, var_createdAt: Object, var_updatedAt: Object, var_finishedAt: Object, var_embedded: Object, var_links: Object) =
        s"""
        | {
        | "id":$var_id,"programId":$var_programId,"pipelineId":$var_pipelineId,"artifactsVersion":$var_artifactsVersion,"user":$var_user,"status":$var_status,"trigger":$var_trigger,"createdAt":$var_createdAt,"updatedAt":$var_updatedAt,"finishedAt":$var_finishedAt,"embedded":$var_embedded,"links":$var_links
        | }
        """.stripMargin
}
