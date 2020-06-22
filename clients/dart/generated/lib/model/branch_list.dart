part of openapi.api;

class BranchList {
  
  int totalNumberOfItems = null;
  
  BranchListEmbedded embedded = null;
  
  ProgramListLinks links = null;
  BranchList();

  @override
  String toString() {
    return 'BranchList[totalNumberOfItems=$totalNumberOfItems, embedded=$embedded, links=$links, ]';
  }

  BranchList.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    totalNumberOfItems = json['_totalNumberOfItems'];
    embedded = (json['_embedded'] == null) ?
      null :
      BranchListEmbedded.fromJson(json['_embedded']);
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

  static List<BranchList> listFromJson(List<dynamic> json) {
    return json == null ? List<BranchList>() : json.map((value) => BranchList.fromJson(value)).toList();
  }

  static Map<String, BranchList> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, BranchList>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = BranchList.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of BranchList-objects as value to a dart map
  static Map<String, List<BranchList>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<BranchList>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = BranchList.listFromJson(value);
       });
     }
     return map;
  }
}

