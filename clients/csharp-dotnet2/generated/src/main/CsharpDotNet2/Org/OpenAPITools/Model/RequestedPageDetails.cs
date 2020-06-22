using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// Filtering and sorting page details
  /// </summary>
  [DataContract]
  public class RequestedPageDetails {
    /// <summary>
    /// Gets or Sets Start
    /// </summary>
    [DataMember(Name="start", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "start")]
    public int? Start { get; set; }

    /// <summary>
    /// Gets or Sets Limit
    /// </summary>
    [DataMember(Name="limit", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "limit")]
    public int? Limit { get; set; }

    /// <summary>
    /// Gets or Sets OrderBy
    /// </summary>
    [DataMember(Name="orderBy", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "orderBy")]
    public string OrderBy { get; set; }

    /// <summary>
    /// Gets or Sets Property
    /// </summary>
    [DataMember(Name="property", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "property")]
    public List<string> Property { get; set; }

    /// <summary>
    /// Gets or Sets Type
    /// </summary>
    [DataMember(Name="type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "type")]
    public string Type { get; set; }

    /// <summary>
    /// Gets or Sets Next
    /// </summary>
    [DataMember(Name="next", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "next")]
    public int? Next { get; set; }

    /// <summary>
    /// Gets or Sets Prev
    /// </summary>
    [DataMember(Name="prev", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "prev")]
    public int? Prev { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
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
    /// Get the JSON string presentation of the object
    /// </summary>
    /// <returns>JSON string presentation of the object</returns>
    public string ToJson() {
      return JsonConvert.SerializeObject(this, Formatting.Indented);
    }

}
}
