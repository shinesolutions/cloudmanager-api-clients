part of openapi.api;

class VariableListLinks {
  
  HalLink http:NsAdobeComAdobecloudRelEnvironment = null;
  
  HalLink http:NsAdobeComAdobecloudRelProgram = null;
  
  HalLink self = null;
  VariableListLinks();

  @override
  String toString() {
    return 'VariableListLinks[http:NsAdobeComAdobecloudRelEnvironment=$http:NsAdobeComAdobecloudRelEnvironment, http:NsAdobeComAdobecloudRelProgram=$http:NsAdobeComAdobecloudRelProgram, self=$self, ]';
  }

  VariableListLinks.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    http:NsAdobeComAdobecloudRelEnvironment = (json['http://ns.adobe.com/adobecloud/rel/environment'] == null) ?
      null :
      HalLink.fromJson(json['http://ns.adobe.com/adobecloud/rel/environment']);
    http:NsAdobeComAdobecloudRelProgram = (json['http://ns.adobe.com/adobecloud/rel/program'] == null) ?
      null :
      HalLink.fromJson(json['http://ns.adobe.com/adobecloud/rel/program']);
    self = (json['self'] == null) ?
      null :
      HalLink.fromJson(json['self']);
  }

  Map<String, dynamic> toJson() {
    Map <String, dynamic> json = {};
    if (http:NsAdobeComAdobecloudRelEnvironment != null)
      json['http://ns.adobe.com/adobecloud/rel/environment'] = http:NsAdobeComAdobecloudRelEnvironment;
    if (http:NsAdobeComAdobecloudRelProgram != null)
      json['http://ns.adobe.com/adobecloud/rel/program'] = http:NsAdobeComAdobecloudRelProgram;
    if (self != null)
      json['self'] = self;
    return json;
  }

  static List<VariableListLinks> listFromJson(List<dynamic> json) {
    return json == null ? List<VariableListLinks>() : json.map((value) => VariableListLinks.fromJson(value)).toList();
  }

  static Map<String, VariableListLinks> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, VariableListLinks>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = VariableListLinks.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of VariableListLinks-objects as value to a dart map
  static Map<String, List<VariableListLinks>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<VariableListLinks>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = VariableListLinks.listFromJson(value);
       });
     }
     return map;
  }
}

