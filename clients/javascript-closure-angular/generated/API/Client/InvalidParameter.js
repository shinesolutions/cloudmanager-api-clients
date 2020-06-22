goog.provide('API.Client.InvalidParameter');

/**
 * @record
 */
API.Client.InvalidParameter = function() {}

/**
 * Name of the invalid parameter.
 * @type {!string}
 * @export
 */
API.Client.InvalidParameter.prototype.name;

/**
 * Reason of why the parameter's value is not accepted.
 * @type {!string}
 * @export
 */
API.Client.InvalidParameter.prototype.reason;

