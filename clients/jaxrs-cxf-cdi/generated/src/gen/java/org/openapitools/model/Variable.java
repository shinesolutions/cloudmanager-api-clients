package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;

/**
 * A named value than can be set on an Environment
 **/

import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;

@ApiModel(description = "A named value than can be set on an Environment")
public class Variable   {
  
  private String name;

  private String value;


@XmlType(name="TypeEnum")
@XmlEnum(String.class)
public enum TypeEnum {

    @XmlEnumValue("string") STRING(String.valueOf("string")), @XmlEnumValue("secretString") SECRETSTRING(String.valueOf("secretString"));


    private String value;

    TypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
        for (TypeEnum b : TypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

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
 @Pattern(regexp="[a-zA-Z_][a-zA-Z_0-9]*") @Size(min=2,max=100)  public String getName() {
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
 @Size(min=0,max=2048)  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }


  /**
   * Type of the variable. Default &#x60;string&#x60; if missing. Cannot be changed after creation.
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

