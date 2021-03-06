package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.HalLink;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2020-06-22T02:54:21.117Z[GMT]")
public class VariableListLinks   {
  
  private @Valid HalLink httpColonNsAdobeComAdobecloudRelEnvironment;
  private @Valid HalLink httpColonNsAdobeComAdobecloudRelProgram;
  private @Valid HalLink self;

  /**
   **/
  public VariableListLinks httpColonNsAdobeComAdobecloudRelEnvironment(HalLink httpColonNsAdobeComAdobecloudRelEnvironment) {
    this.httpColonNsAdobeComAdobecloudRelEnvironment = httpColonNsAdobeComAdobecloudRelEnvironment;
    return this;
  }

  
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
  public VariableListLinks httpColonNsAdobeComAdobecloudRelProgram(HalLink httpColonNsAdobeComAdobecloudRelProgram) {
    this.httpColonNsAdobeComAdobecloudRelProgram = httpColonNsAdobeComAdobecloudRelProgram;
    return this;
  }

  
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
  public VariableListLinks self(HalLink self) {
    this.self = self;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("self")
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
    VariableListLinks variableListLinks = (VariableListLinks) o;
    return Objects.equals(this.httpColonNsAdobeComAdobecloudRelEnvironment, variableListLinks.httpColonNsAdobeComAdobecloudRelEnvironment) &&
        Objects.equals(this.httpColonNsAdobeComAdobecloudRelProgram, variableListLinks.httpColonNsAdobeComAdobecloudRelProgram) &&
        Objects.equals(this.self, variableListLinks.self);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

