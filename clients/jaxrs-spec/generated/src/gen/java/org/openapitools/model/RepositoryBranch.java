package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RepositoryBranchLinks;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Represents a Git Branch
 **/
@ApiModel(description = "Represents a Git Branch")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2020-06-22T02:54:21.117Z[GMT]")
public class RepositoryBranch   {
  
  private @Valid String programId;
  private @Valid Long repositoryId;
  private @Valid String name;
  private @Valid RepositoryBranchLinks links;

  /**
   * Identifier of the program. Unique within the space
   **/
  public RepositoryBranch programId(String programId) {
    this.programId = programId;
    return this;
  }

  
  @ApiModelProperty(example = "14", value = "Identifier of the program. Unique within the space")
  @JsonProperty("programId")
  public String getProgramId() {
    return programId;
  }
  public void setProgramId(String programId) {
    this.programId = programId;
  }

  /**
   * Identifier of the repository
   **/
  public RepositoryBranch repositoryId(Long repositoryId) {
    this.repositoryId = repositoryId;
    return this;
  }

  
  @ApiModelProperty(example = "2", value = "Identifier of the repository")
  @JsonProperty("repositoryId")
  public Long getRepositoryId() {
    return repositoryId;
  }
  public void setRepositoryId(Long repositoryId) {
    this.repositoryId = repositoryId;
  }

  /**
   * Name of the branch
   **/
  public RepositoryBranch name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "master", value = "Name of the branch")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public RepositoryBranch links(RepositoryBranchLinks links) {
    this.links = links;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("_links")
  public RepositoryBranchLinks getLinks() {
    return links;
  }
  public void setLinks(RepositoryBranchLinks links) {
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
    RepositoryBranch repositoryBranch = (RepositoryBranch) o;
    return Objects.equals(this.programId, repositoryBranch.programId) &&
        Objects.equals(this.repositoryId, repositoryBranch.repositoryId) &&
        Objects.equals(this.name, repositoryBranch.name) &&
        Objects.equals(this.links, repositoryBranch.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(programId, repositoryId, name, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepositoryBranch {\n");
    
    sb.append("    programId: ").append(toIndentedString(programId)).append("\n");
    sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

