package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PipelineExecutionEmbedded;
import org.openapitools.model.PipelineExecutionLinks;
import javax.validation.constraints.*;

/**
 * Wraps a pipeline execution
 **/

import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;

@ApiModel(description = "Wraps a pipeline execution")
public class PipelineExecution   {
  
  private String id;

  private String programId;

  private String pipelineId;

  private String artifactsVersion;

  private String user;


@XmlType(name="StatusEnum")
@XmlEnum(String.class)
public enum StatusEnum {

    @XmlEnumValue("NOT_STARTED") NOT_STARTED(String.valueOf("NOT_STARTED")), @XmlEnumValue("RUNNING") RUNNING(String.valueOf("RUNNING")), @XmlEnumValue("CANCELLING") CANCELLING(String.valueOf("CANCELLING")), @XmlEnumValue("CANCELLED") CANCELLED(String.valueOf("CANCELLED")), @XmlEnumValue("FINISHED") FINISHED(String.valueOf("FINISHED")), @XmlEnumValue("ERROR") ERROR(String.valueOf("ERROR")), @XmlEnumValue("FAILED") FAILED(String.valueOf("FAILED"));


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


@XmlType(name="TriggerEnum")
@XmlEnum(String.class)
public enum TriggerEnum {

    @XmlEnumValue("ON_COMMIT") ON_COMMIT(String.valueOf("ON_COMMIT")), @XmlEnumValue("MANUAL") MANUAL(String.valueOf("MANUAL")), @XmlEnumValue("SCHEDULE") SCHEDULE(String.valueOf("SCHEDULE")), @XmlEnumValue("PUSH_UPGRADES") PUSH_UPGRADES(String.valueOf("PUSH_UPGRADES"));


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

  private java.util.Date createdAt;

  private java.util.Date updatedAt;

  private java.util.Date finishedAt;

  private PipelineExecutionEmbedded embedded;

  private PipelineExecutionLinks links;


  /**
   * Pipeline execution identifier
   **/
  public PipelineExecution id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Pipeline execution identifier")
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
  public PipelineExecution programId(String programId) {
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
   * Identifier of the pipeline. Unique within the space.
   **/
  public PipelineExecution pipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
    return this;
  }

  
  @ApiModelProperty(example = "10", value = "Identifier of the pipeline. Unique within the space.")
  @JsonProperty("pipelineId")
  public String getPipelineId() {
    return pipelineId;
  }
  public void setPipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
  }


  /**
   * Version of the artifacts generated during this execution
   **/
  public PipelineExecution artifactsVersion(String artifactsVersion) {
    this.artifactsVersion = artifactsVersion;
    return this;
  }

  
  @ApiModelProperty(value = "Version of the artifacts generated during this execution")
  @JsonProperty("artifactsVersion")
  public String getArtifactsVersion() {
    return artifactsVersion;
  }
  public void setArtifactsVersion(String artifactsVersion) {
    this.artifactsVersion = artifactsVersion;
  }


  /**
   * AdobeID who started the pipeline. Empty for auto triggered builds
   **/
  public PipelineExecution user(String user) {
    this.user = user;
    return this;
  }

  
  @ApiModelProperty(example = "0123456789ABCDE@AdobeID", value = "AdobeID who started the pipeline. Empty for auto triggered builds")
  @JsonProperty("user")
  public String getUser() {
    return user;
  }
  public void setUser(String user) {
    this.user = user;
  }


  /**
   * Status of the execution
   **/
  public PipelineExecution status(StatusEnum status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "Status of the execution")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * How the execution was triggered.
   **/
  public PipelineExecution trigger(TriggerEnum trigger) {
    this.trigger = trigger;
    return this;
  }

  
  @ApiModelProperty(value = "How the execution was triggered.")
  @JsonProperty("trigger")
  public TriggerEnum getTrigger() {
    return trigger;
  }
  public void setTrigger(TriggerEnum trigger) {
    this.trigger = trigger;
  }


  /**
   * Start time
   **/
  public PipelineExecution createdAt(java.util.Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(value = "Start time")
  @JsonProperty("createdAt")
  public java.util.Date getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(java.util.Date createdAt) {
    this.createdAt = createdAt;
  }


  /**
   * Date of last status change
   **/
  public PipelineExecution updatedAt(java.util.Date updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  
  @ApiModelProperty(value = "Date of last status change")
  @JsonProperty("updatedAt")
  public java.util.Date getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(java.util.Date updatedAt) {
    this.updatedAt = updatedAt;
  }


  /**
   * Date the execution reached a final state
   **/
  public PipelineExecution finishedAt(java.util.Date finishedAt) {
    this.finishedAt = finishedAt;
    return this;
  }

  
  @ApiModelProperty(value = "Date the execution reached a final state")
  @JsonProperty("finishedAt")
  public java.util.Date getFinishedAt() {
    return finishedAt;
  }
  public void setFinishedAt(java.util.Date finishedAt) {
    this.finishedAt = finishedAt;
  }


  /**
   **/
  public PipelineExecution embedded(PipelineExecutionEmbedded embedded) {
    this.embedded = embedded;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("_embedded")
  public PipelineExecutionEmbedded getEmbedded() {
    return embedded;
  }
  public void setEmbedded(PipelineExecutionEmbedded embedded) {
    this.embedded = embedded;
  }


  /**
   **/
  public PipelineExecution links(PipelineExecutionLinks links) {
    this.links = links;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("_links")
  public PipelineExecutionLinks getLinks() {
    return links;
  }
  public void setLinks(PipelineExecutionLinks links) {
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
    PipelineExecution pipelineExecution = (PipelineExecution) o;
    return Objects.equals(id, pipelineExecution.id) &&
        Objects.equals(programId, pipelineExecution.programId) &&
        Objects.equals(pipelineId, pipelineExecution.pipelineId) &&
        Objects.equals(artifactsVersion, pipelineExecution.artifactsVersion) &&
        Objects.equals(user, pipelineExecution.user) &&
        Objects.equals(status, pipelineExecution.status) &&
        Objects.equals(trigger, pipelineExecution.trigger) &&
        Objects.equals(createdAt, pipelineExecution.createdAt) &&
        Objects.equals(updatedAt, pipelineExecution.updatedAt) &&
        Objects.equals(finishedAt, pipelineExecution.finishedAt) &&
        Objects.equals(embedded, pipelineExecution.embedded) &&
        Objects.equals(links, pipelineExecution.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, programId, pipelineId, artifactsVersion, user, status, trigger, createdAt, updatedAt, finishedAt, embedded, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineExecution {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    programId: ").append(toIndentedString(programId)).append("\n");
    sb.append("    pipelineId: ").append(toIndentedString(pipelineId)).append("\n");
    sb.append("    artifactsVersion: ").append(toIndentedString(artifactsVersion)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("    embedded: ").append(toIndentedString(embedded)).append("\n");
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

