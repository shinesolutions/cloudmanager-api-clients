part of openapi.api;

class PipelineExecutionEmbedded {
  
  List<PipelineExecutionStepState> stepStates = [];
  PipelineExecutionEmbedded();

  @override
  String toString() {
    return 'PipelineExecutionEmbedded[stepStates=$stepStates, ]';
  }

  PipelineExecutionEmbedded.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    stepStates = (json['stepStates'] == null) ?
      null :
      PipelineExecutionStepState.listFromJson(json['stepStates']);
  }

  Map<String, dynamic> toJson() {
    Map <String, dynamic> json = {};
    if (stepStates != null)
      json['stepStates'] = stepStates;
    return json;
  }

  static List<PipelineExecutionEmbedded> listFromJson(List<dynamic> json) {
    return json == null ? List<PipelineExecutionEmbedded>() : json.map((value) => PipelineExecutionEmbedded.fromJson(value)).toList();
  }

  static Map<String, PipelineExecutionEmbedded> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, PipelineExecutionEmbedded>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = PipelineExecutionEmbedded.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of PipelineExecutionEmbedded-objects as value to a dart map
  static Map<String, List<PipelineExecutionEmbedded>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<PipelineExecutionEmbedded>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = PipelineExecutionEmbedded.listFromJson(value);
       });
     }
     return map;
  }
}

