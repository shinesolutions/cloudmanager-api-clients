goog.provide('API.Client.EnvironmentLog');

/**
 * Log from Environment
 * @record
 */
API.Client.EnvironmentLog = function() {}

/**
 * Name of the service
 * @type {!string}
 * @export
 */
API.Client.EnvironmentLog.prototype.service;

/**
 * Name of the Log
 * @type {!string}
 * @export
 */
API.Client.EnvironmentLog.prototype.name;

/**
 * date of the Log
 * @type {!string}
 * @export
 */
API.Client.EnvironmentLog.prototype.date;

/**
 * @type {!number}
 * @export
 */
API.Client.EnvironmentLog.prototype.programId;

/**
 * @type {!number}
 * @export
 */
API.Client.EnvironmentLog.prototype.environmentId;

/**
 * @type {!API.Client.EnvironmentLog__links}
 * @export
 */
API.Client.EnvironmentLog.prototype.links;

