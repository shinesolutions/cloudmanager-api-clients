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

/*
 * VariablesApi.h
 *
 * 
 */

#ifndef VariablesApi_H_
#define VariablesApi_H_


#include <memory>
#include <utility>

#include <corvusoft/restbed/session.hpp>
#include <corvusoft/restbed/resource.hpp>
#include <corvusoft/restbed/service.hpp>

#include "Variable.h"
#include "VariableList.h"
#include <string>
#include <vector>

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

class  VariablesApi: public restbed::Service
{
public:
	VariablesApi();
	~VariablesApi();
	void startService(int const& port);
	void stopService();
};


/// <summary>
/// List User Environment Variables
/// </summary>
/// <remarks>
/// List the user defined variables for an environment (Cloud Service only).
/// </remarks>
class  VariablesApiApiProgramProgramIdEnvironmentEnvironmentIdVariablesResource: public restbed::Resource
{
public:
	VariablesApiApiProgramProgramIdEnvironmentEnvironmentIdVariablesResource();
    virtual ~VariablesApiApiProgramProgramIdEnvironmentEnvironmentIdVariablesResource();
    void GET_method_handler(const std::shared_ptr<restbed::Session> session);
    void PATCH_method_handler(const std::shared_ptr<restbed::Session> session);

	void set_handler_GET(
		std::function<std::pair<int, std::string>(
			std::string const &, std::string const &, std::string const &, std::string const &, std::string const &
		)> handler
	);

	void set_handler_PATCH(
		std::function<std::pair<int, std::string>(
			std::string const &, std::string const &, std::string const &, std::string const &, std::string const &, std::string const &, std::vector<std::shared_ptr<Variable>> const &
		)> handler
	);

private:
	std::function<std::pair<int, std::string>(
		std::string const &, std::string const &, std::string const &, std::string const &, std::string const &
	)> handler_GET_;

	std::function<std::pair<int, std::string>(
		std::string const &, std::string const &, std::string const &, std::string const &, std::string const &, std::string const &, std::vector<std::shared_ptr<Variable>> const &
	)> handler_PATCH_;

	std::string programId{};
	std::string environmentId{};
	std::string xGwImsOrgId{};
	std::string authorization{};
	std::string xApiKey{};
};


}
}
}
}

#endif /* VariablesApi_H_ */

