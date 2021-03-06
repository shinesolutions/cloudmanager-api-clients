/**
 * Cloud Manager API
 * This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.PipelineExecutionStepState;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class PipelineExecutionEmbedded {
  
  @SerializedName("stepStates")
  private List<PipelineExecutionStepState> stepStates = null;

  /**
   **/
  @ApiModelProperty(value = "")
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
    return (this.stepStates == null ? pipelineExecutionEmbedded.stepStates == null : this.stepStates.equals(pipelineExecutionEmbedded.stepStates));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.stepStates == null ? 0: this.stepStates.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineExecutionEmbedded {\n");
    
    sb.append("  stepStates: ").append(stepStates).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
