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
    /// Module processing requests of PipelineExecution domain.
    /// </summary>
    public sealed class PipelineExecutionModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public PipelineExecutionModule(PipelineExecutionService service) : base("/")
        { 
            Put["/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/advance"] = parameters =>
            {
                var programId = Parameters.ValueOf<string>(parameters, Context.Request, "programId", ParameterType.Path);
                var pipelineId = Parameters.ValueOf<string>(parameters, Context.Request, "pipelineId", ParameterType.Path);
                var executionId = Parameters.ValueOf<string>(parameters, Context.Request, "executionId", ParameterType.Path);
                var phaseId = Parameters.ValueOf<string>(parameters, Context.Request, "phaseId", ParameterType.Path);
                var stepId = Parameters.ValueOf<string>(parameters, Context.Request, "stepId", ParameterType.Path);
                var xGwImsOrgId = Parameters.ValueOf<string>(parameters, Context.Request, "xGwImsOrgId", ParameterType.Header);
                var authorization = Parameters.ValueOf<string>(parameters, Context.Request, "authorization", ParameterType.Header);
                var xApiKey = Parameters.ValueOf<string>(parameters, Context.Request, "xApiKey", ParameterType.Header);
                var contentType = Parameters.ValueOf<string>(parameters, Context.Request, "contentType", ParameterType.Header);
                var body = this.Bind<Object>();
                Preconditions.IsNotNull(programId, "Required parameter: 'programId' is missing at 'AdvancePipelineExecution'");
                
                Preconditions.IsNotNull(pipelineId, "Required parameter: 'pipelineId' is missing at 'AdvancePipelineExecution'");
                
                Preconditions.IsNotNull(executionId, "Required parameter: 'executionId' is missing at 'AdvancePipelineExecution'");
                
                Preconditions.IsNotNull(phaseId, "Required parameter: 'phaseId' is missing at 'AdvancePipelineExecution'");
                
                Preconditions.IsNotNull(stepId, "Required parameter: 'stepId' is missing at 'AdvancePipelineExecution'");
                
                Preconditions.IsNotNull(xGwImsOrgId, "Required parameter: 'xGwImsOrgId' is missing at 'AdvancePipelineExecution'");
                
                Preconditions.IsNotNull(authorization, "Required parameter: 'authorization' is missing at 'AdvancePipelineExecution'");
                
                Preconditions.IsNotNull(xApiKey, "Required parameter: 'xApiKey' is missing at 'AdvancePipelineExecution'");
                
                Preconditions.IsNotNull(contentType, "Required parameter: 'contentType' is missing at 'AdvancePipelineExecution'");
                
                Preconditions.IsNotNull(body, "Required parameter: 'body' is missing at 'AdvancePipelineExecution'");
                
                service.AdvancePipelineExecution(Context, programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, contentType, body);
                return new Response { ContentType = ""};
            };

            Put["/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/cancel"] = parameters =>
            {
                var programId = Parameters.ValueOf<string>(parameters, Context.Request, "programId", ParameterType.Path);
                var pipelineId = Parameters.ValueOf<string>(parameters, Context.Request, "pipelineId", ParameterType.Path);
                var executionId = Parameters.ValueOf<string>(parameters, Context.Request, "executionId", ParameterType.Path);
                var phaseId = Parameters.ValueOf<string>(parameters, Context.Request, "phaseId", ParameterType.Path);
                var stepId = Parameters.ValueOf<string>(parameters, Context.Request, "stepId", ParameterType.Path);
                var xGwImsOrgId = Parameters.ValueOf<string>(parameters, Context.Request, "xGwImsOrgId", ParameterType.Header);
                var authorization = Parameters.ValueOf<string>(parameters, Context.Request, "authorization", ParameterType.Header);
                var xApiKey = Parameters.ValueOf<string>(parameters, Context.Request, "xApiKey", ParameterType.Header);
                var contentType = Parameters.ValueOf<string>(parameters, Context.Request, "contentType", ParameterType.Header);
                var body = this.Bind<Object>();
                Preconditions.IsNotNull(programId, "Required parameter: 'programId' is missing at 'CancelPipelineExecutionStep'");
                
                Preconditions.IsNotNull(pipelineId, "Required parameter: 'pipelineId' is missing at 'CancelPipelineExecutionStep'");
                
                Preconditions.IsNotNull(executionId, "Required parameter: 'executionId' is missing at 'CancelPipelineExecutionStep'");
                
                Preconditions.IsNotNull(phaseId, "Required parameter: 'phaseId' is missing at 'CancelPipelineExecutionStep'");
                
                Preconditions.IsNotNull(stepId, "Required parameter: 'stepId' is missing at 'CancelPipelineExecutionStep'");
                
                Preconditions.IsNotNull(xGwImsOrgId, "Required parameter: 'xGwImsOrgId' is missing at 'CancelPipelineExecutionStep'");
                
                Preconditions.IsNotNull(authorization, "Required parameter: 'authorization' is missing at 'CancelPipelineExecutionStep'");
                
                Preconditions.IsNotNull(xApiKey, "Required parameter: 'xApiKey' is missing at 'CancelPipelineExecutionStep'");
                
                Preconditions.IsNotNull(contentType, "Required parameter: 'contentType' is missing at 'CancelPipelineExecutionStep'");
                
                Preconditions.IsNotNull(body, "Required parameter: 'body' is missing at 'CancelPipelineExecutionStep'");
                
                service.CancelPipelineExecutionStep(Context, programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, contentType, body);
                return new Response { ContentType = ""};
            };

            Get["/api/program/{programId}/pipeline/{pipelineId}/execution"] = parameters =>
            {
                var programId = Parameters.ValueOf<string>(parameters, Context.Request, "programId", ParameterType.Path);
                var pipelineId = Parameters.ValueOf<string>(parameters, Context.Request, "pipelineId", ParameterType.Path);
                var xGwImsOrgId = Parameters.ValueOf<string>(parameters, Context.Request, "xGwImsOrgId", ParameterType.Header);
                var authorization = Parameters.ValueOf<string>(parameters, Context.Request, "authorization", ParameterType.Header);
                var xApiKey = Parameters.ValueOf<string>(parameters, Context.Request, "xApiKey", ParameterType.Header);
                Preconditions.IsNotNull(programId, "Required parameter: 'programId' is missing at 'GetCurrentExecution'");
                
                Preconditions.IsNotNull(pipelineId, "Required parameter: 'pipelineId' is missing at 'GetCurrentExecution'");
                
                Preconditions.IsNotNull(xGwImsOrgId, "Required parameter: 'xGwImsOrgId' is missing at 'GetCurrentExecution'");
                
                Preconditions.IsNotNull(authorization, "Required parameter: 'authorization' is missing at 'GetCurrentExecution'");
                
                Preconditions.IsNotNull(xApiKey, "Required parameter: 'xApiKey' is missing at 'GetCurrentExecution'");
                
                return service.GetCurrentExecution(Context, programId, pipelineId, xGwImsOrgId, authorization, xApiKey);
            };

            Get["/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}"] = parameters =>
            {
                var programId = Parameters.ValueOf<string>(parameters, Context.Request, "programId", ParameterType.Path);
                var pipelineId = Parameters.ValueOf<string>(parameters, Context.Request, "pipelineId", ParameterType.Path);
                var executionId = Parameters.ValueOf<string>(parameters, Context.Request, "executionId", ParameterType.Path);
                var xGwImsOrgId = Parameters.ValueOf<string>(parameters, Context.Request, "xGwImsOrgId", ParameterType.Header);
                var authorization = Parameters.ValueOf<string>(parameters, Context.Request, "authorization", ParameterType.Header);
                var xApiKey = Parameters.ValueOf<string>(parameters, Context.Request, "xApiKey", ParameterType.Header);
                Preconditions.IsNotNull(programId, "Required parameter: 'programId' is missing at 'GetExecution'");
                
                Preconditions.IsNotNull(pipelineId, "Required parameter: 'pipelineId' is missing at 'GetExecution'");
                
                Preconditions.IsNotNull(executionId, "Required parameter: 'executionId' is missing at 'GetExecution'");
                
                Preconditions.IsNotNull(xGwImsOrgId, "Required parameter: 'xGwImsOrgId' is missing at 'GetExecution'");
                
                Preconditions.IsNotNull(authorization, "Required parameter: 'authorization' is missing at 'GetExecution'");
                
                Preconditions.IsNotNull(xApiKey, "Required parameter: 'xApiKey' is missing at 'GetExecution'");
                
                return service.GetExecution(Context, programId, pipelineId, executionId, xGwImsOrgId, authorization, xApiKey);
            };

            Get["/api/program/{programId}/pipeline/{pipelineId}/executions"] = parameters =>
            {
                var programId = Parameters.ValueOf<string>(parameters, Context.Request, "programId", ParameterType.Path);
                var pipelineId = Parameters.ValueOf<string>(parameters, Context.Request, "pipelineId", ParameterType.Path);
                var xGwImsOrgId = Parameters.ValueOf<string>(parameters, Context.Request, "xGwImsOrgId", ParameterType.Header);
                var authorization = Parameters.ValueOf<string>(parameters, Context.Request, "authorization", ParameterType.Header);
                var xApiKey = Parameters.ValueOf<string>(parameters, Context.Request, "xApiKey", ParameterType.Header);
                var start = Parameters.ValueOf<string>(parameters, Context.Request, "start", ParameterType.Query);
                var limit = Parameters.ValueOf<int?>(parameters, Context.Request, "limit", ParameterType.Query);
                Preconditions.IsNotNull(programId, "Required parameter: 'programId' is missing at 'GetExecutions'");
                
                Preconditions.IsNotNull(pipelineId, "Required parameter: 'pipelineId' is missing at 'GetExecutions'");
                
                Preconditions.IsNotNull(xGwImsOrgId, "Required parameter: 'xGwImsOrgId' is missing at 'GetExecutions'");
                
                Preconditions.IsNotNull(authorization, "Required parameter: 'authorization' is missing at 'GetExecutions'");
                
                Preconditions.IsNotNull(xApiKey, "Required parameter: 'xApiKey' is missing at 'GetExecutions'");
                
                return service.GetExecutions(Context, programId, pipelineId, xGwImsOrgId, authorization, xApiKey, start, limit);
            };

            Get["/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/logs"] = parameters =>
            {
                var programId = Parameters.ValueOf<string>(parameters, Context.Request, "programId", ParameterType.Path);
                var pipelineId = Parameters.ValueOf<string>(parameters, Context.Request, "pipelineId", ParameterType.Path);
                var executionId = Parameters.ValueOf<string>(parameters, Context.Request, "executionId", ParameterType.Path);
                var phaseId = Parameters.ValueOf<string>(parameters, Context.Request, "phaseId", ParameterType.Path);
                var stepId = Parameters.ValueOf<string>(parameters, Context.Request, "stepId", ParameterType.Path);
                var xGwImsOrgId = Parameters.ValueOf<string>(parameters, Context.Request, "xGwImsOrgId", ParameterType.Header);
                var authorization = Parameters.ValueOf<string>(parameters, Context.Request, "authorization", ParameterType.Header);
                var xApiKey = Parameters.ValueOf<string>(parameters, Context.Request, "xApiKey", ParameterType.Header);
                var file = Parameters.ValueOf<string>(parameters, Context.Request, "file", ParameterType.Query);
                var accept = Parameters.ValueOf<string>(parameters, Context.Request, "accept", ParameterType.Header);
                Preconditions.IsNotNull(programId, "Required parameter: 'programId' is missing at 'GetStepLogs'");
                
                Preconditions.IsNotNull(pipelineId, "Required parameter: 'pipelineId' is missing at 'GetStepLogs'");
                
                Preconditions.IsNotNull(executionId, "Required parameter: 'executionId' is missing at 'GetStepLogs'");
                
                Preconditions.IsNotNull(phaseId, "Required parameter: 'phaseId' is missing at 'GetStepLogs'");
                
                Preconditions.IsNotNull(stepId, "Required parameter: 'stepId' is missing at 'GetStepLogs'");
                
                Preconditions.IsNotNull(xGwImsOrgId, "Required parameter: 'xGwImsOrgId' is missing at 'GetStepLogs'");
                
                Preconditions.IsNotNull(authorization, "Required parameter: 'authorization' is missing at 'GetStepLogs'");
                
                Preconditions.IsNotNull(xApiKey, "Required parameter: 'xApiKey' is missing at 'GetStepLogs'");
                
                service.GetStepLogs(Context, programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, file, accept);
                return new Response { ContentType = ""};
            };

            Put["/api/program/{programId}/pipeline/{pipelineId}/execution"] = parameters =>
            {
                var programId = Parameters.ValueOf<string>(parameters, Context.Request, "programId", ParameterType.Path);
                var pipelineId = Parameters.ValueOf<string>(parameters, Context.Request, "pipelineId", ParameterType.Path);
                var xGwImsOrgId = Parameters.ValueOf<string>(parameters, Context.Request, "xGwImsOrgId", ParameterType.Header);
                var authorization = Parameters.ValueOf<string>(parameters, Context.Request, "authorization", ParameterType.Header);
                var xApiKey = Parameters.ValueOf<string>(parameters, Context.Request, "xApiKey", ParameterType.Header);
                var contentType = Parameters.ValueOf<string>(parameters, Context.Request, "contentType", ParameterType.Header);
                Preconditions.IsNotNull(programId, "Required parameter: 'programId' is missing at 'StartPipeline'");
                
                Preconditions.IsNotNull(pipelineId, "Required parameter: 'pipelineId' is missing at 'StartPipeline'");
                
                Preconditions.IsNotNull(xGwImsOrgId, "Required parameter: 'xGwImsOrgId' is missing at 'StartPipeline'");
                
                Preconditions.IsNotNull(authorization, "Required parameter: 'authorization' is missing at 'StartPipeline'");
                
                Preconditions.IsNotNull(xApiKey, "Required parameter: 'xApiKey' is missing at 'StartPipeline'");
                
                Preconditions.IsNotNull(contentType, "Required parameter: 'contentType' is missing at 'StartPipeline'");
                
                service.StartPipeline(Context, programId, pipelineId, xGwImsOrgId, authorization, xApiKey, contentType);
                return new Response { ContentType = ""};
            };

            Get["/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/metrics"] = parameters =>
            {
                var programId = Parameters.ValueOf<string>(parameters, Context.Request, "programId", ParameterType.Path);
                var pipelineId = Parameters.ValueOf<string>(parameters, Context.Request, "pipelineId", ParameterType.Path);
                var executionId = Parameters.ValueOf<string>(parameters, Context.Request, "executionId", ParameterType.Path);
                var phaseId = Parameters.ValueOf<string>(parameters, Context.Request, "phaseId", ParameterType.Path);
                var stepId = Parameters.ValueOf<string>(parameters, Context.Request, "stepId", ParameterType.Path);
                var xGwImsOrgId = Parameters.ValueOf<string>(parameters, Context.Request, "xGwImsOrgId", ParameterType.Header);
                var authorization = Parameters.ValueOf<string>(parameters, Context.Request, "authorization", ParameterType.Header);
                var xApiKey = Parameters.ValueOf<string>(parameters, Context.Request, "xApiKey", ParameterType.Header);
                Preconditions.IsNotNull(programId, "Required parameter: 'programId' is missing at 'StepMetric'");
                
                Preconditions.IsNotNull(pipelineId, "Required parameter: 'pipelineId' is missing at 'StepMetric'");
                
                Preconditions.IsNotNull(executionId, "Required parameter: 'executionId' is missing at 'StepMetric'");
                
                Preconditions.IsNotNull(phaseId, "Required parameter: 'phaseId' is missing at 'StepMetric'");
                
                Preconditions.IsNotNull(stepId, "Required parameter: 'stepId' is missing at 'StepMetric'");
                
                Preconditions.IsNotNull(xGwImsOrgId, "Required parameter: 'xGwImsOrgId' is missing at 'StepMetric'");
                
                Preconditions.IsNotNull(authorization, "Required parameter: 'authorization' is missing at 'StepMetric'");
                
                Preconditions.IsNotNull(xApiKey, "Required parameter: 'xApiKey' is missing at 'StepMetric'");
                
                return service.StepMetric(Context, programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey);
            };

            Get["/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}"] = parameters =>
            {
                var programId = Parameters.ValueOf<string>(parameters, Context.Request, "programId", ParameterType.Path);
                var pipelineId = Parameters.ValueOf<string>(parameters, Context.Request, "pipelineId", ParameterType.Path);
                var executionId = Parameters.ValueOf<string>(parameters, Context.Request, "executionId", ParameterType.Path);
                var phaseId = Parameters.ValueOf<string>(parameters, Context.Request, "phaseId", ParameterType.Path);
                var stepId = Parameters.ValueOf<string>(parameters, Context.Request, "stepId", ParameterType.Path);
                var xGwImsOrgId = Parameters.ValueOf<string>(parameters, Context.Request, "xGwImsOrgId", ParameterType.Header);
                var authorization = Parameters.ValueOf<string>(parameters, Context.Request, "authorization", ParameterType.Header);
                var xApiKey = Parameters.ValueOf<string>(parameters, Context.Request, "xApiKey", ParameterType.Header);
                Preconditions.IsNotNull(programId, "Required parameter: 'programId' is missing at 'StepState'");
                
                Preconditions.IsNotNull(pipelineId, "Required parameter: 'pipelineId' is missing at 'StepState'");
                
                Preconditions.IsNotNull(executionId, "Required parameter: 'executionId' is missing at 'StepState'");
                
                Preconditions.IsNotNull(phaseId, "Required parameter: 'phaseId' is missing at 'StepState'");
                
                Preconditions.IsNotNull(stepId, "Required parameter: 'stepId' is missing at 'StepState'");
                
                Preconditions.IsNotNull(xGwImsOrgId, "Required parameter: 'xGwImsOrgId' is missing at 'StepState'");
                
                Preconditions.IsNotNull(authorization, "Required parameter: 'authorization' is missing at 'StepState'");
                
                Preconditions.IsNotNull(xApiKey, "Required parameter: 'xApiKey' is missing at 'StepState'");
                
                return service.StepState(Context, programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey);
            };
        }
    }

    /// <summary>
    /// Service handling PipelineExecution requests.
    /// </summary>
    public interface PipelineExecutionService
    {
        /// <summary>
        /// Post to this url in order to advance the current pipeline execution, if paused and waiting for user interaction. Link is present in output only in that case. The input depends on the actual reason for which the pipeline execution stopped.
        /// </summary>
        /// <param name="context">Context of request</param>
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
        void AdvancePipelineExecution(NancyContext context, string programId, string pipelineId, string executionId, string phaseId, string stepId, string xGwImsOrgId, string authorization, string xApiKey, string contentType, Object body);

        /// <summary>
        /// Post to this url in order to cancel the current pipeline execution. Link is present in output only in that case.
        /// </summary>
        /// <param name="context">Context of request</param>
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
        void CancelPipelineExecutionStep(NancyContext context, string programId, string pipelineId, string executionId, string phaseId, string stepId, string xGwImsOrgId, string authorization, string xApiKey, string contentType, Object body);

        /// <summary>
        /// Returns current pipeline execution if any.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="programId">Identifier of the program.</param>
        /// <param name="pipelineId">Identifier of the pipeline</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <returns>PipelineExecution</returns>
        PipelineExecution GetCurrentExecution(NancyContext context, string programId, string pipelineId, string xGwImsOrgId, string authorization, string xApiKey);

        /// <summary>
        /// Returns a pipeline execution by id
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="programId">Identifier of the program.</param>
        /// <param name="pipelineId">Identifier of the pipeline</param>
        /// <param name="executionId">Identifier of the execution</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <returns>PipelineExecution</returns>
        PipelineExecution GetExecution(NancyContext context, string programId, string pipelineId, string executionId, string xGwImsOrgId, string authorization, string xApiKey);

        /// <summary>
        /// Returns the history of pipeline executions in a newest to oldest order
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="programId">Identifier of the program.</param>
        /// <param name="pipelineId">Identifier of the pipeline</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <param name="start">Pagination start parameter (optional)</param>
        /// <param name="limit">Pagination limit parameter (optional)</param>
        /// <returns>PipelineExecutionListRepresentation</returns>
        PipelineExecutionListRepresentation GetExecutions(NancyContext context, string programId, string pipelineId, string xGwImsOrgId, string authorization, string xApiKey, string start, int? limit);

        /// <summary>
        /// Get the logs associated with a step.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="programId">Identifier of the program.</param>
        /// <param name="pipelineId">Identifier of the pipeline</param>
        /// <param name="executionId">Identifier of the execution</param>
        /// <param name="phaseId">Identifier of the phase</param>
        /// <param name="stepId">Identifier of the step</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <param name="file">Identifier of the log file (optional)</param>
        /// <param name="accept">Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header. (optional)</param>
        /// <returns></returns>
        void GetStepLogs(NancyContext context, string programId, string pipelineId, string executionId, string phaseId, string stepId, string xGwImsOrgId, string authorization, string xApiKey, string file, string accept);

        /// <summary>
        /// Starts the Pipeline. This works only if the pipeline is not already started.
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="programId">Identifier of the program.</param>
        /// <param name="pipelineId">Identifier of the pipeline</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <param name="contentType">Must always be application/json</param>
        /// <returns></returns>
        void StartPipeline(NancyContext context, string programId, string pipelineId, string xGwImsOrgId, string authorization, string xApiKey, string contentType);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="programId">Identifier of the program.</param>
        /// <param name="pipelineId">Identifier of the pipeline</param>
        /// <param name="executionId">Identifier of the execution</param>
        /// <param name="phaseId">Identifier of the phase</param>
        /// <param name="stepId">Identifier of the step</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <returns>PipelineStepMetrics</returns>
        PipelineStepMetrics StepMetric(NancyContext context, string programId, string pipelineId, string executionId, string phaseId, string stepId, string xGwImsOrgId, string authorization, string xApiKey);

        /// <summary>
        /// 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="programId">Identifier of the program.</param>
        /// <param name="pipelineId">Identifier of the pipeline</param>
        /// <param name="executionId">Identifier of the execution</param>
        /// <param name="phaseId">Identifier of the phase</param>
        /// <param name="stepId">Identifier of the step</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <returns>PipelineExecutionStepState</returns>
        PipelineExecutionStepState StepState(NancyContext context, string programId, string pipelineId, string executionId, string phaseId, string stepId, string xGwImsOrgId, string authorization, string xApiKey);
    }

    /// <summary>
    /// Abstraction of PipelineExecutionService.
    /// </summary>
    public abstract class AbstractPipelineExecutionService: PipelineExecutionService
    {
        public virtual void AdvancePipelineExecution(NancyContext context, string programId, string pipelineId, string executionId, string phaseId, string stepId, string xGwImsOrgId, string authorization, string xApiKey, string contentType, Object body)
        {
            AdvancePipelineExecution(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, contentType, body);
        }

        public virtual void CancelPipelineExecutionStep(NancyContext context, string programId, string pipelineId, string executionId, string phaseId, string stepId, string xGwImsOrgId, string authorization, string xApiKey, string contentType, Object body)
        {
            CancelPipelineExecutionStep(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, contentType, body);
        }

        public virtual PipelineExecution GetCurrentExecution(NancyContext context, string programId, string pipelineId, string xGwImsOrgId, string authorization, string xApiKey)
        {
            return GetCurrentExecution(programId, pipelineId, xGwImsOrgId, authorization, xApiKey);
        }

        public virtual PipelineExecution GetExecution(NancyContext context, string programId, string pipelineId, string executionId, string xGwImsOrgId, string authorization, string xApiKey)
        {
            return GetExecution(programId, pipelineId, executionId, xGwImsOrgId, authorization, xApiKey);
        }

        public virtual PipelineExecutionListRepresentation GetExecutions(NancyContext context, string programId, string pipelineId, string xGwImsOrgId, string authorization, string xApiKey, string start, int? limit)
        {
            return GetExecutions(programId, pipelineId, xGwImsOrgId, authorization, xApiKey, start, limit);
        }

        public virtual void GetStepLogs(NancyContext context, string programId, string pipelineId, string executionId, string phaseId, string stepId, string xGwImsOrgId, string authorization, string xApiKey, string file, string accept)
        {
            GetStepLogs(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, file, accept);
        }

        public virtual void StartPipeline(NancyContext context, string programId, string pipelineId, string xGwImsOrgId, string authorization, string xApiKey, string contentType)
        {
            StartPipeline(programId, pipelineId, xGwImsOrgId, authorization, xApiKey, contentType);
        }

        public virtual PipelineStepMetrics StepMetric(NancyContext context, string programId, string pipelineId, string executionId, string phaseId, string stepId, string xGwImsOrgId, string authorization, string xApiKey)
        {
            return StepMetric(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey);
        }

        public virtual PipelineExecutionStepState StepState(NancyContext context, string programId, string pipelineId, string executionId, string phaseId, string stepId, string xGwImsOrgId, string authorization, string xApiKey)
        {
            return StepState(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey);
        }

        protected abstract void AdvancePipelineExecution(string programId, string pipelineId, string executionId, string phaseId, string stepId, string xGwImsOrgId, string authorization, string xApiKey, string contentType, Object body);

        protected abstract void CancelPipelineExecutionStep(string programId, string pipelineId, string executionId, string phaseId, string stepId, string xGwImsOrgId, string authorization, string xApiKey, string contentType, Object body);

        protected abstract PipelineExecution GetCurrentExecution(string programId, string pipelineId, string xGwImsOrgId, string authorization, string xApiKey);

        protected abstract PipelineExecution GetExecution(string programId, string pipelineId, string executionId, string xGwImsOrgId, string authorization, string xApiKey);

        protected abstract PipelineExecutionListRepresentation GetExecutions(string programId, string pipelineId, string xGwImsOrgId, string authorization, string xApiKey, string start, int? limit);

        protected abstract void GetStepLogs(string programId, string pipelineId, string executionId, string phaseId, string stepId, string xGwImsOrgId, string authorization, string xApiKey, string file, string accept);

        protected abstract void StartPipeline(string programId, string pipelineId, string xGwImsOrgId, string authorization, string xApiKey, string contentType);

        protected abstract PipelineStepMetrics StepMetric(string programId, string pipelineId, string executionId, string phaseId, string stepId, string xGwImsOrgId, string authorization, string xApiKey);

        protected abstract PipelineExecutionStepState StepState(string programId, string pipelineId, string executionId, string phaseId, string stepId, string xGwImsOrgId, string authorization, string xApiKey);
    }

}
