part of openapi.api;

class EnvironmentList {
  
  int totalNumberOfItems = null;
  
  EnvironmentListEmbedded embedded = null;
  
  ProgramListLinks links = null;
  EnvironmentList();

  @override
  String toString() {
    return 'EnvironmentList[totalNumberOfItems=$totalNumberOfItems, embedded=$embedded, links=$links, ]';
  }

  EnvironmentList.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    totalNumberOfItems = json['_totalNumberOfItems'];
    embedded = (json['_embedded'] == null) ?
      null :
      EnvironmentListEmbedded.fromJson(json['_embedded']);
    links = (json['_links'] == null) ?
      null :
      ProgramListLinks.fromJson(json['_links']);
  }

  Map<String, dynamic> toJson() {
    Map <String, dynamic> json = {};
    if (totalNumberOfItems != null)
      json['_totalNumberOfItems'] = totalNumberOfItems;
    if (embedded != null)
      json['_embedded'] = embedded;
    if (links != null)
      json['_links'] = links;
    return json;
  }

  static List<EnvironmentList> listFromJson(List<dynamic> json) {
    return json == null ? List<EnvironmentList>() : json.map((value) => EnvironmentList.fromJson(value)).toList();
  }

  static Map<String, EnvironmentList> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, EnvironmentList>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = EnvironmentList.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of EnvironmentList-objects as value to a dart map
  static Map<String, List<EnvironmentList>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<EnvironmentList>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = EnvironmentList.listFromJson(value);
       });
     }
     return map;
  }
}

