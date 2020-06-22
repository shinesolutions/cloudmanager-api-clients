package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.EnvironmentLog;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2020-06-22T02:54:09.173Z[GMT]")
public class EnvironmentLogsEmbedded   {
  
  private List<EnvironmentLog> downloads = new ArrayList<EnvironmentLog>();

  /**
   * Links to logs
   **/
  
  @ApiModelProperty(value = "Links to logs")
  @JsonProperty("downloads")
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

