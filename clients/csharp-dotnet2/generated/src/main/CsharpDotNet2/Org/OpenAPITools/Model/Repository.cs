using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// A sourcecode repository
  /// </summary>
  [DataContract]
  public class Repository {
    /// <summary>
    /// Repository name
    /// </summary>
    /// <value>Repository name</value>
    [DataMember(Name="repo", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "repo")]
    public string Repo { get; set; }

    /// <summary>
    /// description
    /// </summary>
    /// <value>description</value>
    [DataMember(Name="description", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "description")]
    public string Description { get; set; }

    /// <summary>
    /// Gets or Sets Links
    /// </summary>
    [DataMember(Name="_links", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "_links")]
    public RepositoryLinks Links { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class Repository {\n");
      sb.Append("  Repo: ").Append(Repo).Append("\n");
      sb.Append("  Description: ").Append(Description).Append("\n");
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
