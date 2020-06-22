package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Filtering and sorting page details
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RequestedPageDetails   {
  
  private Integer start;
  private Integer limit;
  private String orderBy;
  private List<String> property = new ArrayList<>();
  private String type;
  private Integer next;
  private Integer prev;

  public RequestedPageDetails () {

  }

  public RequestedPageDetails (Integer start, Integer limit, String orderBy, List<String> property, String type, Integer next, Integer prev) {
    this.start = start;
    this.limit = limit;
    this.orderBy = orderBy;
    this.property = property;
    this.type = type;
    this.next = next;
    this.prev = prev;
  }

    
  @JsonProperty("start")
  public Integer getStart() {
    return start;
  }
  public void setStart(Integer start) {
    this.start = start;
  }

    
  @JsonProperty("limit")
  public Integer getLimit() {
    return limit;
  }
  public void setLimit(Integer limit) {
    this.limit = limit;
  }

    
  @JsonProperty("orderBy")
  public String getOrderBy() {
    return orderBy;
  }
  public void setOrderBy(String orderBy) {
    this.orderBy = orderBy;
  }

    
  @JsonProperty("property")
  public List<String> getProperty() {
    return property;
  }
  public void setProperty(List<String> property) {
    this.property = property;
  }

    
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

    
  @JsonProperty("next")
  public Integer getNext() {
    return next;
  }
  public void setNext(Integer next) {
    this.next = next;
  }

    
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
