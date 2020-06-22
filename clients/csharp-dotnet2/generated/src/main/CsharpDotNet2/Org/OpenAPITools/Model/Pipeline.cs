using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// Describes a __CI/CD Pipeline__
  /// </summary>
  [DataContract]
  public class Pipeline {
    /// <summary>
    /// Identifier of the pipeline. Unique within the program.
    /// </summary>
    /// <value>Identifier of the pipeline. Unique within the program.</value>
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
    /// Name of the pipeline
    /// </summary>
    /// <value>Name of the pipeline</value>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

    /// <summary>
    /// How should the execution be triggered. ON_COMMIT: each time a PR is available and the Pipeline is idle then a execution is triggered. MANUAL: triggerd through UI or API. SCHEDULE: recurring schedule (not yet implemented}
    /// </summary>
    /// <value>How should the execution be triggered. ON_COMMIT: each time a PR is available and the Pipeline is idle then a execution is triggered. MANUAL: triggerd through UI or API. SCHEDULE: recurring schedule (not yet implemented}</value>
    [DataMember(Name="trigger", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "trigger")]
    public string Trigger { get; set; }

    /// <summary>
    /// Pipeline status
    /// </summary>
    /// <value>Pipeline status</value>
    [DataMember(Name="status", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "status")]
    public string Status { get; set; }

    /// <summary>
    /// Create date
    /// </summary>
    /// <value>Create date</value>
    [DataMember(Name="createdAt", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "createdAt")]
    public DateTime? CreatedAt { get; set; }

    /// <summary>
    /// Update date
    /// </summary>
    /// <value>Update date</value>
    [DataMember(Name="updatedAt", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "updatedAt")]
    public DateTime? UpdatedAt { get; set; }

    /// <summary>
    /// Last pipeline execution start
    /// </summary>
    /// <value>Last pipeline execution start</value>
    [DataMember(Name="lastStartedAt", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "lastStartedAt")]
    public DateTime? LastStartedAt { get; set; }

    /// <summary>
    /// Last pipeline execution end
    /// </summary>
    /// <value>Last pipeline execution end</value>
    [DataMember(Name="lastFinishedAt", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "lastFinishedAt")]
    public DateTime? LastFinishedAt { get; set; }

    /// <summary>
    /// Pipeline phases in execution order
    /// </summary>
    /// <value>Pipeline phases in execution order</value>
    [DataMember(Name="phases", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "phases")]
    public List<PipelinePhase> Phases { get; set; }

    /// <summary>
    /// Gets or Sets Links
    /// </summary>
    [DataMember(Name="_links", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "_links")]
    public PipelineLinks Links { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class Pipeline {\n");
      sb.Append("  Id: ").Append(Id).Append("\n");
      sb.Append("  ProgramId: ").Append(ProgramId).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  Trigger: ").Append(Trigger).Append("\n");
      sb.Append("  Status: ").Append(Status).Append("\n");
      sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
      sb.Append("  UpdatedAt: ").Append(UpdatedAt).Append("\n");
      sb.Append("  LastStartedAt: ").Append(LastStartedAt).Append("\n");
      sb.Append("  LastFinishedAt: ").Append(LastFinishedAt).Append("\n");
      sb.Append("  Phases: ").Append(Phases).Append("\n");
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
