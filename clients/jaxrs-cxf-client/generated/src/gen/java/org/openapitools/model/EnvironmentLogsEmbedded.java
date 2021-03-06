package org.openapitools.model;

import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.EnvironmentLog;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EnvironmentLogsEmbedded  {
  
  @ApiModelProperty(value = "Links to logs")
 /**
   * Links to logs
  **/
  private List<EnvironmentLog> downloads = null;
 /**
   * Links to logs
   * @return downloads
  **/
  @JsonProperty("downloads")
  public List<EnvironmentLog> getDownloads() {
    return downloads;
  }

  public void setDownloads(List<EnvironmentLog> downloads) {
    this.downloads = downloads;
  }

  public EnvironmentLogsEmbedded downloads(List<EnvironmentLog> downloads) {
    this.downloads = downloads;
    return this;
  }

  public EnvironmentLogsEmbedded addDownloadsItem(EnvironmentLog downloadsItem) {
    this.downloads.add(downloadsItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

