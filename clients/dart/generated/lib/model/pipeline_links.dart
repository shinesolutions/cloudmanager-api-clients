part of openapi.api;

class PipelineLinks {
  
  HalLink http:NsAdobeComAdobecloudRelProgram = null;
  
  HalLink http:NsAdobeComAdobecloudRelExecution = null;
  
  HalLink http:NsAdobeComAdobecloudRelExecutions = null;
  
  HalLink http:NsAdobeComAdobecloudRelRollbackLastSuccessfulExecution = null;
  
  HalLink self = null;
  PipelineLinks();

  @override
  String toString() {
    return 'PipelineLinks[http:NsAdobeComAdobecloudRelProgram=$http:NsAdobeComAdobecloudRelProgram, http:NsAdobeComAdobecloudRelExecution=$http:NsAdobeComAdobecloudRelExecution, http:NsAdobeComAdobecloudRelExecutions=$http:NsAdobeComAdobecloudRelExecutions, http:NsAdobeComAdobecloudRelRollbackLastSuccessfulExecution=$http:NsAdobeComAdobecloudRelRollbackLastSuccessfulExecution, self=$self, ]';
  }

  PipelineLinks.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    http:NsAdobeComAdobecloudRelProgram = (json['http://ns.adobe.com/adobecloud/rel/program'] == null) ?
      null :
      HalLink.fromJson(json['http://ns.adobe.com/adobecloud/rel/program']);
    http:NsAdobeComAdobecloudRelExecution = (json['http://ns.adobe.com/adobecloud/rel/execution'] == null) ?
      null :
      HalLink.fromJson(json['http://ns.adobe.com/adobecloud/rel/execution']);
    http:NsAdobeComAdobecloudRelExecutions = (json['http://ns.adobe.com/adobecloud/rel/executions'] == null) ?
      null :
      HalLink.fromJson(json['http://ns.adobe.com/adobecloud/rel/executions']);
    http:NsAdobeComAdobecloudRelRollbackLastSuccessfulExecution = (json['http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution'] == null) ?
      null :
      HalLink.fromJson(json['http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution']);
    self = (json['self'] == null) ?
      null :
      HalLink.fromJson(json['self']);
  }

  Map<String, dynamic> toJson() {
    Map <String, dynamic> json = {};
    if (http:NsAdobeComAdobecloudRelProgram != null)
      json['http://ns.adobe.com/adobecloud/rel/program'] = http:NsAdobeComAdobecloudRelProgram;
    if (http:NsAdobeComAdobecloudRelExecution != null)
      json['http://ns.adobe.com/adobecloud/rel/execution'] = http:NsAdobeComAdobecloudRelExecution;
    if (http:NsAdobeComAdobecloudRelExecutions != null)
      json['http://ns.adobe.com/adobecloud/rel/executions'] = http:NsAdobeComAdobecloudRelExecutions;
    if (http:NsAdobeComAdobecloudRelRollbackLastSuccessfulExecution != null)
      json['http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution'] = http:NsAdobeComAdobecloudRelRollbackLastSuccessfulExecution;
    if (self != null)
      json['self'] = self;
    return json;
  }

  static List<PipelineLinks> listFromJson(List<dynamic> json) {
    return json == null ? List<PipelineLinks>() : json.map((value) => PipelineLinks.fromJson(value)).toList();
  }

  static Map<String, PipelineLinks> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, PipelineLinks>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = PipelineLinks.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of PipelineLinks-objects as value to a dart map
  static Map<String, List<PipelineLinks>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<PipelineLinks>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = PipelineLinks.listFromJson(value);
       });
     }
     return map;
  }
}

