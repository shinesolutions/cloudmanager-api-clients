package apimodels;

import apimodels.Pipeline;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * PipelineListEmbedded
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-22T02:53:34.661Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PipelineListEmbedded   {
  @JsonProperty("pipelines")
  private List<Pipeline> pipelines = null;

  public PipelineListEmbedded pipelines(List<Pipeline> pipelines) {
    this.pipelines = pipelines;
    return this;
  }

  public PipelineListEmbedded addPipelinesItem(Pipeline pipelinesItem) {
    if (pipelines == null) {
      pipelines = new ArrayList<>();
    }
    pipelines.add(pipelinesItem);
    return this;
  }

   /**
   * Get pipelines
   * @return pipelines
  **/
  @Valid
  public List<Pipeline> getPipelines() {
    return pipelines;
  }

  public void setPipelines(List<Pipeline> pipelines) {
    this.pipelines = pipelines;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PipelineListEmbedded pipelineListEmbedded = (PipelineListEmbedded) o;
    return Objects.equals(pipelines, pipelineListEmbedded.pipelines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pipelines);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineListEmbedded {\n");
    
    sb.append("    pipelines: ").append(toIndentedString(pipelines)).append("\n");
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

