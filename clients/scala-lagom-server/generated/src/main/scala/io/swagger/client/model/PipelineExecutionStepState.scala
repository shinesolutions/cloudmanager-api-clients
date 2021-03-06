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

case class PipelineExecutionStepState (
                  id: Option[String],
                  stepId: Option[String],
                  phaseId: Option[String],
            /* Name of the action */
                  action: Option[String],
            /* Target repository */
                  repository: Option[String],
            /* Target branch */
                  branch: Option[String],
            /* Target environment */
                  environment: Option[String],
            /* Target environment type */
                  environmentType: Option[String],
            /* Start time */
                  startedAt: Option[OffsetDateTime],
            /* Date the execution reached a final state */
                  finishedAt: Option[OffsetDateTime],
            /* Information about step result */
                  details: Option[Map[String, Any]],
                  status:  Option[PipelineExecutionStepStateStatusEnum.PipelineExecutionStepStateStatusEnum],
                  links: Option[PipelineExecutionStepStateLinks]
)

object PipelineExecutionStepState {
implicit val format: Format[PipelineExecutionStepState] = Json.format
}

object PipelineExecutionStepStateStatusEnum extends Enumeration {
  val   NOT_STARTED, RUNNING, FINISHED, ERROR, ROLLING_BACK, ROLLED_BACK, WAITING, CANCELLED, FAILED = Value
  type PipelineExecutionStepStateStatusEnum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[PipelineExecutionStepStateStatusEnum.type])
}
