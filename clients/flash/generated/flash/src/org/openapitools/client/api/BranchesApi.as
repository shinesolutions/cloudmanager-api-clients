package org.openapitools.client.api {

import org.openapitools.common.ApiInvoker;
import org.openapitools.exception.ApiErrorCodes;
import org.openapitools.exception.ApiError;
import org.openapitools.common.ApiUserCredentials;
import org.openapitools.event.Response;
import org.openapitools.common.OpenApi;
import org.openapitools.client.model.BranchList;

import mx.rpc.AsyncToken;
import mx.utils.UIDUtil;
import flash.utils.Dictionary;
import flash.events.EventDispatcher;

public class BranchesApi extends OpenApi {
    /**
    * Constructor for the BranchesApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function BranchesApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_get_branches: String = "get_branches";


    /*
     * Returns BranchList 
     */
    public function get_branches (programId: String, repositoryId: String, xGwImsOrgId: String, authorization: String, xApiKey: String): String {
        // create path and map variables
        var path: String = "/api/program/{programId}/repository/{repositoryId}/branches".replace(/{format}/g,"xml").replace("{" + "programId" + "}", getApiInvoker().escapeString(programId)).replace("{" + "repositoryId" + "}", getApiInvoker().escapeString(repositoryId));

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
        token.completionEventType = "get_branches";

        token.returnType = BranchList;
        return requestId;

    }
}
}
