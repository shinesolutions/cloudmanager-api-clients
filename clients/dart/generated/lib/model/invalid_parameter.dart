part of openapi.api;

class InvalidParameter {
  /* Name of the invalid parameter. */
  String name = null;
  /* Reason of why the parameter's value is not accepted. */
  String reason = null;
  InvalidParameter();

  @override
  String toString() {
    return 'InvalidParameter[name=$name, reason=$reason, ]';
  }

  InvalidParameter.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    name = json['name'];
    reason = json['reason'];
  }

  Map<String, dynamic> toJson() {
    Map <String, dynamic> json = {};
    if (name != null)
      json['name'] = name;
    if (reason != null)
      json['reason'] = reason;
    return json;
  }

  static List<InvalidParameter> listFromJson(List<dynamic> json) {
    return json == null ? List<InvalidParameter>() : json.map((value) => InvalidParameter.fromJson(value)).toList();
  }

  static Map<String, InvalidParameter> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, InvalidParameter>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = InvalidParameter.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of InvalidParameter-objects as value to a dart map
  static Map<String, List<InvalidParameter>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<InvalidParameter>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = InvalidParameter.listFromJson(value);
       });
     }
     return map;
  }
}

