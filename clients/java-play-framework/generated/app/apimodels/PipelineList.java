package apimodels;

import apimodels.PipelineListEmbedded;
import apimodels.ProgramListLinks;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * PipelineList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-22T02:53:34.661Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PipelineList   {
  @JsonProperty("_totalNumberOfItems")
  private Integer totalNumberOfItems;

  @JsonProperty("_embedded")
  private PipelineListEmbedded embedded;

  @JsonProperty("_links")
  private ProgramListLinks links;

  public PipelineList totalNumberOfItems(Integer totalNumberOfItems) {
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

  public PipelineList embedded(PipelineListEmbedded embedded) {
    this.embedded = embedded;
    return this;
  }

   /**
   * Get embedded
   * @return embedded
  **/
  @Valid
  public PipelineListEmbedded getEmbedded() {
    return embedded;
  }

  public void setEmbedded(PipelineListEmbedded embedded) {
    this.embedded = embedded;
  }

  public PipelineList links(ProgramListLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @Valid
  public ProgramListLinks getLinks() {
    return links;
  }

  public void setLinks(ProgramListLinks links) {
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
    PipelineList pipelineList = (PipelineList) o;
    return Objects.equals(totalNumberOfItems, pipelineList.totalNumberOfItems) &&
        Objects.equals(embedded, pipelineList.embedded) &&
        Objects.equals(links, pipelineList.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalNumberOfItems, embedded, links);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineList {\n");
    
    sb.append("    totalNumberOfItems: ").append(toIndentedString(totalNumberOfItems)).append("\n");
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

