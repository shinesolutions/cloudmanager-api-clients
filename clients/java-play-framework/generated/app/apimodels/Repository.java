package apimodels;

import apimodels.RepositoryLinks;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * A sourcecode repository
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-22T02:53:34.661Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Repository   {
  @JsonProperty("repo")
  private String repo;

  @JsonProperty("description")
  private String description;

  @JsonProperty("_links")
  private RepositoryLinks links;

  public Repository repo(String repo) {
    this.repo = repo;
    return this;
  }

   /**
   * Repository name
   * @return repo
  **/
    public String getRepo() {
    return repo;
  }

  public void setRepo(String repo) {
    this.repo = repo;
  }

  public Repository description(String description) {
    this.description = description;
    return this;
  }

   /**
   * description
   * @return description
  **/
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Repository links(RepositoryLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @Valid
  public RepositoryLinks getLinks() {
    return links;
  }

  public void setLinks(RepositoryLinks links) {
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
    Repository repository = (Repository) o;
    return Objects.equals(repo, repository.repo) &&
        Objects.equals(description, repository.description) &&
        Objects.equals(links, repository.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repo, description, links);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Repository {\n");
    
    sb.append("    repo: ").append(toIndentedString(repo)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

