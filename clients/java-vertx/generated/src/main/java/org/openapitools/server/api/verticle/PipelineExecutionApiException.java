package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.PipelineExecution;
import org.openapitools.server.api.model.PipelineExecutionListRepresentation;
import org.openapitools.server.api.model.PipelineExecutionStepState;
import org.openapitools.server.api.model.PipelineStepMetrics;

public final class PipelineExecutionApiException extends MainApiException {
    public PipelineExecutionApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    public static final PipelineExecutionApiException PipelineExecution_advancePipelineExecution_403_Exception = new PipelineExecutionApiException(403, "Missing permission for user to advance the pipeline execution");
    public static final PipelineExecutionApiException PipelineExecution_advancePipelineExecution_404_Exception = new PipelineExecutionApiException(404, "No pipeline execution exits or unknown pipeline or program");
    public static final PipelineExecutionApiException PipelineExecution_cancelPipelineExecutionStep_403_Exception = new PipelineExecutionApiException(403, "Missing permission for user to cancel the current pipeline execution");
    public static final PipelineExecutionApiException PipelineExecution_cancelPipelineExecutionStep_404_Exception = new PipelineExecutionApiException(404, "No pipeline execution exits or unknown pipeline or program");
    public static final PipelineExecutionApiException PipelineExecution_getCurrentExecution_404_Exception = new PipelineExecutionApiException(404, "No pipeline execution exits or unknown pipeline or program");
    public static final PipelineExecutionApiException PipelineExecution_getExecution_404_Exception = new PipelineExecutionApiException(404, "No pipeline execution exits or unknown pipeline or application");
    public static final PipelineExecutionApiException PipelineExecution_getExecutions_403_Exception = new PipelineExecutionApiException(403, "Missing permission for user to read executions");
    public static final PipelineExecutionApiException PipelineExecution_getExecutions_404_Exception = new PipelineExecutionApiException(404, "Pipeline does not exist");
    public static final PipelineExecutionApiException PipelineExecution_getStepLogs_403_Exception = new PipelineExecutionApiException(403, "Missing permission for user to read logs");
    public static final PipelineExecutionApiException PipelineExecution_getStepLogs_404_Exception = new PipelineExecutionApiException(404, "Pipeline execution does not exist");
    public static final PipelineExecutionApiException PipelineExecution_startPipeline_400_Exception = new PipelineExecutionApiException(400, "Request conflicts with the expected state of pipeline");
    public static final PipelineExecutionApiException PipelineExecution_startPipeline_404_Exception = new PipelineExecutionApiException(404, "No pipeline execution exits or unknown pipeline or application");
    public static final PipelineExecutionApiException PipelineExecution_startPipeline_412_Exception = new PipelineExecutionApiException(412, "Cannot start execution: programId={programId}, pipelineId={pipelineId} currentExecutionId={executionId}, reason='Execution already in progress.");
    public static final PipelineExecutionApiException PipelineExecution_stepMetric_403_Exception = new PipelineExecutionApiException(403, "Missing permission for user to read metrics");
    public static final PipelineExecutionApiException PipelineExecution_stepMetric_404_Exception = new PipelineExecutionApiException(404, "Pipeline execution does not exist");
    public static final PipelineExecutionApiException PipelineExecution_stepState_403_Exception = new PipelineExecutionApiException(403, "Missing permission for user to read step");
    public static final PipelineExecutionApiException PipelineExecution_stepState_404_Exception = new PipelineExecutionApiException(404, "Pipeline execution does not exist");
    

}