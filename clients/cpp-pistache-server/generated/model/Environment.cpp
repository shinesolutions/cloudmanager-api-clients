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


#include "Environment.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

Environment::Environment()
{
    m_Id = "";
    m_IdIsSet = false;
    m_ProgramId = "";
    m_ProgramIdIsSet = false;
    m_Name = "";
    m_NameIsSet = false;
    m_Description = "";
    m_DescriptionIsSet = false;
    m_Type = "";
    m_TypeIsSet = false;
    m__linksIsSet = false;
    
}

Environment::~Environment()
{
}

void Environment::validate()
{
    // TODO: implement validation
}

void to_json(nlohmann::json& j, const Environment& o)
{
    j = nlohmann::json();
    if(o.idIsSet())
        j["id"] = o.m_Id;
    if(o.programIdIsSet())
        j["programId"] = o.m_ProgramId;
    if(o.nameIsSet())
        j["name"] = o.m_Name;
    if(o.descriptionIsSet())
        j["description"] = o.m_Description;
    if(o.typeIsSet())
        j["type"] = o.m_Type;
    if(o.linksIsSet())
        j["_links"] = o.m__links;
}

void from_json(const nlohmann::json& j, Environment& o)
{
    if(j.find("id") != j.end())
    {
        j.at("id").get_to(o.m_Id);
        o.m_IdIsSet = true;
    } 
    if(j.find("programId") != j.end())
    {
        j.at("programId").get_to(o.m_ProgramId);
        o.m_ProgramIdIsSet = true;
    } 
    if(j.find("name") != j.end())
    {
        j.at("name").get_to(o.m_Name);
        o.m_NameIsSet = true;
    } 
    if(j.find("description") != j.end())
    {
        j.at("description").get_to(o.m_Description);
        o.m_DescriptionIsSet = true;
    } 
    if(j.find("type") != j.end())
    {
        j.at("type").get_to(o.m_Type);
        o.m_TypeIsSet = true;
    } 
    if(j.find("_links") != j.end())
    {
        j.at("_links").get_to(o.m__links);
        o.m__linksIsSet = true;
    } 
}

std::string Environment::getId() const
{
    return m_Id;
}
void Environment::setId(std::string const& value)
{
    m_Id = value;
    m_IdIsSet = true;
}
bool Environment::idIsSet() const
{
    return m_IdIsSet;
}
void Environment::unsetId()
{
    m_IdIsSet = false;
}
std::string Environment::getProgramId() const
{
    return m_ProgramId;
}
void Environment::setProgramId(std::string const& value)
{
    m_ProgramId = value;
    m_ProgramIdIsSet = true;
}
bool Environment::programIdIsSet() const
{
    return m_ProgramIdIsSet;
}
void Environment::unsetProgramId()
{
    m_ProgramIdIsSet = false;
}
std::string Environment::getName() const
{
    return m_Name;
}
void Environment::setName(std::string const& value)
{
    m_Name = value;
    m_NameIsSet = true;
}
bool Environment::nameIsSet() const
{
    return m_NameIsSet;
}
void Environment::unsetName()
{
    m_NameIsSet = false;
}
std::string Environment::getDescription() const
{
    return m_Description;
}
void Environment::setDescription(std::string const& value)
{
    m_Description = value;
    m_DescriptionIsSet = true;
}
bool Environment::descriptionIsSet() const
{
    return m_DescriptionIsSet;
}
void Environment::unsetDescription()
{
    m_DescriptionIsSet = false;
}
std::string Environment::getType() const
{
    return m_Type;
}
void Environment::setType(std::string const& value)
{
    m_Type = value;
    m_TypeIsSet = true;
}
bool Environment::typeIsSet() const
{
    return m_TypeIsSet;
}
void Environment::unsetType()
{
    m_TypeIsSet = false;
}
Environment__links Environment::getLinks() const
{
    return m__links;
}
void Environment::setLinks(Environment__links const& value)
{
    m__links = value;
    m__linksIsSet = true;
}
bool Environment::linksIsSet() const
{
    return m__linksIsSet;
}
void Environment::unset_links()
{
    m__linksIsSet = false;
}

}
}
}
}

