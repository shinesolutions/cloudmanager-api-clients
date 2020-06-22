/**
 * Cloud Manager API
 * This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.HalLink;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class EnvironmentLinks {
  
  @SerializedName("http://ns.adobe.com/adobecloud/rel/program")
  private HalLink httpNsAdobeComAdobecloudRelProgram = null;
  @SerializedName("http://ns.adobe.com/adobecloud/rel/pipeline")
  private HalLink httpNsAdobeComAdobecloudRelPipeline = null;
  @SerializedName("http://ns.adobe.com/adobecloud/rel/author")
  private HalLink httpNsAdobeComAdobecloudRelAuthor = null;
  @SerializedName("http://ns.adobe.com/adobecloud/rel/publish")
  private HalLink httpNsAdobeComAdobecloudRelPublish = null;
  @SerializedName("http://ns.adobe.com/adobecloud/rel/developerConsole")
  private HalLink httpNsAdobeComAdobecloudRelDeveloperConsole = null;
  @SerializedName("http://ns.adobe.com/adobecloud/rel/logs")
  private HalLink httpNsAdobeComAdobecloudRelLogs = null;
  @SerializedName("http://ns.adobe.com/adobecloud/rel/variables")
  private HalLink httpNsAdobeComAdobecloudRelVariables = null;
  @SerializedName("self")
  private HalLink self = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public HalLink getHttpNsAdobeComAdobecloudRelProgram() {
    return httpNsAdobeComAdobecloudRelProgram;
  }
  public void setHttpNsAdobeComAdobecloudRelProgram(HalLink httpNsAdobeComAdobecloudRelProgram) {
    this.httpNsAdobeComAdobecloudRelProgram = httpNsAdobeComAdobecloudRelProgram;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public HalLink getHttpNsAdobeComAdobecloudRelPipeline() {
    return httpNsAdobeComAdobecloudRelPipeline;
  }
  public void setHttpNsAdobeComAdobecloudRelPipeline(HalLink httpNsAdobeComAdobecloudRelPipeline) {
    this.httpNsAdobeComAdobecloudRelPipeline = httpNsAdobeComAdobecloudRelPipeline;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public HalLink getHttpNsAdobeComAdobecloudRelAuthor() {
    return httpNsAdobeComAdobecloudRelAuthor;
  }
  public void setHttpNsAdobeComAdobecloudRelAuthor(HalLink httpNsAdobeComAdobecloudRelAuthor) {
    this.httpNsAdobeComAdobecloudRelAuthor = httpNsAdobeComAdobecloudRelAuthor;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public HalLink getHttpNsAdobeComAdobecloudRelPublish() {
    return httpNsAdobeComAdobecloudRelPublish;
  }
  public void setHttpNsAdobeComAdobecloudRelPublish(HalLink httpNsAdobeComAdobecloudRelPublish) {
    this.httpNsAdobeComAdobecloudRelPublish = httpNsAdobeComAdobecloudRelPublish;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public HalLink getHttpNsAdobeComAdobecloudRelDeveloperConsole() {
    return httpNsAdobeComAdobecloudRelDeveloperConsole;
  }
  public void setHttpNsAdobeComAdobecloudRelDeveloperConsole(HalLink httpNsAdobeComAdobecloudRelDeveloperConsole) {
    this.httpNsAdobeComAdobecloudRelDeveloperConsole = httpNsAdobeComAdobecloudRelDeveloperConsole;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public HalLink getHttpNsAdobeComAdobecloudRelLogs() {
    return httpNsAdobeComAdobecloudRelLogs;
  }
  public void setHttpNsAdobeComAdobecloudRelLogs(HalLink httpNsAdobeComAdobecloudRelLogs) {
    this.httpNsAdobeComAdobecloudRelLogs = httpNsAdobeComAdobecloudRelLogs;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public HalLink getHttpNsAdobeComAdobecloudRelVariables() {
    return httpNsAdobeComAdobecloudRelVariables;
  }
  public void setHttpNsAdobeComAdobecloudRelVariables(HalLink httpNsAdobeComAdobecloudRelVariables) {
    this.httpNsAdobeComAdobecloudRelVariables = httpNsAdobeComAdobecloudRelVariables;
  }

  /**
   **/
  @ApiModelProperty(value = "")
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
    EnvironmentLinks environmentLinks = (EnvironmentLinks) o;
    return (this.httpNsAdobeComAdobecloudRelProgram == null ? environmentLinks.httpNsAdobeComAdobecloudRelProgram == null : this.httpNsAdobeComAdobecloudRelProgram.equals(environmentLinks.httpNsAdobeComAdobecloudRelProgram)) &&
        (this.httpNsAdobeComAdobecloudRelPipeline == null ? environmentLinks.httpNsAdobeComAdobecloudRelPipeline == null : this.httpNsAdobeComAdobecloudRelPipeline.equals(environmentLinks.httpNsAdobeComAdobecloudRelPipeline)) &&
        (this.httpNsAdobeComAdobecloudRelAuthor == null ? environmentLinks.httpNsAdobeComAdobecloudRelAuthor == null : this.httpNsAdobeComAdobecloudRelAuthor.equals(environmentLinks.httpNsAdobeComAdobecloudRelAuthor)) &&
        (this.httpNsAdobeComAdobecloudRelPublish == null ? environmentLinks.httpNsAdobeComAdobecloudRelPublish == null : this.httpNsAdobeComAdobecloudRelPublish.equals(environmentLinks.httpNsAdobeComAdobecloudRelPublish)) &&
        (this.httpNsAdobeComAdobecloudRelDeveloperConsole == null ? environmentLinks.httpNsAdobeComAdobecloudRelDeveloperConsole == null : this.httpNsAdobeComAdobecloudRelDeveloperConsole.equals(environmentLinks.httpNsAdobeComAdobecloudRelDeveloperConsole)) &&
        (this.httpNsAdobeComAdobecloudRelLogs == null ? environmentLinks.httpNsAdobeComAdobecloudRelLogs == null : this.httpNsAdobeComAdobecloudRelLogs.equals(environmentLinks.httpNsAdobeComAdobecloudRelLogs)) &&
        (this.httpNsAdobeComAdobecloudRelVariables == null ? environmentLinks.httpNsAdobeComAdobecloudRelVariables == null : this.httpNsAdobeComAdobecloudRelVariables.equals(environmentLinks.httpNsAdobeComAdobecloudRelVariables)) &&
        (this.self == null ? environmentLinks.self == null : this.self.equals(environmentLinks.self));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.httpNsAdobeComAdobecloudRelProgram == null ? 0: this.httpNsAdobeComAdobecloudRelProgram.hashCode());
    result = 31 * result + (this.httpNsAdobeComAdobecloudRelPipeline == null ? 0: this.httpNsAdobeComAdobecloudRelPipeline.hashCode());
    result = 31 * result + (this.httpNsAdobeComAdobecloudRelAuthor == null ? 0: this.httpNsAdobeComAdobecloudRelAuthor.hashCode());
    result = 31 * result + (this.httpNsAdobeComAdobecloudRelPublish == null ? 0: this.httpNsAdobeComAdobecloudRelPublish.hashCode());
    result = 31 * result + (this.httpNsAdobeComAdobecloudRelDeveloperConsole == null ? 0: this.httpNsAdobeComAdobecloudRelDeveloperConsole.hashCode());
    result = 31 * result + (this.httpNsAdobeComAdobecloudRelLogs == null ? 0: this.httpNsAdobeComAdobecloudRelLogs.hashCode());
    result = 31 * result + (this.httpNsAdobeComAdobecloudRelVariables == null ? 0: this.httpNsAdobeComAdobecloudRelVariables.hashCode());
    result = 31 * result + (this.self == null ? 0: this.self.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvironmentLinks {\n");
    
    sb.append("  httpNsAdobeComAdobecloudRelProgram: ").append(httpNsAdobeComAdobecloudRelProgram).append("\n");
    sb.append("  httpNsAdobeComAdobecloudRelPipeline: ").append(httpNsAdobeComAdobecloudRelPipeline).append("\n");
    sb.append("  httpNsAdobeComAdobecloudRelAuthor: ").append(httpNsAdobeComAdobecloudRelAuthor).append("\n");
    sb.append("  httpNsAdobeComAdobecloudRelPublish: ").append(httpNsAdobeComAdobecloudRelPublish).append("\n");
    sb.append("  httpNsAdobeComAdobecloudRelDeveloperConsole: ").append(httpNsAdobeComAdobecloudRelDeveloperConsole).append("\n");
    sb.append("  httpNsAdobeComAdobecloudRelLogs: ").append(httpNsAdobeComAdobecloudRelLogs).append("\n");
    sb.append("  httpNsAdobeComAdobecloudRelVariables: ").append(httpNsAdobeComAdobecloudRelVariables).append("\n");
    sb.append("  self: ").append(self).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
