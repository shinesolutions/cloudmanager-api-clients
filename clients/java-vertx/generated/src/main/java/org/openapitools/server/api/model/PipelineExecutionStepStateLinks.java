package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.HalLink;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PipelineExecutionStepStateLinks   {
  
  private HalLink httpColonNsAdobeComAdobecloudRelExecution;
  private HalLink httpColonNsAdobeComAdobecloudRelPipeline;
  private HalLink httpColonNsAdobeComAdobecloudRelPipelineLogs;
  private HalLink httpColonNsAdobeComAdobecloudRelPipelineMetrics;
  private HalLink httpColonNsAdobeComAdobecloudRelPipelineAdvance;
  private HalLink httpColonNsAdobeComAdobecloudRelPipelineCancel;
  private HalLink httpColonNsAdobeComAdobecloudRelProgram;
  private HalLink self;

  public PipelineExecutionStepStateLinks () {

  }

  public PipelineExecutionStepStateLinks (HalLink httpColonNsAdobeComAdobecloudRelExecution, HalLink httpColonNsAdobeComAdobecloudRelPipeline, HalLink httpColonNsAdobeComAdobecloudRelPipelineLogs, HalLink httpColonNsAdobeComAdobecloudRelPipelineMetrics, HalLink httpColonNsAdobeComAdobecloudRelPipelineAdvance, HalLink httpColonNsAdobeComAdobecloudRelPipelineCancel, HalLink httpColonNsAdobeComAdobecloudRelProgram, HalLink self) {
    this.httpColonNsAdobeComAdobecloudRelExecution = httpColonNsAdobeComAdobecloudRelExecution;
    this.httpColonNsAdobeComAdobecloudRelPipeline = httpColonNsAdobeComAdobecloudRelPipeline;
    this.httpColonNsAdobeComAdobecloudRelPipelineLogs = httpColonNsAdobeComAdobecloudRelPipelineLogs;
    this.httpColonNsAdobeComAdobecloudRelPipelineMetrics = httpColonNsAdobeComAdobecloudRelPipelineMetrics;
    this.httpColonNsAdobeComAdobecloudRelPipelineAdvance = httpColonNsAdobeComAdobecloudRelPipelineAdvance;
    this.httpColonNsAdobeComAdobecloudRelPipelineCancel = httpColonNsAdobeComAdobecloudRelPipelineCancel;
    this.httpColonNsAdobeComAdobecloudRelProgram = httpColonNsAdobeComAdobecloudRelProgram;
    this.self = self;
  }

    
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/execution")
  public HalLink getHttpColonNsAdobeComAdobecloudRelExecution() {
    return httpColonNsAdobeComAdobecloudRelExecution;
  }
  public void setHttpColonNsAdobeComAdobecloudRelExecution(HalLink httpColonNsAdobeComAdobecloudRelExecution) {
    this.httpColonNsAdobeComAdobecloudRelExecution = httpColonNsAdobeComAdobecloudRelExecution;
  }

    
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/pipeline")
  public HalLink getHttpColonNsAdobeComAdobecloudRelPipeline() {
    return httpColonNsAdobeComAdobecloudRelPipeline;
  }
  public void setHttpColonNsAdobeComAdobecloudRelPipeline(HalLink httpColonNsAdobeComAdobecloudRelPipeline) {
    this.httpColonNsAdobeComAdobecloudRelPipeline = httpColonNsAdobeComAdobecloudRelPipeline;
  }

    
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/pipeline/logs")
  public HalLink getHttpColonNsAdobeComAdobecloudRelPipelineLogs() {
    return httpColonNsAdobeComAdobecloudRelPipelineLogs;
  }
  public void setHttpColonNsAdobeComAdobecloudRelPipelineLogs(HalLink httpColonNsAdobeComAdobecloudRelPipelineLogs) {
    this.httpColonNsAdobeComAdobecloudRelPipelineLogs = httpColonNsAdobeComAdobecloudRelPipelineLogs;
  }

    
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/pipeline/metrics")
  public HalLink getHttpColonNsAdobeComAdobecloudRelPipelineMetrics() {
    return httpColonNsAdobeComAdobecloudRelPipelineMetrics;
  }
  public void setHttpColonNsAdobeComAdobecloudRelPipelineMetrics(HalLink httpColonNsAdobeComAdobecloudRelPipelineMetrics) {
    this.httpColonNsAdobeComAdobecloudRelPipelineMetrics = httpColonNsAdobeComAdobecloudRelPipelineMetrics;
  }

    
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/pipeline/advance")
  public HalLink getHttpColonNsAdobeComAdobecloudRelPipelineAdvance() {
    return httpColonNsAdobeComAdobecloudRelPipelineAdvance;
  }
  public void setHttpColonNsAdobeComAdobecloudRelPipelineAdvance(HalLink httpColonNsAdobeComAdobecloudRelPipelineAdvance) {
    this.httpColonNsAdobeComAdobecloudRelPipelineAdvance = httpColonNsAdobeComAdobecloudRelPipelineAdvance;
  }

    
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/pipeline/cancel")
  public HalLink getHttpColonNsAdobeComAdobecloudRelPipelineCancel() {
    return httpColonNsAdobeComAdobecloudRelPipelineCancel;
  }
  public void setHttpColonNsAdobeComAdobecloudRelPipelineCancel(HalLink httpColonNsAdobeComAdobecloudRelPipelineCancel) {
    this.httpColonNsAdobeComAdobecloudRelPipelineCancel = httpColonNsAdobeComAdobecloudRelPipelineCancel;
  }

    
  @JsonProperty("http://ns.adobe.com/adobecloud/rel/program")
  public HalLink getHttpColonNsAdobeComAdobecloudRelProgram() {
    return httpColonNsAdobeComAdobecloudRelProgram;
  }
  public void setHttpColonNsAdobeComAdobecloudRelProgram(HalLink httpColonNsAdobeComAdobecloudRelProgram) {
    this.httpColonNsAdobeComAdobecloudRelProgram = httpColonNsAdobeComAdobecloudRelProgram;
  }

    
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
