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



#include "Pipeline.h"

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

Pipeline::Pipeline()
{
	m_Id = "";
	m_ProgramId = "";
	m_Name = "";
	m_Trigger = "";
	m_TriggerEnum = { "ON_COMMIT", "MANUAL", "SCHEDULE" };
	m_Status = "";
	m_StatusEnum = { "IDLE", "BUSY", "WAITING" };
	m_CreatedAt = "";
	m_UpdatedAt = "";
	m_LastStartedAt = "";
	m_LastFinishedAt = "";
}

Pipeline::~Pipeline()
{
}

std::string Pipeline::toJsonString(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void Pipeline::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree Pipeline::toPropertyTree()
{
	ptree pt;
	ptree tmp_node;
	pt.put("id", m_Id);
	pt.put("programId", m_ProgramId);
	pt.put("name", m_Name);
	pt.put("trigger", m_Trigger);
	pt.put("status", m_Status);
	pt.put("createdAt", m_CreatedAt);
	pt.put("updatedAt", m_UpdatedAt);
	pt.put("lastStartedAt", m_LastStartedAt);
	pt.put("lastFinishedAt", m_LastFinishedAt);
	// generate tree for Phases
	if (!m_Phases.empty()) {
		for (const auto &childEntry : m_Phases) {
			ptree Phases_node;
			Phases_node.put("", childEntry);
			tmp_node.push_back(std::make_pair("", Phases_node));
		}
		pt.add_child("phases", tmp_node);
		tmp_node.clear();
	}
	if (m__links != nullptr) {
		pt.add_child("_links", m__links->toPropertyTree());
	}
	return pt;
}

void Pipeline::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Id = pt.get("id", "");
	m_ProgramId = pt.get("programId", "");
	m_Name = pt.get("name", "");
	setTrigger(pt.get("trigger", ""));
	setStatus(pt.get("status", ""));
	m_CreatedAt = pt.get("createdAt", "");
	m_UpdatedAt = pt.get("updatedAt", "");
	m_LastStartedAt = pt.get("lastStartedAt", "");
	m_LastFinishedAt = pt.get("lastFinishedAt", "");
	// push all items of Phases into member vector
	if (pt.get_child_optional("phases")) {
		for (const auto &childTree : pt.get_child("phases")) {
			m_Phases.emplace_back(childTree.second.data());
		}
	}
	if (pt.get_child_optional("_links")) {
		m__links = std::make_shared<Pipeline__links>();
		m__links->fromPropertyTree(pt.get_child("_links"));
	}
}

std::string Pipeline::getId() const
{
    return m_Id;
}
void Pipeline::setId(std::string value)
{
	m_Id = value;
}
std::string Pipeline::getProgramId() const
{
    return m_ProgramId;
}
void Pipeline::setProgramId(std::string value)
{
	m_ProgramId = value;
}
std::string Pipeline::getName() const
{
    return m_Name;
}
void Pipeline::setName(std::string value)
{
	m_Name = value;
}
std::string Pipeline::getTrigger() const
{
    return m_Trigger;
}
void Pipeline::setTrigger(std::string value)
{
	if (std::find(m_TriggerEnum.begin(), m_TriggerEnum.end(), value) != m_TriggerEnum.end()) {
		m_Trigger = value;
	}
}
std::string Pipeline::getStatus() const
{
    return m_Status;
}
void Pipeline::setStatus(std::string value)
{
	if (std::find(m_StatusEnum.begin(), m_StatusEnum.end(), value) != m_StatusEnum.end()) {
		m_Status = value;
	}
}
std::string Pipeline::getCreatedAt() const
{
    return m_CreatedAt;
}
void Pipeline::setCreatedAt(std::string value)
{
	m_CreatedAt = value;
}
std::string Pipeline::getUpdatedAt() const
{
    return m_UpdatedAt;
}
void Pipeline::setUpdatedAt(std::string value)
{
	m_UpdatedAt = value;
}
std::string Pipeline::getLastStartedAt() const
{
    return m_LastStartedAt;
}
void Pipeline::setLastStartedAt(std::string value)
{
	m_LastStartedAt = value;
}
std::string Pipeline::getLastFinishedAt() const
{
    return m_LastFinishedAt;
}
void Pipeline::setLastFinishedAt(std::string value)
{
	m_LastFinishedAt = value;
}
std::vector<std::shared_ptr<PipelinePhase>> Pipeline::getPhases() const
{
    return m_Phases;
}
void Pipeline::setPhases(std::vector<std::shared_ptr<PipelinePhase>> value)
{
	m_Phases = value;
}
std::shared_ptr<Pipeline__links> Pipeline::get_Links() const
{
    return m__links;
}
void Pipeline::set_Links(std::shared_ptr<Pipeline__links> value)
{
	m__links = value;
}

}
}
}
}

