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
    /// PipelineExecutionEmbedded
    /// </summary>
    [DataContract]
    public partial class PipelineExecutionEmbedded :  IEquatable<PipelineExecutionEmbedded>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PipelineExecutionEmbedded" /> class.
        /// </summary>
        /// <param name="stepStates">stepStates.</param>
        public PipelineExecutionEmbedded(List<PipelineExecutionStepState> stepStates = default(List<PipelineExecutionStepState>))
        {
            this.StepStates = stepStates;
        }
        
        /// <summary>
        /// Gets or Sets StepStates
        /// </summary>
        [DataMember(Name="stepStates", EmitDefaultValue=false)]
        public List<PipelineExecutionStepState> StepStates { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PipelineExecutionEmbedded {\n");
            sb.Append("  StepStates: ").Append(StepStates).Append("\n");
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
            return this.Equals(input as PipelineExecutionEmbedded);
        }

        /// <summary>
        /// Returns true if PipelineExecutionEmbedded instances are equal
        /// </summary>
        /// <param name="input">Instance of PipelineExecutionEmbedded to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PipelineExecutionEmbedded input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.StepStates == input.StepStates ||
                    this.StepStates != null &&
                    input.StepStates != null &&
                    this.StepStates.SequenceEqual(input.StepStates)
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
                if (this.StepStates != null)
                    hashCode = hashCode * 59 + this.StepStates.GetHashCode();
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
