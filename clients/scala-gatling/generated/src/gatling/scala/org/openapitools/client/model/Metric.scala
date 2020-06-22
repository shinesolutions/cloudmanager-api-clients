
package org.openapitools.client.model


case class Metric (
    /* KPI result identifier */
    _id: Option[String],
    /* Severity of the metric */
    _severity: Option[String],
    /* Whether metric is considered passed */
    _passed: Option[Boolean],
    /* Whether user override the failed metric */
    _override: Option[Boolean],
    /* Expected value for the metric */
    _actualValue: Option[String],
    /* Expected value for the metric */
    _expectedValue: Option[String],
    /* Comparator used for the metric */
    _comparator: Option[String],
    /* KPI identifier */
    _kpi: Option[String]
)
object Metric {
    def toStringBody(var_id: Object, var_severity: Object, var_passed: Object, var_override: Object, var_actualValue: Object, var_expectedValue: Object, var_comparator: Object, var_kpi: Object) =
        s"""
        | {
        | "id":$var_id,"severity":$var_severity,"passed":$var_passed,"override":$var_override,"actualValue":$var_actualValue,"expectedValue":$var_expectedValue,"comparator":$var_comparator,"kpi":$var_kpi
        | }
        """.stripMargin
}
