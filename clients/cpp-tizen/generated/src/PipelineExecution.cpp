#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PipelineExecution.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PipelineExecution::PipelineExecution()
{
	//__init();
}

PipelineExecution::~PipelineExecution()
{
	//__cleanup();
}

void
PipelineExecution::__init()
{
	//id = std::string();
	//programId = std::string();
	//pipelineId = std::string();
	//artifactsVersion = std::string();
	//user = std::string();
	//status = std::string();
	//trigger = std::string();
	//createdAt = null;
	//updatedAt = null;
	//finishedAt = null;
	//_embedded = new PipelineExecution__embedded();
	//_links = new PipelineExecution__links();
}

void
PipelineExecution::__cleanup()
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
	//if(pipelineId != NULL) {
	//
	//delete pipelineId;
	//pipelineId = NULL;
	//}
	//if(artifactsVersion != NULL) {
	//
	//delete artifactsVersion;
	//artifactsVersion = NULL;
	//}
	//if(user != NULL) {
	//
	//delete user;
	//user = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(trigger != NULL) {
	//
	//delete trigger;
	//trigger = NULL;
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
	//if(finishedAt != NULL) {
	//
	//delete finishedAt;
	//finishedAt = NULL;
	//}
	//if(_embedded != NULL) {
	//
	//delete _embedded;
	//_embedded = NULL;
	//}
	//if(_links != NULL) {
	//
	//delete _links;
	//_links = NULL;
	//}
	//
}

void
PipelineExecution::fromJson(char* jsonStr)
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
	const gchar *pipelineIdKey = "pipelineId";
	node = json_object_get_member(pJsonObject, pipelineIdKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&pipelineId, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *artifactsVersionKey = "artifactsVersion";
	node = json_object_get_member(pJsonObject, artifactsVersionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&artifactsVersion, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *userKey = "user";
	node = json_object_get_member(pJsonObject, userKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&user, node, "std::string", "");
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
	const gchar *triggerKey = "trigger";
	node = json_object_get_member(pJsonObject, triggerKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&trigger, node, "std::string", "");
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
	const gchar *finishedAtKey = "finishedAt";
	node = json_object_get_member(pJsonObject, finishedAtKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&finishedAt, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *_embeddedKey = "_embedded";
	node = json_object_get_member(pJsonObject, _embeddedKey);
	if (node !=NULL) {
	

		if (isprimitive("PipelineExecution__embedded")) {
			jsonToValue(&_embedded, node, "PipelineExecution__embedded", "PipelineExecution__embedded");
		} else {
			
			PipelineExecution__embedded* obj = static_cast<PipelineExecution__embedded*> (&_embedded);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *_linksKey = "_links";
	node = json_object_get_member(pJsonObject, _linksKey);
	if (node !=NULL) {
	

		if (isprimitive("PipelineExecution__links")) {
			jsonToValue(&_links, node, "PipelineExecution__links", "PipelineExecution__links");
		} else {
			
			PipelineExecution__links* obj = static_cast<PipelineExecution__links*> (&_links);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

PipelineExecution::PipelineExecution(char* json)
{
	this->fromJson(json);
}

char*
PipelineExecution::toJson()
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
		std::string obj = getPipelineId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *pipelineIdKey = "pipelineId";
	json_object_set_member(pJsonObject, pipelineIdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getArtifactsVersion();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *artifactsVersionKey = "artifactsVersion";
	json_object_set_member(pJsonObject, artifactsVersionKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUser();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *userKey = "user";
	json_object_set_member(pJsonObject, userKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStatus();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getTrigger();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *triggerKey = "trigger";
	json_object_set_member(pJsonObject, triggerKey, node);
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
		std::string obj = getFinishedAt();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *finishedAtKey = "finishedAt";
	json_object_set_member(pJsonObject, finishedAtKey, node);
	if (isprimitive("PipelineExecution__embedded")) {
		PipelineExecution__embedded obj = getEmbedded();
		node = converttoJson(&obj, "PipelineExecution__embedded", "");
	}
	else {
		
		PipelineExecution__embedded obj = static_cast<PipelineExecution__embedded> (getEmbedded());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *_embeddedKey = "_embedded";
	json_object_set_member(pJsonObject, _embeddedKey, node);
	if (isprimitive("PipelineExecution__links")) {
		PipelineExecution__links obj = getLinks();
		node = converttoJson(&obj, "PipelineExecution__links", "");
	}
	else {
		
		PipelineExecution__links obj = static_cast<PipelineExecution__links> (getLinks());
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
PipelineExecution::getId()
{
	return id;
}

void
PipelineExecution::setId(std::string  id)
{
	this->id = id;
}

std::string
PipelineExecution::getProgramId()
{
	return programId;
}

void
PipelineExecution::setProgramId(std::string  programId)
{
	this->programId = programId;
}

std::string
PipelineExecution::getPipelineId()
{
	return pipelineId;
}

void
PipelineExecution::setPipelineId(std::string  pipelineId)
{
	this->pipelineId = pipelineId;
}

std::string
PipelineExecution::getArtifactsVersion()
{
	return artifactsVersion;
}

void
PipelineExecution::setArtifactsVersion(std::string  artifactsVersion)
{
	this->artifactsVersion = artifactsVersion;
}

std::string
PipelineExecution::getUser()
{
	return user;
}

void
PipelineExecution::setUser(std::string  user)
{
	this->user = user;
}

std::string
PipelineExecution::getStatus()
{
	return status;
}

void
PipelineExecution::setStatus(std::string  status)
{
	this->status = status;
}

std::string
PipelineExecution::getTrigger()
{
	return trigger;
}

void
PipelineExecution::setTrigger(std::string  trigger)
{
	this->trigger = trigger;
}

std::string
PipelineExecution::getCreatedAt()
{
	return createdAt;
}

void
PipelineExecution::setCreatedAt(std::string  createdAt)
{
	this->createdAt = createdAt;
}

std::string
PipelineExecution::getUpdatedAt()
{
	return updatedAt;
}

void
PipelineExecution::setUpdatedAt(std::string  updatedAt)
{
	this->updatedAt = updatedAt;
}

std::string
PipelineExecution::getFinishedAt()
{
	return finishedAt;
}

void
PipelineExecution::setFinishedAt(std::string  finishedAt)
{
	this->finishedAt = finishedAt;
}

PipelineExecution__embedded
PipelineExecution::getEmbedded()
{
	return _embedded;
}

void
PipelineExecution::setEmbedded(PipelineExecution__embedded  _embedded)
{
	this->_embedded = _embedded;
}

PipelineExecution__links
PipelineExecution::getLinks()
{
	return _links;
}

void
PipelineExecution::setLinks(PipelineExecution__links  _links)
{
	this->_links = _links;
}


