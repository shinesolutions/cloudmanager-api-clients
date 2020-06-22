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
  public class EnvironmentLinks {
    /// <summary>
    /// Gets or Sets HttpNsAdobeComAdobecloudRelProgram
    /// </summary>
    [DataMember(Name="http://ns.adobe.com/adobecloud/rel/program", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "http://ns.adobe.com/adobecloud/rel/program")]
    public HalLink HttpNsAdobeComAdobecloudRelProgram { get; set; }

    /// <summary>
    /// Gets or Sets HttpNsAdobeComAdobecloudRelPipeline
    /// </summary>
    [DataMember(Name="http://ns.adobe.com/adobecloud/rel/pipeline", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "http://ns.adobe.com/adobecloud/rel/pipeline")]
    public HalLink HttpNsAdobeComAdobecloudRelPipeline { get; set; }

    /// <summary>
    /// Gets or Sets HttpNsAdobeComAdobecloudRelAuthor
    /// </summary>
    [DataMember(Name="http://ns.adobe.com/adobecloud/rel/author", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "http://ns.adobe.com/adobecloud/rel/author")]
    public HalLink HttpNsAdobeComAdobecloudRelAuthor { get; set; }

    /// <summary>
    /// Gets or Sets HttpNsAdobeComAdobecloudRelPublish
    /// </summary>
    [DataMember(Name="http://ns.adobe.com/adobecloud/rel/publish", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "http://ns.adobe.com/adobecloud/rel/publish")]
    public HalLink HttpNsAdobeComAdobecloudRelPublish { get; set; }

    /// <summary>
    /// Gets or Sets HttpNsAdobeComAdobecloudRelDeveloperConsole
    /// </summary>
    [DataMember(Name="http://ns.adobe.com/adobecloud/rel/developerConsole", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "http://ns.adobe.com/adobecloud/rel/developerConsole")]
    public HalLink HttpNsAdobeComAdobecloudRelDeveloperConsole { get; set; }

    /// <summary>
    /// Gets or Sets HttpNsAdobeComAdobecloudRelLogs
    /// </summary>
    [DataMember(Name="http://ns.adobe.com/adobecloud/rel/logs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "http://ns.adobe.com/adobecloud/rel/logs")]
    public HalLink HttpNsAdobeComAdobecloudRelLogs { get; set; }

    /// <summary>
    /// Gets or Sets HttpNsAdobeComAdobecloudRelVariables
    /// </summary>
    [DataMember(Name="http://ns.adobe.com/adobecloud/rel/variables", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "http://ns.adobe.com/adobecloud/rel/variables")]
    public HalLink HttpNsAdobeComAdobecloudRelVariables { get; set; }

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
      sb.Append("class EnvironmentLinks {\n");
      sb.Append("  HttpNsAdobeComAdobecloudRelProgram: ").Append(HttpNsAdobeComAdobecloudRelProgram).Append("\n");
      sb.Append("  HttpNsAdobeComAdobecloudRelPipeline: ").Append(HttpNsAdobeComAdobecloudRelPipeline).Append("\n");
      sb.Append("  HttpNsAdobeComAdobecloudRelAuthor: ").Append(HttpNsAdobeComAdobecloudRelAuthor).Append("\n");
      sb.Append("  HttpNsAdobeComAdobecloudRelPublish: ").Append(HttpNsAdobeComAdobecloudRelPublish).Append("\n");
      sb.Append("  HttpNsAdobeComAdobecloudRelDeveloperConsole: ").Append(HttpNsAdobeComAdobecloudRelDeveloperConsole).Append("\n");
      sb.Append("  HttpNsAdobeComAdobecloudRelLogs: ").Append(HttpNsAdobeComAdobecloudRelLogs).Append("\n");
      sb.Append("  HttpNsAdobeComAdobecloudRelVariables: ").Append(HttpNsAdobeComAdobecloudRelVariables).Append("\n");
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
