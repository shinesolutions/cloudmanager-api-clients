part of openapi.api;

class PipelineExecutionStepStateLinks {
  
  HalLink http:NsAdobeComAdobecloudRelExecution = null;
  
  HalLink http:NsAdobeComAdobecloudRelPipeline = null;
  
  HalLink http:NsAdobeComAdobecloudRelPipelineLogs = null;
  
  HalLink http:NsAdobeComAdobecloudRelPipelineMetrics = null;
  
  HalLink http:NsAdobeComAdobecloudRelPipelineAdvance = null;
  
  HalLink http:NsAdobeComAdobecloudRelPipelineCancel = null;
  
  HalLink http:NsAdobeComAdobecloudRelProgram = null;
  
  HalLink self = null;
  PipelineExecutionStepStateLinks();

  @override
  String toString() {
    return 'PipelineExecutionStepStateLinks[http:NsAdobeComAdobecloudRelExecution=$http:NsAdobeComAdobecloudRelExecution, http:NsAdobeComAdobecloudRelPipeline=$http:NsAdobeComAdobecloudRelPipeline, http:NsAdobeComAdobecloudRelPipelineLogs=$http:NsAdobeComAdobecloudRelPipelineLogs, http:NsAdobeComAdobecloudRelPipelineMetrics=$http:NsAdobeComAdobecloudRelPipelineMetrics, http:NsAdobeComAdobecloudRelPipelineAdvance=$http:NsAdobeComAdobecloudRelPipelineAdvance, http:NsAdobeComAdobecloudRelPipelineCancel=$http:NsAdobeComAdobecloudRelPipelineCancel, http:NsAdobeComAdobecloudRelProgram=$http:NsAdobeComAdobecloudRelProgram, self=$self, ]';
  }

  PipelineExecutionStepStateLinks.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    http:NsAdobeComAdobecloudRelExecution = (json['http://ns.adobe.com/adobecloud/rel/execution'] == null) ?
      null :
      HalLink.fromJson(json['http://ns.adobe.com/adobecloud/rel/execution']);
    http:NsAdobeComAdobecloudRelPipeline = (json['http://ns.adobe.com/adobecloud/rel/pipeline'] == null) ?
      null :
      HalLink.fromJson(json['http://ns.adobe.com/adobecloud/rel/pipeline']);
    http:NsAdobeComAdobecloudRelPipelineLogs = (json['http://ns.adobe.com/adobecloud/rel/pipeline/logs'] == null) ?
      null :
      HalLink.fromJson(json['http://ns.adobe.com/adobecloud/rel/pipeline/logs']);
    http:NsAdobeComAdobecloudRelPipelineMetrics = (json['http://ns.adobe.com/adobecloud/rel/pipeline/metrics'] == null) ?
      null :
      HalLink.fromJson(json['http://ns.adobe.com/adobecloud/rel/pipeline/metrics']);
    http:NsAdobeComAdobecloudRelPipelineAdvance = (json['http://ns.adobe.com/adobecloud/rel/pipeline/advance'] == null) ?
      null :
      HalLink.fromJson(json['http://ns.adobe.com/adobecloud/rel/pipeline/advance']);
    http:NsAdobeComAdobecloudRelPipelineCancel = (json['http://ns.adobe.com/adobecloud/rel/pipeline/cancel'] == null) ?
      null :
      HalLink.fromJson(json['http://ns.adobe.com/adobecloud/rel/pipeline/cancel']);
    http:NsAdobeComAdobecloudRelProgram = (json['http://ns.adobe.com/adobecloud/rel/program'] == null) ?
      null :
      HalLink.fromJson(json['http://ns.adobe.com/adobecloud/rel/program']);
    self = (json['self'] == null) ?
      null :
      HalLink.fromJson(json['self']);
  }

  Map<String, dynamic> toJson() {
    Map <String, dynamic> json = {};
    if (http:NsAdobeComAdobecloudRelExecution != null)
      json['http://ns.adobe.com/adobecloud/rel/execution'] = http:NsAdobeComAdobecloudRelExecution;
    if (http:NsAdobeComAdobecloudRelPipeline != null)
      json['http://ns.adobe.com/adobecloud/rel/pipeline'] = http:NsAdobeComAdobecloudRelPipeline;
    if (http:NsAdobeComAdobecloudRelPipelineLogs != null)
      json['http://ns.adobe.com/adobecloud/rel/pipeline/logs'] = http:NsAdobeComAdobecloudRelPipelineLogs;
    if (http:NsAdobeComAdobecloudRelPipelineMetrics != null)
      json['http://ns.adobe.com/adobecloud/rel/pipeline/metrics'] = http:NsAdobeComAdobecloudRelPipelineMetrics;
    if (http:NsAdobeComAdobecloudRelPipelineAdvance != null)
      json['http://ns.adobe.com/adobecloud/rel/pipeline/advance'] = http:NsAdobeComAdobecloudRelPipelineAdvance;
    if (http:NsAdobeComAdobecloudRelPipelineCancel != null)
      json['http://ns.adobe.com/adobecloud/rel/pipeline/cancel'] = http:NsAdobeComAdobecloudRelPipelineCancel;
    if (http:NsAdobeComAdobecloudRelProgram != null)
      json['http://ns.adobe.com/adobecloud/rel/program'] = http:NsAdobeComAdobecloudRelProgram;
    if (self != null)
      json['self'] = self;
    return json;
  }

  static List<PipelineExecutionStepStateLinks> listFromJson(List<dynamic> json) {
    return json == null ? List<PipelineExecutionStepStateLinks>() : json.map((value) => PipelineExecutionStepStateLinks.fromJson(value)).toList();
  }

  static Map<String, PipelineExecutionStepStateLinks> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, PipelineExecutionStepStateLinks>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = PipelineExecutionStepStateLinks.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of PipelineExecutionStepStateLinks-objects as value to a dart map
  static Map<String, List<PipelineExecutionStepStateLinks>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<PipelineExecutionStepStateLinks>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = PipelineExecutionStepStateLinks.listFromJson(value);
       });
     }
     return map;
  }
}

