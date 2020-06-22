part of openapi.api;

class PipelinePhase {
  /* Name of the phase */
  String name = null;
  /* Type of the phase */
  String type = null;
  //enum typeEnum {  VALIDATE,  BUILD,  DEPLOY,  };{
  /* Identifier of the source repository. The code from this repository will be build at the start of this phase. Mandatory if type=BUILD */
  String repositoryId = null;
  /* Name of the tracked branch or a fully qualified git tag (e.g. refs/tags/v1).  Assumed to be `master` if missing. */
  String branch = null;
  /* Identifier of the target environment. Mandatory if type=DEPLOY */
  String environmentId = null;
  PipelinePhase();

  @override
  String toString() {
    return 'PipelinePhase[name=$name, type=$type, repositoryId=$repositoryId, branch=$branch, environmentId=$environmentId, ]';
  }

  PipelinePhase.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    name = json['name'];
    type = json['type'];
    repositoryId = json['repositoryId'];
    branch = json['branch'];
    environmentId = json['environmentId'];
  }

  Map<String, dynamic> toJson() {
    Map <String, dynamic> json = {};
    if (name != null)
      json['name'] = name;
    if (type != null)
      json['type'] = type;
    if (repositoryId != null)
      json['repositoryId'] = repositoryId;
    if (branch != null)
      json['branch'] = branch;
    if (environmentId != null)
      json['environmentId'] = environmentId;
    return json;
  }

  static List<PipelinePhase> listFromJson(List<dynamic> json) {
    return json == null ? List<PipelinePhase>() : json.map((value) => PipelinePhase.fromJson(value)).toList();
  }

  static Map<String, PipelinePhase> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, PipelinePhase>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = PipelinePhase.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of PipelinePhase-objects as value to a dart map
  static Map<String, List<PipelinePhase>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<PipelinePhase>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = PipelinePhase.listFromJson(value);
       });
     }
     return map;
  }
}

