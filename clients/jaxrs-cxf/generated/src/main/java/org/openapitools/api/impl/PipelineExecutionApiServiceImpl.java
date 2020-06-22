package org.openapitools.api.impl;

import org.openapitools.api.*;
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
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

/**
 * Cloud Manager API
 *
 * <p>This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
 *
 */
public class PipelineExecutionApiServiceImpl implements PipelineExecutionApi {
    /**
     * Advance
     *
     * Post to this url in order to advance the current pipeline execution, if paused and waiting for user interaction. Link is present in output only in that case. The input depends on the actual reason for which the pipeline execution stopped.
     *
     */
    public void advancePipelineExecution(String programId, String pipelineId, String executionId, String phaseId, String stepId, String xGwImsOrgId, String authorization, String xApiKey, String contentType, Object body) {
        // TODO: Implement...
        
        
    }
    
    /**
     * Cancel
     *
     * Post to this url in order to cancel the current pipeline execution. Link is present in output only in that case.
     *
     */
    public void cancelPipelineExecutionStep(String programId, String pipelineId, String executionId, String phaseId, String stepId, String xGwImsOrgId, String authorization, String xApiKey, String contentType, Object body) {
        // TODO: Implement...
        
        
    }
    
    /**
     * Get current pipeline execution
     *
     * Returns current pipeline execution if any.
     *
     */
    public PipelineExecution getCurrentExecution(String programId, String pipelineId, String xGwImsOrgId, String authorization, String xApiKey) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Get pipeline execution
     *
     * Returns a pipeline execution by id
     *
     */
    public PipelineExecution getExecution(String programId, String pipelineId, String executionId, String xGwImsOrgId, String authorization, String xApiKey) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * List Executions
     *
     * Returns the history of pipeline executions in a newest to oldest order
     *
     */
    public PipelineExecutionListRepresentation getExecutions(String programId, String pipelineId, String xGwImsOrgId, String authorization, String xApiKey, String start, Integer limit) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Get logs
     *
     * Get the logs associated with a step.
     *
     */
    public void getStepLogs(String programId, String pipelineId, String executionId, String phaseId, String stepId, String xGwImsOrgId, String authorization, String xApiKey, String file, String accept) {
        // TODO: Implement...
        
        
    }
    
    /**
     * Start the pipeline
     *
     * Starts the Pipeline. This works only if the pipeline is not already started.
     *
     */
    public void startPipeline(String programId, String pipelineId, String xGwImsOrgId, String authorization, String xApiKey, String contentType) {
        // TODO: Implement...
        
        
    }
    
    /**
     * Get step metrics
     *
     */
    public PipelineStepMetrics stepMetric(String programId, String pipelineId, String executionId, String phaseId, String stepId, String xGwImsOrgId, String authorization, String xApiKey) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Get step state
     *
     */
    public PipelineExecutionStepState stepState(String programId, String pipelineId, String executionId, String phaseId, String stepId, String xGwImsOrgId, String authorization, String xApiKey) {
        // TODO: Implement...
        
        return null;
    }
    
}

