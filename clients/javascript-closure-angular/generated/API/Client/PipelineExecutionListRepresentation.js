goog.provide('API.Client.PipelineExecutionListRepresentation');

/**
 * List of pipeline executions
 * @record
 */
API.Client.PipelineExecutionListRepresentation = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PipelineExecutionListRepresentation.prototype.totalNumberOfItems;

/**
 * @type {!API.Client.RequestedPageDetails}
 * @export
 */
API.Client.PipelineExecutionListRepresentation.prototype.page;

/**
 * @type {!API.Client.PipelineExecutionListRepresentation__embedded}
 * @export
 */
API.Client.PipelineExecutionListRepresentation.prototype.embedded;

/**
 * @type {!API.Client.PipelineExecutionListRepresentation__links}
 * @export
 */
API.Client.PipelineExecutionListRepresentation.prototype.links;

