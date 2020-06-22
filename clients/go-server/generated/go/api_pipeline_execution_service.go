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

// PipelineExecutionApiService is a service that implents the logic for the PipelineExecutionApiServicer
// This service should implement the business logic for every endpoint for the PipelineExecutionApi API. 
// Include any external packages or services that will be required by this service.
type PipelineExecutionApiService struct {
}

// NewPipelineExecutionApiService creates a default api service
func NewPipelineExecutionApiService() PipelineExecutionApiServicer {
	return &PipelineExecutionApiService{}
}

// AdvancePipelineExecution - Advance
func (s *PipelineExecutionApiService) AdvancePipelineExecution(programId string, pipelineId string, executionId string, phaseId string, stepId string, xGwImsOrgId string, authorization string, xApiKey string, contentType string, body map[string]interface{}) (interface{}, error) {
	// TODO - update AdvancePipelineExecution with the required logic for this service method.
	// Add api_pipeline_execution_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.
	return nil, errors.New("service method 'AdvancePipelineExecution' not implemented")
}

// CancelPipelineExecutionStep - Cancel
func (s *PipelineExecutionApiService) CancelPipelineExecutionStep(programId string, pipelineId string, executionId string, phaseId string, stepId string, xGwImsOrgId string, authorization string, xApiKey string, contentType string, body map[string]interface{}) (interface{}, error) {
	// TODO - update CancelPipelineExecutionStep with the required logic for this service method.
	// Add api_pipeline_execution_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.
	return nil, errors.New("service method 'CancelPipelineExecutionStep' not implemented")
}

// GetCurrentExecution - Get current pipeline execution
func (s *PipelineExecutionApiService) GetCurrentExecution(programId string, pipelineId string, xGwImsOrgId string, authorization string, xApiKey string) (interface{}, error) {
	// TODO - update GetCurrentExecution with the required logic for this service method.
	// Add api_pipeline_execution_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.
	return nil, errors.New("service method 'GetCurrentExecution' not implemented")
}

// GetExecution - Get pipeline execution
func (s *PipelineExecutionApiService) GetExecution(programId string, pipelineId string, executionId string, xGwImsOrgId string, authorization string, xApiKey string) (interface{}, error) {
	// TODO - update GetExecution with the required logic for this service method.
	// Add api_pipeline_execution_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.
	return nil, errors.New("service method 'GetExecution' not implemented")
}

// GetExecutions - List Executions
func (s *PipelineExecutionApiService) GetExecutions(programId string, pipelineId string, xGwImsOrgId string, authorization string, xApiKey string, start string, limit int32) (interface{}, error) {
	// TODO - update GetExecutions with the required logic for this service method.
	// Add api_pipeline_execution_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.
	return nil, errors.New("service method 'GetExecutions' not implemented")
}

// GetStepLogs - Get logs
func (s *PipelineExecutionApiService) GetStepLogs(programId string, pipelineId string, executionId string, phaseId string, stepId string, xGwImsOrgId string, authorization string, xApiKey string, file string, accept string) (interface{}, error) {
	// TODO - update GetStepLogs with the required logic for this service method.
	// Add api_pipeline_execution_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.
	return nil, errors.New("service method 'GetStepLogs' not implemented")
}

// StartPipeline - Start the pipeline
func (s *PipelineExecutionApiService) StartPipeline(programId string, pipelineId string, xGwImsOrgId string, authorization string, xApiKey string, contentType string) (interface{}, error) {
	// TODO - update StartPipeline with the required logic for this service method.
	// Add api_pipeline_execution_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.
	return nil, errors.New("service method 'StartPipeline' not implemented")
}

// StepMetric - Get step metrics
func (s *PipelineExecutionApiService) StepMetric(programId string, pipelineId string, executionId string, phaseId string, stepId string, xGwImsOrgId string, authorization string, xApiKey string) (interface{}, error) {
	// TODO - update StepMetric with the required logic for this service method.
	// Add api_pipeline_execution_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.
	return nil, errors.New("service method 'StepMetric' not implemented")
}

// StepState - Get step state
func (s *PipelineExecutionApiService) StepState(programId string, pipelineId string, executionId string, phaseId string, stepId string, xGwImsOrgId string, authorization string, xApiKey string) (interface{}, error) {
	// TODO - update StepState with the required logic for this service method.
	// Add api_pipeline_execution_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.
	return nil, errors.New("service method 'StepState' not implemented")
}
