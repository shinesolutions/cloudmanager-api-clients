using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// Describes the status of a particular pipeline execution step for display purposes
  /// </summary>
  [DataContract]
  public class PipelineExecutionStepState {
    /// <summary>
    /// Gets or Sets Id
    /// </summary>
    [DataMember(Name="id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "id")]
    public string Id { get; set; }

    /// <summary>
    /// Gets or Sets StepId
    /// </summary>
    [DataMember(Name="stepId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stepId")]
    public string StepId { get; set; }

    /// <summary>
    /// Gets or Sets PhaseId
    /// </summary>
    [DataMember(Name="phaseId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "phaseId")]
    public string PhaseId { get; set; }

    /// <summary>
    /// Name of the action
    /// </summary>
    /// <value>Name of the action</value>
    [DataMember(Name="action", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "action")]
    public string Action { get; set; }

    /// <summary>
    /// Target repository
    /// </summary>
    /// <value>Target repository</value>
    [DataMember(Name="repository", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "repository")]
    public string Repository { get; set; }

    /// <summary>
    /// Target branch
    /// </summary>
    /// <value>Target branch</value>
    [DataMember(Name="branch", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "branch")]
    public string Branch { get; set; }

    /// <summary>
    /// Target environment
    /// </summary>
    /// <value>Target environment</value>
    [DataMember(Name="environment", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "environment")]
    public string Environment { get; set; }

    /// <summary>
    /// Target environment type
    /// </summary>
    /// <value>Target environment type</value>
    [DataMember(Name="environmentType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "environmentType")]
    public string EnvironmentType { get; set; }

    /// <summary>
    /// Start time
    /// </summary>
    /// <value>Start time</value>
    [DataMember(Name="startedAt", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "startedAt")]
    public DateTime? StartedAt { get; set; }

    /// <summary>
    /// Date the execution reached a final state
    /// </summary>
    /// <value>Date the execution reached a final state</value>
    [DataMember(Name="finishedAt", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "finishedAt")]
    public DateTime? FinishedAt { get; set; }

    /// <summary>
    /// Information about step result
    /// </summary>
    /// <value>Information about step result</value>
    [DataMember(Name="details", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "details")]
    public Dictionary<string, Object> Details { get; set; }

    /// <summary>
    /// Action status
    /// </summary>
    /// <value>Action status</value>
    [DataMember(Name="status", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "status")]
    public string Status { get; set; }

    /// <summary>
    /// Gets or Sets Links
    /// </summary>
    [DataMember(Name="_links", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "_links")]
    public PipelineExecutionStepStateLinks Links { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class PipelineExecutionStepState {\n");
      sb.Append("  Id: ").Append(Id).Append("\n");
      sb.Append("  StepId: ").Append(StepId).Append("\n");
      sb.Append("  PhaseId: ").Append(PhaseId).Append("\n");
      sb.Append("  Action: ").Append(Action).Append("\n");
      sb.Append("  Repository: ").Append(Repository).Append("\n");
      sb.Append("  Branch: ").Append(Branch).Append("\n");
      sb.Append("  Environment: ").Append(Environment).Append("\n");
      sb.Append("  EnvironmentType: ").Append(EnvironmentType).Append("\n");
      sb.Append("  StartedAt: ").Append(StartedAt).Append("\n");
      sb.Append("  FinishedAt: ").Append(FinishedAt).Append("\n");
      sb.Append("  Details: ").Append(Details).Append("\n");
      sb.Append("  Status: ").Append(Status).Append("\n");
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
