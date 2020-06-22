part of openapi.api;

class HalLink {
  
  String href = null;
  
  bool templated = false;
  
  String type = null;
  
  String deprecation = null;
  
  String profile = null;
  
  String title = null;
  
  String hreflang = null;
  
  String name = null;
  HalLink();

  @override
  String toString() {
    return 'HalLink[href=$href, templated=$templated, type=$type, deprecation=$deprecation, profile=$profile, title=$title, hreflang=$hreflang, name=$name, ]';
  }

  HalLink.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    href = json['href'];
    templated = json['templated'];
    type = json['type'];
    deprecation = json['deprecation'];
    profile = json['profile'];
    title = json['title'];
    hreflang = json['hreflang'];
    name = json['name'];
  }

  Map<String, dynamic> toJson() {
    Map <String, dynamic> json = {};
    if (href != null)
      json['href'] = href;
    if (templated != null)
      json['templated'] = templated;
    if (type != null)
      json['type'] = type;
    if (deprecation != null)
      json['deprecation'] = deprecation;
    if (profile != null)
      json['profile'] = profile;
    if (title != null)
      json['title'] = title;
    if (hreflang != null)
      json['hreflang'] = hreflang;
    if (name != null)
      json['name'] = name;
    return json;
  }

  static List<HalLink> listFromJson(List<dynamic> json) {
    return json == null ? List<HalLink>() : json.map((value) => HalLink.fromJson(value)).toList();
  }

  static Map<String, HalLink> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, HalLink>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = HalLink.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of HalLink-objects as value to a dart map
  static Map<String, List<HalLink>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<HalLink>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = HalLink.listFromJson(value);
       });
     }
     return map;
  }
}

