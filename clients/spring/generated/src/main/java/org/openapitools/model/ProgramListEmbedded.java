package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.EmbeddedProgram;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProgramListEmbedded
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-06-22T02:57:04.825Z[GMT]")

public class ProgramListEmbedded   {
  @JsonProperty("programs")
  @Valid
  private List<EmbeddedProgram> programs = null;

  public ProgramListEmbedded programs(List<EmbeddedProgram> programs) {
    this.programs = programs;
    return this;
  }

  public ProgramListEmbedded addProgramsItem(EmbeddedProgram programsItem) {
    if (this.programs == null) {
      this.programs = new ArrayList<>();
    }
    this.programs.add(programsItem);
    return this;
  }

  /**
   * Get programs
   * @return programs
  */
  @ApiModelProperty(value = "")

  @Valid

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

