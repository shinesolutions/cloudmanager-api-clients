goog.provide('API.Client.Environment');

/**
 * An Environment that 
 * @record
 */
API.Client.Environment = function() {}

/**
 * id
 * @type {!string}
 * @export
 */
API.Client.Environment.prototype.id;

/**
 * Identifier of the program. Unique within the space.
 * @type {!string}
 * @export
 */
API.Client.Environment.prototype.programId;

/**
 * Name of the environment
 * @type {!string}
 * @export
 */
API.Client.Environment.prototype.name;

/**
 * Description of the environment
 * @type {!string}
 * @export
 */
API.Client.Environment.prototype.description;

/**
 * Type of the environment
 * @type {!string}
 * @export
 */
API.Client.Environment.prototype.type;

/**
 * @type {!API.Client.Environment__links}
 * @export
 */
API.Client.Environment.prototype.links;

/** @enum {string} */
API.Client.Environment.TypeEnum = { 
  dev: 'dev',
  stage: 'stage',
  prod: 'prod',
}
