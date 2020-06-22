package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.EnvironmentLogLinks;

@Canonical
class EnvironmentLog {
    /* Name of the service */
    String service
    /* Name of the Log */
    String name
    /* date of the Log */
    String date
    
    Long programId
    
    Long environmentId
    
    EnvironmentLogLinks links
}
