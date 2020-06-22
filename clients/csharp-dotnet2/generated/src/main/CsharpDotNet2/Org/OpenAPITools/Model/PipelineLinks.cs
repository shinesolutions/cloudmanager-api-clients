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
  public class PipelineLinks {
    /// <summary>
    /// Gets or Sets HttpNsAdobeComAdobecloudRelProgram
    /// </summary>
    [DataMember(Name="http://ns.adobe.com/adobecloud/rel/program", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "http://ns.adobe.com/adobecloud/rel/program")]
    public HalLink HttpNsAdobeComAdobecloudRelProgram { get; set; }

    /// <summary>
    /// Gets or Sets HttpNsAdobeComAdobecloudRelExecution
    /// </summary>
    [DataMember(Name="http://ns.adobe.com/adobecloud/rel/execution", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "http://ns.adobe.com/adobecloud/rel/execution")]
    public HalLink HttpNsAdobeComAdobecloudRelExecution { get; set; }

    /// <summary>
    /// Gets or Sets HttpNsAdobeComAdobecloudRelExecutions
    /// </summary>
    [DataMember(Name="http://ns.adobe.com/adobecloud/rel/executions", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "http://ns.adobe.com/adobecloud/rel/executions")]
    public HalLink HttpNsAdobeComAdobecloudRelExecutions { get; set; }

    /// <summary>
    /// Gets or Sets HttpNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution
    /// </summary>
    [DataMember(Name="http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution")]
    public HalLink HttpNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution { get; set; }

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
      sb.Append("class PipelineLinks {\n");
      sb.Append("  HttpNsAdobeComAdobecloudRelProgram: ").Append(HttpNsAdobeComAdobecloudRelProgram).Append("\n");
      sb.Append("  HttpNsAdobeComAdobecloudRelExecution: ").Append(HttpNsAdobeComAdobecloudRelExecution).Append("\n");
      sb.Append("  HttpNsAdobeComAdobecloudRelExecutions: ").Append(HttpNsAdobeComAdobecloudRelExecutions).Append("\n");
      sb.Append("  HttpNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution: ").Append(HttpNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution).Append("\n");
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
