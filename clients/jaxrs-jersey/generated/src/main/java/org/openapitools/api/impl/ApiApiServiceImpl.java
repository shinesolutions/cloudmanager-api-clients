package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;

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
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-06-22T02:54:02.008Z[GMT]")
public class ApiApiServiceImpl extends ApiApiService {
    @Override
    public Response advancePipelineExecution(String programId, String pipelineId, String executionId, String phaseId, String stepId,  @NotNull String xGwImsOrgId,  @NotNull String authorization,  @NotNull String xApiKey,  @NotNull String contentType, Object body, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response cancelPipelineExecutionStep(String programId, String pipelineId, String executionId, String phaseId, String stepId,  @NotNull String xGwImsOrgId,  @NotNull String authorization,  @NotNull String xApiKey,  @NotNull String contentType, Object body, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response deleteEnvironment(String programId, String environmentId,  @NotNull String xGwImsOrgId,  @NotNull String authorization,  @NotNull String xApiKey, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response deletePipeline(String programId, String pipelineId,  @NotNull String xGwImsOrgId,  @NotNull String authorization,  @NotNull String xApiKey, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response deleteProgram(String programId,  @NotNull String xGwImsOrgId,  @NotNull String authorization,  @NotNull String xApiKey, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response downloadLogs(String programId, String environmentId,  @NotNull String service,  @NotNull String name,  @NotNull String date,  @NotNull String xGwImsOrgId,  @NotNull String authorization,  @NotNull String xApiKey, String accept, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getBranches(String programId, String repositoryId,  @NotNull String xGwImsOrgId,  @NotNull String authorization,  @NotNull String xApiKey, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getCurrentExecution(String programId, String pipelineId,  @NotNull String xGwImsOrgId,  @NotNull String authorization,  @NotNull String xApiKey, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getEnvironment(String programId, String environmentId,  @NotNull String xGwImsOrgId,  @NotNull String authorization,  @NotNull String xApiKey, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getEnvironmentLogs(String programId, String environmentId,  @NotNull Integer days,  @NotNull String xGwImsOrgId,  @NotNull String authorization,  @NotNull String xApiKey, List<String> service, List<String> name, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getEnvironmentVariables(String programId, String environmentId,  @NotNull String xGwImsOrgId,  @NotNull String authorization,  @NotNull String xApiKey, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getEnvironments(String programId,  @NotNull String xGwImsOrgId,  @NotNull String authorization,  @NotNull String xApiKey, String type, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getExecution(String programId, String pipelineId, String executionId,  @NotNull String xGwImsOrgId,  @NotNull String authorization,  @NotNull String xApiKey, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getExecutions(String programId, String pipelineId,  @NotNull String xGwImsOrgId,  @NotNull String authorization,  @NotNull String xApiKey, String start, Integer limit, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getPipeline(String programId, String pipelineId,  @NotNull String xGwImsOrgId,  @NotNull String authorization,  @NotNull String xApiKey, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getPipelines(String programId,  @NotNull String xGwImsOrgId,  @NotNull String authorization,  @NotNull String xApiKey, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getProgram(String programId,  @NotNull String xGwImsOrgId,  @NotNull String authorization,  @NotNull String xApiKey, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getPrograms( @NotNull String xGwImsOrgId,  @NotNull String authorization,  @NotNull String xApiKey, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getRepositories(String programId,  @NotNull String xGwImsOrgId,  @NotNull String authorization,  @NotNull String xApiKey, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getRepository(String programId, String repositoryId,  @NotNull String xGwImsOrgId,  @NotNull String authorization,  @NotNull String xApiKey, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getStepLogs(String programId, String pipelineId, String executionId, String phaseId, String stepId,  @NotNull String xGwImsOrgId,  @NotNull String authorization,  @NotNull String xApiKey, String file, String accept, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response patchEnvironmentVariables(String programId, String environmentId,  @NotNull String xGwImsOrgId,  @NotNull String authorization,  @NotNull String xApiKey,  @NotNull String contentType, List<Variable> body, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response patchPipeline(String programId, String pipelineId,  @NotNull String xGwImsOrgId,  @NotNull String authorization,  @NotNull String xApiKey,  @NotNull String contentType, Pipeline body, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response startPipeline(String programId, String pipelineId,  @NotNull String xGwImsOrgId,  @NotNull String authorization,  @NotNull String xApiKey,  @NotNull String contentType, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response stepMetric(String programId, String pipelineId, String executionId, String phaseId, String stepId,  @NotNull String xGwImsOrgId,  @NotNull String authorization,  @NotNull String xApiKey, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response stepState(String programId, String pipelineId, String executionId, String phaseId, String stepId,  @NotNull String xGwImsOrgId,  @NotNull String authorization,  @NotNull String xApiKey, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
