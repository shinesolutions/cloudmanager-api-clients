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
	_context "context"
	_ioutil "io/ioutil"
	_nethttp "net/http"
	_neturl "net/url"
	"strings"
	"github.com/antihax/optional"
)

// Linger please
var (
	_ _context.Context
)

// PipelineExecutionApiService PipelineExecutionApi service
type PipelineExecutionApiService service

/*
AdvancePipelineExecution Advance
Post to this url in order to advance the current pipeline execution, if paused and waiting for user interaction. Link is present in output only in that case. The input depends on the actual reason for which the pipeline execution stopped.
 * @param ctx _context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param programId Identifier of the program.
 * @param pipelineId Identifier of the pipeline
 * @param executionId Identifier of the execution
 * @param phaseId Identifier of the phase
 * @param stepId Identifier of the step
 * @param xGwImsOrgId IMS organization ID that the request is being made under.
 * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO
 * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
 * @param contentType Must always be application/json
 * @param body Input for advance. See documentation for details.
*/
func (a *PipelineExecutionApiService) AdvancePipelineExecution(ctx _context.Context, programId string, pipelineId string, executionId string, phaseId string, stepId string, xGwImsOrgId string, authorization string, xApiKey string, contentType string, body map[string]interface{}) (*_nethttp.Response, error) {
	var (
		localVarHTTPMethod   = _nethttp.MethodPut
		localVarPostBody     interface{}
		localVarFormFileName string
		localVarFileName     string
		localVarFileBytes    []byte
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/advance"
	localVarPath = strings.Replace(localVarPath, "{"+"programId"+"}", _neturl.QueryEscape(parameterToString(programId, "")) , -1)

	localVarPath = strings.Replace(localVarPath, "{"+"pipelineId"+"}", _neturl.QueryEscape(parameterToString(pipelineId, "")) , -1)

	localVarPath = strings.Replace(localVarPath, "{"+"executionId"+"}", _neturl.QueryEscape(parameterToString(executionId, "")) , -1)

	localVarPath = strings.Replace(localVarPath, "{"+"phaseId"+"}", _neturl.QueryEscape(parameterToString(phaseId, "")) , -1)

	localVarPath = strings.Replace(localVarPath, "{"+"stepId"+"}", _neturl.QueryEscape(parameterToString(stepId, "")) , -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := _neturl.Values{}
	localVarFormParams := _neturl.Values{}

	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{"application/json"}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	localVarHeaderParams["x-gw-ims-org-id"] = parameterToString(xGwImsOrgId, "")
	localVarHeaderParams["Authorization"] = parameterToString(authorization, "")
	localVarHeaderParams["x-api-key"] = parameterToString(xApiKey, "")
	localVarHeaderParams["Content-Type"] = parameterToString(contentType, "")
	// body params
	localVarPostBody = &body
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFormFileName, localVarFileName, localVarFileBytes)
	if err != nil {
		return nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(r)
	if err != nil || localVarHTTPResponse == nil {
		return localVarHTTPResponse, err
	}

	localVarBody, err := _ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	if err != nil {
		return localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		return localVarHTTPResponse, newErr
	}

	return localVarHTTPResponse, nil
}

/*
CancelPipelineExecutionStep Cancel
Post to this url in order to cancel the current pipeline execution. Link is present in output only in that case.
 * @param ctx _context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param programId Identifier of the program.
 * @param pipelineId Identifier of the pipeline
 * @param executionId Identifier of the execution
 * @param phaseId Identifier of the phase
 * @param stepId Identifier of the step
 * @param xGwImsOrgId IMS organization ID that the request is being made under.
 * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO
 * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
 * @param contentType Must always be application/json
 * @param body Input for advance. See documentation for details.
*/
func (a *PipelineExecutionApiService) CancelPipelineExecutionStep(ctx _context.Context, programId string, pipelineId string, executionId string, phaseId string, stepId string, xGwImsOrgId string, authorization string, xApiKey string, contentType string, body map[string]interface{}) (*_nethttp.Response, error) {
	var (
		localVarHTTPMethod   = _nethttp.MethodPut
		localVarPostBody     interface{}
		localVarFormFileName string
		localVarFileName     string
		localVarFileBytes    []byte
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/cancel"
	localVarPath = strings.Replace(localVarPath, "{"+"programId"+"}", _neturl.QueryEscape(parameterToString(programId, "")) , -1)

	localVarPath = strings.Replace(localVarPath, "{"+"pipelineId"+"}", _neturl.QueryEscape(parameterToString(pipelineId, "")) , -1)

	localVarPath = strings.Replace(localVarPath, "{"+"executionId"+"}", _neturl.QueryEscape(parameterToString(executionId, "")) , -1)

	localVarPath = strings.Replace(localVarPath, "{"+"phaseId"+"}", _neturl.QueryEscape(parameterToString(phaseId, "")) , -1)

	localVarPath = strings.Replace(localVarPath, "{"+"stepId"+"}", _neturl.QueryEscape(parameterToString(stepId, "")) , -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := _neturl.Values{}
	localVarFormParams := _neturl.Values{}

	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{"application/json"}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	localVarHeaderParams["x-gw-ims-org-id"] = parameterToString(xGwImsOrgId, "")
	localVarHeaderParams["Authorization"] = parameterToString(authorization, "")
	localVarHeaderParams["x-api-key"] = parameterToString(xApiKey, "")
	localVarHeaderParams["Content-Type"] = parameterToString(contentType, "")
	// body params
	localVarPostBody = &body
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFormFileName, localVarFileName, localVarFileBytes)
	if err != nil {
		return nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(r)
	if err != nil || localVarHTTPResponse == nil {
		return localVarHTTPResponse, err
	}

	localVarBody, err := _ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	if err != nil {
		return localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		return localVarHTTPResponse, newErr
	}

	return localVarHTTPResponse, nil
}

/*
GetCurrentExecution Get current pipeline execution
Returns current pipeline execution if any.
 * @param ctx _context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param programId Identifier of the program.
 * @param pipelineId Identifier of the pipeline
 * @param xGwImsOrgId IMS organization ID that the request is being made under.
 * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO
 * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
@return PipelineExecution
*/
func (a *PipelineExecutionApiService) GetCurrentExecution(ctx _context.Context, programId string, pipelineId string, xGwImsOrgId string, authorization string, xApiKey string) (PipelineExecution, *_nethttp.Response, error) {
	var (
		localVarHTTPMethod   = _nethttp.MethodGet
		localVarPostBody     interface{}
		localVarFormFileName string
		localVarFileName     string
		localVarFileBytes    []byte
		localVarReturnValue  PipelineExecution
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/api/program/{programId}/pipeline/{pipelineId}/execution"
	localVarPath = strings.Replace(localVarPath, "{"+"programId"+"}", _neturl.QueryEscape(parameterToString(programId, "")) , -1)

	localVarPath = strings.Replace(localVarPath, "{"+"pipelineId"+"}", _neturl.QueryEscape(parameterToString(pipelineId, "")) , -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := _neturl.Values{}
	localVarFormParams := _neturl.Values{}

	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	localVarHeaderParams["x-gw-ims-org-id"] = parameterToString(xGwImsOrgId, "")
	localVarHeaderParams["Authorization"] = parameterToString(authorization, "")
	localVarHeaderParams["x-api-key"] = parameterToString(xApiKey, "")
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFormFileName, localVarFileName, localVarFileBytes)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(r)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := _ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}

/*
GetExecution Get pipeline execution
Returns a pipeline execution by id
 * @param ctx _context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param programId Identifier of the program.
 * @param pipelineId Identifier of the pipeline
 * @param executionId Identifier of the execution
 * @param xGwImsOrgId IMS organization ID that the request is being made under.
 * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO
 * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
@return PipelineExecution
*/
func (a *PipelineExecutionApiService) GetExecution(ctx _context.Context, programId string, pipelineId string, executionId string, xGwImsOrgId string, authorization string, xApiKey string) (PipelineExecution, *_nethttp.Response, error) {
	var (
		localVarHTTPMethod   = _nethttp.MethodGet
		localVarPostBody     interface{}
		localVarFormFileName string
		localVarFileName     string
		localVarFileBytes    []byte
		localVarReturnValue  PipelineExecution
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}"
	localVarPath = strings.Replace(localVarPath, "{"+"programId"+"}", _neturl.QueryEscape(parameterToString(programId, "")) , -1)

	localVarPath = strings.Replace(localVarPath, "{"+"pipelineId"+"}", _neturl.QueryEscape(parameterToString(pipelineId, "")) , -1)

	localVarPath = strings.Replace(localVarPath, "{"+"executionId"+"}", _neturl.QueryEscape(parameterToString(executionId, "")) , -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := _neturl.Values{}
	localVarFormParams := _neturl.Values{}

	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	localVarHeaderParams["x-gw-ims-org-id"] = parameterToString(xGwImsOrgId, "")
	localVarHeaderParams["Authorization"] = parameterToString(authorization, "")
	localVarHeaderParams["x-api-key"] = parameterToString(xApiKey, "")
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFormFileName, localVarFileName, localVarFileBytes)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(r)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := _ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}

// GetExecutionsOpts Optional parameters for the method 'GetExecutions'
type GetExecutionsOpts struct {
    Start optional.String
    Limit optional.Int32
}

/*
GetExecutions List Executions
Returns the history of pipeline executions in a newest to oldest order
 * @param ctx _context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param programId Identifier of the program.
 * @param pipelineId Identifier of the pipeline
 * @param xGwImsOrgId IMS organization ID that the request is being made under.
 * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO
 * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
 * @param optional nil or *GetExecutionsOpts - Optional Parameters:
 * @param "Start" (optional.String) -  Pagination start parameter
 * @param "Limit" (optional.Int32) -  Pagination limit parameter
@return PipelineExecutionListRepresentation
*/
func (a *PipelineExecutionApiService) GetExecutions(ctx _context.Context, programId string, pipelineId string, xGwImsOrgId string, authorization string, xApiKey string, localVarOptionals *GetExecutionsOpts) (PipelineExecutionListRepresentation, *_nethttp.Response, error) {
	var (
		localVarHTTPMethod   = _nethttp.MethodGet
		localVarPostBody     interface{}
		localVarFormFileName string
		localVarFileName     string
		localVarFileBytes    []byte
		localVarReturnValue  PipelineExecutionListRepresentation
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/api/program/{programId}/pipeline/{pipelineId}/executions"
	localVarPath = strings.Replace(localVarPath, "{"+"programId"+"}", _neturl.QueryEscape(parameterToString(programId, "")) , -1)

	localVarPath = strings.Replace(localVarPath, "{"+"pipelineId"+"}", _neturl.QueryEscape(parameterToString(pipelineId, "")) , -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := _neturl.Values{}
	localVarFormParams := _neturl.Values{}

	if localVarOptionals != nil && localVarOptionals.Start.IsSet() {
		localVarQueryParams.Add("start", parameterToString(localVarOptionals.Start.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Limit.IsSet() {
		localVarQueryParams.Add("limit", parameterToString(localVarOptionals.Limit.Value(), ""))
	}
	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	localVarHeaderParams["x-gw-ims-org-id"] = parameterToString(xGwImsOrgId, "")
	localVarHeaderParams["Authorization"] = parameterToString(authorization, "")
	localVarHeaderParams["x-api-key"] = parameterToString(xApiKey, "")
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFormFileName, localVarFileName, localVarFileBytes)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(r)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := _ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}

// GetStepLogsOpts Optional parameters for the method 'GetStepLogs'
type GetStepLogsOpts struct {
    File optional.String
    Accept optional.String
}

/*
GetStepLogs Get logs
Get the logs associated with a step.
 * @param ctx _context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param programId Identifier of the program.
 * @param pipelineId Identifier of the pipeline
 * @param executionId Identifier of the execution
 * @param phaseId Identifier of the phase
 * @param stepId Identifier of the step
 * @param xGwImsOrgId IMS organization ID that the request is being made under.
 * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO
 * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
 * @param optional nil or *GetStepLogsOpts - Optional Parameters:
 * @param "File" (optional.String) -  Identifier of the log file
 * @param "Accept" (optional.String) -  Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header.
*/
func (a *PipelineExecutionApiService) GetStepLogs(ctx _context.Context, programId string, pipelineId string, executionId string, phaseId string, stepId string, xGwImsOrgId string, authorization string, xApiKey string, localVarOptionals *GetStepLogsOpts) (*_nethttp.Response, error) {
	var (
		localVarHTTPMethod   = _nethttp.MethodGet
		localVarPostBody     interface{}
		localVarFormFileName string
		localVarFileName     string
		localVarFileBytes    []byte
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/logs"
	localVarPath = strings.Replace(localVarPath, "{"+"programId"+"}", _neturl.QueryEscape(parameterToString(programId, "")) , -1)

	localVarPath = strings.Replace(localVarPath, "{"+"pipelineId"+"}", _neturl.QueryEscape(parameterToString(pipelineId, "")) , -1)

	localVarPath = strings.Replace(localVarPath, "{"+"executionId"+"}", _neturl.QueryEscape(parameterToString(executionId, "")) , -1)

	localVarPath = strings.Replace(localVarPath, "{"+"phaseId"+"}", _neturl.QueryEscape(parameterToString(phaseId, "")) , -1)

	localVarPath = strings.Replace(localVarPath, "{"+"stepId"+"}", _neturl.QueryEscape(parameterToString(stepId, "")) , -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := _neturl.Values{}
	localVarFormParams := _neturl.Values{}

	if localVarOptionals != nil && localVarOptionals.File.IsSet() {
		localVarQueryParams.Add("file", parameterToString(localVarOptionals.File.Value(), ""))
	}
	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	if localVarOptionals != nil && localVarOptionals.Accept.IsSet() {
		localVarHeaderParams["Accept"] = parameterToString(localVarOptionals.Accept.Value(), "")
	}
	localVarHeaderParams["x-gw-ims-org-id"] = parameterToString(xGwImsOrgId, "")
	localVarHeaderParams["Authorization"] = parameterToString(authorization, "")
	localVarHeaderParams["x-api-key"] = parameterToString(xApiKey, "")
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFormFileName, localVarFileName, localVarFileBytes)
	if err != nil {
		return nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(r)
	if err != nil || localVarHTTPResponse == nil {
		return localVarHTTPResponse, err
	}

	localVarBody, err := _ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	if err != nil {
		return localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		return localVarHTTPResponse, newErr
	}

	return localVarHTTPResponse, nil
}

/*
StartPipeline Start the pipeline
Starts the Pipeline. This works only if the pipeline is not already started.
 * @param ctx _context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param programId Identifier of the program.
 * @param pipelineId Identifier of the pipeline
 * @param xGwImsOrgId IMS organization ID that the request is being made under.
 * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO
 * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
 * @param contentType Must always be application/json
*/
func (a *PipelineExecutionApiService) StartPipeline(ctx _context.Context, programId string, pipelineId string, xGwImsOrgId string, authorization string, xApiKey string, contentType string) (*_nethttp.Response, error) {
	var (
		localVarHTTPMethod   = _nethttp.MethodPut
		localVarPostBody     interface{}
		localVarFormFileName string
		localVarFileName     string
		localVarFileBytes    []byte
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/api/program/{programId}/pipeline/{pipelineId}/execution"
	localVarPath = strings.Replace(localVarPath, "{"+"programId"+"}", _neturl.QueryEscape(parameterToString(programId, "")) , -1)

	localVarPath = strings.Replace(localVarPath, "{"+"pipelineId"+"}", _neturl.QueryEscape(parameterToString(pipelineId, "")) , -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := _neturl.Values{}
	localVarFormParams := _neturl.Values{}

	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	localVarHeaderParams["x-gw-ims-org-id"] = parameterToString(xGwImsOrgId, "")
	localVarHeaderParams["Authorization"] = parameterToString(authorization, "")
	localVarHeaderParams["x-api-key"] = parameterToString(xApiKey, "")
	localVarHeaderParams["Content-Type"] = parameterToString(contentType, "")
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFormFileName, localVarFileName, localVarFileBytes)
	if err != nil {
		return nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(r)
	if err != nil || localVarHTTPResponse == nil {
		return localVarHTTPResponse, err
	}

	localVarBody, err := _ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	if err != nil {
		return localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		return localVarHTTPResponse, newErr
	}

	return localVarHTTPResponse, nil
}

/*
StepMetric Get step metrics
 * @param ctx _context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param programId Identifier of the program.
 * @param pipelineId Identifier of the pipeline
 * @param executionId Identifier of the execution
 * @param phaseId Identifier of the phase
 * @param stepId Identifier of the step
 * @param xGwImsOrgId IMS organization ID that the request is being made under.
 * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO
 * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
@return PipelineStepMetrics
*/
func (a *PipelineExecutionApiService) StepMetric(ctx _context.Context, programId string, pipelineId string, executionId string, phaseId string, stepId string, xGwImsOrgId string, authorization string, xApiKey string) (PipelineStepMetrics, *_nethttp.Response, error) {
	var (
		localVarHTTPMethod   = _nethttp.MethodGet
		localVarPostBody     interface{}
		localVarFormFileName string
		localVarFileName     string
		localVarFileBytes    []byte
		localVarReturnValue  PipelineStepMetrics
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/metrics"
	localVarPath = strings.Replace(localVarPath, "{"+"programId"+"}", _neturl.QueryEscape(parameterToString(programId, "")) , -1)

	localVarPath = strings.Replace(localVarPath, "{"+"pipelineId"+"}", _neturl.QueryEscape(parameterToString(pipelineId, "")) , -1)

	localVarPath = strings.Replace(localVarPath, "{"+"executionId"+"}", _neturl.QueryEscape(parameterToString(executionId, "")) , -1)

	localVarPath = strings.Replace(localVarPath, "{"+"phaseId"+"}", _neturl.QueryEscape(parameterToString(phaseId, "")) , -1)

	localVarPath = strings.Replace(localVarPath, "{"+"stepId"+"}", _neturl.QueryEscape(parameterToString(stepId, "")) , -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := _neturl.Values{}
	localVarFormParams := _neturl.Values{}

	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	localVarHeaderParams["x-gw-ims-org-id"] = parameterToString(xGwImsOrgId, "")
	localVarHeaderParams["Authorization"] = parameterToString(authorization, "")
	localVarHeaderParams["x-api-key"] = parameterToString(xApiKey, "")
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFormFileName, localVarFileName, localVarFileBytes)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(r)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := _ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}

/*
StepState Get step state
 * @param ctx _context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param programId Identifier of the program.
 * @param pipelineId Identifier of the pipeline
 * @param executionId Identifier of the execution
 * @param phaseId Identifier of the phase
 * @param stepId Identifier of the step
 * @param xGwImsOrgId IMS organization ID that the request is being made under.
 * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO
 * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
@return PipelineExecutionStepState
*/
func (a *PipelineExecutionApiService) StepState(ctx _context.Context, programId string, pipelineId string, executionId string, phaseId string, stepId string, xGwImsOrgId string, authorization string, xApiKey string) (PipelineExecutionStepState, *_nethttp.Response, error) {
	var (
		localVarHTTPMethod   = _nethttp.MethodGet
		localVarPostBody     interface{}
		localVarFormFileName string
		localVarFileName     string
		localVarFileBytes    []byte
		localVarReturnValue  PipelineExecutionStepState
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}"
	localVarPath = strings.Replace(localVarPath, "{"+"programId"+"}", _neturl.QueryEscape(parameterToString(programId, "")) , -1)

	localVarPath = strings.Replace(localVarPath, "{"+"pipelineId"+"}", _neturl.QueryEscape(parameterToString(pipelineId, "")) , -1)

	localVarPath = strings.Replace(localVarPath, "{"+"executionId"+"}", _neturl.QueryEscape(parameterToString(executionId, "")) , -1)

	localVarPath = strings.Replace(localVarPath, "{"+"phaseId"+"}", _neturl.QueryEscape(parameterToString(phaseId, "")) , -1)

	localVarPath = strings.Replace(localVarPath, "{"+"stepId"+"}", _neturl.QueryEscape(parameterToString(stepId, "")) , -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := _neturl.Values{}
	localVarFormParams := _neturl.Values{}

	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	localVarHeaderParams["x-gw-ims-org-id"] = parameterToString(xGwImsOrgId, "")
	localVarHeaderParams["Authorization"] = parameterToString(authorization, "")
	localVarHeaderParams["x-api-key"] = parameterToString(xApiKey, "")
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFormFileName, localVarFileName, localVarFileBytes)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(r)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := _ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}
