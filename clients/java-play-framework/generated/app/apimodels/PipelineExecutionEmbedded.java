package apimodels;

import apimodels.PipelineExecutionStepState;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * PipelineExecutionEmbedded
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-22T02:53:34.661Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PipelineExecutionEmbedded   {
  @JsonProperty("stepStates")
  private List<PipelineExecutionStepState> stepStates = null;

  public PipelineExecutionEmbedded stepStates(List<PipelineExecutionStepState> stepStates) {
    this.stepStates = stepStates;
    return this;
  }

  public PipelineExecutionEmbedded addStepStatesItem(PipelineExecutionStepState stepStatesItem) {
    if (stepStates == null) {
      stepStates = new ArrayList<>();
    }
    stepStates.add(stepStatesItem);
    return this;
  }

   /**
   * Get stepStates
   * @return stepStates
  **/
  @Valid
  public List<PipelineExecutionStepState> getStepStates() {
    return stepStates;
  }

  public void setStepStates(List<PipelineExecutionStepState> stepStates) {
    this.stepStates = stepStates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

