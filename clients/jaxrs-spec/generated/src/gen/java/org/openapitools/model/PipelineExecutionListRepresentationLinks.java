package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.HalLink;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2020-06-22T02:54:21.117Z[GMT]")
public class PipelineExecutionListRepresentationLinks   {
  
  private @Valid HalLink next;
  private @Valid HalLink page;
  private @Valid HalLink prev;
  private @Valid HalLink self;

  /**
   **/
  public PipelineExecutionListRepresentationLinks next(HalLink next) {
    this.next = next;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("next")
  public HalLink getNext() {
    return next;
  }
  public void setNext(HalLink next) {
    this.next = next;
  }

  /**
   **/
  public PipelineExecutionListRepresentationLinks page(HalLink page) {
    this.page = page;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("page")
  public HalLink getPage() {
    return page;
  }
  public void setPage(HalLink page) {
    this.page = page;
  }

  /**
   **/
  public PipelineExecutionListRepresentationLinks prev(HalLink prev) {
    this.prev = prev;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("prev")
  public HalLink getPrev() {
    return prev;
  }
  public void setPrev(HalLink prev) {
    this.prev = prev;
  }

  /**
   **/
  public PipelineExecutionListRepresentationLinks self(HalLink self) {
    this.self = self;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("self")
  public HalLink getSelf() {
    return self;
  }
  public void setSelf(HalLink self) {
    this.self = self;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PipelineExecutionListRepresentationLinks pipelineExecutionListRepresentationLinks = (PipelineExecutionListRepresentationLinks) o;
    return Objects.equals(this.next, pipelineExecutionListRepresentationLinks.next) &&
        Objects.equals(this.page, pipelineExecutionListRepresentationLinks.page) &&
        Objects.equals(this.prev, pipelineExecutionListRepresentationLinks.prev) &&
        Objects.equals(this.self, pipelineExecutionListRepresentationLinks.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(next, page, prev, self);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

