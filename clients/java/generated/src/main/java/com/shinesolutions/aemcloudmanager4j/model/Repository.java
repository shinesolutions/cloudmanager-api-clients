/*
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


package com.shinesolutions.aemcloudmanager4j.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.shinesolutions.aemcloudmanager4j.model.RepositoryLinks;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A sourcecode repository
 */
@ApiModel(description = "A sourcecode repository")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-06-23T00:28:14.729Z[GMT]")
public class Repository {
  public static final String SERIALIZED_NAME_REPO = "repo";
  @SerializedName(SERIALIZED_NAME_REPO)
  private String repo;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private RepositoryLinks links;


  public Repository repo(String repo) {
    
    this.repo = repo;
    return this;
  }

   /**
   * Repository name
   * @return repo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Adobe-Marketing-Cloud", value = "Repository name")

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
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Description", value = "description")

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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
    return Objects.equals(this.repo, repository.repo) &&
        Objects.equals(this.description, repository.description) &&
        Objects.equals(this.links, repository.links);
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

