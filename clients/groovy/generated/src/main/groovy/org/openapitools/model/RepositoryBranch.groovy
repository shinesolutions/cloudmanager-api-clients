package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RepositoryBranchLinks;

@Canonical
class RepositoryBranch {
    /* Identifier of the program. Unique within the space */
    String programId
    /* Identifier of the repository */
    Long repositoryId
    /* Name of the branch */
    String name
    
    RepositoryBranchLinks links
}
