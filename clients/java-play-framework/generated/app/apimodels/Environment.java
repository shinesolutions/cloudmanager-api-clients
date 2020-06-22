package apimodels;

import apimodels.EnvironmentLinks;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * An Environment that 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-22T02:53:34.661Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Environment   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("programId")
  private String programId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  /**
   * Type of the environment
   */
  public enum TypeEnum {
    DEV("dev"),
    
    STAGE("stage"),
    
    PROD("prod");

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

  @JsonProperty("_links")
  private EnvironmentLinks links;

  public Environment id(String id) {
    this.id = id;
    return this;
  }

   /**
   * id
   * @return id
  **/
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Environment programId(String programId) {
    this.programId = programId;
    return this;
  }

   /**
   * Identifier of the program. Unique within the space.
   * @return programId
  **/
    public String getProgramId() {
    return programId;
  }

  public void setProgramId(String programId) {
    this.programId = programId;
  }

  public Environment name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the environment
   * @return name
  **/
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Environment description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the environment
   * @return description
  **/
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Environment type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the environment
   * @return type
  **/
    public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Environment links(EnvironmentLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @Valid
  public EnvironmentLinks getLinks() {
    return links;
  }

  public void setLinks(EnvironmentLinks links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Environment environment = (Environment) o;
    return Objects.equals(id, environment.id) &&
        Objects.equals(programId, environment.programId) &&
        Objects.equals(name, environment.name) &&
        Objects.equals(description, environment.description) &&
        Objects.equals(type, environment.type) &&
        Objects.equals(links, environment.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, programId, name, description, type, links);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Environment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    programId: ").append(toIndentedString(programId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

