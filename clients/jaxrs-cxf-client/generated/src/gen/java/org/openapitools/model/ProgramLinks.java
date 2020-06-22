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

public class ProgramLinks  {
  
  @ApiModelProperty(value = "")
  private HalLink httpColonNsAdobeComAdobecloudRelPipelines;

  @ApiModelProperty(value = "")
  private HalLink httpColonNsAdobeComAdobecloudRelEnvironments;

  @ApiModelProperty(value = "")
  private HalLink httpColonNsAdobeComAdobecloudRelRepositories;

  @ApiModelProperty(value = "")
  private HalLink self;
 /**
   * Get httpColonNsAdobeComAdobecloudRelPipelines
   * @return httpColonNsAdobeComAdobecloudRelPipelines
  **/
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/pipelines")
  public HalLink getHttpColonNsAdobeComAdobecloudRelPipelines() {
    return httpColonNsAdobeComAdobecloudRelPipelines;
  }

  public void setHttpColonNsAdobeComAdobecloudRelPipelines(HalLink httpColonNsAdobeComAdobecloudRelPipelines) {
    this.httpColonNsAdobeComAdobecloudRelPipelines = httpColonNsAdobeComAdobecloudRelPipelines;
  }

  public ProgramLinks httpColonNsAdobeComAdobecloudRelPipelines(HalLink httpColonNsAdobeComAdobecloudRelPipelines) {
    this.httpColonNsAdobeComAdobecloudRelPipelines = httpColonNsAdobeComAdobecloudRelPipelines;
    return this;
  }

 /**
   * Get httpColonNsAdobeComAdobecloudRelEnvironments
   * @return httpColonNsAdobeComAdobecloudRelEnvironments
  **/
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/environments")
  public HalLink getHttpColonNsAdobeComAdobecloudRelEnvironments() {
    return httpColonNsAdobeComAdobecloudRelEnvironments;
  }

  public void setHttpColonNsAdobeComAdobecloudRelEnvironments(HalLink httpColonNsAdobeComAdobecloudRelEnvironments) {
    this.httpColonNsAdobeComAdobecloudRelEnvironments = httpColonNsAdobeComAdobecloudRelEnvironments;
  }

  public ProgramLinks httpColonNsAdobeComAdobecloudRelEnvironments(HalLink httpColonNsAdobeComAdobecloudRelEnvironments) {
    this.httpColonNsAdobeComAdobecloudRelEnvironments = httpColonNsAdobeComAdobecloudRelEnvironments;
    return this;
  }

 /**
   * Get httpColonNsAdobeComAdobecloudRelRepositories
   * @return httpColonNsAdobeComAdobecloudRelRepositories
  **/
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/repositories")
  public HalLink getHttpColonNsAdobeComAdobecloudRelRepositories() {
    return httpColonNsAdobeComAdobecloudRelRepositories;
  }

  public void setHttpColonNsAdobeComAdobecloudRelRepositories(HalLink httpColonNsAdobeComAdobecloudRelRepositories) {
    this.httpColonNsAdobeComAdobecloudRelRepositories = httpColonNsAdobeComAdobecloudRelRepositories;
  }

  public ProgramLinks httpColonNsAdobeComAdobecloudRelRepositories(HalLink httpColonNsAdobeComAdobecloudRelRepositories) {
    this.httpColonNsAdobeComAdobecloudRelRepositories = httpColonNsAdobeComAdobecloudRelRepositories;
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

  public ProgramLinks self(HalLink self) {
    this.self = self;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgramLinks {\n");
    
    sb.append("    httpColonNsAdobeComAdobecloudRelPipelines: ").append(toIndentedString(httpColonNsAdobeComAdobecloudRelPipelines)).append("\n");
    sb.append("    httpColonNsAdobeComAdobecloudRelEnvironments: ").append(toIndentedString(httpColonNsAdobeComAdobecloudRelEnvironments)).append("\n");
    sb.append("    httpColonNsAdobeComAdobecloudRelRepositories: ").append(toIndentedString(httpColonNsAdobeComAdobecloudRelRepositories)).append("\n");
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

