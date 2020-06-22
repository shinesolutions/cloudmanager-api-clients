--[[
  Cloud Manager API
 
  This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
 
  The version of the OpenAPI document: 1.0.0
  Contact: opensource@shinesolutions.com
  Generated by: https://openapi-generator.tech
]]

--package openapiclient

local http_request = require "http.request"
local http_util = require "http.util"
local dkjson = require "dkjson"
local basexx = require "basexx"

-- model import
local openapiclient_pipeline_execution_list_representation = require "openapiclient.model.pipeline_execution_list_representation"
local openapiclient_pipeline_execution = require "openapiclient.model.pipeline_execution"
local openapiclient_pipeline_execution_step_state = require "openapiclient.model.pipeline_execution_step_state"
local openapiclient_pipeline_step_metrics = require "openapiclient.model.pipeline_step_metrics"

local pipeline_execution_api = {}
local pipeline_execution_api_mt = {
	__name = "pipeline_execution_api";
	__index = pipeline_execution_api;
}

local function new_pipeline_execution_api(authority, basePath, schemes)
	local schemes_map = {}
	for _,v in ipairs(schemes) do
		schemes_map[v] = v
	end
	local default_scheme = schemes_map.https or schemes_map.http
	local host, port = http_util.split_authority(authority, default_scheme)
	return setmetatable({
		host = host;
		port = port;
		basePath = basePath or "https://cloudmanager.adobe.io";
		schemes = schemes_map;
		default_scheme = default_scheme;
		http_username = nil;
		http_password = nil;
		api_key = {};
		access_token = nil;
	}, pipeline_execution_api_mt)
end

function pipeline_execution_api:advance_pipeline_execution(program_id, pipeline_id, execution_id, phase_id, step_id, x_gw_ims_org_id, authorization, x_api_key, content_type, body)
	local req = http_request.new_from_uri({
		scheme = self.default_scheme;
		host = self.host;
		port = self.port;
		path = string.format("%s/api/program/%s/pipeline/%s/execution/%s/phase/%s/step/%s/advance",
			self.basePath, program_id, pipeline_id, execution_id, phase_id, step_id);
	})

	-- set HTTP verb
	req.headers:upsert(":method", "PUT")
	-- TODO: create a function to select proper accept
	--local var_content_type = { "application/json" }
	req.headers:upsert("accept", "application/json")

	if x_gw_ims_org_id then
		req.headers:upsert("x-gw-ims-org-id", x_gw_ims_org_id)
	end
	if authorization then
		req.headers:upsert("Authorization", authorization)
	end
	if x_api_key then
		req.headers:upsert("x-api-key", x_api_key)
	end
	if content_type then
		req.headers:upsert("Content-Type", content_type)
	end
	req:set_body(dkjson.encode(body))


	-- make the HTTP call
	local headers, stream, errno = req:go()
	if not headers then
		return nil, stream, errno
	end
	local http_status = headers:get(":status")
	if http_status:sub(1,1) == "2" then
		return nil, headers
	else
		local body, err, errno2 = stream:get_body_as_string()
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		-- return the error message (http body)
		return nil, http_status, body
	end
end

function pipeline_execution_api:cancel_pipeline_execution_step(program_id, pipeline_id, execution_id, phase_id, step_id, x_gw_ims_org_id, authorization, x_api_key, content_type, body)
	local req = http_request.new_from_uri({
		scheme = self.default_scheme;
		host = self.host;
		port = self.port;
		path = string.format("%s/api/program/%s/pipeline/%s/execution/%s/phase/%s/step/%s/cancel",
			self.basePath, program_id, pipeline_id, execution_id, phase_id, step_id);
	})

	-- set HTTP verb
	req.headers:upsert(":method", "PUT")
	-- TODO: create a function to select proper accept
	--local var_content_type = { "application/json" }
	req.headers:upsert("accept", "application/json")

	if x_gw_ims_org_id then
		req.headers:upsert("x-gw-ims-org-id", x_gw_ims_org_id)
	end
	if authorization then
		req.headers:upsert("Authorization", authorization)
	end
	if x_api_key then
		req.headers:upsert("x-api-key", x_api_key)
	end
	if content_type then
		req.headers:upsert("Content-Type", content_type)
	end
	req:set_body(dkjson.encode(body))


	-- make the HTTP call
	local headers, stream, errno = req:go()
	if not headers then
		return nil, stream, errno
	end
	local http_status = headers:get(":status")
	if http_status:sub(1,1) == "2" then
		return nil, headers
	else
		local body, err, errno2 = stream:get_body_as_string()
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		-- return the error message (http body)
		return nil, http_status, body
	end
end

