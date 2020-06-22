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


package com.shinesolutions.aemcloudmanager4j.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.shinesolutions.aemcloudmanager4j.model.EnvironmentLogLinks;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Log from Environment
 */
@ApiModel(description = "Log from Environment")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-06-22T02:15:07.238Z[GMT]")
public class EnvironmentLog {
  public static final String SERIALIZED_NAME_SERVICE = "service";
  @SerializedName(SERIALIZED_NAME_SERVICE)
  private String service;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date;

  public static final String SERIALIZED_NAME_PROGRAM_ID = "programId";
  @SerializedName(SERIALIZED_NAME_PROGRAM_ID)
  private Long programId;

  public static final String SERIALIZED_NAME_ENVIRONMENT_ID = "environmentId";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT_ID)
  private Long environmentId;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private EnvironmentLogLinks links;


  public EnvironmentLog service(String service) {
    
    this.service = service;
    return this;
  }

   /**
   * Name of the service
   * @return service
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "author", value = "Name of the service")

  public String getService() {
    return service;
  }


  public void setService(String service) {
    this.service = service;
  }


  public EnvironmentLog name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the Log
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "aemerror", value = "Name of the Log")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public EnvironmentLog date(String date) {
    
    this.date = date;
    return this;
  }

   /**
   * date of the Log
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-04-05", value = "date of the Log")

  public String getDate() {
    return date;
  }


  public void setDate(String date) {
    this.date = date;
  }


  public EnvironmentLog programId(Long programId) {
    
    this.programId = programId;
    return this;
  }

   /**
   * Get programId
   * @return programId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getProgramId() {
    return programId;
  }


  public void setProgramId(Long programId) {
    this.programId = programId;
  }


  public EnvironmentLog environmentId(Long environmentId) {
    
    this.environmentId = environmentId;
    return this;
  }

   /**
   * Get environmentId
   * @return environmentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getEnvironmentId() {
    return environmentId;
  }


  public void setEnvironmentId(Long environmentId) {
    this.environmentId = environmentId;
  }


  public EnvironmentLog links(EnvironmentLogLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
    return Objects.equals(this.service, environmentLog.service) &&
        Objects.equals(this.name, environmentLog.name) &&
        Objects.equals(this.date, environmentLog.date) &&
        Objects.equals(this.programId, environmentLog.programId) &&
        Objects.equals(this.environmentId, environmentLog.environmentId) &&
        Objects.equals(this.links, environmentLog.links);
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

