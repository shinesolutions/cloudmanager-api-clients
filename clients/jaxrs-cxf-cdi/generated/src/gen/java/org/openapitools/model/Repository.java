package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RepositoryLinks;
import javax.validation.constraints.*;

/**
 * A sourcecode repository
 **/

import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;

@ApiModel(description = "A sourcecode repository")
public class Repository   {
  
  private String repo;

  private String description;

  private RepositoryLinks links;


  /**
   * Repository name
   **/
  public Repository repo(String repo) {
    this.repo = repo;
    return this;
  }

  
  @ApiModelProperty(example = "Adobe-Marketing-Cloud", value = "Repository name")
  @JsonProperty("repo")
  public String getRepo() {
    return repo;
  }
  public void setRepo(String repo) {
    this.repo = repo;
  }


  /**
   * description
   **/
  public Repository description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(example = "Description", value = "description")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   **/
  public Repository links(RepositoryLinks links) {
    this.links = links;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("_links")
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

