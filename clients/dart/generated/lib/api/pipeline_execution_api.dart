part of openapi.api;



class PipelineExecutionApi {
  final ApiClient apiClient;

  PipelineExecutionApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  /// Advance with HTTP info returned
  ///
  /// Post to this url in order to advance the current pipeline execution, if paused and waiting for user interaction. Link is present in output only in that case. The input depends on the actual reason for which the pipeline execution stopped.
  Future advancePipelineExecutionWithHttpInfo(String programId, String pipelineId, String executionId, String phaseId, String stepId, String xGwImsOrgId, String authorization, String xApiKey, String contentType, Object body) async {
    Object postBody = body;

    // verify required params are set
    if(programId == null) {
     throw ApiException(400, "Missing required param: programId");
    }
    if(pipelineId == null) {
     throw ApiException(400, "Missing required param: pipelineId");
    }
    if(executionId == null) {
     throw ApiException(400, "Missing required param: executionId");
    }
    if(phaseId == null) {
     throw ApiException(400, "Missing required param: phaseId");
    }
    if(stepId == null) {
     throw ApiException(400, "Missing required param: stepId");
    }
    if(xGwImsOrgId == null) {
     throw ApiException(400, "Missing required param: xGwImsOrgId");
    }
    if(authorization == null) {
     throw ApiException(400, "Missing required param: authorization");
    }
    if(xApiKey == null) {
     throw ApiException(400, "Missing required param: xApiKey");
    }
    if(contentType == null) {
     throw ApiException(400, "Missing required param: contentType");
    }
    if(body == null) {
     throw ApiException(400, "Missing required param: body");
    }

    // create path and map variables
    String path = "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/advance".replaceAll("{format}","json").replaceAll("{" + "programId" + "}", programId.toString()).replaceAll("{" + "pipelineId" + "}", pipelineId.toString()).replaceAll("{" + "executionId" + "}", executionId.toString()).replaceAll("{" + "phaseId" + "}", phaseId.toString()).replaceAll("{" + "stepId" + "}", stepId.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    headerParams["x-gw-ims-org-id"] = xGwImsOrgId;
    headerParams["Authorization"] = authorization;
    headerParams["x-api-key"] = xApiKey;
    headerParams["Content-Type"] = contentType;

    List<String> contentTypes = ["application/json"];

    String contentType = contentTypes.isNotEmpty ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = MultipartRequest(null, null);
      if(hasFields)
        postBody = mp;
    }
    else {
    }

    var response = await apiClient.invokeAPI(path,
                                             'PUT',
                                             queryParams,
                                             postBody,
                                             headerParams,
                                             formParams,
                                             contentType,
                                             authNames);
    return response;
  }

  /// Advance
  ///
  /// Post to this url in order to advance the current pipeline execution, if paused and waiting for user interaction. Link is present in output only in that case. The input depends on the actual reason for which the pipeline execution stopped.
  Future advancePipelineExecution(String programId, String pipelineId, String executionId, String phaseId, String stepId, String xGwImsOrgId, String authorization, String xApiKey, String contentType, Object body) async {
    Response response = await advancePipelineExecutionWithHttpInfo(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, contentType, body);
    if(response.statusCode >= 400) {
      throw ApiException(response.statusCode, _decodeBodyBytes(response));
    } else if(response.body != null) {
    } else {
      return;
    }
  }

