part of openapi.api;

class PipelineExecutionStepState {
  
  String id = null;
  
  String stepId = null;
  
  String phaseId = null;
  /* Name of the action */
  String action = null;
  /* Target repository */
  String repository = null;
  /* Target branch */
  String branch = null;
  /* Target environment */
  String environment = null;
  /* Target environment type */
  String environmentType = null;
  /* Start time */
  DateTime startedAt = null;
  /* Date the execution reached a final state */
  DateTime finishedAt = null;
  /* Information about step result */
  Map<String, Object> details = {};
  /* Action status */
  String status = null;
  //enum statusEnum {  NOT_STARTED,  RUNNING,  FINISHED,  ERROR,  ROLLING_BACK,  ROLLED_BACK,  WAITING,  CANCELLED,  FAILED,  };{
  
  PipelineExecutionStepStateLinks links = null;
  PipelineExecutionStepState();

  @override
  String toString() {
    return 'PipelineExecutionStepState[id=$id, stepId=$stepId, phaseId=$phaseId, action=$action, repository=$repository, branch=$branch, environment=$environment, environmentType=$environmentType, startedAt=$startedAt, finishedAt=$finishedAt, details=$details, status=$status, links=$links, ]';
  }

  PipelineExecutionStepState.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    id = json['id'];
    stepId = json['stepId'];
    phaseId = json['phaseId'];
    action = json['action'];
    repository = json['repository'];
    branch = json['branch'];
    environment = json['environment'];
    environmentType = json['environmentType'];
    startedAt = (json['startedAt'] == null) ?
      null :
      DateTime.parse(json['startedAt']);
    finishedAt = (json['finishedAt'] == null) ?
      null :
      DateTime.parse(json['finishedAt']);
    details = (json['details'] == null) ?
      null :
      Object.mapFromJson(json['details']);
    status = json['status'];
    links = (json['_links'] == null) ?
      null :
      PipelineExecutionStepStateLinks.fromJson(json['_links']);
  }

  Map<String, dynamic> toJson() {
    Map <String, dynamic> json = {};
    if (id != null)
      json['id'] = id;
    if (stepId != null)
      json['stepId'] = stepId;
    if (phaseId != null)
      json['phaseId'] = phaseId;
    if (action != null)
      json['action'] = action;
    if (repository != null)
      json['repository'] = repository;
    if (branch != null)
      json['branch'] = branch;
    if (environment != null)
      json['environment'] = environment;
    if (environmentType != null)
      json['environmentType'] = environmentType;
    if (startedAt != null)
      json['startedAt'] = startedAt == null ? null : startedAt.toUtc().toIso8601String();
    if (finishedAt != null)
      json['finishedAt'] = finishedAt == null ? null : finishedAt.toUtc().toIso8601String();
    if (details != null)
      json['details'] = details;
    if (status != null)
      json['status'] = status;
    if (links != null)
      json['_links'] = links;
    return json;
  }

  static List<PipelineExecutionStepState> listFromJson(List<dynamic> json) {
    return json == null ? List<PipelineExecutionStepState>() : json.map((value) => PipelineExecutionStepState.fromJson(value)).toList();
  }

  static Map<String, PipelineExecutionStepState> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, PipelineExecutionStepState>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = PipelineExecutionStepState.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of PipelineExecutionStepState-objects as value to a dart map
  static Map<String, List<PipelineExecutionStepState>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<PipelineExecutionStepState>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = PipelineExecutionStepState.listFromJson(value);
       });
     }
     return map;
  }
}

