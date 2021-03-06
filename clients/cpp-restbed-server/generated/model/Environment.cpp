/**
 * Cloud Manager API
 * This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 4.3.1-SNAPSHOT.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "Environment.h"

#include <string>
#include <sstream>
#include <algorithm>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>

using boost::property_tree::ptree;
using boost::property_tree::read_json;
using boost::property_tree::write_json;

namespace org {
namespace openapitools {
namespace server {
namespace model {

Environment::Environment()
{
	m_Id = "";
	m_ProgramId = "";
	m_Name = "";
	m_Description = "";
	m_Type = "";
	m_TypeEnum = { "dev", "stage", "prod" };
}

Environment::~Environment()
{
}

std::string Environment::toJsonString(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void Environment::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree Environment::toPropertyTree()
{
	ptree pt;
	ptree tmp_node;
	pt.put("id", m_Id);
	pt.put("programId", m_ProgramId);
	pt.put("name", m_Name);
	pt.put("description", m_Description);
	pt.put("type", m_Type);
	if (m__links != nullptr) {
		pt.add_child("_links", m__links->toPropertyTree());
	}
	return pt;
}

void Environment::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Id = pt.get("id", "");
	m_ProgramId = pt.get("programId", "");
	m_Name = pt.get("name", "");
	m_Description = pt.get("description", "");
	setType(pt.get("type", ""));
	if (pt.get_child_optional("_links")) {
		m__links = std::make_shared<Environment__links>();
		m__links->fromPropertyTree(pt.get_child("_links"));
	}
}

std::string Environment::getId() const
{
    return m_Id;
}
void Environment::setId(std::string value)
{
	m_Id = value;
}
std::string Environment::getProgramId() const
{
    return m_ProgramId;
}
void Environment::setProgramId(std::string value)
{
	m_ProgramId = value;
}
std::string Environment::getName() const
{
    return m_Name;
}
void Environment::setName(std::string value)
{
	m_Name = value;
}
std::string Environment::getDescription() const
{
    return m_Description;
}
void Environment::setDescription(std::string value)
{
	m_Description = value;
}
std::string Environment::getType() const
{
    return m_Type;
}
void Environment::setType(std::string value)
{
	if (std::find(m_TypeEnum.begin(), m_TypeEnum.end(), value) != m_TypeEnum.end()) {
		m_Type = value;
	}
}
std::shared_ptr<Environment__links> Environment::get_Links() const
{
    return m__links;
}
void Environment::set_Links(std::shared_ptr<Environment__links> value)
{
	m__links = value;
}

}
}
}
}

