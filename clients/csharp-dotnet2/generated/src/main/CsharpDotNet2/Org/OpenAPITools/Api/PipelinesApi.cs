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
    public interface IPipelinesApi
    {
        /// <summary>
        /// Delete a Pipeline Delete a pipeline. All the data is wiped.
        /// </summary>
        /// <param name="programId">Identifier of the program</param>
        /// <param name="pipelineId">Identifier of the pipeline</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <returns></returns>
        void DeletePipeline (string programId, string pipelineId, string xGwImsOrgId, string authorization, string xApiKey);
        /// <summary>
        /// Get Pipeline Returns a pipeline by its id
        /// </summary>
        /// <param name="programId">Identifier of the program</param>
        /// <param name="pipelineId">Identifier of the pipeline</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <returns>Pipeline</returns>
        Pipeline GetPipeline (string programId, string pipelineId, string xGwImsOrgId, string authorization, string xApiKey);
        /// <summary>
        /// List Pipelines Returns all the pipelines that the requesting user has access to in an program
        /// </summary>
        /// <param name="programId">Identifier of the program</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <returns>PipelineList</returns>
        PipelineList GetPipelines (string programId, string xGwImsOrgId, string authorization, string xApiKey);
        /// <summary>
        /// Patches Pipeline Patches a pipeline within an program.
        /// </summary>
        /// <param name="programId">Identifier of the program</param>
        /// <param name="pipelineId">Identifier of the pipeline</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <param name="contentType">Must always be application/json</param>
        /// <param name="body">The updated Pipeline</param>
        /// <returns>Pipeline</returns>
        Pipeline PatchPipeline (string programId, string pipelineId, string xGwImsOrgId, string authorization, string xApiKey, string contentType, Pipeline body);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class PipelinesApi : IPipelinesApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PipelinesApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public PipelinesApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="PipelinesApi"/> class.
        /// </summary>
        /// <returns></returns>
        public PipelinesApi(String basePath)
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
        /// Delete a Pipeline Delete a pipeline. All the data is wiped.
        /// </summary>
        /// <param name="programId">Identifier of the program</param> 
        /// <param name="pipelineId">Identifier of the pipeline</param> 
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param> 
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param> 
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param> 
        /// <returns></returns>            
        public void DeletePipeline (string programId, string pipelineId, string xGwImsOrgId, string authorization, string xApiKey)
        {
            
            // verify the required parameter 'programId' is set
            if (programId == null) throw new ApiException(400, "Missing required parameter 'programId' when calling DeletePipeline");
            
            // verify the required parameter 'pipelineId' is set
            if (pipelineId == null) throw new ApiException(400, "Missing required parameter 'pipelineId' when calling DeletePipeline");
            
            // verify the required parameter 'xGwImsOrgId' is set
            if (xGwImsOrgId == null) throw new ApiException(400, "Missing required parameter 'xGwImsOrgId' when calling DeletePipeline");
            
            // verify the required parameter 'authorization' is set
            if (authorization == null) throw new ApiException(400, "Missing required parameter 'authorization' when calling DeletePipeline");
            
            // verify the required parameter 'xApiKey' is set
            if (xApiKey == null) throw new ApiException(400, "Missing required parameter 'xApiKey' when calling DeletePipeline");
            
    
            var path = "/api/program/{programId}/pipeline/{pipelineId}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "programId" + "}", ApiClient.ParameterToString(programId));
path = path.Replace("{" + "pipelineId" + "}", ApiClient.ParameterToString(pipelineId));
    
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
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.DELETE, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling DeletePipeline: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DeletePipeline: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// Get Pipeline Returns a pipeline by its id
        /// </summary>
        /// <param name="programId">Identifier of the program</param> 
        /// <param name="pipelineId">Identifier of the pipeline</param> 
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param> 
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param> 
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param> 
        /// <returns>Pipeline</returns>            
        public Pipeline GetPipeline (string programId, string pipelineId, string xGwImsOrgId, string authorization, string xApiKey)
        {
            
            // verify the required parameter 'programId' is set
            if (programId == null) throw new ApiException(400, "Missing required parameter 'programId' when calling GetPipeline");
            
            // verify the required parameter 'pipelineId' is set
            if (pipelineId == null) throw new ApiException(400, "Missing required parameter 'pipelineId' when calling GetPipeline");
            
            // verify the required parameter 'xGwImsOrgId' is set
            if (xGwImsOrgId == null) throw new ApiException(400, "Missing required parameter 'xGwImsOrgId' when calling GetPipeline");
            
            // verify the required parameter 'authorization' is set
            if (authorization == null) throw new ApiException(400, "Missing required parameter 'authorization' when calling GetPipeline");
            
            // verify the required parameter 'xApiKey' is set
            if (xApiKey == null) throw new ApiException(400, "Missing required parameter 'xApiKey' when calling GetPipeline");
            
    
            var path = "/api/program/{programId}/pipeline/{pipelineId}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "programId" + "}", ApiClient.ParameterToString(programId));
path = path.Replace("{" + "pipelineId" + "}", ApiClient.ParameterToString(pipelineId));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling GetPipeline: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetPipeline: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Pipeline) ApiClient.Deserialize(response.Content, typeof(Pipeline), response.Headers);
        }
    
        /// <summary>
        /// List Pipelines Returns all the pipelines that the requesting user has access to in an program
        /// </summary>
        /// <param name="programId">Identifier of the program</param> 
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param> 
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param> 
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param> 
        /// <returns>PipelineList</returns>            
        public PipelineList GetPipelines (string programId, string xGwImsOrgId, string authorization, string xApiKey)
        {
            
            // verify the required parameter 'programId' is set
            if (programId == null) throw new ApiException(400, "Missing required parameter 'programId' when calling GetPipelines");
            
            // verify the required parameter 'xGwImsOrgId' is set
            if (xGwImsOrgId == null) throw new ApiException(400, "Missing required parameter 'xGwImsOrgId' when calling GetPipelines");
            
            // verify the required parameter 'authorization' is set
            if (authorization == null) throw new ApiException(400, "Missing required parameter 'authorization' when calling GetPipelines");
            
            // verify the required parameter 'xApiKey' is set
            if (xApiKey == null) throw new ApiException(400, "Missing required parameter 'xApiKey' when calling GetPipelines");
            
    
            var path = "/api/program/{programId}/pipelines";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "programId" + "}", ApiClient.ParameterToString(programId));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling GetPipelines: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetPipelines: " + response.ErrorMessage, response.ErrorMessage);
    
            return (PipelineList) ApiClient.Deserialize(response.Content, typeof(PipelineList), response.Headers);
        }
    
        /// <summary>
        /// Patches Pipeline Patches a pipeline within an program.
        /// </summary>
        /// <param name="programId">Identifier of the program</param> 
        /// <param name="pipelineId">Identifier of the pipeline</param> 
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param> 
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param> 
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param> 
        /// <param name="contentType">Must always be application/json</param> 
        /// <param name="body">The updated Pipeline</param> 
        /// <returns>Pipeline</returns>            
        public Pipeline PatchPipeline (string programId, string pipelineId, string xGwImsOrgId, string authorization, string xApiKey, string contentType, Pipeline body)
        {
            
            // verify the required parameter 'programId' is set
            if (programId == null) throw new ApiException(400, "Missing required parameter 'programId' when calling PatchPipeline");
            
            // verify the required parameter 'pipelineId' is set
            if (pipelineId == null) throw new ApiException(400, "Missing required parameter 'pipelineId' when calling PatchPipeline");
            
            // verify the required parameter 'xGwImsOrgId' is set
            if (xGwImsOrgId == null) throw new ApiException(400, "Missing required parameter 'xGwImsOrgId' when calling PatchPipeline");
            
            // verify the required parameter 'authorization' is set
            if (authorization == null) throw new ApiException(400, "Missing required parameter 'authorization' when calling PatchPipeline");
            
            // verify the required parameter 'xApiKey' is set
            if (xApiKey == null) throw new ApiException(400, "Missing required parameter 'xApiKey' when calling PatchPipeline");
            
            // verify the required parameter 'contentType' is set
            if (contentType == null) throw new ApiException(400, "Missing required parameter 'contentType' when calling PatchPipeline");
            
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling PatchPipeline");
            
    
            var path = "/api/program/{programId}/pipeline/{pipelineId}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "programId" + "}", ApiClient.ParameterToString(programId));
path = path.Replace("{" + "pipelineId" + "}", ApiClient.ParameterToString(pipelineId));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling PatchPipeline: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PatchPipeline: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Pipeline) ApiClient.Deserialize(response.Content, typeof(Pipeline), response.Headers);
        }
    
    }
}
