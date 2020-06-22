package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class Metric {
    /* KPI result identifier */
    String id
    /* Severity of the metric */
    String severity
    /* Whether metric is considered passed */
    Boolean passed = false
    /* Whether user override the failed metric */
    Boolean override = false
    /* Expected value for the metric */
    String actualValue
    /* Expected value for the metric */
    String expectedValue
    /* Comparator used for the metric */
    String comparator
    /* KPI identifier */
    String kpi
}
