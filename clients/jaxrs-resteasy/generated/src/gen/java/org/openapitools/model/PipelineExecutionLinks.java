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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2020-06-22T02:54:09.173Z[GMT]")
public class PipelineExecutionLinks   {
  
  private HalLink httpColonNsAdobeComAdobecloudRelProgram;
  private HalLink httpColonNsAdobeComAdobecloudRelPipeline;
  private HalLink self;

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
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/pipeline")
  public HalLink getHttpColonNsAdobeComAdobecloudRelPipeline() {
    return httpColonNsAdobeComAdobecloudRelPipeline;
  }
  public void setHttpColonNsAdobeComAdobecloudRelPipeline(HalLink httpColonNsAdobeComAdobecloudRelPipeline) {
    this.httpColonNsAdobeComAdobecloudRelPipeline = httpColonNsAdobeComAdobecloudRelPipeline;
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
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PipelineExecutionLinks pipelineExecutionLinks = (PipelineExecutionLinks) o;
    return Objects.equals(httpColonNsAdobeComAdobecloudRelProgram, pipelineExecutionLinks.httpColonNsAdobeComAdobecloudRelProgram) &&
        Objects.equals(httpColonNsAdobeComAdobecloudRelPipeline, pipelineExecutionLinks.httpColonNsAdobeComAdobecloudRelPipeline) &&
        Objects.equals(self, pipelineExecutionLinks.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpColonNsAdobeComAdobecloudRelProgram, httpColonNsAdobeComAdobecloudRelPipeline, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineExecutionLinks {\n");
    
    sb.append("    httpColonNsAdobeComAdobecloudRelProgram: ").append(toIndentedString(httpColonNsAdobeComAdobecloudRelProgram)).append("\n");
    sb.append("    httpColonNsAdobeComAdobecloudRelPipeline: ").append(toIndentedString(httpColonNsAdobeComAdobecloudRelPipeline)).append("\n");
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

