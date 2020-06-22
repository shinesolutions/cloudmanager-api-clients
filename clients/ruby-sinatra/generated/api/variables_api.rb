require 'json'


MyApp.add_route('GET', '/api/program/{programId}/environment/{environmentId}/variables', {
  "resourcePath" => "/Variables",
  "summary" => "List User Environment Variables",
  "nickname" => "get_environment_variables", 
  "responseClass" => "variableList",
  "endpoint" => "/api/program/{programId}/environment/{environmentId}/variables", 
  "notes" => "List the user defined variables for an environment (Cloud Service only).",
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


MyApp.add_route('PATCH', '/api/program/{programId}/environment/{environmentId}/variables', {
  "resourcePath" => "/Variables",
  "summary" => "Patch User Environment Variables",
  "nickname" => "patch_environment_variables", 
  "responseClass" => "variableList",
  "endpoint" => "/api/program/{programId}/environment/{environmentId}/variables", 
  "notes" => "Modify multiple environment variables (Cloud Service only). To delete a variable, include it with an empty value.",
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
    {
      "name" => "content_type",
      "description" => "Must always be application/json",
      "dataType" => "String",
      "paramType" => "header",
    },
    {
      "name" => "body",
      "description" => "The list of variables to add, modify, or remove. It is not necessary to send variables here which are not changing.",
      "dataType" => "Array<Variable>",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

