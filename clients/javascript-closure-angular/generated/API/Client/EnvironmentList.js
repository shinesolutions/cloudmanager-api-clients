goog.provide('API.Client.environmentList');

/**
 * @record
 */
API.Client.EnvironmentList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.EnvironmentList.prototype.totalNumberOfItems;

/**
 * @type {!API.Client.environmentList__embedded}
 * @export
 */
API.Client.EnvironmentList.prototype.embedded;

/**
 * @type {!API.Client.programList__links}
 * @export
 */
API.Client.EnvironmentList.prototype.links;

