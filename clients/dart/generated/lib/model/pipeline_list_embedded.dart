part of openapi.api;

class PipelineListEmbedded {
  
  List<Pipeline> pipelines = [];
  PipelineListEmbedded();

  @override
  String toString() {
    return 'PipelineListEmbedded[pipelines=$pipelines, ]';
  }

  PipelineListEmbedded.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    pipelines = (json['pipelines'] == null) ?
      null :
      Pipeline.listFromJson(json['pipelines']);
  }

  Map<String, dynamic> toJson() {
    Map <String, dynamic> json = {};
    if (pipelines != null)
      json['pipelines'] = pipelines;
    return json;
  }

  static List<PipelineListEmbedded> listFromJson(List<dynamic> json) {
    return json == null ? List<PipelineListEmbedded>() : json.map((value) => PipelineListEmbedded.fromJson(value)).toList();
  }

  static Map<String, PipelineListEmbedded> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, PipelineListEmbedded>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = PipelineListEmbedded.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of PipelineListEmbedded-objects as value to a dart map
  static Map<String, List<PipelineListEmbedded>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<PipelineListEmbedded>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = PipelineListEmbedded.listFromJson(value);
       });
     }
     return map;
  }
}

