package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Filtering and sorting page details")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-06-22T02:54:15.715Z[GMT]")
public class RequestedPageDetails   {
  

  private Integer start;

  private Integer limit;

  private String orderBy;

  private List<String> property = new ArrayList<String>();

  private String type;

  private Integer next;

  private Integer prev;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("start")
  public Integer getStart() {
    return start;
  }
  public void setStart(Integer start) {
    this.start = start;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("limit")
  public Integer getLimit() {
    return limit;
  }
  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("orderBy")
  public String getOrderBy() {
    return orderBy;
  }
  public void setOrderBy(String orderBy) {
    this.orderBy = orderBy;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("property")
  public List<String> getProperty() {
    return property;
  }
  public void setProperty(List<String> property) {
    this.property = property;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("next")
  public Integer getNext() {
    return next;
  }
  public void setNext(Integer next) {
    this.next = next;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("prev")
  public Integer getPrev() {
    return prev;
  }
  public void setPrev(Integer prev) {
    this.prev = prev;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestedPageDetails requestedPageDetails = (RequestedPageDetails) o;
    return Objects.equals(start, requestedPageDetails.start) &&
        Objects.equals(limit, requestedPageDetails.limit) &&
        Objects.equals(orderBy, requestedPageDetails.orderBy) &&
        Objects.equals(property, requestedPageDetails.property) &&
        Objects.equals(type, requestedPageDetails.type) &&
        Objects.equals(next, requestedPageDetails.next) &&
        Objects.equals(prev, requestedPageDetails.prev);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, limit, orderBy, property, type, next, prev);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestedPageDetails {\n");
    
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
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

