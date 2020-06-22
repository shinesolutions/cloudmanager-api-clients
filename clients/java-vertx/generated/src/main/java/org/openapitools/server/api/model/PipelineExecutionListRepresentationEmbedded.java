package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.PipelineExecution;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PipelineExecutionListRepresentationEmbedded   {
  
  private List<PipelineExecution> executions = new ArrayList<>();

  public PipelineExecutionListRepresentationEmbedded () {

  }

  public PipelineExecutionListRepresentationEmbedded (List<PipelineExecution> executions) {
    this.executions = executions;
  }

    
  @JsonProperty("executions")
  public List<PipelineExecution> getExecutions() {
    return executions;
  }
  public void setExecutions(List<PipelineExecution> executions) {
    this.executions = executions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PipelineExecutionListRepresentationEmbedded pipelineExecutionListRepresentationEmbedded = (PipelineExecutionListRepresentationEmbedded) o;
    return Objects.equals(executions, pipelineExecutionListRepresentationEmbedded.executions);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
