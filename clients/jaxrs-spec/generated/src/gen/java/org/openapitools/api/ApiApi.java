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

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/api")
@Api(description = "the api API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2020-06-22T02:54:21.117Z[GMT]")
public class ApiApi {

    @PUT
    @Path("/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/advance")
    @Consumes({ "application/json" })
    @ApiOperation(value = "Advance", notes = "Post to this url in order to advance the current pipeline execution, if paused and waiting for user interaction. Link is present in output only in that case. The input depends on the actual reason for which the pipeline execution stopped.", response = Void.class, tags={ "Pipeline Execution",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 202, message = "Successful resume of pipeline execution", response = Void.class),
        @ApiResponse(code = 403, message = "Missing permission for user to advance the pipeline execution", response = Void.class),
        @ApiResponse(code = 404, message = "No pipeline execution exits or unknown pipeline or program", response = Void.class)
    })
    public Response advancePipelineExecution(@PathParam("programId") @ApiParam("Identifier of the program.") String programId,@PathParam("pipelineId") @ApiParam("Identifier of the pipeline") String pipelineId,@PathParam("executionId") @ApiParam("Identifier of the execution") String executionId,@PathParam("phaseId") @ApiParam("Identifier of the phase") String phaseId,@PathParam("stepId") @ApiParam("Identifier of the step") String stepId,@HeaderParam("x-gw-ims-org-id") @NotNull    @ApiParam("IMS organization ID that the request is being made under.") String xGwImsOrgId,@HeaderParam("Authorization") @NotNull    @ApiParam("Bearer [token] - An access token for the technical account created through integration with Adobe IO") String authorization,@HeaderParam("x-api-key") @NotNull    @ApiParam("IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io") String xApiKey,@HeaderParam("Content-Type") @NotNull    @ApiParam("Must always be application/json") String contentType,@Valid Object body) {
        return Response.ok().entity("magic!").build();
    }

    @PUT
    @Path("/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/cancel")
    @Consumes({ "application/json" })
    @ApiOperation(value = "Cancel", notes = "Post to this url in order to cancel the current pipeline execution. Link is present in output only in that case.", response = Void.class, tags={ "Pipeline Execution",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 202, message = "Successful cancel of pipeline execution", response = Void.class),
        @ApiResponse(code = 403, message = "Missing permission for user to cancel the current pipeline execution", response = Void.class),
        @ApiResponse(code = 404, message = "No pipeline execution exits or unknown pipeline or program", response = Void.class)
    })
    public Response cancelPipelineExecutionStep(@PathParam("programId") @ApiParam("Identifier of the program.") String programId,@PathParam("pipelineId") @ApiParam("Identifier of the pipeline") String pipelineId,@PathParam("executionId") @ApiParam("Identifier of the execution") String executionId,@PathParam("phaseId") @ApiParam("Identifier of the phase") String phaseId,@PathParam("stepId") @ApiParam("Identifier of the step") String stepId,@HeaderParam("x-gw-ims-org-id") @NotNull    @ApiParam("IMS organization ID that the request is being made under.") String xGwImsOrgId,@HeaderParam("Authorization") @NotNull    @ApiParam("Bearer [token] - An access token for the technical account created through integration with Adobe IO") String authorization,@HeaderParam("x-api-key") @NotNull    @ApiParam("IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io") String xApiKey,@HeaderParam("Content-Type") @NotNull    @ApiParam("Must always be application/json") String contentType,@Valid Object body) {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/program/{programId}/environment/{environmentId}")
    @Produces({ "application/json" })
    @ApiOperation(value = "DeleteEnvironment", notes = "Delete environment", response = Environment.class, tags={ "Environments",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Environment deleted", response = Environment.class),
        @ApiResponse(code = 400, message = "Environment deletion in progress", response = BadRequestError.class),
        @ApiResponse(code = 404, message = "Environment not found", response = Void.class)
    })
    public Response deleteEnvironment(@PathParam("programId") @ApiParam("Identifier of the application") String programId,@PathParam("environmentId") @ApiParam("Identifier of the environment") String environmentId,@HeaderParam("x-gw-ims-org-id") @NotNull    @ApiParam("IMS organization ID that the request is being made under.") String xGwImsOrgId,@HeaderParam("Authorization") @NotNull    @ApiParam("Bearer [token] - An access token for the technical account created through integration with Adobe IO") String authorization,@HeaderParam("x-api-key") @NotNull    @ApiParam("IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io") String xApiKey) {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/program/{programId}/pipeline/{pipelineId}")
    @ApiOperation(value = "Delete a Pipeline", notes = "Delete a pipeline. All the data is wiped.", response = Void.class, tags={ "Pipelines",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response deletePipeline(@PathParam("programId") @ApiParam("Identifier of the program") String programId,@PathParam("pipelineId") @ApiParam("Identifier of the pipeline") String pipelineId,@HeaderParam("x-gw-ims-org-id") @NotNull    @ApiParam("IMS organization ID that the request is being made under.") String xGwImsOrgId,@HeaderParam("Authorization") @NotNull    @ApiParam("Bearer [token] - An access token for the technical account created through integration with Adobe IO") String authorization,@HeaderParam("x-api-key") @NotNull    @ApiParam("IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io") String xApiKey) {
        return Response.ok().entity("magic!").build();
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
        @ApiResponse(code = 412, message = "Deletion not supported", response = Void.class)
    })
    public Response deleteProgram(@PathParam("programId") @ApiParam("Identifier of the program") String programId,@HeaderParam("x-gw-ims-org-id") @NotNull    @ApiParam("IMS organization ID that the request is being made under.") String xGwImsOrgId,@HeaderParam("Authorization") @NotNull    @ApiParam("Bearer [token] - An access token for the technical account created through integration with Adobe IO") String authorization,@HeaderParam("x-api-key") @NotNull    @ApiParam("IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io") String xApiKey) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/program/{programId}/environment/{environmentId}/logs/download")
    @Produces({ "application/json" })
    @ApiOperation(value = "Download Logs", notes = "Download environment logs", response = Void.class, tags={ "Environments",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful retrieval of logs", response = Void.class),
        @ApiResponse(code = 400, message = "invalid parameters", response = BadRequestError.class),
        @ApiResponse(code = 404, message = "Environment not found", response = Void.class)
    })
    public Response downloadLogs(@PathParam("programId") @ApiParam("Identifier of the program") String programId,@PathParam("environmentId") @ApiParam("Identifier of the environment") String environmentId,@QueryParam("service") @NotNull   @ApiParam("Name of service")  String service,@QueryParam("name") @NotNull   @ApiParam("Name of log")  String name,@QueryParam("date") @NotNull   @ApiParam("date for which log is required")  String date,@HeaderParam("x-gw-ims-org-id") @NotNull    @ApiParam("IMS organization ID that the request is being made under.") String xGwImsOrgId,@HeaderParam("Authorization") @NotNull    @ApiParam("Bearer [token] - An access token for the technical account created through integration with Adobe IO") String authorization,@HeaderParam("x-api-key") @NotNull    @ApiParam("IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io") String xApiKey,@HeaderParam("Accept")    @ApiParam("Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header.") String accept) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/program/{programId}/repository/{repositoryId}/branches")
    @Produces({ "application/json" })
    @ApiOperation(value = "List Branches", notes = "Returns the list of branches from a repository", response = BranchList.class, tags={ "Branches",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful retrieval of the list of repository branches", response = BranchList.class)
    })
    public Response getBranches(@PathParam("programId") @ApiParam("Identifier of the program.") String programId,@PathParam("repositoryId") @ApiParam("Identifier of the repository") String repositoryId,@HeaderParam("x-gw-ims-org-id") @NotNull    @ApiParam("IMS organization ID that the request is being made under.") String xGwImsOrgId,@HeaderParam("Authorization") @NotNull    @ApiParam("Bearer [token] - An access token for the technical account created through integration with Adobe IO") String authorization,@HeaderParam("x-api-key") @NotNull    @ApiParam("IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io") String xApiKey) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/program/{programId}/pipeline/{pipelineId}/execution")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get current pipeline execution", notes = "Returns current pipeline execution if any.", response = PipelineExecution.class, tags={ "Pipeline Execution",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful retrieval of current execution", response = PipelineExecution.class),
        @ApiResponse(code = 404, message = "No pipeline execution exits or unknown pipeline or program", response = Void.class)
    })
    public Response getCurrentExecution(@PathParam("programId") @ApiParam("Identifier of the program.") String programId,@PathParam("pipelineId") @ApiParam("Identifier of the pipeline") String pipelineId,@HeaderParam("x-gw-ims-org-id") @NotNull    @ApiParam("IMS organization ID that the request is being made under.") String xGwImsOrgId,@HeaderParam("Authorization") @NotNull    @ApiParam("Bearer [token] - An access token for the technical account created through integration with Adobe IO") String authorization,@HeaderParam("x-api-key") @NotNull    @ApiParam("IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io") String xApiKey) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/program/{programId}/environment/{environmentId}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Environment", notes = "Returns an environment by its id", response = Environment.class, tags={ "Environments",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Environment.class)
    })
    public Response getEnvironment(@PathParam("programId") @ApiParam("Identifier of the program") String programId,@PathParam("environmentId") @ApiParam("Identifier of the environment") String environmentId,@HeaderParam("x-gw-ims-org-id") @NotNull    @ApiParam("IMS organization ID that the request is being made under.") String xGwImsOrgId,@HeaderParam("Authorization") @NotNull    @ApiParam("Bearer [token] - An access token for the technical account created through integration with Adobe IO") String authorization,@HeaderParam("x-api-key") @NotNull    @ApiParam("IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io") String xApiKey) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/program/{programId}/environment/{environmentId}/logs")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Environment Logs", notes = "List all logs available in environment", response = EnvironmentLogs.class, tags={ "Environments",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful retrieval of logs for an environment", response = EnvironmentLogs.class),
        @ApiResponse(code = 400, message = "invalid parameters", response = BadRequestError.class),
        @ApiResponse(code = 404, message = "Environment not found", response = Void.class)
    })
    public Response getEnvironmentLogs(@PathParam("programId") @ApiParam("Identifier of the program") String programId,@PathParam("environmentId") @ApiParam("Identifier of the environment") String environmentId,@QueryParam("days") @NotNull   @ApiParam("number of days for which logs are required")  Integer days,@HeaderParam("x-gw-ims-org-id") @NotNull    @ApiParam("IMS organization ID that the request is being made under.") String xGwImsOrgId,@HeaderParam("Authorization") @NotNull    @ApiParam("Bearer [token] - An access token for the technical account created through integration with Adobe IO") String authorization,@HeaderParam("x-api-key") @NotNull    @ApiParam("IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io") String xApiKey,@QueryParam("service")   @ApiParam("Names of services")  List<String> service,@QueryParam("name")   @ApiParam("Names of log")  List<String> name) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/program/{programId}/environment/{environmentId}/variables")
    @Produces({ "application/json" })
    @ApiOperation(value = "List User Environment Variables", notes = "List the user defined variables for an environment (Cloud Service only).", response = VariableList.class, tags={ "Variables",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful retrieval of environment variables", response = VariableList.class),
        @ApiResponse(code = 404, message = "Environment not found", response = Void.class)
    })
    public Response getEnvironmentVariables(@PathParam("programId") @ApiParam("Identifier of the program") String programId,@PathParam("environmentId") @ApiParam("Identifier of the environment") String environmentId,@HeaderParam("x-gw-ims-org-id") @NotNull    @ApiParam("IMS organization ID that the request is being made under.") String xGwImsOrgId,@HeaderParam("Authorization") @NotNull    @ApiParam("Bearer [token] - An access token for the technical account created through integration with Adobe IO") String authorization,@HeaderParam("x-api-key") @NotNull    @ApiParam("IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io") String xApiKey) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/program/{programId}/environments")
    @Produces({ "application/json" })
    @ApiOperation(value = "List Environments", notes = "Lists all environments in an program", response = EnvironmentList.class, tags={ "Environments",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful retrieval of environment list", response = EnvironmentList.class),
        @ApiResponse(code = 404, message = "Program not found", response = Void.class)
    })
    public Response getEnvironments(@PathParam("programId") @ApiParam("Identifier of the program") String programId,@HeaderParam("x-gw-ims-org-id") @NotNull    @ApiParam("IMS organization ID that the request is being made under.") String xGwImsOrgId,@HeaderParam("Authorization") @NotNull    @ApiParam("Bearer [token] - An access token for the technical account created through integration with Adobe IO") String authorization,@HeaderParam("x-api-key") @NotNull    @ApiParam("IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io") String xApiKey,@QueryParam("type")   @ApiParam("Type of the environment")  String type) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/program/{programId}/pipeline/{pipelineId}/execution/{executionId}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get pipeline execution", notes = "Returns a pipeline execution by id", response = PipelineExecution.class, tags={ "Pipeline Execution",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful retrieval of execution", response = PipelineExecution.class),
        @ApiResponse(code = 404, message = "No pipeline execution exits or unknown pipeline or application", response = Void.class)
    })
    public Response getExecution(@PathParam("programId") @ApiParam("Identifier of the program.") String programId,@PathParam("pipelineId") @ApiParam("Identifier of the pipeline") String pipelineId,@PathParam("executionId") @ApiParam("Identifier of the execution") String executionId,@HeaderParam("x-gw-ims-org-id") @NotNull    @ApiParam("IMS organization ID that the request is being made under.") String xGwImsOrgId,@HeaderParam("Authorization") @NotNull    @ApiParam("Bearer [token] - An access token for the technical account created through integration with Adobe IO") String authorization,@HeaderParam("x-api-key") @NotNull    @ApiParam("IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io") String xApiKey) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/program/{programId}/pipeline/{pipelineId}/executions")
    @Produces({ "application/json" })
    @ApiOperation(value = "List Executions", notes = "Returns the history of pipeline executions in a newest to oldest order", response = PipelineExecutionListRepresentation.class, tags={ "Pipeline Execution",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful retrieval of execution history", response = PipelineExecutionListRepresentation.class),
        @ApiResponse(code = 403, message = "Missing permission for user to read executions", response = Void.class),
        @ApiResponse(code = 404, message = "Pipeline does not exist", response = Void.class)
    })
    public Response getExecutions(@PathParam("programId") @ApiParam("Identifier of the program.") String programId,@PathParam("pipelineId") @ApiParam("Identifier of the pipeline") String pipelineId,@HeaderParam("x-gw-ims-org-id") @NotNull    @ApiParam("IMS organization ID that the request is being made under.") String xGwImsOrgId,@HeaderParam("Authorization") @NotNull    @ApiParam("Bearer [token] - An access token for the technical account created through integration with Adobe IO") String authorization,@HeaderParam("x-api-key") @NotNull    @ApiParam("IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io") String xApiKey,@QueryParam("start")   @ApiParam("Pagination start parameter")  String start,@QueryParam("limit")   @ApiParam("Pagination limit parameter")  Integer limit) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/program/{programId}/pipeline/{pipelineId}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Pipeline", notes = "Returns a pipeline by its id", response = Pipeline.class, tags={ "Pipelines",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful retrieval of pipeline", response = Pipeline.class),
        @ApiResponse(code = 404, message = "Pipeline not found", response = Void.class)
    })
    public Response getPipeline(@PathParam("programId") @ApiParam("Identifier of the program") String programId,@PathParam("pipelineId") @ApiParam("Identifier of the pipeline") String pipelineId,@HeaderParam("x-gw-ims-org-id") @NotNull    @ApiParam("IMS organization ID that the request is being made under.") String xGwImsOrgId,@HeaderParam("Authorization") @NotNull    @ApiParam("Bearer [token] - An access token for the technical account created through integration with Adobe IO") String authorization,@HeaderParam("x-api-key") @NotNull    @ApiParam("IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io") String xApiKey) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/program/{programId}/pipelines")
    @Produces({ "application/json" })
    @ApiOperation(value = "List Pipelines", notes = "Returns all the pipelines that the requesting user has access to in an program", response = PipelineList.class, tags={ "Pipelines",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = PipelineList.class)
    })
    public Response getPipelines(@PathParam("programId") @ApiParam("Identifier of the program") String programId,@HeaderParam("x-gw-ims-org-id") @NotNull    @ApiParam("IMS organization ID that the request is being made under.") String xGwImsOrgId,@HeaderParam("Authorization") @NotNull    @ApiParam("Bearer [token] - An access token for the technical account created through integration with Adobe IO") String authorization,@HeaderParam("x-api-key") @NotNull    @ApiParam("IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io") String xApiKey) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/program/{programId}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Program", notes = "Returns a program by its id", response = Program.class, tags={ "Programs",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful retrieval of program", response = Program.class),
        @ApiResponse(code = 404, message = "Program not found", response = Void.class)
    })
    public Response getProgram(@PathParam("programId") @ApiParam("Identifier of the program") String programId,@HeaderParam("x-gw-ims-org-id") @NotNull    @ApiParam("IMS organization ID that the request is being made under.") String xGwImsOrgId,@HeaderParam("Authorization") @NotNull    @ApiParam("Bearer [token] - An access token for the technical account created through integration with Adobe IO") String authorization,@HeaderParam("x-api-key") @NotNull    @ApiParam("IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io") String xApiKey) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/programs")
    @Produces({ "application/json" })
    @ApiOperation(value = "Lists Programs", notes = "Returns all programs that the requesting user has access to", response = ProgramList.class, tags={ "Programs",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ProgramList.class)
    })
    public Response getPrograms(@HeaderParam("x-gw-ims-org-id") @NotNull    @ApiParam("IMS organization ID that the request is being made under.") String xGwImsOrgId,@HeaderParam("Authorization") @NotNull    @ApiParam("Bearer [token] - An access token for the technical account created through integration with Adobe IO") String authorization,@HeaderParam("x-api-key") @NotNull    @ApiParam("IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io") String xApiKey) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/program/{programId}/repositories")
    @Produces({ "application/json" })
    @ApiOperation(value = "Lists Repositories", notes = "Lists all Repositories in an program", response = RepositoryList.class, tags={ "Repositories",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = RepositoryList.class)
    })
    public Response getRepositories(@PathParam("programId") @ApiParam("Identifier of the program") String programId,@HeaderParam("x-gw-ims-org-id") @NotNull    @ApiParam("IMS organization ID that the request is being made under.") String xGwImsOrgId,@HeaderParam("Authorization") @NotNull    @ApiParam("Bearer [token] - An access token for the technical account created through integration with Adobe IO") String authorization,@HeaderParam("x-api-key") @NotNull    @ApiParam("IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io") String xApiKey) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/program/{programId}/repository/{repositoryId}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Repository", notes = "Returns an repository by its id", response = Repository.class, tags={ "Repositories",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Repository.class)
    })
    public Response getRepository(@PathParam("programId") @ApiParam("Identifier of the program") String programId,@PathParam("repositoryId") @ApiParam("Identifier of the repository") String repositoryId,@HeaderParam("x-gw-ims-org-id") @NotNull    @ApiParam("IMS organization ID that the request is being made under.") String xGwImsOrgId,@HeaderParam("Authorization") @NotNull    @ApiParam("Bearer [token] - An access token for the technical account created through integration with Adobe IO") String authorization,@HeaderParam("x-api-key") @NotNull    @ApiParam("IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io") String xApiKey) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/logs")
    @ApiOperation(value = "Get logs", notes = "Get the logs associated with a step.", response = Void.class, tags={ "Pipeline Execution",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful retrieval of logs", response = Void.class),
        @ApiResponse(code = 403, message = "Missing permission for user to read logs", response = Void.class),
        @ApiResponse(code = 404, message = "Pipeline execution does not exist", response = Void.class)
    })
    public Response getStepLogs(@PathParam("programId") @ApiParam("Identifier of the program.") String programId,@PathParam("pipelineId") @ApiParam("Identifier of the pipeline") String pipelineId,@PathParam("executionId") @ApiParam("Identifier of the execution") String executionId,@PathParam("phaseId") @ApiParam("Identifier of the phase") String phaseId,@PathParam("stepId") @ApiParam("Identifier of the step") String stepId,@HeaderParam("x-gw-ims-org-id") @NotNull    @ApiParam("IMS organization ID that the request is being made under.") String xGwImsOrgId,@HeaderParam("Authorization") @NotNull    @ApiParam("Bearer [token] - An access token for the technical account created through integration with Adobe IO") String authorization,@HeaderParam("x-api-key") @NotNull    @ApiParam("IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io") String xApiKey,@QueryParam("file")   @ApiParam("Identifier of the log file")  String file,@HeaderParam("Accept")    @ApiParam("Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header.") String accept) {
        return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/program/{programId}/environment/{environmentId}/variables")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Patch User Environment Variables", notes = "Modify multiple environment variables (Cloud Service only). To delete a variable, include it with an empty value.", response = VariableList.class, tags={ "Variables",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful update of environment variables", response = VariableList.class),
        @ApiResponse(code = 404, message = "Environment not found", response = Void.class)
    })
    public Response patchEnvironmentVariables(@PathParam("programId") @ApiParam("Identifier of the program") String programId,@PathParam("environmentId") @ApiParam("Identifier of the environment") String environmentId,@HeaderParam("x-gw-ims-org-id") @NotNull    @ApiParam("IMS organization ID that the request is being made under.") String xGwImsOrgId,@HeaderParam("Authorization") @NotNull    @ApiParam("Bearer [token] - An access token for the technical account created through integration with Adobe IO") String authorization,@HeaderParam("x-api-key") @NotNull    @ApiParam("IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io") String xApiKey,@HeaderParam("Content-Type") @NotNull    @ApiParam("Must always be application/json") String contentType,@Valid List<Variable> body) {
        return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/program/{programId}/pipeline/{pipelineId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Patches Pipeline", notes = "Patches a pipeline within an program.", response = Pipeline.class, tags={ "Pipelines",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Pipeline.class)
    })
    public Response patchPipeline(@PathParam("programId") @ApiParam("Identifier of the program") String programId,@PathParam("pipelineId") @ApiParam("Identifier of the pipeline") String pipelineId,@HeaderParam("x-gw-ims-org-id") @NotNull    @ApiParam("IMS organization ID that the request is being made under.") String xGwImsOrgId,@HeaderParam("Authorization") @NotNull    @ApiParam("Bearer [token] - An access token for the technical account created through integration with Adobe IO") String authorization,@HeaderParam("x-api-key") @NotNull    @ApiParam("IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io") String xApiKey,@HeaderParam("Content-Type") @NotNull    @ApiParam("Must always be application/json") String contentType,@Valid Pipeline body) {
        return Response.ok().entity("magic!").build();
    }

    @PUT
    @Path("/program/{programId}/pipeline/{pipelineId}/execution")
    @ApiOperation(value = "Start the pipeline", notes = "Starts the Pipeline. This works only if the pipeline is not already started.", response = Void.class, tags={ "Pipeline Execution",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Successful started pipeline execution", response = Void.class),
        @ApiResponse(code = 400, message = "Request conflicts with the expected state of pipeline", response = Void.class),
        @ApiResponse(code = 404, message = "No pipeline execution exits or unknown pipeline or application", response = Void.class),
        @ApiResponse(code = 412, message = "Cannot start execution: programId={programId}, pipelineId={pipelineId} currentExecutionId={executionId}, reason='Execution already in progress.", response = Void.class)
    })
    public Response startPipeline(@PathParam("programId") @ApiParam("Identifier of the program.") String programId,@PathParam("pipelineId") @ApiParam("Identifier of the pipeline") String pipelineId,@HeaderParam("x-gw-ims-org-id") @NotNull    @ApiParam("IMS organization ID that the request is being made under.") String xGwImsOrgId,@HeaderParam("Authorization") @NotNull    @ApiParam("Bearer [token] - An access token for the technical account created through integration with Adobe IO") String authorization,@HeaderParam("x-api-key") @NotNull    @ApiParam("IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io") String xApiKey,@HeaderParam("Content-Type") @NotNull    @ApiParam("Must always be application/json") String contentType) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/metrics")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get step metrics", notes = "", response = PipelineStepMetrics.class, tags={ "Pipeline Execution",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful retrieval of metrics", response = PipelineStepMetrics.class),
        @ApiResponse(code = 403, message = "Missing permission for user to read metrics", response = Void.class),
        @ApiResponse(code = 404, message = "Pipeline execution does not exist", response = Void.class)
    })
    public Response stepMetric(@PathParam("programId") @ApiParam("Identifier of the program.") String programId,@PathParam("pipelineId") @ApiParam("Identifier of the pipeline") String pipelineId,@PathParam("executionId") @ApiParam("Identifier of the execution") String executionId,@PathParam("phaseId") @ApiParam("Identifier of the phase") String phaseId,@PathParam("stepId") @ApiParam("Identifier of the step") String stepId,@HeaderParam("x-gw-ims-org-id") @NotNull    @ApiParam("IMS organization ID that the request is being made under.") String xGwImsOrgId,@HeaderParam("Authorization") @NotNull    @ApiParam("Bearer [token] - An access token for the technical account created through integration with Adobe IO") String authorization,@HeaderParam("x-api-key") @NotNull    @ApiParam("IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io") String xApiKey) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get step state", notes = "", response = PipelineExecutionStepState.class, tags={ "Pipeline Execution" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful retrieval of step state", response = PipelineExecutionStepState.class),
        @ApiResponse(code = 403, message = "Missing permission for user to read step", response = Void.class),
        @ApiResponse(code = 404, message = "Pipeline execution does not exist", response = Void.class)
    })
    public Response stepState(@PathParam("programId") @ApiParam("Identifier of the program.") String programId,@PathParam("pipelineId") @ApiParam("Identifier of the pipeline") String pipelineId,@PathParam("executionId") @ApiParam("Identifier of the execution") String executionId,@PathParam("phaseId") @ApiParam("Identifier of the phase") String phaseId,@PathParam("stepId") @ApiParam("Identifier of the step") String stepId,@HeaderParam("x-gw-ims-org-id") @NotNull    @ApiParam("IMS organization ID that the request is being made under.") String xGwImsOrgId,@HeaderParam("Authorization") @NotNull    @ApiParam("Bearer [token] - An access token for the technical account created through integration with Adobe IO") String authorization,@HeaderParam("x-api-key") @NotNull    @ApiParam("IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io") String xApiKey) {
        return Response.ok().entity("magic!").build();
    }
}
