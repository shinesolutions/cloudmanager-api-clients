=begin
Cloud Manager API

This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.

The version of the OpenAPI document: 1.0.0
Contact: opensource@shinesolutions.com
Generated by: https://github.com/openapitools/openapi-generator.git

=end
Rails.application.routes.draw do

  def add_openapi_route http_method, path, opts = {}
    full_path = path.gsub(/{(.*?)}/, ':\1')
    match full_path, to: "#{opts.fetch(:controller_name)}##{opts[:action_name]}", via: http_method
  end

  add_openapi_route 'GET', '/api/program/{programId}/repository/{repositoryId}/branches', controller_name: 'branches', action_name: 'get_branches'
  add_openapi_route 'DELETE', '/api/program/{programId}/environment/{environmentId}', controller_name: 'environments', action_name: 'delete_environment'
  add_openapi_route 'GET', '/api/program/{programId}/environment/{environmentId}/logs/download', controller_name: 'environments', action_name: 'download_logs'
  add_openapi_route 'GET', '/api/program/{programId}/environment/{environmentId}', controller_name: 'environments', action_name: 'get_environment'
  add_openapi_route 'GET', '/api/program/{programId}/environment/{environmentId}/logs', controller_name: 'environments', action_name: 'get_environment_logs'
  add_openapi_route 'GET', '/api/program/{programId}/environments', controller_name: 'environments', action_name: 'get_environments'
  add_openapi_route 'PUT', '/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/advance', controller_name: 'pipeline_execution', action_name: 'advance_pipeline_execution'
  add_openapi_route 'PUT', '/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/cancel', controller_name: 'pipeline_execution', action_name: 'cancel_pipeline_execution_step'
  add_openapi_route 'GET', '/api/program/{programId}/pipeline/{pipelineId}/execution', controller_name: 'pipeline_execution', action_name: 'get_current_execution'
  add_openapi_route 'GET', '/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}', controller_name: 'pipeline_execution', action_name: 'get_execution'
  add_openapi_route 'GET', '/api/program/{programId}/pipeline/{pipelineId}/executions', controller_name: 'pipeline_execution', action_name: 'get_executions'
  add_openapi_route 'GET', '/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/logs', controller_name: 'pipeline_execution', action_name: 'get_step_logs'
  add_openapi_route 'PUT', '/api/program/{programId}/pipeline/{pipelineId}/execution', controller_name: 'pipeline_execution', action_name: 'start_pipeline'
  add_openapi_route 'GET', '/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/metrics', controller_name: 'pipeline_execution', action_name: 'step_metric'
  add_openapi_route 'GET', '/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}', controller_name: 'pipeline_execution', action_name: 'step_state'
  add_openapi_route 'DELETE', '/api/program/{programId}/pipeline/{pipelineId}', controller_name: 'pipelines', action_name: 'delete_pipeline'
  add_openapi_route 'GET', '/api/program/{programId}/pipeline/{pipelineId}', controller_name: 'pipelines', action_name: 'get_pipeline'
  add_openapi_route 'GET', '/api/program/{programId}/pipelines', controller_name: 'pipelines', action_name: 'get_pipelines'
  add_openapi_route 'PATCH', '/api/program/{programId}/pipeline/{pipelineId}', controller_name: 'pipelines', action_name: 'patch_pipeline'
  add_openapi_route 'DELETE', '/api/program/{programId}', controller_name: 'programs', action_name: 'delete_program'
  add_openapi_route 'GET', '/api/program/{programId}', controller_name: 'programs', action_name: 'get_program'
  add_openapi_route 'GET', '/api/programs', controller_name: 'programs', action_name: 'get_programs'
  add_openapi_route 'GET', '/api/program/{programId}/repositories', controller_name: 'repositories', action_name: 'get_repositories'
  add_openapi_route 'GET', '/api/program/{programId}/repository/{repositoryId}', controller_name: 'repositories', action_name: 'get_repository'
  add_openapi_route 'GET', '/api/program/{programId}/environment/{environmentId}/variables', controller_name: 'variables', action_name: 'get_environment_variables'
  add_openapi_route 'PATCH', '/api/program/{programId}/environment/{environmentId}/variables', controller_name: 'variables', action_name: 'patch_environment_variables'
end
