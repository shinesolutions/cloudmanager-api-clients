/**
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

package org.openapitools.client.model;

import org.openapitools.client.model.RepositoryLinks;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A sourcecode repository
 **/
@ApiModel(description = "A sourcecode repository")
public class Repository {
  
  @SerializedName("repo")
  private String repo = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("_links")
  private RepositoryLinks links = null;

  /**
   * Repository name
   **/
  @ApiModelProperty(value = "Repository name")
  public String getRepo() {
    return repo;
  }
  public void setRepo(String repo) {
    this.repo = repo;
  }

  /**
   * description
   **/
  @ApiModelProperty(value = "description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public RepositoryLinks getLinks() {
    return links;
  }
  public void setLinks(RepositoryLinks links) {
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
    Repository repository = (Repository) o;
    return (this.repo == null ? repository.repo == null : this.repo.equals(repository.repo)) &&
        (this.description == null ? repository.description == null : this.description.equals(repository.description)) &&
        (this.links == null ? repository.links == null : this.links.equals(repository.links));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.repo == null ? 0: this.repo.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.links == null ? 0: this.links.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Repository {\n");
    
    sb.append("  repo: ").append(repo).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  links: ").append(links).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
