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
	"errors"
)

// VariablesApiService is a service that implents the logic for the VariablesApiServicer
// This service should implement the business logic for every endpoint for the VariablesApi API. 
// Include any external packages or services that will be required by this service.
type VariablesApiService struct {
}

// NewVariablesApiService creates a default api service
func NewVariablesApiService() VariablesApiServicer {
	return &VariablesApiService{}
}

// GetEnvironmentVariables - List User Environment Variables
func (s *VariablesApiService) GetEnvironmentVariables(programId string, environmentId string, xGwImsOrgId string, authorization string, xApiKey string) (interface{}, error) {
	// TODO - update GetEnvironmentVariables with the required logic for this service method.
	// Add api_variables_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.
	return nil, errors.New("service method 'GetEnvironmentVariables' not implemented")
}

// PatchEnvironmentVariables - Patch User Environment Variables
func (s *VariablesApiService) PatchEnvironmentVariables(programId string, environmentId string, xGwImsOrgId string, authorization string, xApiKey string, contentType string, body []Variable) (interface{}, error) {
	// TODO - update PatchEnvironmentVariables with the required logic for this service method.
	// Add api_variables_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.
	return nil, errors.New("service method 'PatchEnvironmentVariables' not implemented")
}
