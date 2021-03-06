--[[
  Cloud Manager API
 
  This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
 
  The version of the OpenAPI document: 1.0.0
  Contact: opensource@shinesolutions.com
  Generated by: https://openapi-generator.tech
]]

-- program_list__embedded class
local program_list__embedded = {}
local program_list__embedded_mt = {
	__name = "program_list__embedded";
	__index = program_list__embedded;
}

local function cast_program_list__embedded(t)
	return setmetatable(t, program_list__embedded_mt)
end

local function new_program_list__embedded(programs)
	return cast_program_list__embedded({
		["programs"] = programs;
	})
end

return {
	cast = cast_program_list__embedded;
	new = new_program_list__embedded;
}
