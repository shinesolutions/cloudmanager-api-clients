package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.InvalidParameter;
import org.openapitools.model.MissingParameter;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * A Bad Request response error.
 **/
@ApiModel(description = "A Bad Request response error.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2020-06-22T02:54:21.117Z[GMT]")
public class BadRequestError   {
  
  private @Valid Integer status;
  private @Valid String type;
  private @Valid String title;
  private @Valid List<MissingParameter> missingParams = new ArrayList<MissingParameter>();
  private @Valid List<InvalidParameter> invalidParams = new ArrayList<InvalidParameter>();

  /**
   * HTTP status code of the response.
   **/
  public BadRequestError status(Integer status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "HTTP status code of the response.")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  /**
   * Error type identifier.
   **/
  public BadRequestError type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "http://ns.adobe.com/adobecloud/error", value = "Error type identifier.")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * A short summary of the error.
   **/
  public BadRequestError title(String title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(example = "Validation failed", value = "A short summary of the error.")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Request&#39;s missing parameters.
   **/
  public BadRequestError missingParams(List<MissingParameter> missingParams) {
    this.missingParams = missingParams;
    return this;
  }

  
  @ApiModelProperty(value = "Request's missing parameters.")
  @JsonProperty("missingParams")
  public List<MissingParameter> getMissingParams() {
    return missingParams;
  }
  public void setMissingParams(List<MissingParameter> missingParams) {
    this.missingParams = missingParams;
  }

  /**
   * Request&#39;s invalid parameters.
   **/
  public BadRequestError invalidParams(List<InvalidParameter> invalidParams) {
    this.invalidParams = invalidParams;
    return this;
  }

  
  @ApiModelProperty(value = "Request's invalid parameters.")
  @JsonProperty("invalidParams")
  public List<InvalidParameter> getInvalidParams() {
    return invalidParams;
  }
  public void setInvalidParams(List<InvalidParameter> invalidParams) {
    this.invalidParams = invalidParams;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BadRequestError badRequestError = (BadRequestError) o;
    return Objects.equals(this.status, badRequestError.status) &&
        Objects.equals(this.type, badRequestError.type) &&
        Objects.equals(this.title, badRequestError.title) &&
        Objects.equals(this.missingParams, badRequestError.missingParams) &&
        Objects.equals(this.invalidParams, badRequestError.invalidParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, type, title, missingParams, invalidParams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BadRequestError {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    missingParams: ").append(toIndentedString(missingParams)).append("\n");
    sb.append("    invalidParams: ").append(toIndentedString(invalidParams)).append("\n");
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

