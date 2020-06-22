package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Describes a phase of a pipeline
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PipelinePhase   {
  
  private String name;


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
      return value;
    }
  }

  private TypeEnum type;
  private String repositoryId;
  private String branch;
  private String environmentId;

  public PipelinePhase () {

  }

  public PipelinePhase (String name, TypeEnum type, String repositoryId, String branch, String environmentId) {
    this.name = name;
    this.type = type;
    this.repositoryId = repositoryId;
    this.branch = branch;
    this.environmentId = environmentId;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

    
  @JsonProperty("repositoryId")
  public String getRepositoryId() {
    return repositoryId;
  }
  public void setRepositoryId(String repositoryId) {
    this.repositoryId = repositoryId;
  }

    
  @JsonProperty("branch")
  public String getBranch() {
    return branch;
  }
  public void setBranch(String branch) {
    this.branch = branch;
  }

    
  @JsonProperty("environmentId")
  public String getEnvironmentId() {
    return environmentId;
  }
  public void setEnvironmentId(String environmentId) {
    this.environmentId = environmentId;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
