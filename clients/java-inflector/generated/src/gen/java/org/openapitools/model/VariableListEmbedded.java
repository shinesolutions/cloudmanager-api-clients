package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Variable;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-06-22T02:53:13.843Z[GMT]")
public class VariableListEmbedded   {
  @JsonProperty("variables")
  private List<Variable> variables = null;

  /**
   * Variables set on environment
   **/
  public VariableListEmbedded variables(List<Variable> variables) {
    this.variables = variables;
    return this;
  }

  
  @ApiModelProperty(example = "[{ 'name':'variable1Name', 'value':'variable1Value'}, { 'name':'variable2Name', 'type':'secretString', 'value':'variable2SecretValue'}]", value = "Variables set on environment")
  @JsonProperty("variables")
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

