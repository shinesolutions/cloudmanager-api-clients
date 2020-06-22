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
    /// Describes an __Embedded Program__
    /// </summary>
    [DataContract]
    public partial class EmbeddedProgram : IEquatable<EmbeddedProgram>
    {
        /// <summary>
        /// Identifier of the program. Unique within the space.
        /// </summary>
        /// <value>Identifier of the program. Unique within the space.</value>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; private set; }

        /// <summary>
        /// Name of the program
        /// </summary>
        /// <value>Name of the program</value>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; private set; }

        /// <summary>
        /// Whether this Program has been enabled for Cloud Manager usage
        /// </summary>
        /// <value>Whether this Program has been enabled for Cloud Manager usage</value>
        [DataMember(Name="enabled", EmitDefaultValue=false)]
        public bool Enabled { get; private set; } = false;

        /// <summary>
        /// Tenant Id
        /// </summary>
        /// <value>Tenant Id</value>
        [DataMember(Name="tenantId", EmitDefaultValue=false)]
        public string TenantId { get; private set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class EmbeddedProgram {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Enabled: ").Append(Enabled).Append("\n");
            sb.Append("  TenantId: ").Append(TenantId).Append("\n");
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
            return obj.GetType() == GetType() && Equals((EmbeddedProgram)obj);
        }

        /// <summary>
        /// Returns true if EmbeddedProgram instances are equal
        /// </summary>
        /// <param name="other">Instance of EmbeddedProgram to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EmbeddedProgram other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Id == other.Id ||
                    Id != null &&
                    Id.Equals(other.Id)
                ) && 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    Enabled == other.Enabled ||
                    
                    Enabled.Equals(other.Enabled)
                ) && 
                (
                    TenantId == other.TenantId ||
                    TenantId != null &&
                    TenantId.Equals(other.TenantId)
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
                    if (Id != null)
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    
                    hashCode = hashCode * 59 + Enabled.GetHashCode();
                    if (TenantId != null)
                    hashCode = hashCode * 59 + TenantId.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(EmbeddedProgram left, EmbeddedProgram right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(EmbeddedProgram left, EmbeddedProgram right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
