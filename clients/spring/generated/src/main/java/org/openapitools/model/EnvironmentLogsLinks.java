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
 * EnvironmentLogsLinks
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-06-22T02:57:04.825Z[GMT]")

public class EnvironmentLogsLinks   {
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/program")
  private HalLink httpColonNsAdobeComAdobecloudRelProgram;

  @JsonProperty("self")
  private HalLink self;

  public EnvironmentLogsLinks httpColonNsAdobeComAdobecloudRelProgram(HalLink httpColonNsAdobeComAdobecloudRelProgram) {
    this.httpColonNsAdobeComAdobecloudRelProgram = httpColonNsAdobeComAdobecloudRelProgram;
    return this;
  }

  /**
   * Get httpColonNsAdobeComAdobecloudRelProgram
   * @return httpColonNsAdobeComAdobecloudRelProgram
  */
  @ApiModelProperty(value = "")

  @Valid

  public HalLink getHttpColonNsAdobeComAdobecloudRelProgram() {
    return httpColonNsAdobeComAdobecloudRelProgram;
  }

  public void setHttpColonNsAdobeComAdobecloudRelProgram(HalLink httpColonNsAdobeComAdobecloudRelProgram) {
    this.httpColonNsAdobeComAdobecloudRelProgram = httpColonNsAdobeComAdobecloudRelProgram;
  }

  public EnvironmentLogsLinks self(HalLink self) {
    this.self = self;
    return this;
  }

  /**
   * Get self
   * @return self
  */
  @ApiModelProperty(value = "")

  @Valid

  public HalLink getSelf() {
    return self;
  }

  public void setSelf(HalLink self) {
    this.self = self;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvironmentLogsLinks environmentLogsLinks = (EnvironmentLogsLinks) o;
    return Objects.equals(this.httpColonNsAdobeComAdobecloudRelProgram, environmentLogsLinks.httpColonNsAdobeComAdobecloudRelProgram) &&
        Objects.equals(this.self, environmentLogsLinks.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpColonNsAdobeComAdobecloudRelProgram, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvironmentLogsLinks {\n");
    
    sb.append("    httpColonNsAdobeComAdobecloudRelProgram: ").append(toIndentedString(httpColonNsAdobeComAdobecloudRelProgram)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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

