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
    /// Type of the environment
    /// </summary>
    public enum GetEnvironmentsTypeEnum
    {
        dev = 1, 
        stage = 2, 
        prod = 3
    };


    /// <summary>
    /// Module processing requests of Environments domain.
    /// </summary>
    public sealed class EnvironmentsModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public EnvironmentsModule(EnvironmentsService service) : base("/")
        { 
            Delete["/api/program/{programId}/environment/{environmentId}"] = parameters =>
            {
                var programId = Parameters.ValueOf<string>(parameters, Context.Request, "programId", ParameterType.Path);
                var environmentId = Parameters.ValueOf<string>(parameters, Context.Request, "environmentId", ParameterType.Path);
                var xGwImsOrgId = Parameters.ValueOf<string>(parameters, Context.Request, "xGwImsOrgId", ParameterType.Header);
                var authorization = Parameters.ValueOf<string>(parameters, Context.Request, "authorization", ParameterType.Header);
                var xApiKey = Parameters.ValueOf<string>(parameters, Context.Request, "xApiKey", ParameterType.Header);
                Preconditions.IsNotNull(programId, "Required parameter: 'programId' is missing at 'DeleteEnvironment'");
                
                Preconditions.IsNotNull(environmentId, "Required parameter: 'environmentId' is missing at 'DeleteEnvironment'");
                
                Preconditions.IsNotNull(xGwImsOrgId, "Required parameter: 'xGwImsOrgId' is missing at 'DeleteEnvironment'");
                
                Preconditions.IsNotNull(authorization, "Required parameter: 'authorization' is missing at 'DeleteEnvironment'");
                
                Preconditions.IsNotNull(xApiKey, "Required parameter: 'xApiKey' is missing at 'DeleteEnvironment'");
                
                return service.DeleteEnvironment(Context, programId, environmentId, xGwImsOrgId, authorization, xApiKey);
            };

            Get["/api/program/{programId}/environment/{environmentId}/logs/download"] = parameters =>
            {
                var programId = Parameters.ValueOf<string>(parameters, Context.Request, "programId", ParameterType.Path);
                var environmentId = Parameters.ValueOf<string>(parameters, Context.Request, "environmentId", ParameterType.Path);
                var service = Parameters.ValueOf<string>(parameters, Context.Request, "service", ParameterType.Query);
                var name = Parameters.ValueOf<string>(parameters, Context.Request, "name", ParameterType.Query);
                var date = Parameters.ValueOf<string>(parameters, Context.Request, "date", ParameterType.Query);
                var xGwImsOrgId = Parameters.ValueOf<string>(parameters, Context.Request, "xGwImsOrgId", ParameterType.Header);
                var authorization = Parameters.ValueOf<string>(parameters, Context.Request, "authorization", ParameterType.Header);
                var xApiKey = Parameters.ValueOf<string>(parameters, Context.Request, "xApiKey", ParameterType.Header);
                var accept = Parameters.ValueOf<string>(parameters, Context.Request, "accept", ParameterType.Header);
                Preconditions.IsNotNull(programId, "Required parameter: 'programId' is missing at 'DownloadLogs'");
                
                Preconditions.IsNotNull(environmentId, "Required parameter: 'environmentId' is missing at 'DownloadLogs'");
                
                Preconditions.IsNotNull(service, "Required parameter: 'service' is missing at 'DownloadLogs'");
                
                Preconditions.IsNotNull(name, "Required parameter: 'name' is missing at 'DownloadLogs'");
                
                Preconditions.IsNotNull(date, "Required parameter: 'date' is missing at 'DownloadLogs'");
                
                Preconditions.IsNotNull(xGwImsOrgId, "Required parameter: 'xGwImsOrgId' is missing at 'DownloadLogs'");
                
                Preconditions.IsNotNull(authorization, "Required parameter: 'authorization' is missing at 'DownloadLogs'");
                
                Preconditions.IsNotNull(xApiKey, "Required parameter: 'xApiKey' is missing at 'DownloadLogs'");
                
                service.DownloadLogs(Context, programId, environmentId, service, name, date, xGwImsOrgId, authorization, xApiKey, accept);
                return new Response { ContentType = "application/json"};
            };

            Get["/api/program/{programId}/environment/{environmentId}"] = parameters =>
            {
                var programId = Parameters.ValueOf<string>(parameters, Context.Request, "programId", ParameterType.Path);
                var environmentId = Parameters.ValueOf<string>(parameters, Context.Request, "environmentId", ParameterType.Path);
                var xGwImsOrgId = Parameters.ValueOf<string>(parameters, Context.Request, "xGwImsOrgId", ParameterType.Header);
                var authorization = Parameters.ValueOf<string>(parameters, Context.Request, "authorization", ParameterType.Header);
                var xApiKey = Parameters.ValueOf<string>(parameters, Context.Request, "xApiKey", ParameterType.Header);
                Preconditions.IsNotNull(programId, "Required parameter: 'programId' is missing at 'GetEnvironment'");
                
                Preconditions.IsNotNull(environmentId, "Required parameter: 'environmentId' is missing at 'GetEnvironment'");
                
                Preconditions.IsNotNull(xGwImsOrgId, "Required parameter: 'xGwImsOrgId' is missing at 'GetEnvironment'");
                
                Preconditions.IsNotNull(authorization, "Required parameter: 'authorization' is missing at 'GetEnvironment'");
                
                Preconditions.IsNotNull(xApiKey, "Required parameter: 'xApiKey' is missing at 'GetEnvironment'");
                
                return service.GetEnvironment(Context, programId, environmentId, xGwImsOrgId, authorization, xApiKey);
            };

            Get["/api/program/{programId}/environment/{environmentId}/logs"] = parameters =>
            {
                var programId = Parameters.ValueOf<string>(parameters, Context.Request, "programId", ParameterType.Path);
                var environmentId = Parameters.ValueOf<string>(parameters, Context.Request, "environmentId", ParameterType.Path);
                var days = Parameters.ValueOf<int?>(parameters, Context.Request, "days", ParameterType.Query);
                var xGwImsOrgId = Parameters.ValueOf<string>(parameters, Context.Request, "xGwImsOrgId", ParameterType.Header);
                var authorization = Parameters.ValueOf<string>(parameters, Context.Request, "authorization", ParameterType.Header);
                var xApiKey = Parameters.ValueOf<string>(parameters, Context.Request, "xApiKey", ParameterType.Header);
                var service = Parameters.ValueOf<List<string>>(parameters, Context.Request, "service", ParameterType.Query);
                var name = Parameters.ValueOf<List<string>>(parameters, Context.Request, "name", ParameterType.Query);
                Preconditions.IsNotNull(programId, "Required parameter: 'programId' is missing at 'GetEnvironmentLogs'");
                
                Preconditions.IsNotNull(environmentId, "Required parameter: 'environmentId' is missing at 'GetEnvironmentLogs'");
                
                Preconditions.IsNotNull(days, "Required parameter: 'days' is missing at 'GetEnvironmentLogs'");
                
                Preconditions.IsNotNull(xGwImsOrgId, "Required parameter: 'xGwImsOrgId' is missing at 'GetEnvironmentLogs'");
                
                Preconditions.IsNotNull(authorization, "Required parameter: 'authorization' is missing at 'GetEnvironmentLogs'");
                
                Preconditions.IsNotNull(xApiKey, "Required parameter: 'xApiKey' is missing at 'GetEnvironmentLogs'");
                
                return service.GetEnvironmentLogs(Context, programId, environmentId, days, xGwImsOrgId, authorization, xApiKey, service, name);
            };

            Get["/api/program/{programId}/environments"] = parameters =>
            {
                var programId = Parameters.ValueOf<string>(parameters, Context.Request, "programId", ParameterType.Path);
                var xGwImsOrgId = Parameters.ValueOf<string>(parameters, Context.Request, "xGwImsOrgId", ParameterType.Header);
                var authorization = Parameters.ValueOf<string>(parameters, Context.Request, "authorization", ParameterType.Header);
                var xApiKey = Parameters.ValueOf<string>(parameters, Context.Request, "xApiKey", ParameterType.Header);
                var type = Parameters.ValueOf<GetEnvironmentsTypeEnum?>(parameters, Context.Request, "type", ParameterType.Query);
                Preconditions.IsNotNull(programId, "Required parameter: 'programId' is missing at 'GetEnvironments'");
                
                Preconditions.IsNotNull(xGwImsOrgId, "Required parameter: 'xGwImsOrgId' is missing at 'GetEnvironments'");
                
                Preconditions.IsNotNull(authorization, "Required parameter: 'authorization' is missing at 'GetEnvironments'");
                
                Preconditions.IsNotNull(xApiKey, "Required parameter: 'xApiKey' is missing at 'GetEnvironments'");
                
                return service.GetEnvironments(Context, programId, xGwImsOrgId, authorization, xApiKey, type);
            };
        }
    }

    /// <summary>
    /// Service handling Environments requests.
    /// </summary>
    public interface EnvironmentsService
    {
        /// <summary>
        /// Delete environment
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="programId">Identifier of the application</param>
        /// <param name="environmentId">Identifier of the environment</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <returns>Environment</returns>
        Environment DeleteEnvironment(NancyContext context, string programId, string environmentId, string xGwImsOrgId, string authorization, string xApiKey);

        /// <summary>
        /// Download environment logs
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="programId">Identifier of the program</param>
        /// <param name="environmentId">Identifier of the environment</param>
        /// <param name="service">Name of service</param>
        /// <param name="name">Name of log</param>
        /// <param name="date">date for which log is required</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <param name="accept">Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. (optional)</param>
        /// <returns></returns>
        void DownloadLogs(NancyContext context, string programId, string environmentId, string service, string name, string date, string xGwImsOrgId, string authorization, string xApiKey, string accept);

        /// <summary>
        /// Returns an environment by its id
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="programId">Identifier of the program</param>
        /// <param name="environmentId">Identifier of the environment</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <returns>Environment</returns>
        Environment GetEnvironment(NancyContext context, string programId, string environmentId, string xGwImsOrgId, string authorization, string xApiKey);

        /// <summary>
        /// List all logs available in environment
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="programId">Identifier of the program</param>
        /// <param name="environmentId">Identifier of the environment</param>
        /// <param name="days">number of days for which logs are required</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <param name="service">Names of services (optional)</param>
        /// <param name="name">Names of log (optional)</param>
        /// <returns>EnvironmentLogs</returns>
        EnvironmentLogs GetEnvironmentLogs(NancyContext context, string programId, string environmentId, int? days, string xGwImsOrgId, string authorization, string xApiKey, List<string> service, List<string> name);

        /// <summary>
        /// Lists all environments in an program
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="programId">Identifier of the program</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <param name="type">Type of the environment (optional)</param>
        /// <returns>EnvironmentList</returns>
        EnvironmentList GetEnvironments(NancyContext context, string programId, string xGwImsOrgId, string authorization, string xApiKey, GetEnvironmentsTypeEnum? type);
    }

    /// <summary>
    /// Abstraction of EnvironmentsService.
    /// </summary>
    public abstract class AbstractEnvironmentsService: EnvironmentsService
    {
        public virtual Environment DeleteEnvironment(NancyContext context, string programId, string environmentId, string xGwImsOrgId, string authorization, string xApiKey)
        {
            return DeleteEnvironment(programId, environmentId, xGwImsOrgId, authorization, xApiKey);
        }

        public virtual void DownloadLogs(NancyContext context, string programId, string environmentId, string service, string name, string date, string xGwImsOrgId, string authorization, string xApiKey, string accept)
        {
            DownloadLogs(programId, environmentId, service, name, date, xGwImsOrgId, authorization, xApiKey, accept);
        }

        public virtual Environment GetEnvironment(NancyContext context, string programId, string environmentId, string xGwImsOrgId, string authorization, string xApiKey)
        {
            return GetEnvironment(programId, environmentId, xGwImsOrgId, authorization, xApiKey);
        }

        public virtual EnvironmentLogs GetEnvironmentLogs(NancyContext context, string programId, string environmentId, int? days, string xGwImsOrgId, string authorization, string xApiKey, List<string> service, List<string> name)
        {
            return GetEnvironmentLogs(programId, environmentId, days, xGwImsOrgId, authorization, xApiKey, service, name);
        }

        public virtual EnvironmentList GetEnvironments(NancyContext context, string programId, string xGwImsOrgId, string authorization, string xApiKey, GetEnvironmentsTypeEnum? type)
        {
            return GetEnvironments(programId, xGwImsOrgId, authorization, xApiKey, type);
        }

        protected abstract Environment DeleteEnvironment(string programId, string environmentId, string xGwImsOrgId, string authorization, string xApiKey);

        protected abstract void DownloadLogs(string programId, string environmentId, string service, string name, string date, string xGwImsOrgId, string authorization, string xApiKey, string accept);

        protected abstract Environment GetEnvironment(string programId, string environmentId, string xGwImsOrgId, string authorization, string xApiKey);

        protected abstract EnvironmentLogs GetEnvironmentLogs(string programId, string environmentId, int? days, string xGwImsOrgId, string authorization, string xApiKey, List<string> service, List<string> name);

        protected abstract EnvironmentList GetEnvironments(string programId, string xGwImsOrgId, string authorization, string xApiKey, GetEnvironmentsTypeEnum? type);
    }

}
