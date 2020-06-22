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
  public class PipelineExecutionStepStateLinks {
    /// <summary>
    /// Gets or Sets HttpNsAdobeComAdobecloudRelExecution
    /// </summary>
    [DataMember(Name="http://ns.adobe.com/adobecloud/rel/execution", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "http://ns.adobe.com/adobecloud/rel/execution")]
    public HalLink HttpNsAdobeComAdobecloudRelExecution { get; set; }

    /// <summary>
    /// Gets or Sets HttpNsAdobeComAdobecloudRelPipeline
    /// </summary>
    [DataMember(Name="http://ns.adobe.com/adobecloud/rel/pipeline", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "http://ns.adobe.com/adobecloud/rel/pipeline")]
    public HalLink HttpNsAdobeComAdobecloudRelPipeline { get; set; }

    /// <summary>
    /// Gets or Sets HttpNsAdobeComAdobecloudRelPipelineLogs
    /// </summary>
    [DataMember(Name="http://ns.adobe.com/adobecloud/rel/pipeline/logs", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "http://ns.adobe.com/adobecloud/rel/pipeline/logs")]
    public HalLink HttpNsAdobeComAdobecloudRelPipelineLogs { get; set; }

    /// <summary>
    /// Gets or Sets HttpNsAdobeComAdobecloudRelPipelineMetrics
    /// </summary>
    [DataMember(Name="http://ns.adobe.com/adobecloud/rel/pipeline/metrics", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "http://ns.adobe.com/adobecloud/rel/pipeline/metrics")]
    public HalLink HttpNsAdobeComAdobecloudRelPipelineMetrics { get; set; }

    /// <summary>
    /// Gets or Sets HttpNsAdobeComAdobecloudRelPipelineAdvance
    /// </summary>
    [DataMember(Name="http://ns.adobe.com/adobecloud/rel/pipeline/advance", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "http://ns.adobe.com/adobecloud/rel/pipeline/advance")]
    public HalLink HttpNsAdobeComAdobecloudRelPipelineAdvance { get; set; }

    /// <summary>
    /// Gets or Sets HttpNsAdobeComAdobecloudRelPipelineCancel
    /// </summary>
    [DataMember(Name="http://ns.adobe.com/adobecloud/rel/pipeline/cancel", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "http://ns.adobe.com/adobecloud/rel/pipeline/cancel")]
    public HalLink HttpNsAdobeComAdobecloudRelPipelineCancel { get; set; }

    /// <summary>
    /// Gets or Sets HttpNsAdobeComAdobecloudRelProgram
    /// </summary>
    [DataMember(Name="http://ns.adobe.com/adobecloud/rel/program", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "http://ns.adobe.com/adobecloud/rel/program")]
    public HalLink HttpNsAdobeComAdobecloudRelProgram { get; set; }

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
      sb.Append("class PipelineExecutionStepStateLinks {\n");
      sb.Append("  HttpNsAdobeComAdobecloudRelExecution: ").Append(HttpNsAdobeComAdobecloudRelExecution).Append("\n");
      sb.Append("  HttpNsAdobeComAdobecloudRelPipeline: ").Append(HttpNsAdobeComAdobecloudRelPipeline).Append("\n");
      sb.Append("  HttpNsAdobeComAdobecloudRelPipelineLogs: ").Append(HttpNsAdobeComAdobecloudRelPipelineLogs).Append("\n");
      sb.Append("  HttpNsAdobeComAdobecloudRelPipelineMetrics: ").Append(HttpNsAdobeComAdobecloudRelPipelineMetrics).Append("\n");
      sb.Append("  HttpNsAdobeComAdobecloudRelPipelineAdvance: ").Append(HttpNsAdobeComAdobecloudRelPipelineAdvance).Append("\n");
      sb.Append("  HttpNsAdobeComAdobecloudRelPipelineCancel: ").Append(HttpNsAdobeComAdobecloudRelPipelineCancel).Append("\n");
      sb.Append("  HttpNsAdobeComAdobecloudRelProgram: ").Append(HttpNsAdobeComAdobecloudRelProgram).Append("\n");
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
