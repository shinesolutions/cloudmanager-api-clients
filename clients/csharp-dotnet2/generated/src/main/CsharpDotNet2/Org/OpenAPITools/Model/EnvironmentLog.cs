using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// Log from Environment
  /// </summary>
  [DataContract]
  public class EnvironmentLog {
    /// <summary>
    /// Name of the service
    /// </summary>
    /// <value>Name of the service</value>
    [DataMember(Name="service", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "service")]
    public string Service { get; set; }

    /// <summary>
    /// Name of the Log
    /// </summary>
    /// <value>Name of the Log</value>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

    /// <summary>
    /// date of the Log
    /// </summary>
    /// <value>date of the Log</value>
    [DataMember(Name="date", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "date")]
    public string Date { get; set; }

    /// <summary>
    /// Gets or Sets ProgramId
    /// </summary>
    [DataMember(Name="programId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "programId")]
    public long? ProgramId { get; set; }

    /// <summary>
    /// Gets or Sets EnvironmentId
    /// </summary>
    [DataMember(Name="environmentId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "environmentId")]
    public long? EnvironmentId { get; set; }

    /// <summary>
    /// Gets or Sets Links
    /// </summary>
    [DataMember(Name="_links", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "_links")]
    public EnvironmentLogLinks Links { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class EnvironmentLog {\n");
      sb.Append("  Service: ").Append(Service).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  Date: ").Append(Date).Append("\n");
      sb.Append("  ProgramId: ").Append(ProgramId).Append("\n");
      sb.Append("  EnvironmentId: ").Append(EnvironmentId).Append("\n");
      sb.Append("  Links: ").Append(Links).Append("\n");
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
