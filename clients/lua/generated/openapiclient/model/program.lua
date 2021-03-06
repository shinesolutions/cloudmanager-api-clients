--[[
  Cloud Manager API
 
  This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
 
  The version of the OpenAPI document: 1.0.0
  Contact: opensource@shinesolutions.com
  Generated by: https://openapi-generator.tech
]]

-- program class
local program = {}
local program_mt = {
	__name = "program";
	__index = program;
}

local function cast_program(t)
	return setmetatable(t, program_mt)
end

local function new_program(id, name, enabled, tenant_id, ims_org_id, _links)
	return cast_program({
		["id"] = id;
		["name"] = name;
		["enabled"] = enabled;
		["tenantId"] = tenant_id;
		["imsOrgId"] = ims_org_id;
		["_links"] = _links;
	})
end

return {
	cast = cast_program;
	new = new_program;
}
