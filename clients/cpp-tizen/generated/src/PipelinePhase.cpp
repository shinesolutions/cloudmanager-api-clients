#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PipelinePhase.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PipelinePhase::PipelinePhase()
{
	//__init();
}

PipelinePhase::~PipelinePhase()
{
	//__cleanup();
}

void
PipelinePhase::__init()
{
	//name = std::string();
	//type = std::string();
	//repositoryId = std::string();
	//branch = std::string();
	//environmentId = std::string();
}

void
PipelinePhase::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(repositoryId != NULL) {
	//
	//delete repositoryId;
	//repositoryId = NULL;
	//}
	//if(branch != NULL) {
	//
	//delete branch;
	//branch = NULL;
	//}
	//if(environmentId != NULL) {
	//
	//delete environmentId;
	//environmentId = NULL;
	//}
	//
}

void
PipelinePhase::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *repositoryIdKey = "repositoryId";
	node = json_object_get_member(pJsonObject, repositoryIdKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&repositoryId, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *branchKey = "branch";
	node = json_object_get_member(pJsonObject, branchKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&branch, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *environmentIdKey = "environmentId";
	node = json_object_get_member(pJsonObject, environmentIdKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&environmentId, node, "std::string", "");
		} else {
			
		}
	}
}

PipelinePhase::PipelinePhase(char* json)
{
	this->fromJson(json);
}

char*
PipelinePhase::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getRepositoryId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *repositoryIdKey = "repositoryId";
	json_object_set_member(pJsonObject, repositoryIdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getBranch();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *branchKey = "branch";
	json_object_set_member(pJsonObject, branchKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getEnvironmentId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *environmentIdKey = "environmentId";
	json_object_set_member(pJsonObject, environmentIdKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
PipelinePhase::getName()
{
	return name;
}

void
PipelinePhase::setName(std::string  name)
{
	this->name = name;
}

std::string
PipelinePhase::getType()
{
	return type;
}

void
PipelinePhase::setType(std::string  type)
{
	this->type = type;
}

std::string
PipelinePhase::getRepositoryId()
{
	return repositoryId;
}

void
PipelinePhase::setRepositoryId(std::string  repositoryId)
{
	this->repositoryId = repositoryId;
}

std::string
PipelinePhase::getBranch()
{
	return branch;
}

void
PipelinePhase::setBranch(std::string  branch)
{
	this->branch = branch;
}

std::string
PipelinePhase::getEnvironmentId()
{
	return environmentId;
}

void
PipelinePhase::setEnvironmentId(std::string  environmentId)
{
	this->environmentId = environmentId;
}


