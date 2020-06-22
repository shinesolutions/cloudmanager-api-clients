package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.HalLink;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2020-06-22T02:53:40.074Z[GMT]")
public class EnvironmentLinks   {
  
  private HalLink httpColonNsAdobeComAdobecloudRelProgram;
  private HalLink httpColonNsAdobeComAdobecloudRelPipeline;
  private HalLink httpColonNsAdobeComAdobecloudRelAuthor;
  private HalLink httpColonNsAdobeComAdobecloudRelPublish;
  private HalLink httpColonNsAdobeComAdobecloudRelDeveloperConsole;
  private HalLink httpColonNsAdobeComAdobecloudRelLogs;
  private HalLink httpColonNsAdobeComAdobecloudRelVariables;
  private HalLink self;

  /**
   **/
  public EnvironmentLinks httpColonNsAdobeComAdobecloudRelProgram(HalLink httpColonNsAdobeComAdobecloudRelProgram) {
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
  public EnvironmentLinks httpColonNsAdobeComAdobecloudRelPipeline(HalLink httpColonNsAdobeComAdobecloudRelPipeline) {
    this.httpColonNsAdobeComAdobecloudRelPipeline = httpColonNsAdobeComAdobecloudRelPipeline;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/pipeline")
  public HalLink getHttpColonNsAdobeComAdobecloudRelPipeline() {
    return httpColonNsAdobeComAdobecloudRelPipeline;
  }
  public void setHttpColonNsAdobeComAdobecloudRelPipeline(HalLink httpColonNsAdobeComAdobecloudRelPipeline) {
    this.httpColonNsAdobeComAdobecloudRelPipeline = httpColonNsAdobeComAdobecloudRelPipeline;
  }

  /**
   **/
  public EnvironmentLinks httpColonNsAdobeComAdobecloudRelAuthor(HalLink httpColonNsAdobeComAdobecloudRelAuthor) {
    this.httpColonNsAdobeComAdobecloudRelAuthor = httpColonNsAdobeComAdobecloudRelAuthor;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/author")
  public HalLink getHttpColonNsAdobeComAdobecloudRelAuthor() {
    return httpColonNsAdobeComAdobecloudRelAuthor;
  }
  public void setHttpColonNsAdobeComAdobecloudRelAuthor(HalLink httpColonNsAdobeComAdobecloudRelAuthor) {
    this.httpColonNsAdobeComAdobecloudRelAuthor = httpColonNsAdobeComAdobecloudRelAuthor;
  }

  /**
   **/
  public EnvironmentLinks httpColonNsAdobeComAdobecloudRelPublish(HalLink httpColonNsAdobeComAdobecloudRelPublish) {
    this.httpColonNsAdobeComAdobecloudRelPublish = httpColonNsAdobeComAdobecloudRelPublish;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/publish")
  public HalLink getHttpColonNsAdobeComAdobecloudRelPublish() {
    return httpColonNsAdobeComAdobecloudRelPublish;
  }
  public void setHttpColonNsAdobeComAdobecloudRelPublish(HalLink httpColonNsAdobeComAdobecloudRelPublish) {
    this.httpColonNsAdobeComAdobecloudRelPublish = httpColonNsAdobeComAdobecloudRelPublish;
  }

  /**
   **/
  public EnvironmentLinks httpColonNsAdobeComAdobecloudRelDeveloperConsole(HalLink httpColonNsAdobeComAdobecloudRelDeveloperConsole) {
    this.httpColonNsAdobeComAdobecloudRelDeveloperConsole = httpColonNsAdobeComAdobecloudRelDeveloperConsole;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/developerConsole")
  public HalLink getHttpColonNsAdobeComAdobecloudRelDeveloperConsole() {
    return httpColonNsAdobeComAdobecloudRelDeveloperConsole;
  }
  public void setHttpColonNsAdobeComAdobecloudRelDeveloperConsole(HalLink httpColonNsAdobeComAdobecloudRelDeveloperConsole) {
    this.httpColonNsAdobeComAdobecloudRelDeveloperConsole = httpColonNsAdobeComAdobecloudRelDeveloperConsole;
  }

  /**
   **/
  public EnvironmentLinks httpColonNsAdobeComAdobecloudRelLogs(HalLink httpColonNsAdobeComAdobecloudRelLogs) {
    this.httpColonNsAdobeComAdobecloudRelLogs = httpColonNsAdobeComAdobecloudRelLogs;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/logs")
  public HalLink getHttpColonNsAdobeComAdobecloudRelLogs() {
    return httpColonNsAdobeComAdobecloudRelLogs;
  }
  public void setHttpColonNsAdobeComAdobecloudRelLogs(HalLink httpColonNsAdobeComAdobecloudRelLogs) {
    this.httpColonNsAdobeComAdobecloudRelLogs = httpColonNsAdobeComAdobecloudRelLogs;
  }

  /**
   **/
  public EnvironmentLinks httpColonNsAdobeComAdobecloudRelVariables(HalLink httpColonNsAdobeComAdobecloudRelVariables) {
    this.httpColonNsAdobeComAdobecloudRelVariables = httpColonNsAdobeComAdobecloudRelVariables;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/variables")
  public HalLink getHttpColonNsAdobeComAdobecloudRelVariables() {
    return httpColonNsAdobeComAdobecloudRelVariables;
  }
  public void setHttpColonNsAdobeComAdobecloudRelVariables(HalLink httpColonNsAdobeComAdobecloudRelVariables) {
    this.httpColonNsAdobeComAdobecloudRelVariables = httpColonNsAdobeComAdobecloudRelVariables;
  }

  /**
   **/
  public EnvironmentLinks self(HalLink self) {
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
    EnvironmentLinks environmentLinks = (EnvironmentLinks) o;
    return Objects.equals(httpColonNsAdobeComAdobecloudRelProgram, environmentLinks.httpColonNsAdobeComAdobecloudRelProgram) &&
        Objects.equals(httpColonNsAdobeComAdobecloudRelPipeline, environmentLinks.httpColonNsAdobeComAdobecloudRelPipeline) &&
        Objects.equals(httpColonNsAdobeComAdobecloudRelAuthor, environmentLinks.httpColonNsAdobeComAdobecloudRelAuthor) &&
        Objects.equals(httpColonNsAdobeComAdobecloudRelPublish, environmentLinks.httpColonNsAdobeComAdobecloudRelPublish) &&
        Objects.equals(httpColonNsAdobeComAdobecloudRelDeveloperConsole, environmentLinks.httpColonNsAdobeComAdobecloudRelDeveloperConsole) &&
        Objects.equals(httpColonNsAdobeComAdobecloudRelLogs, environmentLinks.httpColonNsAdobeComAdobecloudRelLogs) &&
        Objects.equals(httpColonNsAdobeComAdobecloudRelVariables, environmentLinks.httpColonNsAdobeComAdobecloudRelVariables) &&
        Objects.equals(self, environmentLinks.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpColonNsAdobeComAdobecloudRelProgram, httpColonNsAdobeComAdobecloudRelPipeline, httpColonNsAdobeComAdobecloudRelAuthor, httpColonNsAdobeComAdobecloudRelPublish, httpColonNsAdobeComAdobecloudRelDeveloperConsole, httpColonNsAdobeComAdobecloudRelLogs, httpColonNsAdobeComAdobecloudRelVariables, self);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

