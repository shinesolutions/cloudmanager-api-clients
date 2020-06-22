using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// 
  /// </summary>
  [DataContract]
  public class EnvironmentLogLinks {
    /// <summary>
    /// Gets or Sets HttpNsAdobeComAdobecloudRelLogsDownload
    /// </summary>
    [DataMember(Name="http://ns.adobe.com/adobecloud/rel/logs/download", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "http://ns.adobe.com/adobecloud/rel/logs/download")]
    public HalLink HttpNsAdobeComAdobecloudRelLogsDownload { get; set; }

    /// <summary>
    /// Gets or Sets HttpNsAdobeComAdobecloudRelLogsTail
    /// </summary>
    [DataMember(Name="http://ns.adobe.com/adobecloud/rel/logs/tail", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "http://ns.adobe.com/adobecloud/rel/logs/tail")]
    public HalLink HttpNsAdobeComAdobecloudRelLogsTail { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class EnvironmentLogLinks {\n");
      sb.Append("  HttpNsAdobeComAdobecloudRelLogsDownload: ").Append(HttpNsAdobeComAdobecloudRelLogsDownload).Append("\n");
      sb.Append("  HttpNsAdobeComAdobecloudRelLogsTail: ").Append(HttpNsAdobeComAdobecloudRelLogsTail).Append("\n");
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
