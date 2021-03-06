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
    public interface IRepositoriesApi
    {
        /// <summary>
        /// Lists Repositories Lists all Repositories in an program
        /// </summary>
        /// <param name="programId">Identifier of the program</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <returns>RepositoryList</returns>
        RepositoryList GetRepositories (string programId, string xGwImsOrgId, string authorization, string xApiKey);
        /// <summary>
        /// Get Repository Returns an repository by its id
        /// </summary>
        /// <param name="programId">Identifier of the program</param>
        /// <param name="repositoryId">Identifier of the repository</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <returns>Repository</returns>
        Repository GetRepository (string programId, string repositoryId, string xGwImsOrgId, string authorization, string xApiKey);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class RepositoriesApi : IRepositoriesApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RepositoriesApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public RepositoriesApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="RepositoriesApi"/> class.
        /// </summary>
        /// <returns></returns>
        public RepositoriesApi(String basePath)
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
        /// Lists Repositories Lists all Repositories in an program
        /// </summary>
        /// <param name="programId">Identifier of the program</param> 
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param> 
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param> 
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param> 
        /// <returns>RepositoryList</returns>            
        public RepositoryList GetRepositories (string programId, string xGwImsOrgId, string authorization, string xApiKey)
        {
            
            // verify the required parameter 'programId' is set
            if (programId == null) throw new ApiException(400, "Missing required parameter 'programId' when calling GetRepositories");
            
            // verify the required parameter 'xGwImsOrgId' is set
            if (xGwImsOrgId == null) throw new ApiException(400, "Missing required parameter 'xGwImsOrgId' when calling GetRepositories");
            
            // verify the required parameter 'authorization' is set
            if (authorization == null) throw new ApiException(400, "Missing required parameter 'authorization' when calling GetRepositories");
            
            // verify the required parameter 'xApiKey' is set
            if (xApiKey == null) throw new ApiException(400, "Missing required parameter 'xApiKey' when calling GetRepositories");
            
    
            var path = "/api/program/{programId}/repositories";
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
                throw new ApiException ((int)response.StatusCode, "Error calling GetRepositories: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetRepositories: " + response.ErrorMessage, response.ErrorMessage);
    
            return (RepositoryList) ApiClient.Deserialize(response.Content, typeof(RepositoryList), response.Headers);
        }
    
        /// <summary>
        /// Get Repository Returns an repository by its id
        /// </summary>
        /// <param name="programId">Identifier of the program</param> 
        /// <param name="repositoryId">Identifier of the repository</param> 
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param> 
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param> 
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param> 
        /// <returns>Repository</returns>            
        public Repository GetRepository (string programId, string repositoryId, string xGwImsOrgId, string authorization, string xApiKey)
        {
            
            // verify the required parameter 'programId' is set
            if (programId == null) throw new ApiException(400, "Missing required parameter 'programId' when calling GetRepository");
            
            // verify the required parameter 'repositoryId' is set
            if (repositoryId == null) throw new ApiException(400, "Missing required parameter 'repositoryId' when calling GetRepository");
            
            // verify the required parameter 'xGwImsOrgId' is set
            if (xGwImsOrgId == null) throw new ApiException(400, "Missing required parameter 'xGwImsOrgId' when calling GetRepository");
            
            // verify the required parameter 'authorization' is set
            if (authorization == null) throw new ApiException(400, "Missing required parameter 'authorization' when calling GetRepository");
            
            // verify the required parameter 'xApiKey' is set
            if (xApiKey == null) throw new ApiException(400, "Missing required parameter 'xApiKey' when calling GetRepository");
            
    
            var path = "/api/program/{programId}/repository/{repositoryId}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "programId" + "}", ApiClient.ParameterToString(programId));
path = path.Replace("{" + "repositoryId" + "}", ApiClient.ParameterToString(repositoryId));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling GetRepository: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetRepository: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Repository) ApiClient.Deserialize(response.Content, typeof(Repository), response.Headers);
        }
    
    }
}
