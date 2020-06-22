part of openapi.api;

class ProgramList {
  
  int totalNumberOfItems = null;
  
  ProgramListEmbedded embedded = null;
  
  ProgramListLinks links = null;
  ProgramList();

  @override
  String toString() {
    return 'ProgramList[totalNumberOfItems=$totalNumberOfItems, embedded=$embedded, links=$links, ]';
  }

  ProgramList.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    totalNumberOfItems = json['_totalNumberOfItems'];
    embedded = (json['_embedded'] == null) ?
      null :
      ProgramListEmbedded.fromJson(json['_embedded']);
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

  static List<ProgramList> listFromJson(List<dynamic> json) {
    return json == null ? List<ProgramList>() : json.map((value) => ProgramList.fromJson(value)).toList();
  }

  static Map<String, ProgramList> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, ProgramList>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = ProgramList.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of ProgramList-objects as value to a dart map
  static Map<String, List<ProgramList>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<ProgramList>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = ProgramList.listFromJson(value);
       });
     }
     return map;
  }
}

