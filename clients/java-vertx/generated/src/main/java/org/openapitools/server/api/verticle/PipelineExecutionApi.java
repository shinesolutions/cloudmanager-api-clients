package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.PipelineExecution;
import org.openapitools.server.api.model.PipelineExecutionListRepresentation;
import org.openapitools.server.api.model.PipelineExecutionStepState;
import org.openapitools.server.api.model.PipelineStepMetrics;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface PipelineExecutionApi  {
    //advancePipelineExecution
    void advancePipelineExecution(String programId, String pipelineId, String executionId, String phaseId, String stepId, String xGwImsOrgId, String authorization, String xApiKey, String contentType, Object body, Handler<AsyncResult<Void>> handler);
    
    //cancelPipelineExecutionStep
    void cancelPipelineExecutionStep(String programId, String pipelineId, String executionId, String phaseId, String stepId, String xGwImsOrgId, String authorization, String xApiKey, String contentType, Object body, Handler<AsyncResult<Void>> handler);
    
    //getCurrentExecution
    void getCurrentExecution(String programId, String pipelineId, String xGwImsOrgId, String authorization, String xApiKey, Handler<AsyncResult<PipelineExecution>> handler);
    
    //getExecution
    void getExecution(String programId, String pipelineId, String executionId, String xGwImsOrgId, String authorization, String xApiKey, Handler<AsyncResult<PipelineExecution>> handler);
    
    //getExecutions
    void getExecutions(String programId, String pipelineId, String xGwImsOrgId, String authorization, String xApiKey, String start, Integer limit, Handler<AsyncResult<PipelineExecutionListRepresentation>> handler);
    
    //getStepLogs
    void getStepLogs(String programId, String pipelineId, String executionId, String phaseId, String stepId, String xGwImsOrgId, String authorization, String xApiKey, String file, String accept, Handler<AsyncResult<Void>> handler);
    
    //startPipeline
    void startPipeline(String programId, String pipelineId, String xGwImsOrgId, String authorization, String xApiKey, String contentType, Handler<AsyncResult<Void>> handler);
    
    //stepMetric
    void stepMetric(String programId, String pipelineId, String executionId, String phaseId, String stepId, String xGwImsOrgId, String authorization, String xApiKey, Handler<AsyncResult<PipelineStepMetrics>> handler);
    
    //stepState
    void stepState(String programId, String pipelineId, String executionId, String phaseId, String stepId, String xGwImsOrgId, String authorization, String xApiKey, Handler<AsyncResult<PipelineExecutionStepState>> handler);
    
}
