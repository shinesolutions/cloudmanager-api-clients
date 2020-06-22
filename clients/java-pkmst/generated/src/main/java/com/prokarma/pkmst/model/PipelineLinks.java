package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.HalLink;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * PipelineLinks
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2020-06-22T02:53:26.039Z[GMT]")

public class PipelineLinks   {
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/program")
  private HalLink httpColonNsAdobeComAdobecloudRelProgram;

  @JsonProperty("http://ns.adobe.com/adobecloud/rel/execution")
  private HalLink httpColonNsAdobeComAdobecloudRelExecution;

  @JsonProperty("http://ns.adobe.com/adobecloud/rel/executions")
  private HalLink httpColonNsAdobeComAdobecloudRelExecutions;

  @JsonProperty("http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution")
  private HalLink httpColonNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution;

  @JsonProperty("self")
  private HalLink self;

  public PipelineLinks httpColonNsAdobeComAdobecloudRelProgram(HalLink httpColonNsAdobeComAdobecloudRelProgram) {
    this.httpColonNsAdobeComAdobecloudRelProgram = httpColonNsAdobeComAdobecloudRelProgram;
    return this;
  }

   /**
   * Get httpColonNsAdobeComAdobecloudRelProgram
   * @return httpColonNsAdobeComAdobecloudRelProgram
  **/
  @ApiModelProperty(value = "")
  public HalLink getHttpColonNsAdobeComAdobecloudRelProgram() {
    return httpColonNsAdobeComAdobecloudRelProgram;
  }

  public void setHttpColonNsAdobeComAdobecloudRelProgram(HalLink httpColonNsAdobeComAdobecloudRelProgram) {
    this.httpColonNsAdobeComAdobecloudRelProgram = httpColonNsAdobeComAdobecloudRelProgram;
  }

  public PipelineLinks httpColonNsAdobeComAdobecloudRelExecution(HalLink httpColonNsAdobeComAdobecloudRelExecution) {
    this.httpColonNsAdobeComAdobecloudRelExecution = httpColonNsAdobeComAdobecloudRelExecution;
    return this;
  }

   /**
   * Get httpColonNsAdobeComAdobecloudRelExecution
   * @return httpColonNsAdobeComAdobecloudRelExecution
  **/
  @ApiModelProperty(value = "")
  public HalLink getHttpColonNsAdobeComAdobecloudRelExecution() {
    return httpColonNsAdobeComAdobecloudRelExecution;
  }

  public void setHttpColonNsAdobeComAdobecloudRelExecution(HalLink httpColonNsAdobeComAdobecloudRelExecution) {
    this.httpColonNsAdobeComAdobecloudRelExecution = httpColonNsAdobeComAdobecloudRelExecution;
  }

  public PipelineLinks httpColonNsAdobeComAdobecloudRelExecutions(HalLink httpColonNsAdobeComAdobecloudRelExecutions) {
    this.httpColonNsAdobeComAdobecloudRelExecutions = httpColonNsAdobeComAdobecloudRelExecutions;
    return this;
  }

   /**
   * Get httpColonNsAdobeComAdobecloudRelExecutions
   * @return httpColonNsAdobeComAdobecloudRelExecutions
  **/
  @ApiModelProperty(value = "")
  public HalLink getHttpColonNsAdobeComAdobecloudRelExecutions() {
    return httpColonNsAdobeComAdobecloudRelExecutions;
  }

  public void setHttpColonNsAdobeComAdobecloudRelExecutions(HalLink httpColonNsAdobeComAdobecloudRelExecutions) {
    this.httpColonNsAdobeComAdobecloudRelExecutions = httpColonNsAdobeComAdobecloudRelExecutions;
  }

  public PipelineLinks httpColonNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution(HalLink httpColonNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution) {
    this.httpColonNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution = httpColonNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution;
    return this;
  }

   /**
   * Get httpColonNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution
   * @return httpColonNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution
  **/
  @ApiModelProperty(value = "")
  public HalLink getHttpColonNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution() {
    return httpColonNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution;
  }

  public void setHttpColonNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution(HalLink httpColonNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution) {
    this.httpColonNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution = httpColonNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution;
  }

  public PipelineLinks self(HalLink self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(value = "")
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
    PipelineLinks pipelineLinks = (PipelineLinks) o;
    return Objects.equals(this.httpColonNsAdobeComAdobecloudRelProgram, pipelineLinks.httpColonNsAdobeComAdobecloudRelProgram) &&
        Objects.equals(this.httpColonNsAdobeComAdobecloudRelExecution, pipelineLinks.httpColonNsAdobeComAdobecloudRelExecution) &&
        Objects.equals(this.httpColonNsAdobeComAdobecloudRelExecutions, pipelineLinks.httpColonNsAdobeComAdobecloudRelExecutions) &&
        Objects.equals(this.httpColonNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution, pipelineLinks.httpColonNsAdobeComAdobecloudRelRollbackLastSuccessfulExecution) &&
        Objects.equals(this.self, pipelineLinks.self);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

