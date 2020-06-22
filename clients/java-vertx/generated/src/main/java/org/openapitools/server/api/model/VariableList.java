package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.VariableListEmbedded;
import org.openapitools.server.api.model.VariableListLinks;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VariableList   {
  
  private Integer totalNumberOfItems;
  private VariableListEmbedded embedded;
  private VariableListLinks links;

  public VariableList () {

  }

  public VariableList (Integer totalNumberOfItems, VariableListEmbedded embedded, VariableListLinks links) {
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
  public VariableListEmbedded getEmbedded() {
    return embedded;
  }
  public void setEmbedded(VariableListEmbedded embedded) {
    this.embedded = embedded;
  }

    
  @JsonProperty("_links")
  public VariableListLinks getLinks() {
    return links;
  }
  public void setLinks(VariableListLinks links) {
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
    VariableList variableList = (VariableList) o;
    return Objects.equals(totalNumberOfItems, variableList.totalNumberOfItems) &&
        Objects.equals(embedded, variableList.embedded) &&
        Objects.equals(links, variableList.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalNumberOfItems, embedded, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableList {\n");
    
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
