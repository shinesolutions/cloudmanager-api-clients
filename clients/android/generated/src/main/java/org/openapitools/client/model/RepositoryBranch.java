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

import org.openapitools.client.model.RepositoryBranchLinks;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Represents a Git Branch
 **/
@ApiModel(description = "Represents a Git Branch")
public class RepositoryBranch {
  
  @SerializedName("programId")
  private String programId = null;
  @SerializedName("repositoryId")
  private Long repositoryId = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("_links")
  private RepositoryBranchLinks links = null;

  /**
   * Identifier of the program. Unique within the space
   **/
  @ApiModelProperty(value = "Identifier of the program. Unique within the space")
  public String getProgramId() {
    return programId;
  }
  public void setProgramId(String programId) {
    this.programId = programId;
  }

  /**
   * Identifier of the repository
   **/
  @ApiModelProperty(value = "Identifier of the repository")
  public Long getRepositoryId() {
    return repositoryId;
  }
  public void setRepositoryId(Long repositoryId) {
    this.repositoryId = repositoryId;
  }

  /**
   * Name of the branch
   **/
  @ApiModelProperty(value = "Name of the branch")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
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
    return (this.programId == null ? repositoryBranch.programId == null : this.programId.equals(repositoryBranch.programId)) &&
        (this.repositoryId == null ? repositoryBranch.repositoryId == null : this.repositoryId.equals(repositoryBranch.repositoryId)) &&
        (this.name == null ? repositoryBranch.name == null : this.name.equals(repositoryBranch.name)) &&
        (this.links == null ? repositoryBranch.links == null : this.links.equals(repositoryBranch.links));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.programId == null ? 0: this.programId.hashCode());
    result = 31 * result + (this.repositoryId == null ? 0: this.repositoryId.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.links == null ? 0: this.links.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepositoryBranch {\n");
    
    sb.append("  programId: ").append(programId).append("\n");
    sb.append("  repositoryId: ").append(repositoryId).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  links: ").append(links).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
