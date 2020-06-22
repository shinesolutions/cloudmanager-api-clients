package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.EnvironmentLogsEmbedded;
import org.openapitools.model.EnvironmentLogsLinks;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Logs of an Environment
 **/
@ApiModel(description="Logs of an Environment")
public class EnvironmentLogs  {
  
  @ApiModelProperty(example = "author", value = "Name of the service")
 /**
   * Name of the service
  **/
  private List<String> service = null;

  @ApiModelProperty(example = "aemerror", value = "Name of the Log")
 /**
   * Name of the Log
  **/
  private List<String> name = null;

  @ApiModelProperty(example = "2", value = "Number of days")
 /**
   * Number of days
  **/
  private Integer days;

  @ApiModelProperty(value = "")
  @Valid
  private EnvironmentLogsLinks links;

  @ApiModelProperty(value = "")
  @Valid
  private EnvironmentLogsEmbedded embedded;
 /**
   * Name of the service
   * @return service
  **/
  @JsonProperty("service")
  public List<String> getService() {
    return service;
  }

  public void setService(List<String> service) {
    this.service = service;
  }

  public EnvironmentLogs service(List<String> service) {
    this.service = service;
    return this;
  }

  public EnvironmentLogs addServiceItem(String serviceItem) {
    this.service.add(serviceItem);
    return this;
  }

 /**
   * Name of the Log
   * @return name
  **/
  @JsonProperty("name")
  public List<String> getName() {
    return name;
  }

  public void setName(List<String> name) {
    this.name = name;
  }

  public EnvironmentLogs name(List<String> name) {
    this.name = name;
    return this;
  }

  public EnvironmentLogs addNameItem(String nameItem) {
    this.name.add(nameItem);
    return this;
  }

 /**
   * Number of days
   * @return days
  **/
  @JsonProperty("days")
  public Integer getDays() {
    return days;
  }

  public void setDays(Integer days) {
    this.days = days;
  }

  public EnvironmentLogs days(Integer days) {
    this.days = days;
    return this;
  }

 /**
   * Get links
   * @return links
  **/
  @JsonProperty("_links")
  public EnvironmentLogsLinks getLinks() {
    return links;
  }

  public void setLinks(EnvironmentLogsLinks links) {
    this.links = links;
  }

  public EnvironmentLogs links(EnvironmentLogsLinks links) {
    this.links = links;
    return this;
  }

 /**
   * Get embedded
   * @return embedded
  **/
  @JsonProperty("_embedded")
  public EnvironmentLogsEmbedded getEmbedded() {
    return embedded;
  }

  public void setEmbedded(EnvironmentLogsEmbedded embedded) {
    this.embedded = embedded;
  }

  public EnvironmentLogs embedded(EnvironmentLogsEmbedded embedded) {
    this.embedded = embedded;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

