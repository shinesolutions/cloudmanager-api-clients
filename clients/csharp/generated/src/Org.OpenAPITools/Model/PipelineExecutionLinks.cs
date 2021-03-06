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
    /// PipelineExecutionLinks
    /// </summary>
    [DataContract]
    public partial class PipelineExecutionLinks :  IEquatable<PipelineExecutionLinks>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PipelineExecutionLinks" /> class.
        /// </summary>
        /// <param name="httpNsAdobeComAdobecloudRelProgram">httpNsAdobeComAdobecloudRelProgram.</param>
        /// <param name="httpNsAdobeComAdobecloudRelPipeline">httpNsAdobeComAdobecloudRelPipeline.</param>
        /// <param name="self">self.</param>
        public PipelineExecutionLinks(HalLink httpNsAdobeComAdobecloudRelProgram = default(HalLink), HalLink httpNsAdobeComAdobecloudRelPipeline = default(HalLink), HalLink self = default(HalLink))
        {
            this.HttpNsAdobeComAdobecloudRelProgram = httpNsAdobeComAdobecloudRelProgram;
            this.HttpNsAdobeComAdobecloudRelPipeline = httpNsAdobeComAdobecloudRelPipeline;
            this.Self = self;
        }
        
        /// <summary>
        /// Gets or Sets HttpNsAdobeComAdobecloudRelProgram
        /// </summary>
        [DataMember(Name="http://ns.adobe.com/adobecloud/rel/program", EmitDefaultValue=false)]
        public HalLink HttpNsAdobeComAdobecloudRelProgram { get; set; }

        /// <summary>
        /// Gets or Sets HttpNsAdobeComAdobecloudRelPipeline
        /// </summary>
        [DataMember(Name="http://ns.adobe.com/adobecloud/rel/pipeline", EmitDefaultValue=false)]
        public HalLink HttpNsAdobeComAdobecloudRelPipeline { get; set; }

        /// <summary>
        /// Gets or Sets Self
        /// </summary>
        [DataMember(Name="self", EmitDefaultValue=false)]
        public HalLink Self { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PipelineExecutionLinks {\n");
            sb.Append("  HttpNsAdobeComAdobecloudRelProgram: ").Append(HttpNsAdobeComAdobecloudRelProgram).Append("\n");
            sb.Append("  HttpNsAdobeComAdobecloudRelPipeline: ").Append(HttpNsAdobeComAdobecloudRelPipeline).Append("\n");
            sb.Append("  Self: ").Append(Self).Append("\n");
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
            return this.Equals(input as PipelineExecutionLinks);
        }

        /// <summary>
        /// Returns true if PipelineExecutionLinks instances are equal
        /// </summary>
        /// <param name="input">Instance of PipelineExecutionLinks to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PipelineExecutionLinks input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.HttpNsAdobeComAdobecloudRelProgram == input.HttpNsAdobeComAdobecloudRelProgram ||
                    (this.HttpNsAdobeComAdobecloudRelProgram != null &&
                    this.HttpNsAdobeComAdobecloudRelProgram.Equals(input.HttpNsAdobeComAdobecloudRelProgram))
                ) && 
                (
                    this.HttpNsAdobeComAdobecloudRelPipeline == input.HttpNsAdobeComAdobecloudRelPipeline ||
                    (this.HttpNsAdobeComAdobecloudRelPipeline != null &&
                    this.HttpNsAdobeComAdobecloudRelPipeline.Equals(input.HttpNsAdobeComAdobecloudRelPipeline))
                ) && 
                (
                    this.Self == input.Self ||
                    (this.Self != null &&
                    this.Self.Equals(input.Self))
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
                if (this.HttpNsAdobeComAdobecloudRelProgram != null)
                    hashCode = hashCode * 59 + this.HttpNsAdobeComAdobecloudRelProgram.GetHashCode();
                if (this.HttpNsAdobeComAdobecloudRelPipeline != null)
                    hashCode = hashCode * 59 + this.HttpNsAdobeComAdobecloudRelPipeline.GetHashCode();
                if (this.Self != null)
                    hashCode = hashCode * 59 + this.Self.GetHashCode();
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
