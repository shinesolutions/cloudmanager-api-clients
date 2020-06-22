using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// Describes a __Metric__
  /// </summary>
  [DataContract]
  public class Metric {
    /// <summary>
    /// KPI result identifier
    /// </summary>
    /// <value>KPI result identifier</value>
    [DataMember(Name="id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "id")]
    public string Id { get; set; }

    /// <summary>
    /// Severity of the metric
    /// </summary>
    /// <value>Severity of the metric</value>
    [DataMember(Name="severity", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "severity")]
    public string Severity { get; set; }

    /// <summary>
    /// Whether metric is considered passed
    /// </summary>
    /// <value>Whether metric is considered passed</value>
    [DataMember(Name="passed", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "passed")]
    public bool? Passed { get; set; }

    /// <summary>
    /// Whether user override the failed metric
    /// </summary>
    /// <value>Whether user override the failed metric</value>
    [DataMember(Name="override", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "override")]
    public bool? Override { get; set; }

    /// <summary>
    /// Expected value for the metric
    /// </summary>
    /// <value>Expected value for the metric</value>
    [DataMember(Name="actualValue", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "actualValue")]
    public string ActualValue { get; set; }

    /// <summary>
    /// Expected value for the metric
    /// </summary>
    /// <value>Expected value for the metric</value>
    [DataMember(Name="expectedValue", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "expectedValue")]
    public string ExpectedValue { get; set; }

    /// <summary>
    /// Comparator used for the metric
    /// </summary>
    /// <value>Comparator used for the metric</value>
    [DataMember(Name="comparator", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "comparator")]
    public string Comparator { get; set; }

    /// <summary>
    /// KPI identifier
    /// </summary>
    /// <value>KPI identifier</value>
    [DataMember(Name="kpi", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "kpi")]
    public string Kpi { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class Metric {\n");
      sb.Append("  Id: ").Append(Id).Append("\n");
      sb.Append("  Severity: ").Append(Severity).Append("\n");
      sb.Append("  Passed: ").Append(Passed).Append("\n");
      sb.Append("  Override: ").Append(Override).Append("\n");
      sb.Append("  ActualValue: ").Append(ActualValue).Append("\n");
      sb.Append("  ExpectedValue: ").Append(ExpectedValue).Append("\n");
      sb.Append("  Comparator: ").Append(Comparator).Append("\n");
      sb.Append("  Kpi: ").Append(Kpi).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }

    /// <summary>
    /// Get the JSON string presentation of the object
    /// </summary>
    /// <returns>JSON string presentation of the object</returns>
    public string ToJson() {
      return JsonConvert.SerializeObject(this, Formatting.Indented);
    }

}
}
