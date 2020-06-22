part of openapi.api;

class VariableList {
  
  int totalNumberOfItems = null;
  
  VariableListEmbedded embedded = null;
  
  VariableListLinks links = null;
  VariableList();

  @override
  String toString() {
    return 'VariableList[totalNumberOfItems=$totalNumberOfItems, embedded=$embedded, links=$links, ]';
  }

  VariableList.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    totalNumberOfItems = json['_totalNumberOfItems'];
    embedded = (json['_embedded'] == null) ?
      null :
      VariableListEmbedded.fromJson(json['_embedded']);
    links = (json['_links'] == null) ?
      null :
      VariableListLinks.fromJson(json['_links']);
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

  static List<VariableList> listFromJson(List<dynamic> json) {
    return json == null ? List<VariableList>() : json.map((value) => VariableList.fromJson(value)).toList();
  }

  static Map<String, VariableList> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, VariableList>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = VariableList.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of VariableList-objects as value to a dart map
  static Map<String, List<VariableList>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<VariableList>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = VariableList.listFromJson(value);
       });
     }
     return map;
  }
}

