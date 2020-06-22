package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.Environment;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EnvironmentListEmbedded   {
  
  private List<Environment> environments = new ArrayList<>();

  public EnvironmentListEmbedded () {

  }

  public EnvironmentListEmbedded (List<Environment> environments) {
    this.environments = environments;
  }

    
  @JsonProperty("environments")
  public List<Environment> getEnvironments() {
    return environments;
  }
  public void setEnvironments(List<Environment> environments) {
    this.environments = environments;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
