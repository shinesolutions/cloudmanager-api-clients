package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.EmbeddedProgram;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProgramListEmbedded   {
  
  private List<EmbeddedProgram> programs = new ArrayList<>();

  public ProgramListEmbedded () {

  }

  public ProgramListEmbedded (List<EmbeddedProgram> programs) {
    this.programs = programs;
  }

    
  @JsonProperty("programs")
  public List<EmbeddedProgram> getPrograms() {
    return programs;
  }
  public void setPrograms(List<EmbeddedProgram> programs) {
    this.programs = programs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProgramListEmbedded programListEmbedded = (ProgramListEmbedded) o;
    return Objects.equals(programs, programListEmbedded.programs);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
