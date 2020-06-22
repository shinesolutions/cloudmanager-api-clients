part of openapi.api;



class ProgramsApi {
  final ApiClient apiClient;

  ProgramsApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  /// Delete Program with HTTP info returned
  ///
  /// Delete an program
  Future<Response> deleteProgramWithHttpInfo(String programId, String xGwImsOrgId, String authorization, String xApiKey) async {
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
    String path = "/api/program/{programId}".replaceAll("{format}","json").replaceAll("{" + "programId" + "}", programId.toString());

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

  /// Delete Program
  ///
  /// Delete an program
  Future<Program> deleteProgram(String programId, String xGwImsOrgId, String authorization, String xApiKey) async {
    Response response = await deleteProgramWithHttpInfo(programId, xGwImsOrgId, authorization, xApiKey);
    if(response.statusCode >= 400) {
      throw ApiException(response.statusCode, _decodeBodyBytes(response));
    } else if(response.body != null) {
      return apiClient.deserialize(_decodeBodyBytes(response), 'Program') as Program;
    } else {
      return null;
    }
  }

  /// Get Program with HTTP info returned
  ///
  /// Returns a program by its id
  Future<Response> getProgramWithHttpInfo(String programId, String xGwImsOrgId, String authorization, String xApiKey) async {
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
    String path = "/api/program/{programId}".replaceAll("{format}","json").replaceAll("{" + "programId" + "}", programId.toString());

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

  /// Get Program
  ///
  /// Returns a program by its id
  Future<Program> getProgram(String programId, String xGwImsOrgId, String authorization, String xApiKey) async {
    Response response = await getProgramWithHttpInfo(programId, xGwImsOrgId, authorization, xApiKey);
    if(response.statusCode >= 400) {
      throw ApiException(response.statusCode, _decodeBodyBytes(response));
    } else if(response.body != null) {
      return apiClient.deserialize(_decodeBodyBytes(response), 'Program') as Program;
    } else {
      return null;
    }
  }

  /// Lists Programs with HTTP info returned
  ///
  /// Returns all programs that the requesting user has access to
  Future<Response> getProgramsWithHttpInfo(String xGwImsOrgId, String authorization, String xApiKey) async {
    Object postBody;

    // verify required params are set
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
    String path = "/api/programs".replaceAll("{format}","json");

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

  /// Lists Programs
  ///
  /// Returns all programs that the requesting user has access to
  Future<ProgramList> getPrograms(String xGwImsOrgId, String authorization, String xApiKey) async {
    Response response = await getProgramsWithHttpInfo(xGwImsOrgId, authorization, xApiKey);
    if(response.statusCode >= 400) {
      throw ApiException(response.statusCode, _decodeBodyBytes(response));
    } else if(response.body != null) {
      return apiClient.deserialize(_decodeBodyBytes(response), 'ProgramList') as ProgramList;
    } else {
      return null;
    }
  }

}
