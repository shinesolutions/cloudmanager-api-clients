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

case class PipelinePhase(
  /* Name of the phase */
  name: Option[String],

  /* Type of the phase */
  `type`: String,

  /* Identifier of the source repository. The code from this repository will be build at the start of this phase. Mandatory if type=BUILD */
  repositoryId: Option[String],

  /* Name of the tracked branch or a fully qualified git tag (e.g. refs/tags/v1).  Assumed to be `master` if missing. */
  branch: Option[String],

  /* Identifier of the target environment. Mandatory if type=DEPLOY */
  environmentId: Option[String]

 )
