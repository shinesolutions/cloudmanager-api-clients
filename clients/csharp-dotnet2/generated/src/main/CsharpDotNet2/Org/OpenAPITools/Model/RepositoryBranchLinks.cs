using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// 
  /// </summary>
  [DataContract]
  public class RepositoryBranchLinks {
    /// <summary>
    /// Gets or Sets HttpNsAdobeComAdobecloudRelProgram
    /// </summary>
    [DataMember(Name="http://ns.adobe.com/adobecloud/rel/program", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "http://ns.adobe.com/adobecloud/rel/program")]
    public HalLink HttpNsAdobeComAdobecloudRelProgram { get; set; }

    /// <summary>
    /// Gets or Sets HttpNsAdobeComAdobecloudRelRepository
    /// </summary>
    [DataMember(Name="http://ns.adobe.com/adobecloud/rel/repository", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "http://ns.adobe.com/adobecloud/rel/repository")]
    public HalLink HttpNsAdobeComAdobecloudRelRepository { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class RepositoryBranchLinks {\n");
      sb.Append("  HttpNsAdobeComAdobecloudRelProgram: ").Append(HttpNsAdobeComAdobecloudRelProgram).Append("\n");
      sb.Append("  HttpNsAdobeComAdobecloudRelRepository: ").Append(HttpNsAdobeComAdobecloudRelRepository).Append("\n");
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
