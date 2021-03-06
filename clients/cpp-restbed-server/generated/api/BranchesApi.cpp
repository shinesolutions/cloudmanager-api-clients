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

#include "BranchesApi.h"

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

BranchesApi::BranchesApi() {
	std::shared_ptr<BranchesApiApiProgramProgramIdRepositoryRepositoryIdBranchesResource> spBranchesApiApiProgramProgramIdRepositoryRepositoryIdBranchesResource = std::make_shared<BranchesApiApiProgramProgramIdRepositoryRepositoryIdBranchesResource>();
	this->publish(spBranchesApiApiProgramProgramIdRepositoryRepositoryIdBranchesResource);

}

BranchesApi::~BranchesApi() {}

void BranchesApi::startService(int const& port) {
	std::shared_ptr<restbed::Settings> settings = std::make_shared<restbed::Settings>();
	settings->set_port(port);
	settings->set_root("");
	
	this->start(settings);
}

void BranchesApi::stopService() {
	this->stop();
}

BranchesApiApiProgramProgramIdRepositoryRepositoryIdBranchesResource::BranchesApiApiProgramProgramIdRepositoryRepositoryIdBranchesResource()
{
	this->set_path("/api/program/{programId: .*}/repository/{repositoryId: .*}/branches/");
	this->set_method_handler("GET",
		std::bind(&BranchesApiApiProgramProgramIdRepositoryRepositoryIdBranchesResource::GET_method_handler, this,
			std::placeholders::_1));
}

BranchesApiApiProgramProgramIdRepositoryRepositoryIdBranchesResource::~BranchesApiApiProgramProgramIdRepositoryRepositoryIdBranchesResource()
{
}

void BranchesApiApiProgramProgramIdRepositoryRepositoryIdBranchesResource::set_handler_GET(
	std::function<std::pair<int, std::string>(
		std::string const &, std::string const &, std::string const &, std::string const &, std::string const &
	)> handler) {
	handler_GET_ = std::move(handler);
}


void BranchesApiApiProgramProgramIdRepositoryRepositoryIdBranchesResource::GET_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();

			// Getting the path params
			const std::string programId = request->get_path_parameter("programId", "");
			const std::string repositoryId = request->get_path_parameter("repositoryId", "");


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
					programId, repositoryId, xGwImsOrgId, authorization, xApiKey
				);
			}

			if (status_code == 200) {
				session->close(200, result.empty() ? "Successful retrieval of the list of repository branches" : std::move(result), { {"Connection", "close"} });
				return;
			}

}




}
}
}
}

