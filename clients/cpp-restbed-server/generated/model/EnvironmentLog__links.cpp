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



#include "EnvironmentLog__links.h"

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

EnvironmentLog__links::EnvironmentLog__links()
{
}

EnvironmentLog__links::~EnvironmentLog__links()
{
}

std::string EnvironmentLog__links::toJsonString(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void EnvironmentLog__links::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree EnvironmentLog__links::toPropertyTree()
{
	ptree pt;
	ptree tmp_node;
	if (m_Http__ns_adobe_com_adobecloud_rel_logs_download != nullptr) {
		pt.add_child("http://ns.adobe.com/adobecloud/rel/logs/download", m_Http__ns_adobe_com_adobecloud_rel_logs_download->toPropertyTree());
	}
	if (m_Http__ns_adobe_com_adobecloud_rel_logs_tail != nullptr) {
		pt.add_child("http://ns.adobe.com/adobecloud/rel/logs/tail", m_Http__ns_adobe_com_adobecloud_rel_logs_tail->toPropertyTree());
	}
	return pt;
}

void EnvironmentLog__links::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	if (pt.get_child_optional("http://ns.adobe.com/adobecloud/rel/logs/download")) {
		m_Http__ns_adobe_com_adobecloud_rel_logs_download = std::make_shared<HalLink>();
		m_Http__ns_adobe_com_adobecloud_rel_logs_download->fromPropertyTree(pt.get_child("http://ns.adobe.com/adobecloud/rel/logs/download"));
	}
	if (pt.get_child_optional("http://ns.adobe.com/adobecloud/rel/logs/tail")) {
		m_Http__ns_adobe_com_adobecloud_rel_logs_tail = std::make_shared<HalLink>();
		m_Http__ns_adobe_com_adobecloud_rel_logs_tail->fromPropertyTree(pt.get_child("http://ns.adobe.com/adobecloud/rel/logs/tail"));
	}
}

std::shared_ptr<HalLink> EnvironmentLog__links::getHttpNsAdobeComAdobecloudRelLogsDownload() const
{
    return m_Http__ns_adobe_com_adobecloud_rel_logs_download;
}
void EnvironmentLog__links::setHttpNsAdobeComAdobecloudRelLogsDownload(std::shared_ptr<HalLink> value)
{
	m_Http__ns_adobe_com_adobecloud_rel_logs_download = value;
}
std::shared_ptr<HalLink> EnvironmentLog__links::getHttpNsAdobeComAdobecloudRelLogsTail() const
{
    return m_Http__ns_adobe_com_adobecloud_rel_logs_tail;
}
void EnvironmentLog__links::setHttpNsAdobeComAdobecloudRelLogsTail(std::shared_ptr<HalLink> value)
{
	m_Http__ns_adobe_com_adobecloud_rel_logs_tail = value;
}

}
}
}
}

