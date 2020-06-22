part of openapi.api;

class Metric {
  /* KPI result identifier */
  String id = null;
  /* Severity of the metric */
  String severity = null;
  //enum severityEnum {  critical,  important,  informational,  };{
  /* Whether metric is considered passed */
  bool passed = false;
  /* Whether user override the failed metric */
  bool override = false;
  /* Expected value for the metric */
  String actualValue = null;
  /* Expected value for the metric */
  String expectedValue = null;
  /* Comparator used for the metric */
  String comparator = null;
  //enum comparatorEnum {  GT,  GTE,  LT,  LTE,  EQ,  NEQ,  };{
  /* KPI identifier */
  String kpi = null;
  Metric();

  @override
  String toString() {
    return 'Metric[id=$id, severity=$severity, passed=$passed, override=$override, actualValue=$actualValue, expectedValue=$expectedValue, comparator=$comparator, kpi=$kpi, ]';
  }

  Metric.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    id = json['id'];
    severity = json['severity'];
    passed = json['passed'];
    override = json['override'];
    actualValue = json['actualValue'];
    expectedValue = json['expectedValue'];
    comparator = json['comparator'];
    kpi = json['kpi'];
  }

  Map<String, dynamic> toJson() {
    Map <String, dynamic> json = {};
    if (id != null)
      json['id'] = id;
    if (severity != null)
      json['severity'] = severity;
    if (passed != null)
      json['passed'] = passed;
    if (override != null)
      json['override'] = override;
    if (actualValue != null)
      json['actualValue'] = actualValue;
    if (expectedValue != null)
      json['expectedValue'] = expectedValue;
    if (comparator != null)
      json['comparator'] = comparator;
    if (kpi != null)
      json['kpi'] = kpi;
    return json;
  }

  static List<Metric> listFromJson(List<dynamic> json) {
    return json == null ? List<Metric>() : json.map((value) => Metric.fromJson(value)).toList();
  }

  static Map<String, Metric> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, Metric>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = Metric.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of Metric-objects as value to a dart map
  static Map<String, List<Metric>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<Metric>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = Metric.listFromJson(value);
       });
     }
     return map;
  }
}

