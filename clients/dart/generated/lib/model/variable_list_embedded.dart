part of openapi.api;

class VariableListEmbedded {
  /* Variables set on environment */
  List<Variable> variables = [];
  VariableListEmbedded();

  @override
  String toString() {
    return 'VariableListEmbedded[variables=$variables, ]';
  }

  VariableListEmbedded.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    variables = (json['variables'] == null) ?
      null :
      Variable.listFromJson(json['variables']);
  }

  Map<String, dynamic> toJson() {
    Map <String, dynamic> json = {};
    if (variables != null)
      json['variables'] = variables;
    return json;
  }

  static List<VariableListEmbedded> listFromJson(List<dynamic> json) {
    return json == null ? List<VariableListEmbedded>() : json.map((value) => VariableListEmbedded.fromJson(value)).toList();
  }

  static Map<String, VariableListEmbedded> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, VariableListEmbedded>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = VariableListEmbedded.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of VariableListEmbedded-objects as value to a dart map
  static Map<String, List<VariableListEmbedded>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<VariableListEmbedded>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = VariableListEmbedded.listFromJson(value);
       });
     }
     return map;
  }
}

