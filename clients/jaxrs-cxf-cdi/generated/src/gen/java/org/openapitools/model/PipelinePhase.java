package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;

/**
 * Describes a phase of a pipeline
 **/

import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;

@ApiModel(description = "Describes a phase of a pipeline")
public class PipelinePhase   {
  
  private String name;


@XmlType(name="TypeEnum")
@XmlEnum(String.class)
public enum TypeEnum {

    @XmlEnumValue("VALIDATE") VALIDATE(String.valueOf("VALIDATE")), @XmlEnumValue("BUILD") BUILD(String.valueOf("BUILD")), @XmlEnumValue("DEPLOY") DEPLOY(String.valueOf("DEPLOY"));


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

  private String repositoryId;

  private String branch;

  private String environmentId;


  /**
   * Name of the phase
   **/
  public PipelinePhase name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "DEV Build", value = "Name of the phase")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Type of the phase
   **/
  public PipelinePhase type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "DEPLOY", required = true, value = "Type of the phase")
  @JsonProperty("type")
  @NotNull
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Identifier of the source repository. The code from this repository will be build at the start of this phase. Mandatory if type&#x3D;BUILD
   **/
  public PipelinePhase repositoryId(String repositoryId) {
    this.repositoryId = repositoryId;
    return this;
  }

  
  @ApiModelProperty(value = "Identifier of the source repository. The code from this repository will be build at the start of this phase. Mandatory if type=BUILD")
  @JsonProperty("repositoryId")
  public String getRepositoryId() {
    return repositoryId;
  }
  public void setRepositoryId(String repositoryId) {
    this.repositoryId = repositoryId;
  }


  /**
   * Name of the tracked branch or a fully qualified git tag (e.g. refs/tags/v1).  Assumed to be &#x60;master&#x60; if missing.
   **/
  public PipelinePhase branch(String branch) {
    this.branch = branch;
    return this;
  }

  
  @ApiModelProperty(value = "Name of the tracked branch or a fully qualified git tag (e.g. refs/tags/v1).  Assumed to be `master` if missing.")
  @JsonProperty("branch")
  public String getBranch() {
    return branch;
  }
  public void setBranch(String branch) {
    this.branch = branch;
  }


  /**
   * Identifier of the target environment. Mandatory if type&#x3D;DEPLOY
   **/
  public PipelinePhase environmentId(String environmentId) {
    this.environmentId = environmentId;
    return this;
  }

  
  @ApiModelProperty(value = "Identifier of the target environment. Mandatory if type=DEPLOY")
  @JsonProperty("environmentId")
  public String getEnvironmentId() {
    return environmentId;
  }
  public void setEnvironmentId(String environmentId) {
    this.environmentId = environmentId;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PipelinePhase pipelinePhase = (PipelinePhase) o;
    return Objects.equals(name, pipelinePhase.name) &&
        Objects.equals(type, pipelinePhase.type) &&
        Objects.equals(repositoryId, pipelinePhase.repositoryId) &&
        Objects.equals(branch, pipelinePhase.branch) &&
        Objects.equals(environmentId, pipelinePhase.environmentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, repositoryId, branch, environmentId);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

