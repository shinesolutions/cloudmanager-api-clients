package org.openapitools.client.api {

import org.openapitools.common.ApiInvoker;
import org.openapitools.exception.ApiErrorCodes;
import org.openapitools.exception.ApiError;
import org.openapitools.common.ApiUserCredentials;
import org.openapitools.event.Response;
import org.openapitools.common.OpenApi;
import org.openapitools.client.model.Variable;
import org.openapitools.client.model.VariableList;

import mx.rpc.AsyncToken;
import mx.utils.UIDUtil;
import flash.utils.Dictionary;
import flash.events.EventDispatcher;

public class VariablesApi extends OpenApi {
    /**
    * Constructor for the VariablesApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function VariablesApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_get_environment_variables: String = "get_environment_variables";
        public static const event_patch_environment_variables: String = "patch_environment_variables";


    /*
     * Returns VariableList 
     */
    public function get_environment_variables (programId: String, environmentId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): String {
        // create path and map variables
        var path: String = "/api/program/{programId}/environment/{environmentId}/variables".replace(/{format}/g,"xml").replace("{" + "programId" + "}", getApiInvoker().escapeString(programId)).replace("{" + "environmentId" + "}", getApiInvoker().escapeString(environmentId));

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
        token.completionEventType = "get_environment_variables";

        token.returnType = VariableList;
        return requestId;

    }

    /*
     * Returns VariableList 
     */
    public function patch_environment_variables (programId: String, environmentId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, contentType: String, body: Array): String {
        // create path and map variables
        var path: String = "/api/program/{programId}/environment/{environmentId}/variables".replace(/{format}/g,"xml").replace("{" + "programId" + "}", getApiInvoker().escapeString(programId)).replace("{" + "environmentId" + "}", getApiInvoker().escapeString(environmentId));

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
        token.completionEventType = "patch_environment_variables";

        token.returnType = VariableList;
        return requestId;

    }
}
}
