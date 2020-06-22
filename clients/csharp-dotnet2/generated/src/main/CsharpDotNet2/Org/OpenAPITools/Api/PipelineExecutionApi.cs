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
    public interface IPipelineExecutionApi
    {
        /// <summary>
        /// Advance Post to this url in order to advance the current pipeline execution, if paused and waiting for user interaction. Link is present in output only in that case. The input depends on the actual reason for which the pipeline execution stopped.
        /// </summary>
        /// <param name="programId">Identifier of the program.</param>
        /// <param name="pipelineId">Identifier of the pipeline</param>
        /// <param name="executionId">Identifier of the execution</param>
        /// <param name="phaseId">Identifier of the phase</param>
        /// <param name="stepId">Identifier of the step</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <param name="contentType">Must always be application/json</param>
        /// <param name="body">Input for advance. See documentation for details.</param>
        /// <returns></returns>
        void AdvancePipelineExecution (string programId, string pipelineId, string executionId, string phaseId, string stepId, string xGwImsOrgId, string authorization, string xApiKey, string contentType, Object body);
        /// <summary>
        /// Cancel Post to this url in order to cancel the current pipeline execution. Link is present in output only in that case.
        /// </summary>
        /// <param name="programId">Identifier of the program.</param>
        /// <param name="pipelineId">Identifier of the pipeline</param>
        /// <param name="executionId">Identifier of the execution</param>
        /// <param name="phaseId">Identifier of the phase</param>
        /// <param name="stepId">Identifier of the step</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <param name="contentType">Must always be application/json</param>
        /// <param name="body">Input for advance. See documentation for details.</param>
        /// <returns></returns>
        void CancelPipelineExecutionStep (string programId, string pipelineId, string executionId, string phaseId, string stepId, string xGwImsOrgId, string authorization, string xApiKey, string contentType, Object body);
        /// <summary>
        /// Get current pipeline execution Returns current pipeline execution if any.
        /// </summary>
        /// <param name="programId">Identifier of the program.</param>
        /// <param name="pipelineId">Identifier of the pipeline</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <returns>PipelineExecution</returns>
        PipelineExecution GetCurrentExecution (string programId, string pipelineId, string xGwImsOrgId, string authorization, string xApiKey);
        /// <summary>
        /// Get pipeline execution Returns a pipeline execution by id
        /// </summary>
        /// <param name="programId">Identifier of the program.</param>
        /// <param name="pipelineId">Identifier of the pipeline</param>
        /// <param name="executionId">Identifier of the execution</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <returns>PipelineExecution</returns>
        PipelineExecution GetExecution (string programId, string pipelineId, string executionId, string xGwImsOrgId, string authorization, string xApiKey);
        /// <summary>
        /// List Executions Returns the history of pipeline executions in a newest to oldest order
        /// </summary>
        /// <param name="programId">Identifier of the program.</param>
        /// <param name="pipelineId">Identifier of the pipeline</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <param name="start">Pagination start parameter</param>
        /// <param name="limit">Pagination limit parameter</param>
        /// <returns>PipelineExecutionListRepresentation</returns>
        PipelineExecutionListRepresentation GetExecutions (string programId, string pipelineId, string xGwImsOrgId, string authorization, string xApiKey, string start, int? limit);
        /// <summary>
        /// Get logs Get the logs associated with a step.
        /// </summary>
        /// <param name="programId">Identifier of the program.</param>
        /// <param name="pipelineId">Identifier of the pipeline</param>
        /// <param name="executionId">Identifier of the execution</param>
        /// <param name="phaseId">Identifier of the phase</param>
        /// <param name="stepId">Identifier of the step</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <param name="file">Identifier of the log file</param>
        /// <param name="accept">Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header.</param>
        /// <returns></returns>
        void GetStepLogs (string programId, string pipelineId, string executionId, string phaseId, string stepId, string xGwImsOrgId, string authorization, string xApiKey, string file, string accept);
        /// <summary>
        /// Start the pipeline Starts the Pipeline. This works only if the pipeline is not already started.
        /// </summary>
        /// <param name="programId">Identifier of the program.</param>
        /// <param name="pipelineId">Identifier of the pipeline</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <param name="contentType">Must always be application/json</param>
        /// <returns></returns>
        void StartPipeline (string programId, string pipelineId, string xGwImsOrgId, string authorization, string xApiKey, string contentType);
        /// <summary>
        /// Get step metrics 
        /// </summary>
        /// <param name="programId">Identifier of the program.</param>
        /// <param name="pipelineId">Identifier of the pipeline</param>
        /// <param name="executionId">Identifier of the execution</param>
        /// <param name="phaseId">Identifier of the phase</param>
        /// <param name="stepId">Identifier of the step</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <returns>PipelineStepMetrics</returns>
        PipelineStepMetrics StepMetric (string programId, string pipelineId, string executionId, string phaseId, string stepId, string xGwImsOrgId, string authorization, string xApiKey);
        /// <summary>
        /// Get step state 
        /// </summary>
        /// <param name="programId">Identifier of the program.</param>
        /// <param name="pipelineId">Identifier of the pipeline</param>
        /// <param name="executionId">Identifier of the execution</param>
        /// <param name="phaseId">Identifier of the phase</param>
        /// <param name="stepId">Identifier of the step</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <returns>PipelineExecutionStepState</returns>
        PipelineExecutionStepState StepState (string programId, string pipelineId, string executionId, string phaseId, string stepId, string xGwImsOrgId, string authorization, string xApiKey);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class PipelineExecutionApi : IPipelineExecutionApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PipelineExecutionApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public PipelineExecutionApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="PipelineExecutionApi"/> class.
        /// </summary>
        /// <returns></returns>
        public PipelineExecutionApi(String basePath)
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
        /// Advance Post to this url in order to advance the current pipeline execution, if paused and waiting for user interaction. Link is present in output only in that case. The input depends on the actual reason for which the pipeline execution stopped.
        /// </summary>
        /// <param name="programId">Identifier of the program.</param> 
        /// <param name="pipelineId">Identifier of the pipeline</param> 
        /// <param name="executionId">Identifier of the execution</param> 
        /// <param name="phaseId">Identifier of the phase</param> 
        /// <param name="stepId">Identifier of the step</param> 
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param> 
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param> 
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param> 
        /// <param name="contentType">Must always be application/json</param> 
        /// <param name="body">Input for advance. See documentation for details.</param> 
        /// <returns></returns>            
        public void AdvancePipelineExecution (string programId, string pipelineId, string executionId, string phaseId, string stepId, string xGwImsOrgId, string authorization, string xApiKey, string contentType, Object body)
        {
            
            // verify the required parameter 'programId' is set
            if (programId == null) throw new ApiException(400, "Missing required parameter 'programId' when calling AdvancePipelineExecution");
            
            // verify the required parameter 'pipelineId' is set
            if (pipelineId == null) throw new ApiException(400, "Missing required parameter 'pipelineId' when calling AdvancePipelineExecution");
            
            // verify the required parameter 'executionId' is set
            if (executionId == null) throw new ApiException(400, "Missing required parameter 'executionId' when calling AdvancePipelineExecution");
            
            // verify the required parameter 'phaseId' is set
            if (phaseId == null) throw new ApiException(400, "Missing required parameter 'phaseId' when calling AdvancePipelineExecution");
            
            // verify the required parameter 'stepId' is set
            if (stepId == null) throw new ApiException(400, "Missing required parameter 'stepId' when calling AdvancePipelineExecution");
            
            // verify the required parameter 'xGwImsOrgId' is set
            if (xGwImsOrgId == null) throw new ApiException(400, "Missing required parameter 'xGwImsOrgId' when calling AdvancePipelineExecution");
            
            // verify the required parameter 'authorization' is set
            if (authorization == null) throw new ApiException(400, "Missing required parameter 'authorization' when calling AdvancePipelineExecution");
            
            // verify the required parameter 'xApiKey' is set
            if (xApiKey == null) throw new ApiException(400, "Missing required parameter 'xApiKey' when calling AdvancePipelineExecution");
            
            // verify the required parameter 'contentType' is set
            if (contentType == null) throw new ApiException(400, "Missing required parameter 'contentType' when calling AdvancePipelineExecution");
            
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling AdvancePipelineExecution");
            
    
            var path = "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/advance";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "programId" + "}", ApiClient.ParameterToString(programId));
path = path.Replace("{" + "pipelineId" + "}", ApiClient.ParameterToString(pipelineId));
path = path.Replace("{" + "executionId" + "}", ApiClient.ParameterToString(executionId));
path = path.Replace("{" + "phaseId" + "}", ApiClient.ParameterToString(phaseId));
path = path.Replace("{" + "stepId" + "}", ApiClient.ParameterToString(stepId));
    
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
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PUT, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling AdvancePipelineExecution: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling AdvancePipelineExecution: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// Cancel Post to this url in order to cancel the current pipeline execution. Link is present in output only in that case.
        /// </summary>
        /// <param name="programId">Identifier of the program.</param> 
        /// <param name="pipelineId">Identifier of the pipeline</param> 
        /// <param name="executionId">Identifier of the execution</param> 
        /// <param name="phaseId">Identifier of the phase</param> 
        /// <param name="stepId">Identifier of the step</param> 
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param> 
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param> 
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param> 
        /// <param name="contentType">Must always be application/json</param> 
        /// <param name="body">Input for advance. See documentation for details.</param> 
        /// <returns></returns>            
        public void CancelPipelineExecutionStep (string programId, string pipelineId, string executionId, string phaseId, string stepId, string xGwImsOrgId, string authorization, string xApiKey, string contentType, Object body)
        {
            
            // verify the required parameter 'programId' is set
            if (programId == null) throw new ApiException(400, "Missing required parameter 'programId' when calling CancelPipelineExecutionStep");
            
            // verify the required parameter 'pipelineId' is set
            if (pipelineId == null) throw new ApiException(400, "Missing required parameter 'pipelineId' when calling CancelPipelineExecutionStep");
            
            // verify the required parameter 'executionId' is set
            if (executionId == null) throw new ApiException(400, "Missing required parameter 'executionId' when calling CancelPipelineExecutionStep");
            
            // verify the required parameter 'phaseId' is set
            if (phaseId == null) throw new ApiException(400, "Missing required parameter 'phaseId' when calling CancelPipelineExecutionStep");
            
            // verify the required parameter 'stepId' is set
            if (stepId == null) throw new ApiException(400, "Missing required parameter 'stepId' when calling CancelPipelineExecutionStep");
            
            // verify the required parameter 'xGwImsOrgId' is set
            if (xGwImsOrgId == null) throw new ApiException(400, "Missing required parameter 'xGwImsOrgId' when calling CancelPipelineExecutionStep");
            
            // verify the required parameter 'authorization' is set
            if (authorization == null) throw new ApiException(400, "Missing required parameter 'authorization' when calling CancelPipelineExecutionStep");
            
            // verify the required parameter 'xApiKey' is set
            if (xApiKey == null) throw new ApiException(400, "Missing required parameter 'xApiKey' when calling CancelPipelineExecutionStep");
            
            // verify the required parameter 'contentType' is set
            if (contentType == null) throw new ApiException(400, "Missing required parameter 'contentType' when calling CancelPipelineExecutionStep");
            
            // verify the required parameter 'body' is set
            if (body == null) throw new ApiException(400, "Missing required parameter 'body' when calling CancelPipelineExecutionStep");
            
    
            var path = "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/cancel";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "programId" + "}", ApiClient.ParameterToString(programId));
path = path.Replace("{" + "pipelineId" + "}", ApiClient.ParameterToString(pipelineId));
path = path.Replace("{" + "executionId" + "}", ApiClient.ParameterToString(executionId));
path = path.Replace("{" + "phaseId" + "}", ApiClient.ParameterToString(phaseId));
path = path.Replace("{" + "stepId" + "}", ApiClient.ParameterToString(stepId));
    
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
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PUT, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling CancelPipelineExecutionStep: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CancelPipelineExecutionStep: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// Get current pipeline execution Returns current pipeline execution if any.
        /// </summary>
        /// <param name="programId">Identifier of the program.</param> 
        /// <param name="pipelineId">Identifier of the pipeline</param> 
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param> 
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param> 
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param> 
        /// <returns>PipelineExecution</returns>            
        public PipelineExecution GetCurrentExecution (string programId, string pipelineId, string xGwImsOrgId, string authorization, string xApiKey)
        {
            
            // verify the required parameter 'programId' is set
            if (programId == null) throw new ApiException(400, "Missing required parameter 'programId' when calling GetCurrentExecution");
            
            // verify the required parameter 'pipelineId' is set
            if (pipelineId == null) throw new ApiException(400, "Missing required parameter 'pipelineId' when calling GetCurrentExecution");
            
            // verify the required parameter 'xGwImsOrgId' is set
            if (xGwImsOrgId == null) throw new ApiException(400, "Missing required parameter 'xGwImsOrgId' when calling GetCurrentExecution");
            
            // verify the required parameter 'authorization' is set
            if (authorization == null) throw new ApiException(400, "Missing required parameter 'authorization' when calling GetCurrentExecution");
            
            // verify the required parameter 'xApiKey' is set
            if (xApiKey == null) throw new ApiException(400, "Missing required parameter 'xApiKey' when calling GetCurrentExecution");
            
    
            var path = "/api/program/{programId}/pipeline/{pipelineId}/execution";
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
                throw new ApiException ((int)response.StatusCode, "Error calling GetCurrentExecution: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetCurrentExecution: " + response.ErrorMessage, response.ErrorMessage);
    
            return (PipelineExecution) ApiClient.Deserialize(response.Content, typeof(PipelineExecution), response.Headers);
        }
    
        /// <summary>
        /// Get pipeline execution Returns a pipeline execution by id
        /// </summary>
        /// <param name="programId">Identifier of the program.</param> 
        /// <param name="pipelineId">Identifier of the pipeline</param> 
        /// <param name="executionId">Identifier of the execution</param> 
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param> 
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param> 
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param> 
        /// <returns>PipelineExecution</returns>            
        public PipelineExecution GetExecution (string programId, string pipelineId, string executionId, string xGwImsOrgId, string authorization, string xApiKey)
        {
            
            // verify the required parameter 'programId' is set
            if (programId == null) throw new ApiException(400, "Missing required parameter 'programId' when calling GetExecution");
            
            // verify the required parameter 'pipelineId' is set
            if (pipelineId == null) throw new ApiException(400, "Missing required parameter 'pipelineId' when calling GetExecution");
            
            // verify the required parameter 'executionId' is set
            if (executionId == null) throw new ApiException(400, "Missing required parameter 'executionId' when calling GetExecution");
            
            // verify the required parameter 'xGwImsOrgId' is set
            if (xGwImsOrgId == null) throw new ApiException(400, "Missing required parameter 'xGwImsOrgId' when calling GetExecution");
            
            // verify the required parameter 'authorization' is set
            if (authorization == null) throw new ApiException(400, "Missing required parameter 'authorization' when calling GetExecution");
            
            // verify the required parameter 'xApiKey' is set
            if (xApiKey == null) throw new ApiException(400, "Missing required parameter 'xApiKey' when calling GetExecution");
            
    
            var path = "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "programId" + "}", ApiClient.ParameterToString(programId));
path = path.Replace("{" + "pipelineId" + "}", ApiClient.ParameterToString(pipelineId));
path = path.Replace("{" + "executionId" + "}", ApiClient.ParameterToString(executionId));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling GetExecution: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetExecution: " + response.ErrorMessage, response.ErrorMessage);
    
            return (PipelineExecution) ApiClient.Deserialize(response.Content, typeof(PipelineExecution), response.Headers);
        }
    
        /// <summary>
        /// List Executions Returns the history of pipeline executions in a newest to oldest order
        /// </summary>
        /// <param name="programId">Identifier of the program.</param> 
        /// <param name="pipelineId">Identifier of the pipeline</param> 
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param> 
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param> 
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param> 
        /// <param name="start">Pagination start parameter</param> 
        /// <param name="limit">Pagination limit parameter</param> 
        /// <returns>PipelineExecutionListRepresentation</returns>            
        public PipelineExecutionListRepresentation GetExecutions (string programId, string pipelineId, string xGwImsOrgId, string authorization, string xApiKey, string start, int? limit)
        {
            
            // verify the required parameter 'programId' is set
            if (programId == null) throw new ApiException(400, "Missing required parameter 'programId' when calling GetExecutions");
            
            // verify the required parameter 'pipelineId' is set
            if (pipelineId == null) throw new ApiException(400, "Missing required parameter 'pipelineId' when calling GetExecutions");
            
            // verify the required parameter 'xGwImsOrgId' is set
            if (xGwImsOrgId == null) throw new ApiException(400, "Missing required parameter 'xGwImsOrgId' when calling GetExecutions");
            
            // verify the required parameter 'authorization' is set
            if (authorization == null) throw new ApiException(400, "Missing required parameter 'authorization' when calling GetExecutions");
            
            // verify the required parameter 'xApiKey' is set
            if (xApiKey == null) throw new ApiException(400, "Missing required parameter 'xApiKey' when calling GetExecutions");
            
    
            var path = "/api/program/{programId}/pipeline/{pipelineId}/executions";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "programId" + "}", ApiClient.ParameterToString(programId));
