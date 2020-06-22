package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.EnvironmentLogsEmbedded;
import org.openapitools.model.EnvironmentLogsLinks;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Logs of an Environment")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2020-06-22T02:54:09.173Z[GMT]")
public class EnvironmentLogs   {
  
  private List<String> service = new ArrayList<String>();
  private List<String> name = new ArrayList<String>();
  private Integer days;
  private EnvironmentLogsLinks links;
  private EnvironmentLogsEmbedded embedded;

  /**
   * Name of the service
   **/
  
  @ApiModelProperty(example = "author", value = "Name of the service")
  @JsonProperty("service")
  public List<String> getService() {
    return service;
  }
  public void setService(List<String> service) {
    this.service = service;
  }

  /**
   * Name of the Log
   **/
  
  @ApiModelProperty(example = "aemerror", value = "Name of the Log")
  @JsonProperty("name")
  public List<String> getName() {
    return name;
  }
  public void setName(List<String> name) {
    this.name = name;
  }

  /**
   * Number of days
   **/
  
  @ApiModelProperty(example = "2", value = "Number of days")
  @JsonProperty("days")
  public Integer getDays() {
    return days;
  }
  public void setDays(Integer days) {
    this.days = days;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("_links")
  public EnvironmentLogsLinks getLinks() {
    return links;
  }
  public void setLinks(EnvironmentLogsLinks links) {
    this.links = links;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("_embedded")
  public EnvironmentLogsEmbedded getEmbedded() {
    return embedded;
  }
  public void setEmbedded(EnvironmentLogsEmbedded embedded) {
    this.embedded = embedded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvironmentLogs environmentLogs = (EnvironmentLogs) o;
    return Objects.equals(service, environmentLogs.service) &&
        Objects.equals(name, environmentLogs.name) &&
        Objects.equals(days, environmentLogs.days) &&
        Objects.equals(links, environmentLogs.links) &&
        Objects.equals(embedded, environmentLogs.embedded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(service, name, days, links, embedded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvironmentLogs {\n");
    
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    embedded: ").append(toIndentedString(embedded)).append("\n");
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

