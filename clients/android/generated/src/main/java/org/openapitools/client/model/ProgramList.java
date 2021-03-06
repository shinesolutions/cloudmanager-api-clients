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

import org.openapitools.client.model.ProgramListEmbedded;
import org.openapitools.client.model.ProgramListLinks;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ProgramList {
  
  @SerializedName("_totalNumberOfItems")
  private Integer totalNumberOfItems = null;
  @SerializedName("_embedded")
  private ProgramListEmbedded embedded = null;
  @SerializedName("_links")
  private ProgramListLinks links = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getTotalNumberOfItems() {
    return totalNumberOfItems;
  }
  public void setTotalNumberOfItems(Integer totalNumberOfItems) {
    this.totalNumberOfItems = totalNumberOfItems;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ProgramListEmbedded getEmbedded() {
    return embedded;
  }
  public void setEmbedded(ProgramListEmbedded embedded) {
    this.embedded = embedded;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ProgramListLinks getLinks() {
    return links;
  }
  public void setLinks(ProgramListLinks links) {
    this.links = links;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProgramList programList = (ProgramList) o;
    return (this.totalNumberOfItems == null ? programList.totalNumberOfItems == null : this.totalNumberOfItems.equals(programList.totalNumberOfItems)) &&
        (this.embedded == null ? programList.embedded == null : this.embedded.equals(programList.embedded)) &&
        (this.links == null ? programList.links == null : this.links.equals(programList.links));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.totalNumberOfItems == null ? 0: this.totalNumberOfItems.hashCode());
    result = 31 * result + (this.embedded == null ? 0: this.embedded.hashCode());
    result = 31 * result + (this.links == null ? 0: this.links.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgramList {\n");
    
    sb.append("  totalNumberOfItems: ").append(totalNumberOfItems).append("\n");
    sb.append("  embedded: ").append(embedded).append("\n");
    sb.append("  links: ").append(links).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
