package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PipelineExecutionListRepresentationEmbedded;
import org.openapitools.model.PipelineExecutionListRepresentationLinks;
import org.openapitools.model.RequestedPageDetails;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="List of pipeline executions")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-06-22T02:54:15.715Z[GMT]")
public class PipelineExecutionListRepresentation   {
  

  private Integer totalNumberOfItems;

  private RequestedPageDetails page;

  private PipelineExecutionListRepresentationEmbedded embedded;

  private PipelineExecutionListRepresentationLinks links;

  /**
   **/
  
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("_links")
  public PipelineExecutionListRepresentationLinks getLinks() {
    return links;
  }
  public void setLinks(PipelineExecutionListRepresentationLinks links) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

