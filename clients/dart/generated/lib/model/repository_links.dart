part of openapi.api;

class RepositoryLinks {
  
  HalLink http:NsAdobeComAdobecloudRelProgram = null;
  
  HalLink http:NsAdobeComAdobecloudRelBranches = null;
  
  HalLink self = null;
  RepositoryLinks();

  @override
  String toString() {
    return 'RepositoryLinks[http:NsAdobeComAdobecloudRelProgram=$http:NsAdobeComAdobecloudRelProgram, http:NsAdobeComAdobecloudRelBranches=$http:NsAdobeComAdobecloudRelBranches, self=$self, ]';
  }

  RepositoryLinks.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    http:NsAdobeComAdobecloudRelProgram = (json['http://ns.adobe.com/adobecloud/rel/program'] == null) ?
      null :
      HalLink.fromJson(json['http://ns.adobe.com/adobecloud/rel/program']);
    http:NsAdobeComAdobecloudRelBranches = (json['http://ns.adobe.com/adobecloud/rel/branches'] == null) ?
      null :
      HalLink.fromJson(json['http://ns.adobe.com/adobecloud/rel/branches']);
    self = (json['self'] == null) ?
      null :
      HalLink.fromJson(json['self']);
  }

  Map<String, dynamic> toJson() {
    Map <String, dynamic> json = {};
    if (http:NsAdobeComAdobecloudRelProgram != null)
      json['http://ns.adobe.com/adobecloud/rel/program'] = http:NsAdobeComAdobecloudRelProgram;
    if (http:NsAdobeComAdobecloudRelBranches != null)
      json['http://ns.adobe.com/adobecloud/rel/branches'] = http:NsAdobeComAdobecloudRelBranches;
    if (self != null)
      json['self'] = self;
    return json;
  }

  static List<RepositoryLinks> listFromJson(List<dynamic> json) {
    return json == null ? List<RepositoryLinks>() : json.map((value) => RepositoryLinks.fromJson(value)).toList();
  }

  static Map<String, RepositoryLinks> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, RepositoryLinks>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = RepositoryLinks.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of RepositoryLinks-objects as value to a dart map
  static Map<String, List<RepositoryLinks>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<RepositoryLinks>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = RepositoryLinks.listFromJson(value);
       });
     }
     return map;
  }
}

