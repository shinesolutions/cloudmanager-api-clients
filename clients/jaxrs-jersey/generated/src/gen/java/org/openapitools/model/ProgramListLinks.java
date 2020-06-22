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
import org.openapitools.model.HalLink;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * ProgramListLinks
 */
@JsonPropertyOrder({
  ProgramListLinks.JSON_PROPERTY_NEXT,
  ProgramListLinks.JSON_PROPERTY_PREV,
  ProgramListLinks.JSON_PROPERTY_SELF
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-06-22T02:54:02.008Z[GMT]")
public class ProgramListLinks   {
  public static final String JSON_PROPERTY_NEXT = "next";
  @JsonProperty(JSON_PROPERTY_NEXT)
  private HalLink next;

  public static final String JSON_PROPERTY_PREV = "prev";
  @JsonProperty(JSON_PROPERTY_PREV)
  private HalLink prev;

  public static final String JSON_PROPERTY_SELF = "self";
  @JsonProperty(JSON_PROPERTY_SELF)
  private HalLink self;

  public ProgramListLinks next(HalLink next) {
    this.next = next;
    return this;
  }

  /**
   * Get next
   * @return next
   **/
  @JsonProperty("next")
  @ApiModelProperty(value = "")
  @Valid 
  public HalLink getNext() {
    return next;
  }

  public void setNext(HalLink next) {
    this.next = next;
  }

  public ProgramListLinks prev(HalLink prev) {
    this.prev = prev;
    return this;
  }

  /**
   * Get prev
   * @return prev
   **/
  @JsonProperty("prev")
  @ApiModelProperty(value = "")
  @Valid 
  public HalLink getPrev() {
    return prev;
  }

  public void setPrev(HalLink prev) {
    this.prev = prev;
  }

  public ProgramListLinks self(HalLink self) {
    this.self = self;
    return this;
  }

  /**
   * Get self
   * @return self
   **/
  @JsonProperty("self")
  @ApiModelProperty(value = "")
  @Valid 
  public HalLink getSelf() {
    return self;
  }

  public void setSelf(HalLink self) {
    this.self = self;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProgramListLinks programListLinks = (ProgramListLinks) o;
    return Objects.equals(this.next, programListLinks.next) &&
        Objects.equals(this.prev, programListLinks.prev) &&
        Objects.equals(this.self, programListLinks.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(next, prev, self);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgramListLinks {\n");
    
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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

