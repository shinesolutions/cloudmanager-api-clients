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
    /// Filtering and sorting page details
    /// </summary>
    [DataContract]
    public partial class RequestedPageDetails : IEquatable<RequestedPageDetails>
    {
        /// <summary>
        /// Gets or Sets Start
        /// </summary>
        [DataMember(Name="start", EmitDefaultValue=false)]
        public int Start { get; set; }

        /// <summary>
        /// Gets or Sets Limit
        /// </summary>
        [DataMember(Name="limit", EmitDefaultValue=false)]
        public int Limit { get; set; }

        /// <summary>
        /// Gets or Sets OrderBy
        /// </summary>
        [DataMember(Name="orderBy", EmitDefaultValue=false)]
        public string OrderBy { get; set; }

        /// <summary>
        /// Gets or Sets Property
        /// </summary>
        [DataMember(Name="property", EmitDefaultValue=false)]
        public List<string> Property { get; set; }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name="type", EmitDefaultValue=false)]
        public string Type { get; set; }

        /// <summary>
        /// Gets or Sets Next
        /// </summary>
        [DataMember(Name="next", EmitDefaultValue=false)]
        public int Next { get; set; }

        /// <summary>
        /// Gets or Sets Prev
        /// </summary>
        [DataMember(Name="prev", EmitDefaultValue=false)]
        public int Prev { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class RequestedPageDetails {\n");
            sb.Append("  Start: ").Append(Start).Append("\n");
            sb.Append("  Limit: ").Append(Limit).Append("\n");
            sb.Append("  OrderBy: ").Append(OrderBy).Append("\n");
            sb.Append("  Property: ").Append(Property).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Next: ").Append(Next).Append("\n");
            sb.Append("  Prev: ").Append(Prev).Append("\n");
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
            return obj.GetType() == GetType() && Equals((RequestedPageDetails)obj);
        }

        /// <summary>
        /// Returns true if RequestedPageDetails instances are equal
        /// </summary>
        /// <param name="other">Instance of RequestedPageDetails to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RequestedPageDetails other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Start == other.Start ||
                    
                    Start.Equals(other.Start)
                ) && 
                (
                    Limit == other.Limit ||
                    
                    Limit.Equals(other.Limit)
                ) && 
                (
                    OrderBy == other.OrderBy ||
                    OrderBy != null &&
                    OrderBy.Equals(other.OrderBy)
                ) && 
                (
                    Property == other.Property ||
                    Property != null &&
                    other.Property != null &&
                    Property.SequenceEqual(other.Property)
                ) && 
                (
                    Type == other.Type ||
                    Type != null &&
                    Type.Equals(other.Type)
                ) && 
                (
                    Next == other.Next ||
                    
                    Next.Equals(other.Next)
                ) && 
                (
                    Prev == other.Prev ||
                    
                    Prev.Equals(other.Prev)
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
                    
                    hashCode = hashCode * 59 + Start.GetHashCode();
                    
                    hashCode = hashCode * 59 + Limit.GetHashCode();
                    if (OrderBy != null)
                    hashCode = hashCode * 59 + OrderBy.GetHashCode();
                    if (Property != null)
                    hashCode = hashCode * 59 + Property.GetHashCode();
                    if (Type != null)
                    hashCode = hashCode * 59 + Type.GetHashCode();
                    
                    hashCode = hashCode * 59 + Next.GetHashCode();
                    
                    hashCode = hashCode * 59 + Prev.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(RequestedPageDetails left, RequestedPageDetails right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(RequestedPageDetails left, RequestedPageDetails right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