function pipeline_execution_api:get_current_execution(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key)
	local req = http_request.new_from_uri({
		scheme = self.default_scheme;
		host = self.host;
		port = self.port;
		path = string.format("%s/api/program/%s/pipeline/%s/execution",
			self.basePath, program_id, pipeline_id);
	})

	-- set HTTP verb
	req.headers:upsert(":method", "GET")
	-- TODO: create a function to select proper content-type
	--local var_accept = { "application/json" }
	req.headers:upsert("content-type", "application/json")

	if x_gw_ims_org_id then
		req.headers:upsert("x-gw-ims-org-id", x_gw_ims_org_id)
	end
	if authorization then
		req.headers:upsert("Authorization", authorization)
	end
	if x_api_key then
		req.headers:upsert("x-api-key", x_api_key)
	end

	-- make the HTTP call
	local headers, stream, errno = req:go()
	if not headers then
		return nil, stream, errno
	end
	local http_status = headers:get(":status")
	if http_status:sub(1,1) == "2" then
		local body, err, errno2 = stream:get_body_as_string()
		-- exception when getting the HTTP body
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		local result, _, err3 = dkjson.decode(body)
		-- exception when decoding the HTTP body
		if result == nil then
			return nil, err3
		end
		return openapiclient_pipeline_execution.cast(result), headers
	else
		local body, err, errno2 = stream:get_body_as_string()
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		-- return the error message (http body)
		return nil, http_status, body
	end
end

function pipeline_execution_api:get_execution(program_id, pipeline_id, execution_id, x_gw_ims_org_id, authorization, x_api_key)
	local req = http_request.new_from_uri({
		scheme = self.default_scheme;
		host = self.host;
		port = self.port;
		path = string.format("%s/api/program/%s/pipeline/%s/execution/%s",
			self.basePath, program_id, pipeline_id, execution_id);
	})

	-- set HTTP verb
	req.headers:upsert(":method", "GET")
	-- TODO: create a function to select proper content-type
	--local var_accept = { "application/json" }
	req.headers:upsert("content-type", "application/json")

	if x_gw_ims_org_id then
		req.headers:upsert("x-gw-ims-org-id", x_gw_ims_org_id)
	end
	if authorization then
		req.headers:upsert("Authorization", authorization)
	end
	if x_api_key then
		req.headers:upsert("x-api-key", x_api_key)
	end

	-- make the HTTP call
	local headers, stream, errno = req:go()
	if not headers then
		return nil, stream, errno
	end
	local http_status = headers:get(":status")
	if http_status:sub(1,1) == "2" then
		local body, err, errno2 = stream:get_body_as_string()
		-- exception when getting the HTTP body
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		local result, _, err3 = dkjson.decode(body)
		-- exception when decoding the HTTP body
		if result == nil then
			return nil, err3
		end
		return openapiclient_pipeline_execution.cast(result), headers
	else
		local body, err, errno2 = stream:get_body_as_string()
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		-- return the error message (http body)
		return nil, http_status, body
	end
end

function pipeline_execution_api:get_executions(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key, start, limit)
	local req = http_request.new_from_uri({
		scheme = self.default_scheme;
		host = self.host;
		port = self.port;
		path = string.format("%s/api/program/%s/pipeline/%s/executions?start=%s&limit=%s",
			self.basePath, program_id, pipeline_id, http_util.encodeURIComponent(start), http_util.encodeURIComponent(limit));
	})

	-- set HTTP verb
	req.headers:upsert(":method", "GET")
	-- TODO: create a function to select proper content-type
	--local var_accept = { "application/json" }
	req.headers:upsert("content-type", "application/json")

	if x_gw_ims_org_id then
		req.headers:upsert("x-gw-ims-org-id", x_gw_ims_org_id)
	end
	if authorization then
		req.headers:upsert("Authorization", authorization)
	end
	if x_api_key then
		req.headers:upsert("x-api-key", x_api_key)
	end

	-- make the HTTP call
	local headers, stream, errno = req:go()
	if not headers then
		return nil, stream, errno
	end
	local http_status = headers:get(":status")
	if http_status:sub(1,1) == "2" then
		local body, err, errno2 = stream:get_body_as_string()
		-- exception when getting the HTTP body
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		local result, _, err3 = dkjson.decode(body)
		-- exception when decoding the HTTP body
		if result == nil then
			return nil, err3
		end
		return openapiclient_pipeline_execution_list_representation.cast(result), headers
	else
		local body, err, errno2 = stream:get_body_as_string()
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		-- return the error message (http body)
		return nil, http_status, body
	end
end

function pipeline_execution_api:get_step_logs(program_id, pipeline_id, execution_id, phase_id, step_id, x_gw_ims_org_id, authorization, x_api_key, file, accept)
	local req = http_request.new_from_uri({
		scheme = self.default_scheme;
		host = self.host;
		port = self.port;
		path = string.format("%s/api/program/%s/pipeline/%s/execution/%s/phase/%s/step/%s/logs?file=%s",
			self.basePath, program_id, pipeline_id, execution_id, phase_id, step_id, http_util.encodeURIComponent(file));
	})

	-- set HTTP verb
	req.headers:upsert(":method", "GET")
	if accept then
		req.headers:upsert("Accept", accept)
	end
	if x_gw_ims_org_id then
		req.headers:upsert("x-gw-ims-org-id", x_gw_ims_org_id)
	end
	if authorization then
		req.headers:upsert("Authorization", authorization)
	end
	if x_api_key then
		req.headers:upsert("x-api-key", x_api_key)
	end

	-- make the HTTP call
	local headers, stream, errno = req:go()
	if not headers then
		return nil, stream, errno
	end
	local http_status = headers:get(":status")
	if http_status:sub(1,1) == "2" then
		return nil, headers
	else
		local body, err, errno2 = stream:get_body_as_string()
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		-- return the error message (http body)
		return nil, http_status, body
	end
