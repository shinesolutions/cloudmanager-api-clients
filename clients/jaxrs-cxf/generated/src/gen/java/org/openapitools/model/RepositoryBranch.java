package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.RepositoryBranchLinks;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Represents a Git Branch
 **/
@ApiModel(description="Represents a Git Branch")
public class RepositoryBranch  {
  
  @ApiModelProperty(example = "14", value = "Identifier of the program. Unique within the space")
 /**
   * Identifier of the program. Unique within the space
  **/
  private String programId;

  @ApiModelProperty(example = "2", value = "Identifier of the repository")
 /**
   * Identifier of the repository
  **/
  private Long repositoryId;

  @ApiModelProperty(example = "master", value = "Name of the branch")
 /**
   * Name of the branch
  **/
  private String name;

  @ApiModelProperty(value = "")
  @Valid
  private RepositoryBranchLinks links;
 /**
   * Identifier of the program. Unique within the space
   * @return programId
  **/
  @JsonProperty("programId")
  public String getProgramId() {
    return programId;
  }

  public void setProgramId(String programId) {
    this.programId = programId;
  }

  public RepositoryBranch programId(String programId) {
    this.programId = programId;
    return this;
  }

 /**
   * Identifier of the repository
   * @return repositoryId
  **/
  @JsonProperty("repositoryId")
  public Long getRepositoryId() {
    return repositoryId;
  }

  public void setRepositoryId(Long repositoryId) {
    this.repositoryId = repositoryId;
  }

  public RepositoryBranch repositoryId(Long repositoryId) {
    this.repositoryId = repositoryId;
    return this;
  }

 /**
   * Name of the branch
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RepositoryBranch name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get links
   * @return links
  **/
  @JsonProperty("_links")
  public RepositoryBranchLinks getLinks() {
    return links;
  }

  public void setLinks(RepositoryBranchLinks links) {
    this.links = links;
  }

  public RepositoryBranch links(RepositoryBranchLinks links) {
    this.links = links;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

