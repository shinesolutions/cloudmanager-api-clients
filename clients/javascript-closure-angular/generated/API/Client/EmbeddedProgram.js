goog.provide('API.Client.embeddedProgram');

/**
 * Describes an __Embedded Program__
 * @record
 */
API.Client.EmbeddedProgram = function() {}

/**
 * Identifier of the program. Unique within the space.
 * @type {!string}
 * @export
 */
API.Client.EmbeddedProgram.prototype.id;

/**
 * Name of the program
 * @type {!string}
 * @export
 */
API.Client.EmbeddedProgram.prototype.name;

/**
 * Whether this Program has been enabled for Cloud Manager usage
 * @type {!boolean}
 * @export
 */
API.Client.EmbeddedProgram.prototype.enabled;

/**
 * Tenant Id
 * @type {!string}
 * @export
 */
API.Client.EmbeddedProgram.prototype.tenantId;

