package apimodels;

import apimodels.HalLink;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ProgramListLinks
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-22T02:53:34.661Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ProgramListLinks   {
  @JsonProperty("next")
  private HalLink next;

  @JsonProperty("prev")
  private HalLink prev;

  @JsonProperty("self")
  private HalLink self;

  public ProgramListLinks next(HalLink next) {
    this.next = next;
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @Valid
  public HalLink getNext() {
    return next;
  }

  public void setNext(HalLink next) {
    this.next = next;
  }

  public ProgramListLinks prev(HalLink prev) {
    this.prev = prev;
    return this;
  }

   /**
   * Get prev
   * @return prev
  **/
  @Valid
  public HalLink getPrev() {
    return prev;
  }

  public void setPrev(HalLink prev) {
    this.prev = prev;
  }

  public ProgramListLinks self(HalLink self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @Valid
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
    return Objects.equals(next, programListLinks.next) &&
        Objects.equals(prev, programListLinks.prev) &&
        Objects.equals(self, programListLinks.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(next, prev, self);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

