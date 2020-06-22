part of openapi.api;

class EnvironmentLogs {
  /* Name of the service */
  List<String> service = [];
  /* Name of the Log */
  List<String> name = [];
  /* Number of days */
  int days = null;
  
  EnvironmentLogsLinks links = null;
  
  EnvironmentLogsEmbedded embedded = null;
  EnvironmentLogs();

  @override
  String toString() {
    return 'EnvironmentLogs[service=$service, name=$name, days=$days, links=$links, embedded=$embedded, ]';
  }

  EnvironmentLogs.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    service = (json['service'] == null) ?
      null :
      (json['service'] as List).cast<String>();
    name = (json['name'] == null) ?
      null :
      (json['name'] as List).cast<String>();
    days = json['days'];
    links = (json['_links'] == null) ?
      null :
      EnvironmentLogsLinks.fromJson(json['_links']);
    embedded = (json['_embedded'] == null) ?
      null :
      EnvironmentLogsEmbedded.fromJson(json['_embedded']);
  }

  Map<String, dynamic> toJson() {
    Map <String, dynamic> json = {};
    if (service != null)
      json['service'] = service;
    if (name != null)
      json['name'] = name;
    if (days != null)
      json['days'] = days;
    if (links != null)
      json['_links'] = links;
    if (embedded != null)
      json['_embedded'] = embedded;
    return json;
  }

  static List<EnvironmentLogs> listFromJson(List<dynamic> json) {
    return json == null ? List<EnvironmentLogs>() : json.map((value) => EnvironmentLogs.fromJson(value)).toList();
  }

  static Map<String, EnvironmentLogs> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, EnvironmentLogs>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = EnvironmentLogs.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of EnvironmentLogs-objects as value to a dart map
  static Map<String, List<EnvironmentLogs>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<EnvironmentLogs>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = EnvironmentLogs.listFromJson(value);
       });
     }
     return map;
  }
}

