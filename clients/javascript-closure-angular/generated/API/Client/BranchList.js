goog.provide('API.Client.branchList');

/**
 * @record
 */
API.Client.BranchList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.BranchList.prototype.totalNumberOfItems;

/**
 * @type {!API.Client.branchList__embedded}
 * @export
 */
API.Client.BranchList.prototype.embedded;

/**
 * @type {!API.Client.programList__links}
 * @export
 */
API.Client.BranchList.prototype.links;

