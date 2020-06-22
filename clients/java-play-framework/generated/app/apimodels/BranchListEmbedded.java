package apimodels;

import apimodels.RepositoryBranch;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * BranchListEmbedded
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-22T02:53:34.661Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BranchListEmbedded   {
  @JsonProperty("branches")
  private List<RepositoryBranch> branches = null;

  public BranchListEmbedded branches(List<RepositoryBranch> branches) {
    this.branches = branches;
    return this;
  }

  public BranchListEmbedded addBranchesItem(RepositoryBranch branchesItem) {
    if (branches == null) {
      branches = new ArrayList<>();
    }
    branches.add(branchesItem);
    return this;
  }

   /**
   * Get branches
   * @return branches
  **/
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
    return Objects.equals(branches, branchListEmbedded.branches);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branches);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

