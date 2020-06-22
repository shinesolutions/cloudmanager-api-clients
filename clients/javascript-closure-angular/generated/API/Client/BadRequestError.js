goog.provide('API.Client.BadRequestError');

/**
 * A Bad Request response error.
 * @record
 */
API.Client.BadRequestError = function() {}

/**
 * HTTP status code of the response.
 * @type {!number}
 * @export
 */
API.Client.BadRequestError.prototype.status;

/**
 * Error type identifier.
 * @type {!string}
 * @export
 */
API.Client.BadRequestError.prototype.type;

/**
 * A short summary of the error.
 * @type {!string}
 * @export
 */
API.Client.BadRequestError.prototype.title;

/**
 * Request's missing parameters.
 * @type {!Array<!API.Client.MissingParameter>}
 * @export
 */
API.Client.BadRequestError.prototype.missingParams;

/**
 * Request's invalid parameters.
 * @type {!Array<!API.Client.InvalidParameter>}
 * @export
 */
API.Client.BadRequestError.prototype.invalidParams;

