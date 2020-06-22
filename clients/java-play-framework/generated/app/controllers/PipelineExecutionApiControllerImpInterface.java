package controllers;

import apimodels.PipelineExecution;
import apimodels.PipelineExecutionListRepresentation;
import apimodels.PipelineExecutionStepState;
import apimodels.PipelineStepMetrics;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public interface PipelineExecutionApiControllerImpInterface {
    void advancePipelineExecution(String programId, String pipelineId, String executionId, String phaseId, String stepId, String xGwImsOrgId, String authorization, String xApiKey, String contentType, Object body) throws Exception;

    void cancelPipelineExecutionStep(String programId, String pipelineId, String executionId, String phaseId, String stepId, String xGwImsOrgId, String authorization, String xApiKey, String contentType, Object body) throws Exception;

    PipelineExecution getCurrentExecution(String programId, String pipelineId, String xGwImsOrgId, String authorization, String xApiKey) throws Exception;

    PipelineExecution getExecution(String programId, String pipelineId, String executionId, String xGwImsOrgId, String authorization, String xApiKey) throws Exception;

    PipelineExecutionListRepresentation getExecutions(String programId, String pipelineId, String xGwImsOrgId, String authorization, String xApiKey, String start, Integer limit) throws Exception;

    void getStepLogs(String programId, String pipelineId, String executionId, String phaseId, String stepId, String xGwImsOrgId, String authorization, String xApiKey, String file, String accept) throws Exception;

    void startPipeline(String programId, String pipelineId, String xGwImsOrgId, String authorization, String xApiKey, String contentType) throws Exception;

    PipelineStepMetrics stepMetric(String programId, String pipelineId, String executionId, String phaseId, String stepId, String xGwImsOrgId, String authorization, String xApiKey) throws Exception;

    PipelineExecutionStepState stepState(String programId, String pipelineId, String executionId, String phaseId, String stepId, String xGwImsOrgId, String authorization, String xApiKey) throws Exception;

}
