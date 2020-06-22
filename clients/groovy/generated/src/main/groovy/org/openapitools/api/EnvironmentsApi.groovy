package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.BadRequestError
import org.openapitools.model.Environment
import org.openapitools.model.EnvironmentList
import org.openapitools.model.EnvironmentLogs

class EnvironmentsApi {
    String basePath = "https://cloudmanager.adobe.io"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def deleteEnvironment ( String programId, String environmentId, String xGwImsOrgId, String authorization, String xApiKey, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/program/${programId}/environment/${environmentId}"

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
                    "DELETE", "",
                    Environment.class )

    }

    def downloadLogs ( String programId, String environmentId, String service, String name, String date, String xGwImsOrgId, String authorization, String xApiKey, String accept, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/program/${programId}/environment/${environmentId}/logs/download"

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
        if (service == null) {
            throw new RuntimeException("missing required params service")
        }
        // verify required params are set
        if (name == null) {
            throw new RuntimeException("missing required params name")
        }
        // verify required params are set
        if (date == null) {
            throw new RuntimeException("missing required params date")
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

        if (service != null) {
            queryParams.put("service", service)
        }
        if (name != null) {
            queryParams.put("name", name)
        }
        if (date != null) {
            queryParams.put("date", date)
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
        if (accept != null) {
            headerParams.put("Accept", accept)
        }



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def getEnvironment ( String programId, String environmentId, String xGwImsOrgId, String authorization, String xApiKey, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/program/${programId}/environment/${environmentId}"

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
                    Environment.class )

    }

    def getEnvironmentLogs ( String programId, String environmentId, Integer days, String xGwImsOrgId, String authorization, String xApiKey, List<String> service, List<String> name, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/program/${programId}/environment/${environmentId}/logs"

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
        if (days == null) {
            throw new RuntimeException("missing required params days")
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

        if (service != null) {
            queryParams.put("service", service)
        }
        if (name != null) {
            queryParams.put("name", name)
        }
        if (days != null) {
            queryParams.put("days", days)
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
                    EnvironmentLogs.class )

    }

    def getEnvironments ( String programId, String xGwImsOrgId, String authorization, String xApiKey, String type, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/program/${programId}/environments"

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

        if (type != null) {
            queryParams.put("type", type)
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
                    EnvironmentList.class )

    }

}
