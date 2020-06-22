package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Environment;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;


public class EnvironmentListEmbedded   {
  
  private List<Environment> environments = null;


  /**
   **/
  public EnvironmentListEmbedded environments(List<Environment> environments) {
    this.environments = environments;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("environments")
  public List<Environment> getEnvironments() {
    return environments;
  }
  public void setEnvironments(List<Environment> environments) {
    this.environments = environments;
  }

  public EnvironmentListEmbedded addEnvironmentsItem(Environment environmentsItem) {
    if (this.environments == null) {
      this.environments = new ArrayList<Environment>();
    }
    this.environments.add(environmentsItem);
    return this;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvironmentListEmbedded environmentListEmbedded = (EnvironmentListEmbedded) o;
    return Objects.equals(environments, environmentListEmbedded.environments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(environments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvironmentListEmbedded {\n");
    
    sb.append("    environments: ").append(toIndentedString(environments)).append("\n");
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

