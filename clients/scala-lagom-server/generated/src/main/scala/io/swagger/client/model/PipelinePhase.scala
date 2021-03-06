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

case class PipelinePhase (
            /* Name of the phase */
                  name: Option[String],
                  `type`:  Option[PipelinePhase&#x60;type&#x60;Enum.PipelinePhase&#x60;type&#x60;Enum],
            /* Identifier of the source repository. The code from this repository will be build at the start of this phase. Mandatory if type=BUILD */
                  repositoryId: Option[String],
            /* Name of the tracked branch or a fully qualified git tag (e.g. refs/tags/v1).  Assumed to be `master` if missing. */
                  branch: Option[String],
            /* Identifier of the target environment. Mandatory if type=DEPLOY */
                  environmentId: Option[String]
)

object PipelinePhase {
implicit val format: Format[PipelinePhase] = Json.format
}

object PipelinePhase&#x60;type&#x60;Enum extends Enumeration {
  val   VALIDATE, BUILD, DEPLOY = Value
  type PipelinePhase&#x60;type&#x60;Enum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[PipelinePhase&#x60;type&#x60;Enum.type])
}
