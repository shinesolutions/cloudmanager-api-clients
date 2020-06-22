part of openapi.api;

class ProgramListEmbedded {
  
  List<EmbeddedProgram> programs = [];
  ProgramListEmbedded();

  @override
  String toString() {
    return 'ProgramListEmbedded[programs=$programs, ]';
  }

  ProgramListEmbedded.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    programs = (json['programs'] == null) ?
      null :
      EmbeddedProgram.listFromJson(json['programs']);
  }

  Map<String, dynamic> toJson() {
    Map <String, dynamic> json = {};
    if (programs != null)
      json['programs'] = programs;
    return json;
  }

  static List<ProgramListEmbedded> listFromJson(List<dynamic> json) {
    return json == null ? List<ProgramListEmbedded>() : json.map((value) => ProgramListEmbedded.fromJson(value)).toList();
  }

  static Map<String, ProgramListEmbedded> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, ProgramListEmbedded>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = ProgramListEmbedded.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of ProgramListEmbedded-objects as value to a dart map
  static Map<String, List<ProgramListEmbedded>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<ProgramListEmbedded>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = ProgramListEmbedded.listFromJson(value);
       });
     }
     return map;
  }
}

