goog.provide('API.Client.Repository');

/**
 * A sourcecode repository
 * @record
 */
API.Client.Repository = function() {}

/**
 * Repository name
 * @type {!string}
 * @export
 */
API.Client.Repository.prototype.repo;

/**
 * description
 * @type {!string}
 * @export
 */
API.Client.Repository.prototype.description;

/**
 * @type {!API.Client.Repository__links}
 * @export
 */
API.Client.Repository.prototype.links;

