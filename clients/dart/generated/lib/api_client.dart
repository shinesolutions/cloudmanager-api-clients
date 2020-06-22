part of openapi.api;

class QueryParam {
  String name;
  String value;

  QueryParam(this.name, this.value);
}

class ApiClient {

  String basePath;
  var client = Client();

  Map<String, String> _defaultHeaderMap = {};
  Map<String, Authentication> _authentications = {};

  final _regList = RegExp(r'^List<(.*)>$');
  final _regMap = RegExp(r'^Map<String,(.*)>$');

  ApiClient({this.basePath = "https://cloudmanager.adobe.io"}) {
    // Setup authentications (key: authentication name, value: authentication).
  }

  void addDefaultHeader(String key, String value) {
     _defaultHeaderMap[key] = value;
  }

  dynamic _deserialize(dynamic value, String targetType) {
    try {
      switch (targetType) {
        case 'String':
          return '$value';
        case 'int':
          return value is int ? value : int.parse('$value');
        case 'bool':
          return value is bool ? value : '$value'.toLowerCase() == 'true';
        case 'double':
          return value is double ? value : double.parse('$value');
        case 'BadRequestError':
          return BadRequestError.fromJson(value);
        case 'BranchList':
          return BranchList.fromJson(value);
        case 'BranchListEmbedded':
          return BranchListEmbedded.fromJson(value);
        case 'EmbeddedProgram':
          return EmbeddedProgram.fromJson(value);
        case 'Environment':
          return Environment.fromJson(value);
        case 'EnvironmentLinks':
          return EnvironmentLinks.fromJson(value);
        case 'EnvironmentList':
          return EnvironmentList.fromJson(value);
        case 'EnvironmentListEmbedded':
          return EnvironmentListEmbedded.fromJson(value);
        case 'EnvironmentLog':
          return EnvironmentLog.fromJson(value);
        case 'EnvironmentLogLinks':
          return EnvironmentLogLinks.fromJson(value);
        case 'EnvironmentLogs':
          return EnvironmentLogs.fromJson(value);
        case 'EnvironmentLogsEmbedded':
          return EnvironmentLogsEmbedded.fromJson(value);
        case 'EnvironmentLogsLinks':
          return EnvironmentLogsLinks.fromJson(value);
        case 'HalLink':
          return HalLink.fromJson(value);
        case 'InvalidParameter':
          return InvalidParameter.fromJson(value);
        case 'Metric':
          return Metric.fromJson(value);
        case 'MissingParameter':
          return MissingParameter.fromJson(value);
        case 'Pipeline':
          return Pipeline.fromJson(value);
        case 'PipelineExecution':
          return PipelineExecution.fromJson(value);
        case 'PipelineExecutionEmbedded':
          return PipelineExecutionEmbedded.fromJson(value);
        case 'PipelineExecutionLinks':
          return PipelineExecutionLinks.fromJson(value);
        case 'PipelineExecutionListRepresentation':
          return PipelineExecutionListRepresentation.fromJson(value);
        case 'PipelineExecutionListRepresentationEmbedded':
          return PipelineExecutionListRepresentationEmbedded.fromJson(value);
        case 'PipelineExecutionListRepresentationLinks':
          return PipelineExecutionListRepresentationLinks.fromJson(value);
        case 'PipelineExecutionStepState':
          return PipelineExecutionStepState.fromJson(value);
        case 'PipelineExecutionStepStateLinks':
          return PipelineExecutionStepStateLinks.fromJson(value);
        case 'PipelineLinks':
          return PipelineLinks.fromJson(value);
        case 'PipelineList':
          return PipelineList.fromJson(value);
        case 'PipelineListEmbedded':
          return PipelineListEmbedded.fromJson(value);
        case 'PipelinePhase':
          return PipelinePhase.fromJson(value);
        case 'PipelineStepMetrics':
          return PipelineStepMetrics.fromJson(value);
        case 'Program':
          return Program.fromJson(value);
        case 'ProgramLinks':
          return ProgramLinks.fromJson(value);
        case 'ProgramList':
          return ProgramList.fromJson(value);
        case 'ProgramListEmbedded':
          return ProgramListEmbedded.fromJson(value);
        case 'ProgramListLinks':
          return ProgramListLinks.fromJson(value);
        case 'Repository':
          return Repository.fromJson(value);
        case 'RepositoryBranch':
          return RepositoryBranch.fromJson(value);
        case 'RepositoryBranchLinks':
          return RepositoryBranchLinks.fromJson(value);
        case 'RepositoryLinks':
          return RepositoryLinks.fromJson(value);
        case 'RepositoryList':
          return RepositoryList.fromJson(value);
        case 'RepositoryListEmbedded':
          return RepositoryListEmbedded.fromJson(value);
        case 'RequestedPageDetails':
          return RequestedPageDetails.fromJson(value);
        case 'Variable':
          return Variable.fromJson(value);
        case 'VariableList':
          return VariableList.fromJson(value);
        case 'VariableListEmbedded':
          return VariableListEmbedded.fromJson(value);
        case 'VariableListLinks':
          return VariableListLinks.fromJson(value);
        default:
          {
            Match match;
            if (value is List &&
                (match = _regList.firstMatch(targetType)) != null) {
              var newTargetType = match[1];
              return value.map((v) => _deserialize(v, newTargetType)).toList();
            } else if (value is Map &&
                (match = _regMap.firstMatch(targetType)) != null) {
              var newTargetType = match[1];
              return Map.fromIterables(value.keys,
                  value.values.map((v) => _deserialize(v, newTargetType)));
            }
          }
      }
    } on Exception catch (e, stack) {
      throw ApiException.withInner(500, 'Exception during deserialization.', e, stack);
    }
    throw ApiException(500, 'Could not find a suitable class for deserialization');
  }

