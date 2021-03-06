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

import org.openapitools.client.models.BadRequestError
import org.openapitools.client.models.Environment
import org.openapitools.client.models.EnvironmentList
import org.openapitools.client.models.EnvironmentLogs

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

class EnvironmentsApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("org.openapitools.client.baseUrl", "https://cloudmanager.adobe.io")
        }
    }

    /**
    * DeleteEnvironment
    * Delete environment
    * @param programId Identifier of the application 
    * @param environmentId Identifier of the environment 
    * @param xMinusGwMinusImsMinusOrgMinusId IMS organization ID that the request is being made under. 
    * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO 
    * @param xMinusApiMinusKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
    * @return Environment
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun deleteEnvironment(programId: kotlin.String, environmentId: kotlin.String, xMinusGwMinusImsMinusOrgMinusId: kotlin.String, authorization: kotlin.String, xMinusApiMinusKey: kotlin.String) : Environment {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("x-gw-ims-org-id" to xMinusGwMinusImsMinusOrgMinusId.toString(), "Authorization" to authorization.toString(), "x-api-key" to xMinusApiMinusKey.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/api/program/{programId}/environment/{environmentId}".replace("{"+"programId"+"}", "$programId").replace("{"+"environmentId"+"}", "$environmentId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<Environment>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as Environment
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

    /**
    * Download Logs
    * Download environment logs
    * @param programId Identifier of the program 
    * @param environmentId Identifier of the environment 
    * @param service Name of service 
    * @param name Name of log 
    * @param date date for which log is required 
    * @param xMinusGwMinusImsMinusOrgMinusId IMS organization ID that the request is being made under. 
    * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO 
    * @param xMinusApiMinusKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
    * @param accept Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. (optional)
    * @return void
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun downloadLogs(programId: kotlin.String, environmentId: kotlin.String, service: kotlin.String, name: kotlin.String, date: kotlin.String, xMinusGwMinusImsMinusOrgMinusId: kotlin.String, authorization: kotlin.String, xMinusApiMinusKey: kotlin.String, accept: kotlin.String?) : Unit {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                put("service", listOf(service.toString()))
                put("name", listOf(name.toString()))
                put("date", listOf(date.toString()))
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("x-gw-ims-org-id" to xMinusGwMinusImsMinusOrgMinusId.toString(), "Authorization" to authorization.toString(), "x-api-key" to xMinusApiMinusKey.toString(), "Accept" to accept.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/api/program/{programId}/environment/{environmentId}/logs/download".replace("{"+"programId"+"}", "$programId").replace("{"+"environmentId"+"}", "$environmentId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<Any?>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
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

    /**
    * Get Environment
    * Returns an environment by its id
    * @param programId Identifier of the program 
    * @param environmentId Identifier of the environment 
    * @param xMinusGwMinusImsMinusOrgMinusId IMS organization ID that the request is being made under. 
    * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO 
    * @param xMinusApiMinusKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
    * @return Environment
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getEnvironment(programId: kotlin.String, environmentId: kotlin.String, xMinusGwMinusImsMinusOrgMinusId: kotlin.String, authorization: kotlin.String, xMinusApiMinusKey: kotlin.String) : Environment {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("x-gw-ims-org-id" to xMinusGwMinusImsMinusOrgMinusId.toString(), "Authorization" to authorization.toString(), "x-api-key" to xMinusApiMinusKey.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/api/program/{programId}/environment/{environmentId}".replace("{"+"programId"+"}", "$programId").replace("{"+"environmentId"+"}", "$environmentId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<Environment>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as Environment
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

    /**
    * Get Environment Logs
    * List all logs available in environment
    * @param programId Identifier of the program 
    * @param environmentId Identifier of the environment 
    * @param days number of days for which logs are required 
    * @param xMinusGwMinusImsMinusOrgMinusId IMS organization ID that the request is being made under. 
    * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO 
    * @param xMinusApiMinusKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
    * @param service Names of services (optional)
    * @param name Names of log (optional)
    * @return EnvironmentLogs
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getEnvironmentLogs(programId: kotlin.String, environmentId: kotlin.String, days: kotlin.Int, xMinusGwMinusImsMinusOrgMinusId: kotlin.String, authorization: kotlin.String, xMinusApiMinusKey: kotlin.String, service: kotlin.Array<kotlin.String>?, name: kotlin.Array<kotlin.String>?) : EnvironmentLogs {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (service != null) {
                    put("service", toMultiValue(service.toList(), "multi"))
                }
                if (name != null) {
                    put("name", toMultiValue(name.toList(), "multi"))
                }
                put("days", listOf(days.toString()))
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("x-gw-ims-org-id" to xMinusGwMinusImsMinusOrgMinusId.toString(), "Authorization" to authorization.toString(), "x-api-key" to xMinusApiMinusKey.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/api/program/{programId}/environment/{environmentId}/logs".replace("{"+"programId"+"}", "$programId").replace("{"+"environmentId"+"}", "$environmentId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<EnvironmentLogs>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EnvironmentLogs
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

    /**
    * List Environments
    * Lists all environments in an program
    * @param programId Identifier of the program 
    * @param xMinusGwMinusImsMinusOrgMinusId IMS organization ID that the request is being made under. 
    * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO 
    * @param xMinusApiMinusKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
    * @param type Type of the environment (optional)
    * @return EnvironmentList
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getEnvironments(programId: kotlin.String, xMinusGwMinusImsMinusOrgMinusId: kotlin.String, authorization: kotlin.String, xMinusApiMinusKey: kotlin.String, type: kotlin.String?) : EnvironmentList {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (type != null) {
                    put("type", listOf(type.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("x-gw-ims-org-id" to xMinusGwMinusImsMinusOrgMinusId.toString(), "Authorization" to authorization.toString(), "x-api-key" to xMinusApiMinusKey.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/api/program/{programId}/environments".replace("{"+"programId"+"}", "$programId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<EnvironmentList>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EnvironmentList
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
