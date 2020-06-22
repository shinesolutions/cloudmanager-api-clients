package apimodels;

import apimodels.PipelineExecutionStepStateLinks;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * Describes the status of a particular pipeline execution step for display purposes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-22T02:53:34.661Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PipelineExecutionStepState   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("stepId")
  private String stepId;

  @JsonProperty("phaseId")
  private String phaseId;

  @JsonProperty("action")
  private String action;

  @JsonProperty("repository")
  private String repository;

  @JsonProperty("branch")
  private String branch;

  @JsonProperty("environment")
  private String environment;

  @JsonProperty("environmentType")
  private String environmentType;

  @JsonProperty("startedAt")
  private OffsetDateTime startedAt;

  @JsonProperty("finishedAt")
  private OffsetDateTime finishedAt;

  @JsonProperty("details")
  private Map<String, Object> details = null;

  /**
   * Action status
   */
  public enum StatusEnum {
    NOT_STARTED("NOT_STARTED"),
    
    RUNNING("RUNNING"),
    
    FINISHED("FINISHED"),
    
    ERROR("ERROR"),
    
    ROLLING_BACK("ROLLING_BACK"),
    
    ROLLED_BACK("ROLLED_BACK"),
    
    WAITING("WAITING"),
    
    CANCELLED("CANCELLED"),
    
    FAILED("FAILED");

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

  @JsonProperty("_links")
  private PipelineExecutionStepStateLinks links;

  public PipelineExecutionStepState id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PipelineExecutionStepState stepId(String stepId) {
    this.stepId = stepId;
    return this;
  }

   /**
   * Get stepId
   * @return stepId
  **/
    public String getStepId() {
    return stepId;
  }

  public void setStepId(String stepId) {
    this.stepId = stepId;
  }

  public PipelineExecutionStepState phaseId(String phaseId) {
    this.phaseId = phaseId;
    return this;
  }

   /**
   * Get phaseId
   * @return phaseId
  **/
    public String getPhaseId() {
    return phaseId;
  }

  public void setPhaseId(String phaseId) {
    this.phaseId = phaseId;
  }

  public PipelineExecutionStepState action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Name of the action
   * @return action
  **/
    public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public PipelineExecutionStepState repository(String repository) {
    this.repository = repository;
    return this;
  }

   /**
   * Target repository
   * @return repository
  **/
    public String getRepository() {
    return repository;
  }

  public void setRepository(String repository) {
    this.repository = repository;
  }

  public PipelineExecutionStepState branch(String branch) {
    this.branch = branch;
    return this;
  }

   /**
   * Target branch
   * @return branch
  **/
    public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }

  public PipelineExecutionStepState environment(String environment) {
    this.environment = environment;
    return this;
  }

   /**
   * Target environment
   * @return environment
  **/
    public String getEnvironment() {
    return environment;
  }

  public void setEnvironment(String environment) {
    this.environment = environment;
  }

  public PipelineExecutionStepState environmentType(String environmentType) {
    this.environmentType = environmentType;
    return this;
  }

   /**
   * Target environment type
   * @return environmentType
  **/
    public String getEnvironmentType() {
    return environmentType;
  }

  public void setEnvironmentType(String environmentType) {
    this.environmentType = environmentType;
  }

  public PipelineExecutionStepState startedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
    return this;
  }

   /**
   * Start time
   * @return startedAt
  **/
  @Valid
  public OffsetDateTime getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
  }

  public PipelineExecutionStepState finishedAt(OffsetDateTime finishedAt) {
    this.finishedAt = finishedAt;
    return this;
  }

   /**
   * Date the execution reached a final state
   * @return finishedAt
  **/
  @Valid
  public OffsetDateTime getFinishedAt() {
    return finishedAt;
  }

  public void setFinishedAt(OffsetDateTime finishedAt) {
    this.finishedAt = finishedAt;
  }

  public PipelineExecutionStepState details(Map<String, Object> details) {
    this.details = details;
    return this;
  }

  public PipelineExecutionStepState putDetailsItem(String key, Object detailsItem) {
    if (this.details == null) {
      this.details = new HashMap<>();
    }
    this.details.put(key, detailsItem);
    return this;
  }

   /**
   * Information about step result
   * @return details
  **/
    public Map<String, Object> getDetails() {
    return details;
  }

  public void setDetails(Map<String, Object> details) {
    this.details = details;
  }

  public PipelineExecutionStepState status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Action status
   * @return status
  **/
    public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public PipelineExecutionStepState links(PipelineExecutionStepStateLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @Valid
  public PipelineExecutionStepStateLinks getLinks() {
    return links;
  }

  public void setLinks(PipelineExecutionStepStateLinks links) {
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
    PipelineExecutionStepState pipelineExecutionStepState = (PipelineExecutionStepState) o;
    return Objects.equals(id, pipelineExecutionStepState.id) &&
        Objects.equals(stepId, pipelineExecutionStepState.stepId) &&
        Objects.equals(phaseId, pipelineExecutionStepState.phaseId) &&
        Objects.equals(action, pipelineExecutionStepState.action) &&
        Objects.equals(repository, pipelineExecutionStepState.repository) &&
        Objects.equals(branch, pipelineExecutionStepState.branch) &&
        Objects.equals(environment, pipelineExecutionStepState.environment) &&
        Objects.equals(environmentType, pipelineExecutionStepState.environmentType) &&
        Objects.equals(startedAt, pipelineExecutionStepState.startedAt) &&
        Objects.equals(finishedAt, pipelineExecutionStepState.finishedAt) &&
        Objects.equals(details, pipelineExecutionStepState.details) &&
        Objects.equals(status, pipelineExecutionStepState.status) &&
        Objects.equals(links, pipelineExecutionStepState.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, stepId, phaseId, action, repository, branch, environment, environmentType, startedAt, finishedAt, details, status, links);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineExecutionStepState {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    stepId: ").append(toIndentedString(stepId)).append("\n");
    sb.append("    phaseId: ").append(toIndentedString(phaseId)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    environmentType: ").append(toIndentedString(environmentType)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

