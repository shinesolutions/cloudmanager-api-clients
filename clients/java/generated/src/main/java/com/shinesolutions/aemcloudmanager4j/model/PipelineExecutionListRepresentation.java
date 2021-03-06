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
import com.shinesolutions.aemcloudmanager4j.model.PipelineExecutionListRepresentationEmbedded;
import com.shinesolutions.aemcloudmanager4j.model.PipelineExecutionListRepresentationLinks;
import com.shinesolutions.aemcloudmanager4j.model.RequestedPageDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * List of pipeline executions
 */
@ApiModel(description = "List of pipeline executions")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-06-23T00:28:14.729Z[GMT]")
public class PipelineExecutionListRepresentation {
  public static final String SERIALIZED_NAME_TOTAL_NUMBER_OF_ITEMS = "_totalNumberOfItems";
  @SerializedName(SERIALIZED_NAME_TOTAL_NUMBER_OF_ITEMS)
  private Integer totalNumberOfItems;

  public static final String SERIALIZED_NAME_PAGE = "_page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private RequestedPageDetails page;

  public static final String SERIALIZED_NAME_EMBEDDED = "_embedded";
  @SerializedName(SERIALIZED_NAME_EMBEDDED)
  private PipelineExecutionListRepresentationEmbedded embedded;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private PipelineExecutionListRepresentationLinks links;


  public PipelineExecutionListRepresentation totalNumberOfItems(Integer totalNumberOfItems) {
    
    this.totalNumberOfItems = totalNumberOfItems;
    return this;
  }

   /**
   * Get totalNumberOfItems
   * @return totalNumberOfItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalNumberOfItems() {
    return totalNumberOfItems;
  }


  public void setTotalNumberOfItems(Integer totalNumberOfItems) {
    this.totalNumberOfItems = totalNumberOfItems;
  }


  public PipelineExecutionListRepresentation page(RequestedPageDetails page) {
    
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RequestedPageDetails getPage() {
    return page;
  }


  public void setPage(RequestedPageDetails page) {
    this.page = page;
  }


  public PipelineExecutionListRepresentation embedded(PipelineExecutionListRepresentationEmbedded embedded) {
    
    this.embedded = embedded;
    return this;
  }

   /**
   * Get embedded
   * @return embedded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PipelineExecutionListRepresentationEmbedded getEmbedded() {
    return embedded;
  }


  public void setEmbedded(PipelineExecutionListRepresentationEmbedded embedded) {
    this.embedded = embedded;
  }


  public PipelineExecutionListRepresentation links(PipelineExecutionListRepresentationLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PipelineExecutionListRepresentationLinks getLinks() {
    return links;
  }


  public void setLinks(PipelineExecutionListRepresentationLinks links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PipelineExecutionListRepresentation pipelineExecutionListRepresentation = (PipelineExecutionListRepresentation) o;
    return Objects.equals(this.totalNumberOfItems, pipelineExecutionListRepresentation.totalNumberOfItems) &&
        Objects.equals(this.page, pipelineExecutionListRepresentation.page) &&
        Objects.equals(this.embedded, pipelineExecutionListRepresentation.embedded) &&
        Objects.equals(this.links, pipelineExecutionListRepresentation.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalNumberOfItems, page, embedded, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineExecutionListRepresentation {\n");
    sb.append("    totalNumberOfItems: ").append(toIndentedString(totalNumberOfItems)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    embedded: ").append(toIndentedString(embedded)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

