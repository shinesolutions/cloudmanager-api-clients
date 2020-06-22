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

public class PipelineExecutionStepStateLinks  {
  
  @ApiModelProperty(value = "")
  private HalLink httpColonNsAdobeComAdobecloudRelExecution;

  @ApiModelProperty(value = "")
  private HalLink httpColonNsAdobeComAdobecloudRelPipeline;

  @ApiModelProperty(value = "")
  private HalLink httpColonNsAdobeComAdobecloudRelPipelineLogs;

  @ApiModelProperty(value = "")
  private HalLink httpColonNsAdobeComAdobecloudRelPipelineMetrics;

  @ApiModelProperty(value = "")
  private HalLink httpColonNsAdobeComAdobecloudRelPipelineAdvance;

  @ApiModelProperty(value = "")
  private HalLink httpColonNsAdobeComAdobecloudRelPipelineCancel;

  @ApiModelProperty(value = "")
  private HalLink httpColonNsAdobeComAdobecloudRelProgram;

  @ApiModelProperty(value = "")
  private HalLink self;
 /**
   * Get httpColonNsAdobeComAdobecloudRelExecution
   * @return httpColonNsAdobeComAdobecloudRelExecution
  **/
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/execution")
  public HalLink getHttpColonNsAdobeComAdobecloudRelExecution() {
    return httpColonNsAdobeComAdobecloudRelExecution;
  }

  public void setHttpColonNsAdobeComAdobecloudRelExecution(HalLink httpColonNsAdobeComAdobecloudRelExecution) {
    this.httpColonNsAdobeComAdobecloudRelExecution = httpColonNsAdobeComAdobecloudRelExecution;
  }

  public PipelineExecutionStepStateLinks httpColonNsAdobeComAdobecloudRelExecution(HalLink httpColonNsAdobeComAdobecloudRelExecution) {
    this.httpColonNsAdobeComAdobecloudRelExecution = httpColonNsAdobeComAdobecloudRelExecution;
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

  public PipelineExecutionStepStateLinks httpColonNsAdobeComAdobecloudRelPipeline(HalLink httpColonNsAdobeComAdobecloudRelPipeline) {
    this.httpColonNsAdobeComAdobecloudRelPipeline = httpColonNsAdobeComAdobecloudRelPipeline;
    return this;
  }

 /**
   * Get httpColonNsAdobeComAdobecloudRelPipelineLogs
   * @return httpColonNsAdobeComAdobecloudRelPipelineLogs
  **/
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/pipeline/logs")
  public HalLink getHttpColonNsAdobeComAdobecloudRelPipelineLogs() {
    return httpColonNsAdobeComAdobecloudRelPipelineLogs;
  }

  public void setHttpColonNsAdobeComAdobecloudRelPipelineLogs(HalLink httpColonNsAdobeComAdobecloudRelPipelineLogs) {
    this.httpColonNsAdobeComAdobecloudRelPipelineLogs = httpColonNsAdobeComAdobecloudRelPipelineLogs;
  }

  public PipelineExecutionStepStateLinks httpColonNsAdobeComAdobecloudRelPipelineLogs(HalLink httpColonNsAdobeComAdobecloudRelPipelineLogs) {
    this.httpColonNsAdobeComAdobecloudRelPipelineLogs = httpColonNsAdobeComAdobecloudRelPipelineLogs;
    return this;
  }

 /**
   * Get httpColonNsAdobeComAdobecloudRelPipelineMetrics
   * @return httpColonNsAdobeComAdobecloudRelPipelineMetrics
  **/
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/pipeline/metrics")
  public HalLink getHttpColonNsAdobeComAdobecloudRelPipelineMetrics() {
    return httpColonNsAdobeComAdobecloudRelPipelineMetrics;
  }

  public void setHttpColonNsAdobeComAdobecloudRelPipelineMetrics(HalLink httpColonNsAdobeComAdobecloudRelPipelineMetrics) {
    this.httpColonNsAdobeComAdobecloudRelPipelineMetrics = httpColonNsAdobeComAdobecloudRelPipelineMetrics;
  }

  public PipelineExecutionStepStateLinks httpColonNsAdobeComAdobecloudRelPipelineMetrics(HalLink httpColonNsAdobeComAdobecloudRelPipelineMetrics) {
    this.httpColonNsAdobeComAdobecloudRelPipelineMetrics = httpColonNsAdobeComAdobecloudRelPipelineMetrics;
    return this;
  }

 /**
   * Get httpColonNsAdobeComAdobecloudRelPipelineAdvance
   * @return httpColonNsAdobeComAdobecloudRelPipelineAdvance
  **/
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/pipeline/advance")
  public HalLink getHttpColonNsAdobeComAdobecloudRelPipelineAdvance() {
    return httpColonNsAdobeComAdobecloudRelPipelineAdvance;
  }

  public void setHttpColonNsAdobeComAdobecloudRelPipelineAdvance(HalLink httpColonNsAdobeComAdobecloudRelPipelineAdvance) {
    this.httpColonNsAdobeComAdobecloudRelPipelineAdvance = httpColonNsAdobeComAdobecloudRelPipelineAdvance;
  }

  public PipelineExecutionStepStateLinks httpColonNsAdobeComAdobecloudRelPipelineAdvance(HalLink httpColonNsAdobeComAdobecloudRelPipelineAdvance) {
    this.httpColonNsAdobeComAdobecloudRelPipelineAdvance = httpColonNsAdobeComAdobecloudRelPipelineAdvance;
    return this;
  }

 /**
   * Get httpColonNsAdobeComAdobecloudRelPipelineCancel
   * @return httpColonNsAdobeComAdobecloudRelPipelineCancel
  **/
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/pipeline/cancel")
  public HalLink getHttpColonNsAdobeComAdobecloudRelPipelineCancel() {
    return httpColonNsAdobeComAdobecloudRelPipelineCancel;
  }

  public void setHttpColonNsAdobeComAdobecloudRelPipelineCancel(HalLink httpColonNsAdobeComAdobecloudRelPipelineCancel) {
    this.httpColonNsAdobeComAdobecloudRelPipelineCancel = httpColonNsAdobeComAdobecloudRelPipelineCancel;
  }

  public PipelineExecutionStepStateLinks httpColonNsAdobeComAdobecloudRelPipelineCancel(HalLink httpColonNsAdobeComAdobecloudRelPipelineCancel) {
    this.httpColonNsAdobeComAdobecloudRelPipelineCancel = httpColonNsAdobeComAdobecloudRelPipelineCancel;
    return this;
  }

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

  public PipelineExecutionStepStateLinks httpColonNsAdobeComAdobecloudRelProgram(HalLink httpColonNsAdobeComAdobecloudRelProgram) {
    this.httpColonNsAdobeComAdobecloudRelProgram = httpColonNsAdobeComAdobecloudRelProgram;
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

  public PipelineExecutionStepStateLinks self(HalLink self) {
    this.self = self;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

