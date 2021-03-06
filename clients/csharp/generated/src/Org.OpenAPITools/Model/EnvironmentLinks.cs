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
    /// EnvironmentLinks
    /// </summary>
    [DataContract]
    public partial class EnvironmentLinks :  IEquatable<EnvironmentLinks>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EnvironmentLinks" /> class.
        /// </summary>
        /// <param name="httpNsAdobeComAdobecloudRelProgram">httpNsAdobeComAdobecloudRelProgram.</param>
        /// <param name="httpNsAdobeComAdobecloudRelPipeline">httpNsAdobeComAdobecloudRelPipeline.</param>
        /// <param name="httpNsAdobeComAdobecloudRelAuthor">httpNsAdobeComAdobecloudRelAuthor.</param>
        /// <param name="httpNsAdobeComAdobecloudRelPublish">httpNsAdobeComAdobecloudRelPublish.</param>
        /// <param name="httpNsAdobeComAdobecloudRelDeveloperConsole">httpNsAdobeComAdobecloudRelDeveloperConsole.</param>
        /// <param name="httpNsAdobeComAdobecloudRelLogs">httpNsAdobeComAdobecloudRelLogs.</param>
        /// <param name="httpNsAdobeComAdobecloudRelVariables">httpNsAdobeComAdobecloudRelVariables.</param>
        /// <param name="self">self.</param>
        public EnvironmentLinks(HalLink httpNsAdobeComAdobecloudRelProgram = default(HalLink), HalLink httpNsAdobeComAdobecloudRelPipeline = default(HalLink), HalLink httpNsAdobeComAdobecloudRelAuthor = default(HalLink), HalLink httpNsAdobeComAdobecloudRelPublish = default(HalLink), HalLink httpNsAdobeComAdobecloudRelDeveloperConsole = default(HalLink), HalLink httpNsAdobeComAdobecloudRelLogs = default(HalLink), HalLink httpNsAdobeComAdobecloudRelVariables = default(HalLink), HalLink self = default(HalLink))
        {
            this.HttpNsAdobeComAdobecloudRelProgram = httpNsAdobeComAdobecloudRelProgram;
            this.HttpNsAdobeComAdobecloudRelPipeline = httpNsAdobeComAdobecloudRelPipeline;
            this.HttpNsAdobeComAdobecloudRelAuthor = httpNsAdobeComAdobecloudRelAuthor;
            this.HttpNsAdobeComAdobecloudRelPublish = httpNsAdobeComAdobecloudRelPublish;
            this.HttpNsAdobeComAdobecloudRelDeveloperConsole = httpNsAdobeComAdobecloudRelDeveloperConsole;
            this.HttpNsAdobeComAdobecloudRelLogs = httpNsAdobeComAdobecloudRelLogs;
            this.HttpNsAdobeComAdobecloudRelVariables = httpNsAdobeComAdobecloudRelVariables;
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
        /// Gets or Sets HttpNsAdobeComAdobecloudRelAuthor
        /// </summary>
        [DataMember(Name="http://ns.adobe.com/adobecloud/rel/author", EmitDefaultValue=false)]
        public HalLink HttpNsAdobeComAdobecloudRelAuthor { get; set; }

        /// <summary>
        /// Gets or Sets HttpNsAdobeComAdobecloudRelPublish
        /// </summary>
        [DataMember(Name="http://ns.adobe.com/adobecloud/rel/publish", EmitDefaultValue=false)]
        public HalLink HttpNsAdobeComAdobecloudRelPublish { get; set; }

        /// <summary>
        /// Gets or Sets HttpNsAdobeComAdobecloudRelDeveloperConsole
        /// </summary>
        [DataMember(Name="http://ns.adobe.com/adobecloud/rel/developerConsole", EmitDefaultValue=false)]
        public HalLink HttpNsAdobeComAdobecloudRelDeveloperConsole { get; set; }

        /// <summary>
        /// Gets or Sets HttpNsAdobeComAdobecloudRelLogs
        /// </summary>
        [DataMember(Name="http://ns.adobe.com/adobecloud/rel/logs", EmitDefaultValue=false)]
        public HalLink HttpNsAdobeComAdobecloudRelLogs { get; set; }

        /// <summary>
        /// Gets or Sets HttpNsAdobeComAdobecloudRelVariables
        /// </summary>
        [DataMember(Name="http://ns.adobe.com/adobecloud/rel/variables", EmitDefaultValue=false)]
        public HalLink HttpNsAdobeComAdobecloudRelVariables { get; set; }

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
            return this.Equals(input as EnvironmentLinks);
        }

        /// <summary>
        /// Returns true if EnvironmentLinks instances are equal
        /// </summary>
        /// <param name="input">Instance of EnvironmentLinks to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EnvironmentLinks input)
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
                    this.HttpNsAdobeComAdobecloudRelAuthor == input.HttpNsAdobeComAdobecloudRelAuthor ||
                    (this.HttpNsAdobeComAdobecloudRelAuthor != null &&
                    this.HttpNsAdobeComAdobecloudRelAuthor.Equals(input.HttpNsAdobeComAdobecloudRelAuthor))
                ) && 
                (
                    this.HttpNsAdobeComAdobecloudRelPublish == input.HttpNsAdobeComAdobecloudRelPublish ||
                    (this.HttpNsAdobeComAdobecloudRelPublish != null &&
                    this.HttpNsAdobeComAdobecloudRelPublish.Equals(input.HttpNsAdobeComAdobecloudRelPublish))
                ) && 
                (
                    this.HttpNsAdobeComAdobecloudRelDeveloperConsole == input.HttpNsAdobeComAdobecloudRelDeveloperConsole ||
                    (this.HttpNsAdobeComAdobecloudRelDeveloperConsole != null &&
                    this.HttpNsAdobeComAdobecloudRelDeveloperConsole.Equals(input.HttpNsAdobeComAdobecloudRelDeveloperConsole))
                ) && 
                (
                    this.HttpNsAdobeComAdobecloudRelLogs == input.HttpNsAdobeComAdobecloudRelLogs ||
                    (this.HttpNsAdobeComAdobecloudRelLogs != null &&
                    this.HttpNsAdobeComAdobecloudRelLogs.Equals(input.HttpNsAdobeComAdobecloudRelLogs))
                ) && 
                (
                    this.HttpNsAdobeComAdobecloudRelVariables == input.HttpNsAdobeComAdobecloudRelVariables ||
                    (this.HttpNsAdobeComAdobecloudRelVariables != null &&
                    this.HttpNsAdobeComAdobecloudRelVariables.Equals(input.HttpNsAdobeComAdobecloudRelVariables))
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
                if (this.HttpNsAdobeComAdobecloudRelAuthor != null)
                    hashCode = hashCode * 59 + this.HttpNsAdobeComAdobecloudRelAuthor.GetHashCode();
                if (this.HttpNsAdobeComAdobecloudRelPublish != null)
                    hashCode = hashCode * 59 + this.HttpNsAdobeComAdobecloudRelPublish.GetHashCode();
                if (this.HttpNsAdobeComAdobecloudRelDeveloperConsole != null)
                    hashCode = hashCode * 59 + this.HttpNsAdobeComAdobecloudRelDeveloperConsole.GetHashCode();
                if (this.HttpNsAdobeComAdobecloudRelLogs != null)
                    hashCode = hashCode * 59 + this.HttpNsAdobeComAdobecloudRelLogs.GetHashCode();
                if (this.HttpNsAdobeComAdobecloudRelVariables != null)
                    hashCode = hashCode * 59 + this.HttpNsAdobeComAdobecloudRelVariables.GetHashCode();
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
