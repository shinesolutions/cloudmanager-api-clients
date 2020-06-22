package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.EnvironmentLogLinks;
import javax.validation.constraints.*;

/**
 * Log from Environment
 **/

import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;

@ApiModel(description = "Log from Environment")
public class EnvironmentLog   {
  
  private String service;

  private String name;

  private String date;

  private Long programId;

  private Long environmentId;

  private EnvironmentLogLinks links;


  /**
   * Name of the service
   **/
  public EnvironmentLog service(String service) {
    this.service = service;
    return this;
  }

  
  @ApiModelProperty(example = "author", value = "Name of the service")
  @JsonProperty("service")
  public String getService() {
    return service;
  }
  public void setService(String service) {
    this.service = service;
  }


  /**
   * Name of the Log
   **/
  public EnvironmentLog name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "aemerror", value = "Name of the Log")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * date of the Log
   **/
  public EnvironmentLog date(String date) {
    this.date = date;
    return this;
  }

  
  @ApiModelProperty(example = "2019-04-05", value = "date of the Log")
  @JsonProperty("date")
  public String getDate() {
    return date;
  }
  public void setDate(String date) {
    this.date = date;
  }


  /**
   **/
  public EnvironmentLog programId(Long programId) {
    this.programId = programId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("programId")
  public Long getProgramId() {
    return programId;
  }
  public void setProgramId(Long programId) {
    this.programId = programId;
  }


  /**
   **/
  public EnvironmentLog environmentId(Long environmentId) {
    this.environmentId = environmentId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("environmentId")
  public Long getEnvironmentId() {
    return environmentId;
  }
  public void setEnvironmentId(Long environmentId) {
    this.environmentId = environmentId;
  }


  /**
   **/
  public EnvironmentLog links(EnvironmentLogLinks links) {
    this.links = links;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("_links")
  public EnvironmentLogLinks getLinks() {
    return links;
  }
  public void setLinks(EnvironmentLogLinks links) {
    this.links = links;
  }



  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

