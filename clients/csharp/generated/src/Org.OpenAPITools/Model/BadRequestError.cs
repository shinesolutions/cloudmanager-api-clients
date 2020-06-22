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
    /// A Bad Request response error.
    /// </summary>
    [DataContract]
    public partial class BadRequestError :  IEquatable<BadRequestError>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="BadRequestError" /> class.
        /// </summary>
        /// <param name="status">HTTP status code of the response..</param>
        /// <param name="type">Error type identifier..</param>
        /// <param name="title">A short summary of the error..</param>
        /// <param name="missingParams">Request&#39;s missing parameters..</param>
        /// <param name="invalidParams">Request&#39;s invalid parameters..</param>
        public BadRequestError(int status = default(int), string type = default(string), string title = default(string), List<MissingParameter> missingParams = default(List<MissingParameter>), List<InvalidParameter> invalidParams = default(List<InvalidParameter>))
        {
            this.Status = status;
            this.Type = type;
            this.Title = title;
            this.MissingParams = missingParams;
            this.InvalidParams = invalidParams;
        }
        
        /// <summary>
        /// HTTP status code of the response.
        /// </summary>
        /// <value>HTTP status code of the response.</value>
        [DataMember(Name="status", EmitDefaultValue=false)]
        public int Status { get; set; }

        /// <summary>
        /// Error type identifier.
        /// </summary>
        /// <value>Error type identifier.</value>
        [DataMember(Name="type", EmitDefaultValue=false)]
        public string Type { get; set; }

        /// <summary>
        /// A short summary of the error.
        /// </summary>
        /// <value>A short summary of the error.</value>
        [DataMember(Name="title", EmitDefaultValue=false)]
        public string Title { get; set; }

        /// <summary>
        /// Request&#39;s missing parameters.
        /// </summary>
        /// <value>Request&#39;s missing parameters.</value>
        [DataMember(Name="missingParams", EmitDefaultValue=false)]
        public List<MissingParameter> MissingParams { get; set; }

        /// <summary>
        /// Request&#39;s invalid parameters.
        /// </summary>
        /// <value>Request&#39;s invalid parameters.</value>
        [DataMember(Name="invalidParams", EmitDefaultValue=false)]
        public List<InvalidParameter> InvalidParams { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class BadRequestError {\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
            sb.Append("  MissingParams: ").Append(MissingParams).Append("\n");
            sb.Append("  InvalidParams: ").Append(InvalidParams).Append("\n");
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
            return this.Equals(input as BadRequestError);
        }

        /// <summary>
        /// Returns true if BadRequestError instances are equal
        /// </summary>
        /// <param name="input">Instance of BadRequestError to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BadRequestError input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Status == input.Status ||
                    (this.Status != null &&
                    this.Status.Equals(input.Status))
                ) && 
                (
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
                ) && 
                (
                    this.Title == input.Title ||
                    (this.Title != null &&
                    this.Title.Equals(input.Title))
                ) && 
                (
                    this.MissingParams == input.MissingParams ||
                    this.MissingParams != null &&
                    input.MissingParams != null &&
                    this.MissingParams.SequenceEqual(input.MissingParams)
                ) && 
                (
                    this.InvalidParams == input.InvalidParams ||
                    this.InvalidParams != null &&
                    input.InvalidParams != null &&
                    this.InvalidParams.SequenceEqual(input.InvalidParams)
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
                if (this.Status != null)
                    hashCode = hashCode * 59 + this.Status.GetHashCode();
                if (this.Type != null)
                    hashCode = hashCode * 59 + this.Type.GetHashCode();
                if (this.Title != null)
                    hashCode = hashCode * 59 + this.Title.GetHashCode();
                if (this.MissingParams != null)
                    hashCode = hashCode * 59 + this.MissingParams.GetHashCode();
                if (this.InvalidParams != null)
                    hashCode = hashCode * 59 + this.InvalidParams.GetHashCode();
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
