package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.HalLink;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EnvironmentLogLinks
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-06-22T02:57:04.825Z[GMT]")

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
  */
  @ApiModelProperty(value = "")

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
  */
  @ApiModelProperty(value = "")

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
    return Objects.equals(this.httpColonNsAdobeComAdobecloudRelLogsDownload, environmentLogLinks.httpColonNsAdobeComAdobecloudRelLogsDownload) &&
        Objects.equals(this.httpColonNsAdobeComAdobecloudRelLogsTail, environmentLogLinks.httpColonNsAdobeComAdobecloudRelLogsTail);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

