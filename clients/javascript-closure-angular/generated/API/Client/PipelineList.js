goog.provide('API.Client.pipelineList');

/**
 * @record
 */
API.Client.PipelineList = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PipelineList.prototype.totalNumberOfItems;

/**
 * @type {!API.Client.pipelineList__embedded}
 * @export
 */
API.Client.PipelineList.prototype.embedded;

/**
 * @type {!API.Client.programList__links}
 * @export
 */
API.Client.PipelineList.prototype.links;

