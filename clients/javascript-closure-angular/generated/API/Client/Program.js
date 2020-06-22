goog.provide('API.Client.Program');

/**
 * Describes a __Program__
 * @record
 */
API.Client.Program = function() {}

/**
 * Identifier of the program. Unique within the space.
 * @type {!string}
 * @export
 */
API.Client.Program.prototype.id;

/**
 * Name of the program
 * @type {!string}
 * @export
 */
API.Client.Program.prototype.name;

/**
 * Whether this Program has been enabled for Cloud Manager usage
 * @type {!boolean}
 * @export
 */
API.Client.Program.prototype.enabled;

/**
 * Tenant Id
 * @type {!string}
 * @export
 */
API.Client.Program.prototype.tenantId;

/**
 * Organisation Id
 * @type {!string}
 * @export
 */
API.Client.Program.prototype.imsOrgId;

/**
 * @type {!API.Client.Program__links}
 * @export
 */
API.Client.Program.prototype.links;

