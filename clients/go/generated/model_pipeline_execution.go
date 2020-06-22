/*
 * Cloud Manager API
 *
 * This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
 *
 * API version: 1.0.0
 * Contact: opensource@shinesolutions.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi
import (
	"time"
)
// PipelineExecution Wraps a pipeline execution
type PipelineExecution struct {
	// Pipeline execution identifier
	Id string `json:"id,omitempty"`
	// Identifier of the program. Unique within the space.
	ProgramId string `json:"programId,omitempty"`
	// Identifier of the pipeline. Unique within the space.
	PipelineId string `json:"pipelineId,omitempty"`
	// Version of the artifacts generated during this execution
	ArtifactsVersion string `json:"artifactsVersion,omitempty"`
	// AdobeID who started the pipeline. Empty for auto triggered builds
	User string `json:"user,omitempty"`
	// Status of the execution
	Status string `json:"status,omitempty"`
	// How the execution was triggered.
	Trigger string `json:"trigger,omitempty"`
	// Start time
	CreatedAt time.Time `json:"createdAt,omitempty"`
	// Date of last status change
	UpdatedAt time.Time `json:"updatedAt,omitempty"`
	// Date the execution reached a final state
	FinishedAt time.Time `json:"finishedAt,omitempty"`
	Embedded PipelineExecutionEmbedded `json:"_embedded,omitempty"`
	Links PipelineExecutionLinks `json:"_links,omitempty"`
}
