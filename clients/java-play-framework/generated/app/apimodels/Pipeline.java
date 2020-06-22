package apimodels;

import apimodels.PipelineLinks;
import apimodels.PipelinePhase;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * Describes a __CI/CD Pipeline__
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-22T02:53:34.661Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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

    private final String value;

    TriggerEnum(String value) {
      this.value = value;
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

  @JsonProperty("trigger")
  private TriggerEnum trigger;

  /**
   * Pipeline status
   */
  public enum StatusEnum {
    IDLE("IDLE"),
    
    BUSY("BUSY"),
    
    WAITING("WAITING");

    private final String value;

    StatusEnum(String value) {
      this.value = value;
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
  @NotNull
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
    phases.add(phasesItem);
    return this;
  }

   /**
   * Pipeline phases in execution order
   * @return phases
  **/
  @NotNull
@Size(min=1,max=100)
@Valid
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
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

