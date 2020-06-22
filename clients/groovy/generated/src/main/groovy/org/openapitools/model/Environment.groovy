package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.EnvironmentLinks;

@Canonical
class Environment {
    /* id */
    String id
    /* Identifier of the program. Unique within the space. */
    String programId
    /* Name of the environment */
    String name
    /* Description of the environment */
    String description
    /* Type of the environment */
    String type
    
    EnvironmentLinks links
}
