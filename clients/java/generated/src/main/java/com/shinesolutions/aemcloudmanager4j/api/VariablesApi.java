/*
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


package com.shinesolutions.aemcloudmanager4j.api;

import com.shinesolutions.aemcloudmanager4j.ApiCallback;
import com.shinesolutions.aemcloudmanager4j.ApiClient;
import com.shinesolutions.aemcloudmanager4j.ApiException;
import com.shinesolutions.aemcloudmanager4j.ApiResponse;
import com.shinesolutions.aemcloudmanager4j.Configuration;
import com.shinesolutions.aemcloudmanager4j.Pair;
import com.shinesolutions.aemcloudmanager4j.ProgressRequestBody;
import com.shinesolutions.aemcloudmanager4j.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.shinesolutions.aemcloudmanager4j.model.Variable;
import com.shinesolutions.aemcloudmanager4j.model.VariableList;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VariablesApi {
    private ApiClient localVarApiClient;

    public VariablesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public VariablesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getEnvironmentVariables
     * @param programId Identifier of the program (required)
     * @param environmentId Identifier of the environment (required)
     * @param xGwImsOrgId IMS organization ID that the request is being made under. (required)
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO (required)
     * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful retrieval of environment variables </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Environment not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getEnvironmentVariablesCall(String programId, String environmentId, String xGwImsOrgId, String authorization, String xApiKey, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/program/{programId}/environment/{environmentId}/variables"
            .replaceAll("\\{" + "programId" + "\\}", localVarApiClient.escapeString(programId.toString()))
            .replaceAll("\\{" + "environmentId" + "\\}", localVarApiClient.escapeString(environmentId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xGwImsOrgId != null) {
            localVarHeaderParams.put("x-gw-ims-org-id", localVarApiClient.parameterToString(xGwImsOrgId));
        }

        if (authorization != null) {
            localVarHeaderParams.put("Authorization", localVarApiClient.parameterToString(authorization));
        }

        if (xApiKey != null) {
            localVarHeaderParams.put("x-api-key", localVarApiClient.parameterToString(xApiKey));
        }

        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getEnvironmentVariablesValidateBeforeCall(String programId, String environmentId, String xGwImsOrgId, String authorization, String xApiKey, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'programId' is set
        if (programId == null) {
            throw new ApiException("Missing the required parameter 'programId' when calling getEnvironmentVariables(Async)");
        }
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new ApiException("Missing the required parameter 'environmentId' when calling getEnvironmentVariables(Async)");
        }
        
        // verify the required parameter 'xGwImsOrgId' is set
        if (xGwImsOrgId == null) {
            throw new ApiException("Missing the required parameter 'xGwImsOrgId' when calling getEnvironmentVariables(Async)");
        }
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling getEnvironmentVariables(Async)");
        }
        
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling getEnvironmentVariables(Async)");
        }
        

        okhttp3.Call localVarCall = getEnvironmentVariablesCall(programId, environmentId, xGwImsOrgId, authorization, xApiKey, _callback);
        return localVarCall;

    }

    /**
     * List User Environment Variables
     * List the user defined variables for an environment (Cloud Service only).
     * @param programId Identifier of the program (required)
     * @param environmentId Identifier of the environment (required)
     * @param xGwImsOrgId IMS organization ID that the request is being made under. (required)
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO (required)
     * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io (required)
     * @return VariableList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful retrieval of environment variables </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Environment not found </td><td>  -  </td></tr>
     </table>
     */
    public VariableList getEnvironmentVariables(String programId, String environmentId, String xGwImsOrgId, String authorization, String xApiKey) throws ApiException {
        ApiResponse<VariableList> localVarResp = getEnvironmentVariablesWithHttpInfo(programId, environmentId, xGwImsOrgId, authorization, xApiKey);
        return localVarResp.getData();
    }

    /**
     * List User Environment Variables
     * List the user defined variables for an environment (Cloud Service only).
     * @param programId Identifier of the program (required)
     * @param environmentId Identifier of the environment (required)
     * @param xGwImsOrgId IMS organization ID that the request is being made under. (required)
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO (required)
     * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io (required)
     * @return ApiResponse&lt;VariableList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful retrieval of environment variables </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Environment not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<VariableList> getEnvironmentVariablesWithHttpInfo(String programId, String environmentId, String xGwImsOrgId, String authorization, String xApiKey) throws ApiException {
        okhttp3.Call localVarCall = getEnvironmentVariablesValidateBeforeCall(programId, environmentId, xGwImsOrgId, authorization, xApiKey, null);
        Type localVarReturnType = new TypeToken<VariableList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List User Environment Variables (asynchronously)
     * List the user defined variables for an environment (Cloud Service only).
     * @param programId Identifier of the program (required)
     * @param environmentId Identifier of the environment (required)
     * @param xGwImsOrgId IMS organization ID that the request is being made under. (required)
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO (required)
     * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful retrieval of environment variables </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Environment not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getEnvironmentVariablesAsync(String programId, String environmentId, String xGwImsOrgId, String authorization, String xApiKey, final ApiCallback<VariableList> _callback) throws ApiException {

        okhttp3.Call localVarCall = getEnvironmentVariablesValidateBeforeCall(programId, environmentId, xGwImsOrgId, authorization, xApiKey, _callback);
        Type localVarReturnType = new TypeToken<VariableList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for patchEnvironmentVariables
     * @param programId Identifier of the program (required)
     * @param environmentId Identifier of the environment (required)
     * @param xGwImsOrgId IMS organization ID that the request is being made under. (required)
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO (required)
     * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io (required)
     * @param contentType Must always be application/json (required)
     * @param body The list of variables to add, modify, or remove. It is not necessary to send variables here which are not changing. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful update of environment variables </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Environment not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call patchEnvironmentVariablesCall(String programId, String environmentId, String xGwImsOrgId, String authorization, String xApiKey, String contentType, List<Variable> body, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/api/program/{programId}/environment/{environmentId}/variables"
            .replaceAll("\\{" + "programId" + "\\}", localVarApiClient.escapeString(programId.toString()))
            .replaceAll("\\{" + "environmentId" + "\\}", localVarApiClient.escapeString(environmentId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xGwImsOrgId != null) {
            localVarHeaderParams.put("x-gw-ims-org-id", localVarApiClient.parameterToString(xGwImsOrgId));
        }

        if (authorization != null) {
            localVarHeaderParams.put("Authorization", localVarApiClient.parameterToString(authorization));
        }

        if (xApiKey != null) {
            localVarHeaderParams.put("x-api-key", localVarApiClient.parameterToString(xApiKey));
        }

        if (contentType != null) {
            localVarHeaderParams.put("Content-Type", localVarApiClient.parameterToString(contentType));
        }

        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call patchEnvironmentVariablesValidateBeforeCall(String programId, String environmentId, String xGwImsOrgId, String authorization, String xApiKey, String contentType, List<Variable> body, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'programId' is set
        if (programId == null) {
            throw new ApiException("Missing the required parameter 'programId' when calling patchEnvironmentVariables(Async)");
        }
        
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new ApiException("Missing the required parameter 'environmentId' when calling patchEnvironmentVariables(Async)");
        }
        
        // verify the required parameter 'xGwImsOrgId' is set
        if (xGwImsOrgId == null) {
            throw new ApiException("Missing the required parameter 'xGwImsOrgId' when calling patchEnvironmentVariables(Async)");
        }
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling patchEnvironmentVariables(Async)");
        }
        
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling patchEnvironmentVariables(Async)");
        }
        
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling patchEnvironmentVariables(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling patchEnvironmentVariables(Async)");
        }
        

        okhttp3.Call localVarCall = patchEnvironmentVariablesCall(programId, environmentId, xGwImsOrgId, authorization, xApiKey, contentType, body, _callback);
        return localVarCall;

    }

    /**
     * Patch User Environment Variables
     * Modify multiple environment variables (Cloud Service only). To delete a variable, include it with an empty value.
     * @param programId Identifier of the program (required)
     * @param environmentId Identifier of the environment (required)
     * @param xGwImsOrgId IMS organization ID that the request is being made under. (required)
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO (required)
     * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io (required)
     * @param contentType Must always be application/json (required)
     * @param body The list of variables to add, modify, or remove. It is not necessary to send variables here which are not changing. (required)
     * @return VariableList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful update of environment variables </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Environment not found </td><td>  -  </td></tr>
     </table>
     */
    public VariableList patchEnvironmentVariables(String programId, String environmentId, String xGwImsOrgId, String authorization, String xApiKey, String contentType, List<Variable> body) throws ApiException {
        ApiResponse<VariableList> localVarResp = patchEnvironmentVariablesWithHttpInfo(programId, environmentId, xGwImsOrgId, authorization, xApiKey, contentType, body);
        return localVarResp.getData();
    }

    /**
     * Patch User Environment Variables
     * Modify multiple environment variables (Cloud Service only). To delete a variable, include it with an empty value.
     * @param programId Identifier of the program (required)
     * @param environmentId Identifier of the environment (required)
     * @param xGwImsOrgId IMS organization ID that the request is being made under. (required)
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO (required)
     * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io (required)
     * @param contentType Must always be application/json (required)
     * @param body The list of variables to add, modify, or remove. It is not necessary to send variables here which are not changing. (required)
     * @return ApiResponse&lt;VariableList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful update of environment variables </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Environment not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<VariableList> patchEnvironmentVariablesWithHttpInfo(String programId, String environmentId, String xGwImsOrgId, String authorization, String xApiKey, String contentType, List<Variable> body) throws ApiException {
        okhttp3.Call localVarCall = patchEnvironmentVariablesValidateBeforeCall(programId, environmentId, xGwImsOrgId, authorization, xApiKey, contentType, body, null);
        Type localVarReturnType = new TypeToken<VariableList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Patch User Environment Variables (asynchronously)
     * Modify multiple environment variables (Cloud Service only). To delete a variable, include it with an empty value.
     * @param programId Identifier of the program (required)
     * @param environmentId Identifier of the environment (required)
     * @param xGwImsOrgId IMS organization ID that the request is being made under. (required)
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO (required)
     * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io (required)
     * @param contentType Must always be application/json (required)
     * @param body The list of variables to add, modify, or remove. It is not necessary to send variables here which are not changing. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful update of environment variables </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Environment not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call patchEnvironmentVariablesAsync(String programId, String environmentId, String xGwImsOrgId, String authorization, String xApiKey, String contentType, List<Variable> body, final ApiCallback<VariableList> _callback) throws ApiException {

        okhttp3.Call localVarCall = patchEnvironmentVariablesValidateBeforeCall(programId, environmentId, xGwImsOrgId, authorization, xApiKey, contentType, body, _callback);
        Type localVarReturnType = new TypeToken<VariableList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
