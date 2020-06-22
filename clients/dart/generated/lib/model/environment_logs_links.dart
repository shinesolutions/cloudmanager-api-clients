part of openapi.api;

class EnvironmentLogsLinks {
  
  HalLink http:NsAdobeComAdobecloudRelProgram = null;
  
  HalLink self = null;
  EnvironmentLogsLinks();

  @override
  String toString() {
    return 'EnvironmentLogsLinks[http:NsAdobeComAdobecloudRelProgram=$http:NsAdobeComAdobecloudRelProgram, self=$self, ]';
  }

  EnvironmentLogsLinks.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    http:NsAdobeComAdobecloudRelProgram = (json['http://ns.adobe.com/adobecloud/rel/program'] == null) ?
      null :
      HalLink.fromJson(json['http://ns.adobe.com/adobecloud/rel/program']);
    self = (json['self'] == null) ?
      null :
      HalLink.fromJson(json['self']);
  }

  Map<String, dynamic> toJson() {
    Map <String, dynamic> json = {};
    if (http:NsAdobeComAdobecloudRelProgram != null)
      json['http://ns.adobe.com/adobecloud/rel/program'] = http:NsAdobeComAdobecloudRelProgram;
    if (self != null)
      json['self'] = self;
    return json;
  }

  static List<EnvironmentLogsLinks> listFromJson(List<dynamic> json) {
    return json == null ? List<EnvironmentLogsLinks>() : json.map((value) => EnvironmentLogsLinks.fromJson(value)).toList();
  }

  static Map<String, EnvironmentLogsLinks> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, EnvironmentLogsLinks>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = EnvironmentLogsLinks.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of EnvironmentLogsLinks-objects as value to a dart map
  static Map<String, List<EnvironmentLogsLinks>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<EnvironmentLogsLinks>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = EnvironmentLogsLinks.listFromJson(value);
       });
     }
     return map;
  }
}

