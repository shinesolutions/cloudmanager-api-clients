package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.PipelineExecution;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PipelineExecutionListRepresentationEmbedded
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-06-22T02:57:04.825Z[GMT]")

public class PipelineExecutionListRepresentationEmbedded   {
  @JsonProperty("executions")
  @Valid
  private List<PipelineExecution> executions = null;

  public PipelineExecutionListRepresentationEmbedded executions(List<PipelineExecution> executions) {
    this.executions = executions;
    return this;
  }

  public PipelineExecutionListRepresentationEmbedded addExecutionsItem(PipelineExecution executionsItem) {
    if (this.executions == null) {
      this.executions = new ArrayList<>();
    }
    this.executions.add(executionsItem);
    return this;
  }

  /**
   * Get executions
   * @return executions
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<PipelineExecution> getExecutions() {
    return executions;
  }

  public void setExecutions(List<PipelineExecution> executions) {
    this.executions = executions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PipelineExecutionListRepresentationEmbedded pipelineExecutionListRepresentationEmbedded = (PipelineExecutionListRepresentationEmbedded) o;
    return Objects.equals(this.executions, pipelineExecutionListRepresentationEmbedded.executions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(executions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineExecutionListRepresentationEmbedded {\n");
    
    sb.append("    executions: ").append(toIndentedString(executions)).append("\n");
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

