using System;
using Nancy;
using Nancy.ModelBinding;
using System.Collections.Generic;
using Sharpility.Base;
using Org.OpenAPITools._.Models;
using Org.OpenAPITools._.Utils;
using NodaTime;

namespace Org.OpenAPITools._.Modules
{ 

    /// <summary>
    /// Module processing requests of Repositories domain.
    /// </summary>
    public sealed class RepositoriesModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public RepositoriesModule(RepositoriesService service) : base("/")
        { 
            Get["/api/program/{programId}/repositories"] = parameters =>
            {
                var programId = Parameters.ValueOf<string>(parameters, Context.Request, "programId", ParameterType.Path);
                var xGwImsOrgId = Parameters.ValueOf<string>(parameters, Context.Request, "xGwImsOrgId", ParameterType.Header);
                var authorization = Parameters.ValueOf<string>(parameters, Context.Request, "authorization", ParameterType.Header);
                var xApiKey = Parameters.ValueOf<string>(parameters, Context.Request, "xApiKey", ParameterType.Header);
                Preconditions.IsNotNull(programId, "Required parameter: 'programId' is missing at 'GetRepositories'");
                
                Preconditions.IsNotNull(xGwImsOrgId, "Required parameter: 'xGwImsOrgId' is missing at 'GetRepositories'");
                
                Preconditions.IsNotNull(authorization, "Required parameter: 'authorization' is missing at 'GetRepositories'");
                
                Preconditions.IsNotNull(xApiKey, "Required parameter: 'xApiKey' is missing at 'GetRepositories'");
                
                return service.GetRepositories(Context, programId, xGwImsOrgId, authorization, xApiKey);
            };

            Get["/api/program/{programId}/repository/{repositoryId}"] = parameters =>
            {
                var programId = Parameters.ValueOf<string>(parameters, Context.Request, "programId", ParameterType.Path);
                var repositoryId = Parameters.ValueOf<string>(parameters, Context.Request, "repositoryId", ParameterType.Path);
                var xGwImsOrgId = Parameters.ValueOf<string>(parameters, Context.Request, "xGwImsOrgId", ParameterType.Header);
                var authorization = Parameters.ValueOf<string>(parameters, Context.Request, "authorization", ParameterType.Header);
                var xApiKey = Parameters.ValueOf<string>(parameters, Context.Request, "xApiKey", ParameterType.Header);
                Preconditions.IsNotNull(programId, "Required parameter: 'programId' is missing at 'GetRepository'");
                
                Preconditions.IsNotNull(repositoryId, "Required parameter: 'repositoryId' is missing at 'GetRepository'");
                
                Preconditions.IsNotNull(xGwImsOrgId, "Required parameter: 'xGwImsOrgId' is missing at 'GetRepository'");
                
                Preconditions.IsNotNull(authorization, "Required parameter: 'authorization' is missing at 'GetRepository'");
                
                Preconditions.IsNotNull(xApiKey, "Required parameter: 'xApiKey' is missing at 'GetRepository'");
                
                return service.GetRepository(Context, programId, repositoryId, xGwImsOrgId, authorization, xApiKey);
            };
        }
    }

    /// <summary>
    /// Service handling Repositories requests.
    /// </summary>
    public interface RepositoriesService
    {
        /// <summary>
        /// Lists all Repositories in an program
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="programId">Identifier of the program</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <returns>RepositoryList</returns>
        RepositoryList GetRepositories(NancyContext context, string programId, string xGwImsOrgId, string authorization, string xApiKey);

        /// <summary>
        /// Returns an repository by its id
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="programId">Identifier of the program</param>
        /// <param name="repositoryId">Identifier of the repository</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <returns>Repository</returns>
        Repository GetRepository(NancyContext context, string programId, string repositoryId, string xGwImsOrgId, string authorization, string xApiKey);
    }

    /// <summary>
    /// Abstraction of RepositoriesService.
    /// </summary>
    public abstract class AbstractRepositoriesService: RepositoriesService
    {
        public virtual RepositoryList GetRepositories(NancyContext context, string programId, string xGwImsOrgId, string authorization, string xApiKey)
        {
            return GetRepositories(programId, xGwImsOrgId, authorization, xApiKey);
        }

        public virtual Repository GetRepository(NancyContext context, string programId, string repositoryId, string xGwImsOrgId, string authorization, string xApiKey)
        {
            return GetRepository(programId, repositoryId, xGwImsOrgId, authorization, xApiKey);
        }

        protected abstract RepositoryList GetRepositories(string programId, string xGwImsOrgId, string authorization, string xApiKey);

        protected abstract Repository GetRepository(string programId, string repositoryId, string xGwImsOrgId, string authorization, string xApiKey);
    }

}
