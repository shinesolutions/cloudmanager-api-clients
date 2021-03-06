package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.RepositoryBranchLinks;

/**
 * Represents a Git Branch
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RepositoryBranch   {
  
  private String programId;
  private Long repositoryId;
  private String name;
  private RepositoryBranchLinks links;

  public RepositoryBranch () {

  }

  public RepositoryBranch (String programId, Long repositoryId, String name, RepositoryBranchLinks links) {
    this.programId = programId;
    this.repositoryId = repositoryId;
    this.name = name;
    this.links = links;
  }

    
  @JsonProperty("programId")
  public String getProgramId() {
    return programId;
  }
  public void setProgramId(String programId) {
    this.programId = programId;
  }

    
  @JsonProperty("repositoryId")
  public Long getRepositoryId() {
    return repositoryId;
  }
  public void setRepositoryId(Long repositoryId) {
    this.repositoryId = repositoryId;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
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
