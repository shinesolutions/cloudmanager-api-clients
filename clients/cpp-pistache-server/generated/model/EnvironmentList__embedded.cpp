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


#include "EnvironmentList__embedded.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

EnvironmentList__embedded::EnvironmentList__embedded()
{
    m_EnvironmentsIsSet = false;
    
}

EnvironmentList__embedded::~EnvironmentList__embedded()
{
}

void EnvironmentList__embedded::validate()
{
    // TODO: implement validation
}

void to_json(nlohmann::json& j, const EnvironmentList__embedded& o)
{
    j = nlohmann::json();
    if(o.environmentsIsSet() || !o.m_Environments.empty())
        j["environments"] = o.m_Environments;
}

void from_json(const nlohmann::json& j, EnvironmentList__embedded& o)
{
    if(j.find("environments") != j.end())
    {
        j.at("environments").get_to(o.m_Environments);
        o.m_EnvironmentsIsSet = true;
    } 
}

std::vector<Environment>& EnvironmentList__embedded::getEnvironments()
{
    return m_Environments;
}
void EnvironmentList__embedded::setEnvironments(std::vector<Environment> const& value)
{
    m_Environments = value;
    m_EnvironmentsIsSet = true;
}
bool EnvironmentList__embedded::environmentsIsSet() const
{
    return m_EnvironmentsIsSet;
}
void EnvironmentList__embedded::unsetEnvironments()
{
    m_EnvironmentsIsSet = false;
}

}
}
}
}