end

function pipeline_execution_api:start_pipeline(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key, content_type)
	local req = http_request.new_from_uri({
		scheme = self.default_scheme;
		host = self.host;
		port = self.port;
		path = string.format("%s/api/program/%s/pipeline/%s/execution",
			self.basePath, program_id, pipeline_id);
	})

	-- set HTTP verb
	req.headers:upsert(":method", "PUT")
	if x_gw_ims_org_id then
		req.headers:upsert("x-gw-ims-org-id", x_gw_ims_org_id)
	end
	if authorization then
		req.headers:upsert("Authorization", authorization)
	end
	if x_api_key then
		req.headers:upsert("x-api-key", x_api_key)
	end
	if content_type then
		req.headers:upsert("Content-Type", content_type)
	end

	-- make the HTTP call
	local headers, stream, errno = req:go()
	if not headers then
		return nil, stream, errno
	end
	local http_status = headers:get(":status")
	if http_status:sub(1,1) == "2" then
		return nil, headers
	else
		local body, err, errno2 = stream:get_body_as_string()
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		-- return the error message (http body)
		return nil, http_status, body
	end
end

function pipeline_execution_api:step_metric(program_id, pipeline_id, execution_id, phase_id, step_id, x_gw_ims_org_id, authorization, x_api_key)
	local req = http_request.new_from_uri({
		scheme = self.default_scheme;
		host = self.host;
		port = self.port;
		path = string.format("%s/api/program/%s/pipeline/%s/execution/%s/phase/%s/step/%s/metrics",
			self.basePath, program_id, pipeline_id, execution_id, phase_id, step_id);
	})

	-- set HTTP verb
	req.headers:upsert(":method", "GET")
	-- TODO: create a function to select proper content-type
	--local var_accept = { "application/json" }
	req.headers:upsert("content-type", "application/json")

	if x_gw_ims_org_id then
		req.headers:upsert("x-gw-ims-org-id", x_gw_ims_org_id)
	end
	if authorization then
		req.headers:upsert("Authorization", authorization)
	end
	if x_api_key then
		req.headers:upsert("x-api-key", x_api_key)
	end

	-- make the HTTP call
	local headers, stream, errno = req:go()
	if not headers then
		return nil, stream, errno
	end
	local http_status = headers:get(":status")
	if http_status:sub(1,1) == "2" then
		local body, err, errno2 = stream:get_body_as_string()
		-- exception when getting the HTTP body
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		local result, _, err3 = dkjson.decode(body)
		-- exception when decoding the HTTP body
		if result == nil then
			return nil, err3
		end
		return openapiclient_pipeline_step_metrics.cast(result), headers
	else
		local body, err, errno2 = stream:get_body_as_string()
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		-- return the error message (http body)
		return nil, http_status, body
	end
end

function pipeline_execution_api:step_state(program_id, pipeline_id, execution_id, phase_id, step_id, x_gw_ims_org_id, authorization, x_api_key)
	local req = http_request.new_from_uri({
		scheme = self.default_scheme;
		host = self.host;
		port = self.port;
		path = string.format("%s/api/program/%s/pipeline/%s/execution/%s/phase/%s/step/%s",
			self.basePath, program_id, pipeline_id, execution_id, phase_id, step_id);
	})

	-- set HTTP verb
	req.headers:upsert(":method", "GET")
	-- TODO: create a function to select proper content-type
	--local var_accept = { "application/json" }
	req.headers:upsert("content-type", "application/json")

	if x_gw_ims_org_id then
		req.headers:upsert("x-gw-ims-org-id", x_gw_ims_org_id)
	end
	if authorization then
		req.headers:upsert("Authorization", authorization)
	end
	if x_api_key then
		req.headers:upsert("x-api-key", x_api_key)
	end

	-- make the HTTP call
	local headers, stream, errno = req:go()
	if not headers then
		return nil, stream, errno
	end
	local http_status = headers:get(":status")
	if http_status:sub(1,1) == "2" then
		local body, err, errno2 = stream:get_body_as_string()
		-- exception when getting the HTTP body
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		local result, _, err3 = dkjson.decode(body)
		-- exception when decoding the HTTP body
		if result == nil then
			return nil, err3
		end
		return openapiclient_pipeline_execution_step_state.cast(result), headers
	else
		local body, err, errno2 = stream:get_body_as_string()
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		-- return the error message (http body)
		return nil, http_status, body
	end
end

return {
	new = new_pipeline_execution_api;
}
