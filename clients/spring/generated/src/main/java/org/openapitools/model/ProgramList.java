package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ProgramListEmbedded;
import org.openapitools.model.ProgramListLinks;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProgramList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-06-22T02:57:04.825Z[GMT]")

public class ProgramList   {
  @JsonProperty("_totalNumberOfItems")
  private Integer totalNumberOfItems;

  @JsonProperty("_embedded")
  private ProgramListEmbedded embedded;

  @JsonProperty("_links")
  private ProgramListLinks links;

  public ProgramList totalNumberOfItems(Integer totalNumberOfItems) {
    this.totalNumberOfItems = totalNumberOfItems;
    return this;
  }

  /**
   * Get totalNumberOfItems
   * @return totalNumberOfItems
  */
  @ApiModelProperty(value = "")


  public Integer getTotalNumberOfItems() {
    return totalNumberOfItems;
  }

  public void setTotalNumberOfItems(Integer totalNumberOfItems) {
    this.totalNumberOfItems = totalNumberOfItems;
  }

  public ProgramList embedded(ProgramListEmbedded embedded) {
    this.embedded = embedded;
    return this;
  }

  /**
   * Get embedded
   * @return embedded
  */
  @ApiModelProperty(value = "")

  @Valid

  public ProgramListEmbedded getEmbedded() {
    return embedded;
  }

  public void setEmbedded(ProgramListEmbedded embedded) {
    this.embedded = embedded;
  }

  public ProgramList links(ProgramListLinks links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  */
  @ApiModelProperty(value = "")

  @Valid

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
    ProgramList programList = (ProgramList) o;
    return Objects.equals(this.totalNumberOfItems, programList.totalNumberOfItems) &&
        Objects.equals(this.embedded, programList.embedded) &&
        Objects.equals(this.links, programList.links);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

