package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import org.openapitools.model.PipelineExecutionStepStateLinks;

@Canonical
class PipelineExecutionStepState {
    
    String id
    
    String stepId
    
    String phaseId
    /* Name of the action */
    String action
    /* Target repository */
    String repository
    /* Target branch */
    String branch
    /* Target environment */
    String environment
    /* Target environment type */
    String environmentType
    /* Start time */
    Date startedAt
    /* Date the execution reached a final state */
    Date finishedAt
    /* Information about step result */
    Map<String, Object> details = new HashMap<String, Object>()
    /* Action status */
    String status
    
    PipelineExecutionStepStateLinks links
}
