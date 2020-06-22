part of openapi.api;

class MissingParameter {
  /* Name of the missing parameter. */
  String name = null;
  /* Type of the missing parameter. */
  String type = null;
  MissingParameter();

  @override
  String toString() {
    return 'MissingParameter[name=$name, type=$type, ]';
  }

  MissingParameter.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    name = json['name'];
    type = json['type'];
  }

  Map<String, dynamic> toJson() {
    Map <String, dynamic> json = {};
    if (name != null)
      json['name'] = name;
    if (type != null)
      json['type'] = type;
    return json;
  }

  static List<MissingParameter> listFromJson(List<dynamic> json) {
    return json == null ? List<MissingParameter>() : json.map((value) => MissingParameter.fromJson(value)).toList();
  }

  static Map<String, MissingParameter> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, MissingParameter>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = MissingParameter.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of MissingParameter-objects as value to a dart map
  static Map<String, List<MissingParameter>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<MissingParameter>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = MissingParameter.listFromJson(value);
       });
     }
     return map;
  }
}

