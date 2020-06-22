part of openapi.api;

class PipelineExecutionListRepresentationLinks {
  
  HalLink next = null;
  
  HalLink page = null;
  
  HalLink prev = null;
  
  HalLink self = null;
  PipelineExecutionListRepresentationLinks();

  @override
  String toString() {
    return 'PipelineExecutionListRepresentationLinks[next=$next, page=$page, prev=$prev, self=$self, ]';
  }

  PipelineExecutionListRepresentationLinks.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    next = (json['next'] == null) ?
      null :
      HalLink.fromJson(json['next']);
    page = (json['page'] == null) ?
      null :
      HalLink.fromJson(json['page']);
    prev = (json['prev'] == null) ?
      null :
      HalLink.fromJson(json['prev']);
    self = (json['self'] == null) ?
      null :
      HalLink.fromJson(json['self']);
  }

  Map<String, dynamic> toJson() {
    Map <String, dynamic> json = {};
    if (next != null)
      json['next'] = next;
    if (page != null)
      json['page'] = page;
    if (prev != null)
      json['prev'] = prev;
    if (self != null)
      json['self'] = self;
    return json;
  }

  static List<PipelineExecutionListRepresentationLinks> listFromJson(List<dynamic> json) {
    return json == null ? List<PipelineExecutionListRepresentationLinks>() : json.map((value) => PipelineExecutionListRepresentationLinks.fromJson(value)).toList();
  }

  static Map<String, PipelineExecutionListRepresentationLinks> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, PipelineExecutionListRepresentationLinks>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = PipelineExecutionListRepresentationLinks.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of PipelineExecutionListRepresentationLinks-objects as value to a dart map
  static Map<String, List<PipelineExecutionListRepresentationLinks>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<PipelineExecutionListRepresentationLinks>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = PipelineExecutionListRepresentationLinks.listFromJson(value);
       });
     }
     return map;
  }
}

