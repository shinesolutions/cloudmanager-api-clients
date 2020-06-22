package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Pipeline;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PipelineListEmbedded
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-06-22T02:57:04.825Z[GMT]")

public class PipelineListEmbedded   {
  @JsonProperty("pipelines")
  @Valid
  private List<Pipeline> pipelines = null;

  public PipelineListEmbedded pipelines(List<Pipeline> pipelines) {
    this.pipelines = pipelines;
    return this;
  }

  public PipelineListEmbedded addPipelinesItem(Pipeline pipelinesItem) {
    if (this.pipelines == null) {
      this.pipelines = new ArrayList<>();
    }
    this.pipelines.add(pipelinesItem);
    return this;
  }

  /**
   * Get pipelines
   * @return pipelines
  */
  @ApiModelProperty(value = "")

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
    return Objects.equals(this.pipelines, pipelineListEmbedded.pipelines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pipelines);
  }

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