  dynamic deserialize(String json, String targetType) {
    // Remove all spaces.  Necessary for reg expressions as well.
    targetType = targetType.replaceAll(' ', '');

    if (targetType == 'String') return json;

    var decodedJson = jsonDecode(json);
    return _deserialize(decodedJson, targetType);
  }

  String serialize(Object obj) {
    String serialized = '';
    if (obj == null) {
      serialized = '';
    } else {
      serialized = json.encode(obj);
    }
    return serialized;
  }

  // We don't use a Map<String, String> for queryParams.
  // If collectionFormat is 'multi' a key might appear multiple times.
  Future<Response> invokeAPI(String path,
                             String method,
                             Iterable<QueryParam> queryParams,
                             Object body,
                             Map<String, String> headerParams,
                             Map<String, String> formParams,
                             String contentType,
                             List<String> authNames) async {

    _updateParamsForAuth(authNames, queryParams, headerParams);

    var ps = queryParams
      .where((p) => p.value != null)
      .map((p) => '${p.name}=${Uri.encodeQueryComponent(p.value)}');

    String queryString = ps.isNotEmpty ?
                         '?' + ps.join('&') :
                         '';

    String url = basePath + path + queryString;

    headerParams.addAll(_defaultHeaderMap);
    headerParams['Content-Type'] = contentType;

    if(body is MultipartRequest) {
      var request = MultipartRequest(method, Uri.parse(url));
      request.fields.addAll(body.fields);
      request.files.addAll(body.files);
      request.headers.addAll(body.headers);
      request.headers.addAll(headerParams);
      var response = await client.send(request);
      return Response.fromStream(response);
    } else {
      var msgBody = contentType == "application/x-www-form-urlencoded" ? formParams : serialize(body);
      switch(method) {
        case "POST":
          return client.post(url, headers: headerParams, body: msgBody);
        case "PUT":
          return client.put(url, headers: headerParams, body: msgBody);
        case "DELETE":
          return client.delete(url, headers: headerParams);
        case "PATCH":
          return client.patch(url, headers: headerParams, body: msgBody);
        case "HEAD":
          return client.head(url, headers: headerParams);
        default:
          return client.get(url, headers: headerParams);
      }
    }
  }

  /// Update query and header parameters based on authentication settings.
  /// @param authNames The authentications to apply
  void _updateParamsForAuth(List<String> authNames, List<QueryParam> queryParams, Map<String, String> headerParams) {
    authNames.forEach((authName) {
      Authentication auth = _authentications[authName];
      if (auth == null) throw ArgumentError("Authentication undefined: " + authName);
      auth.applyToParams(queryParams, headerParams);
    });
  }

  T getAuthentication<T extends Authentication>(String name) {
    var authentication = _authentications[name];

    return authentication is T ? authentication : null;
  }
}
