package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.BranchList

class BranchesApi {
    String basePath = "https://cloudmanager.adobe.io"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def getBranches ( String programId, String repositoryId, String xGwImsOrgId, String authorization, String xApiKey, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/program/${programId}/repository/${repositoryId}/branches"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (programId == null) {
            throw new RuntimeException("missing required params programId")
        }
        // verify required params are set
        if (repositoryId == null) {
            throw new RuntimeException("missing required params repositoryId")
        }
        // verify required params are set
        if (xGwImsOrgId == null) {
            throw new RuntimeException("missing required params xGwImsOrgId")
        }
        // verify required params are set
        if (authorization == null) {
            throw new RuntimeException("missing required params authorization")
        }
        // verify required params are set
        if (xApiKey == null) {
            throw new RuntimeException("missing required params xApiKey")
        }


        if (xGwImsOrgId != null) {
            headerParams.put("x-gw-ims-org-id", xGwImsOrgId)
        }
        if (authorization != null) {
            headerParams.put("Authorization", authorization)
        }
        if (xApiKey != null) {
            headerParams.put("x-api-key", xApiKey)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    BranchList.class )

    }

}
