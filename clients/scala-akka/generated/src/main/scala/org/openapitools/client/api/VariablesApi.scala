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
package org.openapitools.client.api

import org.openapitools.client.model.Variable
import org.openapitools.client.model.VariableList
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

object VariablesApi {

  def apply(baseUrl: String = "https://cloudmanager.adobe.io") = new VariablesApi(baseUrl)
}

class VariablesApi(baseUrl: String) {
  
  /**
   * List the user defined variables for an environment (Cloud Service only).
   * 
   * Expected answers:
   *   code 200 : VariableList (Successful retrieval of environment variables)
   *   code 404 :  (Environment not found)
   * 
   * @param programId Identifier of the program
   * @param environmentId Identifier of the environment
   * @param xGwImsOrgId IMS organization ID that the request is being made under.
   * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO
   * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
   */
  def getEnvironmentVariables(programId: String, environmentId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): ApiRequest[VariableList] =
    ApiRequest[VariableList](ApiMethods.GET, baseUrl, "/api/program/{programId}/environment/{environmentId}/variables", "application/json")
      .withPathParam("programId", programId)
      .withPathParam("environmentId", environmentId)
      .withHeaderParam("x-gw-ims-org-id", xGwImsOrgId)
      .withHeaderParam("Authorization", authorization)
      .withHeaderParam("x-api-key", xApiKey)
      .withSuccessResponse[VariableList](200)
      .withErrorResponse[Unit](404)
      

  /**
   * Modify multiple environment variables (Cloud Service only). To delete a variable, include it with an empty value.
   * 
   * Expected answers:
   *   code 200 : VariableList (Successful update of environment variables)
   *   code 404 :  (Environment not found)
   * 
   * @param programId Identifier of the program
   * @param environmentId Identifier of the environment
   * @param xGwImsOrgId IMS organization ID that the request is being made under.
   * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO
   * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
   * @param contentType Must always be application/json
   * @param body The list of variables to add, modify, or remove. It is not necessary to send variables here which are not changing.
   */
  def patchEnvironmentVariables(programId: String, environmentId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, contentType: String, body: Seq[Variable]): ApiRequest[VariableList] =
    ApiRequest[VariableList](ApiMethods.PATCH, baseUrl, "/api/program/{programId}/environment/{environmentId}/variables", "application/json")
      .withBody(body)
      .withPathParam("programId", programId)
      .withPathParam("environmentId", environmentId)
      .withHeaderParam("x-gw-ims-org-id", xGwImsOrgId)
      .withHeaderParam("Authorization", authorization)
      .withHeaderParam("x-api-key", xApiKey)
      .withHeaderParam("Content-Type", contentType)
      .withSuccessResponse[VariableList](200)
      .withErrorResponse[Unit](404)
      



}

