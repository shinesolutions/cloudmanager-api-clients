#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PipelineExecutionStepState.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PipelineExecutionStepState::PipelineExecutionStepState()
{
	//__init();
}

PipelineExecutionStepState::~PipelineExecutionStepState()
{
	//__cleanup();
}

void
PipelineExecutionStepState::__init()
{
	//id = std::string();
	//stepId = std::string();
	//phaseId = std::string();
	//action = std::string();
	//repository = std::string();
	//branch = std::string();
	//environment = std::string();
	//environmentType = std::string();
	//startedAt = null;
	//finishedAt = null;
	//new std::map()std::map> details;
	//status = std::string();
	//_links = new PipelineExecutionStepState__links();
}

void
PipelineExecutionStepState::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(stepId != NULL) {
	//
	//delete stepId;
	//stepId = NULL;
	//}
	//if(phaseId != NULL) {
	//
	//delete phaseId;
	//phaseId = NULL;
	//}
	//if(action != NULL) {
	//
	//delete action;
	//action = NULL;
	//}
	//if(repository != NULL) {
	//
	//delete repository;
	//repository = NULL;
	//}
	//if(branch != NULL) {
	//
	//delete branch;
	//branch = NULL;
	//}
	//if(environment != NULL) {
	//
	//delete environment;
	//environment = NULL;
	//}
	//if(environmentType != NULL) {
	//
	//delete environmentType;
	//environmentType = NULL;
	//}
	//if(startedAt != NULL) {
	//
	//delete startedAt;
	//startedAt = NULL;
	//}
	//if(finishedAt != NULL) {
	//
	//delete finishedAt;
	//finishedAt = NULL;
	//}
	//if(details != NULL) {
	//details.RemoveAll(true);
	//delete details;
	//details = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(_links != NULL) {
	//
	//delete _links;
	//_links = NULL;
	//}
	//
}

