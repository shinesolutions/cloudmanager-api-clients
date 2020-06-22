package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class Variable {
    /* Name of the variable. Of a-z, A-Z, _ and 0-9 Cannot begin with a number. */
    String name
    /* Value of the variable. Read-Write for non-secrets, write-only for secrets. */
    String value
    /* Type of the variable. Default `string` if missing. Cannot be changed after creation. */
    String type
}
