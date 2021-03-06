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
import com.shinesolutions.aemcloudmanager4j.model.RepositoryBranch;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * BranchListEmbedded
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-06-23T00:28:14.729Z[GMT]")
public class BranchListEmbedded {
  public static final String SERIALIZED_NAME_BRANCHES = "branches";
  @SerializedName(SERIALIZED_NAME_BRANCHES)
  private List<RepositoryBranch> branches = null;


  public BranchListEmbedded branches(List<RepositoryBranch> branches) {
    
    this.branches = branches;
    return this;
  }

  public BranchListEmbedded addBranchesItem(RepositoryBranch branchesItem) {
    if (this.branches == null) {
      this.branches = new ArrayList<RepositoryBranch>();
    }
    this.branches.add(branchesItem);
    return this;
  }

   /**
   * Get branches
   * @return branches
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<RepositoryBranch> getBranches() {
    return branches;
  }


  public void setBranches(List<RepositoryBranch> branches) {
    this.branches = branches;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BranchListEmbedded branchListEmbedded = (BranchListEmbedded) o;
    return Objects.equals(this.branches, branchListEmbedded.branches);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branches);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BranchListEmbedded {\n");
    sb.append("    branches: ").append(toIndentedString(branches)).append("\n");
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

