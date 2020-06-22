package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ProgramLinks;

@Canonical
class Program {
    /* Identifier of the program. Unique within the space. */
    String id
    /* Name of the program */
    String name
    /* Whether this Program has been enabled for Cloud Manager usage */
    Boolean enabled = false
    /* Tenant Id */
    String tenantId
    /* Organisation Id */
    String imsOrgId
    
    ProgramLinks links
}
