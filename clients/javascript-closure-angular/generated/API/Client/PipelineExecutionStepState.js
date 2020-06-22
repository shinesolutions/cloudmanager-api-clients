goog.provide('API.Client.pipelineExecutionStepState');

/**
 * Describes the status of a particular pipeline execution step for display purposes
 * @record
 */
API.Client.PipelineExecutionStepState = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.PipelineExecutionStepState.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.PipelineExecutionStepState.prototype.stepId;

/**
 * @type {!string}
 * @export
 */
API.Client.PipelineExecutionStepState.prototype.phaseId;

/**
 * Name of the action
 * @type {!string}
 * @export
 */
API.Client.PipelineExecutionStepState.prototype.action;

/**
 * Target repository
 * @type {!string}
 * @export
 */
API.Client.PipelineExecutionStepState.prototype.repository;

/**
 * Target branch
 * @type {!string}
 * @export
 */
API.Client.PipelineExecutionStepState.prototype.branch;

/**
 * Target environment
 * @type {!string}
 * @export
 */
API.Client.PipelineExecutionStepState.prototype.environment;

/**
 * Target environment type
 * @type {!string}
 * @export
 */
API.Client.PipelineExecutionStepState.prototype.environmentType;

/**
 * Start time
 * @type {!Date}
 * @export
 */
API.Client.PipelineExecutionStepState.prototype.startedAt;

/**
 * Date the execution reached a final state
 * @type {!Date}
 * @export
 */
API.Client.PipelineExecutionStepState.prototype.finishedAt;

/**
 * Information about step result
 * @type {!Object<!string, API.Client.Object>}
 * @export
 */
API.Client.PipelineExecutionStepState.prototype.details;

/**
 * Action status
 * @type {!string}
 * @export
 */
API.Client.PipelineExecutionStepState.prototype.status;

/**
 * @type {!API.Client.pipelineExecutionStepState__links}
 * @export
 */
API.Client.PipelineExecutionStepState.prototype.links;

/** @enum {string} */
API.Client.PipelineExecutionStepState.StatusEnum = { 
  NOT_STARTED: 'NOT_STARTED',
  RUNNING: 'RUNNING',
  FINISHED: 'FINISHED',
  ERROR: 'ERROR',
  ROLLING_BACK: 'ROLLING_BACK',
  ROLLED_BACK: 'ROLLED_BACK',
  WAITING: 'WAITING',
  CANCELLED: 'CANCELLED',
  FAILED: 'FAILED',
}
