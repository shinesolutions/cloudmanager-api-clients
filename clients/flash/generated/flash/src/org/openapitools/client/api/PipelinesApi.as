package org.openapitools.client.api {

import org.openapitools.common.ApiInvoker;
import org.openapitools.exception.ApiErrorCodes;
import org.openapitools.exception.ApiError;
import org.openapitools.common.ApiUserCredentials;
import org.openapitools.event.Response;
import org.openapitools.common.OpenApi;
import org.openapitools.client.model.Pipeline;
import org.openapitools.client.model.PipelineList;

import mx.rpc.AsyncToken;
import mx.utils.UIDUtil;
import flash.utils.Dictionary;
import flash.events.EventDispatcher;

public class PipelinesApi extends OpenApi {
    /**
    * Constructor for the PipelinesApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function PipelinesApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_delete_pipeline: String = "delete_pipeline";
        public static const event_get_pipeline: String = "get_pipeline";
        public static const event_get_pipelines: String = "get_pipelines";
        public static const event_patch_pipeline: String = "patch_pipeline";


    /*
     * Returns void 
     */
    public function delete_pipeline (programId: String, pipelineId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): String {
        // create path and map variables
        var path: String = "/api/program/{programId}/pipeline/{pipelineId}".replace(/{format}/g,"xml").replace("{" + "programId" + "}", getApiInvoker().escapeString(programId)).replace("{" + "pipelineId" + "}", getApiInvoker().escapeString(pipelineId));

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

        var token:AsyncToken = getApiInvoker().invokeAPI(path, "DELETE", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "delete_pipeline";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns Pipeline 
     */
    public function get_pipeline (programId: String, pipelineId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): String {
        // create path and map variables
        var path: String = "/api/program/{programId}/pipeline/{pipelineId}".replace(/{format}/g,"xml").replace("{" + "programId" + "}", getApiInvoker().escapeString(programId)).replace("{" + "pipelineId" + "}", getApiInvoker().escapeString(pipelineId));

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
        token.completionEventType = "get_pipeline";

        token.returnType = Pipeline;
        return requestId;

    }

    /*
     * Returns PipelineList 
     */
    public function get_pipelines (programId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): String {
        // create path and map variables
        var path: String = "/api/program/{programId}/pipelines".replace(/{format}/g,"xml").replace("{" + "programId" + "}", getApiInvoker().escapeString(programId));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
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

        
        headerParams["x-gw-ims-org-id"] = toPathValue(xGwImsOrgId);
headerParams["Authorization"] = toPathValue(authorization);
headerParams["x-api-key"] = toPathValue(xApiKey);

        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_pipelines";

        token.returnType = PipelineList;
        return requestId;

    }

    /*
     * Returns Pipeline 
     */
    public function patch_pipeline (programId: String, pipelineId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, contentType: String, body: Pipeline): String {
        // create path and map variables
        var path: String = "/api/program/{programId}/pipeline/{pipelineId}".replace(/{format}/g,"xml").replace("{" + "programId" + "}", getApiInvoker().escapeString(programId)).replace("{" + "pipelineId" + "}", getApiInvoker().escapeString(pipelineId));

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

        
        headerParams["x-gw-ims-org-id"] = toPathValue(xGwImsOrgId);
headerParams["Authorization"] = toPathValue(authorization);
headerParams["x-api-key"] = toPathValue(xApiKey);
headerParams["Content-Type"] = toPathValue(contentType);

        var token:AsyncToken = getApiInvoker().invokeAPI(path, "PATCH", queryParams, body, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "patch_pipeline";

        token.returnType = Pipeline;
        return requestId;

    }
}
}
