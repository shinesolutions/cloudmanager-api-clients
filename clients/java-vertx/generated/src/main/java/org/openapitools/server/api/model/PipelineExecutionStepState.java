package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.server.api.model.PipelineExecutionStepStateLinks;

/**
 * Describes the status of a particular pipeline execution step for display purposes
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PipelineExecutionStepState   {
  
  private String id;
  private String stepId;
  private String phaseId;
  private String action;
  private String repository;
  private String branch;
  private String environment;
  private String environmentType;
  private OffsetDateTime startedAt;
  private OffsetDateTime finishedAt;
  private Map<String, Object> details = new HashMap<>();


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
  private PipelineExecutionStepStateLinks links;

  public PipelineExecutionStepState () {

  }

  public PipelineExecutionStepState (String id, String stepId, String phaseId, String action, String repository, String branch, String environment, String environmentType, OffsetDateTime startedAt, OffsetDateTime finishedAt, Map<String, Object> details, StatusEnum status, PipelineExecutionStepStateLinks links) {
    this.id = id;
    this.stepId = stepId;
    this.phaseId = phaseId;
    this.action = action;
    this.repository = repository;
    this.branch = branch;
    this.environment = environment;
    this.environmentType = environmentType;
    this.startedAt = startedAt;
    this.finishedAt = finishedAt;
    this.details = details;
    this.status = status;
    this.links = links;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("stepId")
  public String getStepId() {
    return stepId;
  }
  public void setStepId(String stepId) {
    this.stepId = stepId;
  }

    
  @JsonProperty("phaseId")
  public String getPhaseId() {
    return phaseId;
  }
  public void setPhaseId(String phaseId) {
    this.phaseId = phaseId;
  }

    
  @JsonProperty("action")
  public String getAction() {
    return action;
  }
  public void setAction(String action) {
    this.action = action;
  }

    
  @JsonProperty("repository")
  public String getRepository() {
    return repository;
  }
  public void setRepository(String repository) {
    this.repository = repository;
  }

    
  @JsonProperty("branch")
  public String getBranch() {
    return branch;
  }
  public void setBranch(String branch) {
    this.branch = branch;
  }

    
  @JsonProperty("environment")
  public String getEnvironment() {
    return environment;
  }
  public void setEnvironment(String environment) {
    this.environment = environment;
  }

    
  @JsonProperty("environmentType")
  public String getEnvironmentType() {
    return environmentType;
  }
  public void setEnvironmentType(String environmentType) {
    this.environmentType = environmentType;
  }

    
  @JsonProperty("startedAt")
  public OffsetDateTime getStartedAt() {
    return startedAt;
  }
  public void setStartedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
  }

    
  @JsonProperty("finishedAt")
  public OffsetDateTime getFinishedAt() {
    return finishedAt;
  }
  public void setFinishedAt(OffsetDateTime finishedAt) {
    this.finishedAt = finishedAt;
  }

    
  @JsonProperty("details")
  public Map<String, Object> getDetails() {
    return details;
  }
  public void setDetails(Map<String, Object> details) {
    this.details = details;
  }

    
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

    
  @JsonProperty("_links")
  public PipelineExecutionStepStateLinks getLinks() {
    return links;
  }
  public void setLinks(PipelineExecutionStepStateLinks links) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
