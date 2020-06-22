package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * Filtering and sorting page details
 **/

import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;

@ApiModel(description = "Filtering and sorting page details")
public class RequestedPageDetails   {
  
  private Integer start;

  private Integer limit;

  private String orderBy;

  private List<String> property = null;

  private String type;

  private Integer next;

  private Integer prev;


  /**
   **/
  public RequestedPageDetails start(Integer start) {
    this.start = start;
    return this;
  }

  
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
  public RequestedPageDetails limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  
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
  public RequestedPageDetails orderBy(String orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  
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
  public RequestedPageDetails property(List<String> property) {
    this.property = property;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("property")
  public List<String> getProperty() {
    return property;
  }
  public void setProperty(List<String> property) {
    this.property = property;
  }

  public RequestedPageDetails addPropertyItem(String propertyItem) {
    if (this.property == null) {
      this.property = new ArrayList<String>();
    }
    this.property.add(propertyItem);
    return this;
  }


  /**
   **/
  public RequestedPageDetails type(String type) {
    this.type = type;
    return this;
  }

  
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
  public RequestedPageDetails next(Integer next) {
    this.next = next;
    return this;
  }

  
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
  public RequestedPageDetails prev(Integer prev) {
    this.prev = prev;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("prev")
  public Integer getPrev() {
    return prev;
  }
  public void setPrev(Integer prev) {
    this.prev = prev;
  }



  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

