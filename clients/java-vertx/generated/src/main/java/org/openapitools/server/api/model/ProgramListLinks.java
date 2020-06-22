package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.HalLink;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProgramListLinks   {
  
  private HalLink next;
  private HalLink prev;
  private HalLink self;

  public ProgramListLinks () {

  }

  public ProgramListLinks (HalLink next, HalLink prev, HalLink self) {
    this.next = next;
    this.prev = prev;
    this.self = self;
  }

    
  @JsonProperty("next")
  public HalLink getNext() {
    return next;
  }
  public void setNext(HalLink next) {
    this.next = next;
  }

    
  @JsonProperty("prev")
  public HalLink getPrev() {
    return prev;
  }
  public void setPrev(HalLink prev) {
    this.prev = prev;
  }

    
  @JsonProperty("self")
  public HalLink getSelf() {
    return self;
  }
  public void setSelf(HalLink self) {
    this.self = self;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProgramListLinks programListLinks = (ProgramListLinks) o;
    return Objects.equals(next, programListLinks.next) &&
        Objects.equals(prev, programListLinks.prev) &&
        Objects.equals(self, programListLinks.self);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
