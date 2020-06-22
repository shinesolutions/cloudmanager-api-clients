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


#include "Repository__links.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

Repository__links::Repository__links()
{
    m_Http__ns_adobe_com_adobecloud_rel_programIsSet = false;
    m_Http__ns_adobe_com_adobecloud_rel_branchesIsSet = false;
    m_SelfIsSet = false;
    
}

Repository__links::~Repository__links()
{
}

void Repository__links::validate()
{
    // TODO: implement validation
}

void to_json(nlohmann::json& j, const Repository__links& o)
{
    j = nlohmann::json();
    if(o.httpNsAdobeComAdobecloudRelProgramIsSet())
        j["http://ns.adobe.com/adobecloud/rel/program"] = o.m_Http__ns_adobe_com_adobecloud_rel_program;
    if(o.httpNsAdobeComAdobecloudRelBranchesIsSet())
        j["http://ns.adobe.com/adobecloud/rel/branches"] = o.m_Http__ns_adobe_com_adobecloud_rel_branches;
    if(o.selfIsSet())
        j["self"] = o.m_Self;
}

void from_json(const nlohmann::json& j, Repository__links& o)
{
    if(j.find("http://ns.adobe.com/adobecloud/rel/program") != j.end())
    {
        j.at("http://ns.adobe.com/adobecloud/rel/program").get_to(o.m_Http__ns_adobe_com_adobecloud_rel_program);
        o.m_Http__ns_adobe_com_adobecloud_rel_programIsSet = true;
    } 
    if(j.find("http://ns.adobe.com/adobecloud/rel/branches") != j.end())
    {
        j.at("http://ns.adobe.com/adobecloud/rel/branches").get_to(o.m_Http__ns_adobe_com_adobecloud_rel_branches);
        o.m_Http__ns_adobe_com_adobecloud_rel_branchesIsSet = true;
    } 
    if(j.find("self") != j.end())
    {
        j.at("self").get_to(o.m_Self);
        o.m_SelfIsSet = true;
    } 
}

HalLink Repository__links::getHttpNsAdobeComAdobecloudRelProgram() const
{
    return m_Http__ns_adobe_com_adobecloud_rel_program;
}
void Repository__links::setHttpNsAdobeComAdobecloudRelProgram(HalLink const& value)
{
    m_Http__ns_adobe_com_adobecloud_rel_program = value;
    m_Http__ns_adobe_com_adobecloud_rel_programIsSet = true;
}
bool Repository__links::httpNsAdobeComAdobecloudRelProgramIsSet() const
{
    return m_Http__ns_adobe_com_adobecloud_rel_programIsSet;
}
void Repository__links::unsetHttp__ns_adobe_com_adobecloud_rel_program()
{
    m_Http__ns_adobe_com_adobecloud_rel_programIsSet = false;
}
HalLink Repository__links::getHttpNsAdobeComAdobecloudRelBranches() const
{
    return m_Http__ns_adobe_com_adobecloud_rel_branches;
}
void Repository__links::setHttpNsAdobeComAdobecloudRelBranches(HalLink const& value)
{
    m_Http__ns_adobe_com_adobecloud_rel_branches = value;
    m_Http__ns_adobe_com_adobecloud_rel_branchesIsSet = true;
}
bool Repository__links::httpNsAdobeComAdobecloudRelBranchesIsSet() const
{
    return m_Http__ns_adobe_com_adobecloud_rel_branchesIsSet;
}
void Repository__links::unsetHttp__ns_adobe_com_adobecloud_rel_branches()
{
    m_Http__ns_adobe_com_adobecloud_rel_branchesIsSet = false;
}
HalLink Repository__links::getSelf() const
{
    return m_Self;
}
void Repository__links::setSelf(HalLink const& value)
{
    m_Self = value;
    m_SelfIsSet = true;
}
bool Repository__links::selfIsSet() const
{
    return m_SelfIsSet;
}
void Repository__links::unsetSelf()
{
    m_SelfIsSet = false;
}

}
}
}
}

