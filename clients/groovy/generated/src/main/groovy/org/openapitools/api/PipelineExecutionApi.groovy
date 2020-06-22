package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.PipelineExecution
import org.openapitools.model.PipelineExecutionListRepresentation
import org.openapitools.model.PipelineExecutionStepState
import org.openapitools.model.PipelineStepMetrics

class PipelineExecutionApi {
    String basePath = "https://cloudmanager.adobe.io"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def advancePipelineExecution ( String programId, String pipelineId, String executionId, String phaseId, String stepId, String xGwImsOrgId, String authorization, String xApiKey, String contentType, Object body, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/program/${programId}/pipeline/${pipelineId}/execution/${executionId}/phase/${phaseId}/step/${stepId}/advance"

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
        if (pipelineId == null) {
            throw new RuntimeException("missing required params pipelineId")
        }
        // verify required params are set
        if (executionId == null) {
            throw new RuntimeException("missing required params executionId")
        }
        // verify required params are set
        if (phaseId == null) {
            throw new RuntimeException("missing required params phaseId")
        }
        // verify required params are set
        if (stepId == null) {
            throw new RuntimeException("missing required params stepId")
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
                    "PUT", "",
                    null )

    }

    def cancelPipelineExecutionStep ( String programId, String pipelineId, String executionId, String phaseId, String stepId, String xGwImsOrgId, String authorization, String xApiKey, String contentType, Object body, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/program/${programId}/pipeline/${pipelineId}/execution/${executionId}/phase/${phaseId}/step/${stepId}/cancel"

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
        if (pipelineId == null) {
            throw new RuntimeException("missing required params pipelineId")
        }
        // verify required params are set
        if (executionId == null) {
            throw new RuntimeException("missing required params executionId")
        }
        // verify required params are set
        if (phaseId == null) {
            throw new RuntimeException("missing required params phaseId")
        }
        // verify required params are set
        if (stepId == null) {
            throw new RuntimeException("missing required params stepId")
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
                    "PUT", "",
                    null )

    }

    def getCurrentExecution ( String programId, String pipelineId, String xGwImsOrgId, String authorization, String xApiKey, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/program/${programId}/pipeline/${pipelineId}/execution"

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
        if (pipelineId == null) {
            throw new RuntimeException("missing required params pipelineId")
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
                    PipelineExecution.class )

    }

    def getExecution ( String programId, String pipelineId, String executionId, String xGwImsOrgId, String authorization, String xApiKey, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/program/${programId}/pipeline/${pipelineId}/execution/${executionId}"

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
        if (pipelineId == null) {
            throw new RuntimeException("missing required params pipelineId")
        }
        // verify required params are set
        if (executionId == null) {
            throw new RuntimeException("missing required params executionId")
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
                    PipelineExecution.class )

    }

    def getExecutions ( String programId, String pipelineId, String xGwImsOrgId, String authorization, String xApiKey, String start, Integer limit, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/program/${programId}/pipeline/${pipelineId}/executions"

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
        if (pipelineId == null) {
            throw new RuntimeException("missing required params pipelineId")
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

        if (start != null) {
            queryParams.put("start", start)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
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
                    PipelineExecutionListRepresentation.class )

    }

    def getStepLogs ( String programId, String pipelineId, String executionId, String phaseId, String stepId, String xGwImsOrgId, String authorization, String xApiKey, String file, String accept, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/program/${programId}/pipeline/${pipelineId}/execution/${executionId}/phase/${phaseId}/step/${stepId}/logs"

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
        if (pipelineId == null) {
            throw new RuntimeException("missing required params pipelineId")
        }
        // verify required params are set
        if (executionId == null) {
            throw new RuntimeException("missing required params executionId")
        }
        // verify required params are set
        if (phaseId == null) {
            throw new RuntimeException("missing required params phaseId")
        }
        // verify required params are set
        if (stepId == null) {
            throw new RuntimeException("missing required params stepId")
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

        if (file != null) {
            queryParams.put("file", file)
        }

        if (accept != null) {
            headerParams.put("Accept", accept)
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
                    null )

    }

    def startPipeline ( String programId, String pipelineId, String xGwImsOrgId, String authorization, String xApiKey, String contentType, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/program/${programId}/pipeline/${pipelineId}/execution"

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
        if (pipelineId == null) {
            throw new RuntimeException("missing required params pipelineId")
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



        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def stepMetric ( String programId, String pipelineId, String executionId, String phaseId, String stepId, String xGwImsOrgId, String authorization, String xApiKey, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/program/${programId}/pipeline/${pipelineId}/execution/${executionId}/phase/${phaseId}/step/${stepId}/metrics"

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
        if (pipelineId == null) {
            throw new RuntimeException("missing required params pipelineId")
        }
        // verify required params are set
        if (executionId == null) {
            throw new RuntimeException("missing required params executionId")
        }
        // verify required params are set
        if (phaseId == null) {
            throw new RuntimeException("missing required params phaseId")
        }
        // verify required params are set
        if (stepId == null) {
            throw new RuntimeException("missing required params stepId")
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
                    PipelineStepMetrics.class )

    }

    def stepState ( String programId, String pipelineId, String executionId, String phaseId, String stepId, String xGwImsOrgId, String authorization, String xApiKey, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/program/${programId}/pipeline/${pipelineId}/execution/${executionId}/phase/${phaseId}/step/${stepId}"

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
        if (pipelineId == null) {
            throw new RuntimeException("missing required params pipelineId")
        }
        // verify required params are set
        if (executionId == null) {
            throw new RuntimeException("missing required params executionId")
        }
        // verify required params are set
        if (phaseId == null) {
            throw new RuntimeException("missing required params phaseId")
        }
        // verify required params are set
        if (stepId == null) {
            throw new RuntimeException("missing required params stepId")
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
                    PipelineExecutionStepState.class )

    }

}
