package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.PipelineExecutionListRepresentationEmbedded;
import org.openapitools.model.PipelineExecutionListRepresentationLinks;
import org.openapitools.model.RequestedPageDetails;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * List of pipeline executions
 **/
@ApiModel(description="List of pipeline executions")
public class PipelineExecutionListRepresentation  {
  
  @ApiModelProperty(value = "")
  private Integer totalNumberOfItems;

  @ApiModelProperty(value = "")
  private RequestedPageDetails page;

  @ApiModelProperty(value = "")
  private PipelineExecutionListRepresentationEmbedded embedded;

  @ApiModelProperty(value = "")
  private PipelineExecutionListRepresentationLinks links;
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

  public PipelineExecutionListRepresentation totalNumberOfItems(Integer totalNumberOfItems) {
    this.totalNumberOfItems = totalNumberOfItems;
    return this;
  }

 /**
   * Get page
   * @return page
  **/
  @JsonProperty("_page")
  public RequestedPageDetails getPage() {
    return page;
  }

  public void setPage(RequestedPageDetails page) {
    this.page = page;
  }

  public PipelineExecutionListRepresentation page(RequestedPageDetails page) {
    this.page = page;
    return this;
  }

 /**
   * Get embedded
   * @return embedded
  **/
  @JsonProperty("_embedded")
  public PipelineExecutionListRepresentationEmbedded getEmbedded() {
    return embedded;
  }

  public void setEmbedded(PipelineExecutionListRepresentationEmbedded embedded) {
    this.embedded = embedded;
  }

  public PipelineExecutionListRepresentation embedded(PipelineExecutionListRepresentationEmbedded embedded) {
    this.embedded = embedded;
    return this;
  }

 /**
   * Get links
   * @return links
  **/
  @JsonProperty("_links")
  public PipelineExecutionListRepresentationLinks getLinks() {
    return links;
  }

  public void setLinks(PipelineExecutionListRepresentationLinks links) {
    this.links = links;
  }

  public PipelineExecutionListRepresentation links(PipelineExecutionListRepresentationLinks links) {
    this.links = links;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

