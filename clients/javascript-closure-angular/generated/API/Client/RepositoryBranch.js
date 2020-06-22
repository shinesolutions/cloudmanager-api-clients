goog.provide('API.Client.RepositoryBranch');

/**
 * Represents a Git Branch
 * @record
 */
API.Client.RepositoryBranch = function() {}

/**
 * Identifier of the program. Unique within the space
 * @type {!string}
 * @export
 */
API.Client.RepositoryBranch.prototype.programId;

/**
 * Identifier of the repository
 * @type {!number}
 * @export
 */
API.Client.RepositoryBranch.prototype.repositoryId;

/**
 * Name of the branch
 * @type {!string}
 * @export
 */
API.Client.RepositoryBranch.prototype.name;

/**
 * @type {!API.Client.RepositoryBranch__links}
 * @export
 */
API.Client.RepositoryBranch.prototype.links;

