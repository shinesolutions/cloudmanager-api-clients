part of openapi.api;

class EnvironmentLinks {
  
  HalLink http:NsAdobeComAdobecloudRelProgram = null;
  
  HalLink http:NsAdobeComAdobecloudRelPipeline = null;
  
  HalLink http:NsAdobeComAdobecloudRelAuthor = null;
  
  HalLink http:NsAdobeComAdobecloudRelPublish = null;
  
  HalLink http:NsAdobeComAdobecloudRelDeveloperConsole = null;
  
  HalLink http:NsAdobeComAdobecloudRelLogs = null;
  
  HalLink http:NsAdobeComAdobecloudRelVariables = null;
  
  HalLink self = null;
  EnvironmentLinks();

  @override
  String toString() {
    return 'EnvironmentLinks[http:NsAdobeComAdobecloudRelProgram=$http:NsAdobeComAdobecloudRelProgram, http:NsAdobeComAdobecloudRelPipeline=$http:NsAdobeComAdobecloudRelPipeline, http:NsAdobeComAdobecloudRelAuthor=$http:NsAdobeComAdobecloudRelAuthor, http:NsAdobeComAdobecloudRelPublish=$http:NsAdobeComAdobecloudRelPublish, http:NsAdobeComAdobecloudRelDeveloperConsole=$http:NsAdobeComAdobecloudRelDeveloperConsole, http:NsAdobeComAdobecloudRelLogs=$http:NsAdobeComAdobecloudRelLogs, http:NsAdobeComAdobecloudRelVariables=$http:NsAdobeComAdobecloudRelVariables, self=$self, ]';
  }

  EnvironmentLinks.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    http:NsAdobeComAdobecloudRelProgram = (json['http://ns.adobe.com/adobecloud/rel/program'] == null) ?
      null :
      HalLink.fromJson(json['http://ns.adobe.com/adobecloud/rel/program']);
    http:NsAdobeComAdobecloudRelPipeline = (json['http://ns.adobe.com/adobecloud/rel/pipeline'] == null) ?
      null :
      HalLink.fromJson(json['http://ns.adobe.com/adobecloud/rel/pipeline']);
    http:NsAdobeComAdobecloudRelAuthor = (json['http://ns.adobe.com/adobecloud/rel/author'] == null) ?
      null :
      HalLink.fromJson(json['http://ns.adobe.com/adobecloud/rel/author']);
    http:NsAdobeComAdobecloudRelPublish = (json['http://ns.adobe.com/adobecloud/rel/publish'] == null) ?
      null :
      HalLink.fromJson(json['http://ns.adobe.com/adobecloud/rel/publish']);
    http:NsAdobeComAdobecloudRelDeveloperConsole = (json['http://ns.adobe.com/adobecloud/rel/developerConsole'] == null) ?
      null :
      HalLink.fromJson(json['http://ns.adobe.com/adobecloud/rel/developerConsole']);
    http:NsAdobeComAdobecloudRelLogs = (json['http://ns.adobe.com/adobecloud/rel/logs'] == null) ?
      null :
      HalLink.fromJson(json['http://ns.adobe.com/adobecloud/rel/logs']);
    http:NsAdobeComAdobecloudRelVariables = (json['http://ns.adobe.com/adobecloud/rel/variables'] == null) ?
      null :
      HalLink.fromJson(json['http://ns.adobe.com/adobecloud/rel/variables']);
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
    if (http:NsAdobeComAdobecloudRelAuthor != null)
      json['http://ns.adobe.com/adobecloud/rel/author'] = http:NsAdobeComAdobecloudRelAuthor;
    if (http:NsAdobeComAdobecloudRelPublish != null)
      json['http://ns.adobe.com/adobecloud/rel/publish'] = http:NsAdobeComAdobecloudRelPublish;
    if (http:NsAdobeComAdobecloudRelDeveloperConsole != null)
      json['http://ns.adobe.com/adobecloud/rel/developerConsole'] = http:NsAdobeComAdobecloudRelDeveloperConsole;
    if (http:NsAdobeComAdobecloudRelLogs != null)
      json['http://ns.adobe.com/adobecloud/rel/logs'] = http:NsAdobeComAdobecloudRelLogs;
    if (http:NsAdobeComAdobecloudRelVariables != null)
      json['http://ns.adobe.com/adobecloud/rel/variables'] = http:NsAdobeComAdobecloudRelVariables;
    if (self != null)
      json['self'] = self;
    return json;
  }

  static List<EnvironmentLinks> listFromJson(List<dynamic> json) {
    return json == null ? List<EnvironmentLinks>() : json.map((value) => EnvironmentLinks.fromJson(value)).toList();
  }

  static Map<String, EnvironmentLinks> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, EnvironmentLinks>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = EnvironmentLinks.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of EnvironmentLinks-objects as value to a dart map
  static Map<String, List<EnvironmentLinks>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<EnvironmentLinks>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = EnvironmentLinks.listFromJson(value);
       });
     }
     return map;
  }
}

