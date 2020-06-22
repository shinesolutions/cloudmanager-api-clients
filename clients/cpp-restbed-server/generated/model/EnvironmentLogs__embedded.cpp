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



#include "EnvironmentLogs__embedded.h"

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

EnvironmentLogs__embedded::EnvironmentLogs__embedded()
{
}

EnvironmentLogs__embedded::~EnvironmentLogs__embedded()
{
}

std::string EnvironmentLogs__embedded::toJsonString(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void EnvironmentLogs__embedded::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree EnvironmentLogs__embedded::toPropertyTree()
{
	ptree pt;
	ptree tmp_node;
	// generate tree for Downloads
	if (!m_Downloads.empty()) {
		for (const auto &childEntry : m_Downloads) {
			ptree Downloads_node;
			Downloads_node.put("", childEntry);
			tmp_node.push_back(std::make_pair("", Downloads_node));
		}
		pt.add_child("downloads", tmp_node);
		tmp_node.clear();
	}
	return pt;
}

void EnvironmentLogs__embedded::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	// push all items of Downloads into member vector
	if (pt.get_child_optional("downloads")) {
		for (const auto &childTree : pt.get_child("downloads")) {
			m_Downloads.emplace_back(childTree.second.data());
		}
	}
}

std::vector<std::shared_ptr<EnvironmentLog>> EnvironmentLogs__embedded::getDownloads() const
{
    return m_Downloads;
}
void EnvironmentLogs__embedded::setDownloads(std::vector<std::shared_ptr<EnvironmentLog>> value)
{
	m_Downloads = value;
}

}
}
}
}