  /// Cancel with HTTP info returned
  ///
  /// Post to this url in order to cancel the current pipeline execution. Link is present in output only in that case.
  Future cancelPipelineExecutionStepWithHttpInfo(String programId, String pipelineId, String executionId, String phaseId, String stepId, String xGwImsOrgId, String authorization, String xApiKey, String contentType, Object body) async {
    Object postBody = body;

    // verify required params are set
    if(programId == null) {
     throw ApiException(400, "Missing required param: programId");
    }
    if(pipelineId == null) {
     throw ApiException(400, "Missing required param: pipelineId");
    }
    if(executionId == null) {
     throw ApiException(400, "Missing required param: executionId");
    }
    if(phaseId == null) {
     throw ApiException(400, "Missing required param: phaseId");
    }
    if(stepId == null) {
     throw ApiException(400, "Missing required param: stepId");
    }
    if(xGwImsOrgId == null) {
     throw ApiException(400, "Missing required param: xGwImsOrgId");
    }
    if(authorization == null) {
     throw ApiException(400, "Missing required param: authorization");
    }
    if(xApiKey == null) {
     throw ApiException(400, "Missing required param: xApiKey");
    }
    if(contentType == null) {
     throw ApiException(400, "Missing required param: contentType");
    }
    if(body == null) {
     throw ApiException(400, "Missing required param: body");
    }

    // create path and map variables
    String path = "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/cancel".replaceAll("{format}","json").replaceAll("{" + "programId" + "}", programId.toString()).replaceAll("{" + "pipelineId" + "}", pipelineId.toString()).replaceAll("{" + "executionId" + "}", executionId.toString()).replaceAll("{" + "phaseId" + "}", phaseId.toString()).replaceAll("{" + "stepId" + "}", stepId.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    headerParams["x-gw-ims-org-id"] = xGwImsOrgId;
    headerParams["Authorization"] = authorization;
    headerParams["x-api-key"] = xApiKey;
    headerParams["Content-Type"] = contentType;

    List<String> contentTypes = ["application/json"];

    String contentType = contentTypes.isNotEmpty ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = MultipartRequest(null, null);
      if(hasFields)
        postBody = mp;
    }
    else {
    }

    var response = await apiClient.invokeAPI(path,
                                             'PUT',
                                             queryParams,
                                             postBody,
                                             headerParams,
                                             formParams,
                                             contentType,
                                             authNames);
    return response;
  }

  /// Cancel
  ///
  /// Post to this url in order to cancel the current pipeline execution. Link is present in output only in that case.
  Future cancelPipelineExecutionStep(String programId, String pipelineId, String executionId, String phaseId, String stepId, String xGwImsOrgId, String authorization, String xApiKey, String contentType, Object body) async {
    Response response = await cancelPipelineExecutionStepWithHttpInfo(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, contentType, body);
    if(response.statusCode >= 400) {
      throw ApiException(response.statusCode, _decodeBodyBytes(response));
    } else if(response.body != null) {
    } else {
      return;
    }
  }

  /// Get current pipeline execution with HTTP info returned
  ///
  /// Returns current pipeline execution if any.
  Future<Response> getCurrentExecutionWithHttpInfo(String programId, String pipelineId, String xGwImsOrgId, String authorization, String xApiKey) async {
    Object postBody;

    // verify required params are set
    if(programId == null) {
     throw ApiException(400, "Missing required param: programId");
    }
    if(pipelineId == null) {
     throw ApiException(400, "Missing required param: pipelineId");
    }
    if(xGwImsOrgId == null) {
     throw ApiException(400, "Missing required param: xGwImsOrgId");
    }
    if(authorization == null) {
     throw ApiException(400, "Missing required param: authorization");
    }
    if(xApiKey == null) {
     throw ApiException(400, "Missing required param: xApiKey");
    }

    // create path and map variables
    String path = "/api/program/{programId}/pipeline/{pipelineId}/execution".replaceAll("{format}","json").replaceAll("{" + "programId" + "}", programId.toString()).replaceAll("{" + "pipelineId" + "}", pipelineId.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    headerParams["x-gw-ims-org-id"] = xGwImsOrgId;
    headerParams["Authorization"] = authorization;
    headerParams["x-api-key"] = xApiKey;

    List<String> contentTypes = [];

    String contentType = contentTypes.isNotEmpty ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = MultipartRequest(null, null);
      if(hasFields)
        postBody = mp;
    }
    else {
    }

    var response = await apiClient.invokeAPI(path,
                                             'GET',
                                             queryParams,
                                             postBody,
                                             headerParams,
                                             formParams,
                                             contentType,
                                             authNames);
    return response;
  }

