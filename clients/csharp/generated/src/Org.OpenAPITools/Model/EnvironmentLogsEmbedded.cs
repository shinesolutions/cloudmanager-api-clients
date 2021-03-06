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
    /// EnvironmentLogsEmbedded
    /// </summary>
    [DataContract]
    public partial class EnvironmentLogsEmbedded :  IEquatable<EnvironmentLogsEmbedded>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EnvironmentLogsEmbedded" /> class.
        /// </summary>
        /// <param name="downloads">Links to logs.</param>
        public EnvironmentLogsEmbedded(List<EnvironmentLog> downloads = default(List<EnvironmentLog>))
        {
            this.Downloads = downloads;
        }
        
        /// <summary>
        /// Links to logs
        /// </summary>
        /// <value>Links to logs</value>
        [DataMember(Name="downloads", EmitDefaultValue=false)]
        public List<EnvironmentLog> Downloads { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class EnvironmentLogsEmbedded {\n");
            sb.Append("  Downloads: ").Append(Downloads).Append("\n");
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
            return this.Equals(input as EnvironmentLogsEmbedded);
        }

        /// <summary>
        /// Returns true if EnvironmentLogsEmbedded instances are equal
        /// </summary>
        /// <param name="input">Instance of EnvironmentLogsEmbedded to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EnvironmentLogsEmbedded input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Downloads == input.Downloads ||
                    this.Downloads != null &&
                    input.Downloads != null &&
                    this.Downloads.SequenceEqual(input.Downloads)
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
                if (this.Downloads != null)
                    hashCode = hashCode * 59 + this.Downloads.GetHashCode();
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
