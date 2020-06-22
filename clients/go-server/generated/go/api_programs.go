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

// A ProgramsApiController binds http requests to an api service and writes the service results to the http response
type ProgramsApiController struct {
	service ProgramsApiServicer
}

// NewProgramsApiController creates a default api controller
func NewProgramsApiController(s ProgramsApiServicer) Router {
	return &ProgramsApiController{ service: s }
}

// Routes returns all of the api route for the ProgramsApiController
func (c *ProgramsApiController) Routes() Routes {
	return Routes{ 
		{
			"DeleteProgram",
			strings.ToUpper("Delete"),
			"/api/program/{programId}",
			c.DeleteProgram,
		},
		{
			"GetProgram",
			strings.ToUpper("Get"),
			"/api/program/{programId}",
			c.GetProgram,
		},
		{
			"GetPrograms",
			strings.ToUpper("Get"),
			"/api/programs",
			c.GetPrograms,
		},
	}
}

// DeleteProgram - Delete Program
func (c *ProgramsApiController) DeleteProgram(w http.ResponseWriter, r *http.Request) { 
	params := mux.Vars(r)
	programId := params["programId"]
	xGwImsOrgId := r.Header.Get("xGwImsOrgId")
	authorization := r.Header.Get("authorization")
	xApiKey := r.Header.Get("xApiKey")
	result, err := c.service.DeleteProgram(programId, xGwImsOrgId, authorization, xApiKey)
	if err != nil {
		w.WriteHeader(500)
		return
	}
	
	EncodeJSONResponse(result, nil, w)
}

// GetProgram - Get Program
func (c *ProgramsApiController) GetProgram(w http.ResponseWriter, r *http.Request) { 
	params := mux.Vars(r)
	programId := params["programId"]
	xGwImsOrgId := r.Header.Get("xGwImsOrgId")
	authorization := r.Header.Get("authorization")
	xApiKey := r.Header.Get("xApiKey")
	result, err := c.service.GetProgram(programId, xGwImsOrgId, authorization, xApiKey)
	if err != nil {
		w.WriteHeader(500)
		return
	}
	
	EncodeJSONResponse(result, nil, w)
}

// GetPrograms - Lists Programs
func (c *ProgramsApiController) GetPrograms(w http.ResponseWriter, r *http.Request) { 
	xGwImsOrgId := r.Header.Get("xGwImsOrgId")
	authorization := r.Header.Get("authorization")
	xApiKey := r.Header.Get("xApiKey")
	result, err := c.service.GetPrograms(xGwImsOrgId, authorization, xApiKey)
	if err != nil {
		w.WriteHeader(500)
		return
	}
	
	EncodeJSONResponse(result, nil, w)
}
