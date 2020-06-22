package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.InvalidParameter;
import org.openapitools.server.api.model.MissingParameter;

/**
 * A Bad Request response error.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BadRequestError   {
  
  private Integer status;
  private String type;
  private String title;
  private List<MissingParameter> missingParams = new ArrayList<>();
  private List<InvalidParameter> invalidParams = new ArrayList<>();

  public BadRequestError () {

  }

  public BadRequestError (Integer status, String type, String title, List<MissingParameter> missingParams, List<InvalidParameter> invalidParams) {
    this.status = status;
    this.type = type;
    this.title = title;
    this.missingParams = missingParams;
    this.invalidParams = invalidParams;
  }

    
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

    
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

    
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

    
  @JsonProperty("missingParams")
  public List<MissingParameter> getMissingParams() {
    return missingParams;
  }
  public void setMissingParams(List<MissingParameter> missingParams) {
    this.missingParams = missingParams;
  }

    
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
