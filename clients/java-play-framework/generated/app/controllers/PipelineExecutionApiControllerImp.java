package controllers;

import apimodels.PipelineExecution;
import apimodels.PipelineExecutionListRepresentation;
import apimodels.PipelineExecutionStepState;
import apimodels.PipelineStepMetrics;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-22T02:53:34.661Z[GMT]")

public class PipelineExecutionApiControllerImp implements PipelineExecutionApiControllerImpInterface {
    @Override
    public void advancePipelineExecution(String programId, String pipelineId, String executionId, String phaseId, String stepId, String xGwImsOrgId, String authorization, String xApiKey, String contentType, Object body) throws Exception {
        //Do your magic!!!
    }

    @Override
    public void cancelPipelineExecutionStep(String programId, String pipelineId, String executionId, String phaseId, String stepId, String xGwImsOrgId, String authorization, String xApiKey, String contentType, Object body) throws Exception {
        //Do your magic!!!
    }

    @Override
    public PipelineExecution getCurrentExecution(String programId, String pipelineId, String xGwImsOrgId, String authorization, String xApiKey) throws Exception {
        //Do your magic!!!
        return new PipelineExecution();
    }

    @Override
    public PipelineExecution getExecution(String programId, String pipelineId, String executionId, String xGwImsOrgId, String authorization, String xApiKey) throws Exception {
        //Do your magic!!!
        return new PipelineExecution();
    }

    @Override
    public PipelineExecutionListRepresentation getExecutions(String programId, String pipelineId, String xGwImsOrgId, String authorization, String xApiKey, String start, Integer limit) throws Exception {
        //Do your magic!!!
        return new PipelineExecutionListRepresentation();
    }

    @Override
    public void getStepLogs(String programId, String pipelineId, String executionId, String phaseId, String stepId, String xGwImsOrgId, String authorization, String xApiKey, String file, String accept) throws Exception {
        //Do your magic!!!
    }

    @Override
    public void startPipeline(String programId, String pipelineId, String xGwImsOrgId, String authorization, String xApiKey, String contentType) throws Exception {
        //Do your magic!!!
    }

    @Override
    public PipelineStepMetrics stepMetric(String programId, String pipelineId, String executionId, String phaseId, String stepId, String xGwImsOrgId, String authorization, String xApiKey) throws Exception {
        //Do your magic!!!
        return new PipelineStepMetrics();
    }

    @Override
    public PipelineExecutionStepState stepState(String programId, String pipelineId, String executionId, String phaseId, String stepId, String xGwImsOrgId, String authorization, String xApiKey) throws Exception {
        //Do your magic!!!
        return new PipelineExecutionStepState();
    }

}