  /// Get current pipeline execution
  ///
  /// Returns current pipeline execution if any.
  Future<PipelineExecution> getCurrentExecution(String programId, String pipelineId, String xGwImsOrgId, String authorization, String xApiKey) async {
    Response response = await getCurrentExecutionWithHttpInfo(programId, pipelineId, xGwImsOrgId, authorization, xApiKey);
    if(response.statusCode >= 400) {
      throw ApiException(response.statusCode, _decodeBodyBytes(response));
    } else if(response.body != null) {
      return apiClient.deserialize(_decodeBodyBytes(response), 'PipelineExecution') as PipelineExecution;
    } else {
      return null;
    }
  }

  /// Get pipeline execution with HTTP info returned
  ///
  /// Returns a pipeline execution by id
  Future<Response> getExecutionWithHttpInfo(String programId, String pipelineId, String executionId, String xGwImsOrgId, String authorization, String xApiKey) async {
    Object postBody;

    // verify required params are set
    if(programId == null) {
     throw ApiException(400, "Missing required param: programId");
    }
    if(pipelineId == null) {
     throw ApiException(400, "Missing required param: pipelineId");
    }
    if(executionId == null) {
     throw ApiException(400, "Missing required param: executionId");
    }
    if(xGwImsOrgId == null) {
     throw ApiException(400, "Missing required param: xGwImsOrgId");
    }
    if(authorization == null) {
     throw ApiException(400, "Missing required param: authorization");
    }
    if(xApiKey == null) {
     throw ApiException(400, "Missing required param: xApiKey");
    }

    // create path and map variables
    String path = "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}".replaceAll("{format}","json").replaceAll("{" + "programId" + "}", programId.toString()).replaceAll("{" + "pipelineId" + "}", pipelineId.toString()).replaceAll("{" + "executionId" + "}", executionId.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    headerParams["x-gw-ims-org-id"] = xGwImsOrgId;
    headerParams["Authorization"] = authorization;
    headerParams["x-api-key"] = xApiKey;

    List<String> contentTypes = [];

    String contentType = contentTypes.isNotEmpty ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = MultipartRequest(null, null);
      if(hasFields)
        postBody = mp;
    }
    else {
    }

    var response = await apiClient.invokeAPI(path,
                                             'GET',
                                             queryParams,
                                             postBody,
                                             headerParams,
                                             formParams,
                                             contentType,
                                             authNames);
    return response;
  }

  /// Get pipeline execution
  ///
  /// Returns a pipeline execution by id
  Future<PipelineExecution> getExecution(String programId, String pipelineId, String executionId, String xGwImsOrgId, String authorization, String xApiKey) async {
    Response response = await getExecutionWithHttpInfo(programId, pipelineId, executionId, xGwImsOrgId, authorization, xApiKey);
    if(response.statusCode >= 400) {
      throw ApiException(response.statusCode, _decodeBodyBytes(response));
    } else if(response.body != null) {
      return apiClient.deserialize(_decodeBodyBytes(response), 'PipelineExecution') as PipelineExecution;
    } else {
      return null;
    }
  }

