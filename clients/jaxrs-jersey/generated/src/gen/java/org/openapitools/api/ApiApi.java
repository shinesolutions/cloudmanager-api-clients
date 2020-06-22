package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.ApiApiService;
import org.openapitools.api.factories.ApiApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

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

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/api")


@io.swagger.annotations.Api(description = "the api API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-06-22T02:54:02.008Z[GMT]")
public class ApiApi  {
   private final ApiApiService delegate;

   public ApiApi(@Context ServletConfig servletContext) {
      ApiApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ApiApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ApiApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = ApiApiServiceFactory.getApiApi();
      }

      this.delegate = delegate;
   }

    @PUT
    @Path("/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/advance")
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "Advance", notes = "Post to this url in order to advance the current pipeline execution, if paused and waiting for user interaction. Link is present in output only in that case. The input depends on the actual reason for which the pipeline execution stopped.", response = Void.class, tags={ "Pipeline Execution", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 202, message = "Successful resume of pipeline execution", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Missing permission for user to advance the pipeline execution", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "No pipeline execution exits or unknown pipeline or program", response = Void.class) })
    public Response advancePipelineExecution(@ApiParam(value = "Identifier of the program.", required = true) @PathParam("programId") @NotNull  String programId
,@ApiParam(value = "Identifier of the pipeline", required = true) @PathParam("pipelineId") @NotNull  String pipelineId
,@ApiParam(value = "Identifier of the execution", required = true) @PathParam("executionId") @NotNull  String executionId
,@ApiParam(value = "Identifier of the phase", required = true) @PathParam("phaseId") @NotNull  String phaseId
,@ApiParam(value = "Identifier of the step", required = true) @PathParam("stepId") @NotNull  String stepId
,@ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId
,@ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization
,@ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey
,@ApiParam(value = "Must always be application/json" ,required=true)@HeaderParam("Content-Type") String contentType
,@ApiParam(value = "Input for advance. See documentation for details.", required = true) @NotNull  Object body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.advancePipelineExecution(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, contentType, body, securityContext);
    }
    @PUT
    @Path("/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/cancel")
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "Cancel", notes = "Post to this url in order to cancel the current pipeline execution. Link is present in output only in that case.", response = Void.class, tags={ "Pipeline Execution", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 202, message = "Successful cancel of pipeline execution", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Missing permission for user to cancel the current pipeline execution", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "No pipeline execution exits or unknown pipeline or program", response = Void.class) })
    public Response cancelPipelineExecutionStep(@ApiParam(value = "Identifier of the program.", required = true) @PathParam("programId") @NotNull  String programId
,@ApiParam(value = "Identifier of the pipeline", required = true) @PathParam("pipelineId") @NotNull  String pipelineId
,@ApiParam(value = "Identifier of the execution", required = true) @PathParam("executionId") @NotNull  String executionId
,@ApiParam(value = "Identifier of the phase", required = true) @PathParam("phaseId") @NotNull  String phaseId
,@ApiParam(value = "Identifier of the step", required = true) @PathParam("stepId") @NotNull  String stepId
,@ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId
,@ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization
,@ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey
,@ApiParam(value = "Must always be application/json" ,required=true)@HeaderParam("Content-Type") String contentType
,@ApiParam(value = "Input for advance. See documentation for details.", required = true) @NotNull  Object body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.cancelPipelineExecutionStep(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, contentType, body, securityContext);
    }
    @DELETE
    @Path("/program/{programId}/environment/{environmentId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "DeleteEnvironment", notes = "Delete environment", response = Environment.class, tags={ "Environments", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Environment deleted", response = Environment.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Environment deletion in progress", response = BadRequestError.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Environment not found", response = Void.class) })
    public Response deleteEnvironment(@ApiParam(value = "Identifier of the application", required = true) @PathParam("programId") @NotNull  String programId
,@ApiParam(value = "Identifier of the environment", required = true) @PathParam("environmentId") @NotNull  String environmentId
,@ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId
,@ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization
,@ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteEnvironment(programId, environmentId, xGwImsOrgId, authorization, xApiKey, securityContext);
    }
    @DELETE
    @Path("/program/{programId}/pipeline/{pipelineId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete a Pipeline", notes = "Delete a pipeline. All the data is wiped.", response = Void.class, tags={ "Pipelines", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response deletePipeline(@ApiParam(value = "Identifier of the program", required = true) @PathParam("programId") @NotNull  String programId
,@ApiParam(value = "Identifier of the pipeline", required = true) @PathParam("pipelineId") @NotNull  String pipelineId
,@ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId
,@ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization
,@ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deletePipeline(programId, pipelineId, xGwImsOrgId, authorization, xApiKey, securityContext);
    }
    @DELETE
    @Path("/program/{programId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete Program", notes = "Delete an program", response = Program.class, tags={ "Programs", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Program.class),
        
        @io.swagger.annotations.ApiResponse(code = 202, message = "Delete was successful.", response = Program.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden.", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Program not found.", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 412, message = "Deletion not supported", response = Void.class) })
    public Response deleteProgram(@ApiParam(value = "Identifier of the program", required = true) @PathParam("programId") @NotNull  String programId
,@ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId
,@ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization
,@ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteProgram(programId, xGwImsOrgId, authorization, xApiKey, securityContext);
    }
    @GET
    @Path("/program/{programId}/environment/{environmentId}/logs/download")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Download Logs", notes = "Download environment logs", response = Void.class, tags={ "Environments", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful retrieval of logs", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "invalid parameters", response = BadRequestError.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Environment not found", response = Void.class) })
    public Response downloadLogs(@ApiParam(value = "Identifier of the program", required = true) @PathParam("programId") @NotNull  String programId
,@ApiParam(value = "Identifier of the environment", required = true) @PathParam("environmentId") @NotNull  String environmentId
,@ApiParam(value = "Name of service", required = true) @QueryParam("service") @NotNull  String service
,@ApiParam(value = "Name of log", required = true) @QueryParam("name") @NotNull  String name
,@ApiParam(value = "date for which log is required", required = true) @QueryParam("date") @NotNull  String date
,@ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId
,@ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization
,@ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey
,@ApiParam(value = "Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header." )@HeaderParam("Accept") String accept
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.downloadLogs(programId, environmentId, service, name, date, xGwImsOrgId, authorization, xApiKey, accept, securityContext);
    }
    @GET
    @Path("/program/{programId}/repository/{repositoryId}/branches")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List Branches", notes = "Returns the list of branches from a repository", response = BranchList.class, tags={ "Branches", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful retrieval of the list of repository branches", response = BranchList.class) })
    public Response getBranches(@ApiParam(value = "Identifier of the program.", required = true) @PathParam("programId") @NotNull  String programId
,@ApiParam(value = "Identifier of the repository", required = true) @PathParam("repositoryId") @NotNull  String repositoryId
,@ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId
,@ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization
,@ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getBranches(programId, repositoryId, xGwImsOrgId, authorization, xApiKey, securityContext);
    }
    @GET
    @Path("/program/{programId}/pipeline/{pipelineId}/execution")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get current pipeline execution", notes = "Returns current pipeline execution if any.", response = PipelineExecution.class, tags={ "Pipeline Execution", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful retrieval of current execution", response = PipelineExecution.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "No pipeline execution exits or unknown pipeline or program", response = Void.class) })
    public Response getCurrentExecution(@ApiParam(value = "Identifier of the program.", required = true) @PathParam("programId") @NotNull  String programId
,@ApiParam(value = "Identifier of the pipeline", required = true) @PathParam("pipelineId") @NotNull  String pipelineId
,@ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId
,@ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization
,@ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getCurrentExecution(programId, pipelineId, xGwImsOrgId, authorization, xApiKey, securityContext);
    }
    @GET
    @Path("/program/{programId}/environment/{environmentId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Environment", notes = "Returns an environment by its id", response = Environment.class, tags={ "Environments", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Environment.class) })
    public Response getEnvironment(@ApiParam(value = "Identifier of the program", required = true) @PathParam("programId") @NotNull  String programId
,@ApiParam(value = "Identifier of the environment", required = true) @PathParam("environmentId") @NotNull  String environmentId
,@ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId
,@ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization
,@ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getEnvironment(programId, environmentId, xGwImsOrgId, authorization, xApiKey, securityContext);
    }
    @GET
    @Path("/program/{programId}/environment/{environmentId}/logs")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Environment Logs", notes = "List all logs available in environment", response = EnvironmentLogs.class, tags={ "Environments", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful retrieval of logs for an environment", response = EnvironmentLogs.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "invalid parameters", response = BadRequestError.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Environment not found", response = Void.class) })
    public Response getEnvironmentLogs(@ApiParam(value = "Identifier of the program", required = true) @PathParam("programId") @NotNull  String programId
,@ApiParam(value = "Identifier of the environment", required = true) @PathParam("environmentId") @NotNull  String environmentId
,@ApiParam(value = "number of days for which logs are required", required = true) @QueryParam("days") @NotNull  Integer days
,@ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId
,@ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization
,@ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey
,@ApiParam(value = "Names of services") @QueryParam("service") @Valid  List<String> service
,@ApiParam(value = "Names of log") @QueryParam("name") @Valid  List<String> name
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getEnvironmentLogs(programId, environmentId, days, xGwImsOrgId, authorization, xApiKey, service, name, securityContext);
    }
    @GET
    @Path("/program/{programId}/environment/{environmentId}/variables")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List User Environment Variables", notes = "List the user defined variables for an environment (Cloud Service only).", response = VariableList.class, tags={ "Variables", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful retrieval of environment variables", response = VariableList.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Environment not found", response = Void.class) })
    public Response getEnvironmentVariables(@ApiParam(value = "Identifier of the program", required = true) @PathParam("programId") @NotNull  String programId
,@ApiParam(value = "Identifier of the environment", required = true) @PathParam("environmentId") @NotNull  String environmentId
,@ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId
,@ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization
,@ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getEnvironmentVariables(programId, environmentId, xGwImsOrgId, authorization, xApiKey, securityContext);
    }
    @GET
    @Path("/program/{programId}/environments")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List Environments", notes = "Lists all environments in an program", response = EnvironmentList.class, tags={ "Environments", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful retrieval of environment list", response = EnvironmentList.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Program not found", response = Void.class) })
    public Response getEnvironments(@ApiParam(value = "Identifier of the program", required = true) @PathParam("programId") @NotNull  String programId
,@ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId
,@ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization
,@ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey
,@ApiParam(value = "Type of the environment", allowableValues="dev, stage, prod") @QueryParam("type")  String type
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getEnvironments(programId, xGwImsOrgId, authorization, xApiKey, type, securityContext);
    }
    @GET
    @Path("/program/{programId}/pipeline/{pipelineId}/execution/{executionId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get pipeline execution", notes = "Returns a pipeline execution by id", response = PipelineExecution.class, tags={ "Pipeline Execution", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful retrieval of execution", response = PipelineExecution.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "No pipeline execution exits or unknown pipeline or application", response = Void.class) })
    public Response getExecution(@ApiParam(value = "Identifier of the program.", required = true) @PathParam("programId") @NotNull  String programId
,@ApiParam(value = "Identifier of the pipeline", required = true) @PathParam("pipelineId") @NotNull  String pipelineId
,@ApiParam(value = "Identifier of the execution", required = true) @PathParam("executionId") @NotNull  String executionId
,@ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId
,@ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization
,@ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getExecution(programId, pipelineId, executionId, xGwImsOrgId, authorization, xApiKey, securityContext);
    }
    @GET
    @Path("/program/{programId}/pipeline/{pipelineId}/executions")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List Executions", notes = "Returns the history of pipeline executions in a newest to oldest order", response = PipelineExecutionListRepresentation.class, tags={ "Pipeline Execution", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful retrieval of execution history", response = PipelineExecutionListRepresentation.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Missing permission for user to read executions", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Pipeline does not exist", response = Void.class) })
    public Response getExecutions(@ApiParam(value = "Identifier of the program.", required = true) @PathParam("programId") @NotNull  String programId
,@ApiParam(value = "Identifier of the pipeline", required = true) @PathParam("pipelineId") @NotNull  String pipelineId
,@ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId
,@ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization
,@ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey
,@ApiParam(value = "Pagination start parameter") @QueryParam("start")  String start
,@ApiParam(value = "Pagination limit parameter") @QueryParam("limit")  Integer limit
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getExecutions(programId, pipelineId, xGwImsOrgId, authorization, xApiKey, start, limit, securityContext);
    }
    @GET
    @Path("/program/{programId}/pipeline/{pipelineId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Pipeline", notes = "Returns a pipeline by its id", response = Pipeline.class, tags={ "Pipelines", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful retrieval of pipeline", response = Pipeline.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Pipeline not found", response = Void.class) })
    public Response getPipeline(@ApiParam(value = "Identifier of the program", required = true) @PathParam("programId") @NotNull  String programId
,@ApiParam(value = "Identifier of the pipeline", required = true) @PathParam("pipelineId") @NotNull  String pipelineId
,@ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId
,@ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization
,@ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getPipeline(programId, pipelineId, xGwImsOrgId, authorization, xApiKey, securityContext);
    }
    @GET
    @Path("/program/{programId}/pipelines")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List Pipelines", notes = "Returns all the pipelines that the requesting user has access to in an program", response = PipelineList.class, tags={ "Pipelines", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PipelineList.class) })
    public Response getPipelines(@ApiParam(value = "Identifier of the program", required = true) @PathParam("programId") @NotNull  String programId
,@ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId
,@ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization
,@ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getPipelines(programId, xGwImsOrgId, authorization, xApiKey, securityContext);
    }
    @GET
    @Path("/program/{programId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Program", notes = "Returns a program by its id", response = Program.class, tags={ "Programs", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful retrieval of program", response = Program.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Program not found", response = Void.class) })
    public Response getProgram(@ApiParam(value = "Identifier of the program", required = true) @PathParam("programId") @NotNull  String programId
,@ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId
,@ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization
,@ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getProgram(programId, xGwImsOrgId, authorization, xApiKey, securityContext);
    }
    @GET
    @Path("/programs")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Lists Programs", notes = "Returns all programs that the requesting user has access to", response = ProgramList.class, tags={ "Programs", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProgramList.class) })
    public Response getPrograms(@ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId
,@ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization
,@ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getPrograms(xGwImsOrgId, authorization, xApiKey, securityContext);
    }
    @GET
    @Path("/program/{programId}/repositories")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Lists Repositories", notes = "Lists all Repositories in an program", response = RepositoryList.class, tags={ "Repositories", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RepositoryList.class) })
    public Response getRepositories(@ApiParam(value = "Identifier of the program", required = true) @PathParam("programId") @NotNull  String programId
,@ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId
,@ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization
,@ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getRepositories(programId, xGwImsOrgId, authorization, xApiKey, securityContext);
    }
    @GET
    @Path("/program/{programId}/repository/{repositoryId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Repository", notes = "Returns an repository by its id", response = Repository.class, tags={ "Repositories", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Repository.class) })
    public Response getRepository(@ApiParam(value = "Identifier of the program", required = true) @PathParam("programId") @NotNull  String programId
,@ApiParam(value = "Identifier of the repository", required = true) @PathParam("repositoryId") @NotNull  String repositoryId
,@ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId
,@ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization
,@ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getRepository(programId, repositoryId, xGwImsOrgId, authorization, xApiKey, securityContext);
    }
    @GET
    @Path("/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/logs")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get logs", notes = "Get the logs associated with a step.", response = Void.class, tags={ "Pipeline Execution", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful retrieval of logs", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Missing permission for user to read logs", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Pipeline execution does not exist", response = Void.class) })
    public Response getStepLogs(@ApiParam(value = "Identifier of the program.", required = true) @PathParam("programId") @NotNull  String programId
,@ApiParam(value = "Identifier of the pipeline", required = true) @PathParam("pipelineId") @NotNull  String pipelineId
,@ApiParam(value = "Identifier of the execution", required = true) @PathParam("executionId") @NotNull  String executionId
,@ApiParam(value = "Identifier of the phase", required = true) @PathParam("phaseId") @NotNull  String phaseId
,@ApiParam(value = "Identifier of the step", required = true) @PathParam("stepId") @NotNull  String stepId
,@ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId
,@ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization
,@ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey
,@ApiParam(value = "Identifier of the log file") @QueryParam("file")  String file
,@ApiParam(value = "Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header." )@HeaderParam("Accept") String accept
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getStepLogs(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, file, accept, securityContext);
    }
    @PATCH
    @Path("/program/{programId}/environment/{environmentId}/variables")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Patch User Environment Variables", notes = "Modify multiple environment variables (Cloud Service only). To delete a variable, include it with an empty value.", response = VariableList.class, tags={ "Variables", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful update of environment variables", response = VariableList.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Environment not found", response = Void.class) })
    public Response patchEnvironmentVariables(@ApiParam(value = "Identifier of the program", required = true) @PathParam("programId") @NotNull  String programId
,@ApiParam(value = "Identifier of the environment", required = true) @PathParam("environmentId") @NotNull  String environmentId
,@ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId
,@ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization
,@ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey
,@ApiParam(value = "Must always be application/json" ,required=true)@HeaderParam("Content-Type") String contentType
,@ApiParam(value = "The list of variables to add, modify, or remove. It is not necessary to send variables here which are not changing.", required = true) @NotNull @Valid  List<Variable> body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patchEnvironmentVariables(programId, environmentId, xGwImsOrgId, authorization, xApiKey, contentType, body, securityContext);
    }
    @PATCH
    @Path("/program/{programId}/pipeline/{pipelineId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Patches Pipeline", notes = "Patches a pipeline within an program.", response = Pipeline.class, tags={ "Pipelines", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Pipeline.class) })
    public Response patchPipeline(@ApiParam(value = "Identifier of the program", required = true) @PathParam("programId") @NotNull  String programId
,@ApiParam(value = "Identifier of the pipeline", required = true) @PathParam("pipelineId") @NotNull  String pipelineId
,@ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId
,@ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization
,@ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey
,@ApiParam(value = "Must always be application/json" ,required=true)@HeaderParam("Content-Type") String contentType
,@ApiParam(value = "The updated Pipeline", required = true) @NotNull @Valid  Pipeline body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.patchPipeline(programId, pipelineId, xGwImsOrgId, authorization, xApiKey, contentType, body, securityContext);
    }
    @PUT
    @Path("/program/{programId}/pipeline/{pipelineId}/execution")
    
    
    @io.swagger.annotations.ApiOperation(value = "Start the pipeline", notes = "Starts the Pipeline. This works only if the pipeline is not already started.", response = Void.class, tags={ "Pipeline Execution", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Successful started pipeline execution", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Request conflicts with the expected state of pipeline", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "No pipeline execution exits or unknown pipeline or application", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 412, message = "Cannot start execution: programId={programId}, pipelineId={pipelineId} currentExecutionId={executionId}, reason='Execution already in progress.", response = Void.class) })
    public Response startPipeline(@ApiParam(value = "Identifier of the program.", required = true) @PathParam("programId") @NotNull  String programId
,@ApiParam(value = "Identifier of the pipeline", required = true) @PathParam("pipelineId") @NotNull  String pipelineId
,@ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId
,@ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization
,@ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey
,@ApiParam(value = "Must always be application/json" ,required=true)@HeaderParam("Content-Type") String contentType
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.startPipeline(programId, pipelineId, xGwImsOrgId, authorization, xApiKey, contentType, securityContext);
    }
    @GET
    @Path("/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/metrics")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get step metrics", notes = "", response = PipelineStepMetrics.class, tags={ "Pipeline Execution", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful retrieval of metrics", response = PipelineStepMetrics.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Missing permission for user to read metrics", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Pipeline execution does not exist", response = Void.class) })
    public Response stepMetric(@ApiParam(value = "Identifier of the program.", required = true) @PathParam("programId") @NotNull  String programId
,@ApiParam(value = "Identifier of the pipeline", required = true) @PathParam("pipelineId") @NotNull  String pipelineId
,@ApiParam(value = "Identifier of the execution", required = true) @PathParam("executionId") @NotNull  String executionId
,@ApiParam(value = "Identifier of the phase", required = true) @PathParam("phaseId") @NotNull  String phaseId
,@ApiParam(value = "Identifier of the step", required = true) @PathParam("stepId") @NotNull  String stepId
,@ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId
,@ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization
,@ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.stepMetric(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, securityContext);
    }
    @GET
    @Path("/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get step state", notes = "", response = PipelineExecutionStepState.class, tags={ "Pipeline Execution", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful retrieval of step state", response = PipelineExecutionStepState.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Missing permission for user to read step", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Pipeline execution does not exist", response = Void.class) })
    public Response stepState(@ApiParam(value = "Identifier of the program.", required = true) @PathParam("programId") @NotNull  String programId
,@ApiParam(value = "Identifier of the pipeline", required = true) @PathParam("pipelineId") @NotNull  String pipelineId
,@ApiParam(value = "Identifier of the execution", required = true) @PathParam("executionId") @NotNull  String executionId
,@ApiParam(value = "Identifier of the phase", required = true) @PathParam("phaseId") @NotNull  String phaseId
,@ApiParam(value = "Identifier of the step", required = true) @PathParam("stepId") @NotNull  String stepId
,@ApiParam(value = "IMS organization ID that the request is being made under." ,required=true)@HeaderParam("x-gw-ims-org-id") String xGwImsOrgId
,@ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true)@HeaderParam("Authorization") String authorization
,@ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true)@HeaderParam("x-api-key") String xApiKey
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.stepState(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, securityContext);
    }
}
