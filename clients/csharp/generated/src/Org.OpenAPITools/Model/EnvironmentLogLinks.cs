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
    /// EnvironmentLogLinks
    /// </summary>
    [DataContract]
    public partial class EnvironmentLogLinks :  IEquatable<EnvironmentLogLinks>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EnvironmentLogLinks" /> class.
        /// </summary>
        /// <param name="httpNsAdobeComAdobecloudRelLogsDownload">httpNsAdobeComAdobecloudRelLogsDownload.</param>
        /// <param name="httpNsAdobeComAdobecloudRelLogsTail">httpNsAdobeComAdobecloudRelLogsTail.</param>
        public EnvironmentLogLinks(HalLink httpNsAdobeComAdobecloudRelLogsDownload = default(HalLink), HalLink httpNsAdobeComAdobecloudRelLogsTail = default(HalLink))
        {
            this.HttpNsAdobeComAdobecloudRelLogsDownload = httpNsAdobeComAdobecloudRelLogsDownload;
            this.HttpNsAdobeComAdobecloudRelLogsTail = httpNsAdobeComAdobecloudRelLogsTail;
        }
        
        /// <summary>
        /// Gets or Sets HttpNsAdobeComAdobecloudRelLogsDownload
        /// </summary>
        [DataMember(Name="http://ns.adobe.com/adobecloud/rel/logs/download", EmitDefaultValue=false)]
        public HalLink HttpNsAdobeComAdobecloudRelLogsDownload { get; set; }

        /// <summary>
        /// Gets or Sets HttpNsAdobeComAdobecloudRelLogsTail
        /// </summary>
        [DataMember(Name="http://ns.adobe.com/adobecloud/rel/logs/tail", EmitDefaultValue=false)]
        public HalLink HttpNsAdobeComAdobecloudRelLogsTail { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class EnvironmentLogLinks {\n");
            sb.Append("  HttpNsAdobeComAdobecloudRelLogsDownload: ").Append(HttpNsAdobeComAdobecloudRelLogsDownload).Append("\n");
            sb.Append("  HttpNsAdobeComAdobecloudRelLogsTail: ").Append(HttpNsAdobeComAdobecloudRelLogsTail).Append("\n");
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
            return this.Equals(input as EnvironmentLogLinks);
        }

        /// <summary>
        /// Returns true if EnvironmentLogLinks instances are equal
        /// </summary>
        /// <param name="input">Instance of EnvironmentLogLinks to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EnvironmentLogLinks input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.HttpNsAdobeComAdobecloudRelLogsDownload == input.HttpNsAdobeComAdobecloudRelLogsDownload ||
                    (this.HttpNsAdobeComAdobecloudRelLogsDownload != null &&
                    this.HttpNsAdobeComAdobecloudRelLogsDownload.Equals(input.HttpNsAdobeComAdobecloudRelLogsDownload))
                ) && 
                (
                    this.HttpNsAdobeComAdobecloudRelLogsTail == input.HttpNsAdobeComAdobecloudRelLogsTail ||
                    (this.HttpNsAdobeComAdobecloudRelLogsTail != null &&
                    this.HttpNsAdobeComAdobecloudRelLogsTail.Equals(input.HttpNsAdobeComAdobecloudRelLogsTail))
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
                if (this.HttpNsAdobeComAdobecloudRelLogsDownload != null)
                    hashCode = hashCode * 59 + this.HttpNsAdobeComAdobecloudRelLogsDownload.GetHashCode();
                if (this.HttpNsAdobeComAdobecloudRelLogsTail != null)
                    hashCode = hashCode * 59 + this.HttpNsAdobeComAdobecloudRelLogsTail.GetHashCode();
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
