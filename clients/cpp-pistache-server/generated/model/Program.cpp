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


#include "Program.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

Program::Program()
{
    m_Id = "";
    m_IdIsSet = false;
    m_Name = "";
    m_Enabled = false;
    m_EnabledIsSet = false;
    m_TenantId = "";
    m_TenantIdIsSet = false;
    m_ImsOrgId = "";
    m_ImsOrgIdIsSet = false;
    m__linksIsSet = false;
    
}

Program::~Program()
{
}

void Program::validate()
{
    // TODO: implement validation
}

void to_json(nlohmann::json& j, const Program& o)
{
    j = nlohmann::json();
    if(o.idIsSet())
        j["id"] = o.m_Id;
    j["name"] = o.m_Name;
    if(o.enabledIsSet())
        j["enabled"] = o.m_Enabled;
    if(o.tenantIdIsSet())
        j["tenantId"] = o.m_TenantId;
    if(o.imsOrgIdIsSet())
        j["imsOrgId"] = o.m_ImsOrgId;
    if(o.linksIsSet())
        j["_links"] = o.m__links;
}

void from_json(const nlohmann::json& j, Program& o)
{
    if(j.find("id") != j.end())
    {
        j.at("id").get_to(o.m_Id);
        o.m_IdIsSet = true;
    } 
    j.at("name").get_to(o.m_Name);
    if(j.find("enabled") != j.end())
    {
        j.at("enabled").get_to(o.m_Enabled);
        o.m_EnabledIsSet = true;
    } 
    if(j.find("tenantId") != j.end())
    {
        j.at("tenantId").get_to(o.m_TenantId);
        o.m_TenantIdIsSet = true;
    } 
    if(j.find("imsOrgId") != j.end())
    {
        j.at("imsOrgId").get_to(o.m_ImsOrgId);
        o.m_ImsOrgIdIsSet = true;
    } 
    if(j.find("_links") != j.end())
    {
        j.at("_links").get_to(o.m__links);
        o.m__linksIsSet = true;
    } 
}

std::string Program::getId() const
{
    return m_Id;
}
void Program::setId(std::string const& value)
{
    m_Id = value;
    m_IdIsSet = true;
}
bool Program::idIsSet() const
{
    return m_IdIsSet;
}
void Program::unsetId()
{
    m_IdIsSet = false;
}
std::string Program::getName() const
{
    return m_Name;
}
void Program::setName(std::string const& value)
{
    m_Name = value;
}
bool Program::isEnabled() const
{
    return m_Enabled;
}
void Program::setEnabled(bool const value)
{
    m_Enabled = value;
    m_EnabledIsSet = true;
}
bool Program::enabledIsSet() const
{
    return m_EnabledIsSet;
}
void Program::unsetEnabled()
{
    m_EnabledIsSet = false;
}
std::string Program::getTenantId() const
{
    return m_TenantId;
}
void Program::setTenantId(std::string const& value)
{
    m_TenantId = value;
    m_TenantIdIsSet = true;
}
bool Program::tenantIdIsSet() const
{
    return m_TenantIdIsSet;
}
void Program::unsetTenantId()
{
    m_TenantIdIsSet = false;
}
std::string Program::getImsOrgId() const
{
    return m_ImsOrgId;
}
void Program::setImsOrgId(std::string const& value)
{
    m_ImsOrgId = value;
    m_ImsOrgIdIsSet = true;
}
bool Program::imsOrgIdIsSet() const
{
    return m_ImsOrgIdIsSet;
}
void Program::unsetImsOrgId()
{
    m_ImsOrgIdIsSet = false;
}
Program__links Program::getLinks() const
{
    return m__links;
}
void Program::setLinks(Program__links const& value)
{
    m__links = value;
    m__linksIsSet = true;
}
bool Program::linksIsSet() const
{
    return m__linksIsSet;
}
void Program::unset_links()
{
    m__linksIsSet = false;
}

}
}
}
}

