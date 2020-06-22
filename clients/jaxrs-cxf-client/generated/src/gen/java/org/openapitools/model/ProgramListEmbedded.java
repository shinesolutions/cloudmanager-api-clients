package org.openapitools.model;

import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.EmbeddedProgram;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ProgramListEmbedded  {
  
  @ApiModelProperty(value = "")
  private List<EmbeddedProgram> programs = null;
 /**
   * Get programs
   * @return programs
  **/
  @JsonProperty("programs")
  public List<EmbeddedProgram> getPrograms() {
    return programs;
  }

  public void setPrograms(List<EmbeddedProgram> programs) {
    this.programs = programs;
  }

  public ProgramListEmbedded programs(List<EmbeddedProgram> programs) {
    this.programs = programs;
    return this;
  }

  public ProgramListEmbedded addProgramsItem(EmbeddedProgram programsItem) {
    this.programs.add(programsItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

