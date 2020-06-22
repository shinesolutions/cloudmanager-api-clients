part of openapi.api;

class PipelineExecution {
  /* Pipeline execution identifier */
  String id = null;
  /* Identifier of the program. Unique within the space. */
  String programId = null;
  /* Identifier of the pipeline. Unique within the space. */
  String pipelineId = null;
  /* Version of the artifacts generated during this execution */
  String artifactsVersion = null;
  /* AdobeID who started the pipeline. Empty for auto triggered builds */
  String user = null;
  /* Status of the execution */
  String status = null;
  //enum statusEnum {  NOT_STARTED,  RUNNING,  CANCELLING,  CANCELLED,  FINISHED,  ERROR,  FAILED,  };{
  /* How the execution was triggered. */
  String trigger = null;
  //enum triggerEnum {  ON_COMMIT,  MANUAL,  SCHEDULE,  PUSH_UPGRADES,  };{
  /* Start time */
  DateTime createdAt = null;
  /* Date of last status change */
  DateTime updatedAt = null;
  /* Date the execution reached a final state */
  DateTime finishedAt = null;
  
  PipelineExecutionEmbedded embedded = null;
  
  PipelineExecutionLinks links = null;
  PipelineExecution();

  @override
  String toString() {
    return 'PipelineExecution[id=$id, programId=$programId, pipelineId=$pipelineId, artifactsVersion=$artifactsVersion, user=$user, status=$status, trigger=$trigger, createdAt=$createdAt, updatedAt=$updatedAt, finishedAt=$finishedAt, embedded=$embedded, links=$links, ]';
  }

  PipelineExecution.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    id = json['id'];
    programId = json['programId'];
    pipelineId = json['pipelineId'];
    artifactsVersion = json['artifactsVersion'];
    user = json['user'];
    status = json['status'];
    trigger = json['trigger'];
    createdAt = (json['createdAt'] == null) ?
      null :
      DateTime.parse(json['createdAt']);
    updatedAt = (json['updatedAt'] == null) ?
      null :
      DateTime.parse(json['updatedAt']);
    finishedAt = (json['finishedAt'] == null) ?
      null :
      DateTime.parse(json['finishedAt']);
    embedded = (json['_embedded'] == null) ?
      null :
      PipelineExecutionEmbedded.fromJson(json['_embedded']);
    links = (json['_links'] == null) ?
      null :
      PipelineExecutionLinks.fromJson(json['_links']);
  }

  Map<String, dynamic> toJson() {
    Map <String, dynamic> json = {};
    if (id != null)
      json['id'] = id;
    if (programId != null)
      json['programId'] = programId;
    if (pipelineId != null)
      json['pipelineId'] = pipelineId;
    if (artifactsVersion != null)
      json['artifactsVersion'] = artifactsVersion;
    if (user != null)
      json['user'] = user;
    if (status != null)
      json['status'] = status;
    if (trigger != null)
      json['trigger'] = trigger;
    if (createdAt != null)
      json['createdAt'] = createdAt == null ? null : createdAt.toUtc().toIso8601String();
    if (updatedAt != null)
      json['updatedAt'] = updatedAt == null ? null : updatedAt.toUtc().toIso8601String();
    if (finishedAt != null)
      json['finishedAt'] = finishedAt == null ? null : finishedAt.toUtc().toIso8601String();
    if (embedded != null)
      json['_embedded'] = embedded;
    if (links != null)
      json['_links'] = links;
    return json;
  }

  static List<PipelineExecution> listFromJson(List<dynamic> json) {
    return json == null ? List<PipelineExecution>() : json.map((value) => PipelineExecution.fromJson(value)).toList();
  }

  static Map<String, PipelineExecution> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, PipelineExecution>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = PipelineExecution.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of PipelineExecution-objects as value to a dart map
  static Map<String, List<PipelineExecution>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<PipelineExecution>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = PipelineExecution.listFromJson(value);
       });
     }
     return map;
  }
}

