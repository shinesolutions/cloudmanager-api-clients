package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ProgramListEmbedded;
import org.openapitools.server.api.model.ProgramListLinks;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProgramList   {
  
  private Integer totalNumberOfItems;
  private ProgramListEmbedded embedded;
  private ProgramListLinks links;

  public ProgramList () {

  }

  public ProgramList (Integer totalNumberOfItems, ProgramListEmbedded embedded, ProgramListLinks links) {
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
  public ProgramListEmbedded getEmbedded() {
    return embedded;
  }
  public void setEmbedded(ProgramListEmbedded embedded) {
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
    ProgramList programList = (ProgramList) o;
    return Objects.equals(totalNumberOfItems, programList.totalNumberOfItems) &&
        Objects.equals(embedded, programList.embedded) &&
        Objects.equals(links, programList.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalNumberOfItems, embedded, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgramList {\n");
    
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
