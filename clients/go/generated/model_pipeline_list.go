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
// PipelineList struct for PipelineList
type PipelineList struct {
	TotalNumberOfItems int32 `json:"_totalNumberOfItems,omitempty"`
	Embedded PipelineListEmbedded `json:"_embedded,omitempty"`
	Links ProgramListLinks `json:"_links,omitempty"`
}
