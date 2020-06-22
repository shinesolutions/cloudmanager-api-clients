using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// A Bad Request response error.
  /// </summary>
  [DataContract]
  public class BadRequestError {
    /// <summary>
    /// HTTP status code of the response.
    /// </summary>
    /// <value>HTTP status code of the response.</value>
    [DataMember(Name="status", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "status")]
    public int? Status { get; set; }

    /// <summary>
    /// Error type identifier.
    /// </summary>
    /// <value>Error type identifier.</value>
    [DataMember(Name="type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "type")]
    public string Type { get; set; }

    /// <summary>
    /// A short summary of the error.
    /// </summary>
    /// <value>A short summary of the error.</value>
    [DataMember(Name="title", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "title")]
    public string Title { get; set; }

    /// <summary>
    /// Request's missing parameters.
    /// </summary>
    /// <value>Request's missing parameters.</value>
    [DataMember(Name="missingParams", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "missingParams")]
    public List<MissingParameter> MissingParams { get; set; }

    /// <summary>
    /// Request's invalid parameters.
    /// </summary>
    /// <value>Request's invalid parameters.</value>
    [DataMember(Name="invalidParams", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "invalidParams")]
    public List<InvalidParameter> InvalidParams { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
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
    /// Get the JSON string presentation of the object
    /// </summary>
    /// <returns>JSON string presentation of the object</returns>
    public string ToJson() {
      return JsonConvert.SerializeObject(this, Formatting.Indented);
    }

}
}
