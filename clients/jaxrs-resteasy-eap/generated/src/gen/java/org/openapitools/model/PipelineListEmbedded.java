package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Pipeline;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-06-22T02:54:15.715Z[GMT]")
public class PipelineListEmbedded   {
  

  private List<Pipeline> pipelines = new ArrayList<Pipeline>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pipelines")
  public List<Pipeline> getPipelines() {
    return pipelines;
  }
  public void setPipelines(List<Pipeline> pipelines) {
    this.pipelines = pipelines;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PipelineListEmbedded pipelineListEmbedded = (PipelineListEmbedded) o;
    return Objects.equals(pipelines, pipelineListEmbedded.pipelines);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

