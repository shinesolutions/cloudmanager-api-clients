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
    /// Module processing requests of Programs domain.
    /// </summary>
    public sealed class ProgramsModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public ProgramsModule(ProgramsService service) : base("/")
        { 
            Delete["/api/program/{programId}"] = parameters =>
            {
                var programId = Parameters.ValueOf<string>(parameters, Context.Request, "programId", ParameterType.Path);
                var xGwImsOrgId = Parameters.ValueOf<string>(parameters, Context.Request, "xGwImsOrgId", ParameterType.Header);
                var authorization = Parameters.ValueOf<string>(parameters, Context.Request, "authorization", ParameterType.Header);
                var xApiKey = Parameters.ValueOf<string>(parameters, Context.Request, "xApiKey", ParameterType.Header);
                Preconditions.IsNotNull(programId, "Required parameter: 'programId' is missing at 'DeleteProgram'");
                
                Preconditions.IsNotNull(xGwImsOrgId, "Required parameter: 'xGwImsOrgId' is missing at 'DeleteProgram'");
                
                Preconditions.IsNotNull(authorization, "Required parameter: 'authorization' is missing at 'DeleteProgram'");
                
                Preconditions.IsNotNull(xApiKey, "Required parameter: 'xApiKey' is missing at 'DeleteProgram'");
                
                return service.DeleteProgram(Context, programId, xGwImsOrgId, authorization, xApiKey);
            };

            Get["/api/program/{programId}"] = parameters =>
            {
                var programId = Parameters.ValueOf<string>(parameters, Context.Request, "programId", ParameterType.Path);
                var xGwImsOrgId = Parameters.ValueOf<string>(parameters, Context.Request, "xGwImsOrgId", ParameterType.Header);
                var authorization = Parameters.ValueOf<string>(parameters, Context.Request, "authorization", ParameterType.Header);
                var xApiKey = Parameters.ValueOf<string>(parameters, Context.Request, "xApiKey", ParameterType.Header);
                Preconditions.IsNotNull(programId, "Required parameter: 'programId' is missing at 'GetProgram'");
                
                Preconditions.IsNotNull(xGwImsOrgId, "Required parameter: 'xGwImsOrgId' is missing at 'GetProgram'");
                
                Preconditions.IsNotNull(authorization, "Required parameter: 'authorization' is missing at 'GetProgram'");
                
                Preconditions.IsNotNull(xApiKey, "Required parameter: 'xApiKey' is missing at 'GetProgram'");
                
                return service.GetProgram(Context, programId, xGwImsOrgId, authorization, xApiKey);
            };

            Get["/api/programs"] = parameters =>
            {
                var xGwImsOrgId = Parameters.ValueOf<string>(parameters, Context.Request, "xGwImsOrgId", ParameterType.Header);
                var authorization = Parameters.ValueOf<string>(parameters, Context.Request, "authorization", ParameterType.Header);
                var xApiKey = Parameters.ValueOf<string>(parameters, Context.Request, "xApiKey", ParameterType.Header);
                Preconditions.IsNotNull(xGwImsOrgId, "Required parameter: 'xGwImsOrgId' is missing at 'GetPrograms'");
                
                Preconditions.IsNotNull(authorization, "Required parameter: 'authorization' is missing at 'GetPrograms'");
                
                Preconditions.IsNotNull(xApiKey, "Required parameter: 'xApiKey' is missing at 'GetPrograms'");
                
                return service.GetPrograms(Context, xGwImsOrgId, authorization, xApiKey);
            };
        }
    }

    /// <summary>
    /// Service handling Programs requests.
    /// </summary>
    public interface ProgramsService
    {
        /// <summary>
        /// Delete an program
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="programId">Identifier of the program</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <returns>Program</returns>
        Program DeleteProgram(NancyContext context, string programId, string xGwImsOrgId, string authorization, string xApiKey);

        /// <summary>
        /// Returns a program by its id
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="programId">Identifier of the program</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <returns>Program</returns>
        Program GetProgram(NancyContext context, string programId, string xGwImsOrgId, string authorization, string xApiKey);

        /// <summary>
        /// Returns all programs that the requesting user has access to
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="xGwImsOrgId">IMS organization ID that the request is being made under.</param>
        /// <param name="authorization">Bearer [token] - An access token for the technical account created through integration with Adobe IO</param>
        /// <param name="xApiKey">IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io</param>
        /// <returns>ProgramList</returns>
        ProgramList GetPrograms(NancyContext context, string xGwImsOrgId, string authorization, string xApiKey);
    }

    /// <summary>
    /// Abstraction of ProgramsService.
    /// </summary>
    public abstract class AbstractProgramsService: ProgramsService
    {
        public virtual Program DeleteProgram(NancyContext context, string programId, string xGwImsOrgId, string authorization, string xApiKey)
        {
            return DeleteProgram(programId, xGwImsOrgId, authorization, xApiKey);
        }

        public virtual Program GetProgram(NancyContext context, string programId, string xGwImsOrgId, string authorization, string xApiKey)
        {
            return GetProgram(programId, xGwImsOrgId, authorization, xApiKey);
        }

        public virtual ProgramList GetPrograms(NancyContext context, string xGwImsOrgId, string authorization, string xApiKey)
        {
            return GetPrograms(xGwImsOrgId, authorization, xApiKey);
        }

        protected abstract Program DeleteProgram(string programId, string xGwImsOrgId, string authorization, string xApiKey);

        protected abstract Program GetProgram(string programId, string xGwImsOrgId, string authorization, string xApiKey);

        protected abstract ProgramList GetPrograms(string xGwImsOrgId, string authorization, string xApiKey);
    }

}
