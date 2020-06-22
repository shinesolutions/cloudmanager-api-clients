part of openapi.api;



class BranchesApi {
  final ApiClient apiClient;

  BranchesApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  /// List Branches with HTTP info returned
  ///
  /// Returns the list of branches from a repository
  Future<Response> getBranchesWithHttpInfo(String programId, String repositoryId, String xGwImsOrgId, String authorization, String xApiKey) async {
    Object postBody;

    // verify required params are set
    if(programId == null) {
     throw ApiException(400, "Missing required param: programId");
    }
    if(repositoryId == null) {
     throw ApiException(400, "Missing required param: repositoryId");
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
    String path = "/api/program/{programId}/repository/{repositoryId}/branches".replaceAll("{format}","json").replaceAll("{" + "programId" + "}", programId.toString()).replaceAll("{" + "repositoryId" + "}", repositoryId.toString());

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

  /// List Branches
  ///
  /// Returns the list of branches from a repository
  Future<BranchList> getBranches(String programId, String repositoryId, String xGwImsOrgId, String authorization, String xApiKey) async {
    Response response = await getBranchesWithHttpInfo(programId, repositoryId, xGwImsOrgId, authorization, xApiKey);
    if(response.statusCode >= 400) {
      throw ApiException(response.statusCode, _decodeBodyBytes(response));
    } else if(response.body != null) {
      return apiClient.deserialize(_decodeBodyBytes(response), 'BranchList') as BranchList;
    } else {
      return null;
    }
  }

}
