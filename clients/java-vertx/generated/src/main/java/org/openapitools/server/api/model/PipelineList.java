package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.PipelineListEmbedded;
import org.openapitools.server.api.model.ProgramListLinks;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PipelineList   {
  
  private Integer totalNumberOfItems;
  private PipelineListEmbedded embedded;
  private ProgramListLinks links;

  public PipelineList () {

  }

  public PipelineList (Integer totalNumberOfItems, PipelineListEmbedded embedded, ProgramListLinks links) {
    this.totalNumberOfItems = totalNumberOfItems;
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

    
  @JsonProperty("_embedded")
  public PipelineListEmbedded getEmbedded() {
    return embedded;
  }
  public void setEmbedded(PipelineListEmbedded embedded) {
    this.embedded = embedded;
  }

    
  @JsonProperty("_links")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
