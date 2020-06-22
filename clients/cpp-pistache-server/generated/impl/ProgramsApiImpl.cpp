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

#include "ProgramsApiImpl.h"

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

ProgramsApiImpl::ProgramsApiImpl(std::shared_ptr<Pistache::Rest::Router> rtr)
    : ProgramsApi(rtr)
    { }

void ProgramsApiImpl::delete_program(const std::string &programId, const Pistache::Optional<Pistache::Http::Header::Raw> &xGwImsOrgId, const Pistache::Optional<Pistache::Http::Header::Raw> &authorization, const Pistache::Optional<Pistache::Http::Header::Raw> &xApiKey, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void ProgramsApiImpl::get_program(const std::string &programId, const Pistache::Optional<Pistache::Http::Header::Raw> &xGwImsOrgId, const Pistache::Optional<Pistache::Http::Header::Raw> &authorization, const Pistache::Optional<Pistache::Http::Header::Raw> &xApiKey, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void ProgramsApiImpl::get_programs(const Pistache::Optional<Pistache::Http::Header::Raw> &xGwImsOrgId, const Pistache::Optional<Pistache::Http::Header::Raw> &authorization, const Pistache::Optional<Pistache::Http::Header::Raw> &xApiKey, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}

}
}
}
}

