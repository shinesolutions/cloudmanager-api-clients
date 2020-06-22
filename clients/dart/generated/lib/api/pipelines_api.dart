part of openapi.api;



class PipelinesApi {
  final ApiClient apiClient;

  PipelinesApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  /// Delete a Pipeline with HTTP info returned
  ///
  /// Delete a pipeline. All the data is wiped.
  Future deletePipelineWithHttpInfo(String programId, String pipelineId, String xGwImsOrgId, String authorization, String xApiKey) async {
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
    String path = "/api/program/{programId}/pipeline/{pipelineId}".replaceAll("{format}","json").replaceAll("{" + "programId" + "}", programId.toString()).replaceAll("{" + "pipelineId" + "}", pipelineId.toString());

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
                                             'DELETE',
                                             queryParams,
                                             postBody,
                                             headerParams,
                                             formParams,
                                             contentType,
                                             authNames);
    return response;
  }

  /// Delete a Pipeline
  ///
  /// Delete a pipeline. All the data is wiped.
  Future deletePipeline(String programId, String pipelineId, String xGwImsOrgId, String authorization, String xApiKey) async {
    Response response = await deletePipelineWithHttpInfo(programId, pipelineId, xGwImsOrgId, authorization, xApiKey);
    if(response.statusCode >= 400) {
      throw ApiException(response.statusCode, _decodeBodyBytes(response));
    } else if(response.body != null) {
    } else {
      return;
    }
  }

  /// Get Pipeline with HTTP info returned
  ///
  /// Returns a pipeline by its id
  Future<Response> getPipelineWithHttpInfo(String programId, String pipelineId, String xGwImsOrgId, String authorization, String xApiKey) async {
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
    String path = "/api/program/{programId}/pipeline/{pipelineId}".replaceAll("{format}","json").replaceAll("{" + "programId" + "}", programId.toString()).replaceAll("{" + "pipelineId" + "}", pipelineId.toString());

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

  /// Get Pipeline
  ///
  /// Returns a pipeline by its id
  Future<Pipeline> getPipeline(String programId, String pipelineId, String xGwImsOrgId, String authorization, String xApiKey) async {
    Response response = await getPipelineWithHttpInfo(programId, pipelineId, xGwImsOrgId, authorization, xApiKey);
    if(response.statusCode >= 400) {
      throw ApiException(response.statusCode, _decodeBodyBytes(response));
    } else if(response.body != null) {
      return apiClient.deserialize(_decodeBodyBytes(response), 'Pipeline') as Pipeline;
    } else {
      return null;
    }
  }

  /// List Pipelines with HTTP info returned
  ///
  /// Returns all the pipelines that the requesting user has access to in an program
  Future<Response> getPipelinesWithHttpInfo(String programId, String xGwImsOrgId, String authorization, String xApiKey) async {
    Object postBody;

    // verify required params are set
    if(programId == null) {
     throw ApiException(400, "Missing required param: programId");
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
    String path = "/api/program/{programId}/pipelines".replaceAll("{format}","json").replaceAll("{" + "programId" + "}", programId.toString());

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

  /// List Pipelines
  ///
  /// Returns all the pipelines that the requesting user has access to in an program
  Future<PipelineList> getPipelines(String programId, String xGwImsOrgId, String authorization, String xApiKey) async {
    Response response = await getPipelinesWithHttpInfo(programId, xGwImsOrgId, authorization, xApiKey);
    if(response.statusCode >= 400) {
      throw ApiException(response.statusCode, _decodeBodyBytes(response));
    } else if(response.body != null) {
      return apiClient.deserialize(_decodeBodyBytes(response), 'PipelineList') as PipelineList;
    } else {
      return null;
    }
  }

  /// Patches Pipeline with HTTP info returned
  ///
  /// Patches a pipeline within an program.
  Future<Response> patchPipelineWithHttpInfo(String programId, String pipelineId, String xGwImsOrgId, String authorization, String xApiKey, String contentType, Pipeline body) async {
    Object postBody = body;

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
    if(body == null) {
     throw ApiException(400, "Missing required param: body");
    }

    // create path and map variables
    String path = "/api/program/{programId}/pipeline/{pipelineId}".replaceAll("{format}","json").replaceAll("{" + "programId" + "}", programId.toString()).replaceAll("{" + "pipelineId" + "}", pipelineId.toString());

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
                                             'PATCH',
                                             queryParams,
                                             postBody,
                                             headerParams,
                                             formParams,
                                             contentType,
                                             authNames);
    return response;
  }

  /// Patches Pipeline
  ///
  /// Patches a pipeline within an program.
  Future<Pipeline> patchPipeline(String programId, String pipelineId, String xGwImsOrgId, String authorization, String xApiKey, String contentType, Pipeline body) async {
    Response response = await patchPipelineWithHttpInfo(programId, pipelineId, xGwImsOrgId, authorization, xApiKey, contentType, body);
    if(response.statusCode >= 400) {
      throw ApiException(response.statusCode, _decodeBodyBytes(response));
    } else if(response.body != null) {
      return apiClient.deserialize(_decodeBodyBytes(response), 'Pipeline') as Pipeline;
    } else {
      return null;
    }
  }

}
