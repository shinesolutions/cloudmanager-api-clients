package org.openapitools.model;

import io.swagger.annotations.ApiModel;
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
  * A named value than can be set on an Environment
 **/
@ApiModel(description="A named value than can be set on an Environment")
public class Variable  {
  
  @ApiModelProperty(example = "MY_VAR1", value = "Name of the variable. Of a-z, A-Z, _ and 0-9 Cannot begin with a number.")
 /**
   * Name of the variable. Of a-z, A-Z, _ and 0-9 Cannot begin with a number.
  **/
  private String name;

  @ApiModelProperty(example = "myValue", value = "Value of the variable. Read-Write for non-secrets, write-only for secrets.")
 /**
   * Value of the variable. Read-Write for non-secrets, write-only for secrets.
  **/
  private String value;

@XmlType(name="TypeEnum")
@XmlEnum(String.class)
public enum TypeEnum {

@XmlEnumValue("string") STRING(String.valueOf("string")), @XmlEnumValue("secretString") SECRETSTRING(String.valueOf("secretString"));


    private String value;

    TypeEnum (String v) {
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

  @ApiModelProperty(example = "string", value = "Type of the variable. Default `string` if missing. Cannot be changed after creation.")
 /**
   * Type of the variable. Default `string` if missing. Cannot be changed after creation.
  **/
  private TypeEnum type;
 /**
   * Name of the variable. Of a-z, A-Z, _ and 0-9 Cannot begin with a number.
   * @return name
  **/
  @JsonProperty("name")
 @Pattern(regexp="[a-zA-Z_][a-zA-Z_0-9]*") @Size(min=2,max=100)  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Variable name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Value of the variable. Read-Write for non-secrets, write-only for secrets.
   * @return value
  **/
  @JsonProperty("value")
 @Size(min=0,max=2048)  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Variable value(String value) {
    this.value = value;
    return this;
  }

 /**
   * Type of the variable. Default &#x60;string&#x60; if missing. Cannot be changed after creation.
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.value();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Variable type(TypeEnum type) {
    this.type = type;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

