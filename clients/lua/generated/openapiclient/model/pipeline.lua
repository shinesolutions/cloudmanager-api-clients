--[[
  Cloud Manager API
 
  This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
 
  The version of the OpenAPI document: 1.0.0
  Contact: opensource@shinesolutions.com
  Generated by: https://openapi-generator.tech
]]

-- pipeline class
local pipeline = {}
local pipeline_mt = {
	__name = "pipeline";
	__index = pipeline;
}

local function cast_pipeline(t)
	return setmetatable(t, pipeline_mt)
end

local function new_pipeline(id, program_id, name, trigger, status, created_at, updated_at, last_started_at, last_finished_at, phases, _links)
	return cast_pipeline({
		["id"] = id;
		["programId"] = program_id;
		["name"] = name;
		["trigger"] = trigger;
		["status"] = status;
		["createdAt"] = created_at;
		["updatedAt"] = updated_at;
		["lastStartedAt"] = last_started_at;
		["lastFinishedAt"] = last_finished_at;
		["phases"] = phases;
		["_links"] = _links;
	})
end

return {
	cast = cast_pipeline;
	new = new_pipeline;
}
