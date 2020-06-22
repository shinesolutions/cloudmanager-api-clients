part of openapi.api;

class EnvironmentLogLinks {
  
  HalLink http:NsAdobeComAdobecloudRelLogsDownload = null;
  
  HalLink http:NsAdobeComAdobecloudRelLogsTail = null;
  EnvironmentLogLinks();

  @override
  String toString() {
    return 'EnvironmentLogLinks[http:NsAdobeComAdobecloudRelLogsDownload=$http:NsAdobeComAdobecloudRelLogsDownload, http:NsAdobeComAdobecloudRelLogsTail=$http:NsAdobeComAdobecloudRelLogsTail, ]';
  }

  EnvironmentLogLinks.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    http:NsAdobeComAdobecloudRelLogsDownload = (json['http://ns.adobe.com/adobecloud/rel/logs/download'] == null) ?
      null :
      HalLink.fromJson(json['http://ns.adobe.com/adobecloud/rel/logs/download']);
    http:NsAdobeComAdobecloudRelLogsTail = (json['http://ns.adobe.com/adobecloud/rel/logs/tail'] == null) ?
      null :
      HalLink.fromJson(json['http://ns.adobe.com/adobecloud/rel/logs/tail']);
  }

  Map<String, dynamic> toJson() {
    Map <String, dynamic> json = {};
    if (http:NsAdobeComAdobecloudRelLogsDownload != null)
      json['http://ns.adobe.com/adobecloud/rel/logs/download'] = http:NsAdobeComAdobecloudRelLogsDownload;
    if (http:NsAdobeComAdobecloudRelLogsTail != null)
      json['http://ns.adobe.com/adobecloud/rel/logs/tail'] = http:NsAdobeComAdobecloudRelLogsTail;
    return json;
  }

  static List<EnvironmentLogLinks> listFromJson(List<dynamic> json) {
    return json == null ? List<EnvironmentLogLinks>() : json.map((value) => EnvironmentLogLinks.fromJson(value)).toList();
  }

  static Map<String, EnvironmentLogLinks> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, EnvironmentLogLinks>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = EnvironmentLogLinks.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of EnvironmentLogLinks-objects as value to a dart map
  static Map<String, List<EnvironmentLogLinks>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<EnvironmentLogLinks>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = EnvironmentLogLinks.listFromJson(value);
       });
     }
     return map;
  }
}

