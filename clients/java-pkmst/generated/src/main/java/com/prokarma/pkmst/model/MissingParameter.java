package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * MissingParameter
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2020-06-22T02:53:26.039Z[GMT]")

public class MissingParameter   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("type")
  private String type;

  public MissingParameter name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the missing parameter.
   * @return name
  **/
  @ApiModelProperty(example = "paramName", value = "Name of the missing parameter.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MissingParameter type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the missing parameter.
   * @return type
  **/
  @ApiModelProperty(example = "string", value = "Type of the missing parameter.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MissingParameter missingParameter = (MissingParameter) o;
    return Objects.equals(this.name, missingParameter.name) &&
        Objects.equals(this.type, missingParameter.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MissingParameter {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

