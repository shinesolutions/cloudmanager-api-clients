package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.openapitools.model.PipelineLinks;
import org.openapitools.model.PipelinePhase;
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

/**
  * Describes a __CI/CD Pipeline__
 **/
@ApiModel(description="Describes a __CI/CD Pipeline__")
public class Pipeline  {
  
  @ApiModelProperty(example = "29", value = "Identifier of the pipeline. Unique within the program.")
 /**
   * Identifier of the pipeline. Unique within the program.
  **/
  private String id;

  @ApiModelProperty(example = "14", value = "Identifier of the program. Unique within the space.")
 /**
   * Identifier of the program. Unique within the space.
  **/
  private String programId;

  @ApiModelProperty(example = "AcmeCorp Main Pipeline", required = true, value = "Name of the pipeline")
 /**
   * Name of the pipeline
  **/
  private String name;

@XmlType(name="TriggerEnum")
@XmlEnum(String.class)
public enum TriggerEnum {

@XmlEnumValue("ON_COMMIT") ON_COMMIT(String.valueOf("ON_COMMIT")), @XmlEnumValue("MANUAL") MANUAL(String.valueOf("MANUAL")), @XmlEnumValue("SCHEDULE") SCHEDULE(String.valueOf("SCHEDULE"));


    private String value;

    TriggerEnum (String v) {
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

  @ApiModelProperty(example = "MANUAL", value = "How should the execution be triggered. ON_COMMIT: each time a PR is available and the Pipeline is idle then a execution is triggered. MANUAL: triggerd through UI or API. SCHEDULE: recurring schedule (not yet implemented}")
 /**
   * How should the execution be triggered. ON_COMMIT: each time a PR is available and the Pipeline is idle then a execution is triggered. MANUAL: triggerd through UI or API. SCHEDULE: recurring schedule (not yet implemented}
  **/
  private TriggerEnum trigger;

@XmlType(name="StatusEnum")
@XmlEnum(String.class)
public enum StatusEnum {

@XmlEnumValue("IDLE") IDLE(String.valueOf("IDLE")), @XmlEnumValue("BUSY") BUSY(String.valueOf("BUSY")), @XmlEnumValue("WAITING") WAITING(String.valueOf("WAITING"));


    private String value;

    StatusEnum (String v) {
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

  @ApiModelProperty(example = "RUNNING,FAILED", value = "Pipeline status")
 /**
   * Pipeline status
  **/
  private StatusEnum status;

  @ApiModelProperty(value = "Create date")
 /**
   * Create date
  **/
  private Date createdAt;

  @ApiModelProperty(value = "Update date")
 /**
   * Update date
  **/
  private Date updatedAt;

  @ApiModelProperty(value = "Last pipeline execution start")
 /**
   * Last pipeline execution start
  **/
  private Date lastStartedAt;

  @ApiModelProperty(value = "Last pipeline execution end")
 /**
   * Last pipeline execution end
  **/
  private Date lastFinishedAt;

  @ApiModelProperty(required = true, value = "Pipeline phases in execution order")
  @Valid
 /**
   * Pipeline phases in execution order
  **/
  private List<PipelinePhase> phases = new ArrayList<PipelinePhase>();

  @ApiModelProperty(value = "")
  @Valid
  private PipelineLinks links;
 /**
   * Identifier of the pipeline. Unique within the program.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Pipeline id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Identifier of the program. Unique within the space.
   * @return programId
  **/
  @JsonProperty("programId")
  public String getProgramId() {
    return programId;
  }

  public void setProgramId(String programId) {
    this.programId = programId;
  }

  public Pipeline programId(String programId) {
    this.programId = programId;
    return this;
  }

 /**
   * Name of the pipeline
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Pipeline name(String name) {
    this.name = name;
    return this;
  }

 /**
   * How should the execution be triggered. ON_COMMIT: each time a PR is available and the Pipeline is idle then a execution is triggered. MANUAL: triggerd through UI or API. SCHEDULE: recurring schedule (not yet implemented}
   * @return trigger
  **/
  @JsonProperty("trigger")
  public String getTrigger() {
    if (trigger == null) {
      return null;
    }
    return trigger.value();
  }

  public void setTrigger(TriggerEnum trigger) {
    this.trigger = trigger;
  }

  public Pipeline trigger(TriggerEnum trigger) {
    this.trigger = trigger;
    return this;
  }

 /**
   * Pipeline status
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    if (status == null) {
      return null;
    }
    return status.value();
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Pipeline status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
   * Create date
   * @return createdAt
  **/
  @JsonProperty("createdAt")
  public Date getCreatedAt() {
    return createdAt;
  }


 /**
   * Update date
   * @return updatedAt
  **/
  @JsonProperty("updatedAt")
  public Date getUpdatedAt() {
    return updatedAt;
  }


 /**
   * Last pipeline execution start
   * @return lastStartedAt
  **/
  @JsonProperty("lastStartedAt")
  public Date getLastStartedAt() {
    return lastStartedAt;
  }


 /**
   * Last pipeline execution end
   * @return lastFinishedAt
  **/
  @JsonProperty("lastFinishedAt")
  public Date getLastFinishedAt() {
    return lastFinishedAt;
  }


 /**
   * Pipeline phases in execution order
   * @return phases
  **/
  @JsonProperty("phases")
  @NotNull
 @Size(min=1,max=100)  public List<PipelinePhase> getPhases() {
    return phases;
  }

  public void setPhases(List<PipelinePhase> phases) {
    this.phases = phases;
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
   * Get links
   * @return links
  **/
  @JsonProperty("_links")
  public PipelineLinks getLinks() {
    return links;
  }

  public void setLinks(PipelineLinks links) {
    this.links = links;
  }

  public Pipeline links(PipelineLinks links) {
    this.links = links;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

