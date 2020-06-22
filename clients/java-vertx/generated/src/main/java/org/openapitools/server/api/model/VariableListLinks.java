package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.HalLink;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VariableListLinks   {
  
  private HalLink httpColonNsAdobeComAdobecloudRelEnvironment;
  private HalLink httpColonNsAdobeComAdobecloudRelProgram;
  private HalLink self;

  public VariableListLinks () {

  }

  public VariableListLinks (HalLink httpColonNsAdobeComAdobecloudRelEnvironment, HalLink httpColonNsAdobeComAdobecloudRelProgram, HalLink self) {
    this.httpColonNsAdobeComAdobecloudRelEnvironment = httpColonNsAdobeComAdobecloudRelEnvironment;
    this.httpColonNsAdobeComAdobecloudRelProgram = httpColonNsAdobeComAdobecloudRelProgram;
    this.self = self;
  }

    
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/environment")
  public HalLink getHttpColonNsAdobeComAdobecloudRelEnvironment() {
    return httpColonNsAdobeComAdobecloudRelEnvironment;
  }
  public void setHttpColonNsAdobeComAdobecloudRelEnvironment(HalLink httpColonNsAdobeComAdobecloudRelEnvironment) {
    this.httpColonNsAdobeComAdobecloudRelEnvironment = httpColonNsAdobeComAdobecloudRelEnvironment;
  }

    
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/program")
  public HalLink getHttpColonNsAdobeComAdobecloudRelProgram() {
    return httpColonNsAdobeComAdobecloudRelProgram;
  }
  public void setHttpColonNsAdobeComAdobecloudRelProgram(HalLink httpColonNsAdobeComAdobecloudRelProgram) {
    this.httpColonNsAdobeComAdobecloudRelProgram = httpColonNsAdobeComAdobecloudRelProgram;
  }

    
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
