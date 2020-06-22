package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.PipelineExecutionListRepresentationEmbedded;
import org.openapitools.server.api.model.PipelineExecutionListRepresentationLinks;
import org.openapitools.server.api.model.RequestedPageDetails;

/**
 * List of pipeline executions
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PipelineExecutionListRepresentation   {
  
  private Integer totalNumberOfItems;
  private RequestedPageDetails page;
  private PipelineExecutionListRepresentationEmbedded embedded;
  private PipelineExecutionListRepresentationLinks links;

  public PipelineExecutionListRepresentation () {

  }

  public PipelineExecutionListRepresentation (Integer totalNumberOfItems, RequestedPageDetails page, PipelineExecutionListRepresentationEmbedded embedded, PipelineExecutionListRepresentationLinks links) {
    this.totalNumberOfItems = totalNumberOfItems;
    this.page = page;
    this.embedded = embedded;
    this.links = links;
  }

    
  @JsonProperty("_totalNumberOfItems")
  public Integer getTotalNumberOfItems() {
    return totalNumberOfItems;
  }
  public void setTotalNumberOfItems(Integer totalNumberOfItems) {
    this.totalNumberOfItems = totalNumberOfItems;
  }

    
  @JsonProperty("_page")
  public RequestedPageDetails getPage() {
    return page;
  }
  public void setPage(RequestedPageDetails page) {
    this.page = page;
  }

    
  @JsonProperty("_embedded")
  public PipelineExecutionListRepresentationEmbedded getEmbedded() {
    return embedded;
  }
  public void setEmbedded(PipelineExecutionListRepresentationEmbedded embedded) {
    this.embedded = embedded;
  }

    
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
