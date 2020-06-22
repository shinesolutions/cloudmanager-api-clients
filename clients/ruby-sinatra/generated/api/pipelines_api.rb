require 'json'


MyApp.add_route('DELETE', '/api/program/{programId}/pipeline/{pipelineId}', {
  "resourcePath" => "/Pipelines",
  "summary" => "Delete a Pipeline",
  "nickname" => "delete_pipeline", 
  "responseClass" => "void",
  "endpoint" => "/api/program/{programId}/pipeline/{pipelineId}", 
  "notes" => "Delete a pipeline. All the data is wiped.",
  "parameters" => [
    {
      "name" => "program_id",
      "description" => "Identifier of the program",
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


MyApp.add_route('GET', '/api/program/{programId}/pipeline/{pipelineId}', {
  "resourcePath" => "/Pipelines",
  "summary" => "Get Pipeline",
  "nickname" => "get_pipeline", 
  "responseClass" => "Pipeline",
  "endpoint" => "/api/program/{programId}/pipeline/{pipelineId}", 
  "notes" => "Returns a pipeline by its id",
  "parameters" => [
    {
      "name" => "program_id",
      "description" => "Identifier of the program",
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


MyApp.add_route('GET', '/api/program/{programId}/pipelines', {
  "resourcePath" => "/Pipelines",
  "summary" => "List Pipelines",
  "nickname" => "get_pipelines", 
  "responseClass" => "pipelineList",
  "endpoint" => "/api/program/{programId}/pipelines", 
  "notes" => "Returns all the pipelines that the requesting user has access to in an program",
  "parameters" => [
    {
      "name" => "program_id",
      "description" => "Identifier of the program",
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


MyApp.add_route('PATCH', '/api/program/{programId}/pipeline/{pipelineId}', {
  "resourcePath" => "/Pipelines",
  "summary" => "Patches Pipeline",
  "nickname" => "patch_pipeline", 
  "responseClass" => "Pipeline",
  "endpoint" => "/api/program/{programId}/pipeline/{pipelineId}", 
  "notes" => "Patches a pipeline within an program.",
  "parameters" => [
    {
      "name" => "program_id",
      "description" => "Identifier of the program",
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
    {
      "name" => "body",
      "description" => "The updated Pipeline",
      "dataType" => "Pipeline",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

