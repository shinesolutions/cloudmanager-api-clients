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


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ProgramListLinks;
import org.openapitools.model.RepositoryListEmbedded;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * RepositoryList
 */
@JsonPropertyOrder({
  RepositoryList.JSON_PROPERTY_TOTAL_NUMBER_OF_ITEMS,
  RepositoryList.JSON_PROPERTY_EMBEDDED,
  RepositoryList.JSON_PROPERTY_LINKS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-06-22T02:54:02.008Z[GMT]")
public class RepositoryList   {
  public static final String JSON_PROPERTY_TOTAL_NUMBER_OF_ITEMS = "_totalNumberOfItems";
  @JsonProperty(JSON_PROPERTY_TOTAL_NUMBER_OF_ITEMS)
  private Integer totalNumberOfItems;

  public static final String JSON_PROPERTY_EMBEDDED = "_embedded";
  @JsonProperty(JSON_PROPERTY_EMBEDDED)
  private RepositoryListEmbedded embedded;

  public static final String JSON_PROPERTY_LINKS = "_links";
  @JsonProperty(JSON_PROPERTY_LINKS)
  private ProgramListLinks links;

  public RepositoryList totalNumberOfItems(Integer totalNumberOfItems) {
    this.totalNumberOfItems = totalNumberOfItems;
    return this;
  }

  /**
   * Get totalNumberOfItems
   * @return totalNumberOfItems
   **/
  @JsonProperty("_totalNumberOfItems")
  @ApiModelProperty(value = "")
  
  public Integer getTotalNumberOfItems() {
    return totalNumberOfItems;
  }

  public void setTotalNumberOfItems(Integer totalNumberOfItems) {
    this.totalNumberOfItems = totalNumberOfItems;
  }

  public RepositoryList embedded(RepositoryListEmbedded embedded) {
    this.embedded = embedded;
    return this;
  }

  /**
   * Get embedded
   * @return embedded
   **/
  @JsonProperty("_embedded")
  @ApiModelProperty(value = "")
  @Valid 
  public RepositoryListEmbedded getEmbedded() {
    return embedded;
  }

  public void setEmbedded(RepositoryListEmbedded embedded) {
    this.embedded = embedded;
  }

  public RepositoryList links(ProgramListLinks links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
   **/
  @JsonProperty("_links")
  @ApiModelProperty(value = "")
  @Valid 
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
    RepositoryList repositoryList = (RepositoryList) o;
    return Objects.equals(this.totalNumberOfItems, repositoryList.totalNumberOfItems) &&
        Objects.equals(this.embedded, repositoryList.embedded) &&
        Objects.equals(this.links, repositoryList.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalNumberOfItems, embedded, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepositoryList {\n");
    
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

