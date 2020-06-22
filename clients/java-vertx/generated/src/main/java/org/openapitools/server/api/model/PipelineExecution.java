package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.openapitools.server.api.model.PipelineExecutionEmbedded;
import org.openapitools.server.api.model.PipelineExecutionLinks;

/**
 * Wraps a pipeline execution
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PipelineExecution   {
  
  private String id;
  private String programId;
  private String pipelineId;
  private String artifactsVersion;
  private String user;


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
      return value;
    }
  }

  private StatusEnum status;


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
      return value;
    }
  }

  private TriggerEnum trigger;
  private OffsetDateTime createdAt;
  private OffsetDateTime updatedAt;
  private OffsetDateTime finishedAt;
  private PipelineExecutionEmbedded embedded;
  private PipelineExecutionLinks links;

  public PipelineExecution () {

  }

  public PipelineExecution (String id, String programId, String pipelineId, String artifactsVersion, String user, StatusEnum status, TriggerEnum trigger, OffsetDateTime createdAt, OffsetDateTime updatedAt, OffsetDateTime finishedAt, PipelineExecutionEmbedded embedded, PipelineExecutionLinks links) {
    this.id = id;
    this.programId = programId;
    this.pipelineId = pipelineId;
    this.artifactsVersion = artifactsVersion;
    this.user = user;
    this.status = status;
    this.trigger = trigger;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.finishedAt = finishedAt;
    this.embedded = embedded;
    this.links = links;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("programId")
  public String getProgramId() {
    return programId;
  }
  public void setProgramId(String programId) {
    this.programId = programId;
  }

    
  @JsonProperty("pipelineId")
  public String getPipelineId() {
    return pipelineId;
  }
  public void setPipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
  }

    
  @JsonProperty("artifactsVersion")
  public String getArtifactsVersion() {
    return artifactsVersion;
  }
  public void setArtifactsVersion(String artifactsVersion) {
    this.artifactsVersion = artifactsVersion;
  }

    
  @JsonProperty("user")
  public String getUser() {
    return user;
  }
  public void setUser(String user) {
    this.user = user;
  }

    
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

    
  @JsonProperty("trigger")
  public TriggerEnum getTrigger() {
    return trigger;
  }
  public void setTrigger(TriggerEnum trigger) {
    this.trigger = trigger;
  }

    
  @JsonProperty("createdAt")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

    
  @JsonProperty("updatedAt")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

    
  @JsonProperty("finishedAt")
  public OffsetDateTime getFinishedAt() {
    return finishedAt;
  }
  public void setFinishedAt(OffsetDateTime finishedAt) {
    this.finishedAt = finishedAt;
  }

    
  @JsonProperty("_embedded")
  public PipelineExecutionEmbedded getEmbedded() {
    return embedded;
  }
  public void setEmbedded(PipelineExecutionEmbedded embedded) {
    this.embedded = embedded;
  }

    
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
