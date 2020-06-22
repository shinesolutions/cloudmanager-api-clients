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


#include "ProgramList__embedded.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

ProgramList__embedded::ProgramList__embedded()
{
    m_ProgramsIsSet = false;
    
}

ProgramList__embedded::~ProgramList__embedded()
{
}

void ProgramList__embedded::validate()
{
    // TODO: implement validation
}

void to_json(nlohmann::json& j, const ProgramList__embedded& o)
{
    j = nlohmann::json();
    if(o.programsIsSet() || !o.m_Programs.empty())
        j["programs"] = o.m_Programs;
}

void from_json(const nlohmann::json& j, ProgramList__embedded& o)
{
    if(j.find("programs") != j.end())
    {
        j.at("programs").get_to(o.m_Programs);
        o.m_ProgramsIsSet = true;
    } 
}

std::vector<EmbeddedProgram>& ProgramList__embedded::getPrograms()
{
    return m_Programs;
}
void ProgramList__embedded::setPrograms(std::vector<EmbeddedProgram> const& value)
{
    m_Programs = value;
    m_ProgramsIsSet = true;
}
bool ProgramList__embedded::programsIsSet() const
{
    return m_ProgramsIsSet;
}
void ProgramList__embedded::unsetPrograms()
{
    m_ProgramsIsSet = false;
}

}
}
}
}

