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
import org.openapitools.client.model.PipelineExecution;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class PipelineExecutionListRepresentationEmbedded {
  
  @SerializedName("executions")
  private List<PipelineExecution> executions = null;

  /**
   **/
  @ApiModelProperty(value = "")
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
    return (this.executions == null ? pipelineExecutionListRepresentationEmbedded.executions == null : this.executions.equals(pipelineExecutionListRepresentationEmbedded.executions));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.executions == null ? 0: this.executions.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineExecutionListRepresentationEmbedded {\n");
    
    sb.append("  executions: ").append(executions).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
