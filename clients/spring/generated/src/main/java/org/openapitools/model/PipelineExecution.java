package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.model.PipelineExecutionEmbedded;
import org.openapitools.model.PipelineExecutionLinks;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Wraps a pipeline execution
 */
@ApiModel(description = "Wraps a pipeline execution")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-06-22T02:57:04.825Z[GMT]")

public class PipelineExecution   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("programId")
  private String programId;

  @JsonProperty("pipelineId")
  private String pipelineId;

  @JsonProperty("artifactsVersion")
  private String artifactsVersion;

  @JsonProperty("user")
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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  @JsonProperty("status")
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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  @JsonProperty("trigger")
  private TriggerEnum trigger;

  @JsonProperty("createdAt")
  private OffsetDateTime createdAt;

  @JsonProperty("updatedAt")
  private OffsetDateTime updatedAt;

  @JsonProperty("finishedAt")
  private OffsetDateTime finishedAt;

  @JsonProperty("_embedded")
  private PipelineExecutionEmbedded embedded;

  @JsonProperty("_links")
  private PipelineExecutionLinks links;

  public PipelineExecution id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Pipeline execution identifier
   * @return id
  */
  @ApiModelProperty(value = "Pipeline execution identifier")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PipelineExecution programId(String programId) {
    this.programId = programId;
    return this;
  }

  /**
   * Identifier of the program. Unique within the space.
   * @return programId
  */
  @ApiModelProperty(example = "14", readOnly = true, value = "Identifier of the program. Unique within the space.")


  public String getProgramId() {
    return programId;
  }

  public void setProgramId(String programId) {
    this.programId = programId;
  }

  public PipelineExecution pipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
    return this;
  }

  /**
   * Identifier of the pipeline. Unique within the space.
   * @return pipelineId
  */
  @ApiModelProperty(example = "10", readOnly = true, value = "Identifier of the pipeline. Unique within the space.")


  public String getPipelineId() {
    return pipelineId;
  }

  public void setPipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
  }

  public PipelineExecution artifactsVersion(String artifactsVersion) {
    this.artifactsVersion = artifactsVersion;
    return this;
  }

  /**
   * Version of the artifacts generated during this execution
   * @return artifactsVersion
  */
  @ApiModelProperty(value = "Version of the artifacts generated during this execution")


  public String getArtifactsVersion() {
    return artifactsVersion;
  }

  public void setArtifactsVersion(String artifactsVersion) {
    this.artifactsVersion = artifactsVersion;
  }

  public PipelineExecution user(String user) {
    this.user = user;
    return this;
  }

  /**
   * AdobeID who started the pipeline. Empty for auto triggered builds
   * @return user
  */
  @ApiModelProperty(example = "0123456789ABCDE@AdobeID", value = "AdobeID who started the pipeline. Empty for auto triggered builds")


  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public PipelineExecution status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the execution
   * @return status
  */
  @ApiModelProperty(value = "Status of the execution")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public PipelineExecution trigger(TriggerEnum trigger) {
    this.trigger = trigger;
    return this;
  }

  /**
   * How the execution was triggered.
   * @return trigger
  */
  @ApiModelProperty(value = "How the execution was triggered.")


  public TriggerEnum getTrigger() {
    return trigger;
  }

  public void setTrigger(TriggerEnum trigger) {
    this.trigger = trigger;
  }

  public PipelineExecution createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Start time
   * @return createdAt
  */
  @ApiModelProperty(value = "Start time")

  @Valid

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public PipelineExecution updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Date of last status change
   * @return updatedAt
  */
  @ApiModelProperty(value = "Date of last status change")

  @Valid

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public PipelineExecution finishedAt(OffsetDateTime finishedAt) {
    this.finishedAt = finishedAt;
    return this;
  }

  /**
   * Date the execution reached a final state
   * @return finishedAt
  */
  @ApiModelProperty(value = "Date the execution reached a final state")

  @Valid

  public OffsetDateTime getFinishedAt() {
    return finishedAt;
  }

  public void setFinishedAt(OffsetDateTime finishedAt) {
    this.finishedAt = finishedAt;
  }

  public PipelineExecution embedded(PipelineExecutionEmbedded embedded) {
    this.embedded = embedded;
    return this;
  }

  /**
   * Get embedded
   * @return embedded
  */
  @ApiModelProperty(value = "")

  @Valid

  public PipelineExecutionEmbedded getEmbedded() {
    return embedded;
  }

  public void setEmbedded(PipelineExecutionEmbedded embedded) {
    this.embedded = embedded;
  }

  public PipelineExecution links(PipelineExecutionLinks links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  */
  @ApiModelProperty(value = "")

  @Valid

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

