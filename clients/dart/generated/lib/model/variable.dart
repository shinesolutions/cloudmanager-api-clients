part of openapi.api;

class Variable {
  /* Name of the variable. Of a-z, A-Z, _ and 0-9 Cannot begin with a number. */
  String name = null;
  /* Value of the variable. Read-Write for non-secrets, write-only for secrets. */
  String value = null;
  /* Type of the variable. Default `string` if missing. Cannot be changed after creation. */
  String type = null;
  //enum typeEnum {  string,  secretString,  };{
  Variable();

  @override
  String toString() {
    return 'Variable[name=$name, value=$value, type=$type, ]';
  }

  Variable.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    name = json['name'];
    value = json['value'];
    type = json['type'];
  }

  Map<String, dynamic> toJson() {
    Map <String, dynamic> json = {};
    if (name != null)
      json['name'] = name;
    if (value != null)
      json['value'] = value;
    if (type != null)
      json['type'] = type;
    return json;
  }

  static List<Variable> listFromJson(List<dynamic> json) {
    return json == null ? List<Variable>() : json.map((value) => Variable.fromJson(value)).toList();
  }

  static Map<String, Variable> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, Variable>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = Variable.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of Variable-objects as value to a dart map
  static Map<String, List<Variable>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<Variable>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = Variable.listFromJson(value);
       });
     }
     return map;
  }
}