  /// List Executions with HTTP info returned
  ///
  /// Returns the history of pipeline executions in a newest to oldest order
  Future<Response> getExecutionsWithHttpInfo(String programId, String pipelineId, String xGwImsOrgId, String authorization, String xApiKey, { String start, int limit }) async {
    Object postBody;

    // verify required params are set
    if(programId == null) {
     throw ApiException(400, "Missing required param: programId");
    }
    if(pipelineId == null) {
     throw ApiException(400, "Missing required param: pipelineId");
    }
    if(xGwImsOrgId == null) {
     throw ApiException(400, "Missing required param: xGwImsOrgId");
    }
    if(authorization == null) {
     throw ApiException(400, "Missing required param: authorization");
    }
    if(xApiKey == null) {
     throw ApiException(400, "Missing required param: xApiKey");
    }

    // create path and map variables
    String path = "/api/program/{programId}/pipeline/{pipelineId}/executions".replaceAll("{format}","json").replaceAll("{" + "programId" + "}", programId.toString()).replaceAll("{" + "pipelineId" + "}", pipelineId.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if(start != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "start", start));
    }
    if(limit != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "limit", limit));
    }
    headerParams["x-gw-ims-org-id"] = xGwImsOrgId;
    headerParams["Authorization"] = authorization;
    headerParams["x-api-key"] = xApiKey;

    List<String> contentTypes = [];

    String contentType = contentTypes.isNotEmpty ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = MultipartRequest(null, null);
      if(hasFields)
        postBody = mp;
    }
    else {
    }

    var response = await apiClient.invokeAPI(path,
                                             'GET',
                                             queryParams,
                                             postBody,
                                             headerParams,
                                             formParams,
                                             contentType,
                                             authNames);
    return response;
  }

  /// List Executions
  ///
  /// Returns the history of pipeline executions in a newest to oldest order
  Future<PipelineExecutionListRepresentation> getExecutions(String programId, String pipelineId, String xGwImsOrgId, String authorization, String xApiKey, { String start, int limit }) async {
    Response response = await getExecutionsWithHttpInfo(programId, pipelineId, xGwImsOrgId, authorization, xApiKey,  start: start, limit: limit );
    if(response.statusCode >= 400) {
      throw ApiException(response.statusCode, _decodeBodyBytes(response));
    } else if(response.body != null) {
      return apiClient.deserialize(_decodeBodyBytes(response), 'PipelineExecutionListRepresentation') as PipelineExecutionListRepresentation;
    } else {
      return null;
    }
  }

  /// Get logs with HTTP info returned
  ///
  /// Get the logs associated with a step.
  Future getStepLogsWithHttpInfo(String programId, String pipelineId, String executionId, String phaseId, String stepId, String xGwImsOrgId, String authorization, String xApiKey, { String file, String accept }) async {
    Object postBody;

    // verify required params are set
    if(programId == null) {
     throw ApiException(400, "Missing required param: programId");
    }
    if(pipelineId == null) {
     throw ApiException(400, "Missing required param: pipelineId");
    }
    if(executionId == null) {
     throw ApiException(400, "Missing required param: executionId");
    }
    if(phaseId == null) {
     throw ApiException(400, "Missing required param: phaseId");
    }
    if(stepId == null) {
     throw ApiException(400, "Missing required param: stepId");
    }
    if(xGwImsOrgId == null) {
     throw ApiException(400, "Missing required param: xGwImsOrgId");
    }
    if(authorization == null) {
     throw ApiException(400, "Missing required param: authorization");
    }
    if(xApiKey == null) {
     throw ApiException(400, "Missing required param: xApiKey");
    }

    // create path and map variables
    String path = "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/logs".replaceAll("{format}","json").replaceAll("{" + "programId" + "}", programId.toString()).replaceAll("{" + "pipelineId" + "}", pipelineId.toString()).replaceAll("{" + "executionId" + "}", executionId.toString()).replaceAll("{" + "phaseId" + "}", phaseId.toString()).replaceAll("{" + "stepId" + "}", stepId.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if(file != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "file", file));
    }
    headerParams["Accept"] = accept;
    headerParams["x-gw-ims-org-id"] = xGwImsOrgId;
    headerParams["Authorization"] = authorization;
    headerParams["x-api-key"] = xApiKey;

    List<String> contentTypes = [];

    String contentType = contentTypes.isNotEmpty ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = MultipartRequest(null, null);
      if(hasFields)
        postBody = mp;
    }
    else {
    }

    var response = await apiClient.invokeAPI(path,
                                             'GET',
                                             queryParams,
                                             postBody,
                                             headerParams,
                                             formParams,
                                             contentType,
                                             authNames);
    return response;
  }

  /// Get logs
  ///
  /// Get the logs associated with a step.
  Future getStepLogs(String programId, String pipelineId, String executionId, String phaseId, String stepId, String xGwImsOrgId, String authorization, String xApiKey, { String file, String accept }) async {
    Response response = await getStepLogsWithHttpInfo(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey,  file: file, accept: accept );
    if(response.statusCode >= 400) {
      throw ApiException(response.statusCode, _decodeBodyBytes(response));
    } else if(response.body != null) {
    } else {
      return;
    }
  }

  /// Start the pipeline with HTTP info returned
  ///
  /// Starts the Pipeline. This works only if the pipeline is not already started.
  Future startPipelineWithHttpInfo(String programId, String pipelineId, String xGwImsOrgId, String authorization, String xApiKey, String contentType) async {
    Object postBody;

    // verify required params are set
    if(programId == null) {
     throw ApiException(400, "Missing required param: programId");
    }
    if(pipelineId == null) {
     throw ApiException(400, "Missing required param: pipelineId");
    }
    if(xGwImsOrgId == null) {
     throw ApiException(400, "Missing required param: xGwImsOrgId");
    }
    if(authorization == null) {
     throw ApiException(400, "Missing required param: authorization");
    }
    if(xApiKey == null) {
     throw ApiException(400, "Missing required param: xApiKey");
    }
    if(contentType == null) {
     throw ApiException(400, "Missing required param: contentType");
    }

    // create path and map variables
    String path = "/api/program/{programId}/pipeline/{pipelineId}/execution".replaceAll("{format}","json").replaceAll("{" + "programId" + "}", programId.toString()).replaceAll("{" + "pipelineId" + "}", pipelineId.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    headerParams["x-gw-ims-org-id"] = xGwImsOrgId;
    headerParams["Authorization"] = authorization;
    headerParams["x-api-key"] = xApiKey;
    headerParams["Content-Type"] = contentType;

    List<String> contentTypes = [];

    String contentType = contentTypes.isNotEmpty ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = MultipartRequest(null, null);
      if(hasFields)
        postBody = mp;
    }
    else {
    }

    var response = await apiClient.invokeAPI(path,
                                             'PUT',
                                             queryParams,
                                             postBody,
                                             headerParams,
                                             formParams,
                                             contentType,
                                             authNames);
    return response;
  }

  /// Start the pipeline
  ///
  /// Starts the Pipeline. This works only if the pipeline is not already started.
  Future startPipeline(String programId, String pipelineId, String xGwImsOrgId, String authorization, String xApiKey, String contentType) async {
    Response response = await startPipelineWithHttpInfo(programId, pipelineId, xGwImsOrgId, authorization, xApiKey, contentType);
    if(response.statusCode >= 400) {
      throw ApiException(response.statusCode, _decodeBodyBytes(response));
    } else if(response.body != null) {
    } else {
      return;
    }
  }

  /// Get step metrics with HTTP info returned
  ///
  /// 
  Future<Response> stepMetricWithHttpInfo(String programId, String pipelineId, String executionId, String phaseId, String stepId, String xGwImsOrgId, String authorization, String xApiKey) async {
    Object postBody;

    // verify required params are set
    if(programId == null) {
     throw ApiException(400, "Missing required param: programId");
    }
    if(pipelineId == null) {
     throw ApiException(400, "Missing required param: pipelineId");
    }
    if(executionId == null) {
     throw ApiException(400, "Missing required param: executionId");
    }
    if(phaseId == null) {
     throw ApiException(400, "Missing required param: phaseId");
    }
    if(stepId == null) {
     throw ApiException(400, "Missing required param: stepId");
    }
    if(xGwImsOrgId == null) {
     throw ApiException(400, "Missing required param: xGwImsOrgId");
    }
    if(authorization == null) {
     throw ApiException(400, "Missing required param: authorization");
    }
    if(xApiKey == null) {
     throw ApiException(400, "Missing required param: xApiKey");
    }

    // create path and map variables
    String path = "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/metrics".replaceAll("{format}","json").replaceAll("{" + "programId" + "}", programId.toString()).replaceAll("{" + "pipelineId" + "}", pipelineId.toString()).replaceAll("{" + "executionId" + "}", executionId.toString()).replaceAll("{" + "phaseId" + "}", phaseId.toString()).replaceAll("{" + "stepId" + "}", stepId.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    headerParams["x-gw-ims-org-id"] = xGwImsOrgId;
    headerParams["Authorization"] = authorization;
    headerParams["x-api-key"] = xApiKey;

    List<String> contentTypes = [];

    String contentType = contentTypes.isNotEmpty ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = MultipartRequest(null, null);
      if(hasFields)
        postBody = mp;
    }
    else {
    }

    var response = await apiClient.invokeAPI(path,
                                             'GET',
                                             queryParams,
                                             postBody,
                                             headerParams,
                                             formParams,
                                             contentType,
                                             authNames);
    return response;
  }

  /// Get step metrics
  ///
  /// 
  Future<PipelineStepMetrics> stepMetric(String programId, String pipelineId, String executionId, String phaseId, String stepId, String xGwImsOrgId, String authorization, String xApiKey) async {
    Response response = await stepMetricWithHttpInfo(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey);
    if(response.statusCode >= 400) {
      throw ApiException(response.statusCode, _decodeBodyBytes(response));
    } else if(response.body != null) {
      return apiClient.deserialize(_decodeBodyBytes(response), 'PipelineStepMetrics') as PipelineStepMetrics;
    } else {
      return null;
    }
  }

  /// Get step state with HTTP info returned
  ///
  /// 
  Future<Response> stepStateWithHttpInfo(String programId, String pipelineId, String executionId, String phaseId, String stepId, String xGwImsOrgId, String authorization, String xApiKey) async {
    Object postBody;

    // verify required params are set
    if(programId == null) {
     throw ApiException(400, "Missing required param: programId");
    }
    if(pipelineId == null) {
     throw ApiException(400, "Missing required param: pipelineId");
    }
    if(executionId == null) {
     throw ApiException(400, "Missing required param: executionId");
    }
    if(phaseId == null) {
     throw ApiException(400, "Missing required param: phaseId");
    }
    if(stepId == null) {
     throw ApiException(400, "Missing required param: stepId");
    }
    if(xGwImsOrgId == null) {
     throw ApiException(400, "Missing required param: xGwImsOrgId");
    }
    if(authorization == null) {
     throw ApiException(400, "Missing required param: authorization");
    }
    if(xApiKey == null) {
     throw ApiException(400, "Missing required param: xApiKey");
    }

    // create path and map variables
    String path = "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}".replaceAll("{format}","json").replaceAll("{" + "programId" + "}", programId.toString()).replaceAll("{" + "pipelineId" + "}", pipelineId.toString()).replaceAll("{" + "executionId" + "}", executionId.toString()).replaceAll("{" + "phaseId" + "}", phaseId.toString()).replaceAll("{" + "stepId" + "}", stepId.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    headerParams["x-gw-ims-org-id"] = xGwImsOrgId;
    headerParams["Authorization"] = authorization;
    headerParams["x-api-key"] = xApiKey;

    List<String> contentTypes = [];

    String contentType = contentTypes.isNotEmpty ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = MultipartRequest(null, null);
      if(hasFields)
        postBody = mp;
    }
    else {
    }

    var response = await apiClient.invokeAPI(path,
                                             'GET',
                                             queryParams,
                                             postBody,
                                             headerParams,
                                             formParams,
                                             contentType,
                                             authNames);
    return response;
  }

  /// Get step state
  ///
  /// 
  Future<PipelineExecutionStepState> stepState(String programId, String pipelineId, String executionId, String phaseId, String stepId, String xGwImsOrgId, String authorization, String xApiKey) async {
    Response response = await stepStateWithHttpInfo(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey);
    if(response.statusCode >= 400) {
      throw ApiException(response.statusCode, _decodeBodyBytes(response));
    } else if(response.body != null) {
      return apiClient.deserialize(_decodeBodyBytes(response), 'PipelineExecutionStepState') as PipelineExecutionStepState;
    } else {
      return null;
    }
  }

}
