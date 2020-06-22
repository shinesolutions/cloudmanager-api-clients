part of openapi.api;

class ProgramLinks {
  
  HalLink http:NsAdobeComAdobecloudRelPipelines = null;
  
  HalLink http:NsAdobeComAdobecloudRelEnvironments = null;
  
  HalLink http:NsAdobeComAdobecloudRelRepositories = null;
  
  HalLink self = null;
  ProgramLinks();

  @override
  String toString() {
    return 'ProgramLinks[http:NsAdobeComAdobecloudRelPipelines=$http:NsAdobeComAdobecloudRelPipelines, http:NsAdobeComAdobecloudRelEnvironments=$http:NsAdobeComAdobecloudRelEnvironments, http:NsAdobeComAdobecloudRelRepositories=$http:NsAdobeComAdobecloudRelRepositories, self=$self, ]';
  }

  ProgramLinks.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    http:NsAdobeComAdobecloudRelPipelines = (json['http://ns.adobe.com/adobecloud/rel/pipelines'] == null) ?
      null :
      HalLink.fromJson(json['http://ns.adobe.com/adobecloud/rel/pipelines']);
    http:NsAdobeComAdobecloudRelEnvironments = (json['http://ns.adobe.com/adobecloud/rel/environments'] == null) ?
      null :
      HalLink.fromJson(json['http://ns.adobe.com/adobecloud/rel/environments']);
    http:NsAdobeComAdobecloudRelRepositories = (json['http://ns.adobe.com/adobecloud/rel/repositories'] == null) ?
      null :
      HalLink.fromJson(json['http://ns.adobe.com/adobecloud/rel/repositories']);
    self = (json['self'] == null) ?
      null :
      HalLink.fromJson(json['self']);
  }

  Map<String, dynamic> toJson() {
    Map <String, dynamic> json = {};
    if (http:NsAdobeComAdobecloudRelPipelines != null)
      json['http://ns.adobe.com/adobecloud/rel/pipelines'] = http:NsAdobeComAdobecloudRelPipelines;
    if (http:NsAdobeComAdobecloudRelEnvironments != null)
      json['http://ns.adobe.com/adobecloud/rel/environments'] = http:NsAdobeComAdobecloudRelEnvironments;
    if (http:NsAdobeComAdobecloudRelRepositories != null)
      json['http://ns.adobe.com/adobecloud/rel/repositories'] = http:NsAdobeComAdobecloudRelRepositories;
    if (self != null)
      json['self'] = self;
    return json;
  }

  static List<ProgramLinks> listFromJson(List<dynamic> json) {
    return json == null ? List<ProgramLinks>() : json.map((value) => ProgramLinks.fromJson(value)).toList();
  }

  static Map<String, ProgramLinks> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, ProgramLinks>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = ProgramLinks.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of ProgramLinks-objects as value to a dart map
  static Map<String, List<ProgramLinks>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<ProgramLinks>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = ProgramLinks.listFromJson(value);
       });
     }
     return map;
  }
}

