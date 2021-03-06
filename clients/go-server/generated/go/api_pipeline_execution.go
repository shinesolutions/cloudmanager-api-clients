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
	"encoding/json"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// A PipelineExecutionApiController binds http requests to an api service and writes the service results to the http response
type PipelineExecutionApiController struct {
	service PipelineExecutionApiServicer
}

// NewPipelineExecutionApiController creates a default api controller
func NewPipelineExecutionApiController(s PipelineExecutionApiServicer) Router {
	return &PipelineExecutionApiController{ service: s }
}

// Routes returns all of the api route for the PipelineExecutionApiController
func (c *PipelineExecutionApiController) Routes() Routes {
	return Routes{ 
		{
			"AdvancePipelineExecution",
			strings.ToUpper("Put"),
			"/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/advance",
			c.AdvancePipelineExecution,
		},
		{
			"CancelPipelineExecutionStep",
			strings.ToUpper("Put"),
			"/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/cancel",
			c.CancelPipelineExecutionStep,
		},
		{
			"GetCurrentExecution",
			strings.ToUpper("Get"),
			"/api/program/{programId}/pipeline/{pipelineId}/execution",
			c.GetCurrentExecution,
		},
		{
			"GetExecution",
			strings.ToUpper("Get"),
			"/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}",
			c.GetExecution,
		},
		{
			"GetExecutions",
			strings.ToUpper("Get"),
			"/api/program/{programId}/pipeline/{pipelineId}/executions",
			c.GetExecutions,
		},
		{
			"GetStepLogs",
			strings.ToUpper("Get"),
			"/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/logs",
			c.GetStepLogs,
		},
		{
			"StartPipeline",
			strings.ToUpper("Put"),
			"/api/program/{programId}/pipeline/{pipelineId}/execution",
			c.StartPipeline,
		},
		{
			"StepMetric",
			strings.ToUpper("Get"),
			"/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/metrics",
			c.StepMetric,
		},
		{
			"StepState",
			strings.ToUpper("Get"),
			"/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}",
			c.StepState,
		},
	}
}

// AdvancePipelineExecution - Advance
func (c *PipelineExecutionApiController) AdvancePipelineExecution(w http.ResponseWriter, r *http.Request) { 
	params := mux.Vars(r)
	programId := params["programId"]
	pipelineId := params["pipelineId"]
	executionId := params["executionId"]
	phaseId := params["phaseId"]
	stepId := params["stepId"]
	xGwImsOrgId := r.Header.Get("xGwImsOrgId")
	authorization := r.Header.Get("authorization")
	xApiKey := r.Header.Get("xApiKey")
	contentType := r.Header.Get("contentType")
	body := &map[string]interface{}{}
	if err := json.NewDecoder(r.Body).Decode(&body); err != nil {
		w.WriteHeader(500)
		return
	}
	
	result, err := c.service.AdvancePipelineExecution(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, contentType, *body)
	if err != nil {
		w.WriteHeader(500)
		return
	}
	
	EncodeJSONResponse(result, nil, w)
}

// CancelPipelineExecutionStep - Cancel
func (c *PipelineExecutionApiController) CancelPipelineExecutionStep(w http.ResponseWriter, r *http.Request) { 
	params := mux.Vars(r)
	programId := params["programId"]
	pipelineId := params["pipelineId"]
	executionId := params["executionId"]
	phaseId := params["phaseId"]
	stepId := params["stepId"]
	xGwImsOrgId := r.Header.Get("xGwImsOrgId")
	authorization := r.Header.Get("authorization")
	xApiKey := r.Header.Get("xApiKey")
	contentType := r.Header.Get("contentType")
	body := &map[string]interface{}{}
	if err := json.NewDecoder(r.Body).Decode(&body); err != nil {
		w.WriteHeader(500)
		return
	}
	
	result, err := c.service.CancelPipelineExecutionStep(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, contentType, *body)
	if err != nil {
		w.WriteHeader(500)
		return
	}
	
	EncodeJSONResponse(result, nil, w)
}

// GetCurrentExecution - Get current pipeline execution
func (c *PipelineExecutionApiController) GetCurrentExecution(w http.ResponseWriter, r *http.Request) { 
	params := mux.Vars(r)
	programId := params["programId"]
	pipelineId := params["pipelineId"]
	xGwImsOrgId := r.Header.Get("xGwImsOrgId")
	authorization := r.Header.Get("authorization")
	xApiKey := r.Header.Get("xApiKey")
	result, err := c.service.GetCurrentExecution(programId, pipelineId, xGwImsOrgId, authorization, xApiKey)
	if err != nil {
		w.WriteHeader(500)
		return
	}
	
	EncodeJSONResponse(result, nil, w)
}

