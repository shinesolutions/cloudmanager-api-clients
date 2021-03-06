note
 description:"[
		Cloud Manager API
 		This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
  		The version of the OpenAPI document: 1.0.0
 	    Contact: opensource@shinesolutions.com

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"

class
	PIPELINES_API

inherit

    API_I


feature -- API Access


	delete_pipeline (program_id: STRING_32; pipeline_id: STRING_32; x_gw_ims_org_id: STRING_32; authorization: STRING_32; x_api_key: STRING_32)
			-- Delete a Pipeline
			-- Delete a pipeline. All the data is wiped.
			-- 
			-- argument: program_id Identifier of the program (required)
			-- 
			-- argument: pipeline_id Identifier of the pipeline (required)
			-- 
			-- argument: x_gw_ims_org_id IMS organization ID that the request is being made under. (required)
			-- 
			-- argument: authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO (required)
			-- 
			-- argument: x_api_key IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io (required)
			-- 
			-- 
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/api/program/{programId}/pipeline/{pipelineId}"
			l_path.replace_substring_all ("{"+"programId"+"}", api_client.url_encode (program_id.out))
			l_path.replace_substring_all ("{"+"pipelineId"+"}", api_client.url_encode (pipeline_id.out))

			if attached x_gw_ims_org_id as l_x_gw_ims_org_id then
				l_request.add_header(l_x_gw_ims_org_id.out,"x-gw-ims-org-id");
			end
			if attached authorization as l_authorization then
				l_request.add_header(l_authorization.out,"Authorization");
			end
			if attached x_api_key as l_x_api_key then
				l_request.add_header(l_x_api_key.out,"x-api-key");
			end

			if attached {STRING} api_client.select_header_accept (<<>>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Delete", l_request, agent serializer, Void)
			if l_response.has_error then
				last_error := l_response.error
			end
		end	

	patch_pipeline (program_id: STRING_32; pipeline_id: STRING_32; x_gw_ims_org_id: STRING_32; authorization: STRING_32; x_api_key: STRING_32; content__type: STRING_32; body: PIPELINE): detachable PIPELINE
			-- Patches Pipeline
			-- Patches a pipeline within an program.
			-- 
			-- argument: program_id Identifier of the program (required)
			-- 
			-- argument: pipeline_id Identifier of the pipeline (required)
			-- 
			-- argument: x_gw_ims_org_id IMS organization ID that the request is being made under. (required)
			-- 
			-- argument: authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO (required)
			-- 
			-- argument: x_api_key IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io (required)
			-- 
			-- argument: content__type Must always be application/json (required)
			-- 
			-- argument: body The updated Pipeline (required)
			-- 
			-- 
			-- Result PIPELINE
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			l_request.set_body(body)
			l_path := "/api/program/{programId}/pipeline/{pipelineId}"
			l_path.replace_substring_all ("{"+"programId"+"}", api_client.url_encode (program_id.out))
			l_path.replace_substring_all ("{"+"pipelineId"+"}", api_client.url_encode (pipeline_id.out))

			if attached x_gw_ims_org_id as l_x_gw_ims_org_id then
				l_request.add_header(l_x_gw_ims_org_id.out,"x-gw-ims-org-id");
			end
			if attached authorization as l_authorization then
				l_request.add_header(l_authorization.out,"Authorization");
			end
			if attached x_api_key as l_x_api_key then
				l_request.add_header(l_x_api_key.out,"x-api-key");
			end
			if attached content__type as l_content__type then
				l_request.add_header(l_content__type.out,"Content-Type");
			end

			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<"application/json">>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Patch", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { PIPELINE } l_response.data ({ PIPELINE }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	

	pipeline (program_id: STRING_32; pipeline_id: STRING_32; x_gw_ims_org_id: STRING_32; authorization: STRING_32; x_api_key: STRING_32): detachable PIPELINE
			-- Get Pipeline
			-- Returns a pipeline by its id
			-- 
			-- argument: program_id Identifier of the program (required)
			-- 
			-- argument: pipeline_id Identifier of the pipeline (required)
			-- 
			-- argument: x_gw_ims_org_id IMS organization ID that the request is being made under. (required)
			-- 
			-- argument: authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO (required)
			-- 
			-- argument: x_api_key IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io (required)
			-- 
			-- 
			-- Result PIPELINE
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/api/program/{programId}/pipeline/{pipelineId}"
			l_path.replace_substring_all ("{"+"programId"+"}", api_client.url_encode (program_id.out))
			l_path.replace_substring_all ("{"+"pipelineId"+"}", api_client.url_encode (pipeline_id.out))

			if attached x_gw_ims_org_id as l_x_gw_ims_org_id then
				l_request.add_header(l_x_gw_ims_org_id.out,"x-gw-ims-org-id");
			end
			if attached authorization as l_authorization then
				l_request.add_header(l_authorization.out,"Authorization");
			end
			if attached x_api_key as l_x_api_key then
				l_request.add_header(l_x_api_key.out,"x-api-key");
			end

			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Get", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { PIPELINE } l_response.data ({ PIPELINE }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	

	pipelines (program_id: STRING_32; x_gw_ims_org_id: STRING_32; authorization: STRING_32; x_api_key: STRING_32): detachable PIPELINE_LIST
			-- List Pipelines
			-- Returns all the pipelines that the requesting user has access to in an program
			-- 
			-- argument: program_id Identifier of the program (required)
			-- 
			-- argument: x_gw_ims_org_id IMS organization ID that the request is being made under. (required)
			-- 
			-- argument: authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO (required)
			-- 
			-- argument: x_api_key IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io (required)
			-- 
			-- 
			-- Result PIPELINE_LIST
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/api/program/{programId}/pipelines"
			l_path.replace_substring_all ("{"+"programId"+"}", api_client.url_encode (program_id.out))

			if attached x_gw_ims_org_id as l_x_gw_ims_org_id then
				l_request.add_header(l_x_gw_ims_org_id.out,"x-gw-ims-org-id");
			end
			if attached authorization as l_authorization then
				l_request.add_header(l_authorization.out,"Authorization");
			end
			if attached x_api_key as l_x_api_key then
				l_request.add_header(l_x_api_key.out,"x-api-key");
			end

			if attached {STRING} api_client.select_header_accept (<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type (<<>>),"Content-Type")
			l_request.set_auth_names (<<>>)
			l_response := api_client.call_api (l_path, "Get", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { PIPELINE_LIST } l_response.data ({ PIPELINE_LIST }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end	


end
