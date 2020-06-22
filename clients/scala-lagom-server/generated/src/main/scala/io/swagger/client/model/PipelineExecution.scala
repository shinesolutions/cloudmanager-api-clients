/**
 * Cloud Manager API
 * This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.swagger.client.model
import play.api.libs.json._
import java.time.OffsetDateTime

case class PipelineExecution (
            /* Pipeline execution identifier */
                  id: Option[String],
            /* Identifier of the program. Unique within the space. */
                  programId: Option[String],
            /* Identifier of the pipeline. Unique within the space. */
                  pipelineId: Option[String],
            /* Version of the artifacts generated during this execution */
                  artifactsVersion: Option[String],
            /* AdobeID who started the pipeline. Empty for auto triggered builds */
                  user: Option[String],
                  status:  Option[PipelineExecutionStatusEnum.PipelineExecutionStatusEnum],
                  trigger:  Option[PipelineExecutionTriggerEnum.PipelineExecutionTriggerEnum],
            /* Start time */
                  createdAt: Option[OffsetDateTime],
            /* Date of last status change */
                  updatedAt: Option[OffsetDateTime],
            /* Date the execution reached a final state */
                  finishedAt: Option[OffsetDateTime],
                  embedded: Option[PipelineExecutionEmbedded],
                  links: Option[PipelineExecutionLinks]
)

object PipelineExecution {
implicit val format: Format[PipelineExecution] = Json.format
}

object PipelineExecutionStatusEnum extends Enumeration {
  val   NOT_STARTED, RUNNING, CANCELLING, CANCELLED, FINISHED, ERROR, FAILED = Value
  type PipelineExecutionStatusEnum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[PipelineExecutionStatusEnum.type])
}
object PipelineExecutionTriggerEnum extends Enumeration {
  val   ON_COMMIT, MANUAL, SCHEDULE, PUSH_UPGRADES = Value
  type PipelineExecutionTriggerEnum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[PipelineExecutionTriggerEnum.type])
}
