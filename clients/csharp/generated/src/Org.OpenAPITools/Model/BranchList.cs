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
    /// BranchList
    /// </summary>
    [DataContract]
    public partial class BranchList :  IEquatable<BranchList>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="BranchList" /> class.
        /// </summary>
        /// <param name="totalNumberOfItems">totalNumberOfItems.</param>
        /// <param name="embedded">embedded.</param>
        /// <param name="links">links.</param>
        public BranchList(int totalNumberOfItems = default(int), BranchListEmbedded embedded = default(BranchListEmbedded), ProgramListLinks links = default(ProgramListLinks))
        {
            this.TotalNumberOfItems = totalNumberOfItems;
            this.Embedded = embedded;
            this.Links = links;
        }
        
        /// <summary>
        /// Gets or Sets TotalNumberOfItems
        /// </summary>
        [DataMember(Name="_totalNumberOfItems", EmitDefaultValue=false)]
        public int TotalNumberOfItems { get; set; }

        /// <summary>
        /// Gets or Sets Embedded
        /// </summary>
        [DataMember(Name="_embedded", EmitDefaultValue=false)]
        public BranchListEmbedded Embedded { get; set; }

        /// <summary>
        /// Gets or Sets Links
        /// </summary>
        [DataMember(Name="_links", EmitDefaultValue=false)]
        public ProgramListLinks Links { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class BranchList {\n");
            sb.Append("  TotalNumberOfItems: ").Append(TotalNumberOfItems).Append("\n");
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
            return this.Equals(input as BranchList);
        }

        /// <summary>
        /// Returns true if BranchList instances are equal
        /// </summary>
        /// <param name="input">Instance of BranchList to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BranchList input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.TotalNumberOfItems == input.TotalNumberOfItems ||
                    (this.TotalNumberOfItems != null &&
                    this.TotalNumberOfItems.Equals(input.TotalNumberOfItems))
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
                if (this.TotalNumberOfItems != null)
                    hashCode = hashCode * 59 + this.TotalNumberOfItems.GetHashCode();
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
