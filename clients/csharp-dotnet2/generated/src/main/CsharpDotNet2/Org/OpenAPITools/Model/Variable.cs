using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// A named value than can be set on an Environment
  /// </summary>
  [DataContract]
  public class Variable {
    /// <summary>
    /// Name of the variable. Of a-z, A-Z, _ and 0-9 Cannot begin with a number.
    /// </summary>
    /// <value>Name of the variable. Of a-z, A-Z, _ and 0-9 Cannot begin with a number.</value>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

    /// <summary>
    /// Value of the variable. Read-Write for non-secrets, write-only for secrets.
    /// </summary>
    /// <value>Value of the variable. Read-Write for non-secrets, write-only for secrets.</value>
    [DataMember(Name="value", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "value")]
    public string Value { get; set; }

    /// <summary>
    /// Type of the variable. Default `string` if missing. Cannot be changed after creation.
    /// </summary>
    /// <value>Type of the variable. Default `string` if missing. Cannot be changed after creation.</value>
    [DataMember(Name="type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "type")]
    public string Type { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class Variable {\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  Value: ").Append(Value).Append("\n");
      sb.Append("  Type: ").Append(Type).Append("\n");
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
