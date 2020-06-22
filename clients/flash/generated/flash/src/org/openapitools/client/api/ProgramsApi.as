package org.openapitools.client.api {

import org.openapitools.common.ApiInvoker;
import org.openapitools.exception.ApiErrorCodes;
import org.openapitools.exception.ApiError;
import org.openapitools.common.ApiUserCredentials;
import org.openapitools.event.Response;
import org.openapitools.common.OpenApi;
import org.openapitools.client.model.Program;
import org.openapitools.client.model.ProgramList;

import mx.rpc.AsyncToken;
import mx.utils.UIDUtil;
import flash.utils.Dictionary;
import flash.events.EventDispatcher;

public class ProgramsApi extends OpenApi {
    /**
    * Constructor for the ProgramsApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function ProgramsApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_delete_program: String = "delete_program";
        public static const event_get_program: String = "get_program";
        public static const event_get_programs: String = "get_programs";


    /*
     * Returns Program 
     */
    public function delete_program (programId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): String {
        // create path and map variables
        var path: String = "/api/program/{programId}".replace(/{format}/g,"xml").replace("{" + "programId" + "}", getApiInvoker().escapeString(programId));

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

        var token:AsyncToken = getApiInvoker().invokeAPI(path, "DELETE", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "delete_program";

        token.returnType = Program;
        return requestId;

    }

    /*
     * Returns Program 
     */
    public function get_program (programId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): String {
        // create path and map variables
        var path: String = "/api/program/{programId}".replace(/{format}/g,"xml").replace("{" + "programId" + "}", getApiInvoker().escapeString(programId));

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
        token.completionEventType = "get_program";

        token.returnType = Program;
        return requestId;

    }

    /*
     * Returns ProgramList 
     */
    public function get_programs (xGwImsOrgId: String, authorization: String, xApiKey: String): String {
        // create path and map variables
        var path: String = "/api/programs".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
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

        
        headerParams["x-gw-ims-org-id"] = toPathValue(xGwImsOrgId);
headerParams["Authorization"] = toPathValue(authorization);
headerParams["x-api-key"] = toPathValue(xApiKey);

        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_programs";

        token.returnType = ProgramList;
        return requestId;

    }
}
}
