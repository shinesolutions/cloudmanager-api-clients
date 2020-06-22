package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.model.PipelineExecutionEmbedded;
import org.openapitools.model.PipelineExecutionLinks;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Wraps a pipeline execution")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-06-22T02:54:15.715Z[GMT]")
public class PipelineExecution   {
  

  private String id;

  private String programId;

  private String pipelineId;

  private String artifactsVersion;

  private String user;

  /**
   * Status of the execution
   */
  public enum StatusEnum {
    NOT_STARTED("NOT_STARTED"),

        RUNNING("RUNNING"),

        CANCELLING("CANCELLING"),

        CANCELLED("CANCELLED"),

        FINISHED("FINISHED"),

        ERROR("ERROR"),

        FAILED("FAILED");
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

  /**
   * How the execution was triggered.
   */
  public enum TriggerEnum {
    ON_COMMIT("ON_COMMIT"),

        MANUAL("MANUAL"),

        SCHEDULE("SCHEDULE"),

        PUSH_UPGRADES("PUSH_UPGRADES");
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

  private Date createdAt;

  private Date updatedAt;

  private Date finishedAt;

  private PipelineExecutionEmbedded embedded;

  private PipelineExecutionLinks links;

  /**
   * Pipeline execution identifier
   **/
  
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("_links")
  public PipelineExecutionLinks getLinks() {
    return links;
  }
  public void setLinks(PipelineExecutionLinks links) {
    this.links = links;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

