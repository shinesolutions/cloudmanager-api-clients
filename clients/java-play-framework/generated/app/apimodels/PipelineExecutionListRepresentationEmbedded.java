package apimodels;

import apimodels.PipelineExecution;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * PipelineExecutionListRepresentationEmbedded
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-22T02:53:34.661Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PipelineExecutionListRepresentationEmbedded   {
  @JsonProperty("executions")
  private List<PipelineExecution> executions = null;

  public PipelineExecutionListRepresentationEmbedded executions(List<PipelineExecution> executions) {
    this.executions = executions;
    return this;
  }

  public PipelineExecutionListRepresentationEmbedded addExecutionsItem(PipelineExecution executionsItem) {
    if (executions == null) {
      executions = new ArrayList<>();
    }
    executions.add(executionsItem);
    return this;
  }

   /**
   * Get executions
   * @return executions
  **/
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
    return Objects.equals(executions, pipelineExecutionListRepresentationEmbedded.executions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(executions);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

