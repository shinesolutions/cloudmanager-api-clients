package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class MissingParameter {
    /* Name of the missing parameter. */
    String name
    /* Type of the missing parameter. */
    String type
}
