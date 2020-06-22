package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.EnvironmentLogLinks;
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
  * Log from Environment
 **/
@ApiModel(description="Log from Environment")
public class EnvironmentLog  {
  
  @ApiModelProperty(example = "author", value = "Name of the service")
 /**
   * Name of the service
  **/
  private String service;

  @ApiModelProperty(example = "aemerror", value = "Name of the Log")
 /**
   * Name of the Log
  **/
  private String name;

  @ApiModelProperty(example = "2019-04-05", value = "date of the Log")
 /**
   * date of the Log
  **/
  private String date;

  @ApiModelProperty(value = "")
  private Long programId;

  @ApiModelProperty(value = "")
  private Long environmentId;

  @ApiModelProperty(value = "")
  @Valid
  private EnvironmentLogLinks links;
 /**
   * Name of the service
   * @return service
  **/
  @JsonProperty("service")
  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  public EnvironmentLog service(String service) {
    this.service = service;
    return this;
  }

 /**
   * Name of the Log
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EnvironmentLog name(String name) {
    this.name = name;
    return this;
  }

 /**
   * date of the Log
   * @return date
  **/
  @JsonProperty("date")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public EnvironmentLog date(String date) {
    this.date = date;
    return this;
  }

 /**
   * Get programId
   * @return programId
  **/
  @JsonProperty("programId")
  public Long getProgramId() {
    return programId;
  }

  public void setProgramId(Long programId) {
    this.programId = programId;
  }

  public EnvironmentLog programId(Long programId) {
    this.programId = programId;
    return this;
  }

 /**
   * Get environmentId
   * @return environmentId
  **/
  @JsonProperty("environmentId")
  public Long getEnvironmentId() {
    return environmentId;
  }

  public void setEnvironmentId(Long environmentId) {
    this.environmentId = environmentId;
  }

  public EnvironmentLog environmentId(Long environmentId) {
    this.environmentId = environmentId;
    return this;
  }

 /**
   * Get links
   * @return links
  **/
  @JsonProperty("_links")
  public EnvironmentLogLinks getLinks() {
    return links;
  }

  public void setLinks(EnvironmentLogLinks links) {
    this.links = links;
  }

  public EnvironmentLog links(EnvironmentLogLinks links) {
    this.links = links;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

