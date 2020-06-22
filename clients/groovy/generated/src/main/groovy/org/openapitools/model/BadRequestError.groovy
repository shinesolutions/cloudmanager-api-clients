package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.InvalidParameter;
import org.openapitools.model.MissingParameter;

@Canonical
class BadRequestError {
    /* HTTP status code of the response. */
    Integer status
    /* Error type identifier. */
    String type
    /* A short summary of the error. */
    String title
    /* Request's missing parameters. */
    List<MissingParameter> missingParams = new ArrayList<MissingParameter>()
    /* Request's invalid parameters. */
    List<InvalidParameter> invalidParams = new ArrayList<InvalidParameter>()
}
