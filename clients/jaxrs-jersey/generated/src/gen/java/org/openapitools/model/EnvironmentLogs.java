/*
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


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.EnvironmentLogsEmbedded;
import org.openapitools.model.EnvironmentLogsLinks;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Logs of an Environment
 */
@ApiModel(description = "Logs of an Environment")
@JsonPropertyOrder({
  EnvironmentLogs.JSON_PROPERTY_SERVICE,
  EnvironmentLogs.JSON_PROPERTY_NAME,
  EnvironmentLogs.JSON_PROPERTY_DAYS,
  EnvironmentLogs.JSON_PROPERTY_LINKS,
  EnvironmentLogs.JSON_PROPERTY_EMBEDDED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-06-22T02:54:02.008Z[GMT]")
public class EnvironmentLogs   {
  public static final String JSON_PROPERTY_SERVICE = "service";
  @JsonProperty(JSON_PROPERTY_SERVICE)
  private List<String> service = null;

  public static final String JSON_PROPERTY_NAME = "name";
  @JsonProperty(JSON_PROPERTY_NAME)
  private List<String> name = null;

  public static final String JSON_PROPERTY_DAYS = "days";
  @JsonProperty(JSON_PROPERTY_DAYS)
  private Integer days;

  public static final String JSON_PROPERTY_LINKS = "_links";
  @JsonProperty(JSON_PROPERTY_LINKS)
  private EnvironmentLogsLinks links;

  public static final String JSON_PROPERTY_EMBEDDED = "_embedded";
  @JsonProperty(JSON_PROPERTY_EMBEDDED)
  private EnvironmentLogsEmbedded embedded;

  public EnvironmentLogs service(List<String> service) {
    this.service = service;
    return this;
  }

  public EnvironmentLogs addServiceItem(String serviceItem) {
    if (this.service == null) {
      this.service = new ArrayList<String>();
    }
    this.service.add(serviceItem);
    return this;
  }

  /**
   * Name of the service
   * @return service
   **/
  @JsonProperty("service")
  @ApiModelProperty(example = "author", value = "Name of the service")
  
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
    if (this.name == null) {
      this.name = new ArrayList<String>();
    }
    this.name.add(nameItem);
    return this;
  }

  /**
   * Name of the Log
   * @return name
   **/
  @JsonProperty("name")
  @ApiModelProperty(example = "aemerror", value = "Name of the Log")
  
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
  @JsonProperty("days")
  @ApiModelProperty(example = "2", value = "Number of days")
  
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
  @JsonProperty("_links")
  @ApiModelProperty(value = "")
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
  @JsonProperty("_embedded")
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.service, environmentLogs.service) &&
        Objects.equals(this.name, environmentLogs.name) &&
        Objects.equals(this.days, environmentLogs.days) &&
        Objects.equals(this.links, environmentLogs.links) &&
        Objects.equals(this.embedded, environmentLogs.embedded);
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

