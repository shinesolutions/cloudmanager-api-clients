package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.Program
import org.openapitools.model.ProgramList

class ProgramsApi {
    String basePath = "https://cloudmanager.adobe.io"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def deleteProgram ( String programId, String xGwImsOrgId, String authorization, String xApiKey, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/program/${programId}"

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
                    "DELETE", "",
                    Program.class )

    }

    def getProgram ( String programId, String xGwImsOrgId, String authorization, String xApiKey, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/program/${programId}"

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
                    Program.class )

    }

    def getPrograms ( String xGwImsOrgId, String authorization, String xApiKey, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/programs"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

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
                    ProgramList.class )

    }

}
