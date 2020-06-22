package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.PipelineLinks;
import com.prokarma.pkmst.model.PipelinePhase;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Describes a __CI/CD Pipeline__
 */
@ApiModel(description = "Describes a __CI/CD Pipeline__")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2020-06-22T02:53:26.039Z[GMT]")

public class Pipeline   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("programId")
  private String programId;

  @JsonProperty("name")
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

    @JsonCreator
    public static TriggerEnum fromValue(String text) {
      for (TriggerEnum b : TriggerEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("trigger")
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

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("status")
  private StatusEnum status;

  @JsonProperty("createdAt")
  private OffsetDateTime createdAt;

  @JsonProperty("updatedAt")
  private OffsetDateTime updatedAt;

  @JsonProperty("lastStartedAt")
  private OffsetDateTime lastStartedAt;

  @JsonProperty("lastFinishedAt")
  private OffsetDateTime lastFinishedAt;

  @JsonProperty("phases")
  
  private List<PipelinePhase> phases = new ArrayList<>();

  @JsonProperty("_links")
  private PipelineLinks links;

  public Pipeline id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of the pipeline. Unique within the program.
   * @return id
  **/
  @ApiModelProperty(example = "29", value = "Identifier of the pipeline. Unique within the program.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Pipeline programId(String programId) {
    this.programId = programId;
    return this;
  }

   /**
   * Identifier of the program. Unique within the space.
   * @return programId
  **/
  @ApiModelProperty(example = "14", value = "Identifier of the program. Unique within the space.")
  public String getProgramId() {
    return programId;
  }

  public void setProgramId(String programId) {
    this.programId = programId;
  }

  public Pipeline name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the pipeline
   * @return name
  **/
  @ApiModelProperty(example = "AcmeCorp Main Pipeline", required = true, value = "Name of the pipeline")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Pipeline trigger(TriggerEnum trigger) {
    this.trigger = trigger;
    return this;
  }

   /**
   * How should the execution be triggered. ON_COMMIT: each time a PR is available and the Pipeline is idle then a execution is triggered. MANUAL: triggerd through UI or API. SCHEDULE: recurring schedule (not yet implemented}
   * @return trigger
  **/
  @ApiModelProperty(example = "MANUAL", value = "How should the execution be triggered. ON_COMMIT: each time a PR is available and the Pipeline is idle then a execution is triggered. MANUAL: triggerd through UI or API. SCHEDULE: recurring schedule (not yet implemented}")
  public TriggerEnum getTrigger() {
    return trigger;
  }

  public void setTrigger(TriggerEnum trigger) {
    this.trigger = trigger;
  }

  public Pipeline status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Pipeline status
   * @return status
  **/
  @ApiModelProperty(example = "RUNNING,FAILED", value = "Pipeline status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Pipeline createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Create date
   * @return createdAt
  **/
  @ApiModelProperty(readOnly = true, value = "Create date")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Pipeline updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Update date
   * @return updatedAt
  **/
  @ApiModelProperty(readOnly = true, value = "Update date")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Pipeline lastStartedAt(OffsetDateTime lastStartedAt) {
    this.lastStartedAt = lastStartedAt;
    return this;
  }

   /**
   * Last pipeline execution start
   * @return lastStartedAt
  **/
  @ApiModelProperty(readOnly = true, value = "Last pipeline execution start")
  public OffsetDateTime getLastStartedAt() {
    return lastStartedAt;
  }

  public void setLastStartedAt(OffsetDateTime lastStartedAt) {
    this.lastStartedAt = lastStartedAt;
  }

  public Pipeline lastFinishedAt(OffsetDateTime lastFinishedAt) {
    this.lastFinishedAt = lastFinishedAt;
    return this;
  }

   /**
   * Last pipeline execution end
   * @return lastFinishedAt
  **/
  @ApiModelProperty(readOnly = true, value = "Last pipeline execution end")
  public OffsetDateTime getLastFinishedAt() {
    return lastFinishedAt;
  }

  public void setLastFinishedAt(OffsetDateTime lastFinishedAt) {
    this.lastFinishedAt = lastFinishedAt;
  }

  public Pipeline phases(List<PipelinePhase> phases) {
    this.phases = phases;
    return this;
  }

  public Pipeline addPhasesItem(PipelinePhase phasesItem) {
    this.phases.add(phasesItem);
    return this;
  }

   /**
   * Pipeline phases in execution order
   * @return phases
  **/
  @ApiModelProperty(required = true, value = "Pipeline phases in execution order")
  public List<PipelinePhase> getPhases() {
    return phases;
  }

  public void setPhases(List<PipelinePhase> phases) {
    this.phases = phases;
  }

  public Pipeline links(PipelineLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.id, pipeline.id) &&
        Objects.equals(this.programId, pipeline.programId) &&
        Objects.equals(this.name, pipeline.name) &&
        Objects.equals(this.trigger, pipeline.trigger) &&
        Objects.equals(this.status, pipeline.status) &&
        Objects.equals(this.createdAt, pipeline.createdAt) &&
        Objects.equals(this.updatedAt, pipeline.updatedAt) &&
        Objects.equals(this.lastStartedAt, pipeline.lastStartedAt) &&
        Objects.equals(this.lastFinishedAt, pipeline.lastFinishedAt) &&
        Objects.equals(this.phases, pipeline.phases) &&
        Objects.equals(this.links, pipeline.links);
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

