package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.PipelineLinks;
import org.openapitools.model.PipelinePhase;

@Canonical
class Pipeline {
    /* Identifier of the pipeline. Unique within the program. */
    String id
    /* Identifier of the program. Unique within the space. */
    String programId
    /* Name of the pipeline */
    String name
    /* How should the execution be triggered. ON_COMMIT: each time a PR is available and the Pipeline is idle then a execution is triggered. MANUAL: triggerd through UI or API. SCHEDULE: recurring schedule (not yet implemented} */
    String trigger
    /* Pipeline status */
    String status
    /* Create date */
    Date createdAt
    /* Update date */
    Date updatedAt
    /* Last pipeline execution start */
    Date lastStartedAt
    /* Last pipeline execution end */
    Date lastFinishedAt
    /* Pipeline phases in execution order */
    List<PipelinePhase> phases = new ArrayList<PipelinePhase>()
    
    PipelineLinks links
}
