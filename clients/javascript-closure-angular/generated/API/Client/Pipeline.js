goog.provide('API.Client.Pipeline');

/**
 * Describes a __CI/CD Pipeline__
 * @record
 */
API.Client.Pipeline = function() {}

/**
 * Identifier of the pipeline. Unique within the program.
 * @type {!string}
 * @export
 */
API.Client.Pipeline.prototype.id;

/**
 * Identifier of the program. Unique within the space.
 * @type {!string}
 * @export
 */
API.Client.Pipeline.prototype.programId;

/**
 * Name of the pipeline
 * @type {!string}
 * @export
 */
API.Client.Pipeline.prototype.name;

/**
 * How should the execution be triggered. ON_COMMIT: each time a PR is available and the Pipeline is idle then a execution is triggered. MANUAL: triggerd through UI or API. SCHEDULE: recurring schedule (not yet implemented}
 * @type {!string}
 * @export
 */
API.Client.Pipeline.prototype.trigger;

/**
 * Pipeline status
 * @type {!string}
 * @export
 */
API.Client.Pipeline.prototype.status;

/**
 * Create date
 * @type {!Date}
 * @export
 */
API.Client.Pipeline.prototype.createdAt;

/**
 * Update date
 * @type {!Date}
 * @export
 */
API.Client.Pipeline.prototype.updatedAt;

/**
 * Last pipeline execution start
 * @type {!Date}
 * @export
 */
API.Client.Pipeline.prototype.lastStartedAt;

/**
 * Last pipeline execution end
 * @type {!Date}
 * @export
 */
API.Client.Pipeline.prototype.lastFinishedAt;

/**
 * Pipeline phases in execution order
 * @type {!Array<!API.Client.pipelinePhase>}
 * @export
 */
API.Client.Pipeline.prototype.phases;

/**
 * @type {!API.Client.Pipeline__links}
 * @export
 */
API.Client.Pipeline.prototype.links;

/** @enum {string} */
API.Client.Pipeline.TriggerEnum = { 
  ON_COMMIT: 'ON_COMMIT',
  MANUAL: 'MANUAL',
  SCHEDULE: 'SCHEDULE',
}
/** @enum {string} */
API.Client.Pipeline.StatusEnum = { 
  IDLE: 'IDLE',
  BUSY: 'BUSY',
  WAITING: 'WAITING',
}
