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
    /// Module processing requests of Branches domain.
    /// </summary>
    public sealed class BranchesModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public BranchesModule(BranchesService service) : base("/")
        { 
            Get["/api/program/{programId}/repository/{repositoryId}/branches"] = parameters =>
            {
                var programId = Parameters.ValueOf<string>(parameters, Context.Request, "programId", ParameterType.Path);
                var repositoryId = Parameters.ValueOf<string>(parameters, Context.Request, "repositoryId", ParameterType.Path);
                var xGwImsOrgId = Parameters.ValueOf<string>(parameters, Context.Request, "xGwImsOrgId", ParameterType.Header);
                var authorization = Parameters.ValueOf<string>(parameters, Context.Request, "authorization", ParameterType.Header);
                var xApiKey = Parameters.ValueOf<string>(parameters, Context.Request, "xApiKey", ParameterType.Header);
                Preconditions.IsNotNull(programId, "Required parameter: 'programId' is missing at 'GetBranches'");
                
                Preconditions.IsNotNull(repositoryId, "Required parameter: 'repositoryId' is missing at 'GetBranches'");
                
                Preconditions.IsNotNull(xGwImsOrgId, "Required parameter: 'xGwImsOrgId' is missing at 'GetBranches'");
                
                Preconditions.IsNotNull(authorization, "Required parameter: 'authorization' is missing at 'GetBranches'");
                
                Preconditions.IsNotNull(xApiKey, "Required parameter: 'xApiKey' is missing at 'GetBranches'");
                
                return service.GetBranches(Context, programId, repositoryId, xGwImsOrgId, authorization, xApiKey);
            };
        }
    }

    /// <summary>
    /// Service handling Branches requests.
    /// </summary>
    public interface BranchesService
    {
        /// <summary>
        /// Returns the list of branches from a repository
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="programId">Identifier of the program.</param>
        /// <param name="repositoryId">Identifier of the repository</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <returns>BranchList</returns>
        BranchList GetBranches(NancyContext context, string programId, string repositoryId, string xGwImsOrgId, string authorization, string xApiKey);
    }

    /// <summary>
    /// Abstraction of BranchesService.
    /// </summary>
    public abstract class AbstractBranchesService: BranchesService
    {
        public virtual BranchList GetBranches(NancyContext context, string programId, string repositoryId, string xGwImsOrgId, string authorization, string xApiKey)
        {
            return GetBranches(programId, repositoryId, xGwImsOrgId, authorization, xApiKey);
        }

        protected abstract BranchList GetBranches(string programId, string repositoryId, string xGwImsOrgId, string authorization, string xApiKey);
    }

}
