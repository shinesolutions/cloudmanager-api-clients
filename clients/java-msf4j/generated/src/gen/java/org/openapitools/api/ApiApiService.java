package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

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

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-06-22T02:53:20.395Z[GMT]")
public abstract class ApiApiService {
    public abstract Response advancePipelineExecution(String programId
 ,String pipelineId
 ,String executionId
 ,String phaseId
 ,String stepId
 ,String xGwImsOrgId
 ,String authorization
 ,String xApiKey
 ,String contentType
 ,Object body
 ) throws NotFoundException;
    public abstract Response cancelPipelineExecutionStep(String programId
 ,String pipelineId
 ,String executionId
 ,String phaseId
 ,String stepId
 ,String xGwImsOrgId
 ,String authorization
 ,String xApiKey
 ,String contentType
 ,Object body
 ) throws NotFoundException;
    public abstract Response deleteEnvironment(String programId
 ,String environmentId
 ,String xGwImsOrgId
 ,String authorization
 ,String xApiKey
 ) throws NotFoundException;
    public abstract Response deletePipeline(String programId
 ,String pipelineId
 ,String xGwImsOrgId
 ,String authorization
 ,String xApiKey
 ) throws NotFoundException;
    public abstract Response deleteProgram(String programId
 ,String xGwImsOrgId
 ,String authorization
 ,String xApiKey
 ) throws NotFoundException;
    public abstract Response downloadLogs(String programId
 ,String environmentId
 ,String service
 ,String name
 ,String date
 ,String xGwImsOrgId
 ,String authorization
 ,String xApiKey
 ,String accept
 ) throws NotFoundException;
    public abstract Response getBranches(String programId
 ,String repositoryId
 ,String xGwImsOrgId
 ,String authorization
 ,String xApiKey
 ) throws NotFoundException;
    public abstract Response getCurrentExecution(String programId
 ,String pipelineId
 ,String xGwImsOrgId
 ,String authorization
 ,String xApiKey
 ) throws NotFoundException;
    public abstract Response getEnvironment(String programId
 ,String environmentId
 ,String xGwImsOrgId
 ,String authorization
 ,String xApiKey
 ) throws NotFoundException;
    public abstract Response getEnvironmentLogs(String programId
 ,String environmentId
 ,Integer days
 ,String xGwImsOrgId
 ,String authorization
 ,String xApiKey
 ,List<String> service
 ,List<String> name
 ) throws NotFoundException;
    public abstract Response getEnvironmentVariables(String programId
 ,String environmentId
 ,String xGwImsOrgId
 ,String authorization
 ,String xApiKey
 ) throws NotFoundException;
    public abstract Response getEnvironments(String programId
 ,String xGwImsOrgId
 ,String authorization
 ,String xApiKey
 ,String type
 ) throws NotFoundException;
    public abstract Response getExecution(String programId
 ,String pipelineId
 ,String executionId
 ,String xGwImsOrgId
 ,String authorization
 ,String xApiKey
 ) throws NotFoundException;
    public abstract Response getExecutions(String programId
 ,String pipelineId
 ,String xGwImsOrgId
 ,String authorization
 ,String xApiKey
 ,String start
 ,Integer limit
 ) throws NotFoundException;
    public abstract Response getPipeline(String programId
 ,String pipelineId
 ,String xGwImsOrgId
 ,String authorization
 ,String xApiKey
 ) throws NotFoundException;
    public abstract Response getPipelines(String programId
 ,String xGwImsOrgId
 ,String authorization
 ,String xApiKey
 ) throws NotFoundException;
    public abstract Response getProgram(String programId
 ,String xGwImsOrgId
 ,String authorization
 ,String xApiKey
 ) throws NotFoundException;
    public abstract Response getPrograms(String xGwImsOrgId
 ,String authorization
 ,String xApiKey
 ) throws NotFoundException;
    public abstract Response getRepositories(String programId
 ,String xGwImsOrgId
 ,String authorization
 ,String xApiKey
 ) throws NotFoundException;
    public abstract Response getRepository(String programId
 ,String repositoryId
 ,String xGwImsOrgId
 ,String authorization
 ,String xApiKey
 ) throws NotFoundException;
    public abstract Response getStepLogs(String programId
 ,String pipelineId
 ,String executionId
 ,String phaseId
 ,String stepId
 ,String xGwImsOrgId
 ,String authorization
 ,String xApiKey
 ,String file
 ,String accept
 ) throws NotFoundException;
    public abstract Response patchEnvironmentVariables(String programId
 ,String environmentId
 ,String xGwImsOrgId
 ,String authorization
 ,String xApiKey
 ,String contentType
 ,List<Variable> body
 ) throws NotFoundException;
    public abstract Response patchPipeline(String programId
 ,String pipelineId
 ,String xGwImsOrgId
 ,String authorization
 ,String xApiKey
 ,String contentType
 ,Pipeline body
 ) throws NotFoundException;
    public abstract Response startPipeline(String programId
 ,String pipelineId
 ,String xGwImsOrgId
 ,String authorization
 ,String xApiKey
 ,String contentType
 ) throws NotFoundException;
    public abstract Response stepMetric(String programId
 ,String pipelineId
 ,String executionId
 ,String phaseId
 ,String stepId
 ,String xGwImsOrgId
 ,String authorization
 ,String xApiKey
 ) throws NotFoundException;
    public abstract Response stepState(String programId
 ,String pipelineId
 ,String executionId
 ,String phaseId
 ,String stepId
 ,String xGwImsOrgId
 ,String authorization
 ,String xApiKey
 ) throws NotFoundException;
}
