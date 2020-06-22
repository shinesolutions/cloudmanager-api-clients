package apimodels;

import apimodels.EnvironmentLog;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * EnvironmentLogsEmbedded
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-22T02:53:34.661Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class EnvironmentLogsEmbedded   {
  @JsonProperty("downloads")
  private List<EnvironmentLog> downloads = null;

  public EnvironmentLogsEmbedded downloads(List<EnvironmentLog> downloads) {
    this.downloads = downloads;
    return this;
  }

  public EnvironmentLogsEmbedded addDownloadsItem(EnvironmentLog downloadsItem) {
    if (downloads == null) {
      downloads = new ArrayList<>();
    }
    downloads.add(downloadsItem);
    return this;
  }

   /**
   * Links to logs
   * @return downloads
  **/
  @Valid
  public List<EnvironmentLog> getDownloads() {
    return downloads;
  }

  public void setDownloads(List<EnvironmentLog> downloads) {
    this.downloads = downloads;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvironmentLogsEmbedded environmentLogsEmbedded = (EnvironmentLogsEmbedded) o;
    return Objects.equals(downloads, environmentLogsEmbedded.downloads);
  }

  @Override
  public int hashCode() {
    return Objects.hash(downloads);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvironmentLogsEmbedded {\n");
    
    sb.append("    downloads: ").append(toIndentedString(downloads)).append("\n");
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

