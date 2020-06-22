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
  public class ProgramLinks {
    /// <summary>
    /// Gets or Sets HttpNsAdobeComAdobecloudRelPipelines
    /// </summary>
    [DataMember(Name="http://ns.adobe.com/adobecloud/rel/pipelines", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "http://ns.adobe.com/adobecloud/rel/pipelines")]
    public HalLink HttpNsAdobeComAdobecloudRelPipelines { get; set; }

    /// <summary>
    /// Gets or Sets HttpNsAdobeComAdobecloudRelEnvironments
    /// </summary>
    [DataMember(Name="http://ns.adobe.com/adobecloud/rel/environments", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "http://ns.adobe.com/adobecloud/rel/environments")]
    public HalLink HttpNsAdobeComAdobecloudRelEnvironments { get; set; }

    /// <summary>
    /// Gets or Sets HttpNsAdobeComAdobecloudRelRepositories
    /// </summary>
    [DataMember(Name="http://ns.adobe.com/adobecloud/rel/repositories", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "http://ns.adobe.com/adobecloud/rel/repositories")]
    public HalLink HttpNsAdobeComAdobecloudRelRepositories { get; set; }

    /// <summary>
    /// Gets or Sets Self
    /// </summary>
    [DataMember(Name="self", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "self")]
    public HalLink Self { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ProgramLinks {\n");
      sb.Append("  HttpNsAdobeComAdobecloudRelPipelines: ").Append(HttpNsAdobeComAdobecloudRelPipelines).Append("\n");
      sb.Append("  HttpNsAdobeComAdobecloudRelEnvironments: ").Append(HttpNsAdobeComAdobecloudRelEnvironments).Append("\n");
      sb.Append("  HttpNsAdobeComAdobecloudRelRepositories: ").Append(HttpNsAdobeComAdobecloudRelRepositories).Append("\n");
      sb.Append("  Self: ").Append(Self).Append("\n");
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
