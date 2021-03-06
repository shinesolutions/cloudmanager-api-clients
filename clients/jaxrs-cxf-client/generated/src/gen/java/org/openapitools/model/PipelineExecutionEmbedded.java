package org.openapitools.model;

import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.PipelineExecutionStepState;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PipelineExecutionEmbedded  {
  
  @ApiModelProperty(value = "")
  private List<PipelineExecutionStepState> stepStates = null;
 /**
   * Get stepStates
   * @return stepStates
  **/
  @JsonProperty("stepStates")
  public List<PipelineExecutionStepState> getStepStates() {
    return stepStates;
  }

  public void setStepStates(List<PipelineExecutionStepState> stepStates) {
    this.stepStates = stepStates;
  }

  public PipelineExecutionEmbedded stepStates(List<PipelineExecutionStepState> stepStates) {
    this.stepStates = stepStates;
    return this;
  }

  public PipelineExecutionEmbedded addStepStatesItem(PipelineExecutionStepState stepStatesItem) {
    this.stepStates.add(stepStatesItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

