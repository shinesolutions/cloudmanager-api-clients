/*
 * Cloud Manager API
 * This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.shinesolutions.aemcloudmanager4j.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Describes a phase of a pipeline
 */
@ApiModel(description = "Describes a phase of a pipeline")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-06-23T00:28:14.729Z[GMT]")
public class PipelinePhase {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Type of the phase
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    VALIDATE("VALIDATE"),
    
    BUILD("BUILD"),
    
    DEPLOY("DEPLOY");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
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

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_REPOSITORY_ID = "repositoryId";
  @SerializedName(SERIALIZED_NAME_REPOSITORY_ID)
  private String repositoryId;

  public static final String SERIALIZED_NAME_BRANCH = "branch";
  @SerializedName(SERIALIZED_NAME_BRANCH)
  private String branch;

  public static final String SERIALIZED_NAME_ENVIRONMENT_ID = "environmentId";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT_ID)
  private String environmentId;


  public PipelinePhase name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the phase
   * @return name
  **/
  @javax.annotation.Nullable
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
   * Identifier of the source repository. The code from this repository will be build at the start of this phase. Mandatory if type&#x3D;BUILD
   * @return repositoryId
  **/
  @javax.annotation.Nullable
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
   * Name of the tracked branch or a fully qualified git tag (e.g. refs/tags/v1).  Assumed to be &#x60;master&#x60; if missing.
   * @return branch
  **/
  @javax.annotation.Nullable
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
   * Identifier of the target environment. Mandatory if type&#x3D;DEPLOY
   * @return environmentId
  **/
  @javax.annotation.Nullable
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

