package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.HalLink;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EnvironmentLogLinks   {
  
  private HalLink httpColonNsAdobeComAdobecloudRelLogsDownload;
  private HalLink httpColonNsAdobeComAdobecloudRelLogsTail;

  public EnvironmentLogLinks () {

  }

  public EnvironmentLogLinks (HalLink httpColonNsAdobeComAdobecloudRelLogsDownload, HalLink httpColonNsAdobeComAdobecloudRelLogsTail) {
    this.httpColonNsAdobeComAdobecloudRelLogsDownload = httpColonNsAdobeComAdobecloudRelLogsDownload;
    this.httpColonNsAdobeComAdobecloudRelLogsTail = httpColonNsAdobeComAdobecloudRelLogsTail;
  }

    
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/logs/download")
  public HalLink getHttpColonNsAdobeComAdobecloudRelLogsDownload() {
    return httpColonNsAdobeComAdobecloudRelLogsDownload;
  }
  public void setHttpColonNsAdobeComAdobecloudRelLogsDownload(HalLink httpColonNsAdobeComAdobecloudRelLogsDownload) {
    this.httpColonNsAdobeComAdobecloudRelLogsDownload = httpColonNsAdobeComAdobecloudRelLogsDownload;
  }

    
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/logs/tail")
  public HalLink getHttpColonNsAdobeComAdobecloudRelLogsTail() {
    return httpColonNsAdobeComAdobecloudRelLogsTail;
  }
  public void setHttpColonNsAdobeComAdobecloudRelLogsTail(HalLink httpColonNsAdobeComAdobecloudRelLogsTail) {
    this.httpColonNsAdobeComAdobecloudRelLogsTail = httpColonNsAdobeComAdobecloudRelLogsTail;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvironmentLogLinks environmentLogLinks = (EnvironmentLogLinks) o;
    return Objects.equals(httpColonNsAdobeComAdobecloudRelLogsDownload, environmentLogLinks.httpColonNsAdobeComAdobecloudRelLogsDownload) &&
        Objects.equals(httpColonNsAdobeComAdobecloudRelLogsTail, environmentLogLinks.httpColonNsAdobeComAdobecloudRelLogsTail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpColonNsAdobeComAdobecloudRelLogsDownload, httpColonNsAdobeComAdobecloudRelLogsTail);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
