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


import com.shinesolutions.aemcloudmanager4j.model.BranchList;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BranchesApi {
    private ApiClient localVarApiClient;

    public BranchesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BranchesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getBranches
     * @param programId Identifier of the program. (required)
     * @param repositoryId Identifier of the repository (required)
     * @param xGwImsOrgId IMS organization ID that the request is being made under. (required)
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO (required)
     * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful retrieval of the list of repository branches </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getBranchesCall(String programId, String repositoryId, String xGwImsOrgId, String authorization, String xApiKey, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/program/{programId}/repository/{repositoryId}/branches"
            .replaceAll("\\{" + "programId" + "\\}", localVarApiClient.escapeString(programId.toString()))
            .replaceAll("\\{" + "repositoryId" + "\\}", localVarApiClient.escapeString(repositoryId.toString()));

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
    private okhttp3.Call getBranchesValidateBeforeCall(String programId, String repositoryId, String xGwImsOrgId, String authorization, String xApiKey, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'programId' is set
        if (programId == null) {
            throw new ApiException("Missing the required parameter 'programId' when calling getBranches(Async)");
        }
        
        // verify the required parameter 'repositoryId' is set
        if (repositoryId == null) {
            throw new ApiException("Missing the required parameter 'repositoryId' when calling getBranches(Async)");
        }
        
        // verify the required parameter 'xGwImsOrgId' is set
        if (xGwImsOrgId == null) {
            throw new ApiException("Missing the required parameter 'xGwImsOrgId' when calling getBranches(Async)");
        }
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling getBranches(Async)");
        }
        
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling getBranches(Async)");
        }
        

        okhttp3.Call localVarCall = getBranchesCall(programId, repositoryId, xGwImsOrgId, authorization, xApiKey, _callback);
        return localVarCall;

    }

    /**
     * List Branches
     * Returns the list of branches from a repository
     * @param programId Identifier of the program. (required)
     * @param repositoryId Identifier of the repository (required)
     * @param xGwImsOrgId IMS organization ID that the request is being made under. (required)
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO (required)
     * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io (required)
     * @return BranchList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful retrieval of the list of repository branches </td><td>  -  </td></tr>
     </table>
     */
    public BranchList getBranches(String programId, String repositoryId, String xGwImsOrgId, String authorization, String xApiKey) throws ApiException {
        ApiResponse<BranchList> localVarResp = getBranchesWithHttpInfo(programId, repositoryId, xGwImsOrgId, authorization, xApiKey);
        return localVarResp.getData();
    }

    /**
     * List Branches
     * Returns the list of branches from a repository
     * @param programId Identifier of the program. (required)
     * @param repositoryId Identifier of the repository (required)
     * @param xGwImsOrgId IMS organization ID that the request is being made under. (required)
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO (required)
     * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io (required)
     * @return ApiResponse&lt;BranchList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful retrieval of the list of repository branches </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BranchList> getBranchesWithHttpInfo(String programId, String repositoryId, String xGwImsOrgId, String authorization, String xApiKey) throws ApiException {
        okhttp3.Call localVarCall = getBranchesValidateBeforeCall(programId, repositoryId, xGwImsOrgId, authorization, xApiKey, null);
        Type localVarReturnType = new TypeToken<BranchList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List Branches (asynchronously)
     * Returns the list of branches from a repository
     * @param programId Identifier of the program. (required)
     * @param repositoryId Identifier of the repository (required)
     * @param xGwImsOrgId IMS organization ID that the request is being made under. (required)
     * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO (required)
     * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful retrieval of the list of repository branches </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getBranchesAsync(String programId, String repositoryId, String xGwImsOrgId, String authorization, String xApiKey, final ApiCallback<BranchList> _callback) throws ApiException {

        okhttp3.Call localVarCall = getBranchesValidateBeforeCall(programId, repositoryId, xGwImsOrgId, authorization, xApiKey, _callback);
        Type localVarReturnType = new TypeToken<BranchList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
