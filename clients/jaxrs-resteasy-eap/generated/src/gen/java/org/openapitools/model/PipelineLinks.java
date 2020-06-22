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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-06-22T02:54:15.715Z[GMT]")
public class PipelineLinks   {
  

  private HalLink httpColonNsAdobeComAdobecloudRelProgram;

  private HalLink httpColonNsAdobeComAdobecloudRelExecution;

  private HalLink httpColonNsAdobeComAdobecloudRelExecutions;

  private HalLink httpColonNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution;

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
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/execution")
  public HalLink getHttpColonNsAdobeComAdobecloudRelExecution() {
    return httpColonNsAdobeComAdobecloudRelExecution;
  }
  public void setHttpColonNsAdobeComAdobecloudRelExecution(HalLink httpColonNsAdobeComAdobecloudRelExecution) {
    this.httpColonNsAdobeComAdobecloudRelExecution = httpColonNsAdobeComAdobecloudRelExecution;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/executions")
  public HalLink getHttpColonNsAdobeComAdobecloudRelExecutions() {
    return httpColonNsAdobeComAdobecloudRelExecutions;
  }
  public void setHttpColonNsAdobeComAdobecloudRelExecutions(HalLink httpColonNsAdobeComAdobecloudRelExecutions) {
    this.httpColonNsAdobeComAdobecloudRelExecutions = httpColonNsAdobeComAdobecloudRelExecutions;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution")
  public HalLink getHttpColonNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution() {
    return httpColonNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution;
  }
  public void setHttpColonNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution(HalLink httpColonNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution) {
    this.httpColonNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution = httpColonNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution;
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PipelineLinks pipelineLinks = (PipelineLinks) o;
    return Objects.equals(httpColonNsAdobeComAdobecloudRelProgram, pipelineLinks.httpColonNsAdobeComAdobecloudRelProgram) &&
        Objects.equals(httpColonNsAdobeComAdobecloudRelExecution, pipelineLinks.httpColonNsAdobeComAdobecloudRelExecution) &&
        Objects.equals(httpColonNsAdobeComAdobecloudRelExecutions, pipelineLinks.httpColonNsAdobeComAdobecloudRelExecutions) &&
        Objects.equals(httpColonNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution, pipelineLinks.httpColonNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution) &&
        Objects.equals(self, pipelineLinks.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpColonNsAdobeComAdobecloudRelProgram, httpColonNsAdobeComAdobecloudRelExecution, httpColonNsAdobeComAdobecloudRelExecutions, httpColonNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineLinks {\n");
    
    sb.append("    httpColonNsAdobeComAdobecloudRelProgram: ").append(toIndentedString(httpColonNsAdobeComAdobecloudRelProgram)).append("\n");
    sb.append("    httpColonNsAdobeComAdobecloudRelExecution: ").append(toIndentedString(httpColonNsAdobeComAdobecloudRelExecution)).append("\n");
    sb.append("    httpColonNsAdobeComAdobecloudRelExecutions: ").append(toIndentedString(httpColonNsAdobeComAdobecloudRelExecutions)).append("\n");
    sb.append("    httpColonNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution: ").append(toIndentedString(httpColonNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution)).append("\n");
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

