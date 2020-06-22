package apimodels;

import apimodels.Metric;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * PipelineStepMetrics
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-22T02:53:34.661Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PipelineStepMetrics   {
  @JsonProperty("metrics")
  private List<Metric> metrics = null;

  public PipelineStepMetrics metrics(List<Metric> metrics) {
    this.metrics = metrics;
    return this;
  }

  public PipelineStepMetrics addMetricsItem(Metric metricsItem) {
    if (metrics == null) {
      metrics = new ArrayList<>();
    }
    metrics.add(metricsItem);
    return this;
  }

   /**
   * metrics
   * @return metrics
  **/
  @Valid
  public List<Metric> getMetrics() {
    return metrics;
  }

  public void setMetrics(List<Metric> metrics) {
    this.metrics = metrics;
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

