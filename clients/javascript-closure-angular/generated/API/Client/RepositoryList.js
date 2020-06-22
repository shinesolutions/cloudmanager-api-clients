goog.provide('API.Client.repositoryList');

/**
 * @record
 */
API.Client.RepositoryList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.RepositoryList.prototype.totalNumberOfItems;

/**
 * @type {!API.Client.repositoryList__embedded}
 * @export
 */
API.Client.RepositoryList.prototype.embedded;

/**
 * @type {!API.Client.programList__links}
 * @export
 */
API.Client.RepositoryList.prototype.links;

