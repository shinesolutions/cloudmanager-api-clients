part of openapi.api;

class BadRequestError {
  /* HTTP status code of the response. */
  int status = null;
  /* Error type identifier. */
  String type = null;
  /* A short summary of the error. */
  String title = null;
  /* Request's missing parameters. */
  List<MissingParameter> missingParams = [];
  /* Request's invalid parameters. */
  List<InvalidParameter> invalidParams = [];
  BadRequestError();

  @override
  String toString() {
    return 'BadRequestError[status=$status, type=$type, title=$title, missingParams=$missingParams, invalidParams=$invalidParams, ]';
  }

  BadRequestError.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    status = json['status'];
    type = json['type'];
    title = json['title'];
    missingParams = (json['missingParams'] == null) ?
      null :
      MissingParameter.listFromJson(json['missingParams']);
    invalidParams = (json['invalidParams'] == null) ?
      null :
      InvalidParameter.listFromJson(json['invalidParams']);
  }

  Map<String, dynamic> toJson() {
    Map <String, dynamic> json = {};
    if (status != null)
      json['status'] = status;
    if (type != null)
      json['type'] = type;
    if (title != null)
      json['title'] = title;
    if (missingParams != null)
      json['missingParams'] = missingParams;
    if (invalidParams != null)
      json['invalidParams'] = invalidParams;
    return json;
  }

  static List<BadRequestError> listFromJson(List<dynamic> json) {
    return json == null ? List<BadRequestError>() : json.map((value) => BadRequestError.fromJson(value)).toList();
  }

  static Map<String, BadRequestError> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, BadRequestError>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = BadRequestError.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of BadRequestError-objects as value to a dart map
  static Map<String, List<BadRequestError>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<BadRequestError>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = BadRequestError.listFromJson(value);
       });
     }
     return map;
  }
}

