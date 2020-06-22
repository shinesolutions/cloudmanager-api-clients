package org.openapitools.model;

import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.PipelineExecution;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PipelineExecutionListRepresentationEmbedded  {
  
  @ApiModelProperty(value = "")
  private List<PipelineExecution> executions = null;
 /**
   * Get executions
   * @return executions
  **/
  @JsonProperty("executions")
  public List<PipelineExecution> getExecutions() {
    return executions;
  }

  public void setExecutions(List<PipelineExecution> executions) {
    this.executions = executions;
  }

  public PipelineExecutionListRepresentationEmbedded executions(List<PipelineExecution> executions) {
    this.executions = executions;
    return this;
  }

  public PipelineExecutionListRepresentationEmbedded addExecutionsItem(PipelineExecution executionsItem) {
    this.executions.add(executionsItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

