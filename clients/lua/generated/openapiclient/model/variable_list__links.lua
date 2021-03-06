--[[
  Cloud Manager API
 
  This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
 
  The version of the OpenAPI document: 1.0.0
  Contact: opensource@shinesolutions.com
  Generated by: https://openapi-generator.tech
]]

-- variable_list__links class
local variable_list__links = {}
local variable_list__links_mt = {
	__name = "variable_list__links";
	__index = variable_list__links;
}

local function cast_variable_list__links(t)
	return setmetatable(t, variable_list__links_mt)
end

local function new_variable_list__links(http__ns_adobe_com_adobecloud_rel_environment, http__ns_adobe_com_adobecloud_rel_program, self)
	return cast_variable_list__links({
		["http://ns.adobe.com/adobecloud/rel/environment"] = http__ns_adobe_com_adobecloud_rel_environment;
		["http://ns.adobe.com/adobecloud/rel/program"] = http__ns_adobe_com_adobecloud_rel_program;
		["self"] = self;
	})
end

return {
	cast = cast_variable_list__links;
	new = new_variable_list__links;
}
