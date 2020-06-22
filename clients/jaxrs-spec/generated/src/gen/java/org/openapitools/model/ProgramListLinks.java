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
public class ProgramListLinks   {
  
  private @Valid HalLink next;
  private @Valid HalLink prev;
  private @Valid HalLink self;

  /**
   **/
  public ProgramListLinks next(HalLink next) {
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
  public ProgramListLinks prev(HalLink prev) {
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
  public ProgramListLinks self(HalLink self) {
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
    ProgramListLinks programListLinks = (ProgramListLinks) o;
    return Objects.equals(this.next, programListLinks.next) &&
        Objects.equals(this.prev, programListLinks.prev) &&
        Objects.equals(this.self, programListLinks.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(next, prev, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgramListLinks {\n");
    
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
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

