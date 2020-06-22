package apimodels;

import apimodels.HalLink;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * EnvironmentLogLinks
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-22T02:53:34.661Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class EnvironmentLogLinks   {
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/logs/download")
  private HalLink httpColonNsAdobeComAdobecloudRelLogsDownload;

  @JsonProperty("http://ns.adobe.com/adobecloud/rel/logs/tail")
  private HalLink httpColonNsAdobeComAdobecloudRelLogsTail;

  public EnvironmentLogLinks httpColonNsAdobeComAdobecloudRelLogsDownload(HalLink httpColonNsAdobeComAdobecloudRelLogsDownload) {
    this.httpColonNsAdobeComAdobecloudRelLogsDownload = httpColonNsAdobeComAdobecloudRelLogsDownload;
    return this;
  }

   /**
   * Get httpColonNsAdobeComAdobecloudRelLogsDownload
   * @return httpColonNsAdobeComAdobecloudRelLogsDownload
  **/
  @Valid
  public HalLink getHttpColonNsAdobeComAdobecloudRelLogsDownload() {
    return httpColonNsAdobeComAdobecloudRelLogsDownload;
  }

  public void setHttpColonNsAdobeComAdobecloudRelLogsDownload(HalLink httpColonNsAdobeComAdobecloudRelLogsDownload) {
    this.httpColonNsAdobeComAdobecloudRelLogsDownload = httpColonNsAdobeComAdobecloudRelLogsDownload;
  }

  public EnvironmentLogLinks httpColonNsAdobeComAdobecloudRelLogsTail(HalLink httpColonNsAdobeComAdobecloudRelLogsTail) {
    this.httpColonNsAdobeComAdobecloudRelLogsTail = httpColonNsAdobeComAdobecloudRelLogsTail;
    return this;
  }

   /**
   * Get httpColonNsAdobeComAdobecloudRelLogsTail
   * @return httpColonNsAdobeComAdobecloudRelLogsTail
  **/
  @Valid
  public HalLink getHttpColonNsAdobeComAdobecloudRelLogsTail() {
    return httpColonNsAdobeComAdobecloudRelLogsTail;
  }

  public void setHttpColonNsAdobeComAdobecloudRelLogsTail(HalLink httpColonNsAdobeComAdobecloudRelLogsTail) {
    this.httpColonNsAdobeComAdobecloudRelLogsTail = httpColonNsAdobeComAdobecloudRelLogsTail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

