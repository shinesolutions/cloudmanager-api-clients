package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.openapitools.model.PipelineLinks;
import org.openapitools.model.PipelinePhase;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Describes a __CI/CD Pipeline__
 **/
@ApiModel(description = "Describes a __CI/CD Pipeline__")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2020-06-22T02:54:21.117Z[GMT]")
public class Pipeline   {
  
  private @Valid String id;
  private @Valid String programId;
  private @Valid String name;

public enum TriggerEnum {

    ON_COMMIT(String.valueOf("ON_COMMIT")), MANUAL(String.valueOf("MANUAL")), SCHEDULE(String.valueOf("SCHEDULE"));


    private String value;

    TriggerEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static TriggerEnum fromValue(String value) {
        for (TriggerEnum b : TriggerEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private @Valid TriggerEnum trigger;

public enum StatusEnum {

    IDLE(String.valueOf("IDLE")), BUSY(String.valueOf("BUSY")), WAITING(String.valueOf("WAITING"));


    private String value;

    StatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
        for (StatusEnum b : StatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private @Valid StatusEnum status;
  private @Valid Date createdAt;
  private @Valid Date updatedAt;
  private @Valid Date lastStartedAt;
  private @Valid Date lastFinishedAt;
  private @Valid List<PipelinePhase> phases = new ArrayList<PipelinePhase>();
  private @Valid PipelineLinks links;

  /**
   * Identifier of the pipeline. Unique within the program.
   **/
  public Pipeline id(String id) {
    this.id = id;
    return this;
  }

  
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
  public Pipeline programId(String programId) {
    this.programId = programId;
    return this;
  }

  
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
  public Pipeline name(String name) {
    this.name = name;
    return this;
  }

  
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
  public Pipeline trigger(TriggerEnum trigger) {
    this.trigger = trigger;
    return this;
  }

  
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
  public Pipeline status(StatusEnum status) {
    this.status = status;
    return this;
  }

  
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
  public Pipeline createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
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
  public Pipeline updatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  
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
  public Pipeline lastStartedAt(Date lastStartedAt) {
    this.lastStartedAt = lastStartedAt;
    return this;
  }

  
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
  public Pipeline lastFinishedAt(Date lastFinishedAt) {
    this.lastFinishedAt = lastFinishedAt;
    return this;
  }

  
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
  public Pipeline phases(List<PipelinePhase> phases) {
    this.phases = phases;
    return this;
  }

  
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
  public Pipeline links(PipelineLinks links) {
    this.links = links;
    return this;
  }

  
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

