part of openapi.api;

class EmbeddedProgram {
  /* Identifier of the program. Unique within the space. */
  String id = null;
  /* Name of the program */
  String name = null;
  /* Whether this Program has been enabled for Cloud Manager usage */
  bool enabled = false;
  /* Tenant Id */
  String tenantId = null;
  EmbeddedProgram();

  @override
  String toString() {
    return 'EmbeddedProgram[id=$id, name=$name, enabled=$enabled, tenantId=$tenantId, ]';
  }

  EmbeddedProgram.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    id = json['id'];
    name = json['name'];
    enabled = json['enabled'];
    tenantId = json['tenantId'];
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
    return json;
  }

  static List<EmbeddedProgram> listFromJson(List<dynamic> json) {
    return json == null ? List<EmbeddedProgram>() : json.map((value) => EmbeddedProgram.fromJson(value)).toList();
  }

  static Map<String, EmbeddedProgram> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, EmbeddedProgram>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = EmbeddedProgram.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of EmbeddedProgram-objects as value to a dart map
  static Map<String, List<EmbeddedProgram>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<EmbeddedProgram>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = EmbeddedProgram.listFromJson(value);
       });
     }
     return map;
  }
}

