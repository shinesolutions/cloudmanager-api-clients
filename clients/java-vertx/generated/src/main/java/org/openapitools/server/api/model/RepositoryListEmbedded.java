package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.Repository;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RepositoryListEmbedded   {
  
  private List<Repository> repositories = new ArrayList<>();

  public RepositoryListEmbedded () {

  }

  public RepositoryListEmbedded (List<Repository> repositories) {
    this.repositories = repositories;
  }

    
  @JsonProperty("repositories")
  public List<Repository> getRepositories() {
    return repositories;
  }
  public void setRepositories(List<Repository> repositories) {
    this.repositories = repositories;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
