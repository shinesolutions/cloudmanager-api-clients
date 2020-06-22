package apimodels;

import apimodels.PipelineExecutionListRepresentationEmbedded;
import apimodels.PipelineExecutionListRepresentationLinks;
import apimodels.RequestedPageDetails;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * List of pipeline executions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-22T02:53:34.661Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PipelineExecutionListRepresentation   {
  @JsonProperty("_totalNumberOfItems")
  private Integer totalNumberOfItems;

  @JsonProperty("_page")
  private RequestedPageDetails page;

  @JsonProperty("_embedded")
  private PipelineExecutionListRepresentationEmbedded embedded;

  @JsonProperty("_links")
  private PipelineExecutionListRepresentationLinks links;

  public PipelineExecutionListRepresentation totalNumberOfItems(Integer totalNumberOfItems) {
    this.totalNumberOfItems = totalNumberOfItems;
    return this;
  }

   /**
   * Get totalNumberOfItems
   * @return totalNumberOfItems
  **/
    public Integer getTotalNumberOfItems() {
    return totalNumberOfItems;
  }

  public void setTotalNumberOfItems(Integer totalNumberOfItems) {
    this.totalNumberOfItems = totalNumberOfItems;
  }

  public PipelineExecutionListRepresentation page(RequestedPageDetails page) {
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @Valid
  public RequestedPageDetails getPage() {
    return page;
  }

  public void setPage(RequestedPageDetails page) {
    this.page = page;
  }

  public PipelineExecutionListRepresentation embedded(PipelineExecutionListRepresentationEmbedded embedded) {
    this.embedded = embedded;
    return this;
  }

   /**
   * Get embedded
   * @return embedded
  **/
  @Valid
  public PipelineExecutionListRepresentationEmbedded getEmbedded() {
    return embedded;
  }

  public void setEmbedded(PipelineExecutionListRepresentationEmbedded embedded) {
    this.embedded = embedded;
  }

  public PipelineExecutionListRepresentation links(PipelineExecutionListRepresentationLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @Valid
  public PipelineExecutionListRepresentationLinks getLinks() {
    return links;
  }

  public void setLinks(PipelineExecutionListRepresentationLinks links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PipelineExecutionListRepresentation pipelineExecutionListRepresentation = (PipelineExecutionListRepresentation) o;
    return Objects.equals(totalNumberOfItems, pipelineExecutionListRepresentation.totalNumberOfItems) &&
        Objects.equals(page, pipelineExecutionListRepresentation.page) &&
        Objects.equals(embedded, pipelineExecutionListRepresentation.embedded) &&
        Objects.equals(links, pipelineExecutionListRepresentation.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalNumberOfItems, page, embedded, links);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineExecutionListRepresentation {\n");
    
    sb.append("    totalNumberOfItems: ").append(toIndentedString(totalNumberOfItems)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    embedded: ").append(toIndentedString(embedded)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

