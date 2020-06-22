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
    /// Module processing requests of Variables domain.
    /// </summary>
    public sealed class VariablesModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public VariablesModule(VariablesService service) : base("/")
        { 
            Get["/api/program/{programId}/environment/{environmentId}/variables"] = parameters =>
            {
                var programId = Parameters.ValueOf<string>(parameters, Context.Request, "programId", ParameterType.Path);
                var environmentId = Parameters.ValueOf<string>(parameters, Context.Request, "environmentId", ParameterType.Path);
                var xGwImsOrgId = Parameters.ValueOf<string>(parameters, Context.Request, "xGwImsOrgId", ParameterType.Header);
                var authorization = Parameters.ValueOf<string>(parameters, Context.Request, "authorization", ParameterType.Header);
                var xApiKey = Parameters.ValueOf<string>(parameters, Context.Request, "xApiKey", ParameterType.Header);
                Preconditions.IsNotNull(programId, "Required parameter: 'programId' is missing at 'GetEnvironmentVariables'");
                
                Preconditions.IsNotNull(environmentId, "Required parameter: 'environmentId' is missing at 'GetEnvironmentVariables'");
                
                Preconditions.IsNotNull(xGwImsOrgId, "Required parameter: 'xGwImsOrgId' is missing at 'GetEnvironmentVariables'");
                
                Preconditions.IsNotNull(authorization, "Required parameter: 'authorization' is missing at 'GetEnvironmentVariables'");
                
                Preconditions.IsNotNull(xApiKey, "Required parameter: 'xApiKey' is missing at 'GetEnvironmentVariables'");
                
                return service.GetEnvironmentVariables(Context, programId, environmentId, xGwImsOrgId, authorization, xApiKey);
            };

            Patch["/api/program/{programId}/environment/{environmentId}/variables"] = parameters =>
            {
                var programId = Parameters.ValueOf<string>(parameters, Context.Request, "programId", ParameterType.Path);
                var environmentId = Parameters.ValueOf<string>(parameters, Context.Request, "environmentId", ParameterType.Path);
                var xGwImsOrgId = Parameters.ValueOf<string>(parameters, Context.Request, "xGwImsOrgId", ParameterType.Header);
                var authorization = Parameters.ValueOf<string>(parameters, Context.Request, "authorization", ParameterType.Header);
                var xApiKey = Parameters.ValueOf<string>(parameters, Context.Request, "xApiKey", ParameterType.Header);
                var contentType = Parameters.ValueOf<string>(parameters, Context.Request, "contentType", ParameterType.Header);
                var body = this.Bind<List<Variable>>();
                Preconditions.IsNotNull(programId, "Required parameter: 'programId' is missing at 'PatchEnvironmentVariables'");
                
                Preconditions.IsNotNull(environmentId, "Required parameter: 'environmentId' is missing at 'PatchEnvironmentVariables'");
                
                Preconditions.IsNotNull(xGwImsOrgId, "Required parameter: 'xGwImsOrgId' is missing at 'PatchEnvironmentVariables'");
                
                Preconditions.IsNotNull(authorization, "Required parameter: 'authorization' is missing at 'PatchEnvironmentVariables'");
                
                Preconditions.IsNotNull(xApiKey, "Required parameter: 'xApiKey' is missing at 'PatchEnvironmentVariables'");
                
                Preconditions.IsNotNull(contentType, "Required parameter: 'contentType' is missing at 'PatchEnvironmentVariables'");
                
                Preconditions.IsNotNull(body, "Required parameter: 'body' is missing at 'PatchEnvironmentVariables'");
                
                return service.PatchEnvironmentVariables(Context, programId, environmentId, xGwImsOrgId, authorization, xApiKey, contentType, body);
            };
        }
    }

    /// <summary>
    /// Service handling Variables requests.
    /// </summary>
    public interface VariablesService
    {
        /// <summary>
        /// List the user defined variables for an environment (Cloud Service only).
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="programId">Identifier of the program</param>
        /// <param name="environmentId">Identifier of the environment</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <returns>VariableList</returns>
        VariableList GetEnvironmentVariables(NancyContext context, string programId, string environmentId, string xGwImsOrgId, string authorization, string xApiKey);

        /// <summary>
        /// Modify multiple environment variables (Cloud Service only). To delete a variable, include it with an empty value.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="programId">Identifier of the program</param>
        /// <param name="environmentId">Identifier of the environment</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <param name="contentType">Must always be application/json</param>
        /// <param name="body">The list of variables to add, modify, or remove. It is not necessary to send variables here which are not changing.</param>
        /// <returns>VariableList</returns>
        VariableList PatchEnvironmentVariables(NancyContext context, string programId, string environmentId, string xGwImsOrgId, string authorization, string xApiKey, string contentType, List<Variable> body);
    }

    /// <summary>
    /// Abstraction of VariablesService.
    /// </summary>
    public abstract class AbstractVariablesService: VariablesService
    {
        public virtual VariableList GetEnvironmentVariables(NancyContext context, string programId, string environmentId, string xGwImsOrgId, string authorization, string xApiKey)
        {
            return GetEnvironmentVariables(programId, environmentId, xGwImsOrgId, authorization, xApiKey);
        }

        public virtual VariableList PatchEnvironmentVariables(NancyContext context, string programId, string environmentId, string xGwImsOrgId, string authorization, string xApiKey, string contentType, List<Variable> body)
        {
            return PatchEnvironmentVariables(programId, environmentId, xGwImsOrgId, authorization, xApiKey, contentType, body);
        }

        protected abstract VariableList GetEnvironmentVariables(string programId, string environmentId, string xGwImsOrgId, string authorization, string xApiKey);

        protected abstract VariableList PatchEnvironmentVariables(string programId, string environmentId, string xGwImsOrgId, string authorization, string xApiKey, string contentType, List<Variable> body);
    }

}
