package org.openapitools.client.api {

import org.openapitools.common.ApiInvoker;
import org.openapitools.exception.ApiErrorCodes;
import org.openapitools.exception.ApiError;
import org.openapitools.common.ApiUserCredentials;
import org.openapitools.event.Response;
import org.openapitools.common.OpenApi;
import org.openapitools.client.model.BadRequestError;
import org.openapitools.client.model.Environment;
import org.openapitools.client.model.EnvironmentList;
import org.openapitools.client.model.EnvironmentLogs;

import mx.rpc.AsyncToken;
import mx.utils.UIDUtil;
import flash.utils.Dictionary;
import flash.events.EventDispatcher;

public class EnvironmentsApi extends OpenApi {
    /**
    * Constructor for the EnvironmentsApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function EnvironmentsApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_delete_environment: String = "delete_environment";
        public static const event_download_logs: String = "download_logs";
        public static const event_get_environment: String = "get_environment";
        public static const event_get_environment_logs: String = "get_environment_logs";
        public static const event_get_environments: String = "get_environments";


    /*
     * Returns Environment 
     */
    public function delete_environment (programId: String, environmentId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): String {
        // create path and map variables
        var path: String = "/api/program/{programId}/environment/{environmentId}".replace(/{format}/g,"xml").replace("{" + "programId" + "}", getApiInvoker().escapeString(programId)).replace("{" + "environmentId" + "}", getApiInvoker().escapeString(environmentId));

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
        token.completionEventType = "delete_environment";

        token.returnType = Environment;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function download_logs (programId: String, environmentId: String, service: String, name: String, date: String, xGwImsOrgId: String, authorization: String, xApiKey: String, accept: String): String {
        // create path and map variables
        var path: String = "/api/program/{programId}/environment/{environmentId}/logs/download".replace(/{format}/g,"xml").replace("{" + "programId" + "}", getApiInvoker().escapeString(programId)).replace("{" + "environmentId" + "}", getApiInvoker().escapeString(environmentId));

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

        if("null" != String(service))
            queryParams["service"] = toPathValue(service);
if("null" != String(name))
            queryParams["name"] = toPathValue(name);
if("null" != String(date))
            queryParams["date"] = toPathValue(date);

        headerParams["x-gw-ims-org-id"] = toPathValue(xGwImsOrgId);
headerParams["Authorization"] = toPathValue(authorization);
headerParams["x-api-key"] = toPathValue(xApiKey);
headerParams["Accept"] = toPathValue(accept);

        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "download_logs";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns Environment 
     */
    public function get_environment (programId: String, environmentId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): String {
        // create path and map variables
        var path: String = "/api/program/{programId}/environment/{environmentId}".replace(/{format}/g,"xml").replace("{" + "programId" + "}", getApiInvoker().escapeString(programId)).replace("{" + "environmentId" + "}", getApiInvoker().escapeString(environmentId));

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
        token.completionEventType = "get_environment";

        token.returnType = Environment;
        return requestId;

    }

    /*
     * Returns EnvironmentLogs 
     */
    public function get_environment_logs (programId: String, environmentId: String, days: Number, xGwImsOrgId: String, authorization: String, xApiKey: String, service: Array, name: Array): String {
        // create path and map variables
        var path: String = "/api/program/{programId}/environment/{environmentId}/logs".replace(/{format}/g,"xml").replace("{" + "programId" + "}", getApiInvoker().escapeString(programId)).replace("{" + "environmentId" + "}", getApiInvoker().escapeString(environmentId));

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

        if("null" != String(service))
            queryParams["service"] = toPathValue(service);
if("null" != String(name))
            queryParams["name"] = toPathValue(name);
if("null" != String(days))
            queryParams["days"] = toPathValue(days);

        headerParams["x-gw-ims-org-id"] = toPathValue(xGwImsOrgId);
headerParams["Authorization"] = toPathValue(authorization);
headerParams["x-api-key"] = toPathValue(xApiKey);

        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_environment_logs";

        token.returnType = EnvironmentLogs;
        return requestId;

    }

    /*
     * Returns EnvironmentList 
     */
    public function get_environments (programId: String, xGwImsOrgId: String, authorization: String, xApiKey: String, type: String): String {
        // create path and map variables
        var path: String = "/api/program/{programId}/environments".replace(/{format}/g,"xml").replace("{" + "programId" + "}", getApiInvoker().escapeString(programId));

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

        if("null" != String(type))
            queryParams["type"] = toPathValue(type);

        headerParams["x-gw-ims-org-id"] = toPathValue(xGwImsOrgId);
headerParams["Authorization"] = toPathValue(authorization);
headerParams["x-api-key"] = toPathValue(xApiKey);

        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_environments";

        token.returnType = EnvironmentList;
        return requestId;

    }
}
}
