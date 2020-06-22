#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "EnvironmentLog.h"

using namespace std;
using namespace Tizen::ArtikCloud;

EnvironmentLog::EnvironmentLog()
{
	//__init();
}

EnvironmentLog::~EnvironmentLog()
{
	//__cleanup();
}

void
EnvironmentLog::__init()
{
	//service = std::string();
	//name = std::string();
	//date = std::string();
	//programId = long(0);
	//environmentId = long(0);
	//_links = new EnvironmentLog__links();
}

void
EnvironmentLog::__cleanup()
{
	//if(service != NULL) {
	//
	//delete service;
	//service = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(date != NULL) {
	//
	//delete date;
	//date = NULL;
	//}
	//if(programId != NULL) {
	//
	//delete programId;
	//programId = NULL;
	//}
	//if(environmentId != NULL) {
	//
	//delete environmentId;
	//environmentId = NULL;
	//}
	//if(_links != NULL) {
	//
	//delete _links;
	//_links = NULL;
	//}
	//
}

void
EnvironmentLog::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *serviceKey = "service";
	node = json_object_get_member(pJsonObject, serviceKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&service, node, "std::string", "");
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
	const gchar *dateKey = "date";
	node = json_object_get_member(pJsonObject, dateKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&date, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *programIdKey = "programId";
	node = json_object_get_member(pJsonObject, programIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&programId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *environmentIdKey = "environmentId";
	node = json_object_get_member(pJsonObject, environmentIdKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&environmentId, node, "long long", "");
		} else {
			
		}
	}
	const gchar *_linksKey = "_links";
	node = json_object_get_member(pJsonObject, _linksKey);
	if (node !=NULL) {
	

		if (isprimitive("EnvironmentLog__links")) {
			jsonToValue(&_links, node, "EnvironmentLog__links", "EnvironmentLog__links");
		} else {
			
			EnvironmentLog__links* obj = static_cast<EnvironmentLog__links*> (&_links);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

EnvironmentLog::EnvironmentLog(char* json)
{
	this->fromJson(json);
}

char*
EnvironmentLog::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getService();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *serviceKey = "service";
	json_object_set_member(pJsonObject, serviceKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDate();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *dateKey = "date";
	json_object_set_member(pJsonObject, dateKey, node);
	if (isprimitive("long long")) {
		long long obj = getProgramId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *programIdKey = "programId";
	json_object_set_member(pJsonObject, programIdKey, node);
	if (isprimitive("long long")) {
		long long obj = getEnvironmentId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *environmentIdKey = "environmentId";
	json_object_set_member(pJsonObject, environmentIdKey, node);
	if (isprimitive("EnvironmentLog__links")) {
		EnvironmentLog__links obj = getLinks();
		node = converttoJson(&obj, "EnvironmentLog__links", "");
	}
	else {
		
		EnvironmentLog__links obj = static_cast<EnvironmentLog__links> (getLinks());
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
EnvironmentLog::getService()
{
	return service;
}

void
EnvironmentLog::setService(std::string  service)
{
	this->service = service;
}

std::string
EnvironmentLog::getName()
{
	return name;
}

void
EnvironmentLog::setName(std::string  name)
{
	this->name = name;
}

std::string
EnvironmentLog::getDate()
{
	return date;
}

void
EnvironmentLog::setDate(std::string  date)
{
	this->date = date;
}

long long
EnvironmentLog::getProgramId()
{
	return programId;
}

void
EnvironmentLog::setProgramId(long long  programId)
{
	this->programId = programId;
}

long long
EnvironmentLog::getEnvironmentId()
{
	return environmentId;
}

void
EnvironmentLog::setEnvironmentId(long long  environmentId)
{
	this->environmentId = environmentId;
}

EnvironmentLog__links
EnvironmentLog::getLinks()
{
	return _links;
}

void
EnvironmentLog::setLinks(EnvironmentLog__links  _links)
{
	this->_links = _links;
}


