/*
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


package com.shinesolutions.aemcloudmanager4j.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.shinesolutions.aemcloudmanager4j.model.Pipeline;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PipelineListEmbedded
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-06-22T02:15:07.238Z[GMT]")
public class PipelineListEmbedded {
  public static final String SERIALIZED_NAME_PIPELINES = "pipelines";
  @SerializedName(SERIALIZED_NAME_PIPELINES)
  private List<Pipeline> pipelines = null;


  public PipelineListEmbedded pipelines(List<Pipeline> pipelines) {
    
    this.pipelines = pipelines;
    return this;
  }

  public PipelineListEmbedded addPipelinesItem(Pipeline pipelinesItem) {
    if (this.pipelines == null) {
      this.pipelines = new ArrayList<Pipeline>();
    }
    this.pipelines.add(pipelinesItem);
    return this;
  }

   /**
   * Get pipelines
   * @return pipelines
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Pipeline> getPipelines() {
    return pipelines;
  }


  public void setPipelines(List<Pipeline> pipelines) {
    this.pipelines = pipelines;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PipelineListEmbedded pipelineListEmbedded = (PipelineListEmbedded) o;
    return Objects.equals(this.pipelines, pipelineListEmbedded.pipelines);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

