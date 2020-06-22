package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.PipelineExecutionStepState;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PipelineExecutionEmbedded   {
  
  private List<PipelineExecutionStepState> stepStates = new ArrayList<>();

  public PipelineExecutionEmbedded () {

  }

  public PipelineExecutionEmbedded (List<PipelineExecutionStepState> stepStates) {
    this.stepStates = stepStates;
  }

    
  @JsonProperty("stepStates")
  public List<PipelineExecutionStepState> getStepStates() {
    return stepStates;
  }
  public void setStepStates(List<PipelineExecutionStepState> stepStates) {
    this.stepStates = stepStates;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PipelineExecutionEmbedded pipelineExecutionEmbedded = (PipelineExecutionEmbedded) o;
    return Objects.equals(stepStates, pipelineExecutionEmbedded.stepStates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stepStates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineExecutionEmbedded {\n");
    
    sb.append("    stepStates: ").append(toIndentedString(stepStates)).append("\n");
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
