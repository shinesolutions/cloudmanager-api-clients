part of openapi.api;

class PipelineExecutionListRepresentation {
  
  int totalNumberOfItems = null;
  
  RequestedPageDetails page = null;
  
  PipelineExecutionListRepresentationEmbedded embedded = null;
  
  PipelineExecutionListRepresentationLinks links = null;
  PipelineExecutionListRepresentation();

  @override
  String toString() {
    return 'PipelineExecutionListRepresentation[totalNumberOfItems=$totalNumberOfItems, page=$page, embedded=$embedded, links=$links, ]';
  }

  PipelineExecutionListRepresentation.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    totalNumberOfItems = json['_totalNumberOfItems'];
    page = (json['_page'] == null) ?
      null :
      RequestedPageDetails.fromJson(json['_page']);
    embedded = (json['_embedded'] == null) ?
      null :
      PipelineExecutionListRepresentationEmbedded.fromJson(json['_embedded']);
    links = (json['_links'] == null) ?
      null :
      PipelineExecutionListRepresentationLinks.fromJson(json['_links']);
  }

  Map<String, dynamic> toJson() {
    Map <String, dynamic> json = {};
    if (totalNumberOfItems != null)
      json['_totalNumberOfItems'] = totalNumberOfItems;
    if (page != null)
      json['_page'] = page;
    if (embedded != null)
      json['_embedded'] = embedded;
    if (links != null)
      json['_links'] = links;
    return json;
  }

  static List<PipelineExecutionListRepresentation> listFromJson(List<dynamic> json) {
    return json == null ? List<PipelineExecutionListRepresentation>() : json.map((value) => PipelineExecutionListRepresentation.fromJson(value)).toList();
  }

  static Map<String, PipelineExecutionListRepresentation> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, PipelineExecutionListRepresentation>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = PipelineExecutionListRepresentation.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of PipelineExecutionListRepresentation-objects as value to a dart map
  static Map<String, List<PipelineExecutionListRepresentation>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<PipelineExecutionListRepresentation>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = PipelineExecutionListRepresentation.listFromJson(value);
       });
     }
     return map;
  }
}

