package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.EnvironmentLogsEmbedded;
import org.openapitools.server.api.model.EnvironmentLogsLinks;

/**
 * Logs of an Environment
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EnvironmentLogs   {
  
  private List<String> service = new ArrayList<>();
  private List<String> name = new ArrayList<>();
  private Integer days;
  private EnvironmentLogsLinks links;
  private EnvironmentLogsEmbedded embedded;

  public EnvironmentLogs () {

  }

  public EnvironmentLogs (List<String> service, List<String> name, Integer days, EnvironmentLogsLinks links, EnvironmentLogsEmbedded embedded) {
    this.service = service;
    this.name = name;
    this.days = days;
    this.links = links;
    this.embedded = embedded;
  }

    
  @JsonProperty("service")
  public List<String> getService() {
    return service;
  }
  public void setService(List<String> service) {
    this.service = service;
  }

    
  @JsonProperty("name")
  public List<String> getName() {
    return name;
  }
  public void setName(List<String> name) {
    this.name = name;
  }

    
  @JsonProperty("days")
  public Integer getDays() {
    return days;
  }
  public void setDays(Integer days) {
    this.days = days;
  }

    
  @JsonProperty("_links")
  public EnvironmentLogsLinks getLinks() {
    return links;
  }
  public void setLinks(EnvironmentLogsLinks links) {
    this.links = links;
  }

    
  @JsonProperty("_embedded")
  public EnvironmentLogsEmbedded getEmbedded() {
    return embedded;
  }
  public void setEmbedded(EnvironmentLogsEmbedded embedded) {
    this.embedded = embedded;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
