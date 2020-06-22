package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.EnvironmentLinks;

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
  * An Environment that 
 **/
@ApiModel(description="An Environment that ")
public class Environment  {
  
  @ApiModelProperty(value = "id")
 /**
   * id
  **/
  private String id;

  @ApiModelProperty(example = "14", value = "Identifier of the program. Unique within the space.")
 /**
   * Identifier of the program. Unique within the space.
  **/
  private String programId;

  @ApiModelProperty(example = "AcmeCorp Dev1 Environment", value = "Name of the environment")
 /**
   * Name of the environment
  **/
  private String name;

  @ApiModelProperty(example = "This is our primary development environment", value = "Description of the environment")
 /**
   * Description of the environment
  **/
  private String description;

@XmlType(name="TypeEnum")
@XmlEnum(String.class)
public enum TypeEnum {

@XmlEnumValue("dev") DEV(String.valueOf("dev")), @XmlEnumValue("stage") STAGE(String.valueOf("stage")), @XmlEnumValue("prod") PROD(String.valueOf("prod"));


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

  @ApiModelProperty(example = "dev", value = "Type of the environment")
 /**
   * Type of the environment
  **/
  private TypeEnum type;

  @ApiModelProperty(value = "")
  private EnvironmentLinks links;
 /**
   * id
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Environment id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Identifier of the program. Unique within the space.
   * @return programId
  **/
  @JsonProperty("programId")
  public String getProgramId() {
    return programId;
  }

  public void setProgramId(String programId) {
    this.programId = programId;
  }

  public Environment programId(String programId) {
    this.programId = programId;
    return this;
  }

 /**
   * Name of the environment
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Environment name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Description of the environment
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Environment description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Type of the environment
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

  public Environment type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * Get links
   * @return links
  **/
  @JsonProperty("_links")
  public EnvironmentLinks getLinks() {
    return links;
  }

  public void setLinks(EnvironmentLinks links) {
    this.links = links;
  }

  public Environment links(EnvironmentLinks links) {
    this.links = links;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

