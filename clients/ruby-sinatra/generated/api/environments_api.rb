require 'json'


MyApp.add_route('DELETE', '/api/program/{programId}/environment/{environmentId}', {
  "resourcePath" => "/Environments",
  "summary" => "DeleteEnvironment",
  "nickname" => "delete_environment", 
  "responseClass" => "Environment",
  "endpoint" => "/api/program/{programId}/environment/{environmentId}", 
  "notes" => "Delete environment",
  "parameters" => [
    {
      "name" => "program_id",
      "description" => "Identifier of the application",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "environment_id",
      "description" => "Identifier of the environment",
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


MyApp.add_route('GET', '/api/program/{programId}/environment/{environmentId}/logs/download', {
  "resourcePath" => "/Environments",
  "summary" => "Download Logs",
  "nickname" => "download_logs", 
  "responseClass" => "void",
  "endpoint" => "/api/program/{programId}/environment/{environmentId}/logs/download", 
  "notes" => "Download environment logs",
  "parameters" => [
    {
      "name" => "service",
      "description" => "Name of service",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "name",
      "description" => "Name of log",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "date",
      "description" => "date for which log is required",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "program_id",
      "description" => "Identifier of the program",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "environment_id",
      "description" => "Identifier of the environment",
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
      "name" => "accept",
      "description" => "Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header.",
      "dataType" => "String",
      "paramType" => "header",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/program/{programId}/environment/{environmentId}', {
  "resourcePath" => "/Environments",
  "summary" => "Get Environment",
  "nickname" => "get_environment", 
  "responseClass" => "Environment",
  "endpoint" => "/api/program/{programId}/environment/{environmentId}", 
  "notes" => "Returns an environment by its id",
  "parameters" => [
    {
      "name" => "program_id",
      "description" => "Identifier of the program",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "environment_id",
      "description" => "Identifier of the environment",
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


MyApp.add_route('GET', '/api/program/{programId}/environment/{environmentId}/logs', {
  "resourcePath" => "/Environments",
  "summary" => "Get Environment Logs",
  "nickname" => "get_environment_logs", 
  "responseClass" => "EnvironmentLogs",
  "endpoint" => "/api/program/{programId}/environment/{environmentId}/logs", 
  "notes" => "List all logs available in environment",
  "parameters" => [
    {
      "name" => "service",
      "description" => "Names of services",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "name",
      "description" => "Names of log",
      "dataType" => "Array<String>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "days",
      "description" => "number of days for which logs are required",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "program_id",
      "description" => "Identifier of the program",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "environment_id",
      "description" => "Identifier of the environment",
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


MyApp.add_route('GET', '/api/program/{programId}/environments', {
  "resourcePath" => "/Environments",
  "summary" => "List Environments",
  "nickname" => "get_environments", 
  "responseClass" => "environmentList",
  "endpoint" => "/api/program/{programId}/environments", 
  "notes" => "Lists all environments in an program",
  "parameters" => [
    {
      "name" => "type",
      "description" => "Type of the environment",
      "dataType" => "String",
      "allowableValues" => "[dev, stage, prod]",
      "paramType" => "query",
    },
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

