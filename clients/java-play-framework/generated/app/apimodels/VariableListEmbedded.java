package apimodels;

import apimodels.Variable;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * VariableListEmbedded
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-22T02:53:34.661Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class VariableListEmbedded   {
  @JsonProperty("variables")
  private List<Variable> variables = null;

  public VariableListEmbedded variables(List<Variable> variables) {
    this.variables = variables;
    return this;
  }

  public VariableListEmbedded addVariablesItem(Variable variablesItem) {
    if (variables == null) {
      variables = new ArrayList<>();
    }
    variables.add(variablesItem);
    return this;
  }

   /**
   * Variables set on environment
   * @return variables
  **/
  @Valid
  public List<Variable> getVariables() {
    return variables;
  }

  public void setVariables(List<Variable> variables) {
    this.variables = variables;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariableListEmbedded variableListEmbedded = (VariableListEmbedded) o;
    return Objects.equals(variables, variableListEmbedded.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variables);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableListEmbedded {\n");
    
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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

