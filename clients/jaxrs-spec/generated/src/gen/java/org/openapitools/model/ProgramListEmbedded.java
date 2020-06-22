package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.EmbeddedProgram;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2020-06-22T02:54:21.117Z[GMT]")
public class ProgramListEmbedded   {
  
  private @Valid List<EmbeddedProgram> programs = new ArrayList<EmbeddedProgram>();

  /**
   **/
  public ProgramListEmbedded programs(List<EmbeddedProgram> programs) {
    this.programs = programs;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("programs")
  public List<EmbeddedProgram> getPrograms() {
    return programs;
  }
  public void setPrograms(List<EmbeddedProgram> programs) {
    this.programs = programs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProgramListEmbedded programListEmbedded = (ProgramListEmbedded) o;
    return Objects.equals(this.programs, programListEmbedded.programs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(programs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgramListEmbedded {\n");
    
    sb.append("    programs: ").append(toIndentedString(programs)).append("\n");
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

