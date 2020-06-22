package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.InvalidParameter;
import org.openapitools.model.MissingParameter;
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
  * A Bad Request response error.
 **/
@ApiModel(description="A Bad Request response error.")
public class BadRequestError  {
  
  @ApiModelProperty(value = "HTTP status code of the response.")
 /**
   * HTTP status code of the response.
  **/
  private Integer status;

  @ApiModelProperty(example = "http://ns.adobe.com/adobecloud/error", value = "Error type identifier.")
 /**
   * Error type identifier.
  **/
  private String type;

  @ApiModelProperty(example = "Validation failed", value = "A short summary of the error.")
 /**
   * A short summary of the error.
  **/
  private String title;

  @ApiModelProperty(value = "Request's missing parameters.")
  @Valid
 /**
   * Request's missing parameters.
  **/
  private List<MissingParameter> missingParams = null;

  @ApiModelProperty(value = "Request's invalid parameters.")
  @Valid
 /**
   * Request's invalid parameters.
  **/
  private List<InvalidParameter> invalidParams = null;
 /**
   * HTTP status code of the response.
   * @return status
  **/
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public BadRequestError status(Integer status) {
    this.status = status;
    return this;
  }

 /**
   * Error type identifier.
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public BadRequestError type(String type) {
    this.type = type;
    return this;
  }

 /**
   * A short summary of the error.
   * @return title
  **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public BadRequestError title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Request&#39;s missing parameters.
   * @return missingParams
  **/
  @JsonProperty("missingParams")
  public List<MissingParameter> getMissingParams() {
    return missingParams;
  }

  public void setMissingParams(List<MissingParameter> missingParams) {
    this.missingParams = missingParams;
  }

  public BadRequestError missingParams(List<MissingParameter> missingParams) {
    this.missingParams = missingParams;
    return this;
  }

  public BadRequestError addMissingParamsItem(MissingParameter missingParamsItem) {
    this.missingParams.add(missingParamsItem);
    return this;
  }

 /**
   * Request&#39;s invalid parameters.
   * @return invalidParams
  **/
  @JsonProperty("invalidParams")
  public List<InvalidParameter> getInvalidParams() {
    return invalidParams;
  }

  public void setInvalidParams(List<InvalidParameter> invalidParams) {
    this.invalidParams = invalidParams;
  }

  public BadRequestError invalidParams(List<InvalidParameter> invalidParams) {
    this.invalidParams = invalidParams;
    return this;
  }

  public BadRequestError addInvalidParamsItem(InvalidParameter invalidParamsItem) {
    this.invalidParams.add(invalidParamsItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

