#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Pipeline.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Pipeline::Pipeline()
{
	//__init();
}

Pipeline::~Pipeline()
{
	//__cleanup();
}

void
Pipeline::__init()
{
	//id = std::string();
	//programId = std::string();
	//name = std::string();
	//trigger = std::string();
	//status = std::string();
	//createdAt = null;
	//updatedAt = null;
	//lastStartedAt = null;
	//lastFinishedAt = null;
	//new std::list()std::list> phases;
	//_links = new Pipeline__links();
}

void
Pipeline::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(programId != NULL) {
	//
	//delete programId;
	//programId = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(trigger != NULL) {
	//
	//delete trigger;
	//trigger = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(createdAt != NULL) {
	//
	//delete createdAt;
	//createdAt = NULL;
	//}
	//if(updatedAt != NULL) {
	//
	//delete updatedAt;
	//updatedAt = NULL;
	//}
	//if(lastStartedAt != NULL) {
	//
	//delete lastStartedAt;
	//lastStartedAt = NULL;
	//}
	//if(lastFinishedAt != NULL) {
	//
	//delete lastFinishedAt;
	//lastFinishedAt = NULL;
	//}
	//if(phases != NULL) {
	//phases.RemoveAll(true);
	//delete phases;
	//phases = NULL;
	//}
	//if(_links != NULL) {
	//
	//delete _links;
	//_links = NULL;
	//}
	//
}

void
Pipeline::fromJson(char* jsonStr)
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
	const gchar *programIdKey = "programId";
	node = json_object_get_member(pJsonObject, programIdKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&programId, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *triggerKey = "trigger";
	node = json_object_get_member(pJsonObject, triggerKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&trigger, node, "std::string", "");
		} else {
			
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
	const gchar *createdAtKey = "createdAt";
	node = json_object_get_member(pJsonObject, createdAtKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&createdAt, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *updatedAtKey = "updatedAt";
	node = json_object_get_member(pJsonObject, updatedAtKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&updatedAt, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *lastStartedAtKey = "lastStartedAt";
	node = json_object_get_member(pJsonObject, lastStartedAtKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&lastStartedAt, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *lastFinishedAtKey = "lastFinishedAt";
	node = json_object_get_member(pJsonObject, lastFinishedAtKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&lastFinishedAt, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *phasesKey = "phases";
	node = json_object_get_member(pJsonObject, phasesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PipelinePhase> new_list;
			PipelinePhase inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PipelinePhase")) {
					jsonToValue(&inst, temp_json, "PipelinePhase", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			phases = new_list;
		}
		
	}
	const gchar *_linksKey = "_links";
	node = json_object_get_member(pJsonObject, _linksKey);
	if (node !=NULL) {
	

		if (isprimitive("Pipeline__links")) {
			jsonToValue(&_links, node, "Pipeline__links", "Pipeline__links");
		} else {
			
			Pipeline__links* obj = static_cast<Pipeline__links*> (&_links);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

Pipeline::Pipeline(char* json)
{
	this->fromJson(json);
}

char*
Pipeline::toJson()
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
		std::string obj = getProgramId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *programIdKey = "programId";
	json_object_set_member(pJsonObject, programIdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getTrigger();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *triggerKey = "trigger";
	json_object_set_member(pJsonObject, triggerKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStatus();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCreatedAt();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *createdAtKey = "createdAt";
	json_object_set_member(pJsonObject, createdAtKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUpdatedAt();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *updatedAtKey = "updatedAt";
	json_object_set_member(pJsonObject, updatedAtKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLastStartedAt();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *lastStartedAtKey = "lastStartedAt";
	json_object_set_member(pJsonObject, lastStartedAtKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLastFinishedAt();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *lastFinishedAtKey = "lastFinishedAt";
	json_object_set_member(pJsonObject, lastFinishedAtKey, node);
	if (isprimitive("PipelinePhase")) {
		list<PipelinePhase> new_list = static_cast<list <PipelinePhase> > (getPhases());
		node = converttoJson(&new_list, "PipelinePhase", "array");
	} else {
		node = json_node_alloc();
		list<PipelinePhase> new_list = static_cast<list <PipelinePhase> > (getPhases());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PipelinePhase>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PipelinePhase obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *phasesKey = "phases";
	json_object_set_member(pJsonObject, phasesKey, node);
	if (isprimitive("Pipeline__links")) {
		Pipeline__links obj = getLinks();
		node = converttoJson(&obj, "Pipeline__links", "");
	}
	else {
		
		Pipeline__links obj = static_cast<Pipeline__links> (getLinks());
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
Pipeline::getId()
{
	return id;
}

void
Pipeline::setId(std::string  id)
{
	this->id = id;
}

std::string
Pipeline::getProgramId()
{
	return programId;
}

void
Pipeline::setProgramId(std::string  programId)
{
	this->programId = programId;
}

std::string
Pipeline::getName()
{
	return name;
}

void
Pipeline::setName(std::string  name)
{
	this->name = name;
}

std::string
Pipeline::getTrigger()
{
	return trigger;
}

void
Pipeline::setTrigger(std::string  trigger)
{
	this->trigger = trigger;
}

std::string
Pipeline::getStatus()
{
	return status;
}

void
Pipeline::setStatus(std::string  status)
{
	this->status = status;
}

std::string
Pipeline::getCreatedAt()
{
	return createdAt;
}

void
Pipeline::setCreatedAt(std::string  createdAt)
{
	this->createdAt = createdAt;
}

std::string
Pipeline::getUpdatedAt()
{
	return updatedAt;
}

void
Pipeline::setUpdatedAt(std::string  updatedAt)
{
	this->updatedAt = updatedAt;
}

std::string
Pipeline::getLastStartedAt()
{
	return lastStartedAt;
}

void
Pipeline::setLastStartedAt(std::string  lastStartedAt)
{
	this->lastStartedAt = lastStartedAt;
}

std::string
Pipeline::getLastFinishedAt()
{
	return lastFinishedAt;
}

void
Pipeline::setLastFinishedAt(std::string  lastFinishedAt)
{
	this->lastFinishedAt = lastFinishedAt;
}

std::list<PipelinePhase>
Pipeline::getPhases()
{
	return phases;
}

void
Pipeline::setPhases(std::list <PipelinePhase> phases)
{
	this->phases = phases;
}

Pipeline__links
Pipeline::getLinks()
{
	return _links;
}

void
Pipeline::setLinks(Pipeline__links  _links)
{
	this->_links = _links;
}


