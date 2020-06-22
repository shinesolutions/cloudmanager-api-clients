package org.openapitools.api;

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

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2020-06-22T02:54:09.173Z[GMT]")
public interface ApiApiService {
      Response advancePipelineExecution(String programId,String pipelineId,String executionId,String phaseId,String stepId,String xGwImsOrgId,String authorization,String xApiKey,String contentType,Object body,SecurityContext securityContext)
      throws NotFoundException;
      Response cancelPipelineExecutionStep(String programId,String pipelineId,String executionId,String phaseId,String stepId,String xGwImsOrgId,String authorization,String xApiKey,String contentType,Object body,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteEnvironment(String programId,String environmentId,String xGwImsOrgId,String authorization,String xApiKey,SecurityContext securityContext)
      throws NotFoundException;
      Response deletePipeline(String programId,String pipelineId,String xGwImsOrgId,String authorization,String xApiKey,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteProgram(String programId,String xGwImsOrgId,String authorization,String xApiKey,SecurityContext securityContext)
      throws NotFoundException;
      Response downloadLogs(String programId,String environmentId,String service,String name,String date,String xGwImsOrgId,String authorization,String xApiKey,String accept,SecurityContext securityContext)
      throws NotFoundException;
      Response getBranches(String programId,String repositoryId,String xGwImsOrgId,String authorization,String xApiKey,SecurityContext securityContext)
      throws NotFoundException;
      Response getCurrentExecution(String programId,String pipelineId,String xGwImsOrgId,String authorization,String xApiKey,SecurityContext securityContext)
      throws NotFoundException;
      Response getEnvironment(String programId,String environmentId,String xGwImsOrgId,String authorization,String xApiKey,SecurityContext securityContext)
      throws NotFoundException;
      Response getEnvironmentLogs(String programId,String environmentId,Integer days,String xGwImsOrgId,String authorization,String xApiKey,List<String> service,List<String> name,SecurityContext securityContext)
      throws NotFoundException;
      Response getEnvironmentVariables(String programId,String environmentId,String xGwImsOrgId,String authorization,String xApiKey,SecurityContext securityContext)
      throws NotFoundException;
      Response getEnvironments(String programId,String xGwImsOrgId,String authorization,String xApiKey,String type,SecurityContext securityContext)
      throws NotFoundException;
      Response getExecution(String programId,String pipelineId,String executionId,String xGwImsOrgId,String authorization,String xApiKey,SecurityContext securityContext)
      throws NotFoundException;
      Response getExecutions(String programId,String pipelineId,String xGwImsOrgId,String authorization,String xApiKey,String start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response getPipeline(String programId,String pipelineId,String xGwImsOrgId,String authorization,String xApiKey,SecurityContext securityContext)
      throws NotFoundException;
      Response getPipelines(String programId,String xGwImsOrgId,String authorization,String xApiKey,SecurityContext securityContext)
      throws NotFoundException;
      Response getProgram(String programId,String xGwImsOrgId,String authorization,String xApiKey,SecurityContext securityContext)
      throws NotFoundException;
      Response getPrograms(String xGwImsOrgId,String authorization,String xApiKey,SecurityContext securityContext)
      throws NotFoundException;
      Response getRepositories(String programId,String xGwImsOrgId,String authorization,String xApiKey,SecurityContext securityContext)
      throws NotFoundException;
      Response getRepository(String programId,String repositoryId,String xGwImsOrgId,String authorization,String xApiKey,SecurityContext securityContext)
      throws NotFoundException;
      Response getStepLogs(String programId,String pipelineId,String executionId,String phaseId,String stepId,String xGwImsOrgId,String authorization,String xApiKey,String file,String accept,SecurityContext securityContext)
      throws NotFoundException;
      Response patchEnvironmentVariables(String programId,String environmentId,String xGwImsOrgId,String authorization,String xApiKey,String contentType,List<Variable> body,SecurityContext securityContext)
      throws NotFoundException;
      Response patchPipeline(String programId,String pipelineId,String xGwImsOrgId,String authorization,String xApiKey,String contentType,Pipeline body,SecurityContext securityContext)
      throws NotFoundException;
      Response startPipeline(String programId,String pipelineId,String xGwImsOrgId,String authorization,String xApiKey,String contentType,SecurityContext securityContext)
      throws NotFoundException;
      Response stepMetric(String programId,String pipelineId,String executionId,String phaseId,String stepId,String xGwImsOrgId,String authorization,String xApiKey,SecurityContext securityContext)
      throws NotFoundException;
      Response stepState(String programId,String pipelineId,String executionId,String phaseId,String stepId,String xGwImsOrgId,String authorization,String xApiKey,SecurityContext securityContext)
      throws NotFoundException;
}
