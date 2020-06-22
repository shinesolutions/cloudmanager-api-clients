goog.provide('API.Client.Metric');

/**
 * Describes a __Metric__
 * @record
 */
API.Client.Metric = function() {}

/**
 * KPI result identifier
 * @type {!string}
 * @export
 */
API.Client.Metric.prototype.id;

/**
 * Severity of the metric
 * @type {!string}
 * @export
 */
API.Client.Metric.prototype.severity;

/**
 * Whether metric is considered passed
 * @type {!boolean}
 * @export
 */
API.Client.Metric.prototype.passed;

/**
 * Whether user override the failed metric
 * @type {!boolean}
 * @export
 */
API.Client.Metric.prototype.override;

/**
 * Expected value for the metric
 * @type {!string}
 * @export
 */
API.Client.Metric.prototype.actualValue;

/**
 * Expected value for the metric
 * @type {!string}
 * @export
 */
API.Client.Metric.prototype.expectedValue;

/**
 * Comparator used for the metric
 * @type {!string}
 * @export
 */
API.Client.Metric.prototype.comparator;

/**
 * KPI identifier
 * @type {!string}
 * @export
 */
API.Client.Metric.prototype.kpi;

/** @enum {string} */
API.Client.Metric.SeverityEnum = { 
  critical: 'critical',
  important: 'important',
  informational: 'informational',
}
/** @enum {string} */
API.Client.Metric.ComparatorEnum = { 
  GT: 'GT',
  GTE: 'GTE',
  LT: 'LT',
  LTE: 'LTE',
  EQ: 'EQ',
  NEQ: 'NEQ',
}
