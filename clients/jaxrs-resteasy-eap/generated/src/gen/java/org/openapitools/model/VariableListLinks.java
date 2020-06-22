package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.HalLink;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-06-22T02:54:15.715Z[GMT]")
public class VariableListLinks   {
  

  private HalLink httpColonNsAdobeComAdobecloudRelEnvironment;

  private HalLink httpColonNsAdobeComAdobecloudRelProgram;

  private HalLink self;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/environment")
  public HalLink getHttpColonNsAdobeComAdobecloudRelEnvironment() {
    return httpColonNsAdobeComAdobecloudRelEnvironment;
  }
  public void setHttpColonNsAdobeComAdobecloudRelEnvironment(HalLink httpColonNsAdobeComAdobecloudRelEnvironment) {
    this.httpColonNsAdobeComAdobecloudRelEnvironment = httpColonNsAdobeComAdobecloudRelEnvironment;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/program")
  public HalLink getHttpColonNsAdobeComAdobecloudRelProgram() {
    return httpColonNsAdobeComAdobecloudRelProgram;
  }
  public void setHttpColonNsAdobeComAdobecloudRelProgram(HalLink httpColonNsAdobeComAdobecloudRelProgram) {
    this.httpColonNsAdobeComAdobecloudRelProgram = httpColonNsAdobeComAdobecloudRelProgram;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("self")
  public HalLink getSelf() {
    return self;
  }
  public void setSelf(HalLink self) {
    this.self = self;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariableListLinks variableListLinks = (VariableListLinks) o;
    return Objects.equals(httpColonNsAdobeComAdobecloudRelEnvironment, variableListLinks.httpColonNsAdobeComAdobecloudRelEnvironment) &&
        Objects.equals(httpColonNsAdobeComAdobecloudRelProgram, variableListLinks.httpColonNsAdobeComAdobecloudRelProgram) &&
        Objects.equals(self, variableListLinks.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpColonNsAdobeComAdobecloudRelEnvironment, httpColonNsAdobeComAdobecloudRelProgram, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableListLinks {\n");
    
    sb.append("    httpColonNsAdobeComAdobecloudRelEnvironment: ").append(toIndentedString(httpColonNsAdobeComAdobecloudRelEnvironment)).append("\n");
    sb.append("    httpColonNsAdobeComAdobecloudRelProgram: ").append(toIndentedString(httpColonNsAdobeComAdobecloudRelProgram)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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

