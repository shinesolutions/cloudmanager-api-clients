package org.openapitools.model;

import org.openapitools.model.HalLink;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PipelineExecutionListRepresentationLinks  {
  
  @ApiModelProperty(value = "")
  private HalLink next;

  @ApiModelProperty(value = "")
  private HalLink page;

  @ApiModelProperty(value = "")
  private HalLink prev;

  @ApiModelProperty(value = "")
  private HalLink self;
 /**
   * Get next
   * @return next
  **/
  @JsonProperty("next")
  public HalLink getNext() {
    return next;
  }

  public void setNext(HalLink next) {
    this.next = next;
  }

  public PipelineExecutionListRepresentationLinks next(HalLink next) {
    this.next = next;
    return this;
  }

 /**
   * Get page
   * @return page
  **/
  @JsonProperty("page")
  public HalLink getPage() {
    return page;
  }

  public void setPage(HalLink page) {
    this.page = page;
  }

  public PipelineExecutionListRepresentationLinks page(HalLink page) {
    this.page = page;
    return this;
  }

 /**
   * Get prev
   * @return prev
  **/
  @JsonProperty("prev")
  public HalLink getPrev() {
    return prev;
  }

  public void setPrev(HalLink prev) {
    this.prev = prev;
  }

  public PipelineExecutionListRepresentationLinks prev(HalLink prev) {
    this.prev = prev;
    return this;
  }

 /**
   * Get self
   * @return self
  **/
  @JsonProperty("self")
  public HalLink getSelf() {
    return self;
  }

  public void setSelf(HalLink self) {
    this.self = self;
  }

  public PipelineExecutionListRepresentationLinks self(HalLink self) {
    this.self = self;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineExecutionListRepresentationLinks {\n");
    
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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

