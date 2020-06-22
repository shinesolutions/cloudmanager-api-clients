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
)

// Linger please
var (
	_ _context.Context
)

// PipelinesApiService PipelinesApi service
type PipelinesApiService service

/*
DeletePipeline Delete a Pipeline
Delete a pipeline. All the data is wiped.
 * @param ctx _context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param programId Identifier of the program
 * @param pipelineId Identifier of the pipeline
 * @param xGwImsOrgId IMS organization ID that the request is being made under.
 * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO
 * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
*/
func (a *PipelinesApiService) DeletePipeline(ctx _context.Context, programId string, pipelineId string, xGwImsOrgId string, authorization string, xApiKey string) (*_nethttp.Response, error) {
	var (
		localVarHTTPMethod   = _nethttp.MethodDelete
		localVarPostBody     interface{}
		localVarFormFileName string
		localVarFileName     string
		localVarFileBytes    []byte
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/api/program/{programId}/pipeline/{pipelineId}"
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
GetPipeline Get Pipeline
Returns a pipeline by its id
 * @param ctx _context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param programId Identifier of the program
 * @param pipelineId Identifier of the pipeline
 * @param xGwImsOrgId IMS organization ID that the request is being made under.
 * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO
 * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
@return Pipeline
*/
func (a *PipelinesApiService) GetPipeline(ctx _context.Context, programId string, pipelineId string, xGwImsOrgId string, authorization string, xApiKey string) (Pipeline, *_nethttp.Response, error) {
	var (
		localVarHTTPMethod   = _nethttp.MethodGet
		localVarPostBody     interface{}
		localVarFormFileName string
		localVarFileName     string
		localVarFileBytes    []byte
		localVarReturnValue  Pipeline
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/api/program/{programId}/pipeline/{pipelineId}"
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
GetPipelines List Pipelines
Returns all the pipelines that the requesting user has access to in an program
 * @param ctx _context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param programId Identifier of the program
 * @param xGwImsOrgId IMS organization ID that the request is being made under.
 * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO
 * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
@return PipelineList
*/
func (a *PipelinesApiService) GetPipelines(ctx _context.Context, programId string, xGwImsOrgId string, authorization string, xApiKey string) (PipelineList, *_nethttp.Response, error) {
	var (
		localVarHTTPMethod   = _nethttp.MethodGet
		localVarPostBody     interface{}
		localVarFormFileName string
		localVarFileName     string
		localVarFileBytes    []byte
		localVarReturnValue  PipelineList
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/api/program/{programId}/pipelines"
	localVarPath = strings.Replace(localVarPath, "{"+"programId"+"}", _neturl.QueryEscape(parameterToString(programId, "")) , -1)

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
PatchPipeline Patches Pipeline
Patches a pipeline within an program.
 * @param ctx _context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param programId Identifier of the program
 * @param pipelineId Identifier of the pipeline
 * @param xGwImsOrgId IMS organization ID that the request is being made under.
 * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO
 * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
 * @param contentType Must always be application/json
 * @param body The updated Pipeline
@return Pipeline
*/
func (a *PipelinesApiService) PatchPipeline(ctx _context.Context, programId string, pipelineId string, xGwImsOrgId string, authorization string, xApiKey string, contentType string, body Pipeline) (Pipeline, *_nethttp.Response, error) {
	var (
		localVarHTTPMethod   = _nethttp.MethodPatch
		localVarPostBody     interface{}
		localVarFormFileName string
		localVarFileName     string
		localVarFileBytes    []byte
		localVarReturnValue  Pipeline
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/api/program/{programId}/pipeline/{pipelineId}"
	localVarPath = strings.Replace(localVarPath, "{"+"programId"+"}", _neturl.QueryEscape(parameterToString(programId, "")) , -1)

	localVarPath = strings.Replace(localVarPath, "{"+"pipelineId"+"}", _neturl.QueryEscape(parameterToString(pipelineId, "")) , -1)

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
	localVarHTTPHeaderAccepts := []string{"application/json"}

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
