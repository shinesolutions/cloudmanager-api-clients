/**
 * Cloud Manager API
 * This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 4.3.1-SNAPSHOT.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


#include <corvusoft/restbed/byte.hpp>
#include <corvusoft/restbed/string.hpp>
#include <corvusoft/restbed/settings.hpp>
#include <corvusoft/restbed/request.hpp>

#include "PipelinesApi.h"

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

PipelinesApi::PipelinesApi() {
	std::shared_ptr<PipelinesApiApiProgramProgramIdPipelinePipelineIdResource> spPipelinesApiApiProgramProgramIdPipelinePipelineIdResource = std::make_shared<PipelinesApiApiProgramProgramIdPipelinePipelineIdResource>();
	this->publish(spPipelinesApiApiProgramProgramIdPipelinePipelineIdResource);

	std::shared_ptr<PipelinesApiApiProgramProgramIdPipelinesResource> spPipelinesApiApiProgramProgramIdPipelinesResource = std::make_shared<PipelinesApiApiProgramProgramIdPipelinesResource>();
	this->publish(spPipelinesApiApiProgramProgramIdPipelinesResource);

}

PipelinesApi::~PipelinesApi() {}

void PipelinesApi::startService(int const& port) {
	std::shared_ptr<restbed::Settings> settings = std::make_shared<restbed::Settings>();
	settings->set_port(port);
	settings->set_root("");
	
	this->start(settings);
}

void PipelinesApi::stopService() {
	this->stop();
}

PipelinesApiApiProgramProgramIdPipelinePipelineIdResource::PipelinesApiApiProgramProgramIdPipelinePipelineIdResource()
{
	this->set_path("/api/program/{programId: .*}/pipeline/{pipelineId: .*}/");
	this->set_method_handler("DELETE",
		std::bind(&PipelinesApiApiProgramProgramIdPipelinePipelineIdResource::DELETE_method_handler, this,
			std::placeholders::_1));
	this->set_method_handler("GET",
		std::bind(&PipelinesApiApiProgramProgramIdPipelinePipelineIdResource::GET_method_handler, this,
			std::placeholders::_1));
	this->set_method_handler("PATCH",
		std::bind(&PipelinesApiApiProgramProgramIdPipelinePipelineIdResource::PATCH_method_handler, this,
			std::placeholders::_1));
}

PipelinesApiApiProgramProgramIdPipelinePipelineIdResource::~PipelinesApiApiProgramProgramIdPipelinePipelineIdResource()
{
}

void PipelinesApiApiProgramProgramIdPipelinePipelineIdResource::set_handler_DELETE(
	std::function<std::pair<int, std::string>(
		std::string const &, std::string const &, std::string const &, std::string const &, std::string const &
	)> handler) {
	handler_DELETE_ = std::move(handler);
}

void PipelinesApiApiProgramProgramIdPipelinePipelineIdResource::set_handler_GET(
	std::function<std::pair<int, std::string>(
		std::string const &, std::string const &, std::string const &, std::string const &, std::string const &
	)> handler) {
	handler_GET_ = std::move(handler);
}
void PipelinesApiApiProgramProgramIdPipelinePipelineIdResource::set_handler_PATCH(
	std::function<std::pair<int, std::string>(
		std::string const &, std::string const &, std::string const &, std::string const &, std::string const &, std::string const &, std::shared_ptr<Pipeline> const &
	)> handler) {
	handler_PATCH_ = std::move(handler);
}

void PipelinesApiApiProgramProgramIdPipelinePipelineIdResource::DELETE_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();

			// Getting the path params
			const std::string programId = request->get_path_parameter("programId", "");
			const std::string pipelineId = request->get_path_parameter("pipelineId", "");


			// Getting the headers
			const std::string xGwImsOrgId = request->get_header("xGwImsOrgId", "");
			const std::string authorization = request->get_header("authorization", "");
			const std::string xApiKey = request->get_header("xApiKey", "");

			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			std::string result = "successful operation";

			if (handler_DELETE_)
			{
				std::tie(status_code, result) = handler_DELETE_(
					programId, pipelineId, xGwImsOrgId, authorization, xApiKey
				);
			}

			if (status_code == 0) {
				session->close(0, result.empty() ? "successful operation" : std::move(result), { {"Connection", "close"} });
				return;
			}

}

void PipelinesApiApiProgramProgramIdPipelinePipelineIdResource::GET_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();

			// Getting the path params
			const std::string programId = request->get_path_parameter("programId", "");
			const std::string pipelineId = request->get_path_parameter("pipelineId", "");


			// Getting the headers
			const std::string xGwImsOrgId = request->get_header("xGwImsOrgId", "");
			const std::string authorization = request->get_header("authorization", "");
			const std::string xApiKey = request->get_header("xApiKey", "");

			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			std::string result = "successful operation";

			if (handler_GET_)
			{
				std::tie(status_code, result) = handler_GET_(
					programId, pipelineId, xGwImsOrgId, authorization, xApiKey
				);
			}

			if (status_code == 200) {
				std::shared_ptr<Pipeline> response = NULL;
				session->close(200, result.empty() ? "Successful retrieval of pipeline" : std::move(result), { {"Connection", "close"} });
				return;
			}
			if (status_code == 404) {
				session->close(404, result.empty() ? "Pipeline not found" : std::move(result), { {"Connection", "close"} });
				return;
			}

}
void PipelinesApiApiProgramProgramIdPipelinePipelineIdResource::PATCH_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
	// Body params are present, therefore we have to fetch them
	int content_length = request->get_header("Content-Length", 0);
	session->fetch(content_length,
		[ this ]( const std::shared_ptr<restbed::Session> session, const restbed::Bytes & body )
		{

			const auto request = session->get_request();
			std::string file = restbed::String::format("%.*s\n", ( int ) body.size( ), body.data( ));

			// Getting the path params
			const std::string programId = request->get_path_parameter("programId", "");
			const std::string pipelineId = request->get_path_parameter("pipelineId", "");


			// Getting the headers
			const std::string xGwImsOrgId = request->get_header("xGwImsOrgId", "");
			const std::string authorization = request->get_header("authorization", "");
			const std::string xApiKey = request->get_header("xApiKey", "");
			const std::string contentType = request->get_header("contentType", "");

			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			std::string result = "successful operation";

			if (handler_PATCH_)
			{
				std::tie(status_code, result) = handler_PATCH_(
					programId, pipelineId, xGwImsOrgId, authorization, xApiKey, contentType, body
				);
			}

			if (status_code == 200) {
				std::shared_ptr<Pipeline> response = NULL;
				session->close(200, result.empty() ? "successful operation" : std::move(result), { {"Connection", "close"} });
				return;
			}

		});
}


PipelinesApiApiProgramProgramIdPipelinesResource::PipelinesApiApiProgramProgramIdPipelinesResource()
{
	this->set_path("/api/program/{programId: .*}/pipelines/");
	this->set_method_handler("GET",
		std::bind(&PipelinesApiApiProgramProgramIdPipelinesResource::GET_method_handler, this,
			std::placeholders::_1));
}

PipelinesApiApiProgramProgramIdPipelinesResource::~PipelinesApiApiProgramProgramIdPipelinesResource()
{
}

void PipelinesApiApiProgramProgramIdPipelinesResource::set_handler_GET(
	std::function<std::pair<int, std::string>(
		std::string const &, std::string const &, std::string const &, std::string const &
	)> handler) {
	handler_GET_ = std::move(handler);
}


void PipelinesApiApiProgramProgramIdPipelinesResource::GET_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();

			// Getting the path params
			const std::string programId = request->get_path_parameter("programId", "");


			// Getting the headers
			const std::string xGwImsOrgId = request->get_header("xGwImsOrgId", "");
			const std::string authorization = request->get_header("authorization", "");
			const std::string xApiKey = request->get_header("xApiKey", "");

			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			std::string result = "successful operation";

			if (handler_GET_)
			{
				std::tie(status_code, result) = handler_GET_(
					programId, xGwImsOrgId, authorization, xApiKey
				);
			}

			if (status_code == 200) {
				session->close(200, result.empty() ? "successful operation" : std::move(result), { {"Connection", "close"} });
				return;
			}

}




}
}
}
}

