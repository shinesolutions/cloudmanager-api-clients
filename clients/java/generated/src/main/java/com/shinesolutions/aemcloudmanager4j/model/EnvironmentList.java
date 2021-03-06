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
import com.shinesolutions.aemcloudmanager4j.model.EnvironmentListEmbedded;
import com.shinesolutions.aemcloudmanager4j.model.ProgramListLinks;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * EnvironmentList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-06-23T00:28:14.729Z[GMT]")
public class EnvironmentList {
  public static final String SERIALIZED_NAME_TOTAL_NUMBER_OF_ITEMS = "_totalNumberOfItems";
  @SerializedName(SERIALIZED_NAME_TOTAL_NUMBER_OF_ITEMS)
  private Integer totalNumberOfItems;

  public static final String SERIALIZED_NAME_EMBEDDED = "_embedded";
  @SerializedName(SERIALIZED_NAME_EMBEDDED)
  private EnvironmentListEmbedded embedded;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private ProgramListLinks links;


  public EnvironmentList totalNumberOfItems(Integer totalNumberOfItems) {
    
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


  public EnvironmentList embedded(EnvironmentListEmbedded embedded) {
    
    this.embedded = embedded;
    return this;
  }

   /**
   * Get embedded
   * @return embedded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnvironmentListEmbedded getEmbedded() {
    return embedded;
  }


  public void setEmbedded(EnvironmentListEmbedded embedded) {
    this.embedded = embedded;
  }


  public EnvironmentList links(ProgramListLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProgramListLinks getLinks() {
    return links;
  }


  public void setLinks(ProgramListLinks links) {
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
    EnvironmentList environmentList = (EnvironmentList) o;
    return Objects.equals(this.totalNumberOfItems, environmentList.totalNumberOfItems) &&
        Objects.equals(this.embedded, environmentList.embedded) &&
        Objects.equals(this.links, environmentList.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalNumberOfItems, embedded, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvironmentList {\n");
    sb.append("    totalNumberOfItems: ").append(toIndentedString(totalNumberOfItems)).append("\n");
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

