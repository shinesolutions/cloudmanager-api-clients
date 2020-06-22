part of openapi.api;

class RepositoryBranchLinks {
  
  HalLink http:NsAdobeComAdobecloudRelProgram = null;
  
  HalLink http:NsAdobeComAdobecloudRelRepository = null;
  RepositoryBranchLinks();

  @override
  String toString() {
    return 'RepositoryBranchLinks[http:NsAdobeComAdobecloudRelProgram=$http:NsAdobeComAdobecloudRelProgram, http:NsAdobeComAdobecloudRelRepository=$http:NsAdobeComAdobecloudRelRepository, ]';
  }

  RepositoryBranchLinks.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    http:NsAdobeComAdobecloudRelProgram = (json['http://ns.adobe.com/adobecloud/rel/program'] == null) ?
      null :
      HalLink.fromJson(json['http://ns.adobe.com/adobecloud/rel/program']);
    http:NsAdobeComAdobecloudRelRepository = (json['http://ns.adobe.com/adobecloud/rel/repository'] == null) ?
      null :
      HalLink.fromJson(json['http://ns.adobe.com/adobecloud/rel/repository']);
  }

  Map<String, dynamic> toJson() {
    Map <String, dynamic> json = {};
    if (http:NsAdobeComAdobecloudRelProgram != null)
      json['http://ns.adobe.com/adobecloud/rel/program'] = http:NsAdobeComAdobecloudRelProgram;
    if (http:NsAdobeComAdobecloudRelRepository != null)
      json['http://ns.adobe.com/adobecloud/rel/repository'] = http:NsAdobeComAdobecloudRelRepository;
    return json;
  }

  static List<RepositoryBranchLinks> listFromJson(List<dynamic> json) {
    return json == null ? List<RepositoryBranchLinks>() : json.map((value) => RepositoryBranchLinks.fromJson(value)).toList();
  }

  static Map<String, RepositoryBranchLinks> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, RepositoryBranchLinks>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = RepositoryBranchLinks.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of RepositoryBranchLinks-objects as value to a dart map
  static Map<String, List<RepositoryBranchLinks>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<RepositoryBranchLinks>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = RepositoryBranchLinks.listFromJson(value);
       });
     }
     return map;
  }
}

