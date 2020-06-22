package org.openapitools.model;

import io.swagger.annotations.ApiModel;

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
  * Describes a phase of a pipeline
 **/
@ApiModel(description="Describes a phase of a pipeline")
public class PipelinePhase  {
  
  @ApiModelProperty(example = "DEV Build", value = "Name of the phase")
 /**
   * Name of the phase
  **/
  private String name;

@XmlType(name="TypeEnum")
@XmlEnum(String.class)
public enum TypeEnum {

@XmlEnumValue("VALIDATE") VALIDATE(String.valueOf("VALIDATE")), @XmlEnumValue("BUILD") BUILD(String.valueOf("BUILD")), @XmlEnumValue("DEPLOY") DEPLOY(String.valueOf("DEPLOY"));


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

  @ApiModelProperty(example = "DEPLOY", required = true, value = "Type of the phase")
 /**
   * Type of the phase
  **/
  private TypeEnum type;

  @ApiModelProperty(value = "Identifier of the source repository. The code from this repository will be build at the start of this phase. Mandatory if type=BUILD")
 /**
   * Identifier of the source repository. The code from this repository will be build at the start of this phase. Mandatory if type=BUILD
  **/
  private String repositoryId;

  @ApiModelProperty(value = "Name of the tracked branch or a fully qualified git tag (e.g. refs/tags/v1).  Assumed to be `master` if missing.")
 /**
   * Name of the tracked branch or a fully qualified git tag (e.g. refs/tags/v1).  Assumed to be `master` if missing.
  **/
  private String branch;

  @ApiModelProperty(value = "Identifier of the target environment. Mandatory if type=DEPLOY")
 /**
   * Identifier of the target environment. Mandatory if type=DEPLOY
  **/
  private String environmentId;
 /**
   * Name of the phase
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PipelinePhase name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Type of the phase
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

  public PipelinePhase type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * Identifier of the source repository. The code from this repository will be build at the start of this phase. Mandatory if type&#x3D;BUILD
   * @return repositoryId
  **/
  @JsonProperty("repositoryId")
  public String getRepositoryId() {
    return repositoryId;
  }

  public void setRepositoryId(String repositoryId) {
    this.repositoryId = repositoryId;
  }

  public PipelinePhase repositoryId(String repositoryId) {
    this.repositoryId = repositoryId;
    return this;
  }

 /**
   * Name of the tracked branch or a fully qualified git tag (e.g. refs/tags/v1).  Assumed to be &#x60;master&#x60; if missing.
   * @return branch
  **/
  @JsonProperty("branch")
  public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }

  public PipelinePhase branch(String branch) {
    this.branch = branch;
    return this;
  }

 /**
   * Identifier of the target environment. Mandatory if type&#x3D;DEPLOY
   * @return environmentId
  **/
  @JsonProperty("environmentId")
  public String getEnvironmentId() {
    return environmentId;
  }

  public void setEnvironmentId(String environmentId) {
    this.environmentId = environmentId;
  }

  public PipelinePhase environmentId(String environmentId) {
    this.environmentId = environmentId;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelinePhase {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    environmentId: ").append(toIndentedString(environmentId)).append("\n");
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

