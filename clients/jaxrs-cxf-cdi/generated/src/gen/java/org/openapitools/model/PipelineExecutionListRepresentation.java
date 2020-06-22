package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PipelineExecutionListRepresentationEmbedded;
import org.openapitools.model.PipelineExecutionListRepresentationLinks;
import org.openapitools.model.RequestedPageDetails;
import javax.validation.constraints.*;

/**
 * List of pipeline executions
 **/

import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;

@ApiModel(description = "List of pipeline executions")
public class PipelineExecutionListRepresentation   {
  
  private Integer totalNumberOfItems;

  private RequestedPageDetails page;

  private PipelineExecutionListRepresentationEmbedded embedded;

  private PipelineExecutionListRepresentationLinks links;


  /**
   **/
  public PipelineExecutionListRepresentation totalNumberOfItems(Integer totalNumberOfItems) {
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
  public PipelineExecutionListRepresentation page(RequestedPageDetails page) {
    this.page = page;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("_page")
  public RequestedPageDetails getPage() {
    return page;
  }
  public void setPage(RequestedPageDetails page) {
    this.page = page;
  }


  /**
   **/
  public PipelineExecutionListRepresentation embedded(PipelineExecutionListRepresentationEmbedded embedded) {
    this.embedded = embedded;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("_embedded")
  public PipelineExecutionListRepresentationEmbedded getEmbedded() {
    return embedded;
  }
  public void setEmbedded(PipelineExecutionListRepresentationEmbedded embedded) {
    this.embedded = embedded;
  }


  /**
   **/
  public PipelineExecutionListRepresentation links(PipelineExecutionListRepresentationLinks links) {
    this.links = links;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("_links")
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
    return Objects.equals(totalNumberOfItems, pipelineExecutionListRepresentation.totalNumberOfItems) &&
        Objects.equals(page, pipelineExecutionListRepresentation.page) &&
        Objects.equals(embedded, pipelineExecutionListRepresentation.embedded) &&
        Objects.equals(links, pipelineExecutionListRepresentation.links);
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

