package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.RepositoryLinks;
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
  * A sourcecode repository
 **/
@ApiModel(description="A sourcecode repository")
public class Repository  {
  
  @ApiModelProperty(example = "Adobe-Marketing-Cloud", value = "Repository name")
 /**
   * Repository name
  **/
  private String repo;

  @ApiModelProperty(example = "Description", value = "description")
 /**
   * description
  **/
  private String description;

  @ApiModelProperty(value = "")
  @Valid
  private RepositoryLinks links;
 /**
   * Repository name
   * @return repo
  **/
  @JsonProperty("repo")
  public String getRepo() {
    return repo;
  }

  public void setRepo(String repo) {
    this.repo = repo;
  }

  public Repository repo(String repo) {
    this.repo = repo;
    return this;
  }

 /**
   * description
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Repository description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get links
   * @return links
  **/
  @JsonProperty("_links")
  public RepositoryLinks getLinks() {
    return links;
  }

  public void setLinks(RepositoryLinks links) {
    this.links = links;
  }

  public Repository links(RepositoryLinks links) {
    this.links = links;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

