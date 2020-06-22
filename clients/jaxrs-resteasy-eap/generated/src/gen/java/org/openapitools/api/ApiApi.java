package org.openapitools.api;

import org.openapitools.model.*;

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

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/api")


@io.swagger.annotations.Api(description = "the api API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-06-22T02:54:15.715Z[GMT]")
public interface ApiApi  {
   
    @PUT
    @Path("/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/advance")
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "Advance", notes = "Post to this url in order to advance the current pipeline execution, if paused and waiting for user interaction. Link is present in output only in that case. The input depends on the actual reason for which the pipeline execution stopped.", response = Void.class, tags={ "Pipeline Execution", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 202, message = "Successful resume of pipeline execution", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Missing permission for user to advance the pipeline execution", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "No pipeline execution exits or unknown pipeline or program", response = Void.class) })
    public Response advancePipelineExecution( @PathParam("programId") String programId, @PathParam("pipelineId") String pipelineId, @PathParam("executionId") String executionId, @PathParam("phaseId") String phaseId, @PathParam("stepId") String stepId, @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true) @HeaderParam("x-gw-ims-org-id") String xGwImsOrgId, @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true) @HeaderParam("Authorization") String authorization, @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true) @HeaderParam("x-api-key") String xApiKey, @NotNull  @ApiParam(value = "Must always be application/json" ,required=true) @HeaderParam("Content-Type") String contentType,@ApiParam(value = "Input for advance. See documentation for details." ,required=true) @NotNull @Valid Object body,@Context SecurityContext securityContext);
    @PUT
    @Path("/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/cancel")
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "Cancel", notes = "Post to this url in order to cancel the current pipeline execution. Link is present in output only in that case.", response = Void.class, tags={ "Pipeline Execution", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 202, message = "Successful cancel of pipeline execution", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Missing permission for user to cancel the current pipeline execution", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "No pipeline execution exits or unknown pipeline or program", response = Void.class) })
    public Response cancelPipelineExecutionStep( @PathParam("programId") String programId, @PathParam("pipelineId") String pipelineId, @PathParam("executionId") String executionId, @PathParam("phaseId") String phaseId, @PathParam("stepId") String stepId, @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true) @HeaderParam("x-gw-ims-org-id") String xGwImsOrgId, @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true) @HeaderParam("Authorization") String authorization, @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true) @HeaderParam("x-api-key") String xApiKey, @NotNull  @ApiParam(value = "Must always be application/json" ,required=true) @HeaderParam("Content-Type") String contentType,@ApiParam(value = "Input for advance. See documentation for details." ,required=true) @NotNull @Valid Object body,@Context SecurityContext securityContext);
    @DELETE
    @Path("/program/{programId}/environment/{environmentId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "DeleteEnvironment", notes = "Delete environment", response = Environment.class, tags={ "Environments", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Environment deleted", response = Environment.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Environment deletion in progress", response = BadRequestError.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Environment not found", response = Void.class) })
    public Response deleteEnvironment( @PathParam("programId") String programId, @PathParam("environmentId") String environmentId, @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true) @HeaderParam("x-gw-ims-org-id") String xGwImsOrgId, @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true) @HeaderParam("Authorization") String authorization, @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true) @HeaderParam("x-api-key") String xApiKey,@Context SecurityContext securityContext);
    @DELETE
    @Path("/program/{programId}/pipeline/{pipelineId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete a Pipeline", notes = "Delete a pipeline. All the data is wiped.", response = Void.class, tags={ "Pipelines", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response deletePipeline( @PathParam("programId") String programId, @PathParam("pipelineId") String pipelineId, @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true) @HeaderParam("x-gw-ims-org-id") String xGwImsOrgId, @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true) @HeaderParam("Authorization") String authorization, @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true) @HeaderParam("x-api-key") String xApiKey,@Context SecurityContext securityContext);
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
    public Response deleteProgram( @PathParam("programId") String programId, @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true) @HeaderParam("x-gw-ims-org-id") String xGwImsOrgId, @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true) @HeaderParam("Authorization") String authorization, @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true) @HeaderParam("x-api-key") String xApiKey,@Context SecurityContext securityContext);
    @GET
    @Path("/program/{programId}/environment/{environmentId}/logs/download")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Download Logs", notes = "Download environment logs", response = Void.class, tags={ "Environments", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful retrieval of logs", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "invalid parameters", response = BadRequestError.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Environment not found", response = Void.class) })
    public Response downloadLogs( @PathParam("programId") String programId, @PathParam("environmentId") String environmentId, @NotNull  @QueryParam("service") String service, @NotNull  @QueryParam("name") String name, @NotNull  @QueryParam("date") String date, @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true) @HeaderParam("x-gw-ims-org-id") String xGwImsOrgId, @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true) @HeaderParam("Authorization") String authorization, @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true) @HeaderParam("x-api-key") String xApiKey,  @ApiParam(value = "Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header." ) @HeaderParam("Accept") String accept,@Context SecurityContext securityContext);
    @GET
    @Path("/program/{programId}/repository/{repositoryId}/branches")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List Branches", notes = "Returns the list of branches from a repository", response = BranchList.class, tags={ "Branches", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful retrieval of the list of repository branches", response = BranchList.class) })
    public Response getBranches( @PathParam("programId") String programId, @PathParam("repositoryId") String repositoryId, @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true) @HeaderParam("x-gw-ims-org-id") String xGwImsOrgId, @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true) @HeaderParam("Authorization") String authorization, @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true) @HeaderParam("x-api-key") String xApiKey,@Context SecurityContext securityContext);
    @GET
    @Path("/program/{programId}/pipeline/{pipelineId}/execution")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get current pipeline execution", notes = "Returns current pipeline execution if any.", response = PipelineExecution.class, tags={ "Pipeline Execution", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful retrieval of current execution", response = PipelineExecution.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "No pipeline execution exits or unknown pipeline or program", response = Void.class) })
    public Response getCurrentExecution( @PathParam("programId") String programId, @PathParam("pipelineId") String pipelineId, @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true) @HeaderParam("x-gw-ims-org-id") String xGwImsOrgId, @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true) @HeaderParam("Authorization") String authorization, @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true) @HeaderParam("x-api-key") String xApiKey,@Context SecurityContext securityContext);
    @GET
    @Path("/program/{programId}/environment/{environmentId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Environment", notes = "Returns an environment by its id", response = Environment.class, tags={ "Environments", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Environment.class) })
    public Response getEnvironment( @PathParam("programId") String programId, @PathParam("environmentId") String environmentId, @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true) @HeaderParam("x-gw-ims-org-id") String xGwImsOrgId, @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true) @HeaderParam("Authorization") String authorization, @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true) @HeaderParam("x-api-key") String xApiKey,@Context SecurityContext securityContext);
    @GET
    @Path("/program/{programId}/environment/{environmentId}/logs")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Environment Logs", notes = "List all logs available in environment", response = EnvironmentLogs.class, tags={ "Environments", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful retrieval of logs for an environment", response = EnvironmentLogs.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "invalid parameters", response = BadRequestError.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Environment not found", response = Void.class) })
    public Response getEnvironmentLogs( @PathParam("programId") String programId, @PathParam("environmentId") String environmentId, @NotNull  @QueryParam("days") Integer days, @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true) @HeaderParam("x-gw-ims-org-id") String xGwImsOrgId, @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true) @HeaderParam("Authorization") String authorization, @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true) @HeaderParam("x-api-key") String xApiKey,  @QueryParam("service") List<String> service,  @QueryParam("name") List<String> name,@Context SecurityContext securityContext);
    @GET
    @Path("/program/{programId}/environment/{environmentId}/variables")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List User Environment Variables", notes = "List the user defined variables for an environment (Cloud Service only).", response = VariableList.class, tags={ "Variables", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful retrieval of environment variables", response = VariableList.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Environment not found", response = Void.class) })
    public Response getEnvironmentVariables( @PathParam("programId") String programId, @PathParam("environmentId") String environmentId, @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true) @HeaderParam("x-gw-ims-org-id") String xGwImsOrgId, @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true) @HeaderParam("Authorization") String authorization, @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true) @HeaderParam("x-api-key") String xApiKey,@Context SecurityContext securityContext);
    @GET
    @Path("/program/{programId}/environments")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List Environments", notes = "Lists all environments in an program", response = EnvironmentList.class, tags={ "Environments", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful retrieval of environment list", response = EnvironmentList.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Program not found", response = Void.class) })
    public Response getEnvironments( @PathParam("programId") String programId, @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true) @HeaderParam("x-gw-ims-org-id") String xGwImsOrgId, @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true) @HeaderParam("Authorization") String authorization, @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true) @HeaderParam("x-api-key") String xApiKey, , allowableValues="dev, stage, prod" @QueryParam("type") String type,@Context SecurityContext securityContext);
    @GET
    @Path("/program/{programId}/pipeline/{pipelineId}/execution/{executionId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get pipeline execution", notes = "Returns a pipeline execution by id", response = PipelineExecution.class, tags={ "Pipeline Execution", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful retrieval of execution", response = PipelineExecution.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "No pipeline execution exits or unknown pipeline or application", response = Void.class) })
    public Response getExecution( @PathParam("programId") String programId, @PathParam("pipelineId") String pipelineId, @PathParam("executionId") String executionId, @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true) @HeaderParam("x-gw-ims-org-id") String xGwImsOrgId, @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true) @HeaderParam("Authorization") String authorization, @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true) @HeaderParam("x-api-key") String xApiKey,@Context SecurityContext securityContext);
    @GET
    @Path("/program/{programId}/pipeline/{pipelineId}/executions")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List Executions", notes = "Returns the history of pipeline executions in a newest to oldest order", response = PipelineExecutionListRepresentation.class, tags={ "Pipeline Execution", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful retrieval of execution history", response = PipelineExecutionListRepresentation.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Missing permission for user to read executions", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Pipeline does not exist", response = Void.class) })
    public Response getExecutions( @PathParam("programId") String programId, @PathParam("pipelineId") String pipelineId, @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true) @HeaderParam("x-gw-ims-org-id") String xGwImsOrgId, @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true) @HeaderParam("Authorization") String authorization, @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true) @HeaderParam("x-api-key") String xApiKey,  @QueryParam("start") String start,  @QueryParam("limit") Integer limit,@Context SecurityContext securityContext);
    @GET
    @Path("/program/{programId}/pipeline/{pipelineId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Pipeline", notes = "Returns a pipeline by its id", response = Pipeline.class, tags={ "Pipelines", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful retrieval of pipeline", response = Pipeline.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Pipeline not found", response = Void.class) })
    public Response getPipeline( @PathParam("programId") String programId, @PathParam("pipelineId") String pipelineId, @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true) @HeaderParam("x-gw-ims-org-id") String xGwImsOrgId, @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true) @HeaderParam("Authorization") String authorization, @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true) @HeaderParam("x-api-key") String xApiKey,@Context SecurityContext securityContext);
    @GET
    @Path("/program/{programId}/pipelines")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List Pipelines", notes = "Returns all the pipelines that the requesting user has access to in an program", response = PipelineList.class, tags={ "Pipelines", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PipelineList.class) })
    public Response getPipelines( @PathParam("programId") String programId, @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true) @HeaderParam("x-gw-ims-org-id") String xGwImsOrgId, @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true) @HeaderParam("Authorization") String authorization, @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true) @HeaderParam("x-api-key") String xApiKey,@Context SecurityContext securityContext);
    @GET
    @Path("/program/{programId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Program", notes = "Returns a program by its id", response = Program.class, tags={ "Programs", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful retrieval of program", response = Program.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Program not found", response = Void.class) })
    public Response getProgram( @PathParam("programId") String programId, @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true) @HeaderParam("x-gw-ims-org-id") String xGwImsOrgId, @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true) @HeaderParam("Authorization") String authorization, @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true) @HeaderParam("x-api-key") String xApiKey,@Context SecurityContext securityContext);
    @GET
    @Path("/programs")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Lists Programs", notes = "Returns all programs that the requesting user has access to", response = ProgramList.class, tags={ "Programs", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProgramList.class) })
    public Response getPrograms( @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true) @HeaderParam("x-gw-ims-org-id") String xGwImsOrgId, @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true) @HeaderParam("Authorization") String authorization, @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true) @HeaderParam("x-api-key") String xApiKey,@Context SecurityContext securityContext);
    @GET
    @Path("/program/{programId}/repositories")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Lists Repositories", notes = "Lists all Repositories in an program", response = RepositoryList.class, tags={ "Repositories", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RepositoryList.class) })
    public Response getRepositories( @PathParam("programId") String programId, @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true) @HeaderParam("x-gw-ims-org-id") String xGwImsOrgId, @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true) @HeaderParam("Authorization") String authorization, @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true) @HeaderParam("x-api-key") String xApiKey,@Context SecurityContext securityContext);
    @GET
    @Path("/program/{programId}/repository/{repositoryId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Repository", notes = "Returns an repository by its id", response = Repository.class, tags={ "Repositories", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Repository.class) })
    public Response getRepository( @PathParam("programId") String programId, @PathParam("repositoryId") String repositoryId, @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true) @HeaderParam("x-gw-ims-org-id") String xGwImsOrgId, @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true) @HeaderParam("Authorization") String authorization, @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true) @HeaderParam("x-api-key") String xApiKey,@Context SecurityContext securityContext);
    @GET
    @Path("/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/logs")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get logs", notes = "Get the logs associated with a step.", response = Void.class, tags={ "Pipeline Execution", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful retrieval of logs", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Missing permission for user to read logs", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Pipeline execution does not exist", response = Void.class) })
    public Response getStepLogs( @PathParam("programId") String programId, @PathParam("pipelineId") String pipelineId, @PathParam("executionId") String executionId, @PathParam("phaseId") String phaseId, @PathParam("stepId") String stepId, @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true) @HeaderParam("x-gw-ims-org-id") String xGwImsOrgId, @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true) @HeaderParam("Authorization") String authorization, @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true) @HeaderParam("x-api-key") String xApiKey,  @QueryParam("file") String file,  @ApiParam(value = "Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header." ) @HeaderParam("Accept") String accept,@Context SecurityContext securityContext);
    @PATCH
    @Path("/program/{programId}/environment/{environmentId}/variables")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Patch User Environment Variables", notes = "Modify multiple environment variables (Cloud Service only). To delete a variable, include it with an empty value.", response = VariableList.class, tags={ "Variables", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful update of environment variables", response = VariableList.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Environment not found", response = Void.class) })
    public Response patchEnvironmentVariables( @PathParam("programId") String programId, @PathParam("environmentId") String environmentId, @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true) @HeaderParam("x-gw-ims-org-id") String xGwImsOrgId, @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true) @HeaderParam("Authorization") String authorization, @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true) @HeaderParam("x-api-key") String xApiKey, @NotNull  @ApiParam(value = "Must always be application/json" ,required=true) @HeaderParam("Content-Type") String contentType,@ApiParam(value = "The list of variables to add, modify, or remove. It is not necessary to send variables here which are not changing." ,required=true) @NotNull @Valid List<Variable> body,@Context SecurityContext securityContext);
    @PATCH
    @Path("/program/{programId}/pipeline/{pipelineId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Patches Pipeline", notes = "Patches a pipeline within an program.", response = Pipeline.class, tags={ "Pipelines", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Pipeline.class) })
    public Response patchPipeline( @PathParam("programId") String programId, @PathParam("pipelineId") String pipelineId, @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true) @HeaderParam("x-gw-ims-org-id") String xGwImsOrgId, @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true) @HeaderParam("Authorization") String authorization, @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true) @HeaderParam("x-api-key") String xApiKey, @NotNull  @ApiParam(value = "Must always be application/json" ,required=true) @HeaderParam("Content-Type") String contentType,@ApiParam(value = "The updated Pipeline" ,required=true) @NotNull @Valid Pipeline body,@Context SecurityContext securityContext);
    @PUT
    @Path("/program/{programId}/pipeline/{pipelineId}/execution")
    
    
    @io.swagger.annotations.ApiOperation(value = "Start the pipeline", notes = "Starts the Pipeline. This works only if the pipeline is not already started.", response = Void.class, tags={ "Pipeline Execution", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Successful started pipeline execution", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Request conflicts with the expected state of pipeline", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "No pipeline execution exits or unknown pipeline or application", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 412, message = "Cannot start execution: programId={programId}, pipelineId={pipelineId} currentExecutionId={executionId}, reason='Execution already in progress.", response = Void.class) })
    public Response startPipeline( @PathParam("programId") String programId, @PathParam("pipelineId") String pipelineId, @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true) @HeaderParam("x-gw-ims-org-id") String xGwImsOrgId, @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true) @HeaderParam("Authorization") String authorization, @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true) @HeaderParam("x-api-key") String xApiKey, @NotNull  @ApiParam(value = "Must always be application/json" ,required=true) @HeaderParam("Content-Type") String contentType,@Context SecurityContext securityContext);
    @GET
    @Path("/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/metrics")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get step metrics", notes = "", response = PipelineStepMetrics.class, tags={ "Pipeline Execution", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful retrieval of metrics", response = PipelineStepMetrics.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Missing permission for user to read metrics", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Pipeline execution does not exist", response = Void.class) })
    public Response stepMetric( @PathParam("programId") String programId, @PathParam("pipelineId") String pipelineId, @PathParam("executionId") String executionId, @PathParam("phaseId") String phaseId, @PathParam("stepId") String stepId, @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true) @HeaderParam("x-gw-ims-org-id") String xGwImsOrgId, @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true) @HeaderParam("Authorization") String authorization, @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true) @HeaderParam("x-api-key") String xApiKey,@Context SecurityContext securityContext);
    @GET
    @Path("/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get step state", notes = "", response = PipelineExecutionStepState.class, tags={ "Pipeline Execution", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful retrieval of step state", response = PipelineExecutionStepState.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Missing permission for user to read step", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Pipeline execution does not exist", response = Void.class) })
    public Response stepState( @PathParam("programId") String programId, @PathParam("pipelineId") String pipelineId, @PathParam("executionId") String executionId, @PathParam("phaseId") String phaseId, @PathParam("stepId") String stepId, @NotNull  @ApiParam(value = "IMS organization ID that the request is being made under." ,required=true) @HeaderParam("x-gw-ims-org-id") String xGwImsOrgId, @NotNull  @ApiParam(value = "Bearer [token] - An access token for the technical account created through integration with Adobe IO" ,required=true) @HeaderParam("Authorization") String authorization, @NotNull  @ApiParam(value = "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io" ,required=true) @HeaderParam("x-api-key") String xApiKey,@Context SecurityContext securityContext);
}
