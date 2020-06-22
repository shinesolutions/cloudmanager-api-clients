package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.HalLink;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-06-22T02:53:13.843Z[GMT]")
public class PipelineExecutionStepStateLinks   {
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/execution")
  private HalLink httpColonNsAdobeComAdobecloudRelExecution;

  @JsonProperty("http://ns.adobe.com/adobecloud/rel/pipeline")
  private HalLink httpColonNsAdobeComAdobecloudRelPipeline;

  @JsonProperty("http://ns.adobe.com/adobecloud/rel/pipeline/logs")
  private HalLink httpColonNsAdobeComAdobecloudRelPipelineLogs;

  @JsonProperty("http://ns.adobe.com/adobecloud/rel/pipeline/metrics")
  private HalLink httpColonNsAdobeComAdobecloudRelPipelineMetrics;

  @JsonProperty("http://ns.adobe.com/adobecloud/rel/pipeline/advance")
  private HalLink httpColonNsAdobeComAdobecloudRelPipelineAdvance;

  @JsonProperty("http://ns.adobe.com/adobecloud/rel/pipeline/cancel")
  private HalLink httpColonNsAdobeComAdobecloudRelPipelineCancel;

  @JsonProperty("http://ns.adobe.com/adobecloud/rel/program")
  private HalLink httpColonNsAdobeComAdobecloudRelProgram;

  @JsonProperty("self")
  private HalLink self;

