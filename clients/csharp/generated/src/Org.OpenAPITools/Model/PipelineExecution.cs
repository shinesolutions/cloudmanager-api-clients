/* 
 * Cloud Manager API
 *
 * This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: opensource@shinesolutions.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// Wraps a pipeline execution
    /// </summary>
    [DataContract]
    public partial class PipelineExecution :  IEquatable<PipelineExecution>, IValidatableObject
    {
        /// <summary>
        /// Status of the execution
        /// </summary>
        /// <value>Status of the execution</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum StatusEnum
        {
            /// <summary>
            /// Enum NOTSTARTED for value: NOT_STARTED
            /// </summary>
            [EnumMember(Value = "NOT_STARTED")]
            NOTSTARTED = 1,

            /// <summary>
            /// Enum RUNNING for value: RUNNING
            /// </summary>
            [EnumMember(Value = "RUNNING")]
            RUNNING = 2,

            /// <summary>
            /// Enum CANCELLING for value: CANCELLING
            /// </summary>
            [EnumMember(Value = "CANCELLING")]
            CANCELLING = 3,

            /// <summary>
            /// Enum CANCELLED for value: CANCELLED
            /// </summary>
            [EnumMember(Value = "CANCELLED")]
            CANCELLED = 4,

            /// <summary>
            /// Enum FINISHED for value: FINISHED
            /// </summary>
            [EnumMember(Value = "FINISHED")]
            FINISHED = 5,

            /// <summary>
            /// Enum ERROR for value: ERROR
            /// </summary>
            [EnumMember(Value = "ERROR")]
            ERROR = 6,

            /// <summary>
            /// Enum FAILED for value: FAILED
            /// </summary>
            [EnumMember(Value = "FAILED")]
            FAILED = 7

        }

        /// <summary>
        /// Status of the execution
        /// </summary>
        /// <value>Status of the execution</value>
        [DataMember(Name="status", EmitDefaultValue=false)]
        public StatusEnum? Status { get; set; }
        /// <summary>
        /// How the execution was triggered.
        /// </summary>
        /// <value>How the execution was triggered.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum TriggerEnum
        {
            /// <summary>
            /// Enum ONCOMMIT for value: ON_COMMIT
            /// </summary>
            [EnumMember(Value = "ON_COMMIT")]
            ONCOMMIT = 1,

            /// <summary>
            /// Enum MANUAL for value: MANUAL
            /// </summary>
            [EnumMember(Value = "MANUAL")]
            MANUAL = 2,

            /// <summary>
            /// Enum SCHEDULE for value: SCHEDULE
            /// </summary>
            [EnumMember(Value = "SCHEDULE")]
            SCHEDULE = 3,

            /// <summary>
            /// Enum PUSHUPGRADES for value: PUSH_UPGRADES
            /// </summary>
            [EnumMember(Value = "PUSH_UPGRADES")]
            PUSHUPGRADES = 4

        }

        /// <summary>
        /// How the execution was triggered.
        /// </summary>
        /// <value>How the execution was triggered.</value>
        [DataMember(Name="trigger", EmitDefaultValue=false)]
        public TriggerEnum? Trigger { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="PipelineExecution" /> class.
        /// </summary>
        /// <param name="id">Pipeline execution identifier.</param>
        /// <param name="artifactsVersion">Version of the artifacts generated during this execution.</param>
        /// <param name="user">AdobeID who started the pipeline. Empty for auto triggered builds.</param>
        /// <param name="status">Status of the execution.</param>
        /// <param name="trigger">How the execution was triggered..</param>
        /// <param name="createdAt">Start time.</param>
        /// <param name="updatedAt">Date of last status change.</param>
        /// <param name="finishedAt">Date the execution reached a final state.</param>
        /// <param name="embedded">embedded.</param>
        /// <param name="links">links.</param>
        public PipelineExecution(string id = default(string), string artifactsVersion = default(string), string user = default(string), StatusEnum? status = default(StatusEnum?), TriggerEnum? trigger = default(TriggerEnum?), DateTime createdAt = default(DateTime), DateTime updatedAt = default(DateTime), DateTime finishedAt = default(DateTime), PipelineExecutionEmbedded embedded = default(PipelineExecutionEmbedded), PipelineExecutionLinks links = default(PipelineExecutionLinks))
        {
            this.Id = id;
            this.ArtifactsVersion = artifactsVersion;
            this.User = user;
            this.Status = status;
            this.Trigger = trigger;
            this.CreatedAt = createdAt;
            this.UpdatedAt = updatedAt;
            this.FinishedAt = finishedAt;
            this.Embedded = embedded;
            this.Links = links;
        }
        
        /// <summary>
        /// Pipeline execution identifier
        /// </summary>
        /// <value>Pipeline execution identifier</value>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Identifier of the program. Unique within the space.
        /// </summary>
        /// <value>Identifier of the program. Unique within the space.</value>
        [DataMember(Name="programId", EmitDefaultValue=false)]
        public string ProgramId { get; private set; }

        /// <summary>
        /// Identifier of the pipeline. Unique within the space.
        /// </summary>
        /// <value>Identifier of the pipeline. Unique within the space.</value>
        [DataMember(Name="pipelineId", EmitDefaultValue=false)]
        public string PipelineId { get; private set; }

        /// <summary>
        /// Version of the artifacts generated during this execution
        /// </summary>
        /// <value>Version of the artifacts generated during this execution</value>
        [DataMember(Name="artifactsVersion", EmitDefaultValue=false)]
        public string ArtifactsVersion { get; set; }

        /// <summary>
        /// AdobeID who started the pipeline. Empty for auto triggered builds
        /// </summary>
        /// <value>AdobeID who started the pipeline. Empty for auto triggered builds</value>
        [DataMember(Name="user", EmitDefaultValue=false)]
        public string User { get; set; }



        /// <summary>
        /// Start time
        /// </summary>
        /// <value>Start time</value>
        [DataMember(Name="createdAt", EmitDefaultValue=false)]
        public DateTime CreatedAt { get; set; }

        /// <summary>
        /// Date of last status change
        /// </summary>
        /// <value>Date of last status change</value>
        [DataMember(Name="updatedAt", EmitDefaultValue=false)]
        public DateTime UpdatedAt { get; set; }

        /// <summary>
        /// Date the execution reached a final state
        /// </summary>
        /// <value>Date the execution reached a final state</value>
        [DataMember(Name="finishedAt", EmitDefaultValue=false)]
        public DateTime FinishedAt { get; set; }

        /// <summary>
        /// Gets or Sets Embedded
        /// </summary>
        [DataMember(Name="_embedded", EmitDefaultValue=false)]
        public PipelineExecutionEmbedded Embedded { get; set; }

        /// <summary>
        /// Gets or Sets Links
        /// </summary>
        [DataMember(Name="_links", EmitDefaultValue=false)]
        public PipelineExecutionLinks Links { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
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
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as PipelineExecution);
        }

        /// <summary>
        /// Returns true if PipelineExecution instances are equal
        /// </summary>
        /// <param name="input">Instance of PipelineExecution to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PipelineExecution input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.ProgramId == input.ProgramId ||
                    (this.ProgramId != null &&
                    this.ProgramId.Equals(input.ProgramId))
                ) && 
                (
                    this.PipelineId == input.PipelineId ||
                    (this.PipelineId != null &&
                    this.PipelineId.Equals(input.PipelineId))
                ) && 
                (
                    this.ArtifactsVersion == input.ArtifactsVersion ||
                    (this.ArtifactsVersion != null &&
                    this.ArtifactsVersion.Equals(input.ArtifactsVersion))
                ) && 
                (
                    this.User == input.User ||
                    (this.User != null &&
                    this.User.Equals(input.User))
                ) && 
                (
                    this.Status == input.Status ||
                    (this.Status != null &&
                    this.Status.Equals(input.Status))
                ) && 
                (
                    this.Trigger == input.Trigger ||
                    (this.Trigger != null &&
                    this.Trigger.Equals(input.Trigger))
                ) && 
                (
                    this.CreatedAt == input.CreatedAt ||
                    (this.CreatedAt != null &&
                    this.CreatedAt.Equals(input.CreatedAt))
                ) && 
                (
                    this.UpdatedAt == input.UpdatedAt ||
                    (this.UpdatedAt != null &&
                    this.UpdatedAt.Equals(input.UpdatedAt))
                ) && 
                (
                    this.FinishedAt == input.FinishedAt ||
                    (this.FinishedAt != null &&
                    this.FinishedAt.Equals(input.FinishedAt))
                ) && 
                (
                    this.Embedded == input.Embedded ||
                    (this.Embedded != null &&
                    this.Embedded.Equals(input.Embedded))
                ) && 
                (
                    this.Links == input.Links ||
                    (this.Links != null &&
                    this.Links.Equals(input.Links))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.ProgramId != null)
                    hashCode = hashCode * 59 + this.ProgramId.GetHashCode();
                if (this.PipelineId != null)
                    hashCode = hashCode * 59 + this.PipelineId.GetHashCode();
                if (this.ArtifactsVersion != null)
                    hashCode = hashCode * 59 + this.ArtifactsVersion.GetHashCode();
                if (this.User != null)
                    hashCode = hashCode * 59 + this.User.GetHashCode();
                if (this.Status != null)
                    hashCode = hashCode * 59 + this.Status.GetHashCode();
                if (this.Trigger != null)
                    hashCode = hashCode * 59 + this.Trigger.GetHashCode();
                if (this.CreatedAt != null)
                    hashCode = hashCode * 59 + this.CreatedAt.GetHashCode();
                if (this.UpdatedAt != null)
                    hashCode = hashCode * 59 + this.UpdatedAt.GetHashCode();
                if (this.FinishedAt != null)
                    hashCode = hashCode * 59 + this.FinishedAt.GetHashCode();
                if (this.Embedded != null)
                    hashCode = hashCode * 59 + this.Embedded.GetHashCode();
                if (this.Links != null)
                    hashCode = hashCode * 59 + this.Links.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
