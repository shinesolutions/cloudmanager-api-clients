goog.provide('API.Client.RequestedPageDetails');

/**
 * Filtering and sorting page details
 * @record
 */
API.Client.RequestedPageDetails = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.RequestedPageDetails.prototype.start;

/**
 * @type {!number}
 * @export
 */
API.Client.RequestedPageDetails.prototype.limit;

/**
 * @type {!string}
 * @export
 */
API.Client.RequestedPageDetails.prototype.orderBy;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.RequestedPageDetails.prototype.property;

/**
 * @type {!string}
 * @export
 */
API.Client.RequestedPageDetails.prototype.type;

/**
 * @type {!number}
 * @export
 */
API.Client.RequestedPageDetails.prototype.next;

/**
 * @type {!number}
 * @export
 */
API.Client.RequestedPageDetails.prototype.prev;

