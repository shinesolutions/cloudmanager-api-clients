package org.openapitools.model;

import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Pipeline;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PipelineListEmbedded  {
  
  @ApiModelProperty(value = "")
  private List<Pipeline> pipelines = null;
 /**
   * Get pipelines
   * @return pipelines
  **/
  @JsonProperty("pipelines")
  public List<Pipeline> getPipelines() {
    return pipelines;
  }

  public void setPipelines(List<Pipeline> pipelines) {
    this.pipelines = pipelines;
  }

  public PipelineListEmbedded pipelines(List<Pipeline> pipelines) {
    this.pipelines = pipelines;
    return this;
  }

  public PipelineListEmbedded addPipelinesItem(Pipeline pipelinesItem) {
    this.pipelines.add(pipelinesItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

