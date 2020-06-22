part of openapi.api;



class VariablesApi {
  final ApiClient apiClient;

  VariablesApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  /// List User Environment Variables with HTTP info returned
  ///
  /// List the user defined variables for an environment (Cloud Service only).
  Future<Response> getEnvironmentVariablesWithHttpInfo(String programId, String environmentId, String xGwImsOrgId, String authorization, String xApiKey) async {
    Object postBody;

    // verify required params are set
    if(programId == null) {
     throw ApiException(400, "Missing required param: programId");
    }
    if(environmentId == null) {
     throw ApiException(400, "Missing required param: environmentId");
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
    String path = "/api/program/{programId}/environment/{environmentId}/variables".replaceAll("{format}","json").replaceAll("{" + "programId" + "}", programId.toString()).replaceAll("{" + "environmentId" + "}", environmentId.toString());

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

  /// List User Environment Variables
  ///
  /// List the user defined variables for an environment (Cloud Service only).
  Future<VariableList> getEnvironmentVariables(String programId, String environmentId, String xGwImsOrgId, String authorization, String xApiKey) async {
    Response response = await getEnvironmentVariablesWithHttpInfo(programId, environmentId, xGwImsOrgId, authorization, xApiKey);
    if(response.statusCode >= 400) {
      throw ApiException(response.statusCode, _decodeBodyBytes(response));
    } else if(response.body != null) {
      return apiClient.deserialize(_decodeBodyBytes(response), 'VariableList') as VariableList;
    } else {
      return null;
    }
  }

  /// Patch User Environment Variables with HTTP info returned
  ///
  /// Modify multiple environment variables (Cloud Service only). To delete a variable, include it with an empty value.
  Future<Response> patchEnvironmentVariablesWithHttpInfo(String programId, String environmentId, String xGwImsOrgId, String authorization, String xApiKey, String contentType, List<Variable> body) async {
    Object postBody = body;

    // verify required params are set
    if(programId == null) {
     throw ApiException(400, "Missing required param: programId");
    }
    if(environmentId == null) {
     throw ApiException(400, "Missing required param: environmentId");
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
    String path = "/api/program/{programId}/environment/{environmentId}/variables".replaceAll("{format}","json").replaceAll("{" + "programId" + "}", programId.toString()).replaceAll("{" + "environmentId" + "}", environmentId.toString());

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

  /// Patch User Environment Variables
  ///
  /// Modify multiple environment variables (Cloud Service only). To delete a variable, include it with an empty value.
  Future<VariableList> patchEnvironmentVariables(String programId, String environmentId, String xGwImsOrgId, String authorization, String xApiKey, String contentType, List<Variable> body) async {
    Response response = await patchEnvironmentVariablesWithHttpInfo(programId, environmentId, xGwImsOrgId, authorization, xApiKey, contentType, body);
    if(response.statusCode >= 400) {
      throw ApiException(response.statusCode, _decodeBodyBytes(response));
    } else if(response.body != null) {
      return apiClient.deserialize(_decodeBodyBytes(response), 'VariableList') as VariableList;
    } else {
      return null;
    }
  }

}
