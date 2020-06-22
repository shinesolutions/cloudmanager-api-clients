goog.provide('API.Client.pipelineExecution');

/**
 * Wraps a pipeline execution
 * @record
 */
API.Client.PipelineExecution = function() {}

/**
 * Pipeline execution identifier
 * @type {!string}
 * @export
 */
API.Client.PipelineExecution.prototype.id;

/**
 * Identifier of the program. Unique within the space.
 * @type {!string}
 * @export
 */
API.Client.PipelineExecution.prototype.programId;

/**
 * Identifier of the pipeline. Unique within the space.
 * @type {!string}
 * @export
 */
API.Client.PipelineExecution.prototype.pipelineId;

/**
 * Version of the artifacts generated during this execution
 * @type {!string}
 * @export
 */
API.Client.PipelineExecution.prototype.artifactsVersion;

/**
 * AdobeID who started the pipeline. Empty for auto triggered builds
 * @type {!string}
 * @export
 */
API.Client.PipelineExecution.prototype.user;

/**
 * Status of the execution
 * @type {!string}
 * @export
 */
API.Client.PipelineExecution.prototype.status;

/**
 * How the execution was triggered.
 * @type {!string}
 * @export
 */
API.Client.PipelineExecution.prototype.trigger;

/**
 * Start time
 * @type {!Date}
 * @export
 */
API.Client.PipelineExecution.prototype.createdAt;

/**
 * Date of last status change
 * @type {!Date}
 * @export
 */
API.Client.PipelineExecution.prototype.updatedAt;

/**
 * Date the execution reached a final state
 * @type {!Date}
 * @export
 */
API.Client.PipelineExecution.prototype.finishedAt;

/**
 * @type {!API.Client.pipelineExecution__embedded}
 * @export
 */
API.Client.PipelineExecution.prototype.embedded;

/**
 * @type {!API.Client.pipelineExecution__links}
 * @export
 */
API.Client.PipelineExecution.prototype.links;

/** @enum {string} */
API.Client.PipelineExecution.StatusEnum = { 
  NOT_STARTED: 'NOT_STARTED',
  RUNNING: 'RUNNING',
  CANCELLING: 'CANCELLING',
  CANCELLED: 'CANCELLED',
  FINISHED: 'FINISHED',
  ERROR: 'ERROR',
  FAILED: 'FAILED',
}
/** @enum {string} */
API.Client.PipelineExecution.TriggerEnum = { 
  ON_COMMIT: 'ON_COMMIT',
  MANUAL: 'MANUAL',
  SCHEDULE: 'SCHEDULE',
  PUSH_UPGRADES: 'PUSH_UPGRADES',
}
