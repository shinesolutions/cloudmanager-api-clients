package org.openapitools.api;

import org.openapitools.model.PipelineExecution;
import org.openapitools.model.PipelineExecutionListRepresentation;
import org.openapitools.model.PipelineExecutionStepState;
import org.openapitools.model.PipelineStepMetrics;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Cloud Manager API
 *
 * <p>This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface PipelineExecutionApi  {

    /**
     * Advance
     *
     * Post to this url in order to advance the current pipeline execution, if paused and waiting for user interaction. Link is present in output only in that case. The input depends on the actual reason for which the pipeline execution stopped.
     *
     */
    @PUT
    @Path("/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/advance")
    @Consumes({ "application/json" })
    @ApiOperation(value = "Advance", tags={ "Pipeline Execution",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 202, message = "Successful resume of pipeline execution"),
        @ApiResponse(code = 403, message = "Missing permission for user to advance the pipeline execution"),
        @ApiResponse(code = 404, message = "No pipeline execution exits or unknown pipeline or program") })
    public void advancePipelineExecution(@PathParam("programId") String programId, @PathParam("pipelineId") String pipelineId, @PathParam("executionId") String executionId, @PathParam("phaseId") String phaseId, @PathParam("stepId") String stepId, @HeaderParam("x-gw-ims-org-id")  @NotNull  String xGwImsOrgId, @HeaderParam("Authorization")  @NotNull  String authorization, @HeaderParam("x-api-key")  @NotNull  String xApiKey, @HeaderParam("Content-Type")  @NotNull  String contentType, @Valid Object body);

    /**
     * Cancel
     *
     * Post to this url in order to cancel the current pipeline execution. Link is present in output only in that case.
     *
     */
    @PUT
    @Path("/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/cancel")
    @Consumes({ "application/json" })
    @ApiOperation(value = "Cancel", tags={ "Pipeline Execution",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 202, message = "Successful cancel of pipeline execution"),
        @ApiResponse(code = 403, message = "Missing permission for user to cancel the current pipeline execution"),
        @ApiResponse(code = 404, message = "No pipeline execution exits or unknown pipeline or program") })
    public void cancelPipelineExecutionStep(@PathParam("programId") String programId, @PathParam("pipelineId") String pipelineId, @PathParam("executionId") String executionId, @PathParam("phaseId") String phaseId, @PathParam("stepId") String stepId, @HeaderParam("x-gw-ims-org-id")  @NotNull  String xGwImsOrgId, @HeaderParam("Authorization")  @NotNull  String authorization, @HeaderParam("x-api-key")  @NotNull  String xApiKey, @HeaderParam("Content-Type")  @NotNull  String contentType, @Valid Object body);

    /**
     * Get current pipeline execution
     *
     * Returns current pipeline execution if any.
     *
     */
    @GET
    @Path("/api/program/{programId}/pipeline/{pipelineId}/execution")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get current pipeline execution", tags={ "Pipeline Execution",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful retrieval of current execution", response = PipelineExecution.class),
        @ApiResponse(code = 404, message = "No pipeline execution exits or unknown pipeline or program") })
    public PipelineExecution getCurrentExecution(@PathParam("programId") String programId, @PathParam("pipelineId") String pipelineId, @HeaderParam("x-gw-ims-org-id")  @NotNull  String xGwImsOrgId, @HeaderParam("Authorization")  @NotNull  String authorization, @HeaderParam("x-api-key")  @NotNull  String xApiKey);

    /**
     * Get pipeline execution
     *
     * Returns a pipeline execution by id
     *
     */
    @GET
    @Path("/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get pipeline execution", tags={ "Pipeline Execution",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful retrieval of execution", response = PipelineExecution.class),
        @ApiResponse(code = 404, message = "No pipeline execution exits or unknown pipeline or application") })
    public PipelineExecution getExecution(@PathParam("programId") String programId, @PathParam("pipelineId") String pipelineId, @PathParam("executionId") String executionId, @HeaderParam("x-gw-ims-org-id")  @NotNull  String xGwImsOrgId, @HeaderParam("Authorization")  @NotNull  String authorization, @HeaderParam("x-api-key")  @NotNull  String xApiKey);

    /**
     * List Executions
     *
     * Returns the history of pipeline executions in a newest to oldest order
     *
     */
    @GET
    @Path("/api/program/{programId}/pipeline/{pipelineId}/executions")
    @Produces({ "application/json" })
    @ApiOperation(value = "List Executions", tags={ "Pipeline Execution",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful retrieval of execution history", response = PipelineExecutionListRepresentation.class),
        @ApiResponse(code = 403, message = "Missing permission for user to read executions"),
        @ApiResponse(code = 404, message = "Pipeline does not exist") })
    public PipelineExecutionListRepresentation getExecutions(@PathParam("programId") String programId, @PathParam("pipelineId") String pipelineId, @HeaderParam("x-gw-ims-org-id")  @NotNull  String xGwImsOrgId, @HeaderParam("Authorization")  @NotNull  String authorization, @HeaderParam("x-api-key")  @NotNull  String xApiKey, @QueryParam("start")  String start, @QueryParam("limit")  Integer limit);

    /**
     * Get logs
     *
     * Get the logs associated with a step.
     *
     */
    @GET
    @Path("/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/logs")
    @ApiOperation(value = "Get logs", tags={ "Pipeline Execution",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful retrieval of logs"),
        @ApiResponse(code = 403, message = "Missing permission for user to read logs"),
        @ApiResponse(code = 404, message = "Pipeline execution does not exist") })
    public void getStepLogs(@PathParam("programId") String programId, @PathParam("pipelineId") String pipelineId, @PathParam("executionId") String executionId, @PathParam("phaseId") String phaseId, @PathParam("stepId") String stepId, @HeaderParam("x-gw-ims-org-id")  @NotNull  String xGwImsOrgId, @HeaderParam("Authorization")  @NotNull  String authorization, @HeaderParam("x-api-key")  @NotNull  String xApiKey, @QueryParam("file")  String file, @HeaderParam("Accept")   String accept);

    /**
     * Start the pipeline
     *
     * Starts the Pipeline. This works only if the pipeline is not already started.
     *
     */
    @PUT
    @Path("/api/program/{programId}/pipeline/{pipelineId}/execution")
    @ApiOperation(value = "Start the pipeline", tags={ "Pipeline Execution",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Successful started pipeline execution"),
        @ApiResponse(code = 400, message = "Request conflicts with the expected state of pipeline"),
        @ApiResponse(code = 404, message = "No pipeline execution exits or unknown pipeline or application"),
        @ApiResponse(code = 412, message = "Cannot start execution: programId={programId}, pipelineId={pipelineId} currentExecutionId={executionId}, reason='Execution already in progress.") })
    public void startPipeline(@PathParam("programId") String programId, @PathParam("pipelineId") String pipelineId, @HeaderParam("x-gw-ims-org-id")  @NotNull  String xGwImsOrgId, @HeaderParam("Authorization")  @NotNull  String authorization, @HeaderParam("x-api-key")  @NotNull  String xApiKey, @HeaderParam("Content-Type")  @NotNull  String contentType);

    /**
     * Get step metrics
     *
     */
    @GET
    @Path("/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/metrics")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get step metrics", tags={ "Pipeline Execution",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful retrieval of metrics", response = PipelineStepMetrics.class),
        @ApiResponse(code = 403, message = "Missing permission for user to read metrics"),
        @ApiResponse(code = 404, message = "Pipeline execution does not exist") })
    public PipelineStepMetrics stepMetric(@PathParam("programId") String programId, @PathParam("pipelineId") String pipelineId, @PathParam("executionId") String executionId, @PathParam("phaseId") String phaseId, @PathParam("stepId") String stepId, @HeaderParam("x-gw-ims-org-id")  @NotNull  String xGwImsOrgId, @HeaderParam("Authorization")  @NotNull  String authorization, @HeaderParam("x-api-key")  @NotNull  String xApiKey);

    /**
     * Get step state
     *
     */
    @GET
    @Path("/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get step state", tags={ "Pipeline Execution" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful retrieval of step state", response = PipelineExecutionStepState.class),
        @ApiResponse(code = 403, message = "Missing permission for user to read step"),
        @ApiResponse(code = 404, message = "Pipeline execution does not exist") })
    public PipelineExecutionStepState stepState(@PathParam("programId") String programId, @PathParam("pipelineId") String pipelineId, @PathParam("executionId") String executionId, @PathParam("phaseId") String phaseId, @PathParam("stepId") String stepId, @HeaderParam("x-gw-ims-org-id")  @NotNull  String xGwImsOrgId, @HeaderParam("Authorization")  @NotNull  String authorization, @HeaderParam("x-api-key")  @NotNull  String xApiKey);
}

