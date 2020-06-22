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

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-06-22T02:53:20.395Z[GMT]")
public class ApiApiServiceImpl extends ApiApiService {
    @Override
    public Response advancePipelineExecution(String programId
, String pipelineId
, String executionId
, String phaseId
, String stepId
, String xGwImsOrgId
, String authorization
, String xApiKey
, String contentType
, Object body
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response cancelPipelineExecutionStep(String programId
, String pipelineId
, String executionId
, String phaseId
, String stepId
, String xGwImsOrgId
, String authorization
, String xApiKey
, String contentType
, Object body
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response deleteEnvironment(String programId
, String environmentId
, String xGwImsOrgId
, String authorization
, String xApiKey
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response deletePipeline(String programId
, String pipelineId
, String xGwImsOrgId
, String authorization
, String xApiKey
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response deleteProgram(String programId
, String xGwImsOrgId
, String authorization
, String xApiKey
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response downloadLogs(String programId
, String environmentId
, String service
, String name
, String date
, String xGwImsOrgId
, String authorization
, String xApiKey
, String accept
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getBranches(String programId
, String repositoryId
, String xGwImsOrgId
, String authorization
, String xApiKey
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getCurrentExecution(String programId
, String pipelineId
, String xGwImsOrgId
, String authorization
, String xApiKey
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getEnvironment(String programId
, String environmentId
, String xGwImsOrgId
, String authorization
, String xApiKey
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getEnvironmentLogs(String programId
, String environmentId
, Integer days
, String xGwImsOrgId
, String authorization
, String xApiKey
, List<String> service
, List<String> name
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getEnvironmentVariables(String programId
, String environmentId
, String xGwImsOrgId
, String authorization
, String xApiKey
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getEnvironments(String programId
, String xGwImsOrgId
, String authorization
, String xApiKey
, String type
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getExecution(String programId
, String pipelineId
, String executionId
, String xGwImsOrgId
, String authorization
, String xApiKey
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getExecutions(String programId
, String pipelineId
, String xGwImsOrgId
, String authorization
, String xApiKey
, String start
, Integer limit
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getPipeline(String programId
, String pipelineId
, String xGwImsOrgId
, String authorization
, String xApiKey
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getPipelines(String programId
, String xGwImsOrgId
, String authorization
, String xApiKey
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getProgram(String programId
, String xGwImsOrgId
, String authorization
, String xApiKey
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getPrograms(String xGwImsOrgId
, String authorization
, String xApiKey
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getRepositories(String programId
, String xGwImsOrgId
, String authorization
, String xApiKey
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getRepository(String programId
, String repositoryId
, String xGwImsOrgId
, String authorization
, String xApiKey
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getStepLogs(String programId
, String pipelineId
, String executionId
, String phaseId
, String stepId
, String xGwImsOrgId
, String authorization
, String xApiKey
, String file
, String accept
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response patchEnvironmentVariables(String programId
, String environmentId
, String xGwImsOrgId
, String authorization
, String xApiKey
, String contentType
, List<Variable> body
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response patchPipeline(String programId
, String pipelineId
, String xGwImsOrgId
, String authorization
, String xApiKey
, String contentType
, Pipeline body
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response startPipeline(String programId
, String pipelineId
, String xGwImsOrgId
, String authorization
, String xApiKey
, String contentType
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response stepMetric(String programId
, String pipelineId
, String executionId
, String phaseId
, String stepId
, String xGwImsOrgId
, String authorization
, String xApiKey
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response stepState(String programId
, String pipelineId
, String executionId
, String phaseId
, String stepId
, String xGwImsOrgId
, String authorization
, String xApiKey
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
