part of openapi.api;

class Pipeline {
  /* Identifier of the pipeline. Unique within the program. */
  String id = null;
  /* Identifier of the program. Unique within the space. */
  String programId = null;
  /* Name of the pipeline */
  String name = null;
  /* How should the execution be triggered. ON_COMMIT: each time a PR is available and the Pipeline is idle then a execution is triggered. MANUAL: triggerd through UI or API. SCHEDULE: recurring schedule (not yet implemented} */
  String trigger = null;
  //enum triggerEnum {  ON_COMMIT,  MANUAL,  SCHEDULE,  };{
  /* Pipeline status */
  String status = null;
  //enum statusEnum {  IDLE,  BUSY,  WAITING,  };{
  /* Create date */
  DateTime createdAt = null;
  /* Update date */
  DateTime updatedAt = null;
  /* Last pipeline execution start */
  DateTime lastStartedAt = null;
  /* Last pipeline execution end */
  DateTime lastFinishedAt = null;
  /* Pipeline phases in execution order */
  List<PipelinePhase> phases = [];
  
  PipelineLinks links = null;
  Pipeline();

  @override
  String toString() {
    return 'Pipeline[id=$id, programId=$programId, name=$name, trigger=$trigger, status=$status, createdAt=$createdAt, updatedAt=$updatedAt, lastStartedAt=$lastStartedAt, lastFinishedAt=$lastFinishedAt, phases=$phases, links=$links, ]';
  }

  Pipeline.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    id = json['id'];
    programId = json['programId'];
    name = json['name'];
    trigger = json['trigger'];
    status = json['status'];
    createdAt = (json['createdAt'] == null) ?
      null :
      DateTime.parse(json['createdAt']);
    updatedAt = (json['updatedAt'] == null) ?
      null :
      DateTime.parse(json['updatedAt']);
    lastStartedAt = (json['lastStartedAt'] == null) ?
      null :
      DateTime.parse(json['lastStartedAt']);
    lastFinishedAt = (json['lastFinishedAt'] == null) ?
      null :
      DateTime.parse(json['lastFinishedAt']);
    phases = (json['phases'] == null) ?
      null :
      PipelinePhase.listFromJson(json['phases']);
    links = (json['_links'] == null) ?
      null :
      PipelineLinks.fromJson(json['_links']);
  }

  Map<String, dynamic> toJson() {
    Map <String, dynamic> json = {};
    if (id != null)
      json['id'] = id;
    if (programId != null)
      json['programId'] = programId;
    if (name != null)
      json['name'] = name;
    if (trigger != null)
      json['trigger'] = trigger;
    if (status != null)
      json['status'] = status;
    if (createdAt != null)
      json['createdAt'] = createdAt == null ? null : createdAt.toUtc().toIso8601String();
    if (updatedAt != null)
      json['updatedAt'] = updatedAt == null ? null : updatedAt.toUtc().toIso8601String();
    if (lastStartedAt != null)
      json['lastStartedAt'] = lastStartedAt == null ? null : lastStartedAt.toUtc().toIso8601String();
    if (lastFinishedAt != null)
      json['lastFinishedAt'] = lastFinishedAt == null ? null : lastFinishedAt.toUtc().toIso8601String();
    if (phases != null)
      json['phases'] = phases;
    if (links != null)
      json['_links'] = links;
    return json;
  }

  static List<Pipeline> listFromJson(List<dynamic> json) {
    return json == null ? List<Pipeline>() : json.map((value) => Pipeline.fromJson(value)).toList();
  }

  static Map<String, Pipeline> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, Pipeline>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = Pipeline.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of Pipeline-objects as value to a dart map
  static Map<String, List<Pipeline>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<Pipeline>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = Pipeline.listFromJson(value);
       });
     }
     return map;
  }
}

