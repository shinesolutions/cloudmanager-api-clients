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

public class RepositoryLinks  {
  
  @ApiModelProperty(value = "")
  private HalLink httpColonNsAdobeComAdobecloudRelProgram;

  @ApiModelProperty(value = "")
  private HalLink httpColonNsAdobeComAdobecloudRelBranches;

  @ApiModelProperty(value = "")
  private HalLink self;
 /**
   * Get httpColonNsAdobeComAdobecloudRelProgram
   * @return httpColonNsAdobeComAdobecloudRelProgram
  **/
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/program")
  public HalLink getHttpColonNsAdobeComAdobecloudRelProgram() {
    return httpColonNsAdobeComAdobecloudRelProgram;
  }

  public void setHttpColonNsAdobeComAdobecloudRelProgram(HalLink httpColonNsAdobeComAdobecloudRelProgram) {
    this.httpColonNsAdobeComAdobecloudRelProgram = httpColonNsAdobeComAdobecloudRelProgram;
  }

  public RepositoryLinks httpColonNsAdobeComAdobecloudRelProgram(HalLink httpColonNsAdobeComAdobecloudRelProgram) {
    this.httpColonNsAdobeComAdobecloudRelProgram = httpColonNsAdobeComAdobecloudRelProgram;
    return this;
  }

 /**
   * Get httpColonNsAdobeComAdobecloudRelBranches
   * @return httpColonNsAdobeComAdobecloudRelBranches
  **/
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/branches")
  public HalLink getHttpColonNsAdobeComAdobecloudRelBranches() {
    return httpColonNsAdobeComAdobecloudRelBranches;
  }

  public void setHttpColonNsAdobeComAdobecloudRelBranches(HalLink httpColonNsAdobeComAdobecloudRelBranches) {
    this.httpColonNsAdobeComAdobecloudRelBranches = httpColonNsAdobeComAdobecloudRelBranches;
  }

  public RepositoryLinks httpColonNsAdobeComAdobecloudRelBranches(HalLink httpColonNsAdobeComAdobecloudRelBranches) {
    this.httpColonNsAdobeComAdobecloudRelBranches = httpColonNsAdobeComAdobecloudRelBranches;
    return this;
  }

 /**
   * Get self
   * @return self
  **/
  @JsonProperty("self")
  public HalLink getSelf() {
    return self;
  }

  public void setSelf(HalLink self) {
    this.self = self;
  }

  public RepositoryLinks self(HalLink self) {
    this.self = self;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepositoryLinks {\n");
    
    sb.append("    httpColonNsAdobeComAdobecloudRelProgram: ").append(toIndentedString(httpColonNsAdobeComAdobecloudRelProgram)).append("\n");
    sb.append("    httpColonNsAdobeComAdobecloudRelBranches: ").append(toIndentedString(httpColonNsAdobeComAdobecloudRelBranches)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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

