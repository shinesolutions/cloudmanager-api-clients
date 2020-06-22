part of openapi.api;

class PipelineList {
  
  int totalNumberOfItems = null;
  
  PipelineListEmbedded embedded = null;
  
  ProgramListLinks links = null;
  PipelineList();

  @override
  String toString() {
    return 'PipelineList[totalNumberOfItems=$totalNumberOfItems, embedded=$embedded, links=$links, ]';
  }

  PipelineList.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    totalNumberOfItems = json['_totalNumberOfItems'];
    embedded = (json['_embedded'] == null) ?
      null :
      PipelineListEmbedded.fromJson(json['_embedded']);
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

  static List<PipelineList> listFromJson(List<dynamic> json) {
    return json == null ? List<PipelineList>() : json.map((value) => PipelineList.fromJson(value)).toList();
  }

  static Map<String, PipelineList> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, PipelineList>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = PipelineList.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of PipelineList-objects as value to a dart map
  static Map<String, List<PipelineList>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<PipelineList>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = PipelineList.listFromJson(value);
       });
     }
     return map;
  }
}

