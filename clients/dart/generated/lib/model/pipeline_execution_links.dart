part of openapi.api;

class PipelineExecutionLinks {
  
  HalLink http:NsAdobeComAdobecloudRelProgram = null;
  
  HalLink http:NsAdobeComAdobecloudRelPipeline = null;
  
  HalLink self = null;
  PipelineExecutionLinks();

  @override
  String toString() {
    return 'PipelineExecutionLinks[http:NsAdobeComAdobecloudRelProgram=$http:NsAdobeComAdobecloudRelProgram, http:NsAdobeComAdobecloudRelPipeline=$http:NsAdobeComAdobecloudRelPipeline, self=$self, ]';
  }

  PipelineExecutionLinks.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    http:NsAdobeComAdobecloudRelProgram = (json['http://ns.adobe.com/adobecloud/rel/program'] == null) ?
      null :
      HalLink.fromJson(json['http://ns.adobe.com/adobecloud/rel/program']);
    http:NsAdobeComAdobecloudRelPipeline = (json['http://ns.adobe.com/adobecloud/rel/pipeline'] == null) ?
      null :
      HalLink.fromJson(json['http://ns.adobe.com/adobecloud/rel/pipeline']);
    self = (json['self'] == null) ?
      null :
      HalLink.fromJson(json['self']);
  }

  Map<String, dynamic> toJson() {
    Map <String, dynamic> json = {};
    if (http:NsAdobeComAdobecloudRelProgram != null)
      json['http://ns.adobe.com/adobecloud/rel/program'] = http:NsAdobeComAdobecloudRelProgram;
    if (http:NsAdobeComAdobecloudRelPipeline != null)
      json['http://ns.adobe.com/adobecloud/rel/pipeline'] = http:NsAdobeComAdobecloudRelPipeline;
    if (self != null)
      json['self'] = self;
    return json;
  }

  static List<PipelineExecutionLinks> listFromJson(List<dynamic> json) {
    return json == null ? List<PipelineExecutionLinks>() : json.map((value) => PipelineExecutionLinks.fromJson(value)).toList();
  }

  static Map<String, PipelineExecutionLinks> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, PipelineExecutionLinks>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = PipelineExecutionLinks.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of PipelineExecutionLinks-objects as value to a dart map
  static Map<String, List<PipelineExecutionLinks>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<PipelineExecutionLinks>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = PipelineExecutionLinks.listFromJson(value);
       });
     }
     return map;
  }
}

