part of openapi.api;

class EnvironmentLogsEmbedded {
  /* Links to logs */
  List<EnvironmentLog> downloads = [];
  EnvironmentLogsEmbedded();

  @override
  String toString() {
    return 'EnvironmentLogsEmbedded[downloads=$downloads, ]';
  }

  EnvironmentLogsEmbedded.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    downloads = (json['downloads'] == null) ?
      null :
      EnvironmentLog.listFromJson(json['downloads']);
  }

  Map<String, dynamic> toJson() {
    Map <String, dynamic> json = {};
    if (downloads != null)
      json['downloads'] = downloads;
    return json;
  }

  static List<EnvironmentLogsEmbedded> listFromJson(List<dynamic> json) {
    return json == null ? List<EnvironmentLogsEmbedded>() : json.map((value) => EnvironmentLogsEmbedded.fromJson(value)).toList();
  }

  static Map<String, EnvironmentLogsEmbedded> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, EnvironmentLogsEmbedded>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = EnvironmentLogsEmbedded.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of EnvironmentLogsEmbedded-objects as value to a dart map
  static Map<String, List<EnvironmentLogsEmbedded>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<EnvironmentLogsEmbedded>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = EnvironmentLogsEmbedded.listFromJson(value);
       });
     }
     return map;
  }
}

