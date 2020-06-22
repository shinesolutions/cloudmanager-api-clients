package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PipelineExecutionEmbedded;
import org.openapitools.model.PipelineExecutionLinks;

@Canonical
class PipelineExecution {
    /* Pipeline execution identifier */
    String id
    /* Identifier of the program. Unique within the space. */
    String programId
    /* Identifier of the pipeline. Unique within the space. */
    String pipelineId
    /* Version of the artifacts generated during this execution */
    String artifactsVersion
    /* AdobeID who started the pipeline. Empty for auto triggered builds */
    String user
    /* Status of the execution */
    String status
    /* How the execution was triggered. */
    String trigger
    /* Start time */
    Date createdAt
    /* Date of last status change */
    Date updatedAt
    /* Date the execution reached a final state */
    Date finishedAt
    
    PipelineExecutionEmbedded embedded
    
    PipelineExecutionLinks links
}
