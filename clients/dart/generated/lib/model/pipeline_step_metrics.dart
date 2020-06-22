part of openapi.api;

class PipelineStepMetrics {
  /* metrics */
  List<Metric> metrics = [];
  PipelineStepMetrics();

  @override
  String toString() {
    return 'PipelineStepMetrics[metrics=$metrics, ]';
  }

  PipelineStepMetrics.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    metrics = (json['metrics'] == null) ?
      null :
      Metric.listFromJson(json['metrics']);
  }

  Map<String, dynamic> toJson() {
    Map <String, dynamic> json = {};
    if (metrics != null)
      json['metrics'] = metrics;
    return json;
  }

  static List<PipelineStepMetrics> listFromJson(List<dynamic> json) {
    return json == null ? List<PipelineStepMetrics>() : json.map((value) => PipelineStepMetrics.fromJson(value)).toList();
  }

  static Map<String, PipelineStepMetrics> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, PipelineStepMetrics>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = PipelineStepMetrics.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of PipelineStepMetrics-objects as value to a dart map
  static Map<String, List<PipelineStepMetrics>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<PipelineStepMetrics>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = PipelineStepMetrics.listFromJson(value);
       });
     }
     return map;
  }
}

