package org.openapitools.model;

import org.openapitools.model.ProgramListLinks;
import org.openapitools.model.RepositoryListEmbedded;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RepositoryList  {
  
  @ApiModelProperty(value = "")
  private Integer totalNumberOfItems;

  @ApiModelProperty(value = "")
  private RepositoryListEmbedded embedded;

  @ApiModelProperty(value = "")
  private ProgramListLinks links;
 /**
   * Get totalNumberOfItems
   * @return totalNumberOfItems
  **/
  @JsonProperty("_totalNumberOfItems")
  public Integer getTotalNumberOfItems() {
    return totalNumberOfItems;
  }

  public void setTotalNumberOfItems(Integer totalNumberOfItems) {
    this.totalNumberOfItems = totalNumberOfItems;
  }

  public RepositoryList totalNumberOfItems(Integer totalNumberOfItems) {
    this.totalNumberOfItems = totalNumberOfItems;
    return this;
  }

 /**
   * Get embedded
   * @return embedded
  **/
  @JsonProperty("_embedded")
  public RepositoryListEmbedded getEmbedded() {
    return embedded;
  }

  public void setEmbedded(RepositoryListEmbedded embedded) {
    this.embedded = embedded;
  }

  public RepositoryList embedded(RepositoryListEmbedded embedded) {
    this.embedded = embedded;
    return this;
  }

 /**
   * Get links
   * @return links
  **/
  @JsonProperty("_links")
  public ProgramListLinks getLinks() {
    return links;
  }

  public void setLinks(ProgramListLinks links) {
    this.links = links;
  }

  public RepositoryList links(ProgramListLinks links) {
    this.links = links;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