path = path.Replace("{" + "pipelineId" + "}", ApiClient.ParameterToString(pipelineId));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (start != null) queryParams.Add("start", ApiClient.ParameterToString(start)); // query parameter
 if (limit != null) queryParams.Add("limit", ApiClient.ParameterToString(limit)); // query parameter
             if (xGwImsOrgId != null) headerParams.Add("x-gw-ims-org-id", ApiClient.ParameterToString(xGwImsOrgId)); // header parameter
 if (authorization != null) headerParams.Add("Authorization", ApiClient.ParameterToString(authorization)); // header parameter
 if (xApiKey != null) headerParams.Add("x-api-key", ApiClient.ParameterToString(xApiKey)); // header parameter
                            
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetExecutions: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetExecutions: " + response.ErrorMessage, response.ErrorMessage);
    
            return (PipelineExecutionListRepresentation) ApiClient.Deserialize(response.Content, typeof(PipelineExecutionListRepresentation), response.Headers);
        }
    
        /// <summary>
        /// Get logs Get the logs associated with a step.
        /// </summary>
        /// <param name="programId">Identifier of the program.</param> 
        /// <param name="pipelineId">Identifier of the pipeline</param> 
        /// <param name="executionId">Identifier of the execution</param> 
        /// <param name="phaseId">Identifier of the phase</param> 
        /// <param name="stepId">Identifier of the step</param> 
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param> 
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param> 
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param> 
        /// <param name="file">Identifier of the log file</param> 
        /// <param name="accept">Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header.</param> 
        /// <returns></returns>            
        public void GetStepLogs (string programId, string pipelineId, string executionId, string phaseId, string stepId, string xGwImsOrgId, string authorization, string xApiKey, string file, string accept)
        {
            
            // verify the required parameter 'programId' is set
            if (programId == null) throw new ApiException(400, "Missing required parameter 'programId' when calling GetStepLogs");
            
            // verify the required parameter 'pipelineId' is set
            if (pipelineId == null) throw new ApiException(400, "Missing required parameter 'pipelineId' when calling GetStepLogs");
            
            // verify the required parameter 'executionId' is set
            if (executionId == null) throw new ApiException(400, "Missing required parameter 'executionId' when calling GetStepLogs");
            
            // verify the required parameter 'phaseId' is set
            if (phaseId == null) throw new ApiException(400, "Missing required parameter 'phaseId' when calling GetStepLogs");
            
            // verify the required parameter 'stepId' is set
            if (stepId == null) throw new ApiException(400, "Missing required parameter 'stepId' when calling GetStepLogs");
            
            // verify the required parameter 'xGwImsOrgId' is set
            if (xGwImsOrgId == null) throw new ApiException(400, "Missing required parameter 'xGwImsOrgId' when calling GetStepLogs");
            
            // verify the required parameter 'authorization' is set
            if (authorization == null) throw new ApiException(400, "Missing required parameter 'authorization' when calling GetStepLogs");
            
            // verify the required parameter 'xApiKey' is set
            if (xApiKey == null) throw new ApiException(400, "Missing required parameter 'xApiKey' when calling GetStepLogs");
            
    
            var path = "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/logs";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "programId" + "}", ApiClient.ParameterToString(programId));
