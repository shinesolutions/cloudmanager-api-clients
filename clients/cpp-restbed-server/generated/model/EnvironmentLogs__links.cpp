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



#include "EnvironmentLogs__links.h"

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

EnvironmentLogs__links::EnvironmentLogs__links()
{
}

EnvironmentLogs__links::~EnvironmentLogs__links()
{
}

std::string EnvironmentLogs__links::toJsonString(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void EnvironmentLogs__links::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree EnvironmentLogs__links::toPropertyTree()
{
	ptree pt;
	ptree tmp_node;
	if (m_Http__ns_adobe_com_adobecloud_rel_program != nullptr) {
		pt.add_child("http://ns.adobe.com/adobecloud/rel/program", m_Http__ns_adobe_com_adobecloud_rel_program->toPropertyTree());
	}
	if (m_Self != nullptr) {
		pt.add_child("self", m_Self->toPropertyTree());
	}
	return pt;
}

void EnvironmentLogs__links::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	if (pt.get_child_optional("http://ns.adobe.com/adobecloud/rel/program")) {
		m_Http__ns_adobe_com_adobecloud_rel_program = std::make_shared<HalLink>();
		m_Http__ns_adobe_com_adobecloud_rel_program->fromPropertyTree(pt.get_child("http://ns.adobe.com/adobecloud/rel/program"));
	}
	if (pt.get_child_optional("self")) {
		m_Self = std::make_shared<HalLink>();
		m_Self->fromPropertyTree(pt.get_child("self"));
	}
}

std::shared_ptr<HalLink> EnvironmentLogs__links::getHttpNsAdobeComAdobecloudRelProgram() const
{
    return m_Http__ns_adobe_com_adobecloud_rel_program;
}
void EnvironmentLogs__links::setHttpNsAdobeComAdobecloudRelProgram(std::shared_ptr<HalLink> value)
{
	m_Http__ns_adobe_com_adobecloud_rel_program = value;
}
std::shared_ptr<HalLink> EnvironmentLogs__links::getSelf() const
{
    return m_Self;
}
void EnvironmentLogs__links::setSelf(std::shared_ptr<HalLink> value)
{
	m_Self = value;
}

}
}
}
}

