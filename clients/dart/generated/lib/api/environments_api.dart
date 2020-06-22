part of openapi.api;



class EnvironmentsApi {
  final ApiClient apiClient;

  EnvironmentsApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  /// DeleteEnvironment with HTTP info returned
  ///
  /// Delete environment
  Future<Response> deleteEnvironmentWithHttpInfo(String programId, String environmentId, String xGwImsOrgId, String authorization, String xApiKey) async {
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
    String path = "/api/program/{programId}/environment/{environmentId}".replaceAll("{format}","json").replaceAll("{" + "programId" + "}", programId.toString()).replaceAll("{" + "environmentId" + "}", environmentId.toString());

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

  /// DeleteEnvironment
  ///
  /// Delete environment
  Future<Environment> deleteEnvironment(String programId, String environmentId, String xGwImsOrgId, String authorization, String xApiKey) async {
    Response response = await deleteEnvironmentWithHttpInfo(programId, environmentId, xGwImsOrgId, authorization, xApiKey);
    if(response.statusCode >= 400) {
      throw ApiException(response.statusCode, _decodeBodyBytes(response));
    } else if(response.body != null) {
      return apiClient.deserialize(_decodeBodyBytes(response), 'Environment') as Environment;
    } else {
      return null;
    }
  }

  /// Download Logs with HTTP info returned
  ///
  /// Download environment logs
  Future downloadLogsWithHttpInfo(String programId, String environmentId, String service, String name, String date, String xGwImsOrgId, String authorization, String xApiKey, { String accept }) async {
    Object postBody;

    // verify required params are set
    if(programId == null) {
     throw ApiException(400, "Missing required param: programId");
    }
    if(environmentId == null) {
     throw ApiException(400, "Missing required param: environmentId");
    }
    if(service == null) {
     throw ApiException(400, "Missing required param: service");
    }
    if(name == null) {
     throw ApiException(400, "Missing required param: name");
    }
    if(date == null) {
     throw ApiException(400, "Missing required param: date");
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
    String path = "/api/program/{programId}/environment/{environmentId}/logs/download".replaceAll("{format}","json").replaceAll("{" + "programId" + "}", programId.toString()).replaceAll("{" + "environmentId" + "}", environmentId.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
      queryParams.addAll(_convertParametersForCollectionFormat("", "service", service));
      queryParams.addAll(_convertParametersForCollectionFormat("", "name", name));
      queryParams.addAll(_convertParametersForCollectionFormat("", "date", date));
    headerParams["x-gw-ims-org-id"] = xGwImsOrgId;
    headerParams["Authorization"] = authorization;
    headerParams["x-api-key"] = xApiKey;
    headerParams["Accept"] = accept;

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

  /// Download Logs
  ///
  /// Download environment logs
  Future downloadLogs(String programId, String environmentId, String service, String name, String date, String xGwImsOrgId, String authorization, String xApiKey, { String accept }) async {
    Response response = await downloadLogsWithHttpInfo(programId, environmentId, service, name, date, xGwImsOrgId, authorization, xApiKey,  accept: accept );
    if(response.statusCode >= 400) {
      throw ApiException(response.statusCode, _decodeBodyBytes(response));
    } else if(response.body != null) {
    } else {
      return;
    }
  }

  /// Get Environment with HTTP info returned
  ///
  /// Returns an environment by its id
  Future<Response> getEnvironmentWithHttpInfo(String programId, String environmentId, String xGwImsOrgId, String authorization, String xApiKey) async {
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
    String path = "/api/program/{programId}/environment/{environmentId}".replaceAll("{format}","json").replaceAll("{" + "programId" + "}", programId.toString()).replaceAll("{" + "environmentId" + "}", environmentId.toString());

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

  /// Get Environment
  ///
  /// Returns an environment by its id
  Future<Environment> getEnvironment(String programId, String environmentId, String xGwImsOrgId, String authorization, String xApiKey) async {
    Response response = await getEnvironmentWithHttpInfo(programId, environmentId, xGwImsOrgId, authorization, xApiKey);
    if(response.statusCode >= 400) {
      throw ApiException(response.statusCode, _decodeBodyBytes(response));
    } else if(response.body != null) {
      return apiClient.deserialize(_decodeBodyBytes(response), 'Environment') as Environment;
    } else {
      return null;
    }
  }

  /// Get Environment Logs with HTTP info returned
  ///
  /// List all logs available in environment
  Future<Response> getEnvironmentLogsWithHttpInfo(String programId, String environmentId, int days, String xGwImsOrgId, String authorization, String xApiKey, { List<String> service, List<String> name }) async {
    Object postBody;

    // verify required params are set
    if(programId == null) {
     throw ApiException(400, "Missing required param: programId");
    }
    if(environmentId == null) {
     throw ApiException(400, "Missing required param: environmentId");
    }
    if(days == null) {
     throw ApiException(400, "Missing required param: days");
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
    String path = "/api/program/{programId}/environment/{environmentId}/logs".replaceAll("{format}","json").replaceAll("{" + "programId" + "}", programId.toString()).replaceAll("{" + "environmentId" + "}", environmentId.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if(service != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("multi", "service", service));
    }
    if(name != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("multi", "name", name));
    }
      queryParams.addAll(_convertParametersForCollectionFormat("", "days", days));
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

  /// Get Environment Logs
  ///
  /// List all logs available in environment
  Future<EnvironmentLogs> getEnvironmentLogs(String programId, String environmentId, int days, String xGwImsOrgId, String authorization, String xApiKey, { List<String> service, List<String> name }) async {
    Response response = await getEnvironmentLogsWithHttpInfo(programId, environmentId, days, xGwImsOrgId, authorization, xApiKey,  service: service, name: name );
    if(response.statusCode >= 400) {
      throw ApiException(response.statusCode, _decodeBodyBytes(response));
    } else if(response.body != null) {
      return apiClient.deserialize(_decodeBodyBytes(response), 'EnvironmentLogs') as EnvironmentLogs;
    } else {
      return null;
    }
  }

  /// List Environments with HTTP info returned
  ///
  /// Lists all environments in an program
  Future<Response> getEnvironmentsWithHttpInfo(String programId, String xGwImsOrgId, String authorization, String xApiKey, { String type }) async {
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
    String path = "/api/program/{programId}/environments".replaceAll("{format}","json").replaceAll("{" + "programId" + "}", programId.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if(type != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "type", type));
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

  /// List Environments
  ///
  /// Lists all environments in an program
  Future<EnvironmentList> getEnvironments(String programId, String xGwImsOrgId, String authorization, String xApiKey, { String type }) async {
    Response response = await getEnvironmentsWithHttpInfo(programId, xGwImsOrgId, authorization, xApiKey,  type: type );
    if(response.statusCode >= 400) {
      throw ApiException(response.statusCode, _decodeBodyBytes(response));
    } else if(response.body != null) {
      return apiClient.deserialize(_decodeBodyBytes(response), 'EnvironmentList') as EnvironmentList;
    } else {
      return null;
    }
  }

}
