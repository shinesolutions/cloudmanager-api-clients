require 'json'


MyApp.add_route('GET', '/api/program/{programId}/repositories', {
  "resourcePath" => "/Repositories",
  "summary" => "Lists Repositories",
  "nickname" => "get_repositories", 
  "responseClass" => "repositoryList",
  "endpoint" => "/api/program/{programId}/repositories", 
  "notes" => "Lists all Repositories in an program",
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


MyApp.add_route('GET', '/api/program/{programId}/repository/{repositoryId}', {
  "resourcePath" => "/Repositories",
  "summary" => "Get Repository",
  "nickname" => "get_repository", 
  "responseClass" => "Repository",
  "endpoint" => "/api/program/{programId}/repository/{repositoryId}", 
  "notes" => "Returns an repository by its id",
  "parameters" => [
    {
      "name" => "program_id",
      "description" => "Identifier of the program",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "repository_id",
      "description" => "Identifier of the repository",
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

