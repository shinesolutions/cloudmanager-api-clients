package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.PipelineExecutionStepState;

/**
 * PipelineExecutionEmbedded
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-06-22T02:53:20.395Z[GMT]")
public class PipelineExecutionEmbedded   {
  @JsonProperty("stepStates")
  private List<PipelineExecutionStepState> stepStates = null;

  public PipelineExecutionEmbedded stepStates(List<PipelineExecutionStepState> stepStates) {
    this.stepStates = stepStates;
    return this;
  }

  public PipelineExecutionEmbedded addStepStatesItem(PipelineExecutionStepState stepStatesItem) {
    if (this.stepStates == null) {
      this.stepStates = new ArrayList<PipelineExecutionStepState>();
    }
    this.stepStates.add(stepStatesItem);
    return this;
  }

   /**
   * Get stepStates
   * @return stepStates
  **/
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.stepStates, pipelineExecutionEmbedded.stepStates);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

