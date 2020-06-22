package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.PipelineLinks;
import org.openapitools.server.api.model.PipelinePhase;

/**
 * Describes a __CI/CD Pipeline__
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Pipeline   {
  
  private String id;
  private String programId;
  private String name;


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
      return value;
    }
  }

  private TriggerEnum trigger;


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
      return value;
    }
  }

  private StatusEnum status;
  private OffsetDateTime createdAt;
  private OffsetDateTime updatedAt;
  private OffsetDateTime lastStartedAt;
  private OffsetDateTime lastFinishedAt;
  private List<PipelinePhase> phases = new ArrayList<>();
  private PipelineLinks links;

  public Pipeline () {

  }

  public Pipeline (String id, String programId, String name, TriggerEnum trigger, StatusEnum status, OffsetDateTime createdAt, OffsetDateTime updatedAt, OffsetDateTime lastStartedAt, OffsetDateTime lastFinishedAt, List<PipelinePhase> phases, PipelineLinks links) {
    this.id = id;
    this.programId = programId;
    this.name = name;
    this.trigger = trigger;
    this.status = status;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.lastStartedAt = lastStartedAt;
    this.lastFinishedAt = lastFinishedAt;
    this.phases = phases;
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

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("trigger")
  public TriggerEnum getTrigger() {
    return trigger;
  }
  public void setTrigger(TriggerEnum trigger) {
    this.trigger = trigger;
  }

    
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
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

    
  @JsonProperty("lastStartedAt")
  public OffsetDateTime getLastStartedAt() {
    return lastStartedAt;
  }
  public void setLastStartedAt(OffsetDateTime lastStartedAt) {
    this.lastStartedAt = lastStartedAt;
  }

    
  @JsonProperty("lastFinishedAt")
  public OffsetDateTime getLastFinishedAt() {
    return lastFinishedAt;
  }
  public void setLastFinishedAt(OffsetDateTime lastFinishedAt) {
    this.lastFinishedAt = lastFinishedAt;
  }

    
  @JsonProperty("phases")
  public List<PipelinePhase> getPhases() {
    return phases;
  }
  public void setPhases(List<PipelinePhase> phases) {
    this.phases = phases;
  }

    
  @JsonProperty("_links")
  public PipelineLinks getLinks() {
    return links;
  }
  public void setLinks(PipelineLinks links) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
