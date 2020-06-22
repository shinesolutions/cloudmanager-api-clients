part of openapi.api;

class Program {
  /* Identifier of the program. Unique within the space. */
  String id = null;
  /* Name of the program */
  String name = null;
  /* Whether this Program has been enabled for Cloud Manager usage */
  bool enabled = false;
  /* Tenant Id */
  String tenantId = null;
  /* Organisation Id */
  String imsOrgId = null;
  
  ProgramLinks links = null;
  Program();

  @override
  String toString() {
    return 'Program[id=$id, name=$name, enabled=$enabled, tenantId=$tenantId, imsOrgId=$imsOrgId, links=$links, ]';
  }

  Program.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    id = json['id'];
    name = json['name'];
    enabled = json['enabled'];
    tenantId = json['tenantId'];
    imsOrgId = json['imsOrgId'];
    links = (json['_links'] == null) ?
      null :
      ProgramLinks.fromJson(json['_links']);
  }

  Map<String, dynamic> toJson() {
    Map <String, dynamic> json = {};
    if (id != null)
      json['id'] = id;
    if (name != null)
      json['name'] = name;
    if (enabled != null)
      json['enabled'] = enabled;
    if (tenantId != null)
      json['tenantId'] = tenantId;
    if (imsOrgId != null)
      json['imsOrgId'] = imsOrgId;
    if (links != null)
      json['_links'] = links;
    return json;
  }

  static List<Program> listFromJson(List<dynamic> json) {
    return json == null ? List<Program>() : json.map((value) => Program.fromJson(value)).toList();
  }

  static Map<String, Program> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, Program>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = Program.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of Program-objects as value to a dart map
  static Map<String, List<Program>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<Program>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = Program.listFromJson(value);
       });
     }
     return map;
  }
}

