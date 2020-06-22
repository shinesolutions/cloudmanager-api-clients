package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RepositoryBranchLinks;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Represents a Git Branch")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-06-22T02:54:15.715Z[GMT]")
public class RepositoryBranch   {
  

  private String programId;

  private Long repositoryId;

  private String name;

  private RepositoryBranchLinks links;

  /**
   * Identifier of the program. Unique within the space
   **/
  
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("_links")
  public RepositoryBranchLinks getLinks() {
    return links;
  }
  public void setLinks(RepositoryBranchLinks links) {
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
    RepositoryBranch repositoryBranch = (RepositoryBranch) o;
    return Objects.equals(programId, repositoryBranch.programId) &&
        Objects.equals(repositoryId, repositoryBranch.repositoryId) &&
        Objects.equals(name, repositoryBranch.name) &&
        Objects.equals(links, repositoryBranch.links);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

