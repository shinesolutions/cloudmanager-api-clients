package org.openapitools.model;

import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Variable;
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

public class VariableListEmbedded  {
  
  @ApiModelProperty(example = "[{ 'name':'variable1Name', 'value':'variable1Value'}, { 'name':'variable2Name', 'type':'secretString', 'value':'variable2SecretValue'}]", value = "Variables set on environment")
  @Valid
 /**
   * Variables set on environment
  **/
  private List<Variable> variables = null;
 /**
   * Variables set on environment
   * @return variables
  **/
  @JsonProperty("variables")
  public List<Variable> getVariables() {
    return variables;
  }

  public void setVariables(List<Variable> variables) {
    this.variables = variables;
  }

  public VariableListEmbedded variables(List<Variable> variables) {
    this.variables = variables;
    return this;
  }

  public VariableListEmbedded addVariablesItem(Variable variablesItem) {
    this.variables.add(variablesItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

