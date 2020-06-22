package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.PipelineExecutionStepStateLinks;



/**
 * Describes the status of a particular pipeline execution step for display purposes
 **/

@ApiModel(description = "Describes the status of a particular pipeline execution step for display purposes")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2020-06-22T02:53:13.843Z[GMT]")
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
  private Date startedAt;

  @JsonProperty("finishedAt")
  private Date finishedAt;

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

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("status")
  private StatusEnum status;

  @JsonProperty("_links")
  private PipelineExecutionStepStateLinks links;

  /**
   **/
  public PipelineExecutionStepState id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public PipelineExecutionStepState stepId(String stepId) {
    this.stepId = stepId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("stepId")
  public String getStepId() {
    return stepId;
  }
  public void setStepId(String stepId) {
    this.stepId = stepId;
  }

  /**
   **/
  public PipelineExecutionStepState phaseId(String phaseId) {
    this.phaseId = phaseId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("phaseId")
  public String getPhaseId() {
    return phaseId;
  }
  public void setPhaseId(String phaseId) {
    this.phaseId = phaseId;
  }

  /**
   * Name of the action
   **/
  public PipelineExecutionStepState action(String action) {
    this.action = action;
    return this;
  }

  
  @ApiModelProperty(example = "build", value = "Name of the action")
  @JsonProperty("action")
  public String getAction() {
    return action;
  }
  public void setAction(String action) {
    this.action = action;
  }

  /**
   * Target repository
   **/
  public PipelineExecutionStepState repository(String repository) {
    this.repository = repository;
    return this;
  }

  
  @ApiModelProperty(value = "Target repository")
  @JsonProperty("repository")
  public String getRepository() {
    return repository;
  }
  public void setRepository(String repository) {
    this.repository = repository;
  }

  /**
   * Target branch
   **/
  public PipelineExecutionStepState branch(String branch) {
    this.branch = branch;
    return this;
  }

  
  @ApiModelProperty(value = "Target branch")
  @JsonProperty("branch")
  public String getBranch() {
    return branch;
  }
  public void setBranch(String branch) {
    this.branch = branch;
  }

  /**
   * Target environment
   **/
  public PipelineExecutionStepState environment(String environment) {
    this.environment = environment;
    return this;
  }

  
  @ApiModelProperty(value = "Target environment")
  @JsonProperty("environment")
  public String getEnvironment() {
    return environment;
  }
  public void setEnvironment(String environment) {
    this.environment = environment;
  }

  /**
   * Target environment type
   **/
  public PipelineExecutionStepState environmentType(String environmentType) {
    this.environmentType = environmentType;
    return this;
  }

  
  @ApiModelProperty(value = "Target environment type")
  @JsonProperty("environmentType")
  public String getEnvironmentType() {
    return environmentType;
  }
  public void setEnvironmentType(String environmentType) {
    this.environmentType = environmentType;
  }

  /**
   * Start time
   **/
  public PipelineExecutionStepState startedAt(Date startedAt) {
    this.startedAt = startedAt;
    return this;
  }

  
  @ApiModelProperty(value = "Start time")
  @JsonProperty("startedAt")
  public Date getStartedAt() {
    return startedAt;
  }
  public void setStartedAt(Date startedAt) {
    this.startedAt = startedAt;
  }

  /**
   * Date the execution reached a final state
   **/
  public PipelineExecutionStepState finishedAt(Date finishedAt) {
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
   * Information about step result
   **/
  public PipelineExecutionStepState details(Map<String, Object> details) {
    this.details = details;
    return this;
  }

  
  @ApiModelProperty(example = "scheduled time", value = "Information about step result")
  @JsonProperty("details")
  public Map<String, Object> getDetails() {
    return details;
  }
  public void setDetails(Map<String, Object> details) {
    this.details = details;
  }

  /**
   * Action status
   **/
  public PipelineExecutionStepState status(StatusEnum status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(example = "NOT_STARTED", value = "Action status")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   **/
  public PipelineExecutionStepState links(PipelineExecutionStepStateLinks links) {
    this.links = links;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("_links")
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

