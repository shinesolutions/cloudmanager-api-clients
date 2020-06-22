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

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-06-22T02:54:15.715Z[GMT]")
public class ApiApiServiceImpl implements ApiApi {
      public Response advancePipelineExecution(String programId,String pipelineId,String executionId,String phaseId,String stepId,String xGwImsOrgId,String authorization,String xApiKey,String contentType,Object body,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response cancelPipelineExecutionStep(String programId,String pipelineId,String executionId,String phaseId,String stepId,String xGwImsOrgId,String authorization,String xApiKey,String contentType,Object body,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response deleteEnvironment(String programId,String environmentId,String xGwImsOrgId,String authorization,String xApiKey,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response deletePipeline(String programId,String pipelineId,String xGwImsOrgId,String authorization,String xApiKey,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response deleteProgram(String programId,String xGwImsOrgId,String authorization,String xApiKey,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response downloadLogs(String programId,String environmentId,String service,String name,String date,String xGwImsOrgId,String authorization,String xApiKey,String accept,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getBranches(String programId,String repositoryId,String xGwImsOrgId,String authorization,String xApiKey,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getCurrentExecution(String programId,String pipelineId,String xGwImsOrgId,String authorization,String xApiKey,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getEnvironment(String programId,String environmentId,String xGwImsOrgId,String authorization,String xApiKey,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getEnvironmentLogs(String programId,String environmentId,Integer days,String xGwImsOrgId,String authorization,String xApiKey,List<String> service,List<String> name,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getEnvironmentVariables(String programId,String environmentId,String xGwImsOrgId,String authorization,String xApiKey,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getEnvironments(String programId,String xGwImsOrgId,String authorization,String xApiKey,String type,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getExecution(String programId,String pipelineId,String executionId,String xGwImsOrgId,String authorization,String xApiKey,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getExecutions(String programId,String pipelineId,String xGwImsOrgId,String authorization,String xApiKey,String start,Integer limit,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getPipeline(String programId,String pipelineId,String xGwImsOrgId,String authorization,String xApiKey,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getPipelines(String programId,String xGwImsOrgId,String authorization,String xApiKey,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getProgram(String programId,String xGwImsOrgId,String authorization,String xApiKey,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getPrograms(String xGwImsOrgId,String authorization,String xApiKey,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getRepositories(String programId,String xGwImsOrgId,String authorization,String xApiKey,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getRepository(String programId,String repositoryId,String xGwImsOrgId,String authorization,String xApiKey,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getStepLogs(String programId,String pipelineId,String executionId,String phaseId,String stepId,String xGwImsOrgId,String authorization,String xApiKey,String file,String accept,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response patchEnvironmentVariables(String programId,String environmentId,String xGwImsOrgId,String authorization,String xApiKey,String contentType,List<Variable> body,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response patchPipeline(String programId,String pipelineId,String xGwImsOrgId,String authorization,String xApiKey,String contentType,Pipeline body,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response startPipeline(String programId,String pipelineId,String xGwImsOrgId,String authorization,String xApiKey,String contentType,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response stepMetric(String programId,String pipelineId,String executionId,String phaseId,String stepId,String xGwImsOrgId,String authorization,String xApiKey,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response stepState(String programId,String pipelineId,String executionId,String phaseId,String stepId,String xGwImsOrgId,String authorization,String xApiKey,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
