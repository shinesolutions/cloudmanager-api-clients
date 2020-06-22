package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.EnvironmentLogLinks;

/**
 * Log from Environment
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EnvironmentLog   {
  
  private String service;
  private String name;
  private String date;
  private Long programId;
  private Long environmentId;
  private EnvironmentLogLinks links;

  public EnvironmentLog () {

  }

  public EnvironmentLog (String service, String name, String date, Long programId, Long environmentId, EnvironmentLogLinks links) {
    this.service = service;
    this.name = name;
    this.date = date;
    this.programId = programId;
    this.environmentId = environmentId;
    this.links = links;
  }

    
  @JsonProperty("service")
  public String getService() {
    return service;
  }
  public void setService(String service) {
    this.service = service;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("date")
  public String getDate() {
    return date;
  }
  public void setDate(String date) {
    this.date = date;
  }

    
  @JsonProperty("programId")
  public Long getProgramId() {
    return programId;
  }
  public void setProgramId(Long programId) {
    this.programId = programId;
  }

    
  @JsonProperty("environmentId")
  public Long getEnvironmentId() {
    return environmentId;
  }
  public void setEnvironmentId(Long environmentId) {
    this.environmentId = environmentId;
  }

    
  @JsonProperty("_links")
  public EnvironmentLogLinks getLinks() {
    return links;
  }
  public void setLinks(EnvironmentLogLinks links) {
    this.links = links;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvironmentLog environmentLog = (EnvironmentLog) o;
    return Objects.equals(service, environmentLog.service) &&
        Objects.equals(name, environmentLog.name) &&
        Objects.equals(date, environmentLog.date) &&
        Objects.equals(programId, environmentLog.programId) &&
        Objects.equals(environmentId, environmentLog.environmentId) &&
        Objects.equals(links, environmentLog.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(service, name, date, programId, environmentId, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvironmentLog {\n");
    
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    programId: ").append(toIndentedString(programId)).append("\n");
    sb.append("    environmentId: ").append(toIndentedString(environmentId)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
