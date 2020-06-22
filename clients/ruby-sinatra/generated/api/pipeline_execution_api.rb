require 'json'


MyApp.add_route('PUT', '/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/advance', {
  "resourcePath" => "/PipelineExecution",
  "summary" => "Advance",
  "nickname" => "advance_pipeline_execution", 
  "responseClass" => "void",
  "endpoint" => "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/advance", 
  "notes" => "Post to this url in order to advance the current pipeline execution, if paused and waiting for user interaction. Link is present in output only in that case. The input depends on the actual reason for which the pipeline execution stopped.",
  "parameters" => [
    {
      "name" => "program_id",
      "description" => "Identifier of the program.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "pipeline_id",
      "description" => "Identifier of the pipeline",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "execution_id",
      "description" => "Identifier of the execution",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "phase_id",
      "description" => "Identifier of the phase",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "step_id",
      "description" => "Identifier of the step",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "x_gw_ims_org_id",
      "description" => "IMS organization ID that the request is being made under.",
      "dataType" => "String",
      "paramType" => "header",
    },
    {
      "name" => "authorization",
      "description" => "Bearer [token] - An access token for the technical account created through integration with Adobe IO",
      "dataType" => "String",
      "paramType" => "header",
    },
    {
      "name" => "x_api_key",
      "description" => "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io",
      "dataType" => "String",
      "paramType" => "header",
    },
    {
      "name" => "content_type",
      "description" => "Must always be application/json",
      "dataType" => "String",
      "paramType" => "header",
    },
    {
      "name" => "body",
      "description" => "Input for advance. See documentation for details.",
      "dataType" => "Object",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PUT', '/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/cancel', {
  "resourcePath" => "/PipelineExecution",
  "summary" => "Cancel",
  "nickname" => "cancel_pipeline_execution_step", 
  "responseClass" => "void",
  "endpoint" => "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/cancel", 
  "notes" => "Post to this url in order to cancel the current pipeline execution. Link is present in output only in that case.",
  "parameters" => [
    {
      "name" => "program_id",
      "description" => "Identifier of the program.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "pipeline_id",
      "description" => "Identifier of the pipeline",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "execution_id",
      "description" => "Identifier of the execution",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "phase_id",
      "description" => "Identifier of the phase",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "step_id",
      "description" => "Identifier of the step",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "x_gw_ims_org_id",
      "description" => "IMS organization ID that the request is being made under.",
      "dataType" => "String",
      "paramType" => "header",
    },
    {
      "name" => "authorization",
      "description" => "Bearer [token] - An access token for the technical account created through integration with Adobe IO",
      "dataType" => "String",
      "paramType" => "header",
    },
    {
      "name" => "x_api_key",
      "description" => "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io",
      "dataType" => "String",
      "paramType" => "header",
    },
    {
      "name" => "content_type",
      "description" => "Must always be application/json",
      "dataType" => "String",
      "paramType" => "header",
    },
    {
      "name" => "body",
      "description" => "Input for advance. See documentation for details.",
      "dataType" => "Object",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/program/{programId}/pipeline/{pipelineId}/execution', {
  "resourcePath" => "/PipelineExecution",
  "summary" => "Get current pipeline execution",
  "nickname" => "get_current_execution", 
  "responseClass" => "pipelineExecution",
  "endpoint" => "/api/program/{programId}/pipeline/{pipelineId}/execution", 
  "notes" => "Returns current pipeline execution if any.",
  "parameters" => [
    {
      "name" => "program_id",
      "description" => "Identifier of the program.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "pipeline_id",
      "description" => "Identifier of the pipeline",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "x_gw_ims_org_id",
      "description" => "IMS organization ID that the request is being made under.",
      "dataType" => "String",
      "paramType" => "header",
    },
    {
      "name" => "authorization",
      "description" => "Bearer [token] - An access token for the technical account created through integration with Adobe IO",
      "dataType" => "String",
      "paramType" => "header",
    },
    {
      "name" => "x_api_key",
      "description" => "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io",
      "dataType" => "String",
      "paramType" => "header",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}', {
  "resourcePath" => "/PipelineExecution",
  "summary" => "Get pipeline execution",
  "nickname" => "get_execution", 
  "responseClass" => "pipelineExecution",
  "endpoint" => "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}", 
  "notes" => "Returns a pipeline execution by id",
  "parameters" => [
    {
      "name" => "program_id",
      "description" => "Identifier of the program.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "pipeline_id",
      "description" => "Identifier of the pipeline",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "execution_id",
      "description" => "Identifier of the execution",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "x_gw_ims_org_id",
      "description" => "IMS organization ID that the request is being made under.",
      "dataType" => "String",
      "paramType" => "header",
    },
    {
      "name" => "authorization",
      "description" => "Bearer [token] - An access token for the technical account created through integration with Adobe IO",
      "dataType" => "String",
      "paramType" => "header",
    },
    {
      "name" => "x_api_key",
      "description" => "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io",
      "dataType" => "String",
      "paramType" => "header",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/program/{programId}/pipeline/{pipelineId}/executions', {
  "resourcePath" => "/PipelineExecution",
  "summary" => "List Executions",
  "nickname" => "get_executions", 
  "responseClass" => "PipelineExecutionListRepresentation",
  "endpoint" => "/api/program/{programId}/pipeline/{pipelineId}/executions", 
  "notes" => "Returns the history of pipeline executions in a newest to oldest order",
  "parameters" => [
    {
      "name" => "start",
      "description" => "Pagination start parameter",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "Pagination limit parameter",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "program_id",
      "description" => "Identifier of the program.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "pipeline_id",
      "description" => "Identifier of the pipeline",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "x_gw_ims_org_id",
      "description" => "IMS organization ID that the request is being made under.",
      "dataType" => "String",
      "paramType" => "header",
    },
    {
      "name" => "authorization",
      "description" => "Bearer [token] - An access token for the technical account created through integration with Adobe IO",
      "dataType" => "String",
      "paramType" => "header",
    },
    {
      "name" => "x_api_key",
      "description" => "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io",
      "dataType" => "String",
      "paramType" => "header",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/logs', {
  "resourcePath" => "/PipelineExecution",
  "summary" => "Get logs",
  "nickname" => "get_step_logs", 
  "responseClass" => "void",
  "endpoint" => "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/logs", 
  "notes" => "Get the logs associated with a step.",
  "parameters" => [
    {
      "name" => "file",
      "description" => "Identifier of the log file",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "program_id",
      "description" => "Identifier of the program.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "pipeline_id",
      "description" => "Identifier of the pipeline",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "execution_id",
      "description" => "Identifier of the execution",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "phase_id",
      "description" => "Identifier of the phase",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "step_id",
      "description" => "Identifier of the step",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "accept",
      "description" => "Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header.",
      "dataType" => "String",
      "paramType" => "header",
    },
    {
      "name" => "x_gw_ims_org_id",
      "description" => "IMS organization ID that the request is being made under.",
      "dataType" => "String",
      "paramType" => "header",
    },
    {
      "name" => "authorization",
      "description" => "Bearer [token] - An access token for the technical account created through integration with Adobe IO",
      "dataType" => "String",
      "paramType" => "header",
    },
    {
      "name" => "x_api_key",
      "description" => "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io",
      "dataType" => "String",
      "paramType" => "header",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PUT', '/api/program/{programId}/pipeline/{pipelineId}/execution', {
  "resourcePath" => "/PipelineExecution",
  "summary" => "Start the pipeline",
  "nickname" => "start_pipeline", 
  "responseClass" => "void",
  "endpoint" => "/api/program/{programId}/pipeline/{pipelineId}/execution", 
  "notes" => "Starts the Pipeline. This works only if the pipeline is not already started.",
  "parameters" => [
    {
      "name" => "program_id",
      "description" => "Identifier of the program.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "pipeline_id",
      "description" => "Identifier of the pipeline",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "x_gw_ims_org_id",
      "description" => "IMS organization ID that the request is being made under.",
      "dataType" => "String",
      "paramType" => "header",
    },
    {
      "name" => "authorization",
      "description" => "Bearer [token] - An access token for the technical account created through integration with Adobe IO",
      "dataType" => "String",
      "paramType" => "header",
    },
    {
      "name" => "x_api_key",
      "description" => "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io",
      "dataType" => "String",
      "paramType" => "header",
    },
    {
      "name" => "content_type",
      "description" => "Must always be application/json",
      "dataType" => "String",
      "paramType" => "header",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/metrics', {
  "resourcePath" => "/PipelineExecution",
  "summary" => "Get step metrics",
  "nickname" => "step_metric", 
  "responseClass" => "pipelineStepMetrics",
  "endpoint" => "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}/metrics", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "program_id",
      "description" => "Identifier of the program.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "pipeline_id",
      "description" => "Identifier of the pipeline",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "execution_id",
      "description" => "Identifier of the execution",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "phase_id",
      "description" => "Identifier of the phase",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "step_id",
      "description" => "Identifier of the step",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "x_gw_ims_org_id",
      "description" => "IMS organization ID that the request is being made under.",
      "dataType" => "String",
      "paramType" => "header",
    },
    {
      "name" => "authorization",
      "description" => "Bearer [token] - An access token for the technical account created through integration with Adobe IO",
      "dataType" => "String",
      "paramType" => "header",
    },
    {
      "name" => "x_api_key",
      "description" => "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io",
      "dataType" => "String",
      "paramType" => "header",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}', {
  "resourcePath" => "/PipelineExecution",
  "summary" => "Get step state",
  "nickname" => "step_state", 
  "responseClass" => "pipelineExecutionStepState",
  "endpoint" => "/api/program/{programId}/pipeline/{pipelineId}/execution/{executionId}/phase/{phaseId}/step/{stepId}", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "program_id",
      "description" => "Identifier of the program.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "pipeline_id",
      "description" => "Identifier of the pipeline",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "execution_id",
      "description" => "Identifier of the execution",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "phase_id",
      "description" => "Identifier of the phase",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "step_id",
      "description" => "Identifier of the step",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "x_gw_ims_org_id",
      "description" => "IMS organization ID that the request is being made under.",
      "dataType" => "String",
      "paramType" => "header",
    },
    {
      "name" => "authorization",
      "description" => "Bearer [token] - An access token for the technical account created through integration with Adobe IO",
      "dataType" => "String",
      "paramType" => "header",
    },
    {
      "name" => "x_api_key",
      "description" => "IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io",
      "dataType" => "String",
      "paramType" => "header",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

