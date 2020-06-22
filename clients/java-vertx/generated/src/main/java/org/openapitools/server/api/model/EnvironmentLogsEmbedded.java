package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.EnvironmentLog;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EnvironmentLogsEmbedded   {
  
  private List<EnvironmentLog> downloads = new ArrayList<>();

  public EnvironmentLogsEmbedded () {

  }

  public EnvironmentLogsEmbedded (List<EnvironmentLog> downloads) {
    this.downloads = downloads;
  }

    
  @JsonProperty("downloads")
  public List<EnvironmentLog> getDownloads() {
    return downloads;
  }
  public void setDownloads(List<EnvironmentLog> downloads) {
    this.downloads = downloads;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
