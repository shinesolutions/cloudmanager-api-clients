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
package org.openapitools.client.apis

import org.openapitools.client.models.BranchList

import org.openapitools.client.infrastructure.ApiClient
import org.openapitools.client.infrastructure.ClientException
import org.openapitools.client.infrastructure.ClientError
import org.openapitools.client.infrastructure.ServerException
import org.openapitools.client.infrastructure.ServerError
import org.openapitools.client.infrastructure.MultiValueMap
import org.openapitools.client.infrastructure.RequestConfig
import org.openapitools.client.infrastructure.RequestMethod
import org.openapitools.client.infrastructure.ResponseType
import org.openapitools.client.infrastructure.Success
import org.openapitools.client.infrastructure.toMultiValue

class BranchesApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("org.openapitools.client.baseUrl", "https://cloudmanager.adobe.io")
        }
    }

    /**
    * List Branches
    * Returns the list of branches from a repository
    * @param programId Identifier of the program. 
    * @param repositoryId Identifier of the repository 
    * @param xMinusGwMinusImsMinusOrgMinusId IMS organization ID that the request is being made under. 
    * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO 
    * @param xMinusApiMinusKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
    * @return BranchList
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getBranches(programId: kotlin.String, repositoryId: kotlin.String, xMinusGwMinusImsMinusOrgMinusId: kotlin.String, authorization: kotlin.String, xMinusApiMinusKey: kotlin.String) : BranchList {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("x-gw-ims-org-id" to xMinusGwMinusImsMinusOrgMinusId.toString(), "Authorization" to authorization.toString(), "x-api-key" to xMinusApiMinusKey.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/api/program/{programId}/repository/{repositoryId}/branches".replace("{"+"programId"+"}", "$programId").replace("{"+"repositoryId"+"}", "$repositoryId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<BranchList>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as BranchList
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

}
