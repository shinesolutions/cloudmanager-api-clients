using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// Logs of an Environment
  /// </summary>
  [DataContract]
  public class EnvironmentLogs {
    /// <summary>
    /// Name of the service
    /// </summary>
    /// <value>Name of the service</value>
    [DataMember(Name="service", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "service")]
    public List<string> Service { get; set; }

    /// <summary>
    /// Name of the Log
    /// </summary>
    /// <value>Name of the Log</value>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public List<string> Name { get; set; }

    /// <summary>
    /// Number of days
    /// </summary>
    /// <value>Number of days</value>
    [DataMember(Name="days", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "days")]
    public int? Days { get; set; }

    /// <summary>
    /// Gets or Sets Links
    /// </summary>
    [DataMember(Name="_links", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "_links")]
    public EnvironmentLogsLinks Links { get; set; }

    /// <summary>
    /// Gets or Sets Embedded
    /// </summary>
    [DataMember(Name="_embedded", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "_embedded")]
    public EnvironmentLogsEmbedded Embedded { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class EnvironmentLogs {\n");
      sb.Append("  Service: ").Append(Service).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  Days: ").Append(Days).Append("\n");
      sb.Append("  Links: ").Append(Links).Append("\n");
      sb.Append("  Embedded: ").Append(Embedded).Append("\n");
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
