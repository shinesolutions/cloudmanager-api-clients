package org.openapitools.model;

import org.openapitools.model.HalLink;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EnvironmentLogLinks  {
  
  @ApiModelProperty(value = "")
  private HalLink httpColonNsAdobeComAdobecloudRelLogsDownload;

  @ApiModelProperty(value = "")
  private HalLink httpColonNsAdobeComAdobecloudRelLogsTail;
 /**
   * Get httpColonNsAdobeComAdobecloudRelLogsDownload
   * @return httpColonNsAdobeComAdobecloudRelLogsDownload
  **/
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/logs/download")
  public HalLink getHttpColonNsAdobeComAdobecloudRelLogsDownload() {
    return httpColonNsAdobeComAdobecloudRelLogsDownload;
  }

  public void setHttpColonNsAdobeComAdobecloudRelLogsDownload(HalLink httpColonNsAdobeComAdobecloudRelLogsDownload) {
    this.httpColonNsAdobeComAdobecloudRelLogsDownload = httpColonNsAdobeComAdobecloudRelLogsDownload;
  }

  public EnvironmentLogLinks httpColonNsAdobeComAdobecloudRelLogsDownload(HalLink httpColonNsAdobeComAdobecloudRelLogsDownload) {
    this.httpColonNsAdobeComAdobecloudRelLogsDownload = httpColonNsAdobeComAdobecloudRelLogsDownload;
    return this;
  }

 /**
   * Get httpColonNsAdobeComAdobecloudRelLogsTail
   * @return httpColonNsAdobeComAdobecloudRelLogsTail
  **/
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/logs/tail")
  public HalLink getHttpColonNsAdobeComAdobecloudRelLogsTail() {
    return httpColonNsAdobeComAdobecloudRelLogsTail;
  }

  public void setHttpColonNsAdobeComAdobecloudRelLogsTail(HalLink httpColonNsAdobeComAdobecloudRelLogsTail) {
    this.httpColonNsAdobeComAdobecloudRelLogsTail = httpColonNsAdobeComAdobecloudRelLogsTail;
  }

  public EnvironmentLogLinks httpColonNsAdobeComAdobecloudRelLogsTail(HalLink httpColonNsAdobeComAdobecloudRelLogsTail) {
    this.httpColonNsAdobeComAdobecloudRelLogsTail = httpColonNsAdobeComAdobecloudRelLogsTail;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvironmentLogLinks {\n");
    
    sb.append("    httpColonNsAdobeComAdobecloudRelLogsDownload: ").append(toIndentedString(httpColonNsAdobeComAdobecloudRelLogsDownload)).append("\n");
    sb.append("    httpColonNsAdobeComAdobecloudRelLogsTail: ").append(toIndentedString(httpColonNsAdobeComAdobecloudRelLogsTail)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

