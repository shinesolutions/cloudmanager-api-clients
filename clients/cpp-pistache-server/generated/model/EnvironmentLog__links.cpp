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


#include "EnvironmentLog__links.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

EnvironmentLog__links::EnvironmentLog__links()
{
    m_Http__ns_adobe_com_adobecloud_rel_logs_downloadIsSet = false;
    m_Http__ns_adobe_com_adobecloud_rel_logs_tailIsSet = false;
    
}

EnvironmentLog__links::~EnvironmentLog__links()
{
}

void EnvironmentLog__links::validate()
{
    // TODO: implement validation
}

void to_json(nlohmann::json& j, const EnvironmentLog__links& o)
{
    j = nlohmann::json();
    if(o.httpNsAdobeComAdobecloudRelLogsDownloadIsSet())
        j["http://ns.adobe.com/adobecloud/rel/logs/download"] = o.m_Http__ns_adobe_com_adobecloud_rel_logs_download;
    if(o.httpNsAdobeComAdobecloudRelLogsTailIsSet())
        j["http://ns.adobe.com/adobecloud/rel/logs/tail"] = o.m_Http__ns_adobe_com_adobecloud_rel_logs_tail;
}

void from_json(const nlohmann::json& j, EnvironmentLog__links& o)
{
    if(j.find("http://ns.adobe.com/adobecloud/rel/logs/download") != j.end())
    {
        j.at("http://ns.adobe.com/adobecloud/rel/logs/download").get_to(o.m_Http__ns_adobe_com_adobecloud_rel_logs_download);
        o.m_Http__ns_adobe_com_adobecloud_rel_logs_downloadIsSet = true;
    } 
    if(j.find("http://ns.adobe.com/adobecloud/rel/logs/tail") != j.end())
    {
        j.at("http://ns.adobe.com/adobecloud/rel/logs/tail").get_to(o.m_Http__ns_adobe_com_adobecloud_rel_logs_tail);
        o.m_Http__ns_adobe_com_adobecloud_rel_logs_tailIsSet = true;
    } 
}

HalLink EnvironmentLog__links::getHttpNsAdobeComAdobecloudRelLogsDownload() const
{
    return m_Http__ns_adobe_com_adobecloud_rel_logs_download;
}
void EnvironmentLog__links::setHttpNsAdobeComAdobecloudRelLogsDownload(HalLink const& value)
{
    m_Http__ns_adobe_com_adobecloud_rel_logs_download = value;
    m_Http__ns_adobe_com_adobecloud_rel_logs_downloadIsSet = true;
}
bool EnvironmentLog__links::httpNsAdobeComAdobecloudRelLogsDownloadIsSet() const
{
    return m_Http__ns_adobe_com_adobecloud_rel_logs_downloadIsSet;
}
void EnvironmentLog__links::unsetHttp__ns_adobe_com_adobecloud_rel_logs_download()
{
    m_Http__ns_adobe_com_adobecloud_rel_logs_downloadIsSet = false;
}
HalLink EnvironmentLog__links::getHttpNsAdobeComAdobecloudRelLogsTail() const
{
    return m_Http__ns_adobe_com_adobecloud_rel_logs_tail;
}
void EnvironmentLog__links::setHttpNsAdobeComAdobecloudRelLogsTail(HalLink const& value)
{
    m_Http__ns_adobe_com_adobecloud_rel_logs_tail = value;
    m_Http__ns_adobe_com_adobecloud_rel_logs_tailIsSet = true;
}
bool EnvironmentLog__links::httpNsAdobeComAdobecloudRelLogsTailIsSet() const
{
    return m_Http__ns_adobe_com_adobecloud_rel_logs_tailIsSet;
}
void EnvironmentLog__links::unsetHttp__ns_adobe_com_adobecloud_rel_logs_tail()
{
    m_Http__ns_adobe_com_adobecloud_rel_logs_tailIsSet = false;
}

}
}
}
}

