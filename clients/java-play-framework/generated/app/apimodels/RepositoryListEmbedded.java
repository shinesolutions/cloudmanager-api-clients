package apimodels;

import apimodels.Repository;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * RepositoryListEmbedded
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-22T02:53:34.661Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RepositoryListEmbedded   {
  @JsonProperty("repositories")
  private List<Repository> repositories = null;

  public RepositoryListEmbedded repositories(List<Repository> repositories) {
    this.repositories = repositories;
    return this;
  }

  public RepositoryListEmbedded addRepositoriesItem(Repository repositoriesItem) {
    if (repositories == null) {
      repositories = new ArrayList<>();
    }
    repositories.add(repositoriesItem);
    return this;
  }

   /**
   * Get repositories
   * @return repositories
  **/
  @Valid
  public List<Repository> getRepositories() {
    return repositories;
  }

  public void setRepositories(List<Repository> repositories) {
    this.repositories = repositories;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepositoryListEmbedded repositoryListEmbedded = (RepositoryListEmbedded) o;
    return Objects.equals(repositories, repositoryListEmbedded.repositories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repositories);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepositoryListEmbedded {\n");
    
    sb.append("    repositories: ").append(toIndentedString(repositories)).append("\n");
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

