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
    /// Module processing requests of Pipelines domain.
    /// </summary>
    public sealed class PipelinesModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public PipelinesModule(PipelinesService service) : base("/")
        { 
            Delete["/api/program/{programId}/pipeline/{pipelineId}"] = parameters =>
            {
                var programId = Parameters.ValueOf<string>(parameters, Context.Request, "programId", ParameterType.Path);
                var pipelineId = Parameters.ValueOf<string>(parameters, Context.Request, "pipelineId", ParameterType.Path);
                var xGwImsOrgId = Parameters.ValueOf<string>(parameters, Context.Request, "xGwImsOrgId", ParameterType.Header);
                var authorization = Parameters.ValueOf<string>(parameters, Context.Request, "authorization", ParameterType.Header);
                var xApiKey = Parameters.ValueOf<string>(parameters, Context.Request, "xApiKey", ParameterType.Header);
                Preconditions.IsNotNull(programId, "Required parameter: 'programId' is missing at 'DeletePipeline'");
                
                Preconditions.IsNotNull(pipelineId, "Required parameter: 'pipelineId' is missing at 'DeletePipeline'");
                
                Preconditions.IsNotNull(xGwImsOrgId, "Required parameter: 'xGwImsOrgId' is missing at 'DeletePipeline'");
                
                Preconditions.IsNotNull(authorization, "Required parameter: 'authorization' is missing at 'DeletePipeline'");
                
                Preconditions.IsNotNull(xApiKey, "Required parameter: 'xApiKey' is missing at 'DeletePipeline'");
                
                service.DeletePipeline(Context, programId, pipelineId, xGwImsOrgId, authorization, xApiKey);
                return new Response { ContentType = ""};
            };

            Get["/api/program/{programId}/pipeline/{pipelineId}"] = parameters =>
            {
                var programId = Parameters.ValueOf<string>(parameters, Context.Request, "programId", ParameterType.Path);
                var pipelineId = Parameters.ValueOf<string>(parameters, Context.Request, "pipelineId", ParameterType.Path);
                var xGwImsOrgId = Parameters.ValueOf<string>(parameters, Context.Request, "xGwImsOrgId", ParameterType.Header);
                var authorization = Parameters.ValueOf<string>(parameters, Context.Request, "authorization", ParameterType.Header);
                var xApiKey = Parameters.ValueOf<string>(parameters, Context.Request, "xApiKey", ParameterType.Header);
                Preconditions.IsNotNull(programId, "Required parameter: 'programId' is missing at 'GetPipeline'");
                
                Preconditions.IsNotNull(pipelineId, "Required parameter: 'pipelineId' is missing at 'GetPipeline'");
                
                Preconditions.IsNotNull(xGwImsOrgId, "Required parameter: 'xGwImsOrgId' is missing at 'GetPipeline'");
                
                Preconditions.IsNotNull(authorization, "Required parameter: 'authorization' is missing at 'GetPipeline'");
                
                Preconditions.IsNotNull(xApiKey, "Required parameter: 'xApiKey' is missing at 'GetPipeline'");
                
                return service.GetPipeline(Context, programId, pipelineId, xGwImsOrgId, authorization, xApiKey);
            };

            Get["/api/program/{programId}/pipelines"] = parameters =>
            {
                var programId = Parameters.ValueOf<string>(parameters, Context.Request, "programId", ParameterType.Path);
                var xGwImsOrgId = Parameters.ValueOf<string>(parameters, Context.Request, "xGwImsOrgId", ParameterType.Header);
                var authorization = Parameters.ValueOf<string>(parameters, Context.Request, "authorization", ParameterType.Header);
                var xApiKey = Parameters.ValueOf<string>(parameters, Context.Request, "xApiKey", ParameterType.Header);
                Preconditions.IsNotNull(programId, "Required parameter: 'programId' is missing at 'GetPipelines'");
                
                Preconditions.IsNotNull(xGwImsOrgId, "Required parameter: 'xGwImsOrgId' is missing at 'GetPipelines'");
                
                Preconditions.IsNotNull(authorization, "Required parameter: 'authorization' is missing at 'GetPipelines'");
                
                Preconditions.IsNotNull(xApiKey, "Required parameter: 'xApiKey' is missing at 'GetPipelines'");
                
                return service.GetPipelines(Context, programId, xGwImsOrgId, authorization, xApiKey);
            };

            Patch["/api/program/{programId}/pipeline/{pipelineId}"] = parameters =>
            {
                var programId = Parameters.ValueOf<string>(parameters, Context.Request, "programId", ParameterType.Path);
                var pipelineId = Parameters.ValueOf<string>(parameters, Context.Request, "pipelineId", ParameterType.Path);
                var xGwImsOrgId = Parameters.ValueOf<string>(parameters, Context.Request, "xGwImsOrgId", ParameterType.Header);
                var authorization = Parameters.ValueOf<string>(parameters, Context.Request, "authorization", ParameterType.Header);
                var xApiKey = Parameters.ValueOf<string>(parameters, Context.Request, "xApiKey", ParameterType.Header);
                var contentType = Parameters.ValueOf<string>(parameters, Context.Request, "contentType", ParameterType.Header);
                var body = this.Bind<Pipeline>();
                Preconditions.IsNotNull(programId, "Required parameter: 'programId' is missing at 'PatchPipeline'");
                
                Preconditions.IsNotNull(pipelineId, "Required parameter: 'pipelineId' is missing at 'PatchPipeline'");
                
                Preconditions.IsNotNull(xGwImsOrgId, "Required parameter: 'xGwImsOrgId' is missing at 'PatchPipeline'");
                
                Preconditions.IsNotNull(authorization, "Required parameter: 'authorization' is missing at 'PatchPipeline'");
                
                Preconditions.IsNotNull(xApiKey, "Required parameter: 'xApiKey' is missing at 'PatchPipeline'");
                
                Preconditions.IsNotNull(contentType, "Required parameter: 'contentType' is missing at 'PatchPipeline'");
                
                Preconditions.IsNotNull(body, "Required parameter: 'body' is missing at 'PatchPipeline'");
                
                return service.PatchPipeline(Context, programId, pipelineId, xGwImsOrgId, authorization, xApiKey, contentType, body);
            };
        }
    }

    /// <summary>
    /// Service handling Pipelines requests.
    /// </summary>
    public interface PipelinesService
    {
        /// <summary>
        /// Delete a pipeline. All the data is wiped.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="programId">Identifier of the program</param>
        /// <param name="pipelineId">Identifier of the pipeline</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <returns></returns>
        void DeletePipeline(NancyContext context, string programId, string pipelineId, string xGwImsOrgId, string authorization, string xApiKey);

        /// <summary>
        /// Returns a pipeline by its id
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="programId">Identifier of the program</param>
        /// <param name="pipelineId">Identifier of the pipeline</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <returns>Pipeline</returns>
        Pipeline GetPipeline(NancyContext context, string programId, string pipelineId, string xGwImsOrgId, string authorization, string xApiKey);

        /// <summary>
        /// Returns all the pipelines that the requesting user has access to in an program
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="programId">Identifier of the program</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <returns>PipelineList</returns>
        PipelineList GetPipelines(NancyContext context, string programId, string xGwImsOrgId, string authorization, string xApiKey);

        /// <summary>
        /// Patches a pipeline within an program.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="programId">Identifier of the program</param>
        /// <param name="pipelineId">Identifier of the pipeline</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <param name="contentType">Must always be application/json</param>
        /// <param name="body">The updated Pipeline</param>
        /// <returns>Pipeline</returns>
        Pipeline PatchPipeline(NancyContext context, string programId, string pipelineId, string xGwImsOrgId, string authorization, string xApiKey, string contentType, Pipeline body);
    }

    /// <summary>
    /// Abstraction of PipelinesService.
    /// </summary>
    public abstract class AbstractPipelinesService: PipelinesService
    {
        public virtual void DeletePipeline(NancyContext context, string programId, string pipelineId, string xGwImsOrgId, string authorization, string xApiKey)
        {
            DeletePipeline(programId, pipelineId, xGwImsOrgId, authorization, xApiKey);
        }

        public virtual Pipeline GetPipeline(NancyContext context, string programId, string pipelineId, string xGwImsOrgId, string authorization, string xApiKey)
        {
            return GetPipeline(programId, pipelineId, xGwImsOrgId, authorization, xApiKey);
        }

        public virtual PipelineList GetPipelines(NancyContext context, string programId, string xGwImsOrgId, string authorization, string xApiKey)
        {
            return GetPipelines(programId, xGwImsOrgId, authorization, xApiKey);
        }

        public virtual Pipeline PatchPipeline(NancyContext context, string programId, string pipelineId, string xGwImsOrgId, string authorization, string xApiKey, string contentType, Pipeline body)
        {
            return PatchPipeline(programId, pipelineId, xGwImsOrgId, authorization, xApiKey, contentType, body);
        }

        protected abstract void DeletePipeline(string programId, string pipelineId, string xGwImsOrgId, string authorization, string xApiKey);

        protected abstract Pipeline GetPipeline(string programId, string pipelineId, string xGwImsOrgId, string authorization, string xApiKey);

        protected abstract PipelineList GetPipelines(string programId, string xGwImsOrgId, string authorization, string xApiKey);

        protected abstract Pipeline PatchPipeline(string programId, string pipelineId, string xGwImsOrgId, string authorization, string xApiKey, string contentType, Pipeline body);
    }

}
