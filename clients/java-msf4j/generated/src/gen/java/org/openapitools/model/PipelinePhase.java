package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Describes a phase of a pipeline
 */
@ApiModel(description = "Describes a phase of a pipeline")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-06-22T02:53:20.395Z[GMT]")
public class PipelinePhase   {
  @JsonProperty("name")
  private String name;

  /**
   * Type of the phase
   */
  public enum TypeEnum {
    VALIDATE("VALIDATE"),
    
    BUILD("BUILD"),
    
    DEPLOY("DEPLOY");

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

  @JsonProperty("repositoryId")
  private String repositoryId;

  @JsonProperty("branch")
  private String branch;

  @JsonProperty("environmentId")
  private String environmentId;

  public PipelinePhase name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the phase
   * @return name
  **/
  @ApiModelProperty(example = "DEV Build", value = "Name of the phase")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PipelinePhase type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the phase
   * @return type
  **/
  @ApiModelProperty(example = "DEPLOY", required = true, value = "Type of the phase")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public PipelinePhase repositoryId(String repositoryId) {
    this.repositoryId = repositoryId;
    return this;
  }

   /**
   * Identifier of the source repository. The code from this repository will be build at the start of this phase. Mandatory if type=BUILD
   * @return repositoryId
  **/
  @ApiModelProperty(value = "Identifier of the source repository. The code from this repository will be build at the start of this phase. Mandatory if type=BUILD")
  public String getRepositoryId() {
    return repositoryId;
  }

  public void setRepositoryId(String repositoryId) {
    this.repositoryId = repositoryId;
  }

  public PipelinePhase branch(String branch) {
    this.branch = branch;
    return this;
  }

   /**
   * Name of the tracked branch or a fully qualified git tag (e.g. refs/tags/v1).  Assumed to be `master` if missing.
   * @return branch
  **/
  @ApiModelProperty(value = "Name of the tracked branch or a fully qualified git tag (e.g. refs/tags/v1).  Assumed to be `master` if missing.")
  public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }

  public PipelinePhase environmentId(String environmentId) {
    this.environmentId = environmentId;
    return this;
  }

   /**
   * Identifier of the target environment. Mandatory if type=DEPLOY
   * @return environmentId
  **/
  @ApiModelProperty(value = "Identifier of the target environment. Mandatory if type=DEPLOY")
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
    return Objects.equals(this.name, pipelinePhase.name) &&
        Objects.equals(this.type, pipelinePhase.type) &&
        Objects.equals(this.repositoryId, pipelinePhase.repositoryId) &&
        Objects.equals(this.branch, pipelinePhase.branch) &&
        Objects.equals(this.environmentId, pipelinePhase.environmentId);
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

