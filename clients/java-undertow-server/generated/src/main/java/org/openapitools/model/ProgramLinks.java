package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.HalLink;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2020-06-22T02:53:40.074Z[GMT]")
public class ProgramLinks   {
  
  private HalLink httpColonNsAdobeComAdobecloudRelPipelines;
  private HalLink httpColonNsAdobeComAdobecloudRelEnvironments;
  private HalLink httpColonNsAdobeComAdobecloudRelRepositories;
  private HalLink self;

  /**
   **/
  public ProgramLinks httpColonNsAdobeComAdobecloudRelPipelines(HalLink httpColonNsAdobeComAdobecloudRelPipelines) {
    this.httpColonNsAdobeComAdobecloudRelPipelines = httpColonNsAdobeComAdobecloudRelPipelines;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/pipelines")
  public HalLink getHttpColonNsAdobeComAdobecloudRelPipelines() {
    return httpColonNsAdobeComAdobecloudRelPipelines;
  }
  public void setHttpColonNsAdobeComAdobecloudRelPipelines(HalLink httpColonNsAdobeComAdobecloudRelPipelines) {
    this.httpColonNsAdobeComAdobecloudRelPipelines = httpColonNsAdobeComAdobecloudRelPipelines;
  }

  /**
   **/
  public ProgramLinks httpColonNsAdobeComAdobecloudRelEnvironments(HalLink httpColonNsAdobeComAdobecloudRelEnvironments) {
    this.httpColonNsAdobeComAdobecloudRelEnvironments = httpColonNsAdobeComAdobecloudRelEnvironments;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/environments")
  public HalLink getHttpColonNsAdobeComAdobecloudRelEnvironments() {
    return httpColonNsAdobeComAdobecloudRelEnvironments;
  }
  public void setHttpColonNsAdobeComAdobecloudRelEnvironments(HalLink httpColonNsAdobeComAdobecloudRelEnvironments) {
    this.httpColonNsAdobeComAdobecloudRelEnvironments = httpColonNsAdobeComAdobecloudRelEnvironments;
  }

  /**
   **/
  public ProgramLinks httpColonNsAdobeComAdobecloudRelRepositories(HalLink httpColonNsAdobeComAdobecloudRelRepositories) {
    this.httpColonNsAdobeComAdobecloudRelRepositories = httpColonNsAdobeComAdobecloudRelRepositories;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/repositories")
  public HalLink getHttpColonNsAdobeComAdobecloudRelRepositories() {
    return httpColonNsAdobeComAdobecloudRelRepositories;
  }
  public void setHttpColonNsAdobeComAdobecloudRelRepositories(HalLink httpColonNsAdobeComAdobecloudRelRepositories) {
    this.httpColonNsAdobeComAdobecloudRelRepositories = httpColonNsAdobeComAdobecloudRelRepositories;
  }

  /**
   **/
  public ProgramLinks self(HalLink self) {
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
    ProgramLinks programLinks = (ProgramLinks) o;
    return Objects.equals(httpColonNsAdobeComAdobecloudRelPipelines, programLinks.httpColonNsAdobeComAdobecloudRelPipelines) &&
        Objects.equals(httpColonNsAdobeComAdobecloudRelEnvironments, programLinks.httpColonNsAdobeComAdobecloudRelEnvironments) &&
        Objects.equals(httpColonNsAdobeComAdobecloudRelRepositories, programLinks.httpColonNsAdobeComAdobecloudRelRepositories) &&
        Objects.equals(self, programLinks.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpColonNsAdobeComAdobecloudRelPipelines, httpColonNsAdobeComAdobecloudRelEnvironments, httpColonNsAdobeComAdobecloudRelRepositories, self);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