path = path.Replace("{" + "pipelineId" + "}", ApiClient.ParameterToString(pipelineId));
path = path.Replace("{" + "executionId" + "}", ApiClient.ParameterToString(executionId));
path = path.Replace("{" + "phaseId" + "}", ApiClient.ParameterToString(phaseId));
path = path.Replace("{" + "stepId" + "}", ApiClient.ParameterToString(stepId));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (file != null) queryParams.Add("file", ApiClient.ParameterToString(file)); // query parameter
             if (accept != null) headerParams.Add("Accept", ApiClient.ParameterToString(accept)); // header parameter
 if (xGwImsOrgId != null) headerParams.Add("x-gw-ims-org-id", ApiClient.ParameterToString(xGwImsOrgId)); // header parameter
 if (authorization != null) headerParams.Add("Authorization", ApiClient.ParameterToString(authorization)); // header parameter
 if (xApiKey != null) headerParams.Add("x-api-key", ApiClient.ParameterToString(xApiKey)); // header parameter
                            
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetStepLogs: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetStepLogs: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// Start the pipeline Starts the Pipeline. This works only if the pipeline is not already started.
        /// </summary>
        /// <param name="programId">Identifier of the program.</param> 
        /// <param name="pipelineId">Identifier of the pipeline</param> 
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param> 
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param> 
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param> 
        /// <param name="contentType">Must always be application/json</param> 
        /// <returns></returns>            
        public void StartPipeline (string programId, string pipelineId, string xGwImsOrgId, string authorization, string xApiKey, string contentType)
        {
            
            // verify the required parameter 'programId' is set
            if (programId == null) throw new ApiException(400, "Missing required parameter 'programId' when calling StartPipeline");
            
            // verify the required parameter 'pipelineId' is set
            if (pipelineId == null) throw new ApiException(400, "Missing required parameter 'pipelineId' when calling StartPipeline");
            
            // verify the required parameter 'xGwImsOrgId' is set
            if (xGwImsOrgId == null) throw new ApiException(400, "Missing required parameter 'xGwImsOrgId' when calling StartPipeline");
            
            // verify the required parameter 'authorization' is set
            if (authorization == null) throw new ApiException(400, "Missing required parameter 'authorization' when calling StartPipeline");
            
            // verify the required parameter 'xApiKey' is set
            if (xApiKey == null) throw new ApiException(400, "Missing required parameter 'xApiKey' when calling StartPipeline");
            
            // verify the required parameter 'contentType' is set
            if (contentType == null) throw new ApiException(400, "Missing required parameter 'contentType' when calling StartPipeline");
            
    
            var path = "/api/program/{programId}/pipeline/{pipelineId}/execution";
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
                            
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.PUT, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling StartPipeline: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling StartPipeline: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// Get step metrics 
        /// </summary>
        /// <param name="programId">Identifier of the program.</param> 
        /// <param name="pipelineId">Identifier of the pipeline</param> 
        /// <param name="executionId">Identifier of the execution</param> 
        /// <param name="phaseId">Identifier of the phase</param> 
        /// <param name="stepId">Identifier of the step</param> 
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param> 
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param> 
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param> 
        /// <returns>PipelineStepMetrics</returns>            
        public PipelineStepMetrics StepMetric (string programId, string pipelineId, string executionId, string phaseId, string stepId, string xGwImsOrgId, string authorization, string xApiKey)
        {
            
            // verify the required parameter 'programId' is set
            if (programId == null) throw new ApiException(400, "Missing required parameter 'programId' when calling StepMetric");
            
            // verify the required parameter 'pipelineId' is set
            if (pipelineId == null) throw new ApiException(400, "Missing required parameter 'pipelineId' when calling StepMetric");
            
            // verify the required parameter 'executionId' is set
            if (executionId == null) throw new ApiException(400, "Missing required parameter 'executionId' when calling StepMetric");
            
            // verify the required parameter 'phaseId' is set
            if (phaseId == null) throw new ApiException(400, "Missing required parameter 'phaseId' when calling StepMetric");
            
            // verify the required parameter 'stepId' is set
            if (stepId == null) throw new ApiException(400, "Missing required parameter 'stepId' when calling StepMetric");
            
            // verify the required parameter 'xGwImsOrgId' is set
            if (xGwImsOrgId == null) throw new ApiException(400, "Missing required parameter 'xGwImsOrgId' when calling StepMetric");
            
            // verify the required parameter 'authorization' is set
            if (authorization == null) throw new ApiException(400, "Missing required parameter 'authorization' when calling StepMetric");
            
            // verify the required parameter 'xApiKey' is set
            if (xApiKey == null) throw new ApiException(400, "Missing required parameter 'xApiKey' when calling StepMetric");
            
    
            var path = "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/metrics";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "programId" + "}", ApiClient.ParameterToString(programId));
path = path.Replace("{" + "pipelineId" + "}", ApiClient.ParameterToString(pipelineId));
path = path.Replace("{" + "executionId" + "}", ApiClient.ParameterToString(executionId));
path = path.Replace("{" + "phaseId" + "}", ApiClient.ParameterToString(phaseId));
path = path.Replace("{" + "stepId" + "}", ApiClient.ParameterToString(stepId));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling StepMetric: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling StepMetric: " + response.ErrorMessage, response.ErrorMessage);
    
            return (PipelineStepMetrics) ApiClient.Deserialize(response.Content, typeof(PipelineStepMetrics), response.Headers);
        }
    
        /// <summary>
        /// Get step state 
        /// </summary>
        /// <param name="programId">Identifier of the program.</param> 
        /// <param name="pipelineId">Identifier of the pipeline</param> 
        /// <param name="executionId">Identifier of the execution</param> 
        /// <param name="phaseId">Identifier of the phase</param> 
        /// <param name="stepId">Identifier of the step</param> 
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param> 
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param> 
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param> 
        /// <returns>PipelineExecutionStepState</returns>            
        public PipelineExecutionStepState StepState (string programId, string pipelineId, string executionId, string phaseId, string stepId, string xGwImsOrgId, string authorization, string xApiKey)
        {
            
            // verify the required parameter 'programId' is set
            if (programId == null) throw new ApiException(400, "Missing required parameter 'programId' when calling StepState");
            
            // verify the required parameter 'pipelineId' is set
            if (pipelineId == null) throw new ApiException(400, "Missing required parameter 'pipelineId' when calling StepState");
            
            // verify the required parameter 'executionId' is set
            if (executionId == null) throw new ApiException(400, "Missing required parameter 'executionId' when calling StepState");
            
            // verify the required parameter 'phaseId' is set
            if (phaseId == null) throw new ApiException(400, "Missing required parameter 'phaseId' when calling StepState");
            
            // verify the required parameter 'stepId' is set
            if (stepId == null) throw new ApiException(400, "Missing required parameter 'stepId' when calling StepState");
            
            // verify the required parameter 'xGwImsOrgId' is set
            if (xGwImsOrgId == null) throw new ApiException(400, "Missing required parameter 'xGwImsOrgId' when calling StepState");
            
            // verify the required parameter 'authorization' is set
            if (authorization == null) throw new ApiException(400, "Missing required parameter 'authorization' when calling StepState");
            
            // verify the required parameter 'xApiKey' is set
            if (xApiKey == null) throw new ApiException(400, "Missing required parameter 'xApiKey' when calling StepState");
            
    
            var path = "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "programId" + "}", ApiClient.ParameterToString(programId));
path = path.Replace("{" + "pipelineId" + "}", ApiClient.ParameterToString(pipelineId));
path = path.Replace("{" + "executionId" + "}", ApiClient.ParameterToString(executionId));
path = path.Replace("{" + "phaseId" + "}", ApiClient.ParameterToString(phaseId));
path = path.Replace("{" + "stepId" + "}", ApiClient.ParameterToString(stepId));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling StepState: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling StepState: " + response.ErrorMessage, response.ErrorMessage);
    
            return (PipelineExecutionStepState) ApiClient.Deserialize(response.Content, typeof(PipelineExecutionStepState), response.Headers);
        }
    
    }
}
