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
    public interface IEnvironmentsApi
    {
        /// <summary>
        /// DeleteEnvironment Delete environment
        /// </summary>
        /// <param name="programId">Identifier of the application</param>
        /// <param name="environmentId">Identifier of the environment</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <returns>Environment</returns>
        Environment DeleteEnvironment (string programId, string environmentId, string xGwImsOrgId, string authorization, string xApiKey);
        /// <summary>
        /// Download Logs Download environment logs
        /// </summary>
        /// <param name="programId">Identifier of the program</param>
        /// <param name="environmentId">Identifier of the environment</param>
        /// <param name="service">Name of service</param>
        /// <param name="name">Name of log</param>
        /// <param name="date">date for which log is required</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <param name="accept">Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header.</param>
        /// <returns></returns>
        void DownloadLogs (string programId, string environmentId, string service, string name, string date, string xGwImsOrgId, string authorization, string xApiKey, string accept);
        /// <summary>
        /// Get Environment Returns an environment by its id
        /// </summary>
        /// <param name="programId">Identifier of the program</param>
        /// <param name="environmentId">Identifier of the environment</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <returns>Environment</returns>
        Environment GetEnvironment (string programId, string environmentId, string xGwImsOrgId, string authorization, string xApiKey);
        /// <summary>
        /// Get Environment Logs List all logs available in environment
        /// </summary>
        /// <param name="programId">Identifier of the program</param>
        /// <param name="environmentId">Identifier of the environment</param>
        /// <param name="days">number of days for which logs are required</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <param name="service">Names of services</param>
        /// <param name="name">Names of log</param>
        /// <returns>EnvironmentLogs</returns>
        EnvironmentLogs GetEnvironmentLogs (string programId, string environmentId, int? days, string xGwImsOrgId, string authorization, string xApiKey, List<string> service, List<string> name);
        /// <summary>
        /// List Environments Lists all environments in an program
        /// </summary>
        /// <param name="programId">Identifier of the program</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <param name="type">Type of the environment</param>
        /// <returns>EnvironmentList</returns>
        EnvironmentList GetEnvironments (string programId, string xGwImsOrgId, string authorization, string xApiKey, string type);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class EnvironmentsApi : IEnvironmentsApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EnvironmentsApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public EnvironmentsApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="EnvironmentsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public EnvironmentsApi(String basePath)
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
        /// DeleteEnvironment Delete environment
        /// </summary>
        /// <param name="programId">Identifier of the application</param> 
        /// <param name="environmentId">Identifier of the environment</param> 
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param> 
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param> 
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param> 
        /// <returns>Environment</returns>            
        public Environment DeleteEnvironment (string programId, string environmentId, string xGwImsOrgId, string authorization, string xApiKey)
        {
            
            // verify the required parameter 'programId' is set
            if (programId == null) throw new ApiException(400, "Missing required parameter 'programId' when calling DeleteEnvironment");
            
            // verify the required parameter 'environmentId' is set
            if (environmentId == null) throw new ApiException(400, "Missing required parameter 'environmentId' when calling DeleteEnvironment");
            
            // verify the required parameter 'xGwImsOrgId' is set
            if (xGwImsOrgId == null) throw new ApiException(400, "Missing required parameter 'xGwImsOrgId' when calling DeleteEnvironment");
            
            // verify the required parameter 'authorization' is set
            if (authorization == null) throw new ApiException(400, "Missing required parameter 'authorization' when calling DeleteEnvironment");
            
            // verify the required parameter 'xApiKey' is set
            if (xApiKey == null) throw new ApiException(400, "Missing required parameter 'xApiKey' when calling DeleteEnvironment");
            
    
            var path = "/api/program/{programId}/environment/{environmentId}";
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
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.DELETE, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteEnvironment: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DeleteEnvironment: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Environment) ApiClient.Deserialize(response.Content, typeof(Environment), response.Headers);
        }
    
        /// <summary>
        /// Download Logs Download environment logs
        /// </summary>
        /// <param name="programId">Identifier of the program</param> 
        /// <param name="environmentId">Identifier of the environment</param> 
        /// <param name="service">Name of service</param> 
        /// <param name="name">Name of log</param> 
        /// <param name="date">date for which log is required</param> 
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param> 
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param> 
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param> 
        /// <param name="accept">Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header.</param> 
        /// <returns></returns>            
        public void DownloadLogs (string programId, string environmentId, string service, string name, string date, string xGwImsOrgId, string authorization, string xApiKey, string accept)
        {
            
            // verify the required parameter 'programId' is set
            if (programId == null) throw new ApiException(400, "Missing required parameter 'programId' when calling DownloadLogs");
            
            // verify the required parameter 'environmentId' is set
            if (environmentId == null) throw new ApiException(400, "Missing required parameter 'environmentId' when calling DownloadLogs");
            
            // verify the required parameter 'service' is set
            if (service == null) throw new ApiException(400, "Missing required parameter 'service' when calling DownloadLogs");
            
            // verify the required parameter 'name' is set
            if (name == null) throw new ApiException(400, "Missing required parameter 'name' when calling DownloadLogs");
            
            // verify the required parameter 'date' is set
            if (date == null) throw new ApiException(400, "Missing required parameter 'date' when calling DownloadLogs");
            
            // verify the required parameter 'xGwImsOrgId' is set
            if (xGwImsOrgId == null) throw new ApiException(400, "Missing required parameter 'xGwImsOrgId' when calling DownloadLogs");
            
            // verify the required parameter 'authorization' is set
            if (authorization == null) throw new ApiException(400, "Missing required parameter 'authorization' when calling DownloadLogs");
            
            // verify the required parameter 'xApiKey' is set
            if (xApiKey == null) throw new ApiException(400, "Missing required parameter 'xApiKey' when calling DownloadLogs");
            
    
            var path = "/api/program/{programId}/environment/{environmentId}/logs/download";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "programId" + "}", ApiClient.ParameterToString(programId));
