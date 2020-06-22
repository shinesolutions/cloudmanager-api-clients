--[[
  Cloud Manager API
 
  This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
 
  The version of the OpenAPI document: 1.0.0
  Contact: opensource@shinesolutions.com
  Generated by: https://openapi-generator.tech
]]

-- environment_logs class
local environment_logs = {}
local environment_logs_mt = {
	__name = "environment_logs";
	__index = environment_logs;
}

local function cast_environment_logs(t)
	return setmetatable(t, environment_logs_mt)
end

local function new_environment_logs(service, name, days, _links, _embedded)
	return cast_environment_logs({
		["service"] = service;
		["name"] = name;
		["days"] = days;
		["_links"] = _links;
		["_embedded"] = _embedded;
	})
end

return {
	cast = cast_environment_logs;
	new = new_environment_logs;
}
