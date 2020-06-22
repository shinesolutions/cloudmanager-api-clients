package org.openapitools.api;

import org.openapitools.model.BadRequestError;
import org.openapitools.model.BranchList;
import org.openapitools.model.Environment;
import org.openapitools.model.EnvironmentList;
import org.openapitools.model.EnvironmentLogs;
import java.util.List;
import org.openapitools.model.Pipeline;
import org.openapitools.model.PipelineExecution;
import org.openapitools.model.PipelineExecutionListRepresentation;
import org.openapitools.model.PipelineExecutionStepState;
import org.openapitools.model.PipelineList;
import org.openapitools.model.PipelineStepMetrics;
import org.openapitools.model.Program;
import org.openapitools.model.ProgramList;
import org.openapitools.model.Repository;
import org.openapitools.model.RepositoryList;
import org.openapitools.model.Variable;
import org.openapitools.model.VariableList;
import org.openapitools.api.ApiApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.annotations.*;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.PATCH;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
@Path("/api")
@RequestScoped

@Api(description = "the api API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2020-06-22T02:53:55.896Z[GMT]")

public class ApiApi  {

  @Context SecurityContext securityContext;

  @Inject ApiApiService delegate;


    @PUT
    @Path("/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/advance")
    @Consumes({ "application/json" })
    
