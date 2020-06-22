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
 * Describes an __Embedded Program__
 * @param id Identifier of the program. Unique within the space.
 * @param name Name of the program
 * @param enabled Whether this Program has been enabled for Cloud Manager usage
 * @param tenantId Tenant Id
 */

data class EmbeddedProgram (
    /* Identifier of the program. Unique within the space. */
    @Json(name = "id")
    val id: kotlin.String? = null,
    /* Name of the program */
    @Json(name = "name")
    val name: kotlin.String? = null,
    /* Whether this Program has been enabled for Cloud Manager usage */
    @Json(name = "enabled")
    val enabled: kotlin.Boolean? = null,
    /* Tenant Id */
    @Json(name = "tenantId")
    val tenantId: kotlin.String? = null
)

