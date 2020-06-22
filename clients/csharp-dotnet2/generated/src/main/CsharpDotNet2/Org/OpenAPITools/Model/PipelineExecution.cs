using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// Wraps a pipeline execution
  /// </summary>
  [DataContract]
  public class PipelineExecution {
    /// <summary>
    /// Pipeline execution identifier
    /// </summary>
    /// <value>Pipeline execution identifier</value>
    [DataMember(Name="id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "id")]
    public string Id { get; set; }

    /// <summary>
    /// Identifier of the program. Unique within the space.
    /// </summary>
    /// <value>Identifier of the program. Unique within the space.</value>
    [DataMember(Name="programId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "programId")]
    public string ProgramId { get; set; }

    /// <summary>
    /// Identifier of the pipeline. Unique within the space.
    /// </summary>
    /// <value>Identifier of the pipeline. Unique within the space.</value>
    [DataMember(Name="pipelineId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pipelineId")]
    public string PipelineId { get; set; }

    /// <summary>
    /// Version of the artifacts generated during this execution
    /// </summary>
    /// <value>Version of the artifacts generated during this execution</value>
    [DataMember(Name="artifactsVersion", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "artifactsVersion")]
    public string ArtifactsVersion { get; set; }

    /// <summary>
    /// AdobeID who started the pipeline. Empty for auto triggered builds
    /// </summary>
    /// <value>AdobeID who started the pipeline. Empty for auto triggered builds</value>
    [DataMember(Name="user", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "user")]
    public string User { get; set; }

    /// <summary>
    /// Status of the execution
    /// </summary>
    /// <value>Status of the execution</value>
    [DataMember(Name="status", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "status")]
    public string Status { get; set; }

    /// <summary>
    /// How the execution was triggered.
    /// </summary>
    /// <value>How the execution was triggered.</value>
    [DataMember(Name="trigger", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "trigger")]
    public string Trigger { get; set; }

    /// <summary>
    /// Start time
    /// </summary>
    /// <value>Start time</value>
    [DataMember(Name="createdAt", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "createdAt")]
    public DateTime? CreatedAt { get; set; }

    /// <summary>
    /// Date of last status change
    /// </summary>
    /// <value>Date of last status change</value>
    [DataMember(Name="updatedAt", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "updatedAt")]
    public DateTime? UpdatedAt { get; set; }

    /// <summary>
    /// Date the execution reached a final state
    /// </summary>
    /// <value>Date the execution reached a final state</value>
    [DataMember(Name="finishedAt", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "finishedAt")]
    public DateTime? FinishedAt { get; set; }

    /// <summary>
    /// Gets or Sets Embedded
    /// </summary>
    [DataMember(Name="_embedded", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "_embedded")]
    public PipelineExecutionEmbedded Embedded { get; set; }

    /// <summary>
    /// Gets or Sets Links
    /// </summary>
    [DataMember(Name="_links", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "_links")]
    public PipelineExecutionLinks Links { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class PipelineExecution {\n");
      sb.Append("  Id: ").Append(Id).Append("\n");
      sb.Append("  ProgramId: ").Append(ProgramId).Append("\n");
      sb.Append("  PipelineId: ").Append(PipelineId).Append("\n");
      sb.Append("  ArtifactsVersion: ").Append(ArtifactsVersion).Append("\n");
      sb.Append("  User: ").Append(User).Append("\n");
      sb.Append("  Status: ").Append(Status).Append("\n");
      sb.Append("  Trigger: ").Append(Trigger).Append("\n");
      sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
      sb.Append("  UpdatedAt: ").Append(UpdatedAt).Append("\n");
      sb.Append("  FinishedAt: ").Append(FinishedAt).Append("\n");
      sb.Append("  Embedded: ").Append(Embedded).Append("\n");
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
