goog.provide('API.Client.Variable');

/**
 * A named value than can be set on an Environment
 * @record
 */
API.Client.Variable = function() {}

/**
 * Name of the variable. Of a-z, A-Z, _ and 0-9 Cannot begin with a number.
 * @type {!string}
 * @export
 */
API.Client.Variable.prototype.name;

/**
 * Value of the variable. Read-Write for non-secrets, write-only for secrets.
 * @type {!string}
 * @export
 */
API.Client.Variable.prototype.value;

/**
 * Type of the variable. Default `string` if missing. Cannot be changed after creation.
 * @type {!string}
 * @export
 */
API.Client.Variable.prototype.type;

/** @enum {string} */
API.Client.Variable.TypeEnum = { 
  string: 'string',
  secretString: 'secretString',
}
