package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.Date;
import org.openapitools.model.PipelineExecutionEmbedded;
import org.openapitools.model.PipelineExecutionLinks;

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
  * Wraps a pipeline execution
 **/
@ApiModel(description="Wraps a pipeline execution")
public class PipelineExecution  {
  
  @ApiModelProperty(value = "Pipeline execution identifier")
 /**
   * Pipeline execution identifier
  **/
  private String id;

  @ApiModelProperty(example = "14", value = "Identifier of the program. Unique within the space.")
 /**
   * Identifier of the program. Unique within the space.
  **/
  private String programId;

  @ApiModelProperty(example = "10", value = "Identifier of the pipeline. Unique within the space.")
 /**
   * Identifier of the pipeline. Unique within the space.
  **/
  private String pipelineId;

  @ApiModelProperty(value = "Version of the artifacts generated during this execution")
 /**
   * Version of the artifacts generated during this execution
  **/
  private String artifactsVersion;

  @ApiModelProperty(example = "0123456789ABCDE@AdobeID", value = "AdobeID who started the pipeline. Empty for auto triggered builds")
 /**
   * AdobeID who started the pipeline. Empty for auto triggered builds
  **/
  private String user;

@XmlType(name="StatusEnum")
@XmlEnum(String.class)
public enum StatusEnum {

@XmlEnumValue("NOT_STARTED") NOT_STARTED(String.valueOf("NOT_STARTED")), @XmlEnumValue("RUNNING") RUNNING(String.valueOf("RUNNING")), @XmlEnumValue("CANCELLING") CANCELLING(String.valueOf("CANCELLING")), @XmlEnumValue("CANCELLED") CANCELLED(String.valueOf("CANCELLED")), @XmlEnumValue("FINISHED") FINISHED(String.valueOf("FINISHED")), @XmlEnumValue("ERROR") ERROR(String.valueOf("ERROR")), @XmlEnumValue("FAILED") FAILED(String.valueOf("FAILED"));


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

  @ApiModelProperty(value = "Status of the execution")
 /**
   * Status of the execution
  **/
  private StatusEnum status;

@XmlType(name="TriggerEnum")
@XmlEnum(String.class)
public enum TriggerEnum {

@XmlEnumValue("ON_COMMIT") ON_COMMIT(String.valueOf("ON_COMMIT")), @XmlEnumValue("MANUAL") MANUAL(String.valueOf("MANUAL")), @XmlEnumValue("SCHEDULE") SCHEDULE(String.valueOf("SCHEDULE")), @XmlEnumValue("PUSH_UPGRADES") PUSH_UPGRADES(String.valueOf("PUSH_UPGRADES"));


    private String value;

    TriggerEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TriggerEnum fromValue(String value) {
        for (TriggerEnum b : TriggerEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "How the execution was triggered.")
 /**
   * How the execution was triggered.
  **/
  private TriggerEnum trigger;

  @ApiModelProperty(value = "Start time")
 /**
   * Start time
  **/
  private Date createdAt;

  @ApiModelProperty(value = "Date of last status change")
 /**
   * Date of last status change
  **/
  private Date updatedAt;

  @ApiModelProperty(value = "Date the execution reached a final state")
 /**
   * Date the execution reached a final state
  **/
  private Date finishedAt;

  @ApiModelProperty(value = "")
  private PipelineExecutionEmbedded embedded;

  @ApiModelProperty(value = "")
  private PipelineExecutionLinks links;
 /**
   * Pipeline execution identifier
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PipelineExecution id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Identifier of the program. Unique within the space.
   * @return programId
  **/
  @JsonProperty("programId")
  public String getProgramId() {
    return programId;
  }


 /**
   * Identifier of the pipeline. Unique within the space.
   * @return pipelineId
  **/
  @JsonProperty("pipelineId")
  public String getPipelineId() {
    return pipelineId;
  }


 /**
   * Version of the artifacts generated during this execution
   * @return artifactsVersion
  **/
  @JsonProperty("artifactsVersion")
  public String getArtifactsVersion() {
    return artifactsVersion;
  }

  public void setArtifactsVersion(String artifactsVersion) {
    this.artifactsVersion = artifactsVersion;
  }

  public PipelineExecution artifactsVersion(String artifactsVersion) {
    this.artifactsVersion = artifactsVersion;
    return this;
  }

 /**
   * AdobeID who started the pipeline. Empty for auto triggered builds
   * @return user
  **/
  @JsonProperty("user")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public PipelineExecution user(String user) {
    this.user = user;
    return this;
  }

 /**
   * Status of the execution
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

  public PipelineExecution status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
   * How the execution was triggered.
   * @return trigger
  **/
  @JsonProperty("trigger")
  public String getTrigger() {
    if (trigger == null) {
      return null;
    }
    return trigger.value();
  }

  public void setTrigger(TriggerEnum trigger) {
    this.trigger = trigger;
  }

  public PipelineExecution trigger(TriggerEnum trigger) {
    this.trigger = trigger;
    return this;
  }

 /**
   * Start time
   * @return createdAt
  **/
  @JsonProperty("createdAt")
  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public PipelineExecution createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

 /**
   * Date of last status change
   * @return updatedAt
  **/
  @JsonProperty("updatedAt")
  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  public PipelineExecution updatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
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

  public PipelineExecution finishedAt(Date finishedAt) {
    this.finishedAt = finishedAt;
    return this;
  }

 /**
   * Get embedded
   * @return embedded
  **/
  @JsonProperty("_embedded")
  public PipelineExecutionEmbedded getEmbedded() {
    return embedded;
  }

  public void setEmbedded(PipelineExecutionEmbedded embedded) {
    this.embedded = embedded;
  }

  public PipelineExecution embedded(PipelineExecutionEmbedded embedded) {
    this.embedded = embedded;
    return this;
  }

 /**
   * Get links
   * @return links
  **/
  @JsonProperty("_links")
  public PipelineExecutionLinks getLinks() {
    return links;
  }

  public void setLinks(PipelineExecutionLinks links) {
    this.links = links;
  }

  public PipelineExecution links(PipelineExecutionLinks links) {
    this.links = links;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

