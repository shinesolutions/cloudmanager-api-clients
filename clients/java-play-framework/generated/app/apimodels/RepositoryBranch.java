package apimodels;

import apimodels.RepositoryBranchLinks;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * Represents a Git Branch
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-22T02:53:34.661Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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
  **/
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
  **/
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
  **/
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
  **/
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
    return Objects.equals(programId, repositoryBranch.programId) &&
        Objects.equals(repositoryId, repositoryBranch.repositoryId) &&
        Objects.equals(name, repositoryBranch.name) &&
        Objects.equals(links, repositoryBranch.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(programId, repositoryId, name, links);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

