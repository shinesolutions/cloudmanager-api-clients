package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.InvalidParameter;
import org.openapitools.model.MissingParameter;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="A Bad Request response error.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-06-22T02:54:15.715Z[GMT]")
public class BadRequestError   {
  

  private Integer status;

  private String type;

  private String title;

  private List<MissingParameter> missingParams = new ArrayList<MissingParameter>();

  private List<InvalidParameter> invalidParams = new ArrayList<InvalidParameter>();

  /**
   * HTTP status code of the response.
   **/
  
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
  
  @ApiModelProperty(value = "Request's invalid parameters.")
  @JsonProperty("invalidParams")
  public List<InvalidParameter> getInvalidParams() {
    return invalidParams;
  }
  public void setInvalidParams(List<InvalidParameter> invalidParams) {
    this.invalidParams = invalidParams;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BadRequestError badRequestError = (BadRequestError) o;
    return Objects.equals(status, badRequestError.status) &&
        Objects.equals(type, badRequestError.type) &&
        Objects.equals(title, badRequestError.title) &&
        Objects.equals(missingParams, badRequestError.missingParams) &&
        Objects.equals(invalidParams, badRequestError.invalidParams);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

