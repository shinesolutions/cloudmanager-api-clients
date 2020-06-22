package org.openapitools.model;

import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Repository;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RepositoryListEmbedded  {
  
  @ApiModelProperty(value = "")
  private List<Repository> repositories = null;
 /**
   * Get repositories
   * @return repositories
  **/
  @JsonProperty("repositories")
  public List<Repository> getRepositories() {
    return repositories;
  }

  public void setRepositories(List<Repository> repositories) {
    this.repositories = repositories;
  }

  public RepositoryListEmbedded repositories(List<Repository> repositories) {
    this.repositories = repositories;
    return this;
  }

  public RepositoryListEmbedded addRepositoriesItem(Repository repositoriesItem) {
    this.repositories.add(repositoriesItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