// GetExecution - Get pipeline execution
func (c *PipelineExecutionApiController) GetExecution(w http.ResponseWriter, r *http.Request) { 
	params := mux.Vars(r)
	programId := params["programId"]
	pipelineId := params["pipelineId"]
	executionId := params["executionId"]
	xGwImsOrgId := r.Header.Get("xGwImsOrgId")
	authorization := r.Header.Get("authorization")
	xApiKey := r.Header.Get("xApiKey")
	result, err := c.service.GetExecution(programId, pipelineId, executionId, xGwImsOrgId, authorization, xApiKey)
	if err != nil {
		w.WriteHeader(500)
		return
	}
	
	EncodeJSONResponse(result, nil, w)
}

// GetExecutions - List Executions
func (c *PipelineExecutionApiController) GetExecutions(w http.ResponseWriter, r *http.Request) { 
	params := mux.Vars(r)
	query := r.URL.Query()
	programId := params["programId"]
	pipelineId := params["pipelineId"]
	xGwImsOrgId := r.Header.Get("xGwImsOrgId")
	authorization := r.Header.Get("authorization")
	xApiKey := r.Header.Get("xApiKey")
	start := query.Get("start")
	limit := query.Get("limit")
	result, err := c.service.GetExecutions(programId, pipelineId, xGwImsOrgId, authorization, xApiKey, start, limit)
	if err != nil {
		w.WriteHeader(500)
		return
	}
	
	EncodeJSONResponse(result, nil, w)
}

// GetStepLogs - Get logs
func (c *PipelineExecutionApiController) GetStepLogs(w http.ResponseWriter, r *http.Request) { 
	params := mux.Vars(r)
	query := r.URL.Query()
	programId := params["programId"]
	pipelineId := params["pipelineId"]
	executionId := params["executionId"]
	phaseId := params["phaseId"]
	stepId := params["stepId"]
	xGwImsOrgId := r.Header.Get("xGwImsOrgId")
	authorization := r.Header.Get("authorization")
	xApiKey := r.Header.Get("xApiKey")
	file := query.Get("file")
	accept := r.Header.Get("accept")
	result, err := c.service.GetStepLogs(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey, file, accept)
	if err != nil {
		w.WriteHeader(500)
		return
	}
	
	EncodeJSONResponse(result, nil, w)
}

// StartPipeline - Start the pipeline
func (c *PipelineExecutionApiController) StartPipeline(w http.ResponseWriter, r *http.Request) { 
	params := mux.Vars(r)
	programId := params["programId"]
	pipelineId := params["pipelineId"]
	xGwImsOrgId := r.Header.Get("xGwImsOrgId")
	authorization := r.Header.Get("authorization")
	xApiKey := r.Header.Get("xApiKey")
	contentType := r.Header.Get("contentType")
	result, err := c.service.StartPipeline(programId, pipelineId, xGwImsOrgId, authorization, xApiKey, contentType)
	if err != nil {
		w.WriteHeader(500)
		return
	}
	
	EncodeJSONResponse(result, nil, w)
}

// StepMetric - Get step metrics
func (c *PipelineExecutionApiController) StepMetric(w http.ResponseWriter, r *http.Request) { 
	params := mux.Vars(r)
	programId := params["programId"]
	pipelineId := params["pipelineId"]
	executionId := params["executionId"]
	phaseId := params["phaseId"]
	stepId := params["stepId"]
	xGwImsOrgId := r.Header.Get("xGwImsOrgId")
	authorization := r.Header.Get("authorization")
	xApiKey := r.Header.Get("xApiKey")
	result, err := c.service.StepMetric(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey)
	if err != nil {
		w.WriteHeader(500)
		return
	}
	
	EncodeJSONResponse(result, nil, w)
}

// StepState - Get step state
func (c *PipelineExecutionApiController) StepState(w http.ResponseWriter, r *http.Request) { 
	params := mux.Vars(r)
	programId := params["programId"]
	pipelineId := params["pipelineId"]
	executionId := params["executionId"]
	phaseId := params["phaseId"]
	stepId := params["stepId"]
	xGwImsOrgId := r.Header.Get("xGwImsOrgId")
	authorization := r.Header.Get("authorization")
	xApiKey := r.Header.Get("xApiKey")
	result, err := c.service.StepState(programId, pipelineId, executionId, phaseId, stepId, xGwImsOrgId, authorization, xApiKey)
	if err != nil {
		w.WriteHeader(500)
		return
	}
	
	EncodeJSONResponse(result, nil, w)
}
