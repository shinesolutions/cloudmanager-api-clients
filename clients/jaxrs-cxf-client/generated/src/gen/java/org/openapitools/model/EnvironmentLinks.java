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

public class EnvironmentLinks  {
  
  @ApiModelProperty(value = "")
  private HalLink httpColonNsAdobeComAdobecloudRelProgram;

  @ApiModelProperty(value = "")
  private HalLink httpColonNsAdobeComAdobecloudRelPipeline;

  @ApiModelProperty(value = "")
  private HalLink httpColonNsAdobeComAdobecloudRelAuthor;

  @ApiModelProperty(value = "")
  private HalLink httpColonNsAdobeComAdobecloudRelPublish;

  @ApiModelProperty(value = "")
  private HalLink httpColonNsAdobeComAdobecloudRelDeveloperConsole;

  @ApiModelProperty(value = "")
  private HalLink httpColonNsAdobeComAdobecloudRelLogs;

  @ApiModelProperty(value = "")
  private HalLink httpColonNsAdobeComAdobecloudRelVariables;

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

  public EnvironmentLinks httpColonNsAdobeComAdobecloudRelProgram(HalLink httpColonNsAdobeComAdobecloudRelProgram) {
    this.httpColonNsAdobeComAdobecloudRelProgram = httpColonNsAdobeComAdobecloudRelProgram;
    return this;
  }

 /**
   * Get httpColonNsAdobeComAdobecloudRelPipeline
   * @return httpColonNsAdobeComAdobecloudRelPipeline
  **/
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/pipeline")
  public HalLink getHttpColonNsAdobeComAdobecloudRelPipeline() {
    return httpColonNsAdobeComAdobecloudRelPipeline;
  }

  public void setHttpColonNsAdobeComAdobecloudRelPipeline(HalLink httpColonNsAdobeComAdobecloudRelPipeline) {
    this.httpColonNsAdobeComAdobecloudRelPipeline = httpColonNsAdobeComAdobecloudRelPipeline;
  }

  public EnvironmentLinks httpColonNsAdobeComAdobecloudRelPipeline(HalLink httpColonNsAdobeComAdobecloudRelPipeline) {
    this.httpColonNsAdobeComAdobecloudRelPipeline = httpColonNsAdobeComAdobecloudRelPipeline;
    return this;
  }

 /**
   * Get httpColonNsAdobeComAdobecloudRelAuthor
   * @return httpColonNsAdobeComAdobecloudRelAuthor
  **/
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/author")
  public HalLink getHttpColonNsAdobeComAdobecloudRelAuthor() {
    return httpColonNsAdobeComAdobecloudRelAuthor;
  }

  public void setHttpColonNsAdobeComAdobecloudRelAuthor(HalLink httpColonNsAdobeComAdobecloudRelAuthor) {
    this.httpColonNsAdobeComAdobecloudRelAuthor = httpColonNsAdobeComAdobecloudRelAuthor;
  }

  public EnvironmentLinks httpColonNsAdobeComAdobecloudRelAuthor(HalLink httpColonNsAdobeComAdobecloudRelAuthor) {
    this.httpColonNsAdobeComAdobecloudRelAuthor = httpColonNsAdobeComAdobecloudRelAuthor;
    return this;
  }

 /**
   * Get httpColonNsAdobeComAdobecloudRelPublish
   * @return httpColonNsAdobeComAdobecloudRelPublish
  **/
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/publish")
  public HalLink getHttpColonNsAdobeComAdobecloudRelPublish() {
    return httpColonNsAdobeComAdobecloudRelPublish;
  }

  public void setHttpColonNsAdobeComAdobecloudRelPublish(HalLink httpColonNsAdobeComAdobecloudRelPublish) {
    this.httpColonNsAdobeComAdobecloudRelPublish = httpColonNsAdobeComAdobecloudRelPublish;
  }

  public EnvironmentLinks httpColonNsAdobeComAdobecloudRelPublish(HalLink httpColonNsAdobeComAdobecloudRelPublish) {
    this.httpColonNsAdobeComAdobecloudRelPublish = httpColonNsAdobeComAdobecloudRelPublish;
    return this;
  }

