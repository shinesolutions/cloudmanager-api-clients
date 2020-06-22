package apimodels;

import apimodels.InvalidParameter;
import apimodels.MissingParameter;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * A Bad Request response error.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-22T02:53:34.661Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BadRequestError   {
  @JsonProperty("status")
  private Integer status;

  @JsonProperty("type")
  private String type;

  @JsonProperty("title")
  private String title;

  @JsonProperty("missingParams")
  private List<MissingParameter> missingParams = null;

  @JsonProperty("invalidParams")
  private List<InvalidParameter> invalidParams = null;

  public BadRequestError status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * HTTP status code of the response.
   * @return status
  **/
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
  **/
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
  **/
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
    if (missingParams == null) {
      missingParams = new ArrayList<>();
    }
    missingParams.add(missingParamsItem);
    return this;
  }

   /**
   * Request's missing parameters.
   * @return missingParams
  **/
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
    if (invalidParams == null) {
      invalidParams = new ArrayList<>();
    }
    invalidParams.add(invalidParamsItem);
    return this;
  }

   /**
   * Request's invalid parameters.
   * @return invalidParams
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

