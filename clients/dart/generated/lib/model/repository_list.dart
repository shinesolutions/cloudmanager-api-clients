part of openapi.api;

class RepositoryList {
  
  int totalNumberOfItems = null;
  
  RepositoryListEmbedded embedded = null;
  
  ProgramListLinks links = null;
  RepositoryList();

  @override
  String toString() {
    return 'RepositoryList[totalNumberOfItems=$totalNumberOfItems, embedded=$embedded, links=$links, ]';
  }

  RepositoryList.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    totalNumberOfItems = json['_totalNumberOfItems'];
    embedded = (json['_embedded'] == null) ?
      null :
      RepositoryListEmbedded.fromJson(json['_embedded']);
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

  static List<RepositoryList> listFromJson(List<dynamic> json) {
    return json == null ? List<RepositoryList>() : json.map((value) => RepositoryList.fromJson(value)).toList();
  }

  static Map<String, RepositoryList> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, RepositoryList>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = RepositoryList.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of RepositoryList-objects as value to a dart map
  static Map<String, List<RepositoryList>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<RepositoryList>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = RepositoryList.listFromJson(value);
       });
     }
     return map;
  }
}