 /**
   * Get httpColonNsAdobeComAdobecloudRelDeveloperConsole
   * @return httpColonNsAdobeComAdobecloudRelDeveloperConsole
  **/
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/developerConsole")
  public HalLink getHttpColonNsAdobeComAdobecloudRelDeveloperConsole() {
    return httpColonNsAdobeComAdobecloudRelDeveloperConsole;
  }

  public void setHttpColonNsAdobeComAdobecloudRelDeveloperConsole(HalLink httpColonNsAdobeComAdobecloudRelDeveloperConsole) {
    this.httpColonNsAdobeComAdobecloudRelDeveloperConsole = httpColonNsAdobeComAdobecloudRelDeveloperConsole;
  }

  public EnvironmentLinks httpColonNsAdobeComAdobecloudRelDeveloperConsole(HalLink httpColonNsAdobeComAdobecloudRelDeveloperConsole) {
    this.httpColonNsAdobeComAdobecloudRelDeveloperConsole = httpColonNsAdobeComAdobecloudRelDeveloperConsole;
    return this;
  }

 /**
   * Get httpColonNsAdobeComAdobecloudRelLogs
   * @return httpColonNsAdobeComAdobecloudRelLogs
  **/
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/logs")
  public HalLink getHttpColonNsAdobeComAdobecloudRelLogs() {
    return httpColonNsAdobeComAdobecloudRelLogs;
  }

  public void setHttpColonNsAdobeComAdobecloudRelLogs(HalLink httpColonNsAdobeComAdobecloudRelLogs) {
    this.httpColonNsAdobeComAdobecloudRelLogs = httpColonNsAdobeComAdobecloudRelLogs;
  }

  public EnvironmentLinks httpColonNsAdobeComAdobecloudRelLogs(HalLink httpColonNsAdobeComAdobecloudRelLogs) {
    this.httpColonNsAdobeComAdobecloudRelLogs = httpColonNsAdobeComAdobecloudRelLogs;
    return this;
  }

 /**
   * Get httpColonNsAdobeComAdobecloudRelVariables
   * @return httpColonNsAdobeComAdobecloudRelVariables
  **/
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/variables")
  public HalLink getHttpColonNsAdobeComAdobecloudRelVariables() {
    return httpColonNsAdobeComAdobecloudRelVariables;
  }

  public void setHttpColonNsAdobeComAdobecloudRelVariables(HalLink httpColonNsAdobeComAdobecloudRelVariables) {
    this.httpColonNsAdobeComAdobecloudRelVariables = httpColonNsAdobeComAdobecloudRelVariables;
  }

  public EnvironmentLinks httpColonNsAdobeComAdobecloudRelVariables(HalLink httpColonNsAdobeComAdobecloudRelVariables) {
    this.httpColonNsAdobeComAdobecloudRelVariables = httpColonNsAdobeComAdobecloudRelVariables;
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

  public EnvironmentLinks self(HalLink self) {
    this.self = self;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvironmentLinks {\n");
    
    sb.append("    httpColonNsAdobeComAdobecloudRelProgram: ").append(toIndentedString(httpColonNsAdobeComAdobecloudRelProgram)).append("\n");
    sb.append("    httpColonNsAdobeComAdobecloudRelPipeline: ").append(toIndentedString(httpColonNsAdobeComAdobecloudRelPipeline)).append("\n");
    sb.append("    httpColonNsAdobeComAdobecloudRelAuthor: ").append(toIndentedString(httpColonNsAdobeComAdobecloudRelAuthor)).append("\n");
    sb.append("    httpColonNsAdobeComAdobecloudRelPublish: ").append(toIndentedString(httpColonNsAdobeComAdobecloudRelPublish)).append("\n");
    sb.append("    httpColonNsAdobeComAdobecloudRelDeveloperConsole: ").append(toIndentedString(httpColonNsAdobeComAdobecloudRelDeveloperConsole)).append("\n");
    sb.append("    httpColonNsAdobeComAdobecloudRelLogs: ").append(toIndentedString(httpColonNsAdobeComAdobecloudRelLogs)).append("\n");
    sb.append("    httpColonNsAdobeComAdobecloudRelVariables: ").append(toIndentedString(httpColonNsAdobeComAdobecloudRelVariables)).append("\n");
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