path = path.Replace("{" + "environmentId" + "}", ApiClient.ParameterToString(environmentId));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (service != null) queryParams.Add("service", ApiClient.ParameterToString(service)); // query parameter
 if (name != null) queryParams.Add("name", ApiClient.ParameterToString(name)); // query parameter
 if (date != null) queryParams.Add("date", ApiClient.ParameterToString(date)); // query parameter
             if (xGwImsOrgId != null) headerParams.Add("x-gw-ims-org-id", ApiClient.ParameterToString(xGwImsOrgId)); // header parameter
 if (authorization != null) headerParams.Add("Authorization", ApiClient.ParameterToString(authorization)); // header parameter
 if (xApiKey != null) headerParams.Add("x-api-key", ApiClient.ParameterToString(xApiKey)); // header parameter
 if (accept != null) headerParams.Add("Accept", ApiClient.ParameterToString(accept)); // header parameter
                            
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling DownloadLogs: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling DownloadLogs: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// Get Environment Returns an environment by its id
        /// </summary>
        /// <param name="programId">Identifier of the program</param> 
        /// <param name="environmentId">Identifier of the environment</param> 
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param> 
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param> 
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param> 
        /// <returns>Environment</returns>            
        public Environment GetEnvironment (string programId, string environmentId, string xGwImsOrgId, string authorization, string xApiKey)
        {
            
            // verify the required parameter 'programId' is set
            if (programId == null) throw new ApiException(400, "Missing required parameter 'programId' when calling GetEnvironment");
            
            // verify the required parameter 'environmentId' is set
            if (environmentId == null) throw new ApiException(400, "Missing required parameter 'environmentId' when calling GetEnvironment");
            
            // verify the required parameter 'xGwImsOrgId' is set
            if (xGwImsOrgId == null) throw new ApiException(400, "Missing required parameter 'xGwImsOrgId' when calling GetEnvironment");
            
            // verify the required parameter 'authorization' is set
            if (authorization == null) throw new ApiException(400, "Missing required parameter 'authorization' when calling GetEnvironment");
            
            // verify the required parameter 'xApiKey' is set
            if (xApiKey == null) throw new ApiException(400, "Missing required parameter 'xApiKey' when calling GetEnvironment");
            
    
            var path = "/api/program/{programId}/environment/{environmentId}";
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
                throw new ApiException ((int)response.StatusCode, "Error calling GetEnvironment: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetEnvironment: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Environment) ApiClient.Deserialize(response.Content, typeof(Environment), response.Headers);
        }
    
        /// <summary>
        /// Get Environment Logs List all logs available in environment
        /// </summary>
        /// <param name="programId">Identifier of the program</param> 
        /// <param name="environmentId">Identifier of the environment</param> 
        /// <param name="days">number of days for which logs are required</param> 
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param> 
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param> 
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param> 
        /// <param name="service">Names of services</param> 
        /// <param name="name">Names of log</param> 
        /// <returns>EnvironmentLogs</returns>            
        public EnvironmentLogs GetEnvironmentLogs (string programId, string environmentId, int? days, string xGwImsOrgId, string authorization, string xApiKey, List<string> service, List<string> name)
        {
            
            // verify the required parameter 'programId' is set
            if (programId == null) throw new ApiException(400, "Missing required parameter 'programId' when calling GetEnvironmentLogs");
            
            // verify the required parameter 'environmentId' is set
            if (environmentId == null) throw new ApiException(400, "Missing required parameter 'environmentId' when calling GetEnvironmentLogs");
            
            // verify the required parameter 'days' is set
            if (days == null) throw new ApiException(400, "Missing required parameter 'days' when calling GetEnvironmentLogs");
            
            // verify the required parameter 'xGwImsOrgId' is set
            if (xGwImsOrgId == null) throw new ApiException(400, "Missing required parameter 'xGwImsOrgId' when calling GetEnvironmentLogs");
            
            // verify the required parameter 'authorization' is set
            if (authorization == null) throw new ApiException(400, "Missing required parameter 'authorization' when calling GetEnvironmentLogs");
            
            // verify the required parameter 'xApiKey' is set
            if (xApiKey == null) throw new ApiException(400, "Missing required parameter 'xApiKey' when calling GetEnvironmentLogs");
            
    
            var path = "/api/program/{programId}/environment/{environmentId}/logs";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "programId" + "}", ApiClient.ParameterToString(programId));
path = path.Replace("{" + "environmentId" + "}", ApiClient.ParameterToString(environmentId));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (service != null) queryParams.Add("service", ApiClient.ParameterToString(service)); // query parameter
 if (name != null) queryParams.Add("name", ApiClient.ParameterToString(name)); // query parameter
 if (days != null) queryParams.Add("days", ApiClient.ParameterToString(days)); // query parameter
             if (xGwImsOrgId != null) headerParams.Add("x-gw-ims-org-id", ApiClient.ParameterToString(xGwImsOrgId)); // header parameter
 if (authorization != null) headerParams.Add("Authorization", ApiClient.ParameterToString(authorization)); // header parameter
 if (xApiKey != null) headerParams.Add("x-api-key", ApiClient.ParameterToString(xApiKey)); // header parameter
                            
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetEnvironmentLogs: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetEnvironmentLogs: " + response.ErrorMessage, response.ErrorMessage);
    
            return (EnvironmentLogs) ApiClient.Deserialize(response.Content, typeof(EnvironmentLogs), response.Headers);
        }
    
        /// <summary>
        /// List Environments Lists all environments in an program
        /// </summary>
        /// <param name="programId">Identifier of the program</param> 
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param> 
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param> 
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param> 
        /// <param name="type">Type of the environment</param> 
        /// <returns>EnvironmentList</returns>            
        public EnvironmentList GetEnvironments (string programId, string xGwImsOrgId, string authorization, string xApiKey, string type)
        {
            
            // verify the required parameter 'programId' is set
            if (programId == null) throw new ApiException(400, "Missing required parameter 'programId' when calling GetEnvironments");
            
            // verify the required parameter 'xGwImsOrgId' is set
            if (xGwImsOrgId == null) throw new ApiException(400, "Missing required parameter 'xGwImsOrgId' when calling GetEnvironments");
            
            // verify the required parameter 'authorization' is set
            if (authorization == null) throw new ApiException(400, "Missing required parameter 'authorization' when calling GetEnvironments");
            
            // verify the required parameter 'xApiKey' is set
            if (xApiKey == null) throw new ApiException(400, "Missing required parameter 'xApiKey' when calling GetEnvironments");
            
    
            var path = "/api/program/{programId}/environments";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "programId" + "}", ApiClient.ParameterToString(programId));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
             if (type != null) queryParams.Add("type", ApiClient.ParameterToString(type)); // query parameter
             if (xGwImsOrgId != null) headerParams.Add("x-gw-ims-org-id", ApiClient.ParameterToString(xGwImsOrgId)); // header parameter
 if (authorization != null) headerParams.Add("Authorization", ApiClient.ParameterToString(authorization)); // header parameter
 if (xApiKey != null) headerParams.Add("x-api-key", ApiClient.ParameterToString(xApiKey)); // header parameter
                            
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling GetEnvironments: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetEnvironments: " + response.ErrorMessage, response.ErrorMessage);
    
            return (EnvironmentList) ApiClient.Deserialize(response.Content, typeof(EnvironmentList), response.Headers);
        }
    
    }
}
