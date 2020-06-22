package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.PipelineExecutionStepStateLinks;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Describes the status of a particular pipeline execution step for display purposes
 **/
@ApiModel(description="Describes the status of a particular pipeline execution step for display purposes")
public class PipelineExecutionStepState  {
  
  @ApiModelProperty(value = "")
  private String id;

  @ApiModelProperty(value = "")
  private String stepId;

  @ApiModelProperty(value = "")
  private String phaseId;

  @ApiModelProperty(example = "build", value = "Name of the action")
 /**
   * Name of the action
  **/
  private String action;

  @ApiModelProperty(value = "Target repository")
 /**
   * Target repository
  **/
  private String repository;

  @ApiModelProperty(value = "Target branch")
 /**
   * Target branch
  **/
  private String branch;

  @ApiModelProperty(value = "Target environment")
 /**
   * Target environment
  **/
  private String environment;

  @ApiModelProperty(value = "Target environment type")
 /**
   * Target environment type
  **/
  private String environmentType;

  @ApiModelProperty(value = "Start time")
 /**
   * Start time
  **/
  private Date startedAt;

  @ApiModelProperty(value = "Date the execution reached a final state")
 /**
   * Date the execution reached a final state
  **/
  private Date finishedAt;

  @ApiModelProperty(example = "scheduled time", value = "Information about step result")
 /**
   * Information about step result
  **/
  private Map<String, Object> details = null;

@XmlType(name="StatusEnum")
@XmlEnum(String.class)
public enum StatusEnum {

@XmlEnumValue("NOT_STARTED") NOT_STARTED(String.valueOf("NOT_STARTED")), @XmlEnumValue("RUNNING") RUNNING(String.valueOf("RUNNING")), @XmlEnumValue("FINISHED") FINISHED(String.valueOf("FINISHED")), @XmlEnumValue("ERROR") ERROR(String.valueOf("ERROR")), @XmlEnumValue("ROLLING_BACK") ROLLING_BACK(String.valueOf("ROLLING_BACK")), @XmlEnumValue("ROLLED_BACK") ROLLED_BACK(String.valueOf("ROLLED_BACK")), @XmlEnumValue("WAITING") WAITING(String.valueOf("WAITING")), @XmlEnumValue("CANCELLED") CANCELLED(String.valueOf("CANCELLED")), @XmlEnumValue("FAILED") FAILED(String.valueOf("FAILED"));


    private String value;

    StatusEnum (String v) {
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

  @ApiModelProperty(example = "NOT_STARTED", value = "Action status")
 /**
   * Action status
  **/
  private StatusEnum status;

  @ApiModelProperty(value = "")
  @Valid
  private PipelineExecutionStepStateLinks links;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PipelineExecutionStepState id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get stepId
   * @return stepId
  **/
  @JsonProperty("stepId")
  public String getStepId() {
    return stepId;
  }

  public void setStepId(String stepId) {
    this.stepId = stepId;
  }

  public PipelineExecutionStepState stepId(String stepId) {
    this.stepId = stepId;
    return this;
  }

 /**
   * Get phaseId
   * @return phaseId
  **/
  @JsonProperty("phaseId")
  public String getPhaseId() {
    return phaseId;
  }

  public void setPhaseId(String phaseId) {
    this.phaseId = phaseId;
  }

  public PipelineExecutionStepState phaseId(String phaseId) {
    this.phaseId = phaseId;
    return this;
  }

 /**
   * Name of the action
   * @return action
  **/
  @JsonProperty("action")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public PipelineExecutionStepState action(String action) {
    this.action = action;
    return this;
  }

 /**
   * Target repository
   * @return repository
  **/
  @JsonProperty("repository")
  public String getRepository() {
    return repository;
  }

  public void setRepository(String repository) {
    this.repository = repository;
  }

  public PipelineExecutionStepState repository(String repository) {
    this.repository = repository;
    return this;
  }

 /**
   * Target branch
   * @return branch
  **/
  @JsonProperty("branch")
  public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }

  public PipelineExecutionStepState branch(String branch) {
    this.branch = branch;
    return this;
  }

 /**
   * Target environment
   * @return environment
  **/
  @JsonProperty("environment")
  public String getEnvironment() {
    return environment;
  }

  public void setEnvironment(String environment) {
    this.environment = environment;
  }

  public PipelineExecutionStepState environment(String environment) {
    this.environment = environment;
    return this;
  }

 /**
   * Target environment type
   * @return environmentType
  **/
  @JsonProperty("environmentType")
  public String getEnvironmentType() {
    return environmentType;
  }

  public void setEnvironmentType(String environmentType) {
    this.environmentType = environmentType;
  }

  public PipelineExecutionStepState environmentType(String environmentType) {
    this.environmentType = environmentType;
    return this;
  }

 /**
   * Start time
   * @return startedAt
  **/
  @JsonProperty("startedAt")
  public Date getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(Date startedAt) {
    this.startedAt = startedAt;
  }

  public PipelineExecutionStepState startedAt(Date startedAt) {
    this.startedAt = startedAt;
    return this;
  }

 /**
   * Date the execution reached a final state
   * @return finishedAt
  **/
  @JsonProperty("finishedAt")
  public Date getFinishedAt() {
    return finishedAt;
  }

  public void setFinishedAt(Date finishedAt) {
    this.finishedAt = finishedAt;
  }

  public PipelineExecutionStepState finishedAt(Date finishedAt) {
    this.finishedAt = finishedAt;
    return this;
  }

 /**
   * Information about step result
   * @return details
  **/
  @JsonProperty("details")
  public Map<String, Object> getDetails() {
    return details;
  }

  public void setDetails(Map<String, Object> details) {
    this.details = details;
  }

  public PipelineExecutionStepState details(Map<String, Object> details) {
    this.details = details;
    return this;
  }

  public PipelineExecutionStepState putDetailsItem(String key, Object detailsItem) {
    this.details.put(key, detailsItem);
    return this;
  }

 /**
   * Action status
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    if (status == null) {
      return null;
    }
    return status.value();
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public PipelineExecutionStepState status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
   * Get links
   * @return links
  **/
  @JsonProperty("_links")
  public PipelineExecutionStepStateLinks getLinks() {
    return links;
  }

  public void setLinks(PipelineExecutionStepStateLinks links) {
    this.links = links;
  }

  public PipelineExecutionStepState links(PipelineExecutionStepStateLinks links) {
    this.links = links;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

