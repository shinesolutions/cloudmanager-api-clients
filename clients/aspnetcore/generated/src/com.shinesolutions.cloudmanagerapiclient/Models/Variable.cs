/*
 * Cloud Manager API
 *
 * This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: opensource@shinesolutions.com
 * Generated by: https://openapi-generator.tech
 */

using System;
using System.Linq;
using System.Text;
using System.Collections.Generic;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using com.shinesolutions.cloudmanagerapiclient.Converters;

namespace com.shinesolutions.cloudmanagerapiclient.Models
{ 
    /// <summary>
    /// A named value than can be set on an Environment
    /// </summary>
    [DataContract]
    public partial class Variable : IEquatable<Variable>
    {
        /// <summary>
        /// Name of the variable. Of a-z, A-Z, _ and 0-9 Cannot begin with a number.
        /// </summary>
        /// <value>Name of the variable. Of a-z, A-Z, _ and 0-9 Cannot begin with a number.</value>
        [RegularExpression("[a-zA-Z_][a-zA-Z_0-9]*")]
        [StringLength(100, MinimumLength=2)]
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Value of the variable. Read-Write for non-secrets, write-only for secrets.
        /// </summary>
        /// <value>Value of the variable. Read-Write for non-secrets, write-only for secrets.</value>
        [StringLength(2048, MinimumLength=0)]
        [DataMember(Name="value", EmitDefaultValue=false)]
        public string Value { get; set; }


        /// <summary>
        /// Type of the variable. Default `string` if missing. Cannot be changed after creation.
        /// </summary>
        /// <value>Type of the variable. Default `string` if missing. Cannot be changed after creation.</value>
        [TypeConverter(typeof(CustomEnumConverter<TypeEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum TypeEnum
        {
            
            /// <summary>
            /// Enum StringEnum for string
            /// </summary>
            [EnumMember(Value = "string")]
            StringEnum = 1,
            
            /// <summary>
            /// Enum SecretStringEnum for secretString
            /// </summary>
            [EnumMember(Value = "secretString")]
            SecretStringEnum = 2
        }

        /// <summary>
        /// Type of the variable. Default &#x60;string&#x60; if missing. Cannot be changed after creation.
        /// </summary>
        /// <value>Type of the variable. Default &#x60;string&#x60; if missing. Cannot be changed after creation.</value>
        [DataMember(Name="type", EmitDefaultValue=false)]
        public TypeEnum Type { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Variable {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            if (obj is null) return false;
            if (ReferenceEquals(this, obj)) return true;
            return obj.GetType() == GetType() && Equals((Variable)obj);
        }

        /// <summary>
        /// Returns true if Variable instances are equal
        /// </summary>
        /// <param name="other">Instance of Variable to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Variable other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    Value == other.Value ||
                    Value != null &&
                    Value.Equals(other.Value)
                ) && 
                (
                    Type == other.Type ||
                    
                    Type.Equals(other.Type)
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
                var hashCode = 41;
                // Suitable nullity checks etc, of course :)
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    if (Value != null)
                    hashCode = hashCode * 59 + Value.GetHashCode();
                    
                    hashCode = hashCode * 59 + Type.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(Variable left, Variable right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(Variable left, Variable right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
