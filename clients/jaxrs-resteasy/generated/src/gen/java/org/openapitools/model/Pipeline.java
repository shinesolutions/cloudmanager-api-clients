package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.openapitools.model.PipelineLinks;
import org.openapitools.model.PipelinePhase;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Describes a __CI/CD Pipeline__")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2020-06-22T02:54:09.173Z[GMT]")
public class Pipeline   {
  
  private String id;
  private String programId;
  private String name;

  /**
   * How should the execution be triggered. ON_COMMIT: each time a PR is available and the Pipeline is idle then a execution is triggered. MANUAL: triggerd through UI or API. SCHEDULE: recurring schedule (not yet implemented}
   */
  public enum TriggerEnum {
    ON_COMMIT("ON_COMMIT"),

        MANUAL("MANUAL"),

        SCHEDULE("SCHEDULE");
    private String value;

    TriggerEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private TriggerEnum trigger;

  /**
   * Pipeline status
   */
  public enum StatusEnum {
    IDLE("IDLE"),

        BUSY("BUSY"),

        WAITING("WAITING");
    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private StatusEnum status;
  private Date createdAt;
  private Date updatedAt;
  private Date lastStartedAt;
  private Date lastFinishedAt;
  private List<PipelinePhase> phases = new ArrayList<PipelinePhase>();
  private PipelineLinks links;

  /**
   * Identifier of the pipeline. Unique within the program.
   **/
  
  @ApiModelProperty(example = "29", value = "Identifier of the pipeline. Unique within the program.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Identifier of the program. Unique within the space.
   **/
  
  @ApiModelProperty(example = "14", value = "Identifier of the program. Unique within the space.")
  @JsonProperty("programId")
  public String getProgramId() {
    return programId;
  }
  public void setProgramId(String programId) {
    this.programId = programId;
  }

  /**
   * Name of the pipeline
   **/
  
  @ApiModelProperty(example = "AcmeCorp Main Pipeline", required = true, value = "Name of the pipeline")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * How should the execution be triggered. ON_COMMIT: each time a PR is available and the Pipeline is idle then a execution is triggered. MANUAL: triggerd through UI or API. SCHEDULE: recurring schedule (not yet implemented}
   **/
  
  @ApiModelProperty(example = "MANUAL", value = "How should the execution be triggered. ON_COMMIT: each time a PR is available and the Pipeline is idle then a execution is triggered. MANUAL: triggerd through UI or API. SCHEDULE: recurring schedule (not yet implemented}")
  @JsonProperty("trigger")
  public TriggerEnum getTrigger() {
    return trigger;
  }
  public void setTrigger(TriggerEnum trigger) {
    this.trigger = trigger;
  }

  /**
   * Pipeline status
   **/
  
  @ApiModelProperty(example = "RUNNING,FAILED", value = "Pipeline status")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * Create date
   **/
  
  @ApiModelProperty(value = "Create date")
  @JsonProperty("createdAt")
  public Date getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Update date
   **/
  
  @ApiModelProperty(value = "Update date")
  @JsonProperty("updatedAt")
  public Date getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * Last pipeline execution start
   **/
  
  @ApiModelProperty(value = "Last pipeline execution start")
  @JsonProperty("lastStartedAt")
  public Date getLastStartedAt() {
    return lastStartedAt;
  }
  public void setLastStartedAt(Date lastStartedAt) {
    this.lastStartedAt = lastStartedAt;
  }

  /**
   * Last pipeline execution end
   **/
  
  @ApiModelProperty(value = "Last pipeline execution end")
  @JsonProperty("lastFinishedAt")
  public Date getLastFinishedAt() {
    return lastFinishedAt;
  }
  public void setLastFinishedAt(Date lastFinishedAt) {
    this.lastFinishedAt = lastFinishedAt;
  }

  /**
   * Pipeline phases in execution order
   **/
  
  @ApiModelProperty(required = true, value = "Pipeline phases in execution order")
  @JsonProperty("phases")
  @NotNull
 @Size(min=1,max=100)  public List<PipelinePhase> getPhases() {
    return phases;
  }
  public void setPhases(List<PipelinePhase> phases) {
    this.phases = phases;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("_links")
  public PipelineLinks getLinks() {
    return links;
  }
  public void setLinks(PipelineLinks links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pipeline pipeline = (Pipeline) o;
    return Objects.equals(id, pipeline.id) &&
        Objects.equals(programId, pipeline.programId) &&
        Objects.equals(name, pipeline.name) &&
        Objects.equals(trigger, pipeline.trigger) &&
        Objects.equals(status, pipeline.status) &&
        Objects.equals(createdAt, pipeline.createdAt) &&
        Objects.equals(updatedAt, pipeline.updatedAt) &&
        Objects.equals(lastStartedAt, pipeline.lastStartedAt) &&
        Objects.equals(lastFinishedAt, pipeline.lastFinishedAt) &&
        Objects.equals(phases, pipeline.phases) &&
        Objects.equals(links, pipeline.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, programId, name, trigger, status, createdAt, updatedAt, lastStartedAt, lastFinishedAt, phases, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pipeline {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    programId: ").append(toIndentedString(programId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    lastStartedAt: ").append(toIndentedString(lastStartedAt)).append("\n");
    sb.append("    lastFinishedAt: ").append(toIndentedString(lastFinishedAt)).append("\n");
    sb.append("    phases: ").append(toIndentedString(phases)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

