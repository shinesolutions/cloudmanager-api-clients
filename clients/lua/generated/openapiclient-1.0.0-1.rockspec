package = "openapiclient"
version = "1.0.0-1"
source = {
	url = "https://github.com/GIT_USER_ID/GIT_REPO_ID.git"
}

description = {
	summary = "API client genreated by OpenAPI Generator",
	detailed = [[
This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.]],
	homepage = "https://openapi-generator.tech",
	license = "Unlicense",
	maintainer = "OpenAPI Generator contributors",
}

dependencies = {
	"lua >= 5.2",
	"http",
	"dkjson",
	"basexx"
}

build = {
	type = "builtin",
	modules = {
		["openapiclient.api.branches_api"] = "openapiclient/api/branches_api.lua";
		["openapiclient.api.environments_api"] = "openapiclient/api/environments_api.lua";
		["openapiclient.api.pipeline_execution_api"] = "openapiclient/api/pipeline_execution_api.lua";
		["openapiclient.api.pipelines_api"] = "openapiclient/api/pipelines_api.lua";
		["openapiclient.api.programs_api"] = "openapiclient/api/programs_api.lua";
		["openapiclient.api.repositories_api"] = "openapiclient/api/repositories_api.lua";
		["openapiclient.api.variables_api"] = "openapiclient/api/variables_api.lua";
		["openapiclient.model.bad_request_error"] = "openapiclient/model/bad_request_error.lua";
		["openapiclient.model.branch_list"] = "openapiclient/model/branch_list.lua";
		["openapiclient.model.branch_list__embedded"] = "openapiclient/model/branch_list__embedded.lua";
		["openapiclient.model.embedded_program"] = "openapiclient/model/embedded_program.lua";
		["openapiclient.model.environment"] = "openapiclient/model/environment.lua";
		["openapiclient.model.environment__links"] = "openapiclient/model/environment__links.lua";
		["openapiclient.model.environment_list"] = "openapiclient/model/environment_list.lua";
		["openapiclient.model.environment_list__embedded"] = "openapiclient/model/environment_list__embedded.lua";
		["openapiclient.model.environment_log"] = "openapiclient/model/environment_log.lua";
		["openapiclient.model.environment_log__links"] = "openapiclient/model/environment_log__links.lua";
		["openapiclient.model.environment_logs"] = "openapiclient/model/environment_logs.lua";
		["openapiclient.model.environment_logs__embedded"] = "openapiclient/model/environment_logs__embedded.lua";
		["openapiclient.model.environment_logs__links"] = "openapiclient/model/environment_logs__links.lua";
		["openapiclient.model.hal_link"] = "openapiclient/model/hal_link.lua";
		["openapiclient.model.invalid_parameter"] = "openapiclient/model/invalid_parameter.lua";
		["openapiclient.model.metric"] = "openapiclient/model/metric.lua";
		["openapiclient.model.missing_parameter"] = "openapiclient/model/missing_parameter.lua";
		["openapiclient.model.pipeline"] = "openapiclient/model/pipeline.lua";
		["openapiclient.model.pipeline__links"] = "openapiclient/model/pipeline__links.lua";
		["openapiclient.model.pipeline_execution"] = "openapiclient/model/pipeline_execution.lua";
		["openapiclient.model.pipeline_execution__embedded"] = "openapiclient/model/pipeline_execution__embedded.lua";
		["openapiclient.model.pipeline_execution__links"] = "openapiclient/model/pipeline_execution__links.lua";
		["openapiclient.model.pipeline_execution_list_representation"] = "openapiclient/model/pipeline_execution_list_representation.lua";
		["openapiclient.model.pipeline_execution_list_representation__embedded"] = "openapiclient/model/pipeline_execution_list_representation__embedded.lua";
		["openapiclient.model.pipeline_execution_list_representation__links"] = "openapiclient/model/pipeline_execution_list_representation__links.lua";
		["openapiclient.model.pipeline_execution_step_state"] = "openapiclient/model/pipeline_execution_step_state.lua";
		["openapiclient.model.pipeline_execution_step_state__links"] = "openapiclient/model/pipeline_execution_step_state__links.lua";
		["openapiclient.model.pipeline_list"] = "openapiclient/model/pipeline_list.lua";
		["openapiclient.model.pipeline_list__embedded"] = "openapiclient/model/pipeline_list__embedded.lua";
		["openapiclient.model.pipeline_phase"] = "openapiclient/model/pipeline_phase.lua";
		["openapiclient.model.pipeline_step_metrics"] = "openapiclient/model/pipeline_step_metrics.lua";
		["openapiclient.model.program"] = "openapiclient/model/program.lua";
		["openapiclient.model.program__links"] = "openapiclient/model/program__links.lua";
		["openapiclient.model.program_list"] = "openapiclient/model/program_list.lua";
		["openapiclient.model.program_list__embedded"] = "openapiclient/model/program_list__embedded.lua";
		["openapiclient.model.program_list__links"] = "openapiclient/model/program_list__links.lua";
		["openapiclient.model.repository"] = "openapiclient/model/repository.lua";
		["openapiclient.model.repository__links"] = "openapiclient/model/repository__links.lua";
		["openapiclient.model.repository_branch"] = "openapiclient/model/repository_branch.lua";
		["openapiclient.model.repository_branch__links"] = "openapiclient/model/repository_branch__links.lua";
		["openapiclient.model.repository_list"] = "openapiclient/model/repository_list.lua";
		["openapiclient.model.repository_list__embedded"] = "openapiclient/model/repository_list__embedded.lua";
		["openapiclient.model.requested_page_details"] = "openapiclient/model/requested_page_details.lua";
		["openapiclient.model.variable"] = "openapiclient/model/variable.lua";
		["openapiclient.model.variable_list"] = "openapiclient/model/variable_list.lua";
		["openapiclient.model.variable_list__embedded"] = "openapiclient/model/variable_list__embedded.lua";
		["openapiclient.model.variable_list__links"] = "openapiclient/model/variable_list__links.lua";
	}
}
