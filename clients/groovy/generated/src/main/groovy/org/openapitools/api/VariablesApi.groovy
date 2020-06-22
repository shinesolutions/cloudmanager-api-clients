package org.openapitools.api;

import org.openapitools.api.ApiUtils
import java.util.List
import org.openapitools.model.Variable
import org.openapitools.model.VariableList

class VariablesApi {
    String basePath = "https://cloudmanager.adobe.io"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def getEnvironmentVariables ( String programId, String environmentId, String xGwImsOrgId, String authorization, String xApiKey, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/program/${programId}/environment/${environmentId}/variables"

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
        if (environmentId == null) {
            throw new RuntimeException("missing required params environmentId")
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
                    VariableList.class )

    }

    def patchEnvironmentVariables ( String programId, String environmentId, String xGwImsOrgId, String authorization, String xApiKey, String contentType, List<Variable> body, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/program/${programId}/environment/${environmentId}/variables"

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
        if (environmentId == null) {
            throw new RuntimeException("missing required params environmentId")
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
        // verify required params are set
        if (contentType == null) {
            throw new RuntimeException("missing required params contentType")
        }
        // verify required params are set
        if (body == null) {
            throw new RuntimeException("missing required params body")
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
        if (contentType != null) {
            headerParams.put("Content-Type", contentType)
        }

        contentType = 'application/json';
        bodyParams = body


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PATCH", "",
                    VariableList.class )

    }

}
