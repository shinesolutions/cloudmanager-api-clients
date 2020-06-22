package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.RepositoryBranch;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BranchListEmbedded
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-06-22T02:57:04.825Z[GMT]")

public class BranchListEmbedded   {
  @JsonProperty("branches")
  @Valid
  private List<RepositoryBranch> branches = null;

  public BranchListEmbedded branches(List<RepositoryBranch> branches) {
    this.branches = branches;
    return this;
  }

  public BranchListEmbedded addBranchesItem(RepositoryBranch branchesItem) {
    if (this.branches == null) {
      this.branches = new ArrayList<>();
    }
    this.branches.add(branchesItem);
    return this;
  }

  /**
   * Get branches
   * @return branches
  */
  @ApiModelProperty(value = "")

  @Valid

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

