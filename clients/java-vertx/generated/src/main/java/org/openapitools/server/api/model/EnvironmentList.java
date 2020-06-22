package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.EnvironmentListEmbedded;
import org.openapitools.server.api.model.ProgramListLinks;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EnvironmentList   {
  
  private Integer totalNumberOfItems;
  private EnvironmentListEmbedded embedded;
  private ProgramListLinks links;

  public EnvironmentList () {

  }

  public EnvironmentList (Integer totalNumberOfItems, EnvironmentListEmbedded embedded, ProgramListLinks links) {
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
  public EnvironmentListEmbedded getEmbedded() {
    return embedded;
  }
  public void setEmbedded(EnvironmentListEmbedded embedded) {
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
    EnvironmentList environmentList = (EnvironmentList) o;
    return Objects.equals(totalNumberOfItems, environmentList.totalNumberOfItems) &&
        Objects.equals(embedded, environmentList.embedded) &&
        Objects.equals(links, environmentList.links);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
