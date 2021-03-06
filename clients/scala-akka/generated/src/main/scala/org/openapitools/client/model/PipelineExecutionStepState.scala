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
package org.openapitools.client.model

import java.time.OffsetDateTime
import org.openapitools.client.core.ApiModel

case class PipelineExecutionStepState (
  id: Option[String] = None,
  stepId: Option[String] = None,
  phaseId: Option[String] = None,
  /* Name of the action */
  action: Option[String] = None,
  /* Target repository */
  repository: Option[String] = None,
  /* Target branch */
  branch: Option[String] = None,
  /* Target environment */
  environment: Option[String] = None,
  /* Target environment type */
  environmentType: Option[String] = None,
  /* Start time */
  startedAt: Option[OffsetDateTime] = None,
  /* Date the execution reached a final state */
  finishedAt: Option[OffsetDateTime] = None,
  /* Information about step result */
  details: Option[Map[String, Any]] = None,
  /* Action status */
  status: Option[PipelineExecutionStepStateEnums.Status] = None,
  links: Option[PipelineExecutionStepStateLinks] = None
) extends ApiModel

object PipelineExecutionStepStateEnums {

  type Status = Status.Value
  object Status extends Enumeration {
    val NOTSTARTED = Value("NOT_STARTED")
    val RUNNING = Value("RUNNING")
    val FINISHED = Value("FINISHED")
    val ERROR = Value("ERROR")
    val ROLLINGBACK = Value("ROLLING_BACK")
    val ROLLEDBACK = Value("ROLLED_BACK")
    val WAITING = Value("WAITING")
    val CANCELLED = Value("CANCELLED")
    val FAILED = Value("FAILED")
  }

}

