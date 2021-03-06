package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.VariableListEmbedded;
import org.openapitools.model.VariableListLinks;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2020-06-22T02:54:21.117Z[GMT]")
public class VariableList   {
  
  private @Valid Integer totalNumberOfItems;
  private @Valid VariableListEmbedded embedded;
  private @Valid VariableListLinks links;

  /**
   **/
  public VariableList totalNumberOfItems(Integer totalNumberOfItems) {
    this.totalNumberOfItems = totalNumberOfItems;
    return this;
  }

  
  @ApiModelProperty(example = "1", value = "")
  @JsonProperty("_totalNumberOfItems")
  public Integer getTotalNumberOfItems() {
    return totalNumberOfItems;
  }
  public void setTotalNumberOfItems(Integer totalNumberOfItems) {
    this.totalNumberOfItems = totalNumberOfItems;
  }

  /**
   **/
  public VariableList embedded(VariableListEmbedded embedded) {
    this.embedded = embedded;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("_embedded")
  public VariableListEmbedded getEmbedded() {
    return embedded;
  }
  public void setEmbedded(VariableListEmbedded embedded) {
    this.embedded = embedded;
  }

  /**
   **/
  public VariableList links(VariableListLinks links) {
    this.links = links;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("_links")
  public VariableListLinks getLinks() {
    return links;
  }
  public void setLinks(VariableListLinks links) {
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
    VariableList variableList = (VariableList) o;
    return Objects.equals(this.totalNumberOfItems, variableList.totalNumberOfItems) &&
        Objects.equals(this.embedded, variableList.embedded) &&
        Objects.equals(this.links, variableList.links);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

