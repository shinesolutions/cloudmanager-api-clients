part of openapi.api;

class PipelineExecutionListRepresentationEmbedded {
  
  List<PipelineExecution> executions = [];
  PipelineExecutionListRepresentationEmbedded();

  @override
  String toString() {
    return 'PipelineExecutionListRepresentationEmbedded[executions=$executions, ]';
  }

  PipelineExecutionListRepresentationEmbedded.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    executions = (json['executions'] == null) ?
      null :
      PipelineExecution.listFromJson(json['executions']);
  }

  Map<String, dynamic> toJson() {
    Map <String, dynamic> json = {};
    if (executions != null)
      json['executions'] = executions;
    return json;
  }

  static List<PipelineExecutionListRepresentationEmbedded> listFromJson(List<dynamic> json) {
    return json == null ? List<PipelineExecutionListRepresentationEmbedded>() : json.map((value) => PipelineExecutionListRepresentationEmbedded.fromJson(value)).toList();
  }

  static Map<String, PipelineExecutionListRepresentationEmbedded> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, PipelineExecutionListRepresentationEmbedded>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = PipelineExecutionListRepresentationEmbedded.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of PipelineExecutionListRepresentationEmbedded-objects as value to a dart map
  static Map<String, List<PipelineExecutionListRepresentationEmbedded>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<PipelineExecutionListRepresentationEmbedded>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = PipelineExecutionListRepresentationEmbedded.listFromJson(value);
       });
     }
     return map;
  }
}

