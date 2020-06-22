package apimodels;

import apimodels.EnvironmentLogsEmbedded;
import apimodels.EnvironmentLogsLinks;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * Logs of an Environment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-22T02:53:34.661Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class EnvironmentLogs   {
  @JsonProperty("service")
  private List<String> service = null;

  @JsonProperty("name")
  private List<String> name = null;

  @JsonProperty("days")
  private Integer days;

  @JsonProperty("_links")
  private EnvironmentLogsLinks links;

  @JsonProperty("_embedded")
  private EnvironmentLogsEmbedded embedded;

  public EnvironmentLogs service(List<String> service) {
    this.service = service;
    return this;
  }

  public EnvironmentLogs addServiceItem(String serviceItem) {
    if (service == null) {
      service = new ArrayList<>();
    }
    service.add(serviceItem);
    return this;
  }

   /**
   * Name of the service
   * @return service
  **/
    public List<String> getService() {
    return service;
  }

  public void setService(List<String> service) {
    this.service = service;
  }

  public EnvironmentLogs name(List<String> name) {
    this.name = name;
    return this;
  }

  public EnvironmentLogs addNameItem(String nameItem) {
    if (name == null) {
      name = new ArrayList<>();
    }
    name.add(nameItem);
    return this;
  }

   /**
   * Name of the Log
   * @return name
  **/
    public List<String> getName() {
    return name;
  }

  public void setName(List<String> name) {
    this.name = name;
  }

  public EnvironmentLogs days(Integer days) {
    this.days = days;
    return this;
  }

   /**
   * Number of days
   * @return days
  **/
    public Integer getDays() {
    return days;
  }

  public void setDays(Integer days) {
    this.days = days;
  }

  public EnvironmentLogs links(EnvironmentLogsLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @Valid
  public EnvironmentLogsLinks getLinks() {
    return links;
  }

  public void setLinks(EnvironmentLogsLinks links) {
    this.links = links;
  }

  public EnvironmentLogs embedded(EnvironmentLogsEmbedded embedded) {
    this.embedded = embedded;
    return this;
  }

   /**
   * Get embedded
   * @return embedded
  **/
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

