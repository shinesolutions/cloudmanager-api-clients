package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.api.model.EnvironmentLinks;

/**
 * An Environment that 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Environment   {
  
  private String id;
  private String programId;
  private String name;
  private String description;


  public enum TypeEnum {
    DEV("dev"),
    STAGE("stage"),
    PROD("prod");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TypeEnum type;
  private EnvironmentLinks links;

  public Environment () {

  }

  public Environment (String id, String programId, String name, String description, TypeEnum type, EnvironmentLinks links) {
    this.id = id;
    this.programId = programId;
    this.name = name;
    this.description = description;
    this.type = type;
    this.links = links;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("programId")
  public String getProgramId() {
    return programId;
  }
  public void setProgramId(String programId) {
    this.programId = programId;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

    
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

    
  @JsonProperty("_links")
  public EnvironmentLinks getLinks() {
    return links;
  }
  public void setLinks(EnvironmentLinks links) {
    this.links = links;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
