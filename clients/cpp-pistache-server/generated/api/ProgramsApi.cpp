/**
* Cloud Manager API
* This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
*
* The version of the OpenAPI document: 1.0.0
* Contact: opensource@shinesolutions.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/

#include "ProgramsApi.h"
#include "Helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::helpers;
using namespace org::openapitools::server::model;

ProgramsApi::ProgramsApi(std::shared_ptr<Pistache::Rest::Router> rtr) { 
    router = rtr;
}

void ProgramsApi::init() {
    setupRoutes();
}

void ProgramsApi::setupRoutes() {
    using namespace Pistache::Rest;

    Routes::Delete(*router, base + "/api/program/:programId", Routes::bind(&ProgramsApi::delete_program_handler, this));
    Routes::Get(*router, base + "/api/program/:programId", Routes::bind(&ProgramsApi::get_program_handler, this));
    Routes::Get(*router, base + "/api/programs", Routes::bind(&ProgramsApi::get_programs_handler, this));

    // Default handler, called when a route is not found
    router->addCustomHandler(Routes::bind(&ProgramsApi::programs_api_default_handler, this));
}

void ProgramsApi::delete_program_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    // Getting the path params
    auto programId = request.param(":programId").as<std::string>();
    
    // Getting the header params
    auto xGwImsOrgId = request.headers().tryGetRaw("x-gw-ims-org-id");
    auto authorization = request.headers().tryGetRaw("Authorization");
    auto xApiKey = request.headers().tryGetRaw("x-api-key");

    try {
      this->delete_program(programId, xGwImsOrgId, authorization, xApiKey, response);
    } catch (nlohmann::detail::exception &e) {
        //send a 400 error
        response.send(Pistache::Http::Code::Bad_Request, e.what());
        return;
    } catch (std::exception &e) {
        //send a 500 error
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
        return;
    }

}
void ProgramsApi::get_program_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    // Getting the path params
    auto programId = request.param(":programId").as<std::string>();
    
    // Getting the header params
    auto xGwImsOrgId = request.headers().tryGetRaw("x-gw-ims-org-id");
    auto authorization = request.headers().tryGetRaw("Authorization");
    auto xApiKey = request.headers().tryGetRaw("x-api-key");

    try {
      this->get_program(programId, xGwImsOrgId, authorization, xApiKey, response);
    } catch (nlohmann::detail::exception &e) {
        //send a 400 error
        response.send(Pistache::Http::Code::Bad_Request, e.what());
        return;
    } catch (std::exception &e) {
        //send a 500 error
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
        return;
    }

}
void ProgramsApi::get_programs_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {

    // Getting the header params
    auto xGwImsOrgId = request.headers().tryGetRaw("x-gw-ims-org-id");
    auto authorization = request.headers().tryGetRaw("Authorization");
    auto xApiKey = request.headers().tryGetRaw("x-api-key");

    try {
      this->get_programs(xGwImsOrgId, authorization, xApiKey, response);
    } catch (nlohmann::detail::exception &e) {
        //send a 400 error
        response.send(Pistache::Http::Code::Bad_Request, e.what());
        return;
    } catch (std::exception &e) {
        //send a 500 error
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
        return;
    }

}

void ProgramsApi::programs_api_default_handler(const Pistache::Rest::Request &, Pistache::Http::ResponseWriter response) {
    response.send(Pistache::Http::Code::Not_Found, "The requested method does not exist");
}

}
}
}
}

