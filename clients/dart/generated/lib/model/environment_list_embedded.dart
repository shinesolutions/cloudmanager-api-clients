part of openapi.api;

class EnvironmentListEmbedded {
  
  List<Environment> environments = [];
  EnvironmentListEmbedded();

  @override
  String toString() {
    return 'EnvironmentListEmbedded[environments=$environments, ]';
  }

  EnvironmentListEmbedded.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    environments = (json['environments'] == null) ?
      null :
      Environment.listFromJson(json['environments']);
  }

  Map<String, dynamic> toJson() {
    Map <String, dynamic> json = {};
    if (environments != null)
      json['environments'] = environments;
    return json;
  }

  static List<EnvironmentListEmbedded> listFromJson(List<dynamic> json) {
    return json == null ? List<EnvironmentListEmbedded>() : json.map((value) => EnvironmentListEmbedded.fromJson(value)).toList();
  }

  static Map<String, EnvironmentListEmbedded> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, EnvironmentListEmbedded>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = EnvironmentListEmbedded.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of EnvironmentListEmbedded-objects as value to a dart map
  static Map<String, List<EnvironmentListEmbedded>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<EnvironmentListEmbedded>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = EnvironmentListEmbedded.listFromJson(value);
       });
     }
     return map;
  }
}

