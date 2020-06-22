part of openapi.api;

class ProgramListLinks {
  
  HalLink next = null;
  
  HalLink prev = null;
  
  HalLink self = null;
  ProgramListLinks();

  @override
  String toString() {
    return 'ProgramListLinks[next=$next, prev=$prev, self=$self, ]';
  }

  ProgramListLinks.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    next = (json['next'] == null) ?
      null :
      HalLink.fromJson(json['next']);
    prev = (json['prev'] == null) ?
      null :
      HalLink.fromJson(json['prev']);
    self = (json['self'] == null) ?
      null :
      HalLink.fromJson(json['self']);
  }

  Map<String, dynamic> toJson() {
    Map <String, dynamic> json = {};
    if (next != null)
      json['next'] = next;
    if (prev != null)
      json['prev'] = prev;
    if (self != null)
      json['self'] = self;
    return json;
  }

  static List<ProgramListLinks> listFromJson(List<dynamic> json) {
    return json == null ? List<ProgramListLinks>() : json.map((value) => ProgramListLinks.fromJson(value)).toList();
  }

  static Map<String, ProgramListLinks> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, ProgramListLinks>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = ProgramListLinks.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of ProgramListLinks-objects as value to a dart map
  static Map<String, List<ProgramListLinks>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<ProgramListLinks>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = ProgramListLinks.listFromJson(value);
       });
     }
     return map;
  }
}

