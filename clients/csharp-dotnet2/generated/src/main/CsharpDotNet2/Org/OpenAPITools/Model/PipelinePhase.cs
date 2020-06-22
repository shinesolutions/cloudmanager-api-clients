using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// Describes a phase of a pipeline
  /// </summary>
  [DataContract]
  public class PipelinePhase {
    /// <summary>
    /// Name of the phase
    /// </summary>
    /// <value>Name of the phase</value>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

    /// <summary>
    /// Type of the phase
    /// </summary>
    /// <value>Type of the phase</value>
    [DataMember(Name="type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "type")]
    public string Type { get; set; }

    /// <summary>
    /// Identifier of the source repository. The code from this repository will be build at the start of this phase. Mandatory if type=BUILD
    /// </summary>
    /// <value>Identifier of the source repository. The code from this repository will be build at the start of this phase. Mandatory if type=BUILD</value>
    [DataMember(Name="repositoryId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "repositoryId")]
    public string RepositoryId { get; set; }

    /// <summary>
    /// Name of the tracked branch or a fully qualified git tag (e.g. refs/tags/v1).  Assumed to be `master` if missing.
    /// </summary>
    /// <value>Name of the tracked branch or a fully qualified git tag (e.g. refs/tags/v1).  Assumed to be `master` if missing.</value>
    [DataMember(Name="branch", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "branch")]
    public string Branch { get; set; }

    /// <summary>
    /// Identifier of the target environment. Mandatory if type=DEPLOY
    /// </summary>
    /// <value>Identifier of the target environment. Mandatory if type=DEPLOY</value>
    [DataMember(Name="environmentId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "environmentId")]
    public string EnvironmentId { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class PipelinePhase {\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  Type: ").Append(Type).Append("\n");
      sb.Append("  RepositoryId: ").Append(RepositoryId).Append("\n");
      sb.Append("  Branch: ").Append(Branch).Append("\n");
      sb.Append("  EnvironmentId: ").Append(EnvironmentId).Append("\n");
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
