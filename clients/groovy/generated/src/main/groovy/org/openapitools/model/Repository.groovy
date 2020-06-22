package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RepositoryLinks;

@Canonical
class Repository {
    /* Repository name */
    String repo
    /* description */
    String description
    
    RepositoryLinks links
}