  /**
   **/
  public PipelineExecutionStepStateLinks httpColonNsAdobeComAdobecloudRelExecution(HalLink httpColonNsAdobeComAdobecloudRelExecution) {
    this.httpColonNsAdobeComAdobecloudRelExecution = httpColonNsAdobeComAdobecloudRelExecution;
    return this;
  }

  
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
  public PipelineExecutionStepStateLinks httpColonNsAdobeComAdobecloudRelPipeline(HalLink httpColonNsAdobeComAdobecloudRelPipeline) {
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
  public PipelineExecutionStepStateLinks httpColonNsAdobeComAdobecloudRelPipelineLogs(HalLink httpColonNsAdobeComAdobecloudRelPipelineLogs) {
    this.httpColonNsAdobeComAdobecloudRelPipelineLogs = httpColonNsAdobeComAdobecloudRelPipelineLogs;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/pipeline/logs")
  public HalLink getHttpColonNsAdobeComAdobecloudRelPipelineLogs() {
    return httpColonNsAdobeComAdobecloudRelPipelineLogs;
  }
  public void setHttpColonNsAdobeComAdobecloudRelPipelineLogs(HalLink httpColonNsAdobeComAdobecloudRelPipelineLogs) {
    this.httpColonNsAdobeComAdobecloudRelPipelineLogs = httpColonNsAdobeComAdobecloudRelPipelineLogs;
  }

  /**
   **/
  public PipelineExecutionStepStateLinks httpColonNsAdobeComAdobecloudRelPipelineMetrics(HalLink httpColonNsAdobeComAdobecloudRelPipelineMetrics) {
    this.httpColonNsAdobeComAdobecloudRelPipelineMetrics = httpColonNsAdobeComAdobecloudRelPipelineMetrics;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/pipeline/metrics")
  public HalLink getHttpColonNsAdobeComAdobecloudRelPipelineMetrics() {
    return httpColonNsAdobeComAdobecloudRelPipelineMetrics;
  }
  public void setHttpColonNsAdobeComAdobecloudRelPipelineMetrics(HalLink httpColonNsAdobeComAdobecloudRelPipelineMetrics) {
    this.httpColonNsAdobeComAdobecloudRelPipelineMetrics = httpColonNsAdobeComAdobecloudRelPipelineMetrics;
  }

  /**
   **/
  public PipelineExecutionStepStateLinks httpColonNsAdobeComAdobecloudRelPipelineAdvance(HalLink httpColonNsAdobeComAdobecloudRelPipelineAdvance) {
    this.httpColonNsAdobeComAdobecloudRelPipelineAdvance = httpColonNsAdobeComAdobecloudRelPipelineAdvance;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/pipeline/advance")
  public HalLink getHttpColonNsAdobeComAdobecloudRelPipelineAdvance() {
    return httpColonNsAdobeComAdobecloudRelPipelineAdvance;
  }
  public void setHttpColonNsAdobeComAdobecloudRelPipelineAdvance(HalLink httpColonNsAdobeComAdobecloudRelPipelineAdvance) {
    this.httpColonNsAdobeComAdobecloudRelPipelineAdvance = httpColonNsAdobeComAdobecloudRelPipelineAdvance;
  }

  /**
   **/
  public PipelineExecutionStepStateLinks httpColonNsAdobeComAdobecloudRelPipelineCancel(HalLink httpColonNsAdobeComAdobecloudRelPipelineCancel) {
    this.httpColonNsAdobeComAdobecloudRelPipelineCancel = httpColonNsAdobeComAdobecloudRelPipelineCancel;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/pipeline/cancel")
  public HalLink getHttpColonNsAdobeComAdobecloudRelPipelineCancel() {
    return httpColonNsAdobeComAdobecloudRelPipelineCancel;
  }
  public void setHttpColonNsAdobeComAdobecloudRelPipelineCancel(HalLink httpColonNsAdobeComAdobecloudRelPipelineCancel) {
    this.httpColonNsAdobeComAdobecloudRelPipelineCancel = httpColonNsAdobeComAdobecloudRelPipelineCancel;
  }

  /**
   **/
  public PipelineExecutionStepStateLinks httpColonNsAdobeComAdobecloudRelProgram(HalLink httpColonNsAdobeComAdobecloudRelProgram) {
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
  public PipelineExecutionStepStateLinks self(HalLink self) {
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
    PipelineExecutionStepStateLinks pipelineExecutionStepStateLinks = (PipelineExecutionStepStateLinks) o;
    return Objects.equals(httpColonNsAdobeComAdobecloudRelExecution, pipelineExecutionStepStateLinks.httpColonNsAdobeComAdobecloudRelExecution) &&
        Objects.equals(httpColonNsAdobeComAdobecloudRelPipeline, pipelineExecutionStepStateLinks.httpColonNsAdobeComAdobecloudRelPipeline) &&
        Objects.equals(httpColonNsAdobeComAdobecloudRelPipelineLogs, pipelineExecutionStepStateLinks.httpColonNsAdobeComAdobecloudRelPipelineLogs) &&
        Objects.equals(httpColonNsAdobeComAdobecloudRelPipelineMetrics, pipelineExecutionStepStateLinks.httpColonNsAdobeComAdobecloudRelPipelineMetrics) &&
        Objects.equals(httpColonNsAdobeComAdobecloudRelPipelineAdvance, pipelineExecutionStepStateLinks.httpColonNsAdobeComAdobecloudRelPipelineAdvance) &&
        Objects.equals(httpColonNsAdobeComAdobecloudRelPipelineCancel, pipelineExecutionStepStateLinks.httpColonNsAdobeComAdobecloudRelPipelineCancel) &&
        Objects.equals(httpColonNsAdobeComAdobecloudRelProgram, pipelineExecutionStepStateLinks.httpColonNsAdobeComAdobecloudRelProgram) &&
        Objects.equals(self, pipelineExecutionStepStateLinks.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpColonNsAdobeComAdobecloudRelExecution, httpColonNsAdobeComAdobecloudRelPipeline, httpColonNsAdobeComAdobecloudRelPipelineLogs, httpColonNsAdobeComAdobecloudRelPipelineMetrics, httpColonNsAdobeComAdobecloudRelPipelineAdvance, httpColonNsAdobeComAdobecloudRelPipelineCancel, httpColonNsAdobeComAdobecloudRelProgram, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineExecutionStepStateLinks {\n");
    
    sb.append("    httpColonNsAdobeComAdobecloudRelExecution: ").append(toIndentedString(httpColonNsAdobeComAdobecloudRelExecution)).append("\n");
    sb.append("    httpColonNsAdobeComAdobecloudRelPipeline: ").append(toIndentedString(httpColonNsAdobeComAdobecloudRelPipeline)).append("\n");
    sb.append("    httpColonNsAdobeComAdobecloudRelPipelineLogs: ").append(toIndentedString(httpColonNsAdobeComAdobecloudRelPipelineLogs)).append("\n");
    sb.append("    httpColonNsAdobeComAdobecloudRelPipelineMetrics: ").append(toIndentedString(httpColonNsAdobeComAdobecloudRelPipelineMetrics)).append("\n");
    sb.append("    httpColonNsAdobeComAdobecloudRelPipelineAdvance: ").append(toIndentedString(httpColonNsAdobeComAdobecloudRelPipelineAdvance)).append("\n");
    sb.append("    httpColonNsAdobeComAdobecloudRelPipelineCancel: ").append(toIndentedString(httpColonNsAdobeComAdobecloudRelPipelineCancel)).append("\n");
    sb.append("    httpColonNsAdobeComAdobecloudRelProgram: ").append(toIndentedString(httpColonNsAdobeComAdobecloudRelProgram)).append("\n");
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