    @ApiOperation(value = "Advance", notes = "Post to this url in order to advance the current pipeline execution, if paused and waiting for user interaction. Link is present in output only in that case. The input depends on the actual reason for which the pipeline execution stopped.", response = Void.class, tags={ "Pipeline Execution",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 202, message = "Successful resume of pipeline execution", response = Void.class),
        @ApiResponse(code = 403, message = "Missing permission for user to advance the pipeline execution", response = Void.class),
        @ApiResponse(code = 404, message = "No pipeline execution exits or unknown pipeline or program", response = Void.class) })
    public Response advancePipelineExecution(@ApiParam(value = "Identifier of the program.",required=true) @PathParam("programId") String programId, @ApiParam(value = "Identifier of the pipeline",required=true) @PathParam("pipelineId") String pipelineId, @ApiParam(value = "Identifier of the execution",required=true) @PathParam("executionId") String executionId, @ApiParam(value = "Identifier of the phase",required=true) @PathParam("phaseId") String phaseId, @ApiParam(value = "Identifier of the step",required=true) @PathParam("stepId") String stepId,  @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId,  @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization,  @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey,  @NotNull  @ApiParam(value = "Must always be application/json" ,required=true)@HeaderParam("Content-Type") String contentType, @ApiParam(value = "Input for advance. See documentation for details." ,required=true) Object body) {
        return delegate.advancePipelineExecution(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, contentType, body, securityContext);
    }

    @PUT
    @Path("/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/cancel")
    @Consumes({ "application/json" })
    
    @ApiOperation(value = "Cancel", notes = "Post to this url in order to cancel the current pipeline execution. Link is present in output only in that case.", response = Void.class, tags={ "Pipeline Execution",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 202, message = "Successful cancel of pipeline execution", response = Void.class),
        @ApiResponse(code = 403, message = "Missing permission for user to cancel the current pipeline execution", response = Void.class),
        @ApiResponse(code = 404, message = "No pipeline execution exits or unknown pipeline or program", response = Void.class) })
    public Response cancelPipelineExecutionStep(@ApiParam(value = "Identifier of the program.",required=true) @PathParam("programId") String programId, @ApiParam(value = "Identifier of the pipeline",required=true) @PathParam("pipelineId") String pipelineId, @ApiParam(value = "Identifier of the execution",required=true) @PathParam("executionId") String executionId, @ApiParam(value = "Identifier of the phase",required=true) @PathParam("phaseId") String phaseId, @ApiParam(value = "Identifier of the step",required=true) @PathParam("stepId") String stepId,  @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId,  @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization,  @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey,  @NotNull  @ApiParam(value = "Must always be application/json" ,required=true)@HeaderParam("Content-Type") String contentType, @ApiParam(value = "Input for advance. See documentation for details." ,required=true) Object body) {
        return delegate.cancelPipelineExecutionStep(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, contentType, body, securityContext);
    }

    @DELETE
    @Path("/program/{programId}/environment/{environmentId}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "DeleteEnvironment", notes = "Delete environment", response = Environment.class, tags={ "Environments",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Environment deleted", response = Environment.class),
        @ApiResponse(code = 400, message = "Environment deletion in progress", response = BadRequestError.class),
        @ApiResponse(code = 404, message = "Environment not found", response = Void.class) })
    public Response deleteEnvironment(@ApiParam(value = "Identifier of the application",required=true) @PathParam("programId") String programId, @ApiParam(value = "Identifier of the environment",required=true) @PathParam("environmentId") String environmentId,  @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId,  @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization,  @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey) {
        return delegate.deleteEnvironment(programId, environmentId, xGwImsOrgId, authorization, xApiKey, securityContext);
    }

    @DELETE
    @Path("/program/{programId}/pipeline/{pipelineId}")
    
    
    @ApiOperation(value = "Delete a Pipeline", notes = "Delete a pipeline. All the data is wiped.", response = Void.class, tags={ "Pipelines",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response deletePipeline(@ApiParam(value = "Identifier of the program",required=true) @PathParam("programId") String programId, @ApiParam(value = "Identifier of the pipeline",required=true) @PathParam("pipelineId") String pipelineId,  @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId,  @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization,  @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey) {
        return delegate.deletePipeline(programId, pipelineId, xGwImsOrgId, authorization, xApiKey, securityContext);
    }

    @DELETE
    @Path("/program/{programId}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete Program", notes = "Delete an program", response = Program.class, tags={ "Programs",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Program.class),
        @ApiResponse(code = 202, message = "Delete was successful.", response = Program.class),
        @ApiResponse(code = 403, message = "Forbidden.", response = Void.class),
        @ApiResponse(code = 404, message = "Program not found.", response = Void.class),
        @ApiResponse(code = 412, message = "Deletion not supported", response = Void.class) })
    public Response deleteProgram(@ApiParam(value = "Identifier of the program",required=true) @PathParam("programId") String programId,  @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId,  @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization,  @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey) {
        return delegate.deleteProgram(programId, xGwImsOrgId, authorization, xApiKey, securityContext);
    }

    @GET
    @Path("/program/{programId}/environment/{environmentId}/logs/download")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Download Logs", notes = "Download environment logs", response = Void.class, tags={ "Environments",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful retrieval of logs", response = Void.class),
        @ApiResponse(code = 400, message = "invalid parameters", response = BadRequestError.class),
        @ApiResponse(code = 404, message = "Environment not found", response = Void.class) })
    public Response downloadLogs(@ApiParam(value = "Identifier of the program",required=true) @PathParam("programId") String programId, @ApiParam(value = "Identifier of the environment",required=true) @PathParam("environmentId") String environmentId,  @NotNull @ApiParam(value = "Name of service",required=true)  @QueryParam("service") String service,  @NotNull @ApiParam(value = "Name of log",required=true)  @QueryParam("name") String name,  @NotNull @ApiParam(value = "date for which log is required",required=true)  @QueryParam("date") String date,  @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId,  @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization,  @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey,  @ApiParam(value = "Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header." )@HeaderParam("Accept") String accept) {
        return delegate.downloadLogs(programId, environmentId, service, name, date, xGwImsOrgId, authorization, xApiKey, accept, securityContext);
    }

    @GET
    @Path("/program/{programId}/repository/{repositoryId}/branches")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List Branches", notes = "Returns the list of branches from a repository", response = BranchList.class, tags={ "Branches",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful retrieval of the list of repository branches", response = BranchList.class) })
    public Response getBranches(@ApiParam(value = "Identifier of the program.",required=true) @PathParam("programId") String programId, @ApiParam(value = "Identifier of the repository",required=true) @PathParam("repositoryId") String repositoryId,  @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId,  @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization,  @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey) {
        return delegate.getBranches(programId, repositoryId, xGwImsOrgId, authorization, xApiKey, securityContext);
    }

    @GET
    @Path("/program/{programId}/pipeline/{pipelineId}/execution")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get current pipeline execution", notes = "Returns current pipeline execution if any.", response = PipelineExecution.class, tags={ "Pipeline Execution",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful retrieval of current execution", response = PipelineExecution.class),
        @ApiResponse(code = 404, message = "No pipeline execution exits or unknown pipeline or program", response = Void.class) })
    public Response getCurrentExecution(@ApiParam(value = "Identifier of the program.",required=true) @PathParam("programId") String programId, @ApiParam(value = "Identifier of the pipeline",required=true) @PathParam("pipelineId") String pipelineId,  @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId,  @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization,  @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey) {
        return delegate.getCurrentExecution(programId, pipelineId, xGwImsOrgId, authorization, xApiKey, securityContext);
    }

    @GET
    @Path("/program/{programId}/environment/{environmentId}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Environment", notes = "Returns an environment by its id", response = Environment.class, tags={ "Environments",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Environment.class) })
    public Response getEnvironment(@ApiParam(value = "Identifier of the program",required=true) @PathParam("programId") String programId, @ApiParam(value = "Identifier of the environment",required=true) @PathParam("environmentId") String environmentId,  @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId,  @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization,  @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey) {
        return delegate.getEnvironment(programId, environmentId, xGwImsOrgId, authorization, xApiKey, securityContext);
    }

    @GET
    @Path("/program/{programId}/environment/{environmentId}/logs")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Environment Logs", notes = "List all logs available in environment", response = EnvironmentLogs.class, tags={ "Environments",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful retrieval of logs for an environment", response = EnvironmentLogs.class),
        @ApiResponse(code = 400, message = "invalid parameters", response = BadRequestError.class),
        @ApiResponse(code = 404, message = "Environment not found", response = Void.class) })
    public Response getEnvironmentLogs(@ApiParam(value = "Identifier of the program",required=true) @PathParam("programId") String programId, @ApiParam(value = "Identifier of the environment",required=true) @PathParam("environmentId") String environmentId,  @NotNull @ApiParam(value = "number of days for which logs are required",required=true)  @QueryParam("days") Integer days,  @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId,  @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization,  @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey, @ApiParam(value = "Names of services")  @QueryParam("service") List<String> service, @ApiParam(value = "Names of log")  @QueryParam("name") List<String> name) {
        return delegate.getEnvironmentLogs(programId, environmentId, days, xGwImsOrgId, authorization, xApiKey, service, name, securityContext);
    }

    @GET
    @Path("/program/{programId}/environment/{environmentId}/variables")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List User Environment Variables", notes = "List the user defined variables for an environment (Cloud Service only).", response = VariableList.class, tags={ "Variables",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful retrieval of environment variables", response = VariableList.class),
        @ApiResponse(code = 404, message = "Environment not found", response = Void.class) })
    public Response getEnvironmentVariables(@ApiParam(value = "Identifier of the program",required=true) @PathParam("programId") String programId, @ApiParam(value = "Identifier of the environment",required=true) @PathParam("environmentId") String environmentId,  @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId,  @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization,  @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey) {
        return delegate.getEnvironmentVariables(programId, environmentId, xGwImsOrgId, authorization, xApiKey, securityContext);
    }

    @GET
    @Path("/program/{programId}/environments")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List Environments", notes = "Lists all environments in an program", response = EnvironmentList.class, tags={ "Environments",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful retrieval of environment list", response = EnvironmentList.class),
        @ApiResponse(code = 404, message = "Program not found", response = Void.class) })
    public Response getEnvironments(@ApiParam(value = "Identifier of the program",required=true) @PathParam("programId") String programId,  @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId,  @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization,  @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey, @ApiParam(value = "Type of the environment", allowableValues="dev, stage, prod")  @QueryParam("type") String type) {
        return delegate.getEnvironments(programId, xGwImsOrgId, authorization, xApiKey, type, securityContext);
    }

    @GET
    @Path("/program/{programId}/pipeline/{pipelineId}/execution/{executionId}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get pipeline execution", notes = "Returns a pipeline execution by id", response = PipelineExecution.class, tags={ "Pipeline Execution",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful retrieval of execution", response = PipelineExecution.class),
        @ApiResponse(code = 404, message = "No pipeline execution exits or unknown pipeline or application", response = Void.class) })
    public Response getExecution(@ApiParam(value = "Identifier of the program.",required=true) @PathParam("programId") String programId, @ApiParam(value = "Identifier of the pipeline",required=true) @PathParam("pipelineId") String pipelineId, @ApiParam(value = "Identifier of the execution",required=true) @PathParam("executionId") String executionId,  @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId,  @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization,  @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey) {
        return delegate.getExecution(programId, pipelineId, executionId, xGwImsOrgId, authorization, xApiKey, securityContext);
    }

    @GET
    @Path("/program/{programId}/pipeline/{pipelineId}/executions")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List Executions", notes = "Returns the history of pipeline executions in a newest to oldest order", response = PipelineExecutionListRepresentation.class, tags={ "Pipeline Execution",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful retrieval of execution history", response = PipelineExecutionListRepresentation.class),
        @ApiResponse(code = 403, message = "Missing permission for user to read executions", response = Void.class),
        @ApiResponse(code = 404, message = "Pipeline does not exist", response = Void.class) })
    public Response getExecutions(@ApiParam(value = "Identifier of the program.",required=true) @PathParam("programId") String programId, @ApiParam(value = "Identifier of the pipeline",required=true) @PathParam("pipelineId") String pipelineId,  @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId,  @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization,  @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey, @ApiParam(value = "Pagination start parameter")  @QueryParam("start") String start, @ApiParam(value = "Pagination limit parameter")  @QueryParam("limit") Integer limit) {
        return delegate.getExecutions(programId, pipelineId, xGwImsOrgId, authorization, xApiKey, start, limit, securityContext);
    }

    @GET
    @Path("/program/{programId}/pipeline/{pipelineId}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Pipeline", notes = "Returns a pipeline by its id", response = Pipeline.class, tags={ "Pipelines",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful retrieval of pipeline", response = Pipeline.class),
        @ApiResponse(code = 404, message = "Pipeline not found", response = Void.class) })
    public Response getPipeline(@ApiParam(value = "Identifier of the program",required=true) @PathParam("programId") String programId, @ApiParam(value = "Identifier of the pipeline",required=true) @PathParam("pipelineId") String pipelineId,  @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId,  @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization,  @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey) {
        return delegate.getPipeline(programId, pipelineId, xGwImsOrgId, authorization, xApiKey, securityContext);
    }

    @GET
    @Path("/program/{programId}/pipelines")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List Pipelines", notes = "Returns all the pipelines that the requesting user has access to in an program", response = PipelineList.class, tags={ "Pipelines",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = PipelineList.class) })
    public Response getPipelines(@ApiParam(value = "Identifier of the program",required=true) @PathParam("programId") String programId,  @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId,  @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization,  @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey) {
        return delegate.getPipelines(programId, xGwImsOrgId, authorization, xApiKey, securityContext);
    }

    @GET
    @Path("/program/{programId}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Program", notes = "Returns a program by its id", response = Program.class, tags={ "Programs",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful retrieval of program", response = Program.class),
        @ApiResponse(code = 404, message = "Program not found", response = Void.class) })
    public Response getProgram(@ApiParam(value = "Identifier of the program",required=true) @PathParam("programId") String programId,  @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId,  @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization,  @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey) {
        return delegate.getProgram(programId, xGwImsOrgId, authorization, xApiKey, securityContext);
    }

    @GET
    @Path("/programs")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Lists Programs", notes = "Returns all programs that the requesting user has access to", response = ProgramList.class, tags={ "Programs",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ProgramList.class) })
    public Response getPrograms( @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId,  @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization,  @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey) {
        return delegate.getPrograms(xGwImsOrgId, authorization, xApiKey, securityContext);
    }

    @GET
    @Path("/program/{programId}/repositories")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Lists Repositories", notes = "Lists all Repositories in an program", response = RepositoryList.class, tags={ "Repositories",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = RepositoryList.class) })
    public Response getRepositories(@ApiParam(value = "Identifier of the program",required=true) @PathParam("programId") String programId,  @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId,  @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization,  @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey) {
        return delegate.getRepositories(programId, xGwImsOrgId, authorization, xApiKey, securityContext);
    }

    @GET
    @Path("/program/{programId}/repository/{repositoryId}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Repository", notes = "Returns an repository by its id", response = Repository.class, tags={ "Repositories",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Repository.class) })
    public Response getRepository(@ApiParam(value = "Identifier of the program",required=true) @PathParam("programId") String programId, @ApiParam(value = "Identifier of the repository",required=true) @PathParam("repositoryId") String repositoryId,  @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId,  @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization,  @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey) {
        return delegate.getRepository(programId, repositoryId, xGwImsOrgId, authorization, xApiKey, securityContext);
    }

    @GET
    @Path("/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/logs")
    
    
    @ApiOperation(value = "Get logs", notes = "Get the logs associated with a step.", response = Void.class, tags={ "Pipeline Execution",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful retrieval of logs", response = Void.class),
        @ApiResponse(code = 403, message = "Missing permission for user to read logs", response = Void.class),
        @ApiResponse(code = 404, message = "Pipeline execution does not exist", response = Void.class) })
    public Response getStepLogs(@ApiParam(value = "Identifier of the program.",required=true) @PathParam("programId") String programId, @ApiParam(value = "Identifier of the pipeline",required=true) @PathParam("pipelineId") String pipelineId, @ApiParam(value = "Identifier of the execution",required=true) @PathParam("executionId") String executionId, @ApiParam(value = "Identifier of the phase",required=true) @PathParam("phaseId") String phaseId, @ApiParam(value = "Identifier of the step",required=true) @PathParam("stepId") String stepId,  @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId,  @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization,  @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey, @ApiParam(value = "Identifier of the log file")  @QueryParam("file") String file,  @ApiParam(value = "Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header." )@HeaderParam("Accept") String accept) {
        return delegate.getStepLogs(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, file, accept, securityContext);
    }

    @PATCH
    @Path("/program/{programId}/environment/{environmentId}/variables")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Patch User Environment Variables", notes = "Modify multiple environment variables (Cloud Service only). To delete a variable, include it with an empty value.", response = VariableList.class, tags={ "Variables",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful update of environment variables", response = VariableList.class),
        @ApiResponse(code = 404, message = "Environment not found", response = Void.class) })
    public Response patchEnvironmentVariables(@ApiParam(value = "Identifier of the program",required=true) @PathParam("programId") String programId, @ApiParam(value = "Identifier of the environment",required=true) @PathParam("environmentId") String environmentId,  @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId,  @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization,  @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey,  @NotNull  @ApiParam(value = "Must always be application/json" ,required=true)@HeaderParam("Content-Type") String contentType, @ApiParam(value = "The list of variables to add, modify, or remove. It is not necessary to send variables here which are not changing." ,required=true) List<Variable> body) {
        return delegate.patchEnvironmentVariables(programId, environmentId, xGwImsOrgId, authorization, xApiKey, contentType, body, securityContext);
    }

    @PATCH
    @Path("/program/{programId}/pipeline/{pipelineId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Patches Pipeline", notes = "Patches a pipeline within an program.", response = Pipeline.class, tags={ "Pipelines",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Pipeline.class) })
    public Response patchPipeline(@ApiParam(value = "Identifier of the program",required=true) @PathParam("programId") String programId, @ApiParam(value = "Identifier of the pipeline",required=true) @PathParam("pipelineId") String pipelineId,  @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId,  @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization,  @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey,  @NotNull  @ApiParam(value = "Must always be application/json" ,required=true)@HeaderParam("Content-Type") String contentType, @ApiParam(value = "The updated Pipeline" ,required=true) Pipeline body) {
        return delegate.patchPipeline(programId, pipelineId, xGwImsOrgId, authorization, xApiKey, contentType, body, securityContext);
    }

    @PUT
    @Path("/program/{programId}/pipeline/{pipelineId}/execution")
    
    
    @ApiOperation(value = "Start the pipeline", notes = "Starts the Pipeline. This works only if the pipeline is not already started.", response = Void.class, tags={ "Pipeline Execution",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Successful started pipeline execution", response = Void.class),
        @ApiResponse(code = 400, message = "Request conflicts with the expected state of pipeline", response = Void.class),
        @ApiResponse(code = 404, message = "No pipeline execution exits or unknown pipeline or application", response = Void.class),
        @ApiResponse(code = 412, message = "Cannot start execution: programId={programId}, pipelineId={pipelineId} currentExecutionId={executionId}, reason='Execution already in progress.", response = Void.class) })
    public Response startPipeline(@ApiParam(value = "Identifier of the program.",required=true) @PathParam("programId") String programId, @ApiParam(value = "Identifier of the pipeline",required=true) @PathParam("pipelineId") String pipelineId,  @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId,  @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization,  @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey,  @NotNull  @ApiParam(value = "Must always be application/json" ,required=true)@HeaderParam("Content-Type") String contentType) {
        return delegate.startPipeline(programId, pipelineId, xGwImsOrgId, authorization, xApiKey, contentType, securityContext);
    }

    @GET
    @Path("/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/metrics")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get step metrics", notes = "", response = PipelineStepMetrics.class, tags={ "Pipeline Execution",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful retrieval of metrics", response = PipelineStepMetrics.class),
        @ApiResponse(code = 403, message = "Missing permission for user to read metrics", response = Void.class),
        @ApiResponse(code = 404, message = "Pipeline execution does not exist", response = Void.class) })
    public Response stepMetric(@ApiParam(value = "Identifier of the program.",required=true) @PathParam("programId") String programId, @ApiParam(value = "Identifier of the pipeline",required=true) @PathParam("pipelineId") String pipelineId, @ApiParam(value = "Identifier of the execution",required=true) @PathParam("executionId") String executionId, @ApiParam(value = "Identifier of the phase",required=true) @PathParam("phaseId") String phaseId, @ApiParam(value = "Identifier of the step",required=true) @PathParam("stepId") String stepId,  @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId,  @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization,  @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey) {
        return delegate.stepMetric(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, securityContext);
    }

    @GET
    @Path("/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get step state", notes = "", response = PipelineExecutionStepState.class, tags={ "Pipeline Execution" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful retrieval of step state", response = PipelineExecutionStepState.class),
        @ApiResponse(code = 403, message = "Missing permission for user to read step", response = Void.class),
        @ApiResponse(code = 404, message = "Pipeline execution does not exist", response = Void.class) })
    public Response stepState(@ApiParam(value = "Identifier of the program.",required=true) @PathParam("programId") String programId, @ApiParam(value = "Identifier of the pipeline",required=true) @PathParam("pipelineId") String pipelineId, @ApiParam(value = "Identifier of the execution",required=true) @PathParam("executionId") String executionId, @ApiParam(value = "Identifier of the phase",required=true) @PathParam("phaseId") String phaseId, @ApiParam(value = "Identifier of the step",required=true) @PathParam("stepId") String stepId,  @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId,  @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization,  @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey) {
        return delegate.stepState(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, securityContext);
    }
}
