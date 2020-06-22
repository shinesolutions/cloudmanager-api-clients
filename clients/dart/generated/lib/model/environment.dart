part of openapi.api;

class Environment {
  /* id */
  String id = null;
  /* Identifier of the program. Unique within the space. */
  String programId = null;
  /* Name of the environment */
  String name = null;
  /* Description of the environment */
  String description = null;
  /* Type of the environment */
  String type = null;
  //enum typeEnum {  dev,  stage,  prod,  };{
  
  EnvironmentLinks links = null;
  Environment();

  @override
  String toString() {
    return 'Environment[id=$id, programId=$programId, name=$name, description=$description, type=$type, links=$links, ]';
  }

  Environment.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    id = json['id'];
    programId = json['programId'];
    name = json['name'];
    description = json['description'];
    type = json['type'];
    links = (json['_links'] == null) ?
      null :
      EnvironmentLinks.fromJson(json['_links']);
  }

  Map<String, dynamic> toJson() {
    Map <String, dynamic> json = {};
    if (id != null)
      json['id'] = id;
    if (programId != null)
      json['programId'] = programId;
    if (name != null)
      json['name'] = name;
    if (description != null)
      json['description'] = description;
    if (type != null)
      json['type'] = type;
    if (links != null)
      json['_links'] = links;
    return json;
  }

  static List<Environment> listFromJson(List<dynamic> json) {
    return json == null ? List<Environment>() : json.map((value) => Environment.fromJson(value)).toList();
  }

  static Map<String, Environment> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, Environment>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = Environment.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of Environment-objects as value to a dart map
  static Map<String, List<Environment>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<Environment>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = Environment.listFromJson(value);
       });
     }
     return map;
  }
}

