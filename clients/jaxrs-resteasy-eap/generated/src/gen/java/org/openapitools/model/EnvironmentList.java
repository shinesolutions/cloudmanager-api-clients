package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.EnvironmentListEmbedded;
import org.openapitools.model.ProgramListLinks;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-06-22T02:54:15.715Z[GMT]")
public class EnvironmentList   {
  

  private Integer totalNumberOfItems;

  private EnvironmentListEmbedded embedded;

  private ProgramListLinks links;

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
  @JsonProperty("_embedded")
  public EnvironmentListEmbedded getEmbedded() {
    return embedded;
  }
  public void setEmbedded(EnvironmentListEmbedded embedded) {
    this.embedded = embedded;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
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

