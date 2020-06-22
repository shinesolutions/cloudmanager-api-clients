using System;
using System.Collections.Generic;
using RestSharp;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Org.OpenAPITools.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IVariablesApi
    {
        /// <summary>
        /// List User Environment Variables List the user defined variables for an environment (Cloud Service only).
        /// </summary>
        /// <param name="programId">Identifier of the program</param>
        /// <param name="environmentId">Identifier of the environment</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <returns>VariableList</returns>
        VariableList GetEnvironmentVariables (string programId, string environmentId, string xGwImsOrgId, string authorization, string xApiKey);
        /// <summary>
        /// Patch User Environment Variables Modify multiple environment variables (Cloud Service only). To delete a variable, include it with an empty value.
        /// </summary>
        /// <param name="programId">Identifier of the program</param>
        /// <param name="environmentId">Identifier of the environment</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <param name="contentType">Must always be application/json</param>
        /// <param name="body">The list of variables to add, modify, or remove. It is not necessary to send variables here which are not changing.</param>
        /// <returns>VariableList</returns>
        VariableList PatchEnvironmentVariables (string programId, string environmentId, string xGwImsOrgId, string authorization, string xApiKey, string contentType, List<Variable> body);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class VariablesApi : IVariablesApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="VariablesApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public VariablesApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="VariablesApi"/> class.
        /// </summary>
        /// <returns></returns>
        public VariablesApi(String basePath)
        {
            this.ApiClient = new ApiClient(basePath);
        }
    
        /// <summary>
        /// Sets the base path of the API client.
        /// </summary>
        /// <param name="basePath">The base path</param>
        /// <value>The base path</value>
        public void SetBasePath(String basePath)
        {
            this.ApiClient.BasePath = basePath;
        }
    
        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <param name="basePath">The base path</param>
        /// <value>The base path</value>
        public String GetBasePath(String basePath)
        {
            return this.ApiClient.BasePath;
        }
    
        /// <summary>
        /// Gets or sets the API client.
        /// </summary>
        /// <value>An instance of the ApiClient</value>
        public ApiClient ApiClient {get; set;}
    
        /// <summary>
        /// List User Environment Variables List the user defined variables for an environment (Cloud Service only).
        /// </summary>
        /// <param name="programId">Identifier of the program</param> 
        /// <param name="environmentId">Identifier of the environment</param> 
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param> 
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param> 
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param> 
        /// <returns>VariableList</returns>            
        public VariableList GetEnvironmentVariables (string programId, string environmentId, string xGwImsOrgId, string authorization, string xApiKey)
        {
            
            // verify the required parameter 'programId' is set
            if (programId == null) throw new ApiException(400, "Missing required parameter 'programId' when calling GetEnvironmentVariables");
            
            // verify the required parameter 'environmentId' is set
            if (environmentId == null) throw new ApiException(400, "Missing required parameter 'environmentId' when calling GetEnvironmentVariables");
            
            // verify the required parameter 'xGwImsOrgId' is set
            if (xGwImsOrgId == null) throw new ApiException(400, "Missing required parameter 'xGwImsOrgId' when calling GetEnvironmentVariables");
            
            // verify the required parameter 'authorization' is set
            if (authorization == null) throw new ApiException(400, "Missing required parameter 'authorization' when calling GetEnvironmentVariables");
            
            // verify the required parameter 'xApiKey' is set
            if (xApiKey == null) throw new ApiException(400, "Missing required parameter 'xApiKey' when calling GetEnvironmentVariables");
            
    
            var path = "/api/program/{programId}/environment/{environmentId}/variables";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "programId" + "}", ApiClient.ParameterToString(programId));
path = path.Replace("{" + "environmentId" + "}", ApiClient.ParameterToString(environmentId));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                         if (xGwImsOrgId != null) headerParams.Add("x-gw-ims-org-id", ApiClient.ParameterToString(xGwImsOrgId)); // header parameter
 if (authorization != null) headerParams.Add("Authorization", ApiClient.ParameterToString(authorization)); // header parameter
 if (xApiKey != null) headerParams.Add("x-api-key", ApiClient.ParameterToString(xApiKey)); // header parameter
                            
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetEnvironmentVariables: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetEnvironmentVariables: " + response.ErrorMessage, response.ErrorMessage);
    
            return (VariableList) ApiClient.Deserialize(response.Content, typeof(VariableList), response.Headers);
        }
    
        /// <summary>
        /// Patch User Environment Variables Modify multiple environment variables (Cloud Service only). To delete a variable, include it with an empty value.
        /// </summary>
        /// <param name="programId">Identifier of the program</param> 
        /// <param name="environmentId">Identifier of the environment</param> 
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param> 
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param> 
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param> 
        /// <param name="contentType">Must always be application/json</param> 
        /// <param name="body">The list of variables to add, modify, or remove. It is not necessary to send variables here which are not changing.</param> 
        /// <returns>VariableList</returns>            
        public VariableList PatchEnvironmentVariables (string programId, string environmentId, string xGwImsOrgId, string authorization, string xApiKey, string contentType, List<Variable> body)
        {
            
            // verify the required parameter 'programId' is set
            if (programId == null) throw new ApiException(400, "Missing required parameter 'programId' when calling PatchEnvironmentVariables");
            
            // verify the required parameter 'environmentId' is set
            if (environmentId == null) throw new ApiException(400, "Missing required parameter 'environmentId' when calling PatchEnvironmentVariables");
            
            // verify the required parameter 'xGwImsOrgId' is set
            if (xGwImsOrgId == null) throw new ApiException(400, "Missing required parameter 'xGwImsOrgId' when calling PatchEnvironmentVariables");
            
            // verify the required parameter 'authorization' is set
            if (authorization == null) throw new ApiException(400, "Missing required parameter 'authorization' when calling PatchEnvironmentVariables");
            
            // verify the required parameter 'xApiKey' is set
            if (xApiKey == null) throw new ApiException(400, "Missing required parameter 'xApiKey' when calling PatchEnvironmentVariables");
            
            // verify the required parameter 'contentType' is set
            if (contentType == null) throw new ApiException(400, "Missing required parameter 'contentType' when calling PatchEnvironmentVariables");
            
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling PatchEnvironmentVariables");
            
    
            var path = "/api/program/{programId}/environment/{environmentId}/variables";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "programId" + "}", ApiClient.ParameterToString(programId));
path = path.Replace("{" + "environmentId" + "}", ApiClient.ParameterToString(environmentId));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                         if (xGwImsOrgId != null) headerParams.Add("x-gw-ims-org-id", ApiClient.ParameterToString(xGwImsOrgId)); // header parameter
 if (authorization != null) headerParams.Add("Authorization", ApiClient.ParameterToString(authorization)); // header parameter
 if (xApiKey != null) headerParams.Add("x-api-key", ApiClient.ParameterToString(xApiKey)); // header parameter
 if (contentType != null) headerParams.Add("Content-Type", ApiClient.ParameterToString(contentType)); // header parameter
                        postBody = ApiClient.Serialize(body); // http body (model) parameter
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PATCH, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling PatchEnvironmentVariables: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PatchEnvironmentVariables: " + response.ErrorMessage, response.ErrorMessage);
    
            return (VariableList) ApiClient.Deserialize(response.Content, typeof(VariableList), response.Headers);
        }
    
    }
}
