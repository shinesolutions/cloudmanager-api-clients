--[[
  Cloud Manager API
 
  This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
 
  The version of the OpenAPI document: 1.0.0
  Contact: opensource@shinesolutions.com
  Generated by: https://openapi-generator.tech
]]

-- pipeline_step_metrics class
local pipeline_step_metrics = {}
local pipeline_step_metrics_mt = {
	__name = "pipeline_step_metrics";
	__index = pipeline_step_metrics;
}

local function cast_pipeline_step_metrics(t)
	return setmetatable(t, pipeline_step_metrics_mt)
end

local function new_pipeline_step_metrics(metrics)
	return cast_pipeline_step_metrics({
		["metrics"] = metrics;
	})
end

return {
	cast = cast_pipeline_step_metrics;
	new = new_pipeline_step_metrics;
}
