package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.PipelineLinks;
import org.openapitools.model.PipelinePhase;
import javax.validation.constraints.*;

/**
 * Describes a __CI/CD Pipeline__
 **/

import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;

@ApiModel(description = "Describes a __CI/CD Pipeline__")
public class Pipeline   {
  
  private String id;

  private String programId;

  private String name;


@XmlType(name="TriggerEnum")
@XmlEnum(String.class)
public enum TriggerEnum {

    @XmlEnumValue("ON_COMMIT") ON_COMMIT(String.valueOf("ON_COMMIT")), @XmlEnumValue("MANUAL") MANUAL(String.valueOf("MANUAL")), @XmlEnumValue("SCHEDULE") SCHEDULE(String.valueOf("SCHEDULE"));


    private String value;

    TriggerEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TriggerEnum fromValue(String value) {
        for (TriggerEnum b : TriggerEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private TriggerEnum trigger;


@XmlType(name="StatusEnum")
@XmlEnum(String.class)
public enum StatusEnum {

    @XmlEnumValue("IDLE") IDLE(String.valueOf("IDLE")), @XmlEnumValue("BUSY") BUSY(String.valueOf("BUSY")), @XmlEnumValue("WAITING") WAITING(String.valueOf("WAITING"));


    private String value;

    StatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
        for (StatusEnum b : StatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private StatusEnum status;

  private java.util.Date createdAt;

  private java.util.Date updatedAt;

  private java.util.Date lastStartedAt;

  private java.util.Date lastFinishedAt;

  private List<PipelinePhase> phases = new ArrayList<PipelinePhase>();

  private PipelineLinks links;


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
  public Pipeline createdAt(java.util.Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(value = "Create date")
  @JsonProperty("createdAt")
  public java.util.Date getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(java.util.Date createdAt) {
    this.createdAt = createdAt;
  }


  /**
   * Update date
   **/
  public Pipeline updatedAt(java.util.Date updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  
  @ApiModelProperty(value = "Update date")
  @JsonProperty("updatedAt")
  public java.util.Date getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(java.util.Date updatedAt) {
    this.updatedAt = updatedAt;
  }


  /**
   * Last pipeline execution start
   **/
  public Pipeline lastStartedAt(java.util.Date lastStartedAt) {
    this.lastStartedAt = lastStartedAt;
    return this;
  }

  
  @ApiModelProperty(value = "Last pipeline execution start")
  @JsonProperty("lastStartedAt")
  public java.util.Date getLastStartedAt() {
    return lastStartedAt;
  }
  public void setLastStartedAt(java.util.Date lastStartedAt) {
    this.lastStartedAt = lastStartedAt;
  }


  /**
   * Last pipeline execution end
   **/
  public Pipeline lastFinishedAt(java.util.Date lastFinishedAt) {
    this.lastFinishedAt = lastFinishedAt;
    return this;
  }

  
  @ApiModelProperty(value = "Last pipeline execution end")
  @JsonProperty("lastFinishedAt")
  public java.util.Date getLastFinishedAt() {
    return lastFinishedAt;
  }
  public void setLastFinishedAt(java.util.Date lastFinishedAt) {
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

  public Pipeline addPhasesItem(PipelinePhase phasesItem) {
    this.phases.add(phasesItem);
    return this;
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

