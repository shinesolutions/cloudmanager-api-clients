goog.provide('API.Client.pipelinePhase');

/**
 * Describes a phase of a pipeline
 * @record
 */
API.Client.PipelinePhase = function() {}

/**
 * Name of the phase
 * @type {!string}
 * @export
 */
API.Client.PipelinePhase.prototype.name;

/**
 * Type of the phase
 * @type {!string}
 * @export
 */
API.Client.PipelinePhase.prototype.type;

/**
 * Identifier of the source repository. The code from this repository will be build at the start of this phase. Mandatory if type=BUILD
 * @type {!string}
 * @export
 */
API.Client.PipelinePhase.prototype.repositoryId;

/**
 * Name of the tracked branch or a fully qualified git tag (e.g. refs/tags/v1).  Assumed to be `master` if missing.
 * @type {!string}
 * @export
 */
API.Client.PipelinePhase.prototype.branch;

/**
 * Identifier of the target environment. Mandatory if type=DEPLOY
 * @type {!string}
 * @export
 */
API.Client.PipelinePhase.prototype.environmentId;

/** @enum {string} */
API.Client.PipelinePhase.TypeEnum = { 
  VALIDATE: 'VALIDATE',
  BUILD: 'BUILD',
  DEPLOY: 'DEPLOY',
}
