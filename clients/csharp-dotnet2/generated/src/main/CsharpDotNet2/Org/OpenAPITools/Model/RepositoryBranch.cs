using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// Represents a Git Branch
  /// </summary>
  [DataContract]
  public class RepositoryBranch {
    /// <summary>
    /// Identifier of the program. Unique within the space
    /// </summary>
    /// <value>Identifier of the program. Unique within the space</value>
    [DataMember(Name="programId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "programId")]
    public string ProgramId { get; set; }

    /// <summary>
    /// Identifier of the repository
    /// </summary>
    /// <value>Identifier of the repository</value>
    [DataMember(Name="repositoryId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "repositoryId")]
    public long? RepositoryId { get; set; }

    /// <summary>
    /// Name of the branch
    /// </summary>
    /// <value>Name of the branch</value>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

    /// <summary>
    /// Gets or Sets Links
    /// </summary>
    [DataMember(Name="_links", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "_links")]
    public RepositoryBranchLinks Links { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class RepositoryBranch {\n");
      sb.Append("  ProgramId: ").Append(ProgramId).Append("\n");
      sb.Append("  RepositoryId: ").Append(RepositoryId).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
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
