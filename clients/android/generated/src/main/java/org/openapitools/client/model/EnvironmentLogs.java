/**
 * Cloud Manager API
 * This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.EnvironmentLogsEmbedded;
import org.openapitools.client.model.EnvironmentLogsLinks;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Logs of an Environment
 **/
@ApiModel(description = "Logs of an Environment")
public class EnvironmentLogs {
  
  @SerializedName("service")
  private List<String> service = null;
  @SerializedName("name")
  private List<String> name = null;
  @SerializedName("days")
  private Integer days = null;
  @SerializedName("_links")
  private EnvironmentLogsLinks links = null;
  @SerializedName("_embedded")
  private EnvironmentLogsEmbedded embedded = null;

  /**
   * Name of the service
   **/
  @ApiModelProperty(value = "Name of the service")
  public List<String> getService() {
    return service;
  }
  public void setService(List<String> service) {
    this.service = service;
  }

  /**
   * Name of the Log
   **/
  @ApiModelProperty(value = "Name of the Log")
  public List<String> getName() {
    return name;
  }
  public void setName(List<String> name) {
    this.name = name;
  }

  /**
   * Number of days
   **/
  @ApiModelProperty(value = "Number of days")
  public Integer getDays() {
    return days;
  }
  public void setDays(Integer days) {
    this.days = days;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public EnvironmentLogsLinks getLinks() {
    return links;
  }
  public void setLinks(EnvironmentLogsLinks links) {
    this.links = links;
  }

  /**
   **/
  @ApiModelProperty(value = "")
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
    return (this.service == null ? environmentLogs.service == null : this.service.equals(environmentLogs.service)) &&
        (this.name == null ? environmentLogs.name == null : this.name.equals(environmentLogs.name)) &&
        (this.days == null ? environmentLogs.days == null : this.days.equals(environmentLogs.days)) &&
        (this.links == null ? environmentLogs.links == null : this.links.equals(environmentLogs.links)) &&
        (this.embedded == null ? environmentLogs.embedded == null : this.embedded.equals(environmentLogs.embedded));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.service == null ? 0: this.service.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.days == null ? 0: this.days.hashCode());
    result = 31 * result + (this.links == null ? 0: this.links.hashCode());
    result = 31 * result + (this.embedded == null ? 0: this.embedded.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvironmentLogs {\n");
    
    sb.append("  service: ").append(service).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  days: ").append(days).append("\n");
    sb.append("  links: ").append(links).append("\n");
    sb.append("  embedded: ").append(embedded).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
