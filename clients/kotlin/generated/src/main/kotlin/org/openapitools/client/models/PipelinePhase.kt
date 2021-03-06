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
package org.openapitools.client.models


import com.squareup.moshi.Json
/**
 * Describes a phase of a pipeline
 * @param type Type of the phase
 * @param name Name of the phase
 * @param repositoryId Identifier of the source repository. The code from this repository will be build at the start of this phase. Mandatory if type=BUILD
 * @param branch Name of the tracked branch or a fully qualified git tag (e.g. refs/tags/v1).  Assumed to be `master` if missing.
 * @param environmentId Identifier of the target environment. Mandatory if type=DEPLOY
 */

data class PipelinePhase (
    /* Type of the phase */
    @Json(name = "type")
    val type: PipelinePhase.Type,
    /* Name of the phase */
    @Json(name = "name")
    val name: kotlin.String? = null,
    /* Identifier of the source repository. The code from this repository will be build at the start of this phase. Mandatory if type=BUILD */
    @Json(name = "repositoryId")
    val repositoryId: kotlin.String? = null,
    /* Name of the tracked branch or a fully qualified git tag (e.g. refs/tags/v1).  Assumed to be `master` if missing. */
    @Json(name = "branch")
    val branch: kotlin.String? = null,
    /* Identifier of the target environment. Mandatory if type=DEPLOY */
    @Json(name = "environmentId")
    val environmentId: kotlin.String? = null
) {

    /**
    * Type of the phase
    * Values: vALIDATE,bUILD,dEPLOY
    */
    
    enum class Type(val value: kotlin.String){
        @Json(name = "VALIDATE") vALIDATE("VALIDATE"),
        @Json(name = "BUILD") bUILD("BUILD"),
        @Json(name = "DEPLOY") dEPLOY("DEPLOY");
    }
}

