goog.provide('API.Client.programList');

/**
 * @record
 */
API.Client.ProgramList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.ProgramList.prototype.totalNumberOfItems;

/**
 * @type {!API.Client.programList__embedded}
 * @export
 */
API.Client.ProgramList.prototype.embedded;

/**
 * @type {!API.Client.programList__links}
 * @export
 */
API.Client.ProgramList.prototype.links;

