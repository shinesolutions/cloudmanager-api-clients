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
  public class PipelineExecutionEmbedded {
    /// <summary>
    /// Gets or Sets StepStates
    /// </summary>
    [DataMember(Name="stepStates", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stepStates")]
    public List<PipelineExecutionStepState> StepStates { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class PipelineExecutionEmbedded {\n");
      sb.Append("  StepStates: ").Append(StepStates).Append("\n");
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
