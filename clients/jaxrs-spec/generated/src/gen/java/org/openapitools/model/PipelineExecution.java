package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.model.PipelineExecutionEmbedded;
import org.openapitools.model.PipelineExecutionLinks;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Wraps a pipeline execution
 **/
@ApiModel(description = "Wraps a pipeline execution")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2020-06-22T02:54:21.117Z[GMT]")
public class PipelineExecution   {
  
  private @Valid String id;
  private @Valid String programId;
  private @Valid String pipelineId;
  private @Valid String artifactsVersion;
  private @Valid String user;

public enum StatusEnum {

    NOT_STARTED(String.valueOf("NOT_STARTED")), RUNNING(String.valueOf("RUNNING")), CANCELLING(String.valueOf("CANCELLING")), CANCELLED(String.valueOf("CANCELLED")), FINISHED(String.valueOf("FINISHED")), ERROR(String.valueOf("ERROR")), FAILED(String.valueOf("FAILED"));


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

public enum TriggerEnum {

    ON_COMMIT(String.valueOf("ON_COMMIT")), MANUAL(String.valueOf("MANUAL")), SCHEDULE(String.valueOf("SCHEDULE")), PUSH_UPGRADES(String.valueOf("PUSH_UPGRADES"));


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
  private @Valid Date createdAt;
  private @Valid Date updatedAt;
  private @Valid Date finishedAt;
  private @Valid PipelineExecutionEmbedded embedded;
  private @Valid PipelineExecutionLinks links;

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
  public PipelineExecution createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(value = "Start time")
  @JsonProperty("createdAt")
  public Date getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Date of last status change
   **/
  public PipelineExecution updatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  
  @ApiModelProperty(value = "Date of last status change")
  @JsonProperty("updatedAt")
  public Date getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * Date the execution reached a final state
   **/
  public PipelineExecution finishedAt(Date finishedAt) {
    this.finishedAt = finishedAt;
    return this;
  }

  
  @ApiModelProperty(value = "Date the execution reached a final state")
  @JsonProperty("finishedAt")
  public Date getFinishedAt() {
    return finishedAt;
  }
  public void setFinishedAt(Date finishedAt) {
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
    return Objects.equals(this.id, pipelineExecution.id) &&
        Objects.equals(this.programId, pipelineExecution.programId) &&
        Objects.equals(this.pipelineId, pipelineExecution.pipelineId) &&
        Objects.equals(this.artifactsVersion, pipelineExecution.artifactsVersion) &&
        Objects.equals(this.user, pipelineExecution.user) &&
        Objects.equals(this.status, pipelineExecution.status) &&
        Objects.equals(this.trigger, pipelineExecution.trigger) &&
        Objects.equals(this.createdAt, pipelineExecution.createdAt) &&
        Objects.equals(this.updatedAt, pipelineExecution.updatedAt) &&
        Objects.equals(this.finishedAt, pipelineExecution.finishedAt) &&
        Objects.equals(this.embedded, pipelineExecution.embedded) &&
        Objects.equals(this.links, pipelineExecution.links);
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

