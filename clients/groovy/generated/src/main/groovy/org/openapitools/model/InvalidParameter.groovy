package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class InvalidParameter {
    /* Name of the invalid parameter. */
    String name
    /* Reason of why the parameter's value is not accepted. */
    String reason
}
