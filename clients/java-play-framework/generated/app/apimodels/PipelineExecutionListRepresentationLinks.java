package apimodels;

import apimodels.HalLink;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * PipelineExecutionListRepresentationLinks
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-22T02:53:34.661Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PipelineExecutionListRepresentationLinks   {
  @JsonProperty("next")
  private HalLink next;

  @JsonProperty("page")
  private HalLink page;

  @JsonProperty("prev")
  private HalLink prev;

  @JsonProperty("self")
  private HalLink self;

  public PipelineExecutionListRepresentationLinks next(HalLink next) {
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

  public PipelineExecutionListRepresentationLinks page(HalLink page) {
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @Valid
  public HalLink getPage() {
    return page;
  }

  public void setPage(HalLink page) {
    this.page = page;
  }

  public PipelineExecutionListRepresentationLinks prev(HalLink prev) {
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

  public PipelineExecutionListRepresentationLinks self(HalLink self) {
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
    PipelineExecutionListRepresentationLinks pipelineExecutionListRepresentationLinks = (PipelineExecutionListRepresentationLinks) o;
    return Objects.equals(next, pipelineExecutionListRepresentationLinks.next) &&
        Objects.equals(page, pipelineExecutionListRepresentationLinks.page) &&
        Objects.equals(prev, pipelineExecutionListRepresentationLinks.prev) &&
        Objects.equals(self, pipelineExecutionListRepresentationLinks.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(next, page, prev, self);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

