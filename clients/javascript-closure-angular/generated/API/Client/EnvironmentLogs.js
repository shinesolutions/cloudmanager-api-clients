goog.provide('API.Client.EnvironmentLogs');

/**
 * Logs of an Environment
 * @record
 */
API.Client.EnvironmentLogs = function() {}

/**
 * Name of the service
 * @type {!Array<!string>}
 * @export
 */
API.Client.EnvironmentLogs.prototype.service;

/**
 * Name of the Log
 * @type {!Array<!string>}
 * @export
 */
API.Client.EnvironmentLogs.prototype.name;

/**
 * Number of days
 * @type {!number}
 * @export
 */
API.Client.EnvironmentLogs.prototype.days;

/**
 * @type {!API.Client.EnvironmentLogs__links}
 * @export
 */
API.Client.EnvironmentLogs.prototype.links;

/**
 * @type {!API.Client.EnvironmentLogs__embedded}
 * @export
 */
API.Client.EnvironmentLogs.prototype.embedded;