void
PipelineExecutionStepState::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *stepIdKey = "stepId";
	node = json_object_get_member(pJsonObject, stepIdKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&stepId, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *phaseIdKey = "phaseId";
	node = json_object_get_member(pJsonObject, phaseIdKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&phaseId, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *actionKey = "action";
	node = json_object_get_member(pJsonObject, actionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&action, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *repositoryKey = "repository";
	node = json_object_get_member(pJsonObject, repositoryKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&repository, node, "std::string", "");
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
	const gchar *environmentKey = "environment";
	node = json_object_get_member(pJsonObject, environmentKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&environment, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *environmentTypeKey = "environmentType";
	node = json_object_get_member(pJsonObject, environmentTypeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&environmentType, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *startedAtKey = "startedAt";
	node = json_object_get_member(pJsonObject, startedAtKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&startedAt, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *finishedAtKey = "finishedAt";
	node = json_object_get_member(pJsonObject, finishedAtKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&finishedAt, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *detailsKey = "details";
	node = json_object_get_member(pJsonObject, detailsKey);
	if (node !=NULL) {
	
		{
			JsonObject* json_obj = json_node_get_object(node);
			map<string,string> new_map;
			json_object_foreach_member(json_obj,helper_func,&new_map);
			details = new_map;
		}
		
	}
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&status, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *_linksKey = "_links";
	node = json_object_get_member(pJsonObject, _linksKey);
	if (node !=NULL) {
	

		if (isprimitive("PipelineExecutionStepState__links")) {
			jsonToValue(&_links, node, "PipelineExecutionStepState__links", "PipelineExecutionStepState__links");
		} else {
			
			PipelineExecutionStepState__links* obj = static_cast<PipelineExecutionStepState__links*> (&_links);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

PipelineExecutionStepState::PipelineExecutionStepState(char* json)
{
	this->fromJson(json);
}

char*
PipelineExecutionStepState::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStepId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *stepIdKey = "stepId";
	json_object_set_member(pJsonObject, stepIdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPhaseId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *phaseIdKey = "phaseId";
	json_object_set_member(pJsonObject, phaseIdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAction();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *actionKey = "action";
	json_object_set_member(pJsonObject, actionKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getRepository();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *repositoryKey = "repository";
	json_object_set_member(pJsonObject, repositoryKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getBranch();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *branchKey = "branch";
	json_object_set_member(pJsonObject, branchKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getEnvironment();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *environmentKey = "environment";
	json_object_set_member(pJsonObject, environmentKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getEnvironmentType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *environmentTypeKey = "environmentType";
	json_object_set_member(pJsonObject, environmentTypeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStartedAt();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *startedAtKey = "startedAt";
	json_object_set_member(pJsonObject, startedAtKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getFinishedAt();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *finishedAtKey = "finishedAt";
	json_object_set_member(pJsonObject, finishedAtKey, node);


	{
		JsonObject* json_obj;
		map<string, string> new_list = static_cast<map <string, string> > (getDetails());
		json_obj = json_object_new();
		for (map<string, string>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			string obj = (*it).first;
			string obj2 = (*it).second;
			JsonNode* tempnode = json_from_string(obj2.c_str(),NULL);
			json_object_set_member(json_obj, obj.c_str(), tempnode);
		}
	node = json_node_alloc();
	json_node_init_object(node, json_obj);
	json_object_unref(json_obj);
	}

	const gchar *detailsKey = "details";
	json_object_set_member(pJsonObject, detailsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStatus();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("PipelineExecutionStepState__links")) {
		PipelineExecutionStepState__links obj = getLinks();
		node = converttoJson(&obj, "PipelineExecutionStepState__links", "");
	}
	else {
		
		PipelineExecutionStepState__links obj = static_cast<PipelineExecutionStepState__links> (getLinks());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *_linksKey = "_links";
	json_object_set_member(pJsonObject, _linksKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
PipelineExecutionStepState::getId()
{
	return id;
}

void
PipelineExecutionStepState::setId(std::string  id)
{
	this->id = id;
}

std::string
PipelineExecutionStepState::getStepId()
{
	return stepId;
}

void
PipelineExecutionStepState::setStepId(std::string  stepId)
{
	this->stepId = stepId;
}

std::string
PipelineExecutionStepState::getPhaseId()
{
	return phaseId;
}

void
PipelineExecutionStepState::setPhaseId(std::string  phaseId)
{
	this->phaseId = phaseId;
}

std::string
PipelineExecutionStepState::getAction()
{
	return action;
}

void
PipelineExecutionStepState::setAction(std::string  action)
{
	this->action = action;
}

std::string
PipelineExecutionStepState::getRepository()
{
	return repository;
}

void
PipelineExecutionStepState::setRepository(std::string  repository)
{
	this->repository = repository;
}

std::string
PipelineExecutionStepState::getBranch()
{
	return branch;
}

void
PipelineExecutionStepState::setBranch(std::string  branch)
{
	this->branch = branch;
}

std::string
PipelineExecutionStepState::getEnvironment()
{
	return environment;
}

void
PipelineExecutionStepState::setEnvironment(std::string  environment)
{
	this->environment = environment;
}

std::string
PipelineExecutionStepState::getEnvironmentType()
{
	return environmentType;
}

void
PipelineExecutionStepState::setEnvironmentType(std::string  environmentType)
{
	this->environmentType = environmentType;
}

std::string
PipelineExecutionStepState::getStartedAt()
{
	return startedAt;
}

void
PipelineExecutionStepState::setStartedAt(std::string  startedAt)
{
	this->startedAt = startedAt;
}

std::string
PipelineExecutionStepState::getFinishedAt()
{
	return finishedAt;
}

void
PipelineExecutionStepState::setFinishedAt(std::string  finishedAt)
{
	this->finishedAt = finishedAt;
}

std::map<string, string>
PipelineExecutionStepState::getDetails()
{
	return details;
}

void
PipelineExecutionStepState::setDetails(std::map <string, string> details)
{
	this->details = details;
}

std::string
PipelineExecutionStepState::getStatus()
{
	return status;
}

void
PipelineExecutionStepState::setStatus(std::string  status)
{
	this->status = status;
}

PipelineExecutionStepState__links
PipelineExecutionStepState::getLinks()
{
	return _links;
}

void
PipelineExecutionStepState::setLinks(PipelineExecutionStepState__links  _links)
{
	this->_links = _links;
}


