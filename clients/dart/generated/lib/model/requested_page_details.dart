part of openapi.api;

class RequestedPageDetails {
  
  int start = null;
  
  int limit = null;
  
  String orderBy = null;
  
  List<String> property = [];
  
  String type = null;
  
  int next = null;
  
  int prev = null;
  RequestedPageDetails();

  @override
  String toString() {
    return 'RequestedPageDetails[start=$start, limit=$limit, orderBy=$orderBy, property=$property, type=$type, next=$next, prev=$prev, ]';
  }

  RequestedPageDetails.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    start = json['start'];
    limit = json['limit'];
    orderBy = json['orderBy'];
    property = (json['property'] == null) ?
      null :
      (json['property'] as List).cast<String>();
    type = json['type'];
    next = json['next'];
    prev = json['prev'];
  }

  Map<String, dynamic> toJson() {
    Map <String, dynamic> json = {};
    if (start != null)
      json['start'] = start;
    if (limit != null)
      json['limit'] = limit;
    if (orderBy != null)
      json['orderBy'] = orderBy;
    if (property != null)
      json['property'] = property;
    if (type != null)
      json['type'] = type;
    if (next != null)
      json['next'] = next;
    if (prev != null)
      json['prev'] = prev;
    return json;
  }

  static List<RequestedPageDetails> listFromJson(List<dynamic> json) {
    return json == null ? List<RequestedPageDetails>() : json.map((value) => RequestedPageDetails.fromJson(value)).toList();
  }

  static Map<String, RequestedPageDetails> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, RequestedPageDetails>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = RequestedPageDetails.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of RequestedPageDetails-objects as value to a dart map
  static Map<String, List<RequestedPageDetails>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<RequestedPageDetails>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = RequestedPageDetails.listFromJson(value);
       });
     }
     return map;
  }
}

