package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class PipelinePhase {
    /* Name of the phase */
    String name
    /* Type of the phase */
    String type
    /* Identifier of the source repository. The code from this repository will be build at the start of this phase. Mandatory if type=BUILD */
    String repositoryId
    /* Name of the tracked branch or a fully qualified git tag (e.g. refs/tags/v1).  Assumed to be `master` if missing. */
    String branch
    /* Identifier of the target environment. Mandatory if type=DEPLOY */
    String environmentId
}
