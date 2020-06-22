part of openapi.api;

class EnvironmentLog {
  /* Name of the service */
  String service = null;
  /* Name of the Log */
  String name = null;
  /* date of the Log */
  String date = null;
  
  int programId = null;
  
  int environmentId = null;
  
  EnvironmentLogLinks links = null;
  EnvironmentLog();

  @override
  String toString() {
    return 'EnvironmentLog[service=$service, name=$name, date=$date, programId=$programId, environmentId=$environmentId, links=$links, ]';
  }

  EnvironmentLog.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    service = json['service'];
    name = json['name'];
    date = json['date'];
    programId = json['programId'];
    environmentId = json['environmentId'];
    links = (json['_links'] == null) ?
      null :
      EnvironmentLogLinks.fromJson(json['_links']);
  }

  Map<String, dynamic> toJson() {
    Map <String, dynamic> json = {};
    if (service != null)
      json['service'] = service;
    if (name != null)
      json['name'] = name;
    if (date != null)
      json['date'] = date;
    if (programId != null)
      json['programId'] = programId;
    if (environmentId != null)
      json['environmentId'] = environmentId;
    if (links != null)
      json['_links'] = links;
    return json;
  }

  static List<EnvironmentLog> listFromJson(List<dynamic> json) {
    return json == null ? List<EnvironmentLog>() : json.map((value) => EnvironmentLog.fromJson(value)).toList();
  }

  static Map<String, EnvironmentLog> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, EnvironmentLog>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = EnvironmentLog.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of EnvironmentLog-objects as value to a dart map
  static Map<String, List<EnvironmentLog>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<EnvironmentLog>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = EnvironmentLog.listFromJson(value);
       });
     }
     return map;
  }
}

