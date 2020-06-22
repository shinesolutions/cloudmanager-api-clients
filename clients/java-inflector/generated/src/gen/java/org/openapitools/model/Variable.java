package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * A named value than can be set on an Environment
 **/

@ApiModel(description = "A named value than can be set on an Environment")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-06-22T02:53:13.843Z[GMT]")
public class Variable   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("value")
  private String value;

  /**
   * Type of the variable. Default `string` if missing. Cannot be changed after creation.
   */
  public enum TypeEnum {
    STRING("string"),
    
    SECRETSTRING("secretString");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  /**
   * Name of the variable. Of a-z, A-Z, _ and 0-9 Cannot begin with a number.
   **/
  public Variable name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "MY_VAR1", value = "Name of the variable. Of a-z, A-Z, _ and 0-9 Cannot begin with a number.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Value of the variable. Read-Write for non-secrets, write-only for secrets.
   **/
  public Variable value(String value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(example = "myValue", value = "Value of the variable. Read-Write for non-secrets, write-only for secrets.")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Type of the variable. Default `string` if missing. Cannot be changed after creation.
   **/
  public Variable type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "string", value = "Type of the variable. Default `string` if missing. Cannot be changed after creation.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
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
    Variable variable = (Variable) o;
    return Objects.equals(name, variable.name) &&
        Objects.equals(value, variable.value) &&
        Objects.equals(type, variable.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Variable {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

