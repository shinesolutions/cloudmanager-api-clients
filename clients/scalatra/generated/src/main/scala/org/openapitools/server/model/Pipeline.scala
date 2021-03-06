/**
 * Cloud Manager API
 * This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 */

package org.openapitools.server.model
import java.time.OffsetDateTime

case class Pipeline(
  /* Identifier of the pipeline. Unique within the program. */
  id: Option[String],

  /* Identifier of the program. Unique within the space. */
  programId: Option[String],

  /* Name of the pipeline */
  name: String,

  /* How should the execution be triggered. ON_COMMIT: each time a PR is available and the Pipeline is idle then a execution is triggered. MANUAL: triggerd through UI or API. SCHEDULE: recurring schedule (not yet implemented} */
  trigger: Option[String],

  /* Pipeline status */
  status: Option[String],

  /* Create date */
  createdAt: Option[OffsetDateTime],

  /* Update date */
  updatedAt: Option[OffsetDateTime],

  /* Last pipeline execution start */
  lastStartedAt: Option[OffsetDateTime],

  /* Last pipeline execution end */
  lastFinishedAt: Option[OffsetDateTime],

  /* Pipeline phases in execution order */
  phases: List[PipelinePhase],

  links: Option[PipelineLinks]

 )
