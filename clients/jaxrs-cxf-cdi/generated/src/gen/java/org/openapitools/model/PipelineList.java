package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PipelineListEmbedded;
import org.openapitools.model.ProgramListLinks;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;


public class PipelineList   {
  
  private Integer totalNumberOfItems;

  private PipelineListEmbedded embedded;

  private ProgramListLinks links;


  /**
   **/
  public PipelineList totalNumberOfItems(Integer totalNumberOfItems) {
    this.totalNumberOfItems = totalNumberOfItems;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("_totalNumberOfItems")
  public Integer getTotalNumberOfItems() {
    return totalNumberOfItems;
  }
  public void setTotalNumberOfItems(Integer totalNumberOfItems) {
    this.totalNumberOfItems = totalNumberOfItems;
  }


  /**
   **/
  public PipelineList embedded(PipelineListEmbedded embedded) {
    this.embedded = embedded;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("_embedded")
  public PipelineListEmbedded getEmbedded() {
    return embedded;
  }
  public void setEmbedded(PipelineListEmbedded embedded) {
    this.embedded = embedded;
  }


  /**
   **/
  public PipelineList links(ProgramListLinks links) {
    this.links = links;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("_links")
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
    PipelineList pipelineList = (PipelineList) o;
    return Objects.equals(totalNumberOfItems, pipelineList.totalNumberOfItems) &&
        Objects.equals(embedded, pipelineList.embedded) &&
        Objects.equals(links, pipelineList.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalNumberOfItems, embedded, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineList {\n");
    
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

