package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RepositoryBranchLinks;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents a Git Branch
 */
@ApiModel(description = "Represents a Git Branch")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-06-22T02:57:04.825Z[GMT]")

public class RepositoryBranch   {
  @JsonProperty("programId")
  private String programId;

  @JsonProperty("repositoryId")
  private Long repositoryId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("_links")
  private RepositoryBranchLinks links;

  public RepositoryBranch programId(String programId) {
    this.programId = programId;
    return this;
  }

  /**
   * Identifier of the program. Unique within the space
   * @return programId
  */
  @ApiModelProperty(example = "14", value = "Identifier of the program. Unique within the space")


  public String getProgramId() {
    return programId;
  }

  public void setProgramId(String programId) {
    this.programId = programId;
  }

  public RepositoryBranch repositoryId(Long repositoryId) {
    this.repositoryId = repositoryId;
    return this;
  }

  /**
   * Identifier of the repository
   * @return repositoryId
  */
  @ApiModelProperty(example = "2", value = "Identifier of the repository")


  public Long getRepositoryId() {
    return repositoryId;
  }

  public void setRepositoryId(Long repositoryId) {
    this.repositoryId = repositoryId;
  }

  public RepositoryBranch name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the branch
   * @return name
  */
  @ApiModelProperty(example = "master", value = "Name of the branch")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RepositoryBranch links(RepositoryBranchLinks links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  */
  @ApiModelProperty(value = "")

  @Valid

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

