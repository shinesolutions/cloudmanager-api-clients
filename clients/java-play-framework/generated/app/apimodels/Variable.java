package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * A named value than can be set on an Environment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-22T02:53:34.661Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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

    private final String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  public Variable name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the variable. Of a-z, A-Z, _ and 0-9 Cannot begin with a number.
   * @return name
  **/
  @Pattern(regexp="[a-zA-Z_][a-zA-Z_0-9]*")
@Size(min=2,max=100)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Variable value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Value of the variable. Read-Write for non-secrets, write-only for secrets.
   * @return value
  **/
  @Size(min=0,max=2048)
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Variable type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the variable. Default `string` if missing. Cannot be changed after creation.
   * @return type
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

