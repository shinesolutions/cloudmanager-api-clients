package org.openapitools.client.api {

import org.openapitools.common.ApiInvoker;
import org.openapitools.exception.ApiErrorCodes;
import org.openapitools.exception.ApiError;
import org.openapitools.common.ApiUserCredentials;
import org.openapitools.event.Response;
import org.openapitools.common.OpenApi;
import org.openapitools.client.model.PipelineExecution;
import org.openapitools.client.model.PipelineExecutionListRepresentation;
import org.openapitools.client.model.PipelineExecutionStepState;
import org.openapitools.client.model.PipelineStepMetrics;

import mx.rpc.AsyncToken;
import mx.utils.UIDUtil;
import flash.utils.Dictionary;
import flash.events.EventDispatcher;

public class PipelineExecutionApi extends OpenApi {
    /**
    * Constructor for the PipelineExecutionApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function PipelineExecutionApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_advance_pipeline_execution: String = "advance_pipeline_execution";
        public static const event_cancel_pipeline_execution_step: String = "cancel_pipeline_execution_step";
        public static const event_get_current_execution: String = "get_current_execution";
        public static const event_get_execution: String = "get_execution";
        public static const event_get_executions: String = "get_executions";
        public static const event_get_step_logs: String = "get_step_logs";
        public static const event_start_pipeline: String = "start_pipeline";
        public static const event_step_metric: String = "step_metric";
        public static const event_step_state: String = "step_state";


    /*
     * Returns void 
     */
    public function advance_pipeline_execution (programId: String, pipelineId: String, executionId: String, phaseId: String, stepId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, contentType: String, body: Object): String {
        // create path and map variables
        var path: String = "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/advance".replace(/{format}/g,"xml").replace("{" + "programId" + "}", getApiInvoker().escapeString(programId)).replace("{" + "pipelineId" + "}", getApiInvoker().escapeString(pipelineId)).replace("{" + "executionId" + "}", getApiInvoker().escapeString(executionId)).replace("{" + "phaseId" + "}", getApiInvoker().escapeString(phaseId)).replace("{" + "stepId" + "}", getApiInvoker().escapeString(stepId));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }

        
        headerParams["x-gw-ims-org-id"] = toPathValue(xGwImsOrgId);
headerParams["Authorization"] = toPathValue(authorization);
headerParams["x-api-key"] = toPathValue(xApiKey);
headerParams["Content-Type"] = toPathValue(contentType);

        var token:AsyncToken = getApiInvoker().invokeAPI(path, "PUT", queryParams, body, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "advance_pipeline_execution";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function cancel_pipeline_execution_step (programId: String, pipelineId: String, executionId: String, phaseId: String, stepId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, contentType: String, body: Object): String {
        // create path and map variables
        var path: String = "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/cancel".replace(/{format}/g,"xml").replace("{" + "programId" + "}", getApiInvoker().escapeString(programId)).replace("{" + "pipelineId" + "}", getApiInvoker().escapeString(pipelineId)).replace("{" + "executionId" + "}", getApiInvoker().escapeString(executionId)).replace("{" + "phaseId" + "}", getApiInvoker().escapeString(phaseId)).replace("{" + "stepId" + "}", getApiInvoker().escapeString(stepId));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }

        
        headerParams["x-gw-ims-org-id"] = toPathValue(xGwImsOrgId);
headerParams["Authorization"] = toPathValue(authorization);
headerParams["x-api-key"] = toPathValue(xApiKey);
headerParams["Content-Type"] = toPathValue(contentType);

        var token:AsyncToken = getApiInvoker().invokeAPI(path, "PUT", queryParams, body, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "cancel_pipeline_execution_step";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns PipelineExecution 
     */
    public function get_current_execution (programId: String, pipelineId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): String {
        // create path and map variables
        var path: String = "/api/program/{programId}/pipeline/{pipelineId}/execution".replace(/{format}/g,"xml").replace("{" + "programId" + "}", getApiInvoker().escapeString(programId)).replace("{" + "pipelineId" + "}", getApiInvoker().escapeString(pipelineId));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }

        
        headerParams["x-gw-ims-org-id"] = toPathValue(xGwImsOrgId);
headerParams["Authorization"] = toPathValue(authorization);
headerParams["x-api-key"] = toPathValue(xApiKey);

        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_current_execution";

        token.returnType = PipelineExecution;
        return requestId;

    }

    /*
     * Returns PipelineExecution 
     */
    public function get_execution (programId: String, pipelineId: String, executionId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): String {
        // create path and map variables
        var path: String = "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}".replace(/{format}/g,"xml").replace("{" + "programId" + "}", getApiInvoker().escapeString(programId)).replace("{" + "pipelineId" + "}", getApiInvoker().escapeString(pipelineId)).replace("{" + "executionId" + "}", getApiInvoker().escapeString(executionId));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }

        
        headerParams["x-gw-ims-org-id"] = toPathValue(xGwImsOrgId);
headerParams["Authorization"] = toPathValue(authorization);
headerParams["x-api-key"] = toPathValue(xApiKey);

        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_execution";

        token.returnType = PipelineExecution;
        return requestId;

    }

    /*
     * Returns PipelineExecutionListRepresentation 
     */
    public function get_executions (programId: String, pipelineId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, start: String, limit: Number): String {
        // create path and map variables
        var path: String = "/api/program/{programId}/pipeline/{pipelineId}/executions".replace(/{format}/g,"xml").replace("{" + "programId" + "}", getApiInvoker().escapeString(programId)).replace("{" + "pipelineId" + "}", getApiInvoker().escapeString(pipelineId));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }

        if("null" != String(start))
            queryParams["start"] = toPathValue(start);
if("null" != String(limit))
            queryParams["limit"] = toPathValue(limit);

        headerParams["x-gw-ims-org-id"] = toPathValue(xGwImsOrgId);
headerParams["Authorization"] = toPathValue(authorization);
headerParams["x-api-key"] = toPathValue(xApiKey);

        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_executions";

        token.returnType = PipelineExecutionListRepresentation;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function get_step_logs (programId: String, pipelineId: String, executionId: String, phaseId: String, stepId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, file: String, accept: String): String {
        // create path and map variables
        var path: String = "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/logs".replace(/{format}/g,"xml").replace("{" + "programId" + "}", getApiInvoker().escapeString(programId)).replace("{" + "pipelineId" + "}", getApiInvoker().escapeString(pipelineId)).replace("{" + "executionId" + "}", getApiInvoker().escapeString(executionId)).replace("{" + "phaseId" + "}", getApiInvoker().escapeString(phaseId)).replace("{" + "stepId" + "}", getApiInvoker().escapeString(stepId));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }

        if("null" != String(file))
            queryParams["file"] = toPathValue(file);

        headerParams["Accept"] = toPathValue(accept);
headerParams["x-gw-ims-org-id"] = toPathValue(xGwImsOrgId);
headerParams["Authorization"] = toPathValue(authorization);
headerParams["x-api-key"] = toPathValue(xApiKey);

        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_step_logs";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function start_pipeline (programId: String, pipelineId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, contentType: String): String {
        // create path and map variables
        var path: String = "/api/program/{programId}/pipeline/{pipelineId}/execution".replace(/{format}/g,"xml").replace("{" + "programId" + "}", getApiInvoker().escapeString(programId)).replace("{" + "pipelineId" + "}", getApiInvoker().escapeString(pipelineId));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }

        
        headerParams["x-gw-ims-org-id"] = toPathValue(xGwImsOrgId);
headerParams["Authorization"] = toPathValue(authorization);
headerParams["x-api-key"] = toPathValue(xApiKey);
headerParams["Content-Type"] = toPathValue(contentType);

        var token:AsyncToken = getApiInvoker().invokeAPI(path, "PUT", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "start_pipeline";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns PipelineStepMetrics 
     */
    public function step_metric (programId: String, pipelineId: String, executionId: String, phaseId: String, stepId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): String {
        // create path and map variables
        var path: String = "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/metrics".replace(/{format}/g,"xml").replace("{" + "programId" + "}", getApiInvoker().escapeString(programId)).replace("{" + "pipelineId" + "}", getApiInvoker().escapeString(pipelineId)).replace("{" + "executionId" + "}", getApiInvoker().escapeString(executionId)).replace("{" + "phaseId" + "}", getApiInvoker().escapeString(phaseId)).replace("{" + "stepId" + "}", getApiInvoker().escapeString(stepId));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }

        
        headerParams["x-gw-ims-org-id"] = toPathValue(xGwImsOrgId);
headerParams["Authorization"] = toPathValue(authorization);
headerParams["x-api-key"] = toPathValue(xApiKey);

        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "step_metric";

        token.returnType = PipelineStepMetrics;
        return requestId;

    }

    /*
     * Returns PipelineExecutionStepState 
     */
    public function step_state (programId: String, pipelineId: String, executionId: String, phaseId: String, stepId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): String {
        // create path and map variables
        var path: String = "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}".replace(/{format}/g,"xml").replace("{" + "programId" + "}", getApiInvoker().escapeString(programId)).replace("{" + "pipelineId" + "}", getApiInvoker().escapeString(pipelineId)).replace("{" + "executionId" + "}", getApiInvoker().escapeString(executionId)).replace("{" + "phaseId" + "}", getApiInvoker().escapeString(phaseId)).replace("{" + "stepId" + "}", getApiInvoker().escapeString(stepId));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }

        
        headerParams["x-gw-ims-org-id"] = toPathValue(xGwImsOrgId);
headerParams["Authorization"] = toPathValue(authorization);
headerParams["x-api-key"] = toPathValue(xApiKey);

        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "step_state";

        token.returnType = PipelineExecutionStepState;
        return requestId;

    }
}
}
