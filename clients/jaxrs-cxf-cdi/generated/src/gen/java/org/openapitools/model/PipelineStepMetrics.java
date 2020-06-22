package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Metric;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;


public class PipelineStepMetrics   {
  
  private List<Metric> metrics = null;


  /**
   * metrics
   **/
  public PipelineStepMetrics metrics(List<Metric> metrics) {
    this.metrics = metrics;
    return this;
  }

  
  @ApiModelProperty(value = "metrics")
  @JsonProperty("metrics")
  public List<Metric> getMetrics() {
    return metrics;
  }
  public void setMetrics(List<Metric> metrics) {
    this.metrics = metrics;
  }

  public PipelineStepMetrics addMetricsItem(Metric metricsItem) {
    if (this.metrics == null) {
      this.metrics = new ArrayList<Metric>();
    }
    this.metrics.add(metricsItem);
    return this;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PipelineStepMetrics pipelineStepMetrics = (PipelineStepMetrics) o;
    return Objects.equals(metrics, pipelineStepMetrics.metrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineStepMetrics {\n");
    
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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

