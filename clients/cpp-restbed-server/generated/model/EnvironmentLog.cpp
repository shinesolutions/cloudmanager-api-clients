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



#include "EnvironmentLog.h"

#include <string>
#include <sstream>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>

using boost::property_tree::ptree;
using boost::property_tree::read_json;
using boost::property_tree::write_json;

namespace org {
namespace openapitools {
namespace server {
namespace model {

EnvironmentLog::EnvironmentLog()
{
	m_Service = "";
	m_Name = "";
	m_date = "";
	m_ProgramId = 0L;
	m_EnvironmentId = 0L;
}

EnvironmentLog::~EnvironmentLog()
{
}

std::string EnvironmentLog::toJsonString(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void EnvironmentLog::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree EnvironmentLog::toPropertyTree()
{
	ptree pt;
	ptree tmp_node;
	pt.put("service", m_Service);
	pt.put("name", m_Name);
	pt.put("date", m_date);
	pt.put("programId", m_ProgramId);
	pt.put("environmentId", m_EnvironmentId);
	if (m__links != nullptr) {
		pt.add_child("_links", m__links->toPropertyTree());
	}
	return pt;
}

void EnvironmentLog::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Service = pt.get("service", "");
	m_Name = pt.get("name", "");
	m_date = pt.get("date", "");
	m_ProgramId = pt.get("programId", 0L);
	m_EnvironmentId = pt.get("environmentId", 0L);
	if (pt.get_child_optional("_links")) {
		m__links = std::make_shared<EnvironmentLog__links>();
		m__links->fromPropertyTree(pt.get_child("_links"));
	}
}

std::string EnvironmentLog::getService() const
{
    return m_Service;
}
void EnvironmentLog::setService(std::string value)
{
	m_Service = value;
}
std::string EnvironmentLog::getName() const
{
    return m_Name;
}
void EnvironmentLog::setName(std::string value)
{
	m_Name = value;
}
std::string EnvironmentLog::getDate() const
{
    return m_date;
}
void EnvironmentLog::setDate(std::string value)
{
	m_date = value;
}
int64_t EnvironmentLog::getProgramId() const
{
    return m_ProgramId;
}
void EnvironmentLog::setProgramId(int64_t value)
{
	m_ProgramId = value;
}
int64_t EnvironmentLog::getEnvironmentId() const
{
    return m_EnvironmentId;
}
void EnvironmentLog::setEnvironmentId(int64_t value)
{
	m_EnvironmentId = value;
}
std::shared_ptr<EnvironmentLog__links> EnvironmentLog::get_Links() const
{
    return m__links;
}
void EnvironmentLog::set_Links(std::shared_ptr<EnvironmentLog__links> value)
{
	m__links = value;
}

}
}
}
}

