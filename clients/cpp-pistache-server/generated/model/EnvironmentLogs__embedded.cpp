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


#include "EnvironmentLogs__embedded.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

EnvironmentLogs__embedded::EnvironmentLogs__embedded()
{
    m_DownloadsIsSet = false;
    
}

EnvironmentLogs__embedded::~EnvironmentLogs__embedded()
{
}

void EnvironmentLogs__embedded::validate()
{
    // TODO: implement validation
}

void to_json(nlohmann::json& j, const EnvironmentLogs__embedded& o)
{
    j = nlohmann::json();
    if(o.downloadsIsSet() || !o.m_Downloads.empty())
        j["downloads"] = o.m_Downloads;
}

void from_json(const nlohmann::json& j, EnvironmentLogs__embedded& o)
{
    if(j.find("downloads") != j.end())
    {
        j.at("downloads").get_to(o.m_Downloads);
        o.m_DownloadsIsSet = true;
    } 
}

std::vector<EnvironmentLog>& EnvironmentLogs__embedded::getDownloads()
{
    return m_Downloads;
}
void EnvironmentLogs__embedded::setDownloads(std::vector<EnvironmentLog> const& value)
{
    m_Downloads = value;
    m_DownloadsIsSet = true;
}
bool EnvironmentLogs__embedded::downloadsIsSet() const
{
    return m_DownloadsIsSet;
}
void EnvironmentLogs__embedded::unsetDownloads()
{
    m_DownloadsIsSet = false;
}

}
}
}
}

