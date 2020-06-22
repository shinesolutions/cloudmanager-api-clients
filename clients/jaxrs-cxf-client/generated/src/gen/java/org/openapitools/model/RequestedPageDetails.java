package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;

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
  * Filtering and sorting page details
 **/
@ApiModel(description="Filtering and sorting page details")
public class RequestedPageDetails  {
  
  @ApiModelProperty(value = "")
  private Integer start;

  @ApiModelProperty(value = "")
  private Integer limit;

  @ApiModelProperty(value = "")
  private String orderBy;

  @ApiModelProperty(value = "")
  private List<String> property = null;

  @ApiModelProperty(value = "")
  private String type;

  @ApiModelProperty(value = "")
  private Integer next;

  @ApiModelProperty(value = "")
  private Integer prev;
 /**
   * Get start
   * @return start
  **/
  @JsonProperty("start")
  public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public RequestedPageDetails start(Integer start) {
    this.start = start;
    return this;
  }

 /**
   * Get limit
   * @return limit
  **/
  @JsonProperty("limit")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public RequestedPageDetails limit(Integer limit) {
    this.limit = limit;
    return this;
  }

 /**
   * Get orderBy
   * @return orderBy
  **/
  @JsonProperty("orderBy")
  public String getOrderBy() {
    return orderBy;
  }

  public void setOrderBy(String orderBy) {
    this.orderBy = orderBy;
  }

  public RequestedPageDetails orderBy(String orderBy) {
    this.orderBy = orderBy;
    return this;
  }

 /**
   * Get property
   * @return property
  **/
  @JsonProperty("property")
  public List<String> getProperty() {
    return property;
  }

  public void setProperty(List<String> property) {
    this.property = property;
  }

  public RequestedPageDetails property(List<String> property) {
    this.property = property;
    return this;
  }

  public RequestedPageDetails addPropertyItem(String propertyItem) {
    this.property.add(propertyItem);
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public RequestedPageDetails type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Get next
   * @return next
  **/
  @JsonProperty("next")
  public Integer getNext() {
    return next;
  }

  public void setNext(Integer next) {
    this.next = next;
  }

  public RequestedPageDetails next(Integer next) {
    this.next = next;
    return this;
  }

 /**
   * Get prev
   * @return prev
  **/
  @JsonProperty("prev")
  public Integer getPrev() {
    return prev;
  }

  public void setPrev(Integer prev) {
    this.prev = prev;
  }

  public RequestedPageDetails prev(Integer prev) {
    this.prev = prev;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

