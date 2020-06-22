package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.HalLink;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-06-22T02:53:13.843Z[GMT]")
public class VariableListLinks   {
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/environment")
  private HalLink httpColonNsAdobeComAdobecloudRelEnvironment;

  @JsonProperty("http://ns.adobe.com/adobecloud/rel/program")
  private HalLink httpColonNsAdobeComAdobecloudRelProgram;

  @JsonProperty("self")
  private HalLink self;

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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

