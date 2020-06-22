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


#include "RepositoryBranch__links.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

RepositoryBranch__links::RepositoryBranch__links()
{
    m_Http__ns_adobe_com_adobecloud_rel_programIsSet = false;
    m_Http__ns_adobe_com_adobecloud_rel_repositoryIsSet = false;
    
}

RepositoryBranch__links::~RepositoryBranch__links()
{
}

void RepositoryBranch__links::validate()
{
    // TODO: implement validation
}

void to_json(nlohmann::json& j, const RepositoryBranch__links& o)
{
    j = nlohmann::json();
    if(o.httpNsAdobeComAdobecloudRelProgramIsSet())
        j["http://ns.adobe.com/adobecloud/rel/program"] = o.m_Http__ns_adobe_com_adobecloud_rel_program;
    if(o.httpNsAdobeComAdobecloudRelRepositoryIsSet())
        j["http://ns.adobe.com/adobecloud/rel/repository"] = o.m_Http__ns_adobe_com_adobecloud_rel_repository;
}

void from_json(const nlohmann::json& j, RepositoryBranch__links& o)
{
    if(j.find("http://ns.adobe.com/adobecloud/rel/program") != j.end())
    {
        j.at("http://ns.adobe.com/adobecloud/rel/program").get_to(o.m_Http__ns_adobe_com_adobecloud_rel_program);
        o.m_Http__ns_adobe_com_adobecloud_rel_programIsSet = true;
    } 
    if(j.find("http://ns.adobe.com/adobecloud/rel/repository") != j.end())
    {
        j.at("http://ns.adobe.com/adobecloud/rel/repository").get_to(o.m_Http__ns_adobe_com_adobecloud_rel_repository);
        o.m_Http__ns_adobe_com_adobecloud_rel_repositoryIsSet = true;
    } 
}

HalLink RepositoryBranch__links::getHttpNsAdobeComAdobecloudRelProgram() const
{
    return m_Http__ns_adobe_com_adobecloud_rel_program;
}
void RepositoryBranch__links::setHttpNsAdobeComAdobecloudRelProgram(HalLink const& value)
{
    m_Http__ns_adobe_com_adobecloud_rel_program = value;
    m_Http__ns_adobe_com_adobecloud_rel_programIsSet = true;
}
bool RepositoryBranch__links::httpNsAdobeComAdobecloudRelProgramIsSet() const
{
    return m_Http__ns_adobe_com_adobecloud_rel_programIsSet;
}
void RepositoryBranch__links::unsetHttp__ns_adobe_com_adobecloud_rel_program()
{
    m_Http__ns_adobe_com_adobecloud_rel_programIsSet = false;
}
HalLink RepositoryBranch__links::getHttpNsAdobeComAdobecloudRelRepository() const
{
    return m_Http__ns_adobe_com_adobecloud_rel_repository;
}
void RepositoryBranch__links::setHttpNsAdobeComAdobecloudRelRepository(HalLink const& value)
{
    m_Http__ns_adobe_com_adobecloud_rel_repository = value;
    m_Http__ns_adobe_com_adobecloud_rel_repositoryIsSet = true;
}
bool RepositoryBranch__links::httpNsAdobeComAdobecloudRelRepositoryIsSet() const
{
    return m_Http__ns_adobe_com_adobecloud_rel_repositoryIsSet;
}
void RepositoryBranch__links::unsetHttp__ns_adobe_com_adobecloud_rel_repository()
{
    m_Http__ns_adobe_com_adobecloud_rel_repositoryIsSet = false;
}

}
}
}
}

