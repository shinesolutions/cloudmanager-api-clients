package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.InvalidParameter;
import org.openapitools.model.MissingParameter;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A Bad Request response error.
 */
@ApiModel(description = "A Bad Request response error.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-06-22T02:57:04.825Z[GMT]")

public class BadRequestError   {
  @JsonProperty("status")
  private Integer status;

  @JsonProperty("type")
  private String type;

  @JsonProperty("title")
  private String title;

  @JsonProperty("missingParams")
  @Valid
  private List<MissingParameter> missingParams = null;

  @JsonProperty("invalidParams")
  @Valid
  private List<InvalidParameter> invalidParams = null;

  public BadRequestError status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * HTTP status code of the response.
   * @return status
  */
  @ApiModelProperty(value = "HTTP status code of the response.")


  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public BadRequestError type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Error type identifier.
   * @return type
  */
  @ApiModelProperty(example = "http://ns.adobe.com/adobecloud/error", value = "Error type identifier.")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public BadRequestError title(String title) {
    this.title = title;
    return this;
  }

  /**
   * A short summary of the error.
   * @return title
  */
  @ApiModelProperty(example = "Validation failed", value = "A short summary of the error.")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public BadRequestError missingParams(List<MissingParameter> missingParams) {
    this.missingParams = missingParams;
    return this;
  }

  public BadRequestError addMissingParamsItem(MissingParameter missingParamsItem) {
    if (this.missingParams == null) {
      this.missingParams = new ArrayList<>();
    }
    this.missingParams.add(missingParamsItem);
    return this;
  }

  /**
   * Request's missing parameters.
   * @return missingParams
  */
  @ApiModelProperty(value = "Request's missing parameters.")

  @Valid

  public List<MissingParameter> getMissingParams() {
    return missingParams;
  }

  public void setMissingParams(List<MissingParameter> missingParams) {
    this.missingParams = missingParams;
  }

  public BadRequestError invalidParams(List<InvalidParameter> invalidParams) {
    this.invalidParams = invalidParams;
    return this;
  }

  public BadRequestError addInvalidParamsItem(InvalidParameter invalidParamsItem) {
    if (this.invalidParams == null) {
      this.invalidParams = new ArrayList<>();
    }
    this.invalidParams.add(invalidParamsItem);
    return this;
  }

  /**
   * Request's invalid parameters.
   * @return invalidParams
  */
  @ApiModelProperty(value = "Request's invalid parameters.")

  @Valid

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

